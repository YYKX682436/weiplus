package wy0;

/* loaded from: classes14.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz0.d0 f532156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z0.t f532157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f532158f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f532159g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(vz0.d0 d0Var, z0.t tVar, int i17, int i18) {
        super(2);
        this.f532156d = d0Var;
        this.f532157e = tVar;
        this.f532158f = i17;
        this.f532159g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f532158f | 1;
        wy0.m.b(this.f532156d, this.f532157e, (n0.o) obj, i17, this.f532159g);
        return jz5.f0.f384359a;
    }
}
