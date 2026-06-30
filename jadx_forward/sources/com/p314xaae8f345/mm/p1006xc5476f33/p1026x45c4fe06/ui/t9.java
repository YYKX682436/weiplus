package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes7.dex */
public final class t9 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f171770e;

    public t9(java.lang.String str, java.lang.ref.WeakReference weakReference) {
        this.f171769d = str;
        this.f171770e = weakReference;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIMoveTaskToBackGuardIPCHelper", "callback invoke, key:" + this.f171769d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a activityC12666xc288131a = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) this.f171770e.get();
        if (activityC12666xc288131a != null) {
            activityC12666xc288131a.n7();
        }
    }
}
