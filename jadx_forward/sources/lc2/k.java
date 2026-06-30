package lc2;

/* loaded from: classes8.dex */
public final class k extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public k() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6261x1674b3 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6261x1674b3) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onWeChatTabRedDotEvent: ");
        am.g20 g20Var = event.f136512g;
        sb6.append(g20Var != null ? java.lang.Integer.valueOf(g20Var.f88264a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderWechatTabRedDotEventListener", sb6.toString());
        return false;
    }
}
