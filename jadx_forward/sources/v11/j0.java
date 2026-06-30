package v11;

/* loaded from: classes11.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f513949a;

    /* renamed from: b, reason: collision with root package name */
    public final int f513950b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f513951c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f513952d;

    /* renamed from: e, reason: collision with root package name */
    public final float f513953e;

    /* renamed from: f, reason: collision with root package name */
    public final int f513954f;

    /* renamed from: g, reason: collision with root package name */
    public final int f513955g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f513956h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f513957i;

    public j0(float f17, int i17, boolean z17, boolean z18, float f18, int i18, int i19, boolean z19, java.lang.Integer num) {
        this.f513949a = f17;
        this.f513950b = i17;
        this.f513951c = z17;
        this.f513952d = z18;
        this.f513953e = f18;
        this.f513954f = i18;
        this.f513955g = i19;
        this.f513956h = z19;
        this.f513957i = num;
    }

    public static v11.j0 a(v11.j0 j0Var, float f17, int i17, boolean z17, boolean z18, float f18, int i18, int i19, boolean z19, java.lang.Integer num, int i27, java.lang.Object obj) {
        float f19 = (i27 & 1) != 0 ? j0Var.f513949a : f17;
        int i28 = (i27 & 2) != 0 ? j0Var.f513950b : i17;
        boolean z27 = (i27 & 4) != 0 ? j0Var.f513951c : z17;
        boolean z28 = (i27 & 8) != 0 ? j0Var.f513952d : z18;
        float f27 = (i27 & 16) != 0 ? j0Var.f513953e : f18;
        int i29 = (i27 & 32) != 0 ? j0Var.f513954f : i18;
        int i37 = (i27 & 64) != 0 ? j0Var.f513955g : i19;
        boolean z29 = (i27 & 128) != 0 ? j0Var.f513956h : z19;
        java.lang.Integer num2 = (i27 & 256) != 0 ? j0Var.f513957i : num;
        j0Var.getClass();
        return new v11.j0(f19, i28, z27, z28, f27, i29, i37, z29, num2);
    }

    /* renamed from: equals */
    public boolean m170908xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.j0)) {
            return false;
        }
        v11.j0 j0Var = (v11.j0) obj;
        return java.lang.Float.compare(this.f513949a, j0Var.f513949a) == 0 && this.f513950b == j0Var.f513950b && this.f513951c == j0Var.f513951c && this.f513952d == j0Var.f513952d && java.lang.Float.compare(this.f513953e, j0Var.f513953e) == 0 && this.f513954f == j0Var.f513954f && this.f513955g == j0Var.f513955g && this.f513956h == j0Var.f513956h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f513957i, j0Var.f513957i);
    }

    /* renamed from: hashCode */
    public int m170909x8cdac1b() {
        int hashCode = ((((((((((((((java.lang.Float.hashCode(this.f513949a) * 31) + java.lang.Integer.hashCode(this.f513950b)) * 31) + java.lang.Boolean.hashCode(this.f513951c)) * 31) + java.lang.Boolean.hashCode(this.f513952d)) * 31) + java.lang.Float.hashCode(this.f513953e)) * 31) + java.lang.Integer.hashCode(this.f513954f)) * 31) + java.lang.Integer.hashCode(this.f513955g)) * 31) + java.lang.Boolean.hashCode(this.f513956h)) * 31;
        java.lang.Integer num = this.f513957i;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m170910x9616526c() {
        return "NativeMarkdownTextViewConfig(textSizeDp=" + this.f513949a + ", textColor=" + this.f513950b + ", isBold=" + this.f513951c + ", isMonospace=" + this.f513952d + ", lineSpacingMultiplier=" + this.f513953e + ", paddingHorizontalPx=" + this.f513954f + ", paddingVerticalPx=" + this.f513955g + ", enableLinkMovement=" + this.f513956h + ", highlightColor=" + this.f513957i + ')';
    }

    public /* synthetic */ j0(float f17, int i17, boolean z17, boolean z18, float f18, int i18, int i19, boolean z19, java.lang.Integer num, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(f17, i17, (i27 & 4) != 0 ? false : z17, (i27 & 8) != 0 ? false : z18, (i27 & 16) != 0 ? 1.0f : f18, (i27 & 32) != 0 ? 0 : i18, (i27 & 64) != 0 ? 0 : i19, (i27 & 128) != 0 ? false : z19, (i27 & 256) != 0 ? null : num);
    }
}
