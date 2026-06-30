package gi5;

/* loaded from: classes3.dex */
public final class p extends com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61
    public oc5.l0 W6(cg3.d scanResult) {
        r45.gp0 gp0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scanResult, "scanResult");
        oc5.l0 W6 = super.W6(scanResult);
        W6.f425992i = 8;
        W6.f425989f = 30;
        W6.f425987d = true;
        android.content.Intent m158359x1e885992 = m158359x1e885992();
        W6.f425993j = m158359x1e885992 != null ? m158359x1e885992.getBundleExtra("_stat_obj") : null;
        mf3.k kVar = scanResult.f122685f;
        ai5.c cVar = kVar instanceof ai5.c ? (ai5.c) kVar : null;
        if (cVar != null && (gp0Var = cVar.f86740a) != null) {
            W6.f425995l = gp0Var.f456967s;
            W6.f425994k = gp0Var.f456971u;
            W6.f425996m = ((ai5.c) kVar).g();
        }
        android.os.Bundle bundle = W6.f425993j;
        if (bundle == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordOCRComponent", "addStatInfo4AppBrand, statObj is null");
            bundle = new android.os.Bundle();
            W6.f425993j = bundle;
        }
        android.content.Intent intent = m158354x19263085().getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra("chatTypeForAppbrand", -1);
            int intExtra2 = intent.getIntExtra("from_scene", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordOCRComponent", "addStatInfo4AppBrand, fromScene: %d, chatType: %d", java.lang.Integer.valueOf(intExtra2), java.lang.Integer.valueOf(intExtra));
            if (1 == intExtra2) {
                bundle.putInt("LaunchCodeScene_ScanScene", 4);
            } else {
                bundle.putInt("LaunchCodeScene_ScanScene", 1);
                bundle.putInt("LaunchCodeScene_ChatType", intExtra);
            }
        }
        android.os.Bundle bundle2 = W6.f425993j;
        if (bundle2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.RecordOCRComponent", "addStatInfo4GetA8Key, statObj is null");
            bundle2 = new android.os.Bundle();
            W6.f425993j = bundle2;
        }
        android.content.Intent intent2 = m158354x19263085().getIntent();
        if (intent2 != null) {
            try {
                cl0.g gVar = new cl0.g(intent2.getStringExtra("params"));
                long optLong = gVar.optLong("msgSvrId");
                java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("msgTalker");
                java.lang.String mo15082x48bce8a42 = gVar.mo15082x48bce8a4("msgSender");
                bundle2.putLong("serverMsgID", optLong);
                bundle2.putString("geta8key_username", mo15082x48bce8a4);
                bundle2.putString("msgUsername", mo15082x48bce8a42);
                bundle2.putInt("KMsgType", 49);
                bundle2.putInt("KAppMsgType", 19);
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.RecordOCRComponent", "addStatInfo4GetA8Key, parse params error");
            }
        }
        return W6;
    }
}
