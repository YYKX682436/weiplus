package jf5;

/* loaded from: classes3.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f381038a;

    /* renamed from: b, reason: collision with root package name */
    public final int f381039b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f381040c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f381041d;

    public s0(long j17, int i17, java.lang.String action, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        action = (i18 & 4) != 0 ? "" : action;
        z17 = (i18 & 8) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        this.f381038a = j17;
        this.f381039b = i17;
        this.f381040c = action;
        this.f381041d = z17;
    }

    /* renamed from: equals */
    public boolean m140863xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf5.s0)) {
            return false;
        }
        jf5.s0 s0Var = (jf5.s0) obj;
        return this.f381038a == s0Var.f381038a && this.f381039b == s0Var.f381039b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f381040c, s0Var.f381040c) && this.f381041d == s0Var.f381041d;
    }

    /* renamed from: hashCode */
    public int m140864x8cdac1b() {
        return (((((java.lang.Long.hashCode(this.f381038a) * 31) + java.lang.Integer.hashCode(this.f381039b)) * 31) + this.f381040c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f381041d);
    }

    /* renamed from: toString */
    public java.lang.String m140865x9616526c() {
        return "SelectionSessionState(startElapsedMs=" + this.f381038a + ", totalLenCp=" + this.f381039b + ", action=" + this.f381040c + ", reported=" + this.f381041d + ')';
    }
}
