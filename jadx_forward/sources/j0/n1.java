package j0;

/* loaded from: classes14.dex */
public final class n1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0.y0 f377989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f377990e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(k0.y0 y0Var, int i17) {
        super(2);
        this.f377989d = y0Var;
        this.f377990e = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f377990e | 1;
        j0.p1.c(this.f377989d, (n0.o) obj, i17);
        return jz5.f0.f384359a;
    }
}
