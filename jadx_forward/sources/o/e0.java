package o;

/* loaded from: classes15.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f423235a;

    /* renamed from: b, reason: collision with root package name */
    public final o.r f423236b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f423237c;

    /* renamed from: d, reason: collision with root package name */
    public final int f423238d;

    /* renamed from: e, reason: collision with root package name */
    public final int f423239e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f423240f;

    /* renamed from: g, reason: collision with root package name */
    public int f423241g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f423242h;

    /* renamed from: i, reason: collision with root package name */
    public o.f0 f423243i;

    /* renamed from: j, reason: collision with root package name */
    public o.c0 f423244j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.PopupWindow.OnDismissListener f423245k;

    /* renamed from: l, reason: collision with root package name */
    public final android.widget.PopupWindow.OnDismissListener f423246l;

    public e0(android.content.Context context, o.r rVar, android.view.View view, boolean z17, int i17) {
        this(context, rVar, view, z17, i17, 0);
    }

    public o.c0 a() {
        if (this.f423244j == null) {
            android.content.Context context = this.f423235a;
            android.view.Display defaultDisplay = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getRealSize(point);
            o.c0 lVar = java.lang.Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561505kk) ? new o.l(this.f423235a, this.f423240f, this.f423238d, this.f423239e, this.f423237c) : new o.n0(this.f423235a, this.f423236b, this.f423240f, this.f423238d, this.f423239e, this.f423237c);
            lVar.k(this.f423236b);
            lVar.q(this.f423246l);
            lVar.m(this.f423240f);
            lVar.g(this.f423243i);
            lVar.n(this.f423242h);
            lVar.o(this.f423241g);
            this.f423244j = lVar;
        }
        return this.f423244j;
    }

    public boolean b() {
        o.c0 c0Var = this.f423244j;
        return c0Var != null && c0Var.mo2734x58a9c73b();
    }

    public void c() {
        this.f423244j = null;
        android.widget.PopupWindow.OnDismissListener onDismissListener = this.f423245k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i17, int i18, boolean z17, boolean z18) {
        o.c0 a17 = a();
        a17.r(z18);
        if (z17) {
            int i19 = this.f423241g;
            android.view.View view = this.f423240f;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if ((android.view.Gravity.getAbsoluteGravity(i19, n3.v0.d(view)) & 7) == 5) {
                i17 -= this.f423240f.getWidth();
            }
            a17.p(i17);
            a17.s(i18);
            int i27 = (int) ((this.f423235a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a17.f423222d = new android.graphics.Rect(i17 - i27, i18 - i27, i17 + i27, i18 + i27);
        }
        a17.mo2735x35dafd();
    }

    public e0(android.content.Context context, o.r rVar, android.view.View view, boolean z17, int i17, int i18) {
        this.f423241g = 8388611;
        this.f423246l = new o.d0(this);
        this.f423235a = context;
        this.f423236b = rVar;
        this.f423240f = view;
        this.f423237c = z17;
        this.f423238d = i17;
        this.f423239e = i18;
    }
}
