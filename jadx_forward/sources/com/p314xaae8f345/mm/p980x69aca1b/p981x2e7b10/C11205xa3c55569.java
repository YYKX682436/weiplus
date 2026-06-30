package com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/open_voice_control/card/SendMsgCard;", "Lcom/tencent/mm/open_voice_control/card/BaseCard;", "<init>", "()V", "open-voice-control-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.open_voice_control.card.SendMsgCard */
/* loaded from: classes11.dex */
public final class C11205xa3c55569 extends com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1 {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f153776v = 0;
    public final jz5.g U1;
    public final jz5.g V1;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f153777e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f153778f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f153779g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f153780h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f153781i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f153782m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f153783n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f153784o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f153785p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f153786q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f153787r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f153788s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.p f153789t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f153790u;

    public C11205xa3c55569() {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.dy7);
        this.f153777e = jz5.h.b(new f41.o0(this));
        this.f153778f = jz5.h.b(new f41.q0(this));
        this.f153779g = jz5.h.b(new f41.m0(this));
        this.f153780h = jz5.h.b(new f41.f0(this));
        this.f153781i = jz5.h.b(new f41.a0(this));
        this.f153782m = jz5.h.b(new f41.n0(this));
        this.U1 = jz5.h.b(new r.l(this));
        this.f153783n = jz5.h.b(new f41.g0(this));
        this.V1 = jz5.h.b(new r.k(this));
        this.f153784o = jz5.h.b(new f41.d0(this));
        this.f153785p = jz5.h.b(new f41.e0(this));
        this.f153786q = jz5.h.b(new f41.b0(this));
        this.f153787r = jz5.h.b(new f41.c0(this));
        this.f153790u = "";
    }

    public static final void c(com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 c11205xa3c55569) {
        int f17 = e06.p.f(c11205xa3c55569.m0().getScrollY(), 0, c11205xa3c55569.f());
        if (f17 != c11205xa3c55569.m0().getScrollY()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clampHintScroll: scrollY=");
            sb6.append(c11205xa3c55569.m0().getScrollY());
            sb6.append(", target=");
            sb6.append(f17);
            sb6.append(", max=");
            sb6.append(c11205xa3c55569.f());
            sb6.append(", textLen=");
            java.lang.CharSequence text = c11205xa3c55569.m0().getText();
            sb6.append(text != null ? text.length() : 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVC.SendMsgCard", sb6.toString());
            c11205xa3c55569.m0().scrollTo(0, f17);
        }
        c11205xa3c55569.g();
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22790xd706766c d() {
        return (com.p314xaae8f345.mm.p2776x373aa5.C22790xd706766c) ((jz5.n) this.U1).mo141623x754a37bb();
    }

    public final int f() {
        android.text.Layout layout = m0().getLayout();
        int height = (layout != null ? layout.getHeight() : 0) - m0().getHeight();
        if (height < 0) {
            return 0;
        }
        return height;
    }

    public final void g() {
        android.view.View view = (android.view.View) ((jz5.n) this.V1).mo141623x754a37bb();
        int i17 = m0().canScrollVertically(1) ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/open_voice_control/card/SendMsgCard", "updateGradientMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/open_voice_control/card/SendMsgCard", "updateGradientMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1
    public void l0() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.h hVar;
        ((android.widget.TextView) ((jz5.n) this.f153782m).mo141623x754a37bb()).setText(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(n0(), true).g2());
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) ((jz5.n) this.f153781i).mo141623x754a37bb(), n0(), null);
        m0().setMovementMethod(android.text.method.ScrollingMovementMethod.getInstance());
        android.content.Context context = m0().getContext();
        float a17 = i65.a.a(context, 26.0f);
        android.widget.TextView m07 = m0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        float q17 = i65.a.q(context);
        if (i65.a.C(q17, i65.a.u(context)) || i65.a.C(q17, i65.a.v(context))) {
            q17 = i65.a.t(context);
        }
        m07.setTextSize(0, a17 * q17);
        m0().getViewTreeObserver().addOnScrollChangedListener(new f41.h0(this));
        m0().addOnLayoutChangeListener(new f41.i0(this));
        float min = java.lang.Math.min(m7460x893a2f6f().getDisplayMetrics().widthPixels, m7460x893a2f6f().getDisplayMetrics().heightPixels) / 400.0f;
        int i17 = (int) ((548 * min) + 0.5f);
        d().m82585x25bfb969((int) ((qf1.n.f76483x366c91de * min) + 0.5f));
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = -1;
        jz5.g gVar = this.f153780h;
        ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).getViewTreeObserver().addOnPreDrawListener(new f41.j0(this, i17, f0Var));
        ((android.view.View) ((jz5.n) this.f153779g).mo141623x754a37bb()).setOnClickListener(new f41.k0(this));
        ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setOnClickListener(f41.l0.f341027d);
        ((android.view.View) ((jz5.n) this.f153784o).mo141623x754a37bb()).setOnClickListener(new r.m(this));
        ((android.view.View) ((jz5.n) this.f153786q).mo141623x754a37bb()).setOnClickListener(new r.n(this));
        ((android.view.View) ((jz5.n) this.f153787r).mo141623x754a37bb()).setOnClickListener(new r.o(this));
        s.j jVar = h41.o0.f360369l;
        jz5.g gVar2 = this.f153777e;
        int intValue = ((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCardCreated: ");
        sb6.append(intValue);
        sb6.append(" uis ");
        java.util.HashMap hashMap = h41.o0.f360368g;
        java.util.Set keySet = hashMap.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        sb6.append(kz5.n0.g0(keySet, ",", null, null, 0, null, null, 62, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCMsgUI", sb6.toString());
        h41.o0 o0Var = (h41.o0) hashMap.get(java.lang.Integer.valueOf(intValue));
        if (o0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCMsgUI", "onCardCreated: ui not found, dismiss orphan card id=" + intValue);
            m48373x63a3b28a();
        } else if (o0Var.f360378k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCMsgUI", "onCardCreated: already released, dismiss card");
            m48373x63a3b28a();
            jVar.a(o0Var.f360374e);
            o0Var.f360374e = 0;
        } else {
            o0Var.f360376i = this;
        }
        int intValue2 = ((java.lang.Number) ((jz5.n) gVar2).mo141623x754a37bb()).intValue();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("attach: ");
        sb7.append(intValue2);
        sb7.append(" uis ");
        java.util.Set keySet2 = hashMap.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet2, "<get-keys>(...)");
        sb7.append(kz5.n0.g0(keySet2, ",", null, null, 0, null, null, 62, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCMsgUI", sb7.toString());
        h41.o0 o0Var2 = (h41.o0) hashMap.get(java.lang.Integer.valueOf(intValue2));
        if (o0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCMsgUI", "attach: ui not found, dismiss orphan card id=" + intValue2);
            m48373x63a3b28a();
            return;
        }
        if (o0Var2.f360378k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCMsgUI", "attach: already released, dismiss card");
            this.f153788s = null;
            this.f153789t = null;
            m48373x63a3b28a();
            jVar.a(o0Var2.f360374e);
            o0Var2.f360374e = 0;
            return;
        }
        if (o0Var2.f360372c <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCMsgUI", "attach: openTaskId invalid");
            return;
        }
        boolean z17 = o0Var2.f360371b == null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCMsgUI", "attach: isFirstAttach=" + z17 + ", openTaskId=" + o0Var2.f360372c);
        o0Var2.f360376i = null;
        o0Var2.f360371b = this;
        this.f153788s = new h41.j0(o0Var2);
        this.f153789t = new h41.k0(o0Var2);
        if (!z17 || (hVar = o0Var2.f360370a) == null) {
            return;
        }
        hVar.c(o0Var2.f360372c);
    }

    public final android.widget.TextView m0() {
        return (android.widget.TextView) ((jz5.n) this.f153783n).mo141623x754a37bb();
    }

    public final java.lang.String n0() {
        return (java.lang.String) ((jz5.n) this.f153778f).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        s.j jVar = h41.o0.f360369l;
        int intValue = ((java.lang.Number) ((jz5.n) this.f153777e).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCMsgUI", "detach: " + intValue);
        h41.o0 o0Var = (h41.o0) h41.o0.f360368g.get(java.lang.Integer.valueOf(intValue));
        if (o0Var != null) {
            if (o0Var.f360371b == this) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCMsgUI", "detach: clear card reference");
                o0Var.f360371b = null;
            }
            if (o0Var.f360376i == this) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCMsgUI", "detach: clear pending card reference");
                o0Var.f360376i = null;
            }
            this.f153788s = null;
            this.f153789t = null;
        }
        super.mo7399xa6664a60();
    }
}
