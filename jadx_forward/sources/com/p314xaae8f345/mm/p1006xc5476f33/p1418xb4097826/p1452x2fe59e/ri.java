package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes3.dex */
public final class ri extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f190448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ti f190449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190450f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190451g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f190452h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f190453i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ti tiVar, java.lang.String str, java.lang.String str2, java.lang.String str3, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(0);
        this.f190448d = z17;
        this.f190449e = tiVar;
        this.f190450f = str;
        this.f190451g = str2;
        this.f190452h = str3;
        this.f190453i = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        zl2.u4 u4Var = !this.f190448d ? zl2.u4.f555523f : zl2.u4.f555521d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ti tiVar = this.f190449e;
        android.app.Activity m80379x76847179 = tiVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp hpVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) m80379x76847179, null, u4Var, 2, null);
        tiVar.f190594d = hpVar;
        hpVar.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ni(tiVar);
        hpVar.N = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oi(tiVar);
        hpVar.K = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pi(tiVar);
        java.lang.String str2 = this.f190450f;
        if (!(str2 == null || str2.length() == 0)) {
            hpVar.f200113a2 = str2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hp hpVar2 = tiVar.f190594d;
        if (hpVar2 != null) {
            hpVar2.f0();
        }
        long Z = pm0.v.Z(this.f190451g);
        java.lang.String str3 = this.f190452h;
        long Z2 = pm0.v.Z(str3);
        r45.xn1 xn1Var = (r45.xn1) this.f190453i.f391656d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qi qiVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.qi(tiVar, str3);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0);
        if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
            str = "";
        }
        ke2.t tVar = new ke2.t(Z, Z2, str, 3, xn1Var.m75934xbce7f2f(9), null, null);
        az2.j.u(tVar, tiVar.m158354x19263085(), null, 1000L, 2, null);
        pq5.g l17 = tVar.l();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = tiVar.m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            l17.f(abstractActivityC21394xb3d2c0cf);
        }
        l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.si(str, xn1Var, qiVar));
        return jz5.f0.f384359a;
    }
}
