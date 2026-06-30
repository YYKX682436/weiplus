package androidx.appcompat.app;

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
    public final int f9158J;
    public final boolean K;
    public final android.os.Handler L;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f9159a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.app.i0 f9160b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.Window f9161c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9162d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.CharSequence f9163e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.CharSequence f9164f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ListView f9165g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f9166h;

    /* renamed from: i, reason: collision with root package name */
    public int f9167i;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.Button f9169k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.CharSequence f9170l;

    /* renamed from: m, reason: collision with root package name */
    public android.os.Message f9171m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9172n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f9173o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.CharSequence f9174p;

    /* renamed from: q, reason: collision with root package name */
    public android.os.Message f9175q;

    /* renamed from: r, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9176r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.Button f9177s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f9178t;

    /* renamed from: u, reason: collision with root package name */
    public android.os.Message f9179u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9180v;

    /* renamed from: w, reason: collision with root package name */
    public androidx.core.widget.NestedScrollView f9181w;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9183y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f9184z;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9168j = false;

    /* renamed from: x, reason: collision with root package name */
    public int f9182x = 0;
    public int E = -1;
    public final android.view.View.OnClickListener M = new androidx.appcompat.app.d(this);

    public k(android.content.Context context, androidx.appcompat.app.i0 i0Var, android.view.Window window) {
        this.f9159a = context;
        this.f9160b = i0Var;
        this.f9161c = window;
        this.L = new androidx.appcompat.app.i(i0Var);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, j.a.f296178f, com.tencent.mm.R.attr.f478089ad, 0);
        this.F = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.G = obtainStyledAttributes.getResourceId(4, 0);
        this.H = obtainStyledAttributes.getResourceId(5, 0);
        this.I = obtainStyledAttributes.getResourceId(7, 0);
        this.f9158J = obtainStyledAttributes.getResourceId(3, 0);
        this.K = obtainStyledAttributes.getBoolean(6, true);
        this.f9162d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
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
            this.f9178t = charSequence;
            this.f9179u = message;
            this.f9180v = drawable;
        } else if (i17 == -2) {
            this.f9174p = charSequence;
            this.f9175q = message;
            this.f9176r = drawable;
        } else {
            if (i17 != -1) {
                throw new java.lang.IllegalArgumentException("Button does not exist");
            }
            this.f9170l = charSequence;
            this.f9171m = message;
            this.f9172n = drawable;
        }
    }
}
