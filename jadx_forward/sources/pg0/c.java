package pg0;

/* loaded from: classes9.dex */
public final class c extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public c() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5331xbad3b2c6 event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5331xbad3b2c6) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.x4 x4Var = event.f135644g;
        java.lang.ref.WeakReference weakReference = x4Var.f89878b;
        if (weakReference == null || weakReference.get() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLedger", "callback contextRef is null");
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedger", "receive talker:%s", x4Var.f89877a);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_talker", x4Var.f89877a);
        java.lang.Object obj = x4Var.f89878b.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type android.content.Context");
        j45.l.j((android.content.Context) obj, "wallet_core", ".ui.ledger.WalletLedgerMainUI", intent, null);
        return true;
    }
}
