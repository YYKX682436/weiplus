package ky;

/* loaded from: classes14.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f394973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f394974e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f394975f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f394976g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(z0.t tVar, boolean z17, int i17, int i18) {
        super(2);
        this.f394973d = tVar;
        this.f394974e = z17;
        this.f394975f = i17;
        this.f394976g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f394975f | 1;
        ky.w.a(this.f394973d, this.f394974e, (n0.o) obj, i17, this.f394976g);
        return jz5.f0.f384359a;
    }
}
