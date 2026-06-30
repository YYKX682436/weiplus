package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k f202761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f202762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f f202763f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202764g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k kVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f, java.lang.String str) {
        super(1);
        this.f202761d = kVar;
        this.f202762e = f2Var;
        this.f202763f = c15343x638a173f;
        this.f202764g = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList<r45.dr0> linkedList;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        r1 = null;
        java.util.ArrayList arrayList = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = this.f202763f;
        if (fVar == null || !fVar.b()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#loadMoreData fail error=");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberPreviewFeedItemUIC", sb6.toString());
            c15343x638a173f.e(false);
        } else {
            r45.rr0 rr0Var = (r45.rr0) fVar.f152151d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k kVar = this.f202761d;
            if (rr0Var != null && (linkedList = rr0Var.f466664d) != null) {
                arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                for (r45.dr0 dr0Var : linkedList) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dr0Var);
                    arrayList.add(new jo2.b(dr0Var, true, kVar.f202782q == 1, this.f202764g));
                }
            }
            if (arrayList != null) {
                kVar.f202773e.addAll(arrayList);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = this.f202762e;
                if (f2Var != null) {
                    f2Var.m8153xd399a4d9(kVar.f202773e.size() - arrayList.size(), arrayList.size());
                }
            }
            r45.rr0 rr0Var2 = (r45.rr0) fVar.f152151d;
            kVar.f202774f = rr0Var2.f466665e;
            if (rr0Var2.f466666f == 1) {
                c15343x638a173f.e(true);
            } else {
                c15343x638a173f.f();
            }
        }
        return c15343x638a173f;
    }
}
