package f93;

/* loaded from: classes3.dex */
public final class p5 extends hg5.d {
    public final java.util.ArrayList A;
    public final jz5.g B;

    /* renamed from: r, reason: collision with root package name */
    public final android.content.Context f341959r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f341960s;

    /* renamed from: t, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f341961t;

    /* renamed from: u, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f341962u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f341963v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f341964w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f341965x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f341966y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f341967z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(android.content.Context uiContext, java.lang.String labelId) {
        super(uiContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiContext, "uiContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelId, "labelId");
        this.f341959r = uiContext;
        this.f341960s = labelId;
        this.f341961t = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f341962u = new android.text.SpannableStringBuilder("");
        this.f341963v = jz5.h.b(new f93.n5(this));
        this.f341964w = jz5.h.b(new f93.m5(this));
        this.f341965x = jz5.h.b(new f93.o5(this));
        this.f341966y = jz5.h.b(new f93.l5(this));
        this.f341967z = jz5.h.b(f93.g5.f341877d);
        this.A = new java.util.ArrayList();
        this.B = jz5.h.b(new f93.f5(this));
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.csa, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        android.view.View findViewById;
        super.G();
        android.view.View view = this.f362936i;
        if (view != null && (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2)) != null) {
            findViewById.setOnClickListener(new f93.h5(this));
        }
        jz5.g gVar = this.f341963v;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb();
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d) ((jz5.n) this.f341966y).mo141623x754a37bb());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb();
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7960x6cab2c8d((f93.e5) ((jz5.n) this.B).mo141623x754a37bb());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb();
        if (c22849x81a93d253 != null) {
            c22849x81a93d253.N(new f93.i5(this));
        }
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f341965x).mo141623x754a37bb();
        if (textView != null) {
            textView.setText(this.f341962u);
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.f341961t, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new f93.k5(this, null), 2, null);
    }

    @Override // hg5.d
    public void J() {
        super.J();
        p3325xe03a0797.p3326xc267989b.z0.e(this.f341961t, null, 1, null);
    }
}
