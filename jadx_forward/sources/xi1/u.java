package xi1;

/* loaded from: classes7.dex */
public final class u implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p2 {

    /* renamed from: b, reason: collision with root package name */
    public static final xi1.t f536248b = new xi1.t(null);

    /* renamed from: a, reason: collision with root package name */
    public final xi1.p f536249a;

    public u(xi1.p orientationHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orientationHandler, "orientationHandler");
        this.f536249a = orientationHandler;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p2
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e4 a() {
        xi1.o a17 = this.f536249a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getCurrentOrientation(...)");
        int ordinal = a17.ordinal();
        if (ordinal == 0) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e4.f171955e;
        }
        if (ordinal == 1) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e4.f171954d;
        }
        if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.e4.f171956f;
        }
        throw new jz5.j();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.p2
    /* renamed from: getName */
    public java.lang.String mo53131xfb82e301() {
        return "WxaOrientationGetter";
    }
}
