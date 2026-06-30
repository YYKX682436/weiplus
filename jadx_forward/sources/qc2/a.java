package qc2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f443037a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f443038b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f443039c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f443040d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f443041e;

    public a(int i17, java.lang.String carouselAutoSequence, java.lang.String carouselManSequence, java.lang.String carouselShowSequence, java.lang.String carouselClickSequence, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 1) != 0 ? -1 : i17;
        carouselAutoSequence = (i18 & 2) != 0 ? "" : carouselAutoSequence;
        carouselManSequence = (i18 & 4) != 0 ? "" : carouselManSequence;
        carouselShowSequence = (i18 & 8) != 0 ? "" : carouselShowSequence;
        carouselClickSequence = (i18 & 16) != 0 ? "" : carouselClickSequence;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(carouselAutoSequence, "carouselAutoSequence");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(carouselManSequence, "carouselManSequence");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(carouselShowSequence, "carouselShowSequence");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(carouselClickSequence, "carouselClickSequence");
        this.f443037a = i17;
        this.f443038b = carouselAutoSequence;
        this.f443039c = carouselManSequence;
        this.f443040d = carouselShowSequence;
        this.f443041e = carouselClickSequence;
    }

    /* renamed from: equals */
    public boolean m159824xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc2.a)) {
            return false;
        }
        qc2.a aVar = (qc2.a) obj;
        return this.f443037a == aVar.f443037a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f443038b, aVar.f443038b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f443039c, aVar.f443039c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f443040d, aVar.f443040d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f443041e, aVar.f443041e);
    }

    /* renamed from: hashCode */
    public int m159825x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f443037a) * 31) + this.f443038b.hashCode()) * 31) + this.f443039c.hashCode()) * 31) + this.f443040d.hashCode()) * 31) + this.f443041e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m159826x9616526c() {
        return "(carouselIndex=" + this.f443037a + ", carouselAutoSequence=" + this.f443038b + ", carouselManSequence=" + this.f443039c + ", carouselShowSequence=" + this.f443040d + ", carouselClickSequence=" + this.f443041e + ')';
    }
}
