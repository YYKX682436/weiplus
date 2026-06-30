package com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/open_voice_control/card/SelectContactCard;", "Lcom/tencent/mm/open_voice_control/card/BaseCard;", "<init>", "()V", "f41/n", "open-voice-control-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.open_voice_control.card.SelectContactCard */
/* loaded from: classes11.dex */
public final class C11202x49ad0094 extends com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f153767p = 0;
    public final jz5.g U1;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f153768e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f153769f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f153770g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f153771h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f153772i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f153773m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f153774n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f153775o;

    public C11202x49ad0094() {
        super(com.p314xaae8f345.mm.R.C30864xbddafb2a.dy6);
        this.f153768e = jz5.h.b(new f41.z(this));
        this.f153769f = jz5.h.b(new f41.x(this));
        this.f153770g = jz5.h.b(new f41.o(this));
        this.f153771h = jz5.h.b(new f41.w(this));
        this.f153772i = jz5.h.b(new f41.q(this));
        this.f153773m = jz5.h.b(new f41.y(this));
        this.U1 = jz5.h.b(new r.i(this));
        this.f153774n = jz5.h.b(new f41.p(this));
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.C22790xd706766c c() {
        return (com.p314xaae8f345.mm.p2776x373aa5.C22790xd706766c) ((jz5.n) this.U1).mo141623x754a37bb();
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [com.tencent.mm.open_voice_control.card.SelectContactCard$initView$adapter$2] */
    @Override // com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1
    public void l0() {
        int i17;
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.l lVar;
        int ordinal = ((f41.n) ((jz5.n) this.f153769f).mo141623x754a37bb()).ordinal();
        if (ordinal == 0) {
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.pgg;
        } else if (ordinal == 1) {
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.pgd;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.pge;
        }
        ((android.widget.TextView) ((jz5.n) this.f153773m).mo141623x754a37bb()).setText(i17);
        ((android.view.View) ((jz5.n) this.f153770g).mo141623x754a37bb()).setOnClickListener(new f41.r(this));
        ((android.view.View) ((jz5.n) this.f153771h).mo141623x754a37bb()).setOnClickListener(new f41.s(this));
        jz5.g gVar = this.f153772i;
        ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setOnClickListener(f41.t.f341047d);
        jz5.g gVar2 = this.f153774n;
        ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar2).mo141623x754a37bb()).mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo7438x76847179()));
        int min = (int) ((548 * (java.lang.Math.min(m7460x893a2f6f().getDisplayMetrics().widthPixels, m7460x893a2f6f().getDisplayMetrics().heightPixels) / 400.0f)) + 0.5f);
        c().m82585x25bfb969(min);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var.f391649d = -1;
        ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).getViewTreeObserver().addOnPreDrawListener(new r.j(this, min, f0Var));
        ?? r17 = new in5.s() { // from class: com.tencent.mm.open_voice_control.card.SelectContactCard$initView$adapter$2
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new f41.d();
            }
        };
        android.os.Bundle m7436x8619eaa0 = m7436x8619eaa0();
        java.lang.String[] stringArray = m7436x8619eaa0 != null ? m7436x8619eaa0.getStringArray("usernames") : null;
        if (stringArray == null) {
            stringArray = new java.lang.String[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(stringArray.length);
        for (java.lang.String str : stringArray) {
            arrayList.add(new f41.r0(str));
        }
        f41.v vVar = new f41.v(r17, new java.util.ArrayList(arrayList));
        ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar2).mo141623x754a37bb()).mo7960x6cab2c8d(vVar);
        vVar.B = new com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11203x4efd2d35();
        s.l lVar2 = h41.y0.f360426k;
        jz5.g gVar3 = this.f153768e;
        int intValue = ((java.lang.Number) ((jz5.n) gVar3).mo141623x754a37bb()).intValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCardCreated: ");
        sb6.append(intValue);
        sb6.append(" uis ");
        java.util.HashMap hashMap = h41.y0.f360425f;
        java.util.Set keySet = hashMap.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        sb6.append(kz5.n0.g0(keySet, ",", null, null, 0, null, null, 62, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCSelectContactUI", sb6.toString());
        h41.y0 y0Var = (h41.y0) hashMap.get(java.lang.Integer.valueOf(intValue));
        if (y0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCSelectContactUI", "onCardCreated: ui not found, dismiss orphan card id=" + intValue);
            m48373x63a3b28a();
        } else if (y0Var.f360434j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCSelectContactUI", "onCardCreated: already released, dismiss card");
            m48373x63a3b28a();
            lVar2.a(y0Var.f360430d);
            y0Var.f360430d = 0;
        } else {
            y0Var.f360432h = this;
        }
        int intValue2 = ((java.lang.Number) ((jz5.n) gVar3).mo141623x754a37bb()).intValue();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("attach: ");
        sb7.append(intValue2);
        sb7.append(" uis ");
        java.util.Set keySet2 = hashMap.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet2, "<get-keys>(...)");
        sb7.append(kz5.n0.g0(keySet2, ",", null, null, 0, null, null, 62, null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCSelectContactUI", sb7.toString());
        h41.y0 y0Var2 = (h41.y0) hashMap.get(java.lang.Integer.valueOf(intValue2));
        if (y0Var2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCSelectContactUI", "attach: ui not found, dismiss orphan card id=" + intValue2);
            m48373x63a3b28a();
            return;
        }
        if (y0Var2.f360434j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCSelectContactUI", "attach: already released, dismiss card");
            this.f153775o = null;
            m48373x63a3b28a();
            lVar2.a(y0Var2.f360430d);
            y0Var2.f360430d = 0;
            return;
        }
        if (y0Var2.f360429c <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCSelectContactUI", "attach: openTaskId invalid");
            return;
        }
        boolean z17 = y0Var2.f360428b == null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCSelectContactUI", "attach: isFirstAttach=" + z17 + ", openTaskId=" + y0Var2.f360429c);
        y0Var2.f360432h = null;
        y0Var2.f360428b = this;
        this.f153775o = new h41.u0(y0Var2);
        if (!z17 || (lVar = y0Var2.f360427a) == null) {
            return;
        }
        lVar.c(y0Var2.f360429c);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        s.l lVar = h41.y0.f360426k;
        int intValue = ((java.lang.Number) ((jz5.n) this.f153768e).mo141623x754a37bb()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCSelectContactUI", "detach: " + intValue);
        h41.y0 y0Var = (h41.y0) h41.y0.f360425f.get(java.lang.Integer.valueOf(intValue));
        if (y0Var != null) {
            if (y0Var.f360428b == this) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCSelectContactUI", "detach: clear card reference");
                y0Var.f360428b = null;
            }
            if (y0Var.f360432h == this) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCSelectContactUI", "detach: clear pending card reference");
                y0Var.f360432h = null;
            }
            this.f153775o = null;
        }
        super.mo7399xa6664a60();
    }
}
