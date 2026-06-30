package com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/open_voice_control/card/PermissionRequestCard;", "Lcom/tencent/mm/open_voice_control/card/BaseCard;", "<init>", "()V", "open-voice-control-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.open_voice_control.card.PermissionRequestCard */
/* loaded from: classes11.dex */
public final class C11201x6771ccd0 extends com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f153759o = 0;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f153760e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f153761f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f153762g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f153763h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f153764i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f153765m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.a f153766n;

    public C11201x6771ccd0() {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569395dy5);
        this.f153760e = jz5.h.b(new f41.m(this));
        this.f153761f = jz5.h.b(new f41.l(this));
        this.f153762g = jz5.h.b(new f41.g(this));
        this.f153763h = jz5.h.b(new f41.f(this));
        this.f153764i = jz5.h.b(new f41.e(this));
    }

    @Override // com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1
    public void l0() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.j jVar;
        android.view.View mo26077x4ff8c0f0 = mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.cut);
        android.widget.TextView textView = mo26077x4ff8c0f0 instanceof android.widget.TextView ? (android.widget.TextView) mo26077x4ff8c0f0 : null;
        if (textView != null) {
            textView.setText(m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.pgb));
        }
        ((android.view.View) ((jz5.n) this.f153761f).mo141623x754a37bb()).setOnClickListener(f41.h.f341016d);
        ((android.view.View) ((jz5.n) this.f153762g).mo141623x754a37bb()).setOnClickListener(f41.i.f341018d);
        ((android.view.View) ((jz5.n) this.f153763h).mo141623x754a37bb()).setOnClickListener(new f41.j(this));
        ((android.view.View) ((jz5.n) this.f153764i).mo141623x754a37bb()).setOnClickListener(new f41.k(this));
        s.k kVar = h41.t0.f360393k;
        jz5.g gVar = this.f153760e;
        int intValue = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCardCreated: ");
        sb6.append(intValue);
        sb6.append(" uis ");
        java.util.HashMap hashMap = h41.t0.f360392f;
        java.util.Set keySet = hashMap.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        sb6.append(kz5.n0.g0(keySet, ",", null, null, 0, null, null, 62, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCPermissionRequestUI", sb6.toString());
        h41.t0 t0Var = (h41.t0) hashMap.get(java.lang.Integer.valueOf(intValue));
        if (t0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCPermissionRequestUI", "onCardCreated: ui not found, dismiss orphan card id=" + intValue);
            m48373x63a3b28a();
        } else if (t0Var.f360401j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCPermissionRequestUI", "onCardCreated: already released, dismiss card");
            m48373x63a3b28a();
            kVar.a(t0Var.f360397d);
            t0Var.f360397d = 0;
        } else {
            t0Var.f360399h = this;
        }
        int intValue2 = ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("attach: ");
        sb7.append(intValue2);
        sb7.append(" uis ");
        java.util.Set keySet2 = hashMap.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet2, "<get-keys>(...)");
        sb7.append(kz5.n0.g0(keySet2, ",", null, null, 0, null, null, 62, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCPermissionRequestUI", sb7.toString());
        h41.t0 t0Var2 = (h41.t0) hashMap.get(java.lang.Integer.valueOf(intValue2));
        if (t0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCPermissionRequestUI", "attach: ui not found, dismiss orphan card id=" + intValue2);
            m48373x63a3b28a();
            return;
        }
        if (t0Var2.f360401j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCPermissionRequestUI", "attach: already released, dismiss card");
            this.f153766n = null;
            this.f153765m = null;
            m48373x63a3b28a();
            kVar.a(t0Var2.f360397d);
            t0Var2.f360397d = 0;
            return;
        }
        if (t0Var2.f360396c <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCPermissionRequestUI", "attach: openTaskId invalid");
            return;
        }
        boolean z17 = t0Var2.f360395b == null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCPermissionRequestUI", "attach: isFirstAttach=" + z17 + ", openTaskId=" + t0Var2.f360396c);
        t0Var2.f360399h = null;
        t0Var2.f360395b = this;
        this.f153766n = new h41.p0(t0Var2);
        this.f153765m = new h41.q0(t0Var2);
        if (!z17 || (jVar = t0Var2.f360394a) == null) {
            return;
        }
        jVar.c(t0Var2.f360396c);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        s.k kVar = h41.t0.f360393k;
        int intValue = ((java.lang.Number) ((jz5.n) this.f153760e).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCPermissionRequestUI", "detach: " + intValue);
        h41.t0 t0Var = (h41.t0) h41.t0.f360392f.get(java.lang.Integer.valueOf(intValue));
        if (t0Var != null) {
            if (t0Var.f360395b == this) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCPermissionRequestUI", "detach: clear card reference");
                t0Var.f360395b = null;
            }
            if (t0Var.f360399h == this) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCPermissionRequestUI", "detach: clear pending card reference");
                t0Var.f360399h = null;
            }
            this.f153766n = null;
            this.f153765m = null;
        }
        super.mo7399xa6664a60();
    }
}
