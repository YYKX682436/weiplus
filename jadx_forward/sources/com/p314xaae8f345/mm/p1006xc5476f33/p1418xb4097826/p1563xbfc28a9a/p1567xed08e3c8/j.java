package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8;

/* loaded from: classes2.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k f202765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f202766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f f202767f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202768g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k kVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f, java.lang.String str) {
        super(1);
        this.f202765d = kVar;
        this.f202766e = f2Var;
        this.f202767f = c15343x638a173f;
        this.f202768g = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.LinkedList<r45.dr0> linkedList;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        r0 = null;
        java.util.ArrayList arrayList = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15343x638a173f c15343x638a173f = this.f202767f;
        if (fVar == null || !fVar.b()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#refresh fail error=");
            sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberPreviewFeedItemUIC", sb6.toString());
            return c15343x638a173f.i(false);
        }
        r45.rr0 rr0Var = (r45.rr0) fVar.f152151d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1567xed08e3c8.k kVar = this.f202765d;
        if (rr0Var != null && (linkedList = rr0Var.f466664d) != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.dr0 dr0Var : linkedList) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dr0Var);
                arrayList.add(new jo2.b(dr0Var, true, kVar.f202782q == 1, this.f202768g));
            }
        }
        kVar.f202773e.clear();
        if (arrayList != null) {
            kVar.f202773e.addAll(arrayList);
        }
        kVar.f202774f = ((r45.rr0) fVar.f152151d).f466665e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = this.f202766e;
        if (f2Var != null) {
            f2Var.m8146xced61ae5();
        }
        if (((r45.rr0) fVar.f152151d).f466666f == 1) {
            c15343x638a173f.i(true);
        } else {
            c15343x638a173f.k();
        }
        c15343x638a173f.m82914x4c6bcf83().f411726c = false;
        return jz5.f0.f384359a;
    }
}
