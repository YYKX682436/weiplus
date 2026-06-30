package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class ContentFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.util.TypedValue f9392d;

    /* renamed from: e, reason: collision with root package name */
    public android.util.TypedValue f9393e;

    /* renamed from: f, reason: collision with root package name */
    public android.util.TypedValue f9394f;

    /* renamed from: g, reason: collision with root package name */
    public android.util.TypedValue f9395g;

    /* renamed from: h, reason: collision with root package name */
    public android.util.TypedValue f9396h;

    /* renamed from: i, reason: collision with root package name */
    public android.util.TypedValue f9397i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Rect f9398m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.appcompat.widget.v0 f9399n;

    public ContentFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(android.graphics.Rect rect) {
        fitSystemWindows(rect);
    }

    public android.util.TypedValue getFixedHeightMajor() {
        if (this.f9396h == null) {
            this.f9396h = new android.util.TypedValue();
        }
        return this.f9396h;
    }

    public android.util.TypedValue getFixedHeightMinor() {
        if (this.f9397i == null) {
            this.f9397i = new android.util.TypedValue();
        }
        return this.f9397i;
    }

    public android.util.TypedValue getFixedWidthMajor() {
        if (this.f9394f == null) {
            this.f9394f = new android.util.TypedValue();
        }
        return this.f9394f;
    }

    public android.util.TypedValue getFixedWidthMinor() {
        if (this.f9395g == null) {
            this.f9395g = new android.util.TypedValue();
        }
        return this.f9395g;
    }

    public android.util.TypedValue getMinWidthMajor() {
        if (this.f9392d == null) {
            this.f9392d = new android.util.TypedValue();
        }
        return this.f9392d;
    }

    public android.util.TypedValue getMinWidthMinor() {
        if (this.f9393e == null) {
            this.f9393e = new android.util.TypedValue();
        }
        return this.f9393e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.appcompat.widget.v0 v0Var = this.f9399n;
        if (v0Var != null) {
            v0Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.appcompat.widget.q qVar;
        super.onDetachedFromWindow();
        androidx.appcompat.widget.v0 v0Var = this.f9399n;
        if (v0Var != null) {
            androidx.appcompat.app.g0 g0Var = ((androidx.appcompat.app.r) v0Var).f9211a;
            androidx.appcompat.widget.w0 w0Var = g0Var.f9117o;
            if (w0Var != null) {
                androidx.appcompat.widget.ActionBarOverlayLayout actionBarOverlayLayout = (androidx.appcompat.widget.ActionBarOverlayLayout) w0Var;
                actionBarOverlayLayout.e();
                androidx.appcompat.widget.ActionMenuView actionMenuView = ((androidx.appcompat.widget.z2) actionBarOverlayLayout.f9319h).f9747a.f9478d;
                if (actionMenuView != null && (qVar = actionMenuView.f9340z) != null) {
                    qVar.l();
                    androidx.appcompat.widget.i iVar = qVar.B;
                    if (iVar != null && iVar.b()) {
                        iVar.f341711j.dismiss();
                    }
                }
            }
            if (g0Var.f9122t != null) {
                g0Var.f9110e.getDecorView().removeCallbacks(g0Var.f9123u);
                if (g0Var.f9122t.isShowing()) {
                    try {
                        g0Var.f9122t.dismiss();
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                }
                g0Var.f9122t = null;
            }
            n3.z1 z1Var = g0Var.f9124v;
            if (z1Var != null) {
                z1Var.b();
            }
            o.r rVar = g0Var.q(0, false).f9093h;
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(androidx.appcompat.widget.v0 v0Var) {
        this.f9399n = v0Var;
    }

    public ContentFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f9398m = new android.graphics.Rect();
    }
}
