package nu0;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f421636a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f421637b;

    public u(java.lang.String imagePath, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePath, "imagePath");
        this.f421636a = imagePath;
        this.f421637b = z17;
    }

    /* renamed from: equals */
    public boolean m149977xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu0.u)) {
            return false;
        }
        nu0.u uVar = (nu0.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f421636a, uVar.f421636a) && this.f421637b == uVar.f421637b;
    }

    /* renamed from: hashCode */
    public int m149978x8cdac1b() {
        return (this.f421636a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f421637b);
    }

    /* renamed from: toString */
    public java.lang.String m149979x9616526c() {
        return "ImageSceneData(imagePath=" + this.f421636a + ", isModified=" + this.f421637b + ')';
    }
}
