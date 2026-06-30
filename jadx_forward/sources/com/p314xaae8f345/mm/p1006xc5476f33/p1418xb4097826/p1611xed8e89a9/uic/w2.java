package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class w2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ss4 f205842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f205843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j3 f205844f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f205845g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(r45.ss4 ss4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.j3 j3Var, yz5.l lVar) {
        super(0);
        this.f205842d = ss4Var;
        this.f205843e = x80Var;
        this.f205844f = j3Var;
        this.f205845g = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList m75941xfb821914 = this.f205842d.m75941xfb821914(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("localId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f205843e;
        sb6.append(x80Var.f66236x88be67a1);
        sb6.append(", id:");
        sb6.append(x80Var.f66238x2327e25f);
        sb6.append(" is svrFeed");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProfileDraftUIC", sb6.toString());
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        c0Var.f391645d = true;
        db2.g4 g4Var = new db2.g4(x80Var.f66238x2327e25f, x80Var.t0().m59276x6c285d75(), 0, 0, "", true, null, null, 0L, null, false, false, null, null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862656, null);
        g4Var.t(this.f205844f.m80379x76847179(), "", 500L);
        g4Var.l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.v2(c0Var, m75941xfb821914, this.f205844f, this.f205845g, this.f205842d));
        return jz5.f0.f384359a;
    }
}
