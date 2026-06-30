package rf2;

/* loaded from: classes10.dex */
public final class d2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.l30 f476228d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f476229e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f476230f;

    /* renamed from: g, reason: collision with root package name */
    public long f476231g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f476232h;

    public d2(r45.l30 choice) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(choice, "choice");
        this.f476228d = choice;
        this.f476229e = choice.m75939xb282bd08(2) > 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String m75945x2fec8307 = choice.m75945x2fec8307(4);
        sb6.append(m75945x2fec8307 == null ? "" : m75945x2fec8307);
        sb6.append(". ");
        java.lang.String m75945x2fec83072 = choice.m75945x2fec8307(1);
        sb6.append(m75945x2fec83072 != null ? m75945x2fec83072 : "");
        this.f476232h = sb6.toString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f476228d.m75939xb282bd08(0);
    }

    @Override // in5.c
    public int h() {
        return rf2.d2.class.hashCode();
    }
}
