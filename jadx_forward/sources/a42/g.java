package a42;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a42.g f82739a = new a42.g();

    public final java.lang.String a(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\d+");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(str).replaceAll("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        byte[] bytes = replaceAll.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public final void b(android.content.Context context, java.lang.String appId, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SportUtils", "openLiteApp() called with: appId = " + appId + ", page = " + str + ", query = " + str2 + " minVersion= " + str3);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", appId);
            if (str == null) {
                str = "";
            }
            bundle.putString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f, str);
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString("query", str2);
            if (str3 == null) {
                str3 = "";
            }
            bundle.putString("minVersion", str3);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(context, bundle, true, false, new a42.d(context));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SportUtils", "openLiteApp, fail, reason:" + e17.getMessage());
        }
    }

    public final void c(android.widget.TextView textView, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        textView.setTextSize(1, (f17 * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
    }
}
