package so2;

/* loaded from: classes2.dex */
public final class j3 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.yf2 f491974d;

    /* renamed from: e, reason: collision with root package name */
    public oc2.k f491975e;

    public j3(r45.yf2 contact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        this.f491974d = contact;
    }

    public final boolean a() {
        return this.f491974d.f472570g * ((long) 1000) < c01.id.c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        java.lang.String m76197x6c03c64c;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (!(obj instanceof so2.j3) || (c19782x23db1cfa = ((so2.j3) obj).f491974d.f472567d) == null || (m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c()) == null) {
            return -1;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = this.f491974d.f472567d;
        if (c19782x23db1cfa2 == null || (str = c19782x23db1cfa2.m76197x6c03c64c()) == null) {
            str = "";
        }
        return m76197x6c03c64c.compareTo(str);
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return so2.j3.class.getName().hashCode();
    }
}
