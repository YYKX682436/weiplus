package p05;

/* loaded from: classes10.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f432214a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f432215b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f432216c;

    /* renamed from: d, reason: collision with root package name */
    public int f432217d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f432218e;

    /* renamed from: f, reason: collision with root package name */
    public long f432219f;

    public s1(long j17, java.lang.String animationId, java.lang.String path, int i17, boolean z17, long j18, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j18 = (i18 & 32) != 0 ? java.lang.System.currentTimeMillis() : j18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationId, "animationId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f432214a = j17;
        this.f432215b = animationId;
        this.f432216c = path;
        this.f432217d = i17;
        this.f432218e = z17;
        this.f432219f = j18;
    }

    /* renamed from: equals */
    public boolean m157609xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p05.s1)) {
            return false;
        }
        p05.s1 s1Var = (p05.s1) obj;
        return this.f432214a == s1Var.f432214a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f432215b, s1Var.f432215b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f432216c, s1Var.f432216c) && this.f432217d == s1Var.f432217d && this.f432218e == s1Var.f432218e && this.f432219f == s1Var.f432219f;
    }

    /* renamed from: hashCode */
    public int m157610x8cdac1b() {
        return (((((((((java.lang.Long.hashCode(this.f432214a) * 31) + this.f432215b.hashCode()) * 31) + this.f432216c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f432217d)) * 31) + java.lang.Boolean.hashCode(this.f432218e)) * 31) + java.lang.Long.hashCode(this.f432219f);
    }

    /* renamed from: toString */
    public java.lang.String m157611x9616526c() {
        return "RunningAnimationInfo(glPtr=" + this.f432214a + ", animationId=" + this.f432215b + ", path=" + this.f432216c + ", animationStage=" + this.f432217d + ", isSimplicity=" + this.f432218e + ", lastExecuteCmdTime=" + this.f432219f + ')';
    }
}
