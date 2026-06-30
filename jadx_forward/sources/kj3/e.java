package kj3;

/* loaded from: classes14.dex */
public final class e extends ej3.a {

    /* renamed from: a, reason: collision with root package name */
    public final mj3.g f389980a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.Size f389981b;

    /* renamed from: c, reason: collision with root package name */
    public final int f389982c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f389983d;

    public e(mj3.g renderInfo, android.util.Size drawSize, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderInfo, "renderInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawSize, "drawSize");
        this.f389980a = renderInfo;
        this.f389981b = drawSize;
        this.f389982c = i17;
        this.f389983d = z17;
    }

    /* renamed from: equals */
    public boolean m143580xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj3.e)) {
            return false;
        }
        kj3.e eVar = (kj3.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f389980a, eVar.f389980a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f389981b, eVar.f389981b) && this.f389982c == eVar.f389982c && this.f389983d == eVar.f389983d;
    }

    /* renamed from: hashCode */
    public int m143581x8cdac1b() {
        return (((((this.f389980a.m147389x8cdac1b() * 31) + this.f389981b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f389982c)) * 31) + java.lang.Boolean.hashCode(this.f389983d);
    }

    /* renamed from: toString */
    public java.lang.String m143582x9616526c() {
        return "GLTextureRenderMTRTaskInput(renderInfo=" + this.f389980a + ", drawSize=" + this.f389981b + ", texId=" + this.f389982c + ", isOes=" + this.f389983d + ')';
    }
}
