package k23;

/* loaded from: classes12.dex */
public abstract class p2 extends k23.i1 {

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f385184n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f385185o;

    /* renamed from: p, reason: collision with root package name */
    public int f385186p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f385187q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(android.content.Context context, k23.d0 params) {
        super(context, params);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f385184n = findViewById(com.p314xaae8f345.mm.R.id.tyt);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.sgr);
        this.f385185o = findViewById;
        findViewById.setOnClickListener(k23.m2.f385155d);
        b();
        this.f385186p = Integer.MIN_VALUE;
        this.f385187q = jz5.h.b(new k23.o2(this));
    }

    /* renamed from: getShadowViewList */
    private final java.util.List<android.view.View> m141825x80df0f19() {
        return (java.util.List) ((jz5.n) this.f385187q).mo141623x754a37bb();
    }

    public final void c() {
        for (android.view.View view : m141825x80df0f19()) {
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnWithLinearShadow", "showExtentShadow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/voice/FTSStartRecognizeBtnWithLinearShadow", "showExtentShadow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // k23.i1
    /* renamed from: getLayoutId */
    public int mo141801x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.efb;
    }

    /* renamed from: getMarginBottomPx */
    public final int m141826x3abcee57() {
        return this.f385185o.getLayoutParams().height;
    }

    /* renamed from: getSafeAreaHeight */
    public final int m141827x28b10c77() {
        return this.f385184n.getHeight();
    }

    @Override // k23.i1
    /* renamed from: getStartButtonTopToBottomHeightPx */
    public java.lang.Integer mo141805xa625e1cc() {
        return java.lang.Integer.valueOf(this.f385185o.getHeight() + m141803xca568c10().getHeight());
    }

    /* renamed from: setMarginBottomPx */
    public final void m141828x2b35663(int i17) {
        android.view.View backgroundMask = this.f385185o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(backgroundMask, "backgroundMask");
        android.view.ViewGroup.LayoutParams layoutParams = backgroundMask.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i17;
        backgroundMask.setLayoutParams(layoutParams);
        if (java.lang.Math.abs(i17 - this.f385186p) >= 50) {
            this.f385186p = i17;
            backgroundMask.post(new k23.n2(this, i17));
        }
    }
}
