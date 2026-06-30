package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes13.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19173xce219fad f262748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f262749e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19173xce219fad activityC19173xce219fad, java.lang.ref.WeakReference weakReference) {
        super(1);
        this.f262748d = activityC19173xce219fad;
        this.f262749e = weakReference;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        pr4.a aVar = (pr4.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<name for destructuring parameter 0>");
        pr4.j jVar = aVar.f439518a;
        int ordinal = jVar.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WecoinIapUI", "[WeCoin] consumeWeCoin failed, onError, type:" + jVar);
        } else if (ordinal == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WecoinIapUI", "[WeCoin] consumeWeCoin failed, insufficient, type:" + jVar);
        } else if (ordinal == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WecoinIapUI", "[WeCoin] consumeWeCoin failed, intercept, type:" + jVar);
        }
        int i17 = this.f262748d.f262662i;
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19173xce219fad activityC19173xce219fad = (com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19173xce219fad) this.f262749e.get();
        if (activityC19173xce219fad != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_err_code", jVar.ordinal());
            intent.putExtra("key_err_msg", jVar.name());
            activityC19173xce219fad.setResult(-1, intent);
            activityC19173xce219fad.finish();
        }
        return jz5.f0.f384359a;
    }
}
