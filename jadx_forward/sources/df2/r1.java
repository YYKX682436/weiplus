package df2;

/* loaded from: classes3.dex */
public final class r1 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public ts5.d f312741m;

    /* renamed from: n, reason: collision with root package name */
    public ts5.d f312742n;

    /* renamed from: o, reason: collision with root package name */
    public int f312743o;

    /* renamed from: p, reason: collision with root package name */
    public int f312744p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f312745q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f312746r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f312747s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f312745q = "";
        this.f312746r = "";
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveDeactivate */
    public void mo14860x9606ce3f() {
        super.mo14860x9606ce3f();
        ts5.d dVar = this.f312741m;
        if (dVar != null) {
            dVar.mo149995xae7a2e7a();
        }
        ts5.d dVar2 = this.f312742n;
        if (dVar2 != null) {
            dVar2.mo149995xae7a2e7a();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveEnd */
    public void mo56792x5aa1a970() {
        super.mo56792x5aa1a970();
        ts5.d dVar = this.f312741m;
        if (dVar != null) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("sourceType", java.lang.Integer.valueOf(this.f312743o));
            linkedHashMap.put("subSourceType", java.lang.Integer.valueOf(this.f312744p));
            linkedHashMap.put("gameName", this.f312745q);
            linkedHashMap.put("gamePackage", this.f312746r);
            linkedHashMap.put("isScreenCastSuspend", java.lang.Boolean.valueOf(this.f312747s));
            dVar.a(linkedHashMap);
        }
        this.f312741m = null;
        ts5.d dVar2 = this.f312742n;
        if (dVar2 != null) {
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            linkedHashMap2.put("sourceType", java.lang.Integer.valueOf(this.f312743o));
            linkedHashMap2.put("subSourceType", java.lang.Integer.valueOf(this.f312744p));
            linkedHashMap2.put("gameName", this.f312745q);
            linkedHashMap2.put("gamePackage", this.f312746r);
            linkedHashMap2.put("isScreenCastSuspend", java.lang.Boolean.valueOf(this.f312747s));
            dVar2.a(linkedHashMap2);
        }
        this.f312742n = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLiveStart */
    public void mo14863x39a513b7(r45.hc1 hc1Var) {
        super.mo14863x39a513b7(hc1Var);
        this.f312743o = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75939xb282bd08(12);
        this.f312744p = ((mm2.e1) m56788xbba4bfc0(mm2.e1.class)).f410521r.m75939xb282bd08(75);
        r45.xq1 xq1Var = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).C2;
        java.lang.String m75945x2fec8307 = xq1Var != null ? xq1Var.m75945x2fec8307(3) : null;
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        this.f312745q = m75945x2fec8307;
        r45.xq1 xq1Var2 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).C2;
        if (xq1Var2 != null) {
            xq1Var2.m75945x2fec8307(2);
        }
        r45.xq1 xq1Var3 = ((mm2.c1) m56788xbba4bfc0(mm2.c1.class)).C2;
        java.lang.String m75945x2fec83072 = xq1Var3 != null ? xq1Var3.m75945x2fec8307(6) : null;
        this.f312746r = m75945x2fec83072 != null ? m75945x2fec83072 : "";
        ts5.d wi6 = ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).wi(ts5.c.f503265d, ts5.a.f503261m);
        wi6.mo149996x68ac462();
        this.f312741m = wi6;
        ts5.d wi7 = ((nu2.i) ((ts5.n) i95.n0.c(ts5.n.class))).wi(ts5.c.f503266e, ts5.a.f503262n);
        wi7.mo149996x68ac462();
        this.f312742n = wi7;
    }
}
