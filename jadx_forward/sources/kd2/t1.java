package kd2;

/* loaded from: classes10.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f388366a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f388367b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f388368c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f388369d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f388370e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f388371f;

    public t1(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 1) != 0 ? true : z17;
        z18 = (i17 & 2) != 0 ? true : z18;
        z19 = (i17 & 4) != 0 ? true : z19;
        z27 = (i17 & 8) != 0 ? true : z27;
        z28 = (i17 & 16) != 0 ? true : z28;
        z29 = (i17 & 32) != 0 ? true : z29;
        this.f388366a = z17;
        this.f388367b = z18;
        this.f388368c = z19;
        this.f388369d = z27;
        this.f388370e = z28;
        this.f388371f = z29;
    }

    /* renamed from: equals */
    public boolean m142500xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd2.t1)) {
            return false;
        }
        kd2.t1 t1Var = (kd2.t1) obj;
        return this.f388366a == t1Var.f388366a && this.f388367b == t1Var.f388367b && this.f388368c == t1Var.f388368c && this.f388369d == t1Var.f388369d && this.f388370e == t1Var.f388370e && this.f388371f == t1Var.f388371f;
    }

    /* renamed from: hashCode */
    public int m142501x8cdac1b() {
        return (((((((((java.lang.Boolean.hashCode(this.f388366a) * 31) + java.lang.Boolean.hashCode(this.f388367b)) * 31) + java.lang.Boolean.hashCode(this.f388368c)) * 31) + java.lang.Boolean.hashCode(this.f388369d)) * 31) + java.lang.Boolean.hashCode(this.f388370e)) * 31) + java.lang.Boolean.hashCode(this.f388371f);
    }

    /* renamed from: toString */
    public java.lang.String m142502x9616526c() {
        return "LiveMinimizeState(isPlaying=" + this.f388366a + ", enablePlayButton=" + this.f388367b + ", showPlayButton=" + this.f388368c + ", showDeleteButton=" + this.f388369d + ", isShowAudioAnimation=" + this.f388370e + ", isShowPlayModeButton=" + this.f388371f + ')';
    }
}
