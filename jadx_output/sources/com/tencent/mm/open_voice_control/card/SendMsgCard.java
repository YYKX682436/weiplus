package com.tencent.mm.open_voice_control.card;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/open_voice_control/card/SendMsgCard;", "Lcom/tencent/mm/open_voice_control/card/BaseCard;", "<init>", "()V", "open-voice-control-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SendMsgCard extends com.tencent.mm.open_voice_control.card.BaseCard {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f72243v = 0;
    public final jz5.g U1;
    public final jz5.g V1;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f72244e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f72245f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f72246g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f72247h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f72248i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f72249m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f72250n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f72251o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f72252p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f72253q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f72254r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.a f72255s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.p f72256t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f72257u;

    public SendMsgCard() {
        super(com.tencent.mm.R.layout.dy7);
        this.f72244e = jz5.h.b(new f41.o0(this));
        this.f72245f = jz5.h.b(new f41.q0(this));
        this.f72246g = jz5.h.b(new f41.m0(this));
        this.f72247h = jz5.h.b(new f41.f0(this));
        this.f72248i = jz5.h.b(new f41.a0(this));
        this.f72249m = jz5.h.b(new f41.n0(this));
        this.U1 = jz5.h.b(new r.l(this));
        this.f72250n = jz5.h.b(new f41.g0(this));
        this.V1 = jz5.h.b(new r.k(this));
        this.f72251o = jz5.h.b(new f41.d0(this));
        this.f72252p = jz5.h.b(new f41.e0(this));
        this.f72253q = jz5.h.b(new f41.b0(this));
        this.f72254r = jz5.h.b(new f41.c0(this));
        this.f72257u = "";
    }

    public static final void c(com.tencent.mm.open_voice_control.card.SendMsgCard sendMsgCard) {
        int f17 = e06.p.f(sendMsgCard.m0().getScrollY(), 0, sendMsgCard.f());
        if (f17 != sendMsgCard.m0().getScrollY()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clampHintScroll: scrollY=");
            sb6.append(sendMsgCard.m0().getScrollY());
            sb6.append(", target=");
            sb6.append(f17);
            sb6.append(", max=");
            sb6.append(sendMsgCard.f());
            sb6.append(", textLen=");
            java.lang.CharSequence text = sendMsgCard.m0().getText();
            sb6.append(text != null ? text.length() : 0);
            com.tencent.mars.xlog.Log.w("MicroMsg.OVC.SendMsgCard", sb6.toString());
            sendMsgCard.m0().scrollTo(0, f17);
        }
        sendMsgCard.g();
    }

    public final com.tencent.mm.view.MaxHeightFrameLayout d() {
        return (com.tencent.mm.view.MaxHeightFrameLayout) ((jz5.n) this.U1).getValue();
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
        android.view.View view = (android.view.View) ((jz5.n) this.V1).getValue();
        int i17 = m0().canScrollVertically(1) ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/open_voice_control/card/SendMsgCard", "updateGradientMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/open_voice_control/card/SendMsgCard", "updateGradientMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.open_voice_control.card.BaseCard
    public void l0() {
        com.tencent.wechat.aff.ovc.h hVar;
        ((android.widget.TextView) ((jz5.n) this.f72249m).getValue()).setText(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(n0(), true).g2());
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) ((jz5.n) this.f72248i).getValue(), n0(), null);
        m0().setMovementMethod(android.text.method.ScrollingMovementMethod.getInstance());
        android.content.Context context = m0().getContext();
        float a17 = i65.a.a(context, 26.0f);
        android.widget.TextView m07 = m0();
        kotlin.jvm.internal.o.d(context);
        float q17 = i65.a.q(context);
        if (i65.a.C(q17, i65.a.u(context)) || i65.a.C(q17, i65.a.v(context))) {
            q17 = i65.a.t(context);
        }
        m07.setTextSize(0, a17 * q17);
        m0().getViewTreeObserver().addOnScrollChangedListener(new f41.h0(this));
        m0().addOnLayoutChangeListener(new f41.i0(this));
        float min = java.lang.Math.min(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) / 400.0f;
        int i17 = (int) ((548 * min) + 0.5f);
        d().setMaxHeight((int) ((qf1.n.CTRL_INDEX * min) + 0.5f));
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = -1;
        jz5.g gVar = this.f72247h;
        ((android.view.View) ((jz5.n) gVar).getValue()).getViewTreeObserver().addOnPreDrawListener(new f41.j0(this, i17, f0Var));
        ((android.view.View) ((jz5.n) this.f72246g).getValue()).setOnClickListener(new f41.k0(this));
        ((android.view.View) ((jz5.n) gVar).getValue()).setOnClickListener(f41.l0.f259494d);
        ((android.view.View) ((jz5.n) this.f72251o).getValue()).setOnClickListener(new r.m(this));
        ((android.view.View) ((jz5.n) this.f72253q).getValue()).setOnClickListener(new r.n(this));
        ((android.view.View) ((jz5.n) this.f72254r).getValue()).setOnClickListener(new r.o(this));
        s.j jVar = h41.o0.f278836l;
        jz5.g gVar2 = this.f72244e;
        int intValue = ((java.lang.Number) ((jz5.n) gVar2).getValue()).intValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCardCreated: ");
        sb6.append(intValue);
        sb6.append(" uis ");
        java.util.HashMap hashMap = h41.o0.f278835g;
        java.util.Set keySet = hashMap.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        sb6.append(kz5.n0.g0(keySet, ",", null, null, 0, null, null, 62, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCMsgUI", sb6.toString());
        h41.o0 o0Var = (h41.o0) hashMap.get(java.lang.Integer.valueOf(intValue));
        if (o0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCMsgUI", "onCardCreated: ui not found, dismiss orphan card id=" + intValue);
            dismiss();
        } else if (o0Var.f278845k) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCMsgUI", "onCardCreated: already released, dismiss card");
            dismiss();
            jVar.a(o0Var.f278841e);
            o0Var.f278841e = 0;
        } else {
            o0Var.f278843i = this;
        }
        int intValue2 = ((java.lang.Number) ((jz5.n) gVar2).getValue()).intValue();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("attach: ");
        sb7.append(intValue2);
        sb7.append(" uis ");
        java.util.Set keySet2 = hashMap.keySet();
        kotlin.jvm.internal.o.f(keySet2, "<get-keys>(...)");
        sb7.append(kz5.n0.g0(keySet2, ",", null, null, 0, null, null, 62, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCMsgUI", sb7.toString());
        h41.o0 o0Var2 = (h41.o0) hashMap.get(java.lang.Integer.valueOf(intValue2));
        if (o0Var2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCMsgUI", "attach: ui not found, dismiss orphan card id=" + intValue2);
            dismiss();
            return;
        }
        if (o0Var2.f278845k) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCMsgUI", "attach: already released, dismiss card");
            this.f72255s = null;
            this.f72256t = null;
            dismiss();
            jVar.a(o0Var2.f278841e);
            o0Var2.f278841e = 0;
            return;
        }
        if (o0Var2.f278839c <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCMsgUI", "attach: openTaskId invalid");
            return;
        }
        boolean z17 = o0Var2.f278838b == null;
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCMsgUI", "attach: isFirstAttach=" + z17 + ", openTaskId=" + o0Var2.f278839c);
        o0Var2.f278843i = null;
        o0Var2.f278838b = this;
        this.f72255s = new h41.j0(o0Var2);
        this.f72256t = new h41.k0(o0Var2);
        if (!z17 || (hVar = o0Var2.f278837a) == null) {
            return;
        }
        hVar.c(o0Var2.f278839c);
    }

    public final android.widget.TextView m0() {
        return (android.widget.TextView) ((jz5.n) this.f72250n).getValue();
    }

    public final java.lang.String n0() {
        return (java.lang.String) ((jz5.n) this.f72245f).getValue();
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        s.j jVar = h41.o0.f278836l;
        int intValue = ((java.lang.Number) ((jz5.n) this.f72244e).getValue()).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCMsgUI", "detach: " + intValue);
        h41.o0 o0Var = (h41.o0) h41.o0.f278835g.get(java.lang.Integer.valueOf(intValue));
        if (o0Var != null) {
            if (o0Var.f278838b == this) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OVCMsgUI", "detach: clear card reference");
                o0Var.f278838b = null;
            }
            if (o0Var.f278843i == this) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OVCMsgUI", "detach: clear pending card reference");
                o0Var.f278843i = null;
            }
            this.f72255s = null;
            this.f72256t = null;
        }
        super.onDestroyView();
    }
}
