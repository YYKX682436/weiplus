package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class d5 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.jt4 f189325d;

    /* renamed from: e, reason: collision with root package name */
    public final long f189326e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f189327f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f189328g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f189329h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f189330i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f189331m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Long f189332n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f189333o;

    public d5(r45.jt4 dramaInfo) {
        r45.it4 it4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dramaInfo, "dramaInfo");
        this.f189325d = dramaInfo;
        r45.uj2 uj2Var = (r45.uj2) dramaInfo.m75936x14adae67(1);
        this.f189326e = uj2Var != null ? uj2Var.m75942xfb822ef2(0) : 0L;
        r45.uj2 uj2Var2 = (r45.uj2) dramaInfo.m75936x14adae67(1);
        this.f189327f = uj2Var2 != null ? uj2Var2.m75945x2fec8307(3) : null;
        r45.uj2 uj2Var3 = (r45.uj2) dramaInfo.m75936x14adae67(1);
        this.f189328g = uj2Var3 != null ? uj2Var3.m75945x2fec8307(2) : null;
        r45.uj2 uj2Var4 = (r45.uj2) dramaInfo.m75936x14adae67(1);
        this.f189329h = uj2Var4 != null ? uj2Var4.m75945x2fec8307(4) : null;
        r45.uj2 uj2Var5 = (r45.uj2) dramaInfo.m75936x14adae67(1);
        if (uj2Var5 != null) {
            uj2Var5.m75945x2fec8307(5);
        }
        r45.uj2 uj2Var6 = (r45.uj2) dramaInfo.m75936x14adae67(1);
        this.f189330i = uj2Var6 != null ? java.lang.Integer.valueOf(uj2Var6.m75939xb282bd08(6)) : null;
        r45.uj2 uj2Var7 = (r45.uj2) dramaInfo.m75936x14adae67(1);
        this.f189331m = uj2Var7 != null ? uj2Var7.m75945x2fec8307(7) : null;
        r45.uj2 uj2Var8 = (r45.uj2) dramaInfo.m75936x14adae67(1);
        this.f189332n = (uj2Var8 == null || (it4Var = (r45.it4) uj2Var8.m75936x14adae67(13)) == null) ? null : java.lang.Long.valueOf(it4Var.m75942xfb822ef2(0));
        r45.uj2 uj2Var9 = (r45.uj2) dramaInfo.m75936x14adae67(1);
        this.f189333o = uj2Var9 != null ? uj2Var9.m75945x2fec8307(9) : null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5)) {
            return -1;
        }
        r45.uj2 uj2Var = (r45.uj2) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5) obj).f189325d.m75936x14adae67(1);
        java.lang.Long valueOf = uj2Var != null ? java.lang.Long.valueOf(uj2Var.m75942xfb822ef2(0)) : null;
        r45.uj2 uj2Var2 = (r45.uj2) this.f189325d.m75936x14adae67(1);
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, uj2Var2 != null ? java.lang.Long.valueOf(uj2Var2.m75942xfb822ef2(0)) : null) ? 0 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f189326e;
    }

    @Override // in5.c
    public int h() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d5.class.hashCode();
    }
}
