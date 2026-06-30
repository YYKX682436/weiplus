package k23;

/* loaded from: classes12.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f385077a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup.LayoutParams f385078b;

    /* renamed from: c, reason: collision with root package name */
    public final k23.v2 f385079c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f385080d;

    /* renamed from: e, reason: collision with root package name */
    public final k23.w0 f385081e;

    /* renamed from: f, reason: collision with root package name */
    public final int f385082f;

    /* renamed from: g, reason: collision with root package name */
    public final int f385083g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f385084h;

    /* renamed from: i, reason: collision with root package name */
    public final k23.u2 f385085i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Integer[] f385086j;

    /* renamed from: k, reason: collision with root package name */
    public final k23.b0 f385087k;

    /* renamed from: l, reason: collision with root package name */
    public float f385088l;

    static {
        new k23.c0(null);
    }

    public d0(android.view.ViewGroup viewGroup, android.view.ViewGroup.LayoutParams layoutParams, k23.v2 v2Var, android.view.ViewGroup viewGroup2, k23.w0 w0Var, int i17, int i18, java.lang.String str, k23.u2 u2Var, java.lang.Integer[] numArr, k23.b0 b0Var, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        java.lang.Integer[] activityBarColor;
        android.view.ViewGroup viewGroup3 = (i19 & 8) != 0 ? null : viewGroup2;
        k23.w0 floatingVoiceScene = (i19 & 16) != 0 ? k23.w0.f385272i : w0Var;
        int i27 = (i19 & 32) != 0 ? 6 : i17;
        int i28 = (i19 & 64) != 0 ? 3 : i18;
        java.lang.String startButtonTitle = (i19 & 128) != 0 ? "" : str;
        k23.u2 specificStartBtnStyle = (i19 & 256) != 0 ? k23.u2.f385234d : u2Var;
        if ((i19 & 512) != 0) {
            int d17 = i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f560691al2);
            activityBarColor = new java.lang.Integer[2];
            for (int i29 = 0; i29 < 2; i29++) {
                activityBarColor[i29] = java.lang.Integer.valueOf(d17);
            }
        } else {
            activityBarColor = numArr;
        }
        k23.b0 modeSwitchStyle = (i19 & 1024) != 0 ? k23.b0.f385052f : b0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(floatingVoiceScene, "floatingVoiceScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(startButtonTitle, "startButtonTitle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(specificStartBtnStyle, "specificStartBtnStyle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityBarColor, "activityBarColor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modeSwitchStyle, "modeSwitchStyle");
        this.f385077a = viewGroup;
        this.f385078b = layoutParams;
        this.f385079c = v2Var;
        this.f385080d = viewGroup3;
        this.f385081e = floatingVoiceScene;
        this.f385082f = i27;
        this.f385083g = i28;
        this.f385084h = startButtonTitle;
        this.f385085i = specificStartBtnStyle;
        this.f385086j = activityBarColor;
        this.f385087k = modeSwitchStyle;
        this.f385088l = 0.6f;
    }

    /* renamed from: equals */
    public boolean m141791xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k23.d0)) {
            return false;
        }
        k23.d0 d0Var = (k23.d0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385077a, d0Var.f385077a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385078b, d0Var.f385078b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385079c, d0Var.f385079c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385080d, d0Var.f385080d) && this.f385081e == d0Var.f385081e && this.f385082f == d0Var.f385082f && this.f385083g == d0Var.f385083g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385084h, d0Var.f385084h) && this.f385085i == d0Var.f385085i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385086j, d0Var.f385086j) && this.f385087k == d0Var.f385087k;
    }

    /* renamed from: hashCode */
    public int m141792x8cdac1b() {
        android.view.ViewGroup viewGroup = this.f385077a;
        int hashCode = (viewGroup == null ? 0 : viewGroup.hashCode()) * 31;
        android.view.ViewGroup.LayoutParams layoutParams = this.f385078b;
        int hashCode2 = (hashCode + (layoutParams == null ? 0 : layoutParams.hashCode())) * 31;
        k23.v2 v2Var = this.f385079c;
        int hashCode3 = (hashCode2 + (v2Var == null ? 0 : v2Var.hashCode())) * 31;
        android.view.ViewGroup viewGroup2 = this.f385080d;
        return ((((((((((((((hashCode3 + (viewGroup2 != null ? viewGroup2.hashCode() : 0)) * 31) + this.f385081e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f385082f)) * 31) + java.lang.Integer.hashCode(this.f385083g)) * 31) + this.f385084h.hashCode()) * 31) + this.f385085i.hashCode()) * 31) + java.util.Arrays.hashCode(this.f385086j)) * 31) + this.f385087k.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m141793x9616526c() {
        return "FTSFloatingVoiceInputParams(panelViewGroup=" + this.f385077a + ", panelLayoutParams=" + this.f385078b + ", listener=" + this.f385079c + ", btnContainerView=" + this.f385080d + ", floatingVoiceScene=" + this.f385081e + ", sceneType=" + this.f385082f + ", searchScene=" + this.f385083g + ", startButtonTitle=" + this.f385084h + ", specificStartBtnStyle=" + this.f385085i + ", activityBarColor=" + java.util.Arrays.toString(this.f385086j) + ", modeSwitchStyle=" + this.f385087k + ')';
    }
}
