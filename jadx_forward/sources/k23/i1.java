package k23;

/* loaded from: classes12.dex */
public abstract class i1 extends android.widget.FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final android.view.animation.PathInterpolator f385117m = new android.view.animation.PathInterpolator(0.15f, 0.0f, 0.35f, 0.8f);

    /* renamed from: d, reason: collision with root package name */
    public final k23.d0 f385118d;

    /* renamed from: e, reason: collision with root package name */
    public k23.d1 f385119e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f385120f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f385121g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f385122h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f385123i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(android.content.Context context, k23.d0 params) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f385118d = params;
        this.f385121g = jz5.h.b(new k23.g1(this));
        this.f385122h = jz5.h.b(new k23.h1(this));
        this.f385123i = jz5.h.b(new k23.e1(context));
        com.p314xaae8f345.mm.ui.id.b(context).inflate(mo141801x2ee31f5b(), this);
        m141810xe6cb0196(m141803xca568c10());
        m141804x8ee3d2b2().setTextSize(0, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561222co) * z50.i.f551699a.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCancelLimitY */
    public final float m141799xe7f5958e() {
        return ((java.lang.Number) ((jz5.n) this.f385123i).mo141623x754a37bb()).floatValue();
    }

    public void b() {
        if (this.f385118d.f385085i == k23.u2.f385235e) {
            int d17 = i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77736x48893d57);
            int d18 = i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.aby);
            m141803xca568c10().setBackgroundColor(d17);
            m141804x8ee3d2b2().setTextColor(d18);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) m141803xca568c10().findViewById(com.p314xaae8f345.mm.R.id.ugo);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80610xddce36b9);
                c22699x3dcdb352.m82040x7541828(d18);
            }
        }
    }

    /* renamed from: getButtonStyle */
    public final k23.u2 m141800x704efc69() {
        return this.f385118d.f385085i;
    }

    /* renamed from: getLayoutId */
    public abstract int mo141801x2ee31f5b();

    /* renamed from: getParams */
    public final k23.d0 m141802x29c21c7c() {
        return this.f385118d;
    }

    /* renamed from: getStartBtn */
    public final android.view.View m141803xca568c10() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f385121g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    /* renamed from: getStartBtnTv */
    public final android.widget.TextView m141804x8ee3d2b2() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f385122h).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    /* renamed from: getStartButtonTopToBottomHeightPx */
    public abstract java.lang.Integer mo141805xa625e1cc();

    /* renamed from: getTargetActivityBarColor */
    public final java.lang.Integer[] m141806x53a819e6() {
        k23.d0 d0Var = this.f385118d;
        int ordinal = d0Var.f385081e.ordinal();
        if (ordinal == 2) {
            return new java.lang.Integer[]{0, 0};
        }
        if (ordinal == 4) {
            return new java.lang.Integer[]{java.lang.Integer.valueOf(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560691al2)), java.lang.Integer.valueOf(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aky))};
        }
        java.lang.Integer[] numArr = d0Var.f385086j;
        if (!(numArr instanceof java.lang.Integer[])) {
            numArr = null;
        }
        return numArr == null ? new java.lang.Integer[0] : numArr;
    }

    /* renamed from: setButtonText */
    public final void m141807x31c3fd81(java.lang.String buttonTitle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttonTitle, "buttonTitle");
        if (!(buttonTitle.length() > 0) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m141804x8ee3d2b2().getText().toString(), buttonTitle)) {
            return;
        }
        m141804x8ee3d2b2().setText(buttonTitle);
    }

    /* renamed from: setButtonTextColor */
    public final void m141808xa378a62(int i17) {
        m141804x8ee3d2b2().setTextColor(i17);
    }

    /* renamed from: setListener */
    public final void m141809xc6cf6336(k23.d1 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f385119e = listener;
    }

    /* renamed from: setupTouchListener */
    public final void m141810xe6cb0196(android.view.View btn) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(btn, "btn");
        btn.setOnTouchListener(new k23.f1(this));
    }
}
