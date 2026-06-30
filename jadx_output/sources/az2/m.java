package az2;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final az2.m f16144a = new az2.m();

    public static void b(az2.m mVar, int i17, java.lang.String str, int i18, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            i18 = 0;
        }
        mVar.getClass();
        if (i17 != -5003 || str == null) {
            return;
        }
        android.content.Context ll6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll();
        android.app.Activity activity = ll6 instanceof android.app.Activity ? (android.app.Activity) ll6 : null;
        if (activity != null) {
            f16144a.a(activity, str, i18);
        }
    }

    public final boolean a(android.app.Activity context, java.lang.String str, int i17) {
        cl0.g gVar;
        int i18;
        kotlin.jvm.internal.o.g(context, "context");
        try {
            com.tencent.mars.xlog.Log.i("FinderCgiChecker", "[doJump] errMsg = " + str);
            gVar = new cl0.g(str);
            i18 = gVar.getInt("link_type");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderCgiChecker", "[doJump] catch exception:" + e17.getMessage());
        }
        if (i18 == 1) {
            c(context, gVar.a("link_h5").optString("link"), i17);
            return true;
        }
        if (i18 != 2) {
            return false;
        }
        cl0.g a17 = gVar.a("link_lite_app");
        java.lang.String optString = a17.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
        java.lang.String optString2 = a17.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
        java.lang.String optString3 = a17.optString("query");
        java.lang.String optString4 = a17.optString("default_url");
        java.lang.String optString5 = a17.optString("ext_info");
        r45.k41 k41Var = new r45.k41();
        k41Var.set(0, optString);
        k41Var.set(1, optString2);
        k41Var.set(2, optString3);
        k41Var.set(3, optString4);
        k41Var.set(4, optString5);
        d(context, k41Var, i17);
        return true;
    }

    public final void c(android.app.Activity context, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        if (str == null || str.length() == 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, i17);
    }

    public final void d(android.app.Activity activity, r45.k41 k41Var, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", k41Var.getString(0));
        bundle.putString("query", k41Var.getString(2));
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, k41Var.getString(1));
        bundle.putInt("nextAnimIn", com.tencent.mm.R.anim.f477721i);
        bundle.putInt("currentAnimOut", com.tencent.mm.R.anim.f477889ed);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        java.lang.String string = k41Var.getString(3);
        if (e1Var.L(activity, bundle, !(string == null || string.length() == 0), new az2.l(activity, k41Var, i17))) {
            return;
        }
        c(activity, k41Var.getString(3), i17);
    }
}
