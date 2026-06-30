package rw1;

/* loaded from: classes14.dex */
public final class b extends hw1.a {

    /* renamed from: a, reason: collision with root package name */
    public final qw1.a f482117a;

    /* renamed from: b, reason: collision with root package name */
    public final pw1.g f482118b;

    /* renamed from: c, reason: collision with root package name */
    public final qw1.e f482119c;

    public b(qw1.a data, pw1.g renderInfo, qw1.e yuvTextureGroupWrapper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderInfo, "renderInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yuvTextureGroupWrapper, "yuvTextureGroupWrapper");
        this.f482117a = data;
        this.f482118b = renderInfo;
        this.f482119c = yuvTextureGroupWrapper;
    }

    /* renamed from: equals */
    public boolean m163237xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw1.b)) {
            return false;
        }
        rw1.b bVar = (rw1.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482117a, bVar.f482117a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482118b, bVar.f482118b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f482119c, bVar.f482119c);
    }

    /* renamed from: hashCode */
    public int m163238x8cdac1b() {
        return (((this.f482117a.hashCode() * 31) + this.f482118b.m159080x8cdac1b()) * 31) + this.f482119c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163239x9616526c() {
        return "GLUploadMTRTaskInput(data=" + this.f482117a + ", renderInfo=" + this.f482118b + ", yuvTextureGroupWrapper=" + this.f482119c + ')';
    }
}
