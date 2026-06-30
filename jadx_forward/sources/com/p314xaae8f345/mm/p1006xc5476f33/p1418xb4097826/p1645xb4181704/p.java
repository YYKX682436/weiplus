package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704;

/* loaded from: classes10.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 f211882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jv2.d f211883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f211884f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var, jv2.d dVar, android.content.Context context) {
        super(0);
        this.f211882d = o0Var;
        this.f211883e = dVar;
        this.f211884f = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o0 o0Var = this.f211882d;
        android.app.Dialog dialog = o0Var.F;
        if (dialog != null) {
            dialog.dismiss();
        }
        jv2.d dVar = this.f211883e;
        if (dVar.f383740d.A0() != 0) {
            java.util.Iterator it = o0Var.f211859h.f211875a.iterator();
            while (it.hasNext()) {
                jv2.d dVar2 = (jv2.d) it.next();
                if (dVar2.f383740d.t0() == dVar.f383740d.A0()) {
                    dVar2.f383740d.u0().m76122x33d095ac(r7.v0() - 1);
                    if (dVar2.f383740d.v0() < 0) {
                        dVar2.f383740d.u0().m76122x33d095ac(0);
                    }
                    java.util.LinkedList w07 = dVar2.f383740d.w0();
                    if (w07 != null) {
                        pm0.v.d0(w07, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.o(dVar));
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1645xb4181704.g gVar = o0Var.f211864p;
        if (gVar != null) {
            gVar.a(dVar.f383740d.t0(), dVar.f383740d.f67480xf609be94, false);
        }
        if (dVar.f383740d.A0() == 0) {
            iv2.a aVar = o0Var.f211861m;
            if (aVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            if (dVar.f383740d.v0() > 0) {
                int v07 = dVar.f383740d.v0();
                int i17 = aVar.f376654d;
                if (v07 <= i17) {
                    aVar.f376654d = i17 - dVar.f383740d.v0();
                }
            }
            aVar.f376654d--;
        }
        dVar.f383740d.t0();
        db5.t7.m123882x26a183b(this.f211884f, com.p314xaae8f345.mm.R.C30867xcad56011.cst, 0).show();
        return jz5.f0.f384359a;
    }
}
