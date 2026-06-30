package az2;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final az2.m f97677a = new az2.m();

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
            f97677a.a(activity, str, i18);
        }
    }

    public final boolean a(android.app.Activity context, java.lang.String str, int i17) {
        cl0.g gVar;
        int mo15072xb58848b9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCgiChecker", "[doJump] errMsg = " + str);
            gVar = new cl0.g(str);
            mo15072xb58848b9 = gVar.mo15072xb58848b9("link_type");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCgiChecker", "[doJump] catch exception:" + e17.getMessage());
        }
        if (mo15072xb58848b9 == 1) {
            c(context, gVar.a("link_h5").mo15082x48bce8a4("link"), i17);
            return true;
        }
        if (mo15072xb58848b9 != 2) {
            return false;
        }
        cl0.g a17 = gVar.a("link_lite_app");
        java.lang.String mo15082x48bce8a4 = a17.mo15082x48bce8a4(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd);
        java.lang.String mo15082x48bce8a42 = a17.mo15082x48bce8a4(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
        java.lang.String mo15082x48bce8a43 = a17.mo15082x48bce8a4("query");
        java.lang.String mo15082x48bce8a44 = a17.mo15082x48bce8a4("default_url");
        java.lang.String mo15082x48bce8a45 = a17.mo15082x48bce8a4("ext_info");
        r45.k41 k41Var = new r45.k41();
        k41Var.set(0, mo15082x48bce8a4);
        k41Var.set(1, mo15082x48bce8a42);
        k41Var.set(2, mo15082x48bce8a43);
        k41Var.set(3, mo15082x48bce8a44);
        k41Var.set(4, mo15082x48bce8a45);
        d(context, k41Var, i17);
        return true;
    }

    public final void c(android.app.Activity context, java.lang.String str, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (str == null || str.length() == 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, i17);
    }

    public final void d(android.app.Activity activity, r45.k41 k41Var, int i17) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", k41Var.m75945x2fec8307(0));
        bundle.putString("query", k41Var.m75945x2fec8307(2));
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, k41Var.m75945x2fec8307(1));
        bundle.putInt("nextAnimIn", com.p314xaae8f345.mm.R.C30854x2dc211.f559254i);
        bundle.putInt("currentAnimOut", com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f542005a;
        java.lang.String m75945x2fec8307 = k41Var.m75945x2fec8307(3);
        if (e1Var.L(activity, bundle, !(m75945x2fec8307 == null || m75945x2fec8307.length() == 0), new az2.l(activity, k41Var, i17))) {
            return;
        }
        c(activity, k41Var.m75945x2fec8307(3), i17);
    }
}
