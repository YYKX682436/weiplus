package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class xh extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n8 {
    public static final java.util.Set H = kz5.z.D0(new java.lang.Integer[]{19, 6, 28, 25, 26, 27, 20, 21, 22, 23, 24, 29, 30});
    public static final android.text.InputFilter I = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.eh.f199784d;

    /* renamed from: J, reason: collision with root package name */
    public static final android.text.InputFilter f201857J = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fh.f199887d;
    public static final int K = 10;
    public r45.kv1 A;
    public java.lang.String B;
    public p3325xe03a0797.p3326xc267989b.r2 C;
    public int D;
    public final jz5.g E;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.oh F;
    public final jz5.g G;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f201858h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f201859i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f201860m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f201861n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.EditText f201862o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f201863p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.LinearLayout f201864q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.Map f201865r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f201866s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f201867t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f201868u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f201869v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f201870w;

    /* renamed from: x, reason: collision with root package name */
    public r45.yp1 f201871x;

    /* renamed from: y, reason: collision with root package name */
    public r45.kv1 f201872y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f201873z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aqi, (android.view.ViewGroup) this, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f201859i = inflate;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) inflate.findViewById(com.p314xaae8f345.mm.R.id.gre);
        ym5.l2 l2Var = ym5.l2.f544957a;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        c22789xd23e9a9b.o(ae2.in.f85221a.a(ym5.f6.f544848n));
        this.f201860m = c22789xd23e9a9b;
        this.f201861n = (android.widget.TextView) this.f201859i.findViewById(com.p314xaae8f345.mm.R.id.grf);
        this.f201862o = (android.widget.EditText) this.f201859i.findViewById(com.p314xaae8f345.mm.R.id.grd);
        this.f201863p = this.f201859i.findViewById(com.p314xaae8f345.mm.R.id.f565367c63);
        this.f201864q = (android.widget.LinearLayout) this.f201859i.findViewById(com.p314xaae8f345.mm.R.id.f565366c62);
        this.f201865r = new java.util.LinkedHashMap();
        this.f201866s = this.f201859i.findViewById(com.p314xaae8f345.mm.R.id.aud);
        android.view.View findViewById = this.f201859i.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        this.f201867t = findViewById;
        android.widget.TextView confirmBtn = (android.widget.TextView) this.f201859i.findViewById(com.p314xaae8f345.mm.R.id.c9z);
        this.f201868u = confirmBtn;
        this.f201869v = (android.widget.TextView) this.f201859i.findViewById(com.p314xaae8f345.mm.R.id.odf);
        this.f201870w = (android.widget.TextView) this.f201859i.findViewById(com.p314xaae8f345.mm.R.id.cut);
        this.f201873z = "";
        this.B = "";
        this.D = K;
        this.E = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.jh(this));
        this.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.oh(this);
        this.G = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kh(this));
        this.f201859i.setOnTouchListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ch.f199538d);
        j(false);
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dh(this));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(confirmBtn, "confirmBtn");
        m58110x3ab833d4(confirmBtn);
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xh xhVar) {
        xhVar.getClass();
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f314905a.i(mm2.c1.class);
        if (c1Var != null) {
            c1Var.N1 = false;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a = xhVar.m58104xb7f4f95a();
        if (m58104xb7f4f95a != null) {
            m58104xb7f4f95a.R0().mo46557x60d69242(qo0.b.Z2, bundle);
        }
    }

    /* renamed from: getLandScapeKeyBoardObserve */
    private final p012xc85e97e9.p093xedfae76a.k0 m58188x9ef1c4b0() {
        return (p012xc85e97e9.p093xedfae76a.k0) ((jz5.n) this.E).mo141623x754a37bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getModifyBottomPage */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gh m58189x3addff2a() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gh) ((jz5.n) this.G).mo141623x754a37bb();
    }

    public final boolean d() {
        r45.yp1 yp1Var = this.f201871x;
        return ((yp1Var != null ? yp1Var.m75939xb282bd08(3) : 0) & 2) > 0;
    }

    public final void e() {
        if (d()) {
            android.widget.EditText editText = this.f201862o;
            editText.setVisibility(8);
            this.f201861n.setVisibility(0);
            android.view.View view = this.f201866s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget", "changeToNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifyGiftWidget", "changeToNormalMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup.LayoutParams layoutParams = this.f201863p.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = 0;
            }
            if (editText != null) {
                editText.clearFocus();
            }
            android.content.Context context = getContext();
            java.lang.Object systemService = context != null ? context.getSystemService("input_method") : null;
            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
            }
        }
    }

    public final void f() {
        r45.kv1 kv1Var = this.A;
        if (kv1Var != null) {
            java.lang.String m75945x2fec8307 = kv1Var != null ? kv1Var.m75945x2fec8307(0) : null;
            r45.kv1 kv1Var2 = this.f201872y;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m75945x2fec8307, kv1Var2 != null ? kv1Var2.m75945x2fec8307(0) : null)) {
                j(true);
                return;
            }
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.B, this.f201873z)) {
            if (this.B.length() > 0) {
                j(true);
                return;
            }
        }
        j(false);
    }

    public final void g(r45.kv1 kv1Var) {
        this.A = kv1Var;
        ((java.util.LinkedHashMap) this.f201865r).forEach(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.mh(this));
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.C;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f201860m;
        c22789xd23e9a9b.n();
        c22789xd23e9a9b.m82582x3ae760af(0.0d);
        c22789xd23e9a9b.setVisibility(8);
        r45.kv1 kv1Var2 = this.A;
        if (kv1Var2 != null) {
            this.C = p3325xe03a0797.p3326xc267989b.l.d(m58106x7520e49e(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.lh(kv1Var2, this, null), 3, null);
        }
        f();
    }

    /* renamed from: getBackClickListener */
    public final yz5.a m58190x563007ff() {
        return this.f201858h;
    }

    /* renamed from: getRoot */
    public final android.view.View m58191xfb84e958() {
        return this.f201859i;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 r23, r45.yp1 r24, r45.kv1 r25, r45.qa0 r26) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.xh.h(com.tencent.mm.ui.widget.dialog.y1, r45.yp1, r45.kv1, r45.qa0):void");
    }

    public final void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a;
        zl2.r4 r4Var = zl2.r4.f555483a;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (!r4Var.Y1(context) || (m58104xb7f4f95a = m58104xb7f4f95a()) == null) {
            return;
        }
        ((mm2.e1) m58104xb7f4f95a.P0(mm2.e1.class)).B.m7809x1ff8439(m58104xb7f4f95a);
    }

    public final void j(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFansModifyGiftWidget", "updateConfirmBtn canConfirm:" + z17);
        android.widget.TextView confirmBtn = this.f201868u;
        confirmBtn.setEnabled(z17);
        zl2.r4 r4Var = zl2.r4.f555483a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(confirmBtn, "confirmBtn");
        r4Var.Y2(confirmBtn, z17, true);
    }

    /* renamed from: setBackClickListener */
    public final void m58192x31c61473(yz5.a aVar) {
        this.f201858h = aVar;
    }

    /* renamed from: setRoot */
    public final void m58193x764fb064(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<set-?>");
        this.f201859i = view;
    }
}
