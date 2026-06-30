package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class e3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f203177c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.j3 f203178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203179e;

    public e3(java.lang.String str, java.lang.String str2, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.j3 j3Var, java.lang.String str3) {
        this.f203175a = str;
        this.f203176b = str2;
        this.f203177c = context;
        this.f203178d = j3Var;
        this.f203179e = str3;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.m70 m70Var = (r45.m70) ((r45.zr1) fVar.f152151d).m75936x14adae67(1);
            boolean m75933x41a8a7f2 = m70Var != null ? m70Var.m75933x41a8a7f2(6) : false;
            if (!m75933x41a8a7f2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NoticeOfSpecialColumnConvert", "ticket hasReceived: " + m75933x41a8a7f2);
                pq5.g l17 = new db2.b2(this.f203175a, null, null, 0L, 0L, this.f203176b, 1, false, 158, null).l();
                android.content.Context context = this.f203177c;
                l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.d3(context, this.f203178d, this.f203179e));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NoticeOfSpecialColumnConvert", "Cgi getConcertTicket failed errType: " + fVar.f152148a + ", errMsg: " + fVar.f152150c + ", errCode: " + fVar.f152149b);
        }
        return jz5.f0.f384359a;
    }
}
