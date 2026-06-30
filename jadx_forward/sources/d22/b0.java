package d22;

/* loaded from: classes12.dex */
public final class b0 extends qk.j7 implements d22.v {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f307362h;

    public b0(java.lang.String productId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productId, "productId");
        this.f307362h = productId;
    }

    @Override // d22.v
    public boolean a() {
        return false;
    }

    @Override // d22.v
    public d22.p b() {
        return new d22.c0();
    }

    @Override // d22.v
    /* renamed from: isValid */
    public boolean mo123369x7b953cf2() {
        return this.f307362h.length() > 0;
    }
}
