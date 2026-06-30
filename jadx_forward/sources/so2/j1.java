package so2;

/* loaded from: classes2.dex */
public final class j1 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f491972d;

    public j1(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 finderObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderObject, "finderObject");
        this.f491972d = finderObject;
    }

    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 a() {
        return this.f491972d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof so2.j1 ? (so2.j1) obj : null) == null || ((so2.j1) obj).f491972d.m76784x5db1b11() != mo2128x1ed62e84()) ? -1 : 0;
    }

    /* renamed from: equals */
    public boolean m164904xb2c87fbf(java.lang.Object obj) {
        so2.j1 j1Var = obj instanceof so2.j1 ? (so2.j1) obj : null;
        return j1Var != null && j1Var.f491972d.m76784x5db1b11() == this.f491972d.m76784x5db1b11();
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f491972d.m76784x5db1b11();
    }

    @Override // in5.c
    public int h() {
        return 2004;
    }

    /* renamed from: toString */
    public java.lang.String m164905x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveItem:");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[nickname:");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f491972d;
        sb7.append(hc2.b0.k(c19792x256d2725.m76801x8010e5e4(), 0, 0, 3, null));
        sb7.append(",feedId:");
        sb7.append(c19792x256d2725.m76784x5db1b11());
        sb7.append(",liveId:");
        r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
        sb7.append(m76794xd0557130 != null ? java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0)) : null);
        sb7.append(",friendLikeCount:");
        sb7.append(c19792x256d2725.m76779xf67fd084());
        sb7.append(']');
        sb6.append(sb7.toString());
        java.lang.String sb8 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
        return sb8;
    }
}
