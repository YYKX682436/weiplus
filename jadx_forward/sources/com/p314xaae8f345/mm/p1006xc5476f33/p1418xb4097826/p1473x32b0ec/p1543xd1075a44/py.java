package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class py implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qy f200989d;

    public py(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qy qyVar) {
        this.f200989d = qyVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qy qyVar = this.f200989d;
        qyVar.f201091d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.oy(((mm2.c1) qyVar.f201093f.P0(mm2.c1.class)).M2, qyVar));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Boolean.valueOf(qyVar.f201094g), bool)) {
            return;
        }
        jf2.k0 k0Var = (jf2.k0) qyVar.f201093f.U0(jf2.k0.class);
        if (k0Var != null) {
            k0Var.a7("FinderLiveVisitorGameEntranceWidget", false);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        qyVar.f201094g = bool.booleanValue();
    }
}
