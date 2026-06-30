package yx2;

/* loaded from: classes14.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f549361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15435x142f8d24 f549362e;

    public a0(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15435x142f8d24 c15435x142f8d24) {
        this.f549361d = bitmap;
        this.f549362e = c15435x142f8d24;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17858x5da04085 m62956x4eb0f6e5;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17858x5da04085 m62956x4eb0f6e52;
        um5.d dVar = new um5.d();
        android.graphics.Bitmap resource = this.f549361d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resource, "$resource");
        dVar.b(resource);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1676x2ef9413f.C15435x142f8d24 c15435x142f8d24 = this.f549362e;
        m62956x4eb0f6e5 = c15435x142f8d24.m62956x4eb0f6e5();
        int width = m62956x4eb0f6e5.getWidth();
        m62956x4eb0f6e52 = c15435x142f8d24.m62956x4eb0f6e5();
        int height = m62956x4eb0f6e52.getHeight();
        dVar.f510674b = width;
        dVar.f510675c = height;
        dVar.f510677e.f510726b.d();
        dVar.a(new yx2.z(c15435x142f8d24));
    }
}
