package cp4;

/* loaded from: classes8.dex */
public final class z extends android.widget.LinearLayout implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public int f302629d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f302630e;

    /* renamed from: f, reason: collision with root package name */
    public final cp4.x f302631f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f302632g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.p f302633h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f302634i;

    /* renamed from: m, reason: collision with root package name */
    public int f302635m;

    /* renamed from: n, reason: collision with root package name */
    public int f302636n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f302637o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        cp4.x xVar = new cp4.x(context);
        this.f302631f = xVar;
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5((android.app.Activity) context);
        this.f302632g = f5Var;
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a5a, (android.view.ViewGroup) this, true);
        setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562438f8);
        setOrientation(1);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.b67);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        this.f302630e = c1163xf1deaba4;
        findViewById(com.p314xaae8f345.mm.R.id.f565075b60).setOnClickListener(new cp4.s(this));
        findViewById(com.p314xaae8f345.mm.R.id.b6e).setOnClickListener(new cp4.t(this));
        c1163xf1deaba4.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2329x20ef99e6.C18798x1f17fe0a(context, 1));
        c1163xf1deaba4.mo7960x6cab2c8d(xVar);
        f5Var.f291933e = this;
        this.f302637o = new cp4.y(this, context);
    }

    /* renamed from: getCancelClickListener */
    public final yz5.a m122419x80049acc() {
        return this.f302634i;
    }

    /* renamed from: getSureClickListener */
    public final yz5.p m122420x49859b91() {
        return this.f302633h;
    }

    /* renamed from: setCancelClickListener */
    public final void m122421xce495a40(yz5.a aVar) {
        this.f302634i = aVar;
    }

    /* renamed from: setSureClickListener */
    public final void m122422x251ba805(yz5.p pVar) {
        this.f302633h = pVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorEditCaptionView", "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        if (getVisibility() != 0 || (layoutParams = (android.widget.FrameLayout.LayoutParams) getLayoutParams()) == null) {
            return;
        }
        layoutParams.bottomMargin = i17;
        setLayoutParams(layoutParams);
    }
}
