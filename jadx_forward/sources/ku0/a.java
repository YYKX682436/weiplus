package ku0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final zu0.a f393593a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f393594b;

    public a(zu0.a media, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(media, "media");
        this.f393593a = media;
        this.f393594b = z17;
    }

    /* renamed from: equals */
    public boolean m144390xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku0.a)) {
            return false;
        }
        ku0.a aVar = (ku0.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f393593a, aVar.f393593a) && this.f393594b == aVar.f393594b;
    }

    /* renamed from: hashCode */
    public int m144391x8cdac1b() {
        return (this.f393593a.m179473x8cdac1b() * 31) + java.lang.Boolean.hashCode(this.f393594b);
    }

    /* renamed from: toString */
    public java.lang.String m144392x9616526c() {
        return "ImageData(media=" + this.f393593a + ", isSelected=" + this.f393594b + ')';
    }
}
