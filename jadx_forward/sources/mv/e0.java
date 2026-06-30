package mv;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f413027a;

    /* renamed from: b, reason: collision with root package name */
    public final mv.h0 f413028b;

    /* renamed from: c, reason: collision with root package name */
    public final mv.f0 f413029c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f413030d;

    /* renamed from: e, reason: collision with root package name */
    public int f413031e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f413032f;

    /* renamed from: g, reason: collision with root package name */
    public final long f413033g;

    public e0(long j17, mv.h0 taskType, mv.f0 status, java.lang.String display, int i17, java.lang.String progressHint, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskType, "taskType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(display, "display");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(progressHint, "progressHint");
        this.f413027a = j17;
        this.f413028b = taskType;
        this.f413029c = status;
        this.f413030d = display;
        this.f413031e = i17;
        this.f413032f = progressHint;
        this.f413033g = j18;
    }

    /* renamed from: equals */
    public boolean m148419xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv.e0)) {
            return false;
        }
        mv.e0 e0Var = (mv.e0) obj;
        return this.f413027a == e0Var.f413027a && this.f413028b == e0Var.f413028b && this.f413029c == e0Var.f413029c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413030d, e0Var.f413030d) && this.f413031e == e0Var.f413031e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413032f, e0Var.f413032f) && this.f413033g == e0Var.f413033g;
    }

    /* renamed from: hashCode */
    public int m148420x8cdac1b() {
        return (((((((((((java.lang.Long.hashCode(this.f413027a) * 31) + this.f413028b.hashCode()) * 31) + this.f413029c.hashCode()) * 31) + this.f413030d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f413031e)) * 31) + this.f413032f.hashCode()) * 31) + java.lang.Long.hashCode(this.f413033g);
    }

    /* renamed from: toString */
    public java.lang.String m148421x9616526c() {
        return "RoamSettingsDisplayInfo(pkgId=" + this.f413027a + ", taskType=" + this.f413028b + ", status=" + this.f413029c + ", display=" + this.f413030d + ", progress=" + this.f413031e + ", progressHint=" + this.f413032f + ", msgTime=" + this.f413033g + ')';
    }
}
