package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class lq implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f242837d;

    public lq(java.lang.ref.WeakReference weakUic) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakUic, "weakUic");
        this.f242837d = weakUic;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq tqVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.tq) this.f242837d.get();
        if (tqVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.YuanBaoAvatarUIC", "prefetchAdInfo callback: UIC already released, skip");
        } else {
            tqVar.f243120d = mVar;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prefetchAdInfo: result aid=");
            sb6.append(mVar != null ? mVar.f536286a : null);
            sb6.append(", hintText=");
            sb6.append(mVar != null ? mVar.f536287b : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.YuanBaoAvatarUIC", sb6.toString());
        }
        return jz5.f0.f384359a;
    }
}
