package e60;

/* loaded from: classes11.dex */
public final class t0 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f331266d;

    /* renamed from: e, reason: collision with root package name */
    public final int f331267e;

    /* renamed from: f, reason: collision with root package name */
    public final int f331268f;

    /* renamed from: g, reason: collision with root package name */
    public final int f331269g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f331270h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f331271i;

    /* renamed from: m, reason: collision with root package name */
    public final e60.u0 f331272m;

    public t0(java.lang.String cdnTaskName, int i17, int i18, int i19, boolean z17, boolean z18, e60.u0 enterRect, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        cdnTaskName = (i27 & 1) != 0 ? "task_default" : cdnTaskName;
        i17 = (i27 & 2) != 0 ? 1 : i17;
        i18 = (i27 & 4) != 0 ? 0 : i18;
        i19 = (i27 & 8) != 0 ? 0 : i19;
        z17 = (i27 & 16) != 0 ? false : z17;
        z18 = (i27 & 32) != 0 ? false : z18;
        enterRect = (i27 & 64) != 0 ? new e60.u0(0, 0, 0, 0) : enterRect;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdnTaskName, "cdnTaskName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterRect, "enterRect");
        this.f331266d = cdnTaskName;
        this.f331267e = i17;
        this.f331268f = i18;
        this.f331269g = i19;
        this.f331270h = z17;
        this.f331271i = z18;
        this.f331272m = enterRect;
    }

    /* renamed from: equals */
    public boolean m127051xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e60.t0)) {
            return false;
        }
        e60.t0 t0Var = (e60.t0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331266d, t0Var.f331266d) && this.f331267e == t0Var.f331267e && this.f331268f == t0Var.f331268f && this.f331269g == t0Var.f331269g && this.f331270h == t0Var.f331270h && this.f331271i == t0Var.f331271i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f331272m, t0Var.f331272m);
    }

    /* renamed from: hashCode */
    public int m127052x8cdac1b() {
        return (((((((((((this.f331266d.hashCode() * 31) + java.lang.Integer.hashCode(this.f331267e)) * 31) + java.lang.Integer.hashCode(this.f331268f)) * 31) + java.lang.Integer.hashCode(this.f331269g)) * 31) + java.lang.Boolean.hashCode(this.f331270h)) * 31) + java.lang.Boolean.hashCode(this.f331271i)) * 31) + this.f331272m.m127055x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m127053x9616526c() {
        return "GalleryConfig(cdnTaskName=" + this.f331266d + ", cdnPriority=" + this.f331267e + ", mediaAttachType=" + this.f331268f + ", enterIndex=" + this.f331269g + ", needTranslate=" + this.f331270h + ", needForwardSns=" + this.f331271i + ", enterRect=" + this.f331272m + ')';
    }
}
