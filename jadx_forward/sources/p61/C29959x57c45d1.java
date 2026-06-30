package p61;

/* renamed from: p61.b2$$a */
/* loaded from: classes5.dex */
public final /* synthetic */ class C29959x57c45d1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public final void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5.E;
        if (bundle != null) {
            java.lang.String string = bundle.getString("key_wording_cfg");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BindMobilePolicyUI", "checkAndStartBindPhoneGuidance config is empty");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11364xda6e5bc5.h7(string);
            }
        }
    }
}
