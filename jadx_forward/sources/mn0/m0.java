package mn0;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f411318a;

    /* renamed from: b, reason: collision with root package name */
    public int f411319b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f411320c;

    /* renamed from: d, reason: collision with root package name */
    public int f411321d;

    public m0(int i17, int i18, java.lang.String errorUrl, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorUrl, "errorUrl");
        this.f411318a = i17;
        this.f411319b = i18;
        this.f411320c = errorUrl;
        this.f411321d = i19;
    }

    /* renamed from: equals */
    public boolean m148068xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn0.m0)) {
            return false;
        }
        mn0.m0 m0Var = (mn0.m0) obj;
        return this.f411318a == m0Var.f411318a && this.f411319b == m0Var.f411319b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f411320c, m0Var.f411320c) && this.f411321d == m0Var.f411321d;
    }

    /* renamed from: hashCode */
    public int m148069x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f411318a) * 31) + java.lang.Integer.hashCode(this.f411319b)) * 31) + this.f411320c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f411321d);
    }

    /* renamed from: toString */
    public java.lang.String m148070x9616526c() {
        return "PlayerInfoEvent(eventCode=" + this.f411318a + ", httpCode=" + this.f411319b + ", errorUrl=" + this.f411320c + ", curQualityCfg=" + this.f411321d + ')';
    }
}
