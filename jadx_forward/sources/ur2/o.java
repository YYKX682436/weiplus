package ur2;

/* loaded from: classes10.dex */
public final class o implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f511940d;

    /* renamed from: e, reason: collision with root package name */
    public final ry2.e f511941e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f511942f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f511943g;

    /* renamed from: h, reason: collision with root package name */
    public int f511944h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f511945i;

    /* renamed from: m, reason: collision with root package name */
    public int f511946m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f511947n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.EditText f511948o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f511949p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f511950q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f511951r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f511952s;

    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, ry2.e eVar, yz5.l lVar, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f511940d = activity;
        this.f511941e = eVar;
        this.f511942f = lVar;
        this.f511943g = aVar;
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.edf, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f511947n = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.tsr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.EditText editText = (android.widget.EditText) findViewById;
        this.f511948o = editText;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.tsl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f511949p = findViewById2;
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5(activity);
        this.f511952s = f5Var;
        inflate.findViewById(com.p314xaae8f345.mm.R.id.tsj).setOnClickListener(new ur2.d(this));
        inflate.findViewById(com.p314xaae8f345.mm.R.id.tsi).setOnClickListener(new ur2.e(this));
        findViewById2.setOnClickListener(ur2.f.f511928d);
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.tsk);
        findViewById3.setOnClickListener(new ur2.g(this));
        findViewById3.setEnabled(false);
        this.f511950q = findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.tss);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f511951r = textView;
        textView.setClickable(true);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.tst)).getPaint(), 0.8f);
        textView.setOnClickListener(new ur2.j(this));
        f5Var.f291933e = this;
        activity.getWindow().getDecorView().post(new ur2.k(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0 ad0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a;
        editText.addTextChangedListener(new ur2.m(this, r26.i0.t("[^a-zA-Z0-9一-龥#]", "#", r26.i0.t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.f1(), "_", "", false), false), ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207936b).mo141623x754a37bb()).r()).intValue()));
    }

    public final void a() {
        android.widget.EditText editText = this.f511948o;
        editText.clearFocus();
        this.f511952s.d();
        java.lang.Object systemService = this.f511940d.getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
        this.f511945i = false;
        android.view.View view = this.f511947n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleHalfScreen", "onHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleHalfScreen", "onHide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(view, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f511949p;
        view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), this.f511946m);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        if (this.f511945i || this.f511949p.getPaddingBottom() == this.f511946m + i17) {
            return;
        }
        ur2.l lVar = new ur2.l(i17, this);
        lVar.setDuration(i17 != 0 ? 200L : 300L);
        this.f511947n.startAnimation(lVar);
    }
}
