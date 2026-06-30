package kn0;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f391062a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f391063b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f391064c;

    /* renamed from: d, reason: collision with root package name */
    public final int f391065d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f391066e;

    public f(boolean z17, boolean z18, boolean z19, int i17, boolean z27, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 1) != 0 ? false : z17;
        z18 = (i18 & 2) != 0 ? true : z18;
        z19 = (i18 & 4) != 0 ? false : z19;
        i17 = (i18 & 8) != 0 ? 1080 : i17;
        z27 = (i18 & 16) != 0 ? true : z27;
        this.f391062a = z17;
        this.f391063b = z18;
        this.f391064c = z19;
        this.f391065d = i17;
        this.f391066e = z27;
    }

    /* renamed from: equals */
    public boolean m143736xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn0.f)) {
            return false;
        }
        kn0.f fVar = (kn0.f) obj;
        return this.f391062a == fVar.f391062a && this.f391063b == fVar.f391063b && this.f391064c == fVar.f391064c && this.f391065d == fVar.f391065d && this.f391066e == fVar.f391066e;
    }

    /* renamed from: hashCode */
    public int m143737x8cdac1b() {
        return (((((((java.lang.Boolean.hashCode(this.f391062a) * 31) + java.lang.Boolean.hashCode(this.f391063b)) * 31) + java.lang.Boolean.hashCode(this.f391064c)) * 31) + java.lang.Integer.hashCode(this.f391065d)) * 31) + java.lang.Boolean.hashCode(this.f391066e);
    }

    /* renamed from: toString */
    public java.lang.String m143738x9616526c() {
        return "LiveRenderModel(useCamera2=" + this.f391062a + ", defaultFrontCamera=" + this.f391063b + ", useCPUCrop=" + this.f391064c + ", resolution=" + this.f391065d + ", frontMirror=" + this.f391066e + ')';
    }
}
