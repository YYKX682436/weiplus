package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f221410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.C19267xf1e5d915 f221411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a f221412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f221413g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221414h;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.ipc.C19267xf1e5d915 c19267xf1e5d915, com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a, java.lang.Runnable runnable, java.lang.String str) {
        this.f221410d = j17;
        this.f221411e = c19267xf1e5d915;
        this.f221412f = c19762x487075a;
        this.f221413g = runnable;
        this.f221414h = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f221410d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebPage", "activeIpcTask, callback");
        this.f221411e.x();
        synchronized (this.f221412f) {
            com.p314xaae8f345.mm.p2493x1bc889d6.C19762x487075a c19762x487075a = this.f221412f;
            if (c19762x487075a.f38859x6ac9171) {
                return;
            }
            c19762x487075a.f38859x6ac9171 = true;
            this.f221413g.run();
            java.lang.String str = this.f221414h;
            java.lang.Object obj = com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.n.f270034a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2460x6a710b1.a.c("ipcServiceStartTime", str, kh0.i.a(str), null, 0L, currentTimeMillis, null);
        }
    }
}
