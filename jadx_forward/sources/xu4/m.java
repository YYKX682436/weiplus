package xu4;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f538825a;

    /* renamed from: b, reason: collision with root package name */
    public final int f538826b;

    /* renamed from: c, reason: collision with root package name */
    public final int f538827c;

    /* renamed from: d, reason: collision with root package name */
    public final int f538828d;

    /* renamed from: e, reason: collision with root package name */
    public final int f538829e;

    public m(java.lang.String content, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f538825a = content;
        this.f538826b = i17;
        this.f538827c = i18;
        this.f538828d = i19;
        this.f538829e = i27;
    }

    /* renamed from: equals */
    public boolean m175994xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu4.m)) {
            return false;
        }
        xu4.m mVar = (xu4.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f538825a, mVar.f538825a) && this.f538826b == mVar.f538826b && this.f538827c == mVar.f538827c && this.f538828d == mVar.f538828d && this.f538829e == mVar.f538829e;
    }

    /* renamed from: hashCode */
    public int m175995x8cdac1b() {
        return (((((((this.f538825a.hashCode() * 31) + java.lang.Integer.hashCode(this.f538826b)) * 31) + java.lang.Integer.hashCode(this.f538827c)) * 31) + java.lang.Integer.hashCode(this.f538828d)) * 31) + java.lang.Integer.hashCode(this.f538829e);
    }

    /* renamed from: toString */
    public java.lang.String m175996x9616526c() {
        return "WeTypeEmojiSearchTipsData(content=" + this.f538825a + ", interval=" + this.f538826b + ", maxCount=" + this.f538827c + ", aliveTime=" + this.f538828d + ", exitCondition=" + this.f538829e + ')';
    }
}
