package ot2;

/* loaded from: classes2.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 f430392a;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 c14957x1a4885f0) {
        this.f430392a = c14957x1a4885f0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: getListUpdateCallback */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.r1 mo56442x10675662() {
        return new ot2.c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeDataAndNotify */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0 mo1053x5ee561e(int i17, java.util.List list, boolean z17, java.lang.Object obj) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0(-1, 0, new java.util.LinkedList(), false, false, 24, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeInit */
    public void mo1054x60f5a168(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeInsert */
    public void mo56443xfa174911(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeInsertSpecifiedLocation */
    public void mo56444x985fac74(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.t0 objectId, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objectId, "objectId");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeLoadMore */
    public void mo1055x1f1ce1b3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        java.util.List m56409x97891cf7;
        java.util.AbstractCollection m56387xe6796cde;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 c14957x1a4885f0 = this.f430392a;
        int size = c14957x1a4885f0.m56387xe6796cde().size();
        ot2.a aVar = response instanceof ot2.a ? (ot2.a) response : null;
        if (aVar != null && (m56409x97891cf7 = aVar.m56409x97891cf7()) != null && (m56387xe6796cde = c14957x1a4885f0.m56387xe6796cde()) != null) {
            m56387xe6796cde.addAll(m56409x97891cf7);
        }
        yz5.l lVar2 = c14957x1a4885f0.f207211f;
        if (lVar2 != null) {
            lVar2.mo146xb9724478(java.lang.Integer.valueOf(size));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeRefresh */
    public void mo1056x14dcd783(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        java.util.List m56409x97891cf7;
        java.util.AbstractCollection m56387xe6796cde;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 c14957x1a4885f0 = this.f430392a;
        int size = c14957x1a4885f0.m56387xe6796cde().size();
        ot2.a aVar = response instanceof ot2.a ? (ot2.a) response : null;
        if (aVar != null && (m56409x97891cf7 = aVar.m56409x97891cf7()) != null && (m56387xe6796cde = c14957x1a4885f0.m56387xe6796cde()) != null) {
            m56387xe6796cde.addAll(m56409x97891cf7);
        }
        pm0.v.X(new ot2.d(c14957x1a4885f0, size));
    }
}
