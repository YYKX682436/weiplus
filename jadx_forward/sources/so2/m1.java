package so2;

/* loaded from: classes.dex */
public final class m1 implements so2.j5 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof so2.m1 ? (so2.m1) obj : null) == null || ((long) obj.hashCode()) != ((long) hashCode())) ? -1 : 0;
    }

    /* renamed from: equals */
    public boolean m164919xb2c87fbf(java.lang.Object obj) {
        so2.m1 m1Var = obj instanceof so2.m1 ? (so2.m1) obj : null;
        return m1Var != null && ((long) m1Var.hashCode()) == ((long) hashCode());
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46359x61685111;
    }

    /* renamed from: toString */
    public java.lang.String m164920x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MoreLiveListItem");
        sb6.append(hashCode());
        return sb6.toString();
    }
}
