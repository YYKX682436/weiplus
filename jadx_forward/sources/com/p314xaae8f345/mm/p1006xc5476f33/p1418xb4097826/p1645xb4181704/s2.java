package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class s2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 f211937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jv2.i f211938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f211939f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var, jv2.i iVar, android.content.Context context) {
        super(0);
        this.f211937d = q3Var;
        this.f211938e = iVar;
        this.f211939f = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.q3 q3Var = this.f211937d;
        android.app.Dialog dialog = q3Var.D;
        if (dialog != null) {
            dialog.dismiss();
        }
        jv2.i iVar = this.f211938e;
        if (iVar.f383756d.J0() != 0) {
            java.util.Iterator it = q3Var.f211902f.f211893a.iterator();
            while (it.hasNext()) {
                jv2.i iVar2 = (jv2.i) it.next();
                if (iVar2.f383756d.t0() == iVar.f383756d.J0()) {
                    iVar2.f383756d.u0().m76122x33d095ac(r7.y0() - 1);
                    if (iVar2.f383756d.y0() < 0) {
                        iVar2.f383756d.u0().m76122x33d095ac(0);
                    }
                    java.util.LinkedList A0 = iVar2.f383756d.A0();
                    if (A0 != null) {
                        pm0.v.d0(A0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.r2(iVar));
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.j2 j2Var = q3Var.f211907n;
        if (j2Var != null) {
            j2Var.a(iVar.f383756d.t0(), iVar.f383756d.f67480xf609be94, false);
        }
        if (iVar.f383756d.J0() == 0) {
            iv2.b bVar = q3Var.f211904h;
            if (bVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            if (iVar.f383756d.y0() > 0) {
                int y07 = iVar.f383756d.y0();
                int i17 = bVar.f376660c;
                if (y07 <= i17) {
                    bVar.f376660c = i17 - iVar.f383756d.y0();
                }
            }
            bVar.f376660c--;
        }
        iVar.f383756d.t0();
        db5.t7.m123882x26a183b(this.f211939f, com.p314xaae8f345.mm.R.C30867xcad56011.cst, 0).show();
        q3Var.z();
        return jz5.f0.f384359a;
    }
}
