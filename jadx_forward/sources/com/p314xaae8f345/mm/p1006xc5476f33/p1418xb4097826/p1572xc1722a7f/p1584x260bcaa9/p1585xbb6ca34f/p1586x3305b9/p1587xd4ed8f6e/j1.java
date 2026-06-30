package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class j1 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1 f203271b;

    public j1(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p1 p1Var) {
        this.f203270a = s0Var;
        this.f203271b = p1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0271 A[SYNTHETIC] */
    @Override // in5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.util.Set r28) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.j1.c(java.util.Set):void");
    }

    @Override // in5.p
    public void d(in5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        sp2.k kVar = this.f203271b.f203405g;
        int i17 = item.f374607e;
        in5.c cVar = item.f374603a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.RVFeed");
        org.json.JSONObject q17 = kVar.q(null, i17, (so2.j5) cVar);
        vp2.n nVar = cVar instanceof vp2.n ? (vp2.n) cVar : null;
        if (nVar != null) {
            nVar.f520478e = q17;
        }
        vp2.l lVar = cVar instanceof vp2.l ? (vp2.l) cVar : null;
        if (lVar != null) {
            lVar.f520471g = q17;
        }
        sp2.j jVar = sp2.j.f492587a;
        android.content.Context context = this.f203270a.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        sp2.j.e(jVar, context, item, q17, null, 8, null);
    }
}
