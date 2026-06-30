package a42;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final a42.g f1206a = new a42.g();

    public final java.lang.String a(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\d+");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        java.lang.String replaceAll = compile.matcher(str).replaceAll("");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        byte[] bytes = replaceAll.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String encodeToString = android.util.Base64.encodeToString(bytes, 0);
        kotlin.jvm.internal.o.f(encodeToString, "encodeToString(...)");
        return encodeToString;
    }

    public final void b(android.content.Context context, java.lang.String appId, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        try {
            com.tencent.mars.xlog.Log.i("SportUtils", "openLiteApp() called with: appId = " + appId + ", page = " + str + ", query = " + str2 + " minVersion= " + str3);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", appId);
            if (str == null) {
                str = "";
            }
            bundle.putString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, str);
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString("query", str2);
            if (str3 == null) {
                str3 = "";
            }
            bundle.putString("minVersion", str3);
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(context, bundle, true, false, new a42.d(context));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("SportUtils", "openLiteApp, fail, reason:" + e17.getMessage());
        }
    }

    public final void c(android.widget.TextView textView, float f17) {
        kotlin.jvm.internal.o.g(textView, "textView");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        textView.setTextSize(1, (f17 * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
    }
}
