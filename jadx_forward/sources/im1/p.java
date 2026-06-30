package im1;

/* loaded from: classes10.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final yf.s f373735a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f373736b;

    public p(yf.s type, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f373735a = type;
        this.f373736b = path;
    }

    /* renamed from: equals */
    public boolean m136755xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im1.p)) {
            return false;
        }
        im1.p pVar = (im1.p) obj;
        return this.f373735a == pVar.f373735a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373736b, pVar.f373736b);
    }

    /* renamed from: hashCode */
    public int m136756x8cdac1b() {
        return (this.f373735a.hashCode() * 31) + this.f373736b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m136757x9616526c() {
        return "StickerApplyParams(type=" + this.f373735a + ", path=" + this.f373736b + ')';
    }
}
