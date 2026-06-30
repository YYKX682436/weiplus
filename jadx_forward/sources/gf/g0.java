package gf;

/* loaded from: classes7.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f352596a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f352597b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f352598c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f352599d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f352600e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f352601f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f352602g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f352603h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f352604i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f352605j;

    /* renamed from: k, reason: collision with root package name */
    public final gf.e0 f352606k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.p2936x80def495.jni.InterfaceC25593x90f37129 f352607l;

    public g0(int i17, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, boolean z38, boolean z39, gf.e0 isAccessibilityEnabled, com.p314xaae8f345.p2936x80def495.jni.InterfaceC25593x90f37129 interfaceC25593x90f37129) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isAccessibilityEnabled, "isAccessibilityEnabled");
        this.f352596a = i17;
        this.f352597b = z17;
        this.f352598c = z18;
        this.f352599d = z19;
        this.f352600e = z27;
        this.f352601f = z28;
        this.f352602g = z29;
        this.f352603h = z37;
        this.f352604i = z38;
        this.f352605j = z39;
        this.f352606k = isAccessibilityEnabled;
        this.f352607l = interfaceC25593x90f37129;
    }

    /* renamed from: equals */
    public boolean m131403xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf.g0)) {
            return false;
        }
        gf.g0 g0Var = (gf.g0) obj;
        return this.f352596a == g0Var.f352596a && this.f352597b == g0Var.f352597b && this.f352598c == g0Var.f352598c && this.f352599d == g0Var.f352599d && this.f352600e == g0Var.f352600e && this.f352601f == g0Var.f352601f && this.f352602g == g0Var.f352602g && this.f352603h == g0Var.f352603h && this.f352604i == g0Var.f352604i && this.f352605j == g0Var.f352605j && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352606k, g0Var.f352606k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352607l, g0Var.f352607l);
    }

    /* renamed from: hashCode */
    public int m131404x8cdac1b() {
        int hashCode = ((((((((((((((((((((java.lang.Integer.hashCode(this.f352596a) * 31) + java.lang.Boolean.hashCode(this.f352597b)) * 31) + java.lang.Boolean.hashCode(this.f352598c)) * 31) + java.lang.Boolean.hashCode(this.f352599d)) * 31) + java.lang.Boolean.hashCode(this.f352600e)) * 31) + java.lang.Boolean.hashCode(this.f352601f)) * 31) + java.lang.Boolean.hashCode(this.f352602g)) * 31) + java.lang.Boolean.hashCode(this.f352603h)) * 31) + java.lang.Boolean.hashCode(this.f352604i)) * 31) + java.lang.Boolean.hashCode(this.f352605j)) * 31) + this.f352606k.hashCode()) * 31;
        com.p314xaae8f345.p2936x80def495.jni.InterfaceC25593x90f37129 interfaceC25593x90f37129 = this.f352607l;
        return hashCode + (interfaceC25593x90f37129 == null ? 0 : interfaceC25593x90f37129.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m131405x9616526c() {
        return "Settings(renderBackend=" + this.f352596a + ", shouldUseChromiumCronet=" + this.f352597b + ", useJavaTimer=" + this.f352598c + ", enableNewImage=" + this.f352599d + ", enableSVGImage=" + this.f352600e + ", setupFlutterLogDelegate=" + this.f352601f + ", enableReport=" + this.f352602g + ", enableKeyboardDuplicateEventFilter=" + this.f352603h + ", delayDispatchSkylineGlobalReady=" + this.f352604i + ", delaySkylineWindowInit=" + this.f352605j + ", isAccessibilityEnabled=" + this.f352606k + ", skylineExperiment=" + this.f352607l + ')';
    }
}
