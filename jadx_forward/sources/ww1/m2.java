package ww1;

/* loaded from: classes15.dex */
public final class m2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public m2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6185x2d8542e8 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6185x2d8542e8) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("code url: ");
        am.pz pzVar = event.f136443g;
        sb6.append(pzVar.f89205a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanPayCodeListener", sb6.toString());
        java.lang.ref.WeakReference weakReference = pzVar.f89215k;
        if (weakReference == null || weakReference.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanPayCodeListener", "context has destroyed");
            am.qz qzVar = event.f136444h;
            if (qzVar != null) {
                qzVar.f89287a = 2;
            }
            java.lang.Runnable runnable = pzVar.f89216l;
            if (runnable == null) {
                return false;
            }
            ((e04.s0) runnable).run();
            return false;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("qrcode_url", pzVar.f89205a);
        bundle.putInt("pay_channel", pzVar.f89206b);
        bundle.putInt("pay_scene", pzVar.f89207c);
        bundle.putInt("qrcode_session_type", pzVar.f89208d);
        bundle.putString("qrcode_session_name", pzVar.f89209e);
        bundle.putString("qrcode_sender_name", pzVar.f89210f);
        bundle.putString("qrcode_timeline_objid", pzVar.f89211g);
        bundle.putInt("chat_type", pzVar.f89212h);
        bundle.putInt("send_type", pzVar.f89213i);
        bundle.putString("msg_svr_id", pzVar.f89214j);
        ((h45.q) i95.n0.c(h45.q.class)).mo24836xf42d0927(bundle, new ww1.l2(event));
        return false;
    }
}
