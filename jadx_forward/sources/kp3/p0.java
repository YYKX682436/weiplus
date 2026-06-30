package kp3;

/* loaded from: classes14.dex */
public final class p0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f392554d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f392555e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.C16782x4f8f0be0 f392556f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f392557g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f392558h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f392559i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f392560m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f392561n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f392562o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f392563p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f392564q;

    /* renamed from: r, reason: collision with root package name */
    public final kp3.e0 f392565r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f392566s;

    /* renamed from: t, reason: collision with root package name */
    public int f392567t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f392554d = jz5.h.b(new kp3.n0(activity));
        this.f392555e = jz5.h.b(new kp3.o0(activity));
        this.f392563p = true;
        this.f392564q = true;
        this.f392565r = new kp3.e0(this);
        this.f392567t = com.p314xaae8f345.p3223x6dd56e0.C27879x64e6240d.HandType.f61425x19d1382a;
    }

    public final void O6(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, java.lang.String str, boolean z17) {
        c22789xd23e9a9b.n();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(jp3.s.f382558b.b() + "/PalmRegister/assets/pag/");
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        if (!c22789xd23e9a9b.m(sb7)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintPreviewUIC", "[doPlayPag] pagView set path fail, pagFilePath is %s", sb7);
            return;
        }
        c22789xd23e9a9b.setAlpha(1.0f);
        c22789xd23e9a9b.setVisibility(0);
        c22789xd23e9a9b.m82582x3ae760af(0.0d);
        c22789xd23e9a9b.d();
        if (z17) {
            c22789xd23e9a9b.g();
        }
    }

    public final boolean P6(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("style", str);
        boolean b17 = com.p314xaae8f345.mm.ui.jk.f290544a.b(jSONObject.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doPlayVibrate] doVibrateSuccess : " + b17);
        return b17;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b Q6() {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f392562o;
        if (c22789xd23e9a9b != null) {
            return c22789xd23e9a9b;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("centerCirclePagView");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.C16782x4f8f0be0 R6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1942x346332.ui.C16782x4f8f0be0 c16782x4f8f0be0 = this.f392556f;
        if (c16782x4f8f0be0 != null) {
            return c16782x4f8f0be0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewMask");
        throw null;
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b S6() {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f392561n;
        if (c22789xd23e9a9b != null) {
            return c22789xd23e9a9b;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsPagView");
        throw null;
    }

    public final android.widget.TextView T6() {
        android.widget.TextView textView = this.f392559i;
        if (textView != null) {
            return textView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tipsTv");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        S6().n();
        Q6().n();
    }
}
