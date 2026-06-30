package aq;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f94382a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f94383b;

    public d(java.lang.String header, java.util.ArrayList imageDataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageDataList, "imageDataList");
        this.f94382a = header;
        this.f94383b = imageDataList;
    }

    /* renamed from: equals */
    public boolean m8795xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq.d)) {
            return false;
        }
        aq.d dVar = (aq.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94382a, dVar.f94382a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f94383b, dVar.f94383b);
    }

    /* renamed from: hashCode */
    public int m8796x8cdac1b() {
        return (this.f94382a.hashCode() * 31) + this.f94383b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m8797x9616526c() {
        return "ImageDataListItem(header=" + this.f94382a + ", imageDataList=" + this.f94383b + ')';
    }
}
