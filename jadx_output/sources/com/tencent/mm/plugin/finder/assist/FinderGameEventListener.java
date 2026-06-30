package com.tencent.mm.plugin.finder.assist;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/assist/FinderGameEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderGamePostEvent;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Ljava/lang/ref/WeakReference;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderGameEventListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderGamePostEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f101981d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f101982e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderGameEventListener(java.lang.ref.WeakReference<android.app.Activity> activity) {
        super(com.tencent.mm.app.a0.f53288d);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f101981d = activity;
        this.f101982e = "Finder.FinderGameEventListener";
        this.__eventId = -774268078;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.FinderGamePostEvent finderGamePostEvent) {
        com.tencent.mm.autogen.events.FinderGamePostEvent event = finderGamePostEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.hb hbVar = event.f54277g;
        if (!hbVar.f6829a) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.ref.WeakReference weakReference = this.f101981d;
        android.app.Activity activity = (android.app.Activity) weakReference.get();
        sb6.append(activity != null ? activity.getClass().getName() : null);
        sb6.append(" finish");
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f101982e;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (hbVar.f6830b) {
            com.tencent.mars.xlog.Log.i(str, "keepGlobalData");
            gk2.e eVar = gk2.e.f272471n;
            mm2.c1 c1Var = eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null;
            if (c1Var != null) {
                c1Var.f328798e5 = true;
            }
        }
        android.app.Activity activity2 = (android.app.Activity) weakReference.get();
        if (activity2 != null) {
            activity2.finish();
        }
        dead();
        return false;
    }
}
