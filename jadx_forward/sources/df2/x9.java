package df2;

/* loaded from: classes3.dex */
public final class x9 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f313299m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f313300n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f313299m = "Finder.JoinLivePreloadController";
    }

    public final void Z6(long j17, long j18, yz5.a aVar) {
        if (pm0.v.A(j17, j18)) {
            aVar.mo152xb9724478();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f313299m, "checkPreload skip " + j18);
    }

    public final void a7() {
        dk2.xf P6;
        ae2.in inVar = ae2.in.f85221a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f85228a6).mo141623x754a37bb()).r()).booleanValue() || (P6 = P6()) == null) {
            return;
        }
        dk2.xf.g(P6, ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410516m, ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410525v, 2, null, 16, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveActivate */
    public void mo8997x8001c97e() {
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        r45.u72 u72Var;
        r45.u72 u72Var2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadFlag:");
        jz5.f0 f0Var = null;
        sb6.append((hc1Var == null || (u72Var2 = (r45.u72) hc1Var.m75936x14adae67(57)) == null) ? null : java.lang.Long.valueOf(u72Var2.m75942xfb822ef2(0)));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f313299m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        if (hc1Var != null && (u72Var = (r45.u72) hc1Var.m75936x14adae67(57)) != null) {
            long m75942xfb822ef2 = u72Var.m75942xfb822ef2(0);
            Z6(m75942xfb822ef2, 1L, new df2.u9(this));
            Z6(m75942xfb822ef2, 4L, new df2.v9(this));
            Z6(m75942xfb822ef2, 32L, new df2.w9(this));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "shouldPreloadForProductPromoteBubble " + this.f313300n);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            a7();
        }
    }
}
