package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.ContentFrameLayout */
/* loaded from: classes15.dex */
public class C0094x735be4de extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.util.TypedValue f90925d;

    /* renamed from: e, reason: collision with root package name */
    public android.util.TypedValue f90926e;

    /* renamed from: f, reason: collision with root package name */
    public android.util.TypedValue f90927f;

    /* renamed from: g, reason: collision with root package name */
    public android.util.TypedValue f90928g;

    /* renamed from: h, reason: collision with root package name */
    public android.util.TypedValue f90929h;

    /* renamed from: i, reason: collision with root package name */
    public android.util.TypedValue f90930i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f90931m;

    /* renamed from: n, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.v0 f90932n;

    public C0094x735be4de(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(android.graphics.Rect rect) {
        fitSystemWindows(rect);
    }

    /* renamed from: getFixedHeightMajor */
    public android.util.TypedValue m2702x82dd8c34() {
        if (this.f90929h == null) {
            this.f90929h = new android.util.TypedValue();
        }
        return this.f90929h;
    }

    /* renamed from: getFixedHeightMinor */
    public android.util.TypedValue m2703x82e13e30() {
        if (this.f90930i == null) {
            this.f90930i = new android.util.TypedValue();
        }
        return this.f90930i;
    }

    /* renamed from: getFixedWidthMajor */
    public android.util.TypedValue m2704x6ccf17f1() {
        if (this.f90927f == null) {
            this.f90927f = new android.util.TypedValue();
        }
        return this.f90927f;
    }

    /* renamed from: getFixedWidthMinor */
    public android.util.TypedValue m2705x6cd2c9ed() {
        if (this.f90928g == null) {
            this.f90928g = new android.util.TypedValue();
        }
        return this.f90928g;
    }

    /* renamed from: getMinWidthMajor */
    public android.util.TypedValue m2706x847d43cf() {
        if (this.f90925d == null) {
            this.f90925d = new android.util.TypedValue();
        }
        return this.f90925d;
    }

    /* renamed from: getMinWidthMinor */
    public android.util.TypedValue m2707x8480f5cb() {
        if (this.f90926e == null) {
            this.f90926e = new android.util.TypedValue();
        }
        return this.f90926e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.v0 v0Var = this.f90932n;
        if (v0Var != null) {
            v0Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.q qVar;
        super.onDetachedFromWindow();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.v0 v0Var = this.f90932n;
        if (v0Var != null) {
            p012xc85e97e9.p016x746ad0e3.app.g0 g0Var = ((p012xc85e97e9.p016x746ad0e3.app.r) v0Var).f90744a;
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.w0 w0Var = g0Var.f90650o;
            if (w0Var != null) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd c0074x22961cbd = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd) w0Var;
                c0074x22961cbd.e();
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0076xa566151a c0076xa566151a = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) c0074x22961cbd.f90852h).f91280a.f91011d;
                if (c0076xa566151a != null && (qVar = c0076xa566151a.f90873z) != null) {
                    qVar.l();
                    p012xc85e97e9.p016x746ad0e3.p019xd1075a44.i iVar = qVar.B;
                    if (iVar != null && iVar.b()) {
                        iVar.f423244j.mo2732x63a3b28a();
                    }
                }
            }
            if (g0Var.f90655t != null) {
                g0Var.f90643e.getDecorView().removeCallbacks(g0Var.f90656u);
                if (g0Var.f90655t.isShowing()) {
                    try {
                        g0Var.f90655t.dismiss();
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                }
                g0Var.f90655t = null;
            }
            n3.z1 z1Var = g0Var.f90657v;
            if (z1Var != null) {
                z1Var.b();
            }
            o.r rVar = g0Var.q(0, false).f90626h;
            if (rVar != null) {
                rVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0094x735be4de.onMeasure(int, int):void");
    }

    /* renamed from: setAttachListener */
    public void m2708x4e68371b(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.v0 v0Var) {
        this.f90932n = v0Var;
    }

    public C0094x735be4de(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f90931m = new android.graphics.Rect();
    }
}
