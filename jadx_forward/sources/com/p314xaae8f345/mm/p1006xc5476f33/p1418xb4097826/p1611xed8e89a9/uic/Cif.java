package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.if, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Cif implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd f205345a;

    public Cif(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd) {
        this.f205345a = c14900x9bf524dd;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p944x882e457a.i iVar = fVar.f152153f;
        bq.g0 g0Var = iVar instanceof bq.g0 ? (bq.g0) iVar : null;
        if (g0Var != null) {
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            boolean z17 = !cq.n1.a((cq.k) c17, null, null).isEmpty();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.C14900x9bf524dd c14900x9bf524dd = this.f205345a;
            if (z17) {
                c14900x9bf524dd.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "addDraftFragment");
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ue(c14900x9bf524dd, false));
            } else if (fVar.f152148a == 0 && fVar.f152149b == 0) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = g0Var.f152179f.f152244b.f152233a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetDraftResponse");
                java.util.LinkedList m75941xfb821914 = ((r45.r51) fVar2).m75941xfb821914(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
                if (m75941xfb821914.isEmpty()) {
                    c14900x9bf524dd.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "removeDraftFragment");
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.eg(c14900x9bf524dd));
                } else {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = g0Var.f152179f.f152244b.f152233a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetDraftResponse");
                    boolean z18 = ((r45.r51) fVar3).m75939xb282bd08(4) == 1;
                    c14900x9bf524dd.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "addDraftFragment");
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.ue(c14900x9bf524dd, z18));
                }
            } else {
                c14900x9bf524dd.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileTabUIC", "removeDraftFragment");
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.eg(c14900x9bf524dd));
            }
        }
        return jz5.f0.f384359a;
    }
}
