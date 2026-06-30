package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1 f184144a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.ref.WeakReference f184145b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.ref.WeakReference f184146c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.ref.WeakReference f184147d;

    public final void a(java.lang.String type, java.lang.String contextName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextName, "contextName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderContextManager", "report type = " + type + ", contextName = " + contextName);
    }

    public final android.content.Context b() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        try {
            java.lang.ref.WeakReference weakReference = f184145b;
            android.content.Context element = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            if (element != null) {
                java.lang.String simpleName = element.getClass().getSimpleName();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderContextManager", "tryGetFinderContext finderTopActivity: ".concat(simpleName));
                a("finderSpamGetFinderContext", simpleName);
            } else {
                java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
                element = k17 != null ? (android.app.Activity) k17.get() : null;
                if (element != null) {
                    java.lang.String simpleName2 = element.getClass().getSimpleName();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderContextManager", "tryGetFinderContext appTopActivity: ".concat(simpleName2));
                    a("finderSpamGetWechatContext", simpleName2);
                } else {
                    java.lang.ref.WeakReference j17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
                    android.app.Activity activity = j17 != null ? (android.app.Activity) j17.get() : null;
                    element = activity != null ? activity : context;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderContextManager", "tryGetFinderContext topContext: " + activity);
                }
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(element, context)) {
                java.lang.String simpleName3 = context.getClass().getSimpleName();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderContextManager", "tryGetFinderContext fallbackContext: ".concat(simpleName3));
                a("finderSpamGetApplicationContext", simpleName3);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
            return element;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderContextManager", "tryGetFinderContext get activity failed", th6);
            a("finderSpamGetApplicationContext", context.getClass().getSimpleName());
            return context;
        }
    }
}
