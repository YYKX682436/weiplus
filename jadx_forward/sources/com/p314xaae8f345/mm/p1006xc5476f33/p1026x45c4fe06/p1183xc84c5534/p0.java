package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public final class p0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a1 implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public ze.n f169662d;

    /* renamed from: e, reason: collision with root package name */
    public final android.app.Application f169663e;

    public p0(ze.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.o0 o0Var) {
        this.f169662d = nVar;
        nVar.mo46316x322b85(this);
        android.app.Application application = (android.app.Application) nVar.f156328d.getApplicationContext();
        this.f169663e = application;
        application.registerComponentCallbacks(this);
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        this.f169663e.unregisterComponentCallbacks(this);
        this.f169662d = null;
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        ze.n nVar = this.f169662d;
        if (nVar == null) {
            return;
        }
        if (i17 == 5 || i17 == 10 || i17 == 15) {
            if (nVar.u0() != null) {
                boolean k17 = this.f169662d.u0().k();
                if (i17 == 5) {
                    if (k17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(386L, 15L, 1L, false);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(386L, 14L, 1L, false);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(386L, 9L, 1L, false);
                } else if (i17 == 10) {
                    if (k17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(386L, 13L, 1L, false);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(386L, 12L, 1L, false);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(386L, 8L, 1L, false);
                } else if (i17 == 15) {
                    if (k17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(386L, 11L, 1L, false);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(386L, 10L, 1L, false);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(386L, 7L, 1L, false);
                }
            }
            ze.n nVar2 = this.f169662d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOnMemoryWarningReceiveEvent", "memory warning receive event dispatch, appId:%s, initialized:%b, level:%d", nVar2.f156336n, java.lang.Boolean.valueOf(nVar2.J0()), java.lang.Integer.valueOf(i17));
            if (nVar2.J0()) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put(ya.b.f77487x44fa364, java.lang.Integer.valueOf(i17));
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.u0();
                u0Var.u(nVar2.C0());
                u0Var.t(hashMap);
                u0Var.m();
            }
        }
    }
}
