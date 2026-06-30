package cw2;

/* loaded from: classes15.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.d0 f305144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(cw2.d0 d0Var) {
        super(2);
        this.f305144d = d0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        if (((java.lang.Number) obj2).intValue() + ((java.lang.Number) obj).intValue() == 0) {
            cw2.d0 d0Var = this.f305144d;
            d0Var.a(d0Var.f305167h, "onPreloadComplete");
        }
        return jz5.f0.f384359a;
    }
}
