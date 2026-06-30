package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44;

/* loaded from: classes2.dex */
public final class c extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.g f203599a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.g gVar) {
        this.f203599a = gVar;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveSquareShoppingWidget", "onExposeTimeRecorded: size = " + recordsSet.size());
    }

    @Override // in5.p
    public void d(in5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        in5.c cVar = item.f374603a;
        vp2.k0 k0Var = cVar instanceof vp2.k0 ? (vp2.k0) cVar : null;
        if (k0Var != null) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.g gVar = this.f203599a;
            long j17 = gVar.f203605c;
            long j18 = gVar.f203606d;
            java.lang.String str = gVar.f203607e;
            r45.qt2 qt2Var = gVar.f203610h;
            java.lang.String valueOf = java.lang.String.valueOf(qt2Var.m75939xb282bd08(5));
            ml2.b4 b4Var = ml2.b4.f408757e;
            cl0.g gVar2 = new cl0.g();
            gVar2.o("commerceAction", 1);
            gVar2.o("reason_type", 2);
            r45.y23 y23Var = k0Var.f520466e;
            gVar2.p("productid", y23Var.m75942xfb822ef2(0));
            r0Var.ij(j17, j18, str, valueOf, 12, gVar2.toString(), "");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
            java.lang.String valueOf2 = java.lang.String.valueOf(qt2Var.m75939xb282bd08(5));
            java.lang.String m75945x2fec8307 = qt2Var.m75945x2fec8307(1);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("liveid_id", java.lang.Long.valueOf(gVar.f203605c));
            jSONObject.putOpt("productid", java.lang.Long.valueOf(y23Var.m75942xfb822ef2(0)));
            a4Var.a(valueOf2, "", m75945x2fec8307, "topic_page_single_commo_card", jSONObject.toString());
        }
    }
}
