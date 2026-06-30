package so2;

/* loaded from: classes8.dex */
public final class o6 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final so2.n6 f492067d;

    public o6(so2.n6 model) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        this.f492067d = model;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof so2.o6) && ((so2.o6) obj).f492067d.f492043j == this.f492067d.f492043j) ? 0 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return this.f492067d.f492038e.ordinal();
    }
}
