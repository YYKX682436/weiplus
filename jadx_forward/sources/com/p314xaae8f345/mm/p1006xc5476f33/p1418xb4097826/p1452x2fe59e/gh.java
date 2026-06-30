package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes3.dex */
public final class gh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f188373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v71 f188374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188375f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188376g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f188377h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f188378i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f188379m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, r45.v71 v71Var, java.lang.String str, java.lang.String str2, java.lang.String str3, zy2.i5 i5Var, zy2.i5 i5Var2) {
        super(0);
        this.f188373d = abstractActivityC21394xb3d2c0cf;
        this.f188374e = v71Var;
        this.f188375f = str;
        this.f188376g = str2;
        this.f188377h = str3;
        this.f188378i = i5Var;
        this.f188379m = i5Var2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        java.lang.String m76197x6c03c64c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh jhVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188634a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f188373d;
        java.lang.String str = this.f188375f;
        java.lang.String str2 = this.f188376g;
        java.lang.String str3 = this.f188377h;
        zy2.i5 i5Var = this.f188378i;
        zy2.i5 i5Var2 = this.f188379m;
        r45.v71 v71Var = this.f188374e;
        r45.h32 h32Var = (r45.h32) v71Var.m75936x14adae67(1);
        if (h32Var != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) v71Var.m75936x14adae67(3);
            java.lang.String str4 = (c19782x23db1cfa == null || (m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c()) == null) ? "" : m76197x6c03c64c;
            if (h32Var.m75939xb282bd08(1) == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188637d = 5;
                i17 = 1;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188637d = 8;
                i17 = 2;
            }
            if (i17 == 1) {
                jhVar.a(abstractActivityC21394xb3d2c0cf, v71Var, i17, str, str2, str3, i5Var, i5Var2);
                ml2.i5 i5Var3 = ml2.i5.f409104f;
                r45.aa2 aa2Var = (r45.aa2) v71Var.m75936x14adae67(2);
                long m75942xfb822ef2 = aa2Var != null ? aa2Var.m75942xfb822ef2(2) : 0L;
                r45.aa2 aa2Var2 = (r45.aa2) v71Var.m75936x14adae67(2);
                int i18 = ((aa2Var2 == null || aa2Var2.m75939xb282bd08(3) != 2) ? 0 : 1) ^ 1;
                java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(4);
                jhVar.d(i5Var3, str4, m75942xfb822ef2, i18, str, m75945x2fec8307 == null ? "" : m75945x2fec8307, str2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jh.f188637d = 6;
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) abstractActivityC21394xb3d2c0cf.mo55332x76847179(), 1, true);
                k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yg(abstractActivityC21394xb3d2c0cf);
                k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.zg(abstractActivityC21394xb3d2c0cf, v71Var, i17, str, str2, str3, i5Var, i5Var2, str4, h32Var);
                k0Var.v();
            }
        }
        return jz5.f0.f384359a;
    }
}
