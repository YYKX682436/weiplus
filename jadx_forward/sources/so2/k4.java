package so2;

/* loaded from: classes2.dex */
public final class k4 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.bw0 f491987d;

    /* renamed from: e, reason: collision with root package name */
    public final int f491988e;

    /* renamed from: f, reason: collision with root package name */
    public int f491989f;

    public k4(r45.bw0 info, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f491987d = info;
        this.f491988e = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        so2.k4 k4Var = obj instanceof so2.k4 ? (so2.k4) obj : null;
        return (k4Var == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k4Var.f491987d.m75945x2fec8307(1), this.f491987d.m75945x2fec8307(1))) ? -1 : 0;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return this.f491988e;
    }
}
