package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class ze implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f173989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wg1.b f173990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f173991f;

    public ze(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, wg1.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4) {
        this.f173989d = o6Var;
        this.f173990e = bVar;
        this.f173991f = c11809xbc286be4;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RuntimeRestartHelper", "performRestart OnUiThread appId[%s]", this.f173989d.f156336n);
        try {
            android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ye.a(this.f173989d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f173989d;
            java.lang.ThreadLocal threadLocal = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.s5.f171734a;
            if (o6Var != null && a17 != null && !a17.isRecycled()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.s5.f171735b.put(o6Var, a17);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RuntimeRestartHelper", "performRestart  takeSnapshot appId[%s], e[%s]", this.f173989d.f156336n, e17);
        }
        java.util.Objects.requireNonNull(this.f173990e);
        this.f173991f.f128802b2 = this.f173989d.l2();
        if (this.f173989d.u0() == null || u46.l.c(this.f173989d.u0().f128809v, this.f173991f.f128809v)) {
            this.f173991f.m();
        }
        this.f173991f.f128801a2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1141xc84c5534.C12376xdd2459a1(this.f173989d.u0().f158831k2.f169667d, this.f173990e.h());
        if (this.f173989d.u0().f158846z2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = this.f173991f;
            if (c11809xbc286be4.f158846z2 == null) {
                c11809xbc286be4.f158846z2 = this.f173989d.u0().f158846z2;
                this.f173989d.u0().f158846z2 = null;
            }
        }
        this.f173989d.z1(this.f173991f, this.f173990e.h());
    }
}
