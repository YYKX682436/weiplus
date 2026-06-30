package nw1;

/* loaded from: classes14.dex */
public final class e extends hw1.a {

    /* renamed from: a, reason: collision with root package name */
    public final pw1.g f422314a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.Size f422315b;

    /* renamed from: c, reason: collision with root package name */
    public final int f422316c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f422317d;

    public e(pw1.g renderInfo, android.util.Size drawSize, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderInfo, "renderInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawSize, "drawSize");
        this.f422314a = renderInfo;
        this.f422315b = drawSize;
        this.f422316c = i17;
        this.f422317d = z17;
    }

    /* renamed from: equals */
    public boolean m150179xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw1.e)) {
            return false;
        }
        nw1.e eVar = (nw1.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422314a, eVar.f422314a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f422315b, eVar.f422315b) && this.f422316c == eVar.f422316c && this.f422317d == eVar.f422317d;
    }

    /* renamed from: hashCode */
    public int m150180x8cdac1b() {
        return (((((this.f422314a.m159080x8cdac1b() * 31) + this.f422315b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f422316c)) * 31) + java.lang.Boolean.hashCode(this.f422317d);
    }

    /* renamed from: toString */
    public java.lang.String m150181x9616526c() {
        return "GLTextureRenderMTRTaskInput(renderInfo=" + this.f422314a + ", drawSize=" + this.f422315b + ", texId=" + this.f422316c + ", isOes=" + this.f422317d + ')';
    }
}
