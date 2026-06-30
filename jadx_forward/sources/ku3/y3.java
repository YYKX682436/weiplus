package ku3;

/* loaded from: classes3.dex */
public final class y3 implements yt3.r2 {
    public p3325xe03a0797.p3326xc267989b.r2 A;
    public int B;
    public float C;

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f394002d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f394003e;

    /* renamed from: f, reason: collision with root package name */
    public final ju3.d0 f394004f;

    /* renamed from: g, reason: collision with root package name */
    public int f394005g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f394006h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f394007i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f394008m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f394009n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f394010o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f394011p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f394012q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f394013r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f394014s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f394015t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f394016u;

    /* renamed from: v, reason: collision with root package name */
    public final int f394017v;

    /* renamed from: w, reason: collision with root package name */
    public final int f394018w;

    /* renamed from: x, reason: collision with root package name */
    public final int f394019x;

    /* renamed from: y, reason: collision with root package name */
    public final int f394020y;

    /* renamed from: z, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f394021z;

    public y3(zt3.a kitContext, android.view.ViewGroup parent, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kitContext, "kitContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f394002d = kitContext;
        this.f394003e = parent;
        this.f394004f = status;
        this.f394005g = -1;
        this.f394006h = jz5.h.b(new ku3.x3(this));
        this.f394007i = jz5.h.b(new ku3.g3(this));
        this.f394008m = jz5.h.b(new ku3.s3(this));
        this.f394009n = jz5.h.b(new ku3.u3(this));
        this.f394010o = jz5.h.b(new ku3.t3(this));
        this.f394015t = i65.a.i(parent.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f562620kd);
        this.f394016u = i65.a.i(parent.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f562621ke);
        this.f394017v = i65.a.d(parent.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d);
        this.f394018w = i65.a.d(parent.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        i65.a.b(parent.getContext(), 28);
        this.f394019x = i65.a.f(parent.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        this.f394020y = i65.a.f(parent.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561206ca);
        this.f394021z = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
    }

    public static final void a(ku3.y3 y3Var, android.widget.TextView textView) {
        android.widget.TextView textView2 = y3Var.f394014s;
        if (textView2 != null) {
            textView2.setTextColor(y3Var.f394017v);
        }
        android.widget.TextView textView3 = y3Var.f394014s;
        if (textView3 != null) {
            textView3.setTextSize(0, y3Var.f394019x);
        }
        y3Var.f394014s = textView;
        if (textView != null) {
            textView.setTextColor(y3Var.f394018w);
        }
        if (textView != null) {
            textView.setTextSize(0, y3Var.f394020y);
        }
    }

    public final void b(int i17, int i18, int i19) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMenuCountDownPlugin", "changeLocation >> " + i18 + ", " + i19);
        this.f394005g = i17;
        g().post(new ku3.f3(this, i18, i19));
    }

    public final android.view.View c() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f394007i).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 d() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f394008m).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb;
    }

    public final android.view.View e() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f394010o).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.view.ViewGroup f() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f394009n).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.ViewGroup) mo141623x754a37bb;
    }

    public final android.widget.TextView g() {
        java.lang.Object mo141623x754a37bb = this.f394006h.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
    
        if (r1 != false) goto L10;
     */
    @Override // yt3.r2
    /* renamed from: onAttach */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo10988x3b13c504() {
        /*
            r9 = this;
            kotlinx.coroutines.r2 r0 = r9.A
            if (r0 == 0) goto L12
            r1 = 0
            if (r0 == 0) goto L10
            kotlinx.coroutines.a r0 = (p3325xe03a0797.p3326xc267989b.a) r0
            boolean r0 = r0.a()
            if (r0 != 0) goto L10
            r1 = 1
        L10:
            if (r1 == 0) goto L1d
        L12:
            zt3.a r0 = r9.f394002d
            r1 = 9
            boolean r0 = r0.O6(r1)
            if (r0 != 0) goto L1d
            return
        L1d:
            zt3.a r1 = r9.f394002d
            r2 = 9
            r3 = 1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r0 = "PARAM_1_INT"
            int r5 = r9.B
            r4.putInt(r0, r5)
            r5 = 0
            r6 = 0
            r7 = 24
            r8 = 0
            zt3.a.V6(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ku3.y3.mo10988x3b13c504():void");
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.A;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.z0.e(this.f394021z, null, 1, null);
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        ku3.h3 h3Var = new ku3.h3(this);
        zt3.a aVar = this.f394002d;
        aVar.Q6(15, h3Var);
        aVar.Q6(10, new ku3.j3(this));
        aVar.R6(new ku3.l3(this));
        c().setOnClickListener(ku3.m3.f393850d);
        e().setBackground(this.f394016u);
        d().s(com.p314xaae8f345.mm.R.raw.f79978xb34bbf16, com.p314xaae8f345.mm.R.C30859x5a72f63.f560306gt);
        android.view.ViewGroup viewGroup = this.f394003e;
        int b17 = i65.a.b(viewGroup.getContext(), 55);
        f().setPadding(b17, 0, b17, 0);
        e().setOnClickListener(new ku3.o3(this));
        java.lang.String r17 = i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hmf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        android.widget.TextView textView = new android.widget.TextView(viewGroup.getContext());
        textView.setText(r17);
        textView.setTextColor(this.f394018w);
        textView.setTextSize(0, this.f394020y);
        textView.setGravity(8388627);
        textView.setOnClickListener(new ku3.p3(this));
        this.f394011p = textView;
        java.lang.String r18 = i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hme);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r18, "getString(...)");
        android.widget.TextView textView2 = new android.widget.TextView(viewGroup.getContext());
        textView2.setText(r18);
        int i17 = this.f394017v;
        textView2.setTextColor(i17);
        textView2.setGravity(17);
        float f17 = this.f394019x;
        textView2.setTextSize(0, f17);
        textView2.setOnClickListener(new ku3.q3(this));
        this.f394012q = textView2;
        java.lang.String r19 = i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hmd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r19, "getString(...)");
        android.widget.TextView textView3 = new android.widget.TextView(viewGroup.getContext());
        textView3.setText(r19);
        textView3.setTextColor(i17);
        textView3.setGravity(8388629);
        textView3.setTextSize(0, f17);
        textView3.setOnClickListener(new ku3.r3(this));
        this.f394013r = textView3;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.gravity = 16;
        f().addView(this.f394011p, layoutParams);
        f().addView(this.f394012q, layoutParams);
        f().addView(this.f394013r, layoutParams);
        this.f394014s = this.f394011p;
    }
}
