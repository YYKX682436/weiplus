package so2;

/* loaded from: classes10.dex */
public final class d2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.c64 f491845d;

    public d2(r45.c64 lbsLife) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lbsLife, "lbsLife");
        this.f491845d = lbsLife;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof r45.c64) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.c64) obj).f452843d, this.f491845d.f452843d)) ? 0 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
