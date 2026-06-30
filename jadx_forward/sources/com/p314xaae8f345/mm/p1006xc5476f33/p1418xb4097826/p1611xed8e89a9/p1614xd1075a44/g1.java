package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes3.dex */
public final class g1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 f206081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206082b;

    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.s1 s1Var, java.lang.String str) {
        this.f206081a = s1Var;
        this.f206082b = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.m70 m70Var;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HeaderLiveWidget", "CgiFinderLiveReceiveConcertTicket errCode: " + fVar.f152149b + ", errMsg: " + fVar.f152150c + ", errType: " + fVar.f152148a);
        if (fVar.f152149b == 0 && fVar.f152148a == 0 && (m70Var = (r45.m70) ((r45.o62) fVar.f152151d).m75936x14adae67(1)) != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.f1(this.f206081a, m70Var, this.f206082b));
        }
        return jz5.f0.f384359a;
    }
}
