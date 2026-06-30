package ay2;

/* loaded from: classes5.dex */
public final class i extends android.app.Dialog {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f15239d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f15240e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.LinearLayout f15241f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f15242g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.Button f15243h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f15244i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.LinearLayout f15245m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.Button f15246n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.Button f15247o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f15248p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.a f15249q;

    /* renamed from: r, reason: collision with root package name */
    public long f15250r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15251s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f15252t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.app.Activity activity) {
        super(activity, com.tencent.mm.R.style.f494796wi);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f15239d = activity;
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.b_1, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f15240e = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.ii8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f15241f = (android.widget.LinearLayout) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.f487473oq4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f15242g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.b1k);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f15243h = (android.widget.Button) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.pnq);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f15244i = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById4;
        this.f15245m = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.ucb);
        this.f15246n = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.f485651uc3);
        this.f15247o = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.f485650uc2);
        this.f15248p = "";
        this.f15252t = "Finder.FinderTeensGuideBtmDialog";
    }

    public final void b(int i17) {
        c(i17);
        dismiss();
    }

    public final void c(int i17) {
        if (this.f15250r >= 0) {
            android.app.Activity context = this.f15239d;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            ((cy1.a) rVar).Bj("teen_mode_guide_describe", "view_unexp", kz5.c1.k(new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("teen_guide_out_type", java.lang.Integer.valueOf(i17)), new jz5.l("stay_time_ms", java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis() - this.f15250r))), 1, false);
        }
        this.f15250r = 0L;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent ev6) {
        android.view.View view;
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6.getAction() == 0 && isShowing() && (view = this.f15240e) != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            this.f15251s = ev6.getRawX() < ((float) i17) || ev6.getRawX() > ((float) (view.getWidth() + i17)) || ev6.getRawY() < ((float) i18) || ev6.getRawY() > ((float) (view.getHeight() + i18));
            com.tencent.mars.xlog.Log.i(this.f15252t, "isOutsideClick: " + this.f15251s);
        }
        return super.dispatchTouchEvent(ev6);
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(com.tencent.mm.R.style.f494198gv);
            window.getDecorView().setPadding(0, 0, 0, 0);
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.width = -1;
                attributes.height = -2;
                window.setAttributes(attributes);
            }
        }
        android.view.View view = this.f15240e;
        setContentView(view);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.E6).getValue()).r()).booleanValue();
        android.widget.LinearLayout linearLayout = this.f15245m;
        android.widget.Button button = this.f15243h;
        if (booleanValue) {
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            if (button != null) {
                button.setVisibility(8);
            }
        } else {
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            if (button != null) {
                button.setVisibility(0);
            }
        }
        setCanceledOnTouchOutside(true);
        setOnDismissListener(new ay2.b(this));
        view.setOnClickListener(new ay2.c(this));
        this.f15241f.setOnClickListener(new ay2.d(this));
        button.setOnClickListener(new ay2.e(this));
        this.f15244i.setOnClickListener(new ay2.f(this));
        this.f15246n.setOnClickListener(new ay2.g(this));
        this.f15247o.setOnClickListener(new ay2.h(this));
        this.f15242g.setText(this.f15248p);
    }
}
