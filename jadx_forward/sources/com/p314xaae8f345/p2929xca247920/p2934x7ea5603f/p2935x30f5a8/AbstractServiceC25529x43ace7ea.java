package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* renamed from: com.tencent.shadow.dynamic.host.BasePluginProcessService */
/* loaded from: classes13.dex */
public abstract class AbstractServiceC25529x43ace7ea extends android.app.Service {

    /* renamed from: logger */
    private static final com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 f46668xbe97f590 = com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25509x39e6a13a.m94647x23af1886("Shadow.BasePluginProcessService");

    /* renamed from: sSingleInstanceFlag */
    private static java.lang.Object f46669x898707dc = null;

    /* renamed from: com.tencent.shadow.dynamic.host.BasePluginProcessService$ActivityHolder */
    /* loaded from: classes11.dex */
    public static class ActivityHolder implements android.app.Application.ActivityLifecycleCallbacks {

        /* renamed from: mActivities */
        private final java.util.List<android.app.Activity> f46670x564d343a = new java.util.LinkedList();

        /* renamed from: finishAll */
        public void m95534x233ec80e() {
            java.util.Iterator<android.app.Activity> it = this.f46670x564d343a.iterator();
            while (it.hasNext()) {
                it.next().finish();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
            this.f46670x564d343a.add(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(android.app.Activity activity) {
            this.f46670x564d343a.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(android.app.Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(android.app.Activity activity) {
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        if (f46669x898707dc != null) {
            throw new java.lang.IllegalStateException("PPS出现多实例");
        }
        f46669x898707dc = new java.lang.Object();
        super.onCreate();
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b0 = f46668xbe97f590;
        if (interfaceC25508x87fce1b0.mo46960xd67f5b29()) {
            interfaceC25508x87fce1b0.mo46953x3164ae("onCreate:" + this);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b0 = f46668xbe97f590;
        if (interfaceC25508x87fce1b0.mo46960xd67f5b29()) {
            interfaceC25508x87fce1b0.mo46953x3164ae("onDestroy:" + this);
        }
    }

    @Override // android.app.Service
    public void onRebind(android.content.Intent intent) {
        super.onRebind(intent);
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b0 = f46668xbe97f590;
        if (interfaceC25508x87fce1b0.mo46960xd67f5b29()) {
            interfaceC25508x87fce1b0.mo46953x3164ae("onRebind:" + this);
        }
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent intent) {
        super.onTaskRemoved(intent);
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b0 = f46668xbe97f590;
        if (interfaceC25508x87fce1b0.mo46960xd67f5b29()) {
            interfaceC25508x87fce1b0.mo46953x3164ae("onTaskRemoved:" + this);
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(android.content.Intent intent) {
        com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25508x87fce1b0 interfaceC25508x87fce1b0 = f46668xbe97f590;
        if (interfaceC25508x87fce1b0.mo46960xd67f5b29()) {
            interfaceC25508x87fce1b0.mo46953x3164ae("onUnbind:" + this);
        }
        return super.onUnbind(intent);
    }
}
