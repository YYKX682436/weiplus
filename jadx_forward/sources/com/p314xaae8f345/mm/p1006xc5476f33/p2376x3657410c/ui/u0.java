package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes15.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19173xce219fad f262745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f262746e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19173xce219fad activityC19173xce219fad, java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f262745d = activityC19173xce219fad;
        this.f262746e = weakReference;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pr4.b bVar = (pr4.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<name for destructuring parameter 0>");
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var = gm0.j1.n().f354821b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19173xce219fad activityC19173xce219fad = this.f262745d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.r0 r0Var = activityC19173xce219fad.f262657d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.wallet_index.ui.WecoinIapData");
        r1Var.g(new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c1(r0Var.f262733i, r0Var.f262725a, r0Var.f262726b, r0Var.f262728d, 1, null));
        activityC19173xce219fad.f262661h = activityC19173xce219fad.f262660g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19173xce219fad activityC19173xce219fad2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19173xce219fad) this.f262746e.get();
        if (activityC19173xce219fad2 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WecoinIapUI", "showLoadingDialog!");
            activityC19173xce219fad2.f262664n = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC19173xce219fad2, activityC19173xce219fad2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.t0(activityC19173xce219fad2));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WecoinIapUI", "[WeCoin] consumeWeCoin onSuccess, data:%s", java.lang.Long.valueOf(bVar.f439519a));
        return jz5.f0.f384359a;
    }
}
