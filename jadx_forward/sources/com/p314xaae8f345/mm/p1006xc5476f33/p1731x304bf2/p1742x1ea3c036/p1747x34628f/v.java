package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0 f221475d;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0 b0Var) {
        this.f221475d = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b0.f221403y1) {
            if (this.f221475d.mo120153xd15cf999().c()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameWebCoreImpl", "setBlockNetworkImage time out");
                this.f221475d.mo120153xd15cf999().q(false);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(949L, 0L, 1L);
            }
        }
    }
}
