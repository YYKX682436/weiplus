package iy;

/* loaded from: classes14.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f377224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f377225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f377226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f377227g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z0.t tVar, yz5.a aVar, yz5.a aVar2, int i17) {
        super(2);
        this.f377224d = tVar;
        this.f377225e = aVar;
        this.f377226f = aVar2;
        this.f377227g = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f377227g | 1;
        yz5.a aVar = this.f377225e;
        yz5.a aVar2 = this.f377226f;
        iy.n.b(this.f377224d, aVar, aVar2, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
