package ah1;

/* loaded from: classes7.dex */
public final class i0 extends vj5.h implements si1.j0 {
    public boolean A;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f86370w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f86371x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f86372y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f86373z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569562eu, (android.view.ViewGroup) this, true);
        setBackgroundColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        s(false);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.l5h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f86370w = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.l5g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f86371x = (android.widget.TextView) findViewById2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.f564044gj);
        c22699x3dcdb352.m82040x7541828(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
        c22699x3dcdb352.setOnClickListener(new ah1.d0(this));
    }

    public final void D() {
        if (this.A) {
            return;
        }
        this.A = true;
        animate().cancel();
        android.view.animation.Animation animation = getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.ui.uc.f292614d);
        loadAnimation.setAnimationListener(new ah1.e0(this));
        startAnimation(loadAnimation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.b(this)) {
            boolean z17 = false;
            if (keyEvent != null && 4 == keyEvent.getKeyCode()) {
                z17 = true;
            }
            if (z17 && (keyDispatcherState = getKeyDispatcherState()) != null) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                }
                if (1 == keyEvent.getAction() && !keyEvent.isCanceled() && keyDispatcherState.isTracking(keyEvent)) {
                    D();
                    return true;
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    /* renamed from: getExplainContent */
    public final java.lang.String m2043xa54da078() {
        return this.f86373z;
    }

    /* renamed from: getExplainTitle */
    public final java.lang.String m2044x71838217() {
        return this.f86372y;
    }

    @Override // si1.i0
    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component) {
        android.view.ViewGroup viewGroup;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        android.content.Context mo50352x76847179 = component.mo50352x76847179();
        android.app.Activity activity = mo50352x76847179 instanceof android.app.Activity ? (android.app.Activity) mo50352x76847179 : null;
        if (activity == null || (viewGroup = (android.view.ViewGroup) activity.findViewById(android.R.id.content)) == null) {
            return;
        }
        viewGroup.addView(this, new android.view.ViewGroup.LayoutParams(-1, -1));
        bringToFront();
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        getViewTreeObserver().addOnPreDrawListener(new ah1.g0(this, this));
    }

    /* renamed from: setExplainContent */
    public final void m2045x6d440884(java.lang.String str) {
        this.f86373z = str;
        boolean z17 = str == null || r26.n0.N(str);
        android.widget.TextView textView = this.f86371x;
        if (z17) {
            textView.setText("");
            return;
        }
        textView.setText(kk1.d.a(str, false, new ah1.f0(this)));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setLinkTextColor(android.graphics.Color.parseColor("#FF576B95"));
    }

    /* renamed from: setExplainTitle */
    public final void m2046xa7cc7d23(java.lang.String str) {
        if (str == null || str.length() == 0) {
            str = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a3c);
        }
        this.f86372y = str;
        this.f86370w.setText(str);
    }
}
