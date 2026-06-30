package r63;

/* loaded from: classes14.dex */
public final class o implements android.app.Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r63.p f474586d;

    public o(r63.p pVar) {
        this.f474586d = pVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        r63.l lVar = r63.l.f474555a;
        java.lang.String name = activity.getClass().getName();
        if ((p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.base.stub.WXShortcutEntryActivity", name) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("WXShortcutEntryActivity", name)) && com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(activity.getIntent(), "type", 0) == 5) {
            r63.l.f474572r = java.lang.Boolean.TRUE;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "enter from finder Shortcut");
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String simpleName = activity.getClass().getSimpleName();
        this.f474586d.getClass();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.feed.ui.FinderMultiTaskUI", simpleName) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("FinderMultiTaskUI", simpleName)) {
            r63.l lVar = r63.l.f474555a;
            int hashCode = activity.hashCode();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "onContentFloatBallActivityPause " + simpleName + ", " + hashCode);
            r63.l.f474569o.remove(java.lang.Integer.valueOf(hashCode));
        }
        android.os.PowerManager powerManager = (android.os.PowerManager) ((jz5.n) r63.l.f474573s).mo141623x754a37bb();
        boolean isInteractive = powerManager != null ? powerManager.isInteractive() : true;
        java.lang.String simpleName2 = activity.getClass().getSimpleName();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityPause ");
        sb6.append(!isInteractive);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", sb6.toString());
        if (r63.n.f474575a.p()) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("FINDER_LATEST_ENTER_METHOD").getString(simpleName2, "");
            r63.l.f474562h = string != null ? string : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "set sdk enter method " + r63.l.f474562h);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.lang.String simpleName = activity.getClass().getSimpleName();
        this.f474586d.getClass();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("com.tencent.mm.plugin.finder.feed.ui.FinderMultiTaskUI", simpleName) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("FinderMultiTaskUI", simpleName)) {
            r63.l lVar = r63.l.f474555a;
            int hashCode = activity.hashCode();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderPageEnterMonitor", "onContentFloatBallActivityResume " + simpleName + ", " + hashCode);
            r63.l.f474569o.put(java.lang.Integer.valueOf(hashCode), r63.l.f474568n);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle outState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }
}
