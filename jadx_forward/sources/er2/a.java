package er2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f337541a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f337542b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f337543c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f337544d;

    /* renamed from: e, reason: collision with root package name */
    public final int f337545e;

    /* renamed from: f, reason: collision with root package name */
    public final int f337546f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.u80 f337547g;

    /* renamed from: h, reason: collision with root package name */
    public final cr2.z f337548h;

    /* renamed from: i, reason: collision with root package name */
    public final int f337549i;

    /* renamed from: j, reason: collision with root package name */
    public final int f337550j;

    public a(int i17, java.lang.String themeId, java.lang.String themeTag, java.lang.String themeTagText, int i18, int i19, r45.u80 containerContext, cr2.z outSideHook, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeId, "themeId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeTag, "themeTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeTagText, "themeTagText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerContext, "containerContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outSideHook, "outSideHook");
        this.f337541a = i17;
        this.f337542b = themeId;
        this.f337543c = themeTag;
        this.f337544d = themeTagText;
        this.f337545e = i18;
        this.f337546f = i19;
        this.f337547g = containerContext;
        this.f337548h = outSideHook;
        this.f337549i = i27;
        this.f337550j = i28;
    }

    /* renamed from: equals */
    public boolean m128000xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er2.a)) {
            return false;
        }
        er2.a aVar = (er2.a) obj;
        return this.f337541a == aVar.f337541a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f337542b, aVar.f337542b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f337543c, aVar.f337543c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f337544d, aVar.f337544d) && this.f337545e == aVar.f337545e && this.f337546f == aVar.f337546f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f337547g, aVar.f337547g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f337548h, aVar.f337548h) && this.f337549i == aVar.f337549i && this.f337550j == aVar.f337550j;
    }

    /* renamed from: hashCode */
    public int m128001x8cdac1b() {
        return (((((((((((((((((java.lang.Integer.hashCode(this.f337541a) * 31) + this.f337542b.hashCode()) * 31) + this.f337543c.hashCode()) * 31) + this.f337544d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f337545e)) * 31) + java.lang.Integer.hashCode(this.f337546f)) * 31) + this.f337547g.hashCode()) * 31) + this.f337548h.hashCode()) * 31) + java.lang.Integer.hashCode(this.f337549i)) * 31) + java.lang.Integer.hashCode(this.f337550j);
    }

    /* renamed from: toString */
    public java.lang.String m128002x9616526c() {
        return "LiveThemeTagParams(pos=" + this.f337541a + ", themeId=" + this.f337542b + ", themeTag=" + this.f337543c + ", themeTagText=" + this.f337544d + ", containerType=" + this.f337545e + ", containerId=" + this.f337546f + ", containerContext=" + this.f337547g + ", outSideHook=" + this.f337548h + ", cardType=" + this.f337549i + ", playTogetherLiveType=" + this.f337550j + ')';
    }
}
