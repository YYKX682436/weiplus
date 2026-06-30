package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes5.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f221199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j1 f221200f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221201g;

    public i1(android.content.Context context, double d17, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j1 j1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        this.f221198d = context;
        this.f221199e = d17;
        this.f221200f = j1Var;
        this.f221201g = q5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object systemService = this.f221198d.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        android.media.AudioManager audioManager = (android.media.AudioManager) systemService;
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        double d17 = this.f221199e;
        to.a.c(audioManager, 3, (int) (streamMaxVolume * d17), 0);
        this.f221200f.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("handleDeviceInfo", "setVolume, maxVolume=" + streamMaxVolume + ", volume=" + d17);
        this.f221201g.a(null, null);
    }
}
