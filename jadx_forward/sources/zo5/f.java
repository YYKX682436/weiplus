package zo5;

/* loaded from: classes14.dex */
public final class f extends zo5.b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f556419a;

    /* renamed from: b, reason: collision with root package name */
    public final int f556420b;

    /* renamed from: c, reason: collision with root package name */
    public final zo5.e f556421c;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.Size f556422d;

    public f(boolean z17, int i17, zo5.e renderInfo, android.util.Size drawSize) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderInfo, "renderInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawSize, "drawSize");
        this.f556419a = z17;
        this.f556420b = i17;
        this.f556421c = renderInfo;
        this.f556422d = drawSize;
    }

    /* renamed from: equals */
    public boolean m179264xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo5.f)) {
            return false;
        }
        zo5.f fVar = (zo5.f) obj;
        return this.f556419a == fVar.f556419a && this.f556420b == fVar.f556420b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f556421c, fVar.f556421c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f556422d, fVar.f556422d);
    }

    /* renamed from: hashCode */
    public int m179265x8cdac1b() {
        return (((((java.lang.Boolean.hashCode(this.f556419a) * 31) + java.lang.Integer.hashCode(this.f556420b)) * 31) + this.f556421c.m179262x8cdac1b()) * 31) + this.f556422d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179266x9616526c() {
        return "TextureRenderParams(isOes=" + this.f556419a + ", inputTextureId=" + this.f556420b + ", renderInfo=" + this.f556421c + ", drawSize=" + this.f556422d + ')';
    }
}
