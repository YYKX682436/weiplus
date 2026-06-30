package ah1;

/* loaded from: classes7.dex */
public final class i0 extends vj5.h implements si1.j0 {
    public boolean A;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f4837w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f4838x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f4839y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f4840z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488029eu, (android.view.ViewGroup) this, true);
        setBackgroundColor(b3.l.getColor(context, com.tencent.mm.R.color.aaw));
        s(false);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.l5h);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f4837w = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.l5g);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f4838x = (android.widget.TextView) findViewById2;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f482511gj);
        weImageView.setIconColor(b3.l.getColor(context, com.tencent.mm.R.color.BW_0_Alpha_0_9));
        weImageView.setOnClickListener(new ah1.d0(this));
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
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.ui.uc.f211081d);
        loadAnimation.setAnimationListener(new ah1.e0(this));
        startAnimation(loadAnimation);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
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

    public final java.lang.String getExplainContent() {
        return this.f4840z;
    }

    public final java.lang.String getExplainTitle() {
        return this.f4839y;
    }

    @Override // si1.i0
    public void r(com.tencent.mm.plugin.appbrand.jsapi.l component) {
        android.view.ViewGroup viewGroup;
        kotlin.jvm.internal.o.g(component, "component");
        android.content.Context context = component.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
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

    public final void setExplainContent(java.lang.String str) {
        this.f4840z = str;
        boolean z17 = str == null || r26.n0.N(str);
        android.widget.TextView textView = this.f4838x;
        if (z17) {
            textView.setText("");
            return;
        }
        textView.setText(kk1.d.a(str, false, new ah1.f0(this)));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setLinkTextColor(android.graphics.Color.parseColor("#FF576B95"));
    }

    public final void setExplainTitle(java.lang.String str) {
        if (str == null || str.length() == 0) {
            str = getContext().getString(com.tencent.mm.R.string.a3c);
        }
        this.f4839y = str;
        this.f4837w.setText(str);
    }
}
