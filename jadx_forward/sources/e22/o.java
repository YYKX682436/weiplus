package e22;

/* loaded from: classes14.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f328224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f328225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f328226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f328227g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z0.t tVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, int i17, int i18) {
        super(2);
        this.f328224d = tVar;
        this.f328225e = c19792x256d2725;
        this.f328226f = i17;
        this.f328227g = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f328226f | 1;
        e22.a1.h(this.f328224d, this.f328225e, (n0.o) obj, i17, this.f328227g);
        return jz5.f0.f384359a;
    }
}
