package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.v1 f102611a = new com.tencent.mm.plugin.finder.assist.v1();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.ref.WeakReference f102612b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.ref.WeakReference f102613c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.ref.WeakReference f102614d;

    public final void a(java.lang.String type, java.lang.String contextName) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(contextName, "contextName");
        com.tencent.mars.xlog.Log.i("Finder.FinderContextManager", "report type = " + type + ", contextName = " + contextName);
    }

    public final android.content.Context b() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        try {
            java.lang.ref.WeakReference weakReference = f102612b;
            android.content.Context element = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            if (element != null) {
                java.lang.String simpleName = element.getClass().getSimpleName();
                com.tencent.mars.xlog.Log.i("Finder.FinderContextManager", "tryGetFinderContext finderTopActivity: ".concat(simpleName));
                a("finderSpamGetFinderContext", simpleName);
            } else {
                java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
                element = k17 != null ? (android.app.Activity) k17.get() : null;
                if (element != null) {
                    java.lang.String simpleName2 = element.getClass().getSimpleName();
                    com.tencent.mars.xlog.Log.i("Finder.FinderContextManager", "tryGetFinderContext appTopActivity: ".concat(simpleName2));
                    a("finderSpamGetWechatContext", simpleName2);
                } else {
                    java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
                    android.app.Activity activity = j17 != null ? (android.app.Activity) j17.get() : null;
                    element = activity != null ? activity : context;
                    com.tencent.mars.xlog.Log.i("Finder.FinderContextManager", "tryGetFinderContext topContext: " + activity);
                }
            }
            if (kotlin.jvm.internal.o.b(element, context)) {
                java.lang.String simpleName3 = context.getClass().getSimpleName();
                com.tencent.mars.xlog.Log.i("Finder.FinderContextManager", "tryGetFinderContext fallbackContext: ".concat(simpleName3));
                a("finderSpamGetApplicationContext", simpleName3);
            }
            kotlin.jvm.internal.o.f(element, "element");
            return element;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("Finder.FinderContextManager", "tryGetFinderContext get activity failed", th6);
            a("finderSpamGetApplicationContext", context.getClass().getSimpleName());
            return context;
        }
    }
}
