package yw0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ou0.b f548089a;

    /* renamed from: b, reason: collision with root package name */
    public final float f548090b;

    public h(ou0.b flag, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(flag, "flag");
        this.f548089a = flag;
        this.f548090b = f17;
    }

    /* renamed from: equals */
    public boolean m177911xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw0.h)) {
            return false;
        }
        yw0.h hVar = (yw0.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f548089a, hVar.f548089a) && java.lang.Float.compare(this.f548090b, hVar.f548090b) == 0;
    }

    /* renamed from: hashCode */
    public int m177912x8cdac1b() {
        return (this.f548089a.hashCode() * 31) + java.lang.Float.hashCode(this.f548090b);
    }

    /* renamed from: toString */
    public java.lang.String m177913x9616526c() {
        return "SnapFlag(flag=" + this.f548089a + ", snapValue=" + this.f548090b + ')';
    }
}
