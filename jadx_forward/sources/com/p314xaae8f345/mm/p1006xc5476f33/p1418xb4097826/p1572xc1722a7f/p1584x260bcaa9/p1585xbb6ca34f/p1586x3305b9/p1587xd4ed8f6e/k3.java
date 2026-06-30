package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class k3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f203290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.q3 f203291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203292c;

    public k3(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.q3 q3Var, java.lang.String str) {
        this.f203290a = context;
        this.f203291b = q3Var;
        this.f203292c = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 != 0 || fVar.f152149b != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NoticeOfSpecialColumnConvert", "Cgi receiveConcertTicket failed errType: " + fVar.f152148a + ", errMsg: " + fVar.f152150c + ", errCode: " + fVar.f152149b);
            return f0Var;
        }
        r45.m70 m70Var = (r45.m70) ((r45.o62) fVar.f152151d).m75936x14adae67(1);
        if (m70Var == null) {
            return null;
        }
        android.content.Context context = this.f203290a;
        java.lang.String str = this.f203292c;
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0.z5((s40.w0) c17, context, m70Var, this.f203291b.f203433e, str, null, 16, null);
        return f0Var;
    }
}
