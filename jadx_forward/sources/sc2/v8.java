package sc2;

/* loaded from: classes2.dex */
public final class v8 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final xc2.p0 f487850d;

    /* renamed from: e, reason: collision with root package name */
    public int f487851e;

    public v8(xc2.p0 jumpInfoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfoEx, "jumpInfoEx");
        this.f487850d = jumpInfoEx;
        this.f487851e = -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof sc2.v8) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((sc2.v8) obj).f487850d.f534767a.m76501xf2fd2296(), this.f487850d.f534767a.m76501xf2fd2296())) ? 0 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return sc2.v8.class.hashCode();
    }
}
