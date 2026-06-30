package f0;

/* loaded from: classes5.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.b0 f339529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f339530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f339531f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(f0.b0 b0Var, int i17, int i18) {
        super(2);
        this.f339529d = b0Var;
        this.f339530e = i17;
        this.f339531f = i18;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f339531f | 1;
        this.f339529d.a(this.f339530e, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
