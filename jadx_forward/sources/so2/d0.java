package so2;

/* loaded from: classes2.dex */
public final class d0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.vx0 f491841d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f491842e;

    public d0(r45.vx0 collectionInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectionInfo, "collectionInfo");
        this.f491841d = collectionInfo;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        return ((obj instanceof so2.d0) && ((so2.d0) obj).f491841d.m75942xfb822ef2(0) == this.f491841d.m75942xfb822ef2(0)) ? 0 : -1;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f491841d.m75942xfb822ef2(0);
    }

    @Override // in5.c
    public int h() {
        return so2.d0.class.getName().hashCode();
    }
}
