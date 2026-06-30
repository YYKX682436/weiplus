package rh5;

/* loaded from: classes3.dex */
public final class c implements oc5.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f477347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61 f477348b;

    public c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61 c22446x23f86f61) {
        this.f477347a = activityC0065xcd7aa112;
        this.f477348b = c22446x23f86f61;
    }

    @Override // oc5.o
    public void a(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5751x758c1063 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleCode callback notifyEvent: ");
        am.kl klVar = event.f136072g;
        sb6.append(klVar.f88701c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.DefaultQRCodeScanComponent", sb6.toString());
        android.app.Activity activity = klVar.f88700b;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f477347a;
        if (activity == activityC0065xcd7aa112) {
            java.lang.String str = klVar.f88699a;
            com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22446x23f86f61 c22446x23f86f61 = this.f477348b;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, c22446x23f86f61.f290663m)) {
                if (klVar.f88701c != 3) {
                    return;
                }
                android.os.Bundle bundle = klVar.f88702d;
                if (bundle != null) {
                    bundle.getBoolean("key_scan_qr_code_result", true);
                }
                c22446x23f86f61.f290663m = "";
                com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) activityC0065xcd7aa112 : null;
                if (abstractActivityC22579xbed01a37 != null) {
                    abstractActivityC22579xbed01a37.m81179x83e1199b();
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.DefaultQRCodeScanComponent", "handleCode callback not the same");
    }
}
