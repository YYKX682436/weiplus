package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes15.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f262752d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.lang.ref.WeakReference weakReference) {
        super(0);
        this.f262752d = weakReference;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WecoinIapUI", "[WeCoin] consumeWeCoin user cancel");
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19173xce219fad activityC19173xce219fad = (com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19173xce219fad) this.f262752d.get();
        if (activityC19173xce219fad != null) {
            nt4.f a17 = nt4.f.a(1);
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19173xce219fad.f262656p;
            activityC19173xce219fad.U6(a17, -1);
        }
        return jz5.f0.f384359a;
    }
}
