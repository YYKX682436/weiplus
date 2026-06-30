package oj3;

/* loaded from: classes14.dex */
public final class b extends ej3.a {

    /* renamed from: a, reason: collision with root package name */
    public final nj3.a f427335a;

    /* renamed from: b, reason: collision with root package name */
    public final mj3.g f427336b;

    /* renamed from: c, reason: collision with root package name */
    public final nj3.e f427337c;

    public b(nj3.a data, mj3.g renderInfo, nj3.e yuvTextureGroupWrapper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderInfo, "renderInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yuvTextureGroupWrapper, "yuvTextureGroupWrapper");
        this.f427335a = data;
        this.f427336b = renderInfo;
        this.f427337c = yuvTextureGroupWrapper;
    }

    /* renamed from: equals */
    public boolean m151597xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj3.b)) {
            return false;
        }
        oj3.b bVar = (oj3.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427335a, bVar.f427335a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427336b, bVar.f427336b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427337c, bVar.f427337c);
    }

    /* renamed from: hashCode */
    public int m151598x8cdac1b() {
        return (((this.f427335a.hashCode() * 31) + this.f427336b.m147389x8cdac1b()) * 31) + this.f427337c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m151599x9616526c() {
        return "GLUploadMTRTaskInput(data=" + this.f427335a + ", renderInfo=" + this.f427336b + ", yuvTextureGroupWrapper=" + this.f427337c + ')';
    }
}
