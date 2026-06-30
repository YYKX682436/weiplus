package d6;

/* loaded from: classes10.dex */
public final class e implements d6.h {

    /* renamed from: c, reason: collision with root package name */
    public final p135x2eae8f.p138x35e001.AbstractC1421x275421 f308171c;

    public e(p135x2eae8f.p138x35e001.AbstractC1421x275421 size) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(size, "size");
        this.f308171c = size;
    }

    @Override // d6.h
    public java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return this.f308171c;
    }

    /* renamed from: equals */
    public boolean m123542xb2c87fbf(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof d6.e) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f308171c, ((d6.e) obj).f308171c)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m123543x8cdac1b() {
        return this.f308171c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m123544x9616526c() {
        return "RealSizeResolver(size=" + this.f308171c + ')';
    }
}
