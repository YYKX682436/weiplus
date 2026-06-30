package hg5;

/* loaded from: classes8.dex */
public abstract class d extends p012xc85e97e9.p016x746ad0e3.app.i0 implements p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: p, reason: collision with root package name */
    public static hg5.d f362931p;

    /* renamed from: q, reason: collision with root package name */
    public static boolean f362932q;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f362933f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f362934g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f362935h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f362936i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f362937m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f362938n;

    /* renamed from: o, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f362939o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context selfContext) {
        super(selfContext, com.p314xaae8f345.mm.R.C30868x68b1db1.f575764hn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfContext, "selfContext");
        this.f362933f = selfContext;
        jz5.g b17 = jz5.h.b(new hg5.c(this));
        this.f362938n = b17;
        ((p012xc85e97e9.p093xedfae76a.b0) ((jz5.n) b17).mo141623x754a37bb()).g(p012xc85e97e9.p093xedfae76a.n.INITIALIZED);
    }

    public static final boolean I() {
        if (f362932q != com.p314xaae8f345.mm.ui.bk.C()) {
            try {
                hg5.d dVar = f362931p;
                if (dVar != null) {
                    dVar.dismiss();
                }
            } catch (java.lang.Exception unused) {
            }
            f362931p = null;
            return false;
        }
        hg5.d dVar2 = f362931p;
        if (dVar2 == null) {
            return false;
        }
        if (dVar2.isShowing()) {
            return true;
        }
        f362931p = null;
        return false;
    }

    public final void D() {
        if (this.f362936i != null) {
            int i17 = 0;
            if (android.os.Build.VERSION.SDK_INT < 30) {
                android.content.Context context = this.f362933f;
                if (com.p314xaae8f345.mm.ui.bl.f(context)) {
                    if (!(getContext().getResources().getConfiguration().orientation == 2)) {
                        i17 = com.p314xaae8f345.mm.ui.bl.c(context);
                    }
                }
            }
            android.view.View view = this.f362936i;
            android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i17;
            }
            android.view.View view2 = this.f362936i;
            if (view2 == null) {
                return;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
    }

    public int E() {
        return i65.a.b(getContext(), 130);
    }

    public abstract android.view.View F();

    public void G() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575608dq);
        }
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bj8, (android.view.ViewGroup) null, false);
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f362934g = inflate;
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.p314xaae8f345.mm.R.id.f565753df2) : null;
        this.f362935h = findViewById;
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            layoutParams.height = E();
            android.view.View view = this.f362935h;
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
        }
        android.view.View view2 = this.f362935h;
        if (view2 != null) {
            view2.setOnTouchListener(new hg5.a(this));
        }
        android.view.View view3 = this.f362934g;
        this.f362937m = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.ci6) : null;
        this.f362936i = F();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(3, com.p314xaae8f345.mm.R.id.f565753df2);
        android.view.View view4 = this.f362934g;
        android.view.ViewGroup viewGroup = view4 instanceof android.view.ViewGroup ? (android.view.ViewGroup) view4 : null;
        if (viewGroup != null) {
            viewGroup.addView(this.f362936i, layoutParams2);
        }
        setCancelable(true);
        super.setOnDismissListener(new hg5.b(this));
    }

    public void J() {
        ((p012xc85e97e9.p093xedfae76a.b0) ((jz5.n) this.f362938n).mo141623x754a37bb()).g(p012xc85e97e9.p093xedfae76a.n.DESTROYED);
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f362939o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        f362931p = null;
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return (p012xc85e97e9.p093xedfae76a.b0) ((jz5.n) this.f362938n).mo141623x754a37bb();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        D();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((p012xc85e97e9.p093xedfae76a.b0) ((jz5.n) this.f362938n).mo141623x754a37bb()).g(p012xc85e97e9.p093xedfae76a.n.CREATED);
        G();
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f362939o = onDismissListener;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        f362932q = com.p314xaae8f345.mm.ui.bk.C();
        ((p012xc85e97e9.p093xedfae76a.b0) ((jz5.n) this.f362938n).mo141623x754a37bb()).g(p012xc85e97e9.p093xedfae76a.n.RESUMED);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }
}
