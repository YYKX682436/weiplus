package pl2;

/* loaded from: classes3.dex */
public final class a implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final km2.m f438149d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f438150e;

    public a(km2.m data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f438149d = data;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        if (!(obj instanceof pl2.a)) {
            return -1;
        }
        return this.f438149d.d(((pl2.a) obj).f438149d);
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f438149d.f390662d.f150070e;
    }

    @Override // in5.c
    public int h() {
        return pl2.a.class.hashCode();
    }
}
