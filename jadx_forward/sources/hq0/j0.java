package hq0;

/* loaded from: classes7.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f364545a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f364546b;

    /* renamed from: c, reason: collision with root package name */
    public int f364547c;

    /* renamed from: d, reason: collision with root package name */
    public int f364548d;

    /* renamed from: e, reason: collision with root package name */
    public int f364549e;

    /* renamed from: f, reason: collision with root package name */
    public int f364550f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f364551g;

    /* renamed from: h, reason: collision with root package name */
    public cf3.d f364552h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f364553i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f364554j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f364555k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f364556l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f364557m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f364558n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f364559o;

    public j0(int i17, java.lang.String str, int i18, int i19, int i27, int i28, android.view.View view, cf3.d dVar, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i37 = (i29 & 1) != 0 ? 0 : i17;
        java.lang.String frameSetId = (i29 & 2) != 0 ? "" : str;
        int i38 = (i29 & 4) != 0 ? 0 : i18;
        int i39 = (i29 & 8) != 0 ? 0 : i19;
        int i47 = (i29 & 16) != 0 ? 0 : i27;
        int i48 = (i29 & 32) != 0 ? 0 : i28;
        android.view.View view2 = (i29 & 64) != 0 ? null : view;
        cf3.d dVar2 = (i29 & 128) == 0 ? dVar : null;
        boolean z38 = (i29 & 256) != 0 ? false : z17;
        boolean z39 = (i29 & 512) != 0 ? false : z18;
        boolean z47 = (i29 & 1024) != 0 ? false : z19;
        boolean z48 = (i29 & 2048) != 0 ? false : z27;
        boolean z49 = (i29 & 4096) != 0 ? false : z28;
        boolean z57 = (i29 & 8192) != 0 ? false : z29;
        boolean z58 = (i29 & 16384) != 0 ? false : z37;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        this.f364545a = i37;
        this.f364546b = frameSetId;
        this.f364547c = i38;
        this.f364548d = i39;
        this.f364549e = i47;
        this.f364550f = i48;
        this.f364551g = view2;
        this.f364552h = dVar2;
        this.f364553i = z38;
        this.f364554j = z39;
        this.f364555k = z47;
        this.f364556l = z48;
        this.f364557m = z49;
        this.f364558n = z57;
        this.f364559o = z58;
    }

    public final void a() {
        android.view.View view = this.f364551g;
        if (view == null || view.getLayoutParams() == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = this.f364549e;
        marginLayoutParams.height = this.f364550f;
        marginLayoutParams.topMargin = this.f364548d;
        marginLayoutParams.leftMargin = this.f364547c;
        view.setLayoutParams(marginLayoutParams);
    }

    public final java.lang.String b() {
        java.lang.String frameSetId = this.f364546b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
        return frameSetId + '-' + this.f364545a;
    }

    /* renamed from: equals */
    public boolean m133877xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq0.j0)) {
            return false;
        }
        hq0.j0 j0Var = (hq0.j0) obj;
        return this.f364545a == j0Var.f364545a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f364546b, j0Var.f364546b) && this.f364547c == j0Var.f364547c && this.f364548d == j0Var.f364548d && this.f364549e == j0Var.f364549e && this.f364550f == j0Var.f364550f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f364551g, j0Var.f364551g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f364552h, j0Var.f364552h) && this.f364553i == j0Var.f364553i && this.f364554j == j0Var.f364554j && this.f364555k == j0Var.f364555k && this.f364556l == j0Var.f364556l && this.f364557m == j0Var.f364557m && this.f364558n == j0Var.f364558n && this.f364559o == j0Var.f364559o;
    }

    /* renamed from: hashCode */
    public int m133878x8cdac1b() {
        int hashCode = ((((((((((java.lang.Integer.hashCode(this.f364545a) * 31) + this.f364546b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f364547c)) * 31) + java.lang.Integer.hashCode(this.f364548d)) * 31) + java.lang.Integer.hashCode(this.f364549e)) * 31) + java.lang.Integer.hashCode(this.f364550f)) * 31;
        android.view.View view = this.f364551g;
        int hashCode2 = (hashCode + (view == null ? 0 : view.hashCode())) * 31;
        cf3.d dVar = this.f364552h;
        return ((((((((((((((hashCode2 + (dVar != null ? dVar.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f364553i)) * 31) + java.lang.Boolean.hashCode(this.f364554j)) * 31) + java.lang.Boolean.hashCode(this.f364555k)) * 31) + java.lang.Boolean.hashCode(this.f364556l)) * 31) + java.lang.Boolean.hashCode(this.f364557m)) * 31) + java.lang.Boolean.hashCode(this.f364558n)) * 31) + java.lang.Boolean.hashCode(this.f364559o);
    }

    /* renamed from: toString */
    public java.lang.String m133879x9616526c() {
        return "MagicSclCanvas(canvasId=" + this.f364545a + ", frameSetId=" + this.f364546b + ", left=" + this.f364547c + ", top=" + this.f364548d + ", width=" + this.f364549e + ", height=" + this.f364550f + ", canvasView=" + this.f364551g + ", externalView=" + this.f364552h + ", pendingFirstFrame=" + this.f364553i + ", pendingRedraw=" + this.f364554j + ", surfaceDestroyNeedRedraw=" + this.f364555k + ", firstFrameRendered=" + this.f364556l + ", surfaceAvailable=" + this.f364557m + ", created=" + this.f364558n + ", preCreated=" + this.f364559o + ')';
    }
}
