package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class xz implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 f201924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zz f201925e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.q63 f201926f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f201927g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f201928h;

    public xz(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zz zzVar, r45.q63 q63Var, boolean z17, java.lang.Runnable runnable) {
        this.f201924d = m10Var;
        this.f201925e = zzVar;
        this.f201926f = q63Var;
        this.f201927g = z17;
        this.f201928h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m10 m10Var = this.f201924d;
        dk2.xf W0 = m10Var.f200534c.W0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zz zzVar = this.f201925e;
        if (W0 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dz dzVar = zzVar.f202150a;
            int m75939xb282bd08 = this.f201926f.m75939xb282bd08(11);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin = m10Var.f200534c;
            boolean z17 = this.f201927g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wz wzVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wz(m10Var, z17, this.f201928h);
            dzVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
            dzVar.f199711q = m75939xb282bd08;
            dzVar.f199712r = basePlugin.W0();
            dzVar.f199713s = basePlugin;
            dzVar.f199710p = z17;
            dzVar.f199709o = wzVar;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = m10Var.f200546o;
        if (y1Var != null) {
            y1Var.h(zzVar.f202150a);
        }
    }
}
