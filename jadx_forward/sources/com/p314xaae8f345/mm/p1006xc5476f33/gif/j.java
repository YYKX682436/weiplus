package com.p314xaae8f345.mm.p1006xc5476f33.gif;

/* loaded from: classes15.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.gif.k f223668d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar) {
        this.f223668d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f223668d.f223672f == 0) {
            return;
        }
        if (this.f223668d.f223671e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GIF.MMGIFDrawable", "This gif had been recycle.");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar = this.f223668d;
        if (kVar.f223683t + 1 > kVar.f223682s - 1) {
            kVar.f223683t = -1;
        }
        kVar.f223683t++;
        com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b interfaceC10588xb98d046b = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b.class);
        long j17 = this.f223668d.f223672f;
        com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar2 = this.f223668d;
        boolean mo44461xf716d696 = interfaceC10588xb98d046b.mo44461xf716d696(j17, kVar2.f223679p, kVar2.f223673g);
        com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar3 = this.f223668d;
        boolean z17 = !kVar3.f223681r;
        kVar3.f223681r = true;
        if (mo44461xf716d696) {
            kVar3.E++;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10588xb98d046b.class)).mo44477x6761d4f(this.f223668d.f223672f);
        }
        this.f223668d.f223685v = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar4 = this.f223668d;
        long j18 = kVar4.f223686w;
        if (j18 != 0) {
            long j19 = (j18 - kVar4.f223685v) - kVar4.f223689z;
            kVar4.f223687x = j19;
            if (j19 < 0) {
                int i17 = kVar4.f223673g[5];
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.mo68477x336bdfd8(401L, 0L, 1L, false);
                fVar.mo68477x336bdfd8(401L, 1L, java.lang.Math.abs(this.f223668d.f223687x), false);
                if (this.f223668d.f223687x < -100) {
                    com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46128x89c4face(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45876x19318276() || com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45880xd6d7f83d(), this.f223668d.G);
                    this.f223668d.G = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45880xd6d7f83d(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45879xc4cba789(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45878xceec352e(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45881x48bd4cc0(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45882xceec7804() ? android.os.Process.myTid() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45883x15c6d1e7(), 602, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45877xcf7250f0(), "MicroMsg.GIF.MMGIFDrawable");
                }
            }
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar5 = this.f223668d;
            java.lang.Runnable runnable = kVar5.L;
            kVar5.A = android.os.SystemClock.uptimeMillis();
            if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.gif.f) runnable).run();
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o3 o3Var = kVar5.H;
                if (o3Var != null) {
                    o3Var.d(runnable);
                }
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar6 = this.f223668d;
            java.lang.Runnable runnable2 = kVar6.L;
            long j27 = kVar6.f223687x;
            kVar6.g(runnable2, j27 > 0 ? j27 : 0L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar7 = this.f223668d;
        if (kVar7.f223673g[2] == 1) {
            kVar7.f223686w = 5000L;
        } else {
            kVar7.f223686w = r2[4];
        }
    }
}
