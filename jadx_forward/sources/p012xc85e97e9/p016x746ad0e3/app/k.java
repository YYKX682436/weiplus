package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes13.dex */
public class k {
    public android.widget.TextView A;
    public android.widget.TextView B;
    public android.view.View C;
    public android.widget.ListAdapter D;
    public final int F;
    public final int G;
    public final int H;
    public final int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f90691J;
    public final boolean K;
    public final android.os.Handler L;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f90692a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.i0 f90693b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Window f90694c;

    /* renamed from: d, reason: collision with root package name */
    public final int f90695d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f90696e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f90697f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f90698g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f90699h;

    /* renamed from: i, reason: collision with root package name */
    public int f90700i;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.Button f90702k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.CharSequence f90703l;

    /* renamed from: m, reason: collision with root package name */
    public android.os.Message f90704m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f90705n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f90706o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.CharSequence f90707p;

    /* renamed from: q, reason: collision with root package name */
    public android.os.Message f90708q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.drawable.Drawable f90709r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.Button f90710s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f90711t;

    /* renamed from: u, reason: collision with root package name */
    public android.os.Message f90712u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.drawable.Drawable f90713v;

    /* renamed from: w, reason: collision with root package name */
    public p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 f90714w;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.drawable.Drawable f90716y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f90717z;

    /* renamed from: j, reason: collision with root package name */
    public boolean f90701j = false;

    /* renamed from: x, reason: collision with root package name */
    public int f90715x = 0;
    public int E = -1;
    public final android.view.View.OnClickListener M = new p012xc85e97e9.p016x746ad0e3.app.d(this);

    public k(android.content.Context context, p012xc85e97e9.p016x746ad0e3.app.i0 i0Var, android.view.Window window) {
        this.f90692a = context;
        this.f90693b = i0Var;
        this.f90694c = window;
        this.L = new p012xc85e97e9.p016x746ad0e3.app.i(i0Var);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, j.a.f377711f, com.p314xaae8f345.mm.R.C30857x2dd9f1.f559622ad, 0);
        this.F = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.G = obtainStyledAttributes.getResourceId(4, 0);
        this.H = obtainStyledAttributes.getResourceId(5, 0);
        this.I = obtainStyledAttributes.getResourceId(7, 0);
        this.f90691J = obtainStyledAttributes.getResourceId(3, 0);
        this.K = obtainStyledAttributes.getBoolean(6, true);
        this.f90695d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        i0Var.C(1);
    }

    public static boolean a(android.view.View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return false;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final void b(android.widget.Button button) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public final android.view.ViewGroup c(android.view.View view, android.view.View view2) {
        if (view == null) {
            if (view2 instanceof android.view.ViewStub) {
                view2 = ((android.view.ViewStub) view2).inflate();
            }
            return (android.view.ViewGroup) view2;
        }
        if (view2 != null) {
            android.view.ViewParent parent = view2.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof android.view.ViewStub) {
            view = ((android.view.ViewStub) view).inflate();
        }
        return (android.view.ViewGroup) view;
    }

    public void d(int i17, java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener, android.os.Message message, android.graphics.drawable.Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.L.obtainMessage(i17, onClickListener);
        }
        if (i17 == -3) {
            this.f90711t = charSequence;
            this.f90712u = message;
            this.f90713v = drawable;
        } else if (i17 == -2) {
            this.f90707p = charSequence;
            this.f90708q = message;
            this.f90709r = drawable;
        } else {
            if (i17 != -1) {
                throw new java.lang.IllegalArgumentException("Button does not exist");
            }
            this.f90703l = charSequence;
            this.f90704m = message;
            this.f90705n = drawable;
        }
    }
}
