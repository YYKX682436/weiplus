package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/assist/FinderGameEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderGamePostEvent;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Ljava/lang/ref/WeakReference;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.assist.FinderGameEventListener */
/* loaded from: classes3.dex */
public final class C13675x4cedeef6 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5472x6f20df62> {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f183514d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f183515e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13675x4cedeef6(java.lang.ref.WeakReference<android.app.Activity> activity) {
        super(com.p314xaae8f345.mm.app.a0.f134821d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f183514d = activity;
        this.f183515e = "Finder.FinderGameEventListener";
        this.f39173x3fe91575 = -774268078;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5472x6f20df62 c5472x6f20df62) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5472x6f20df62 event = c5472x6f20df62;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.hb hbVar = event.f135810g;
        if (!hbVar.f88362a) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.ref.WeakReference weakReference = this.f183514d;
        android.app.Activity activity = (android.app.Activity) weakReference.get();
        sb6.append(activity != null ? activity.getClass().getName() : null);
        sb6.append(" finish");
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f183515e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (hbVar.f88363b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "keepGlobalData");
            gk2.e eVar = gk2.e.f354004n;
            mm2.c1 c1Var = eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null;
            if (c1Var != null) {
                c1Var.f410331e5 = true;
            }
        }
        android.app.Activity activity2 = (android.app.Activity) weakReference.get();
        if (activity2 != null) {
            activity2.finish();
        }
        mo48814x2efc64();
        return false;
    }
}
