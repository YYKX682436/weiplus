package lo3;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f401711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lo3.b f401712e;

    public a(lo3.b bVar, android.content.Intent intent) {
        this.f401712e = bVar;
        this.f401711d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        lo3.c cVar = this.f401712e.f401713a;
        android.content.Intent intent = this.f401711d;
        lo3.c cVar2 = lo3.c.INSTANCE;
        cVar.getClass();
        try {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_disable_receive_oppo_app_feature, 0) > 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ORIM", "disable orim");
                return;
            }
            android.os.Bundle bundleExtra = intent.getBundleExtra("sendData");
            if (bundleExtra == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ORIM", "sendData is null");
                return;
            }
            byte[] byteArray = bundleExtra.getByteArray("sendData");
            if (byteArray == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ORIM", "sendData is empty");
                return;
            }
            r45.k25 k25Var = new r45.k25();
            k25Var.mo11468x92b714fd(byteArray);
            if (k25Var.f459865d != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ORIM", "ret error:" + k25Var.f459865d);
                return;
            }
            if (android.text.TextUtils.isEmpty(k25Var.f459867f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ORIM", "id is empty");
                return;
            }
            com.p314xaae8f345.mm.p971x6de15a2e.g1 c17 = com.p314xaae8f345.mm.p971x6de15a2e.x2.c();
            if (c17 != null && c17.f153526n != null) {
                byte[] bArr = null;
                android.os.Bundle call = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver().call(android.net.Uri.parse("content://com.oplus.phonemanager.AppRiskProvider"), k25Var.f459867f, (java.lang.String) null, (android.os.Bundle) null);
                if (call == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ORIM", "return null");
                } else {
                    byte[] byteArray2 = call.getByteArray("outputData");
                    if (byteArray2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ORIM", "result is null");
                    } else {
                        bArr = byteArray2;
                    }
                }
                if (bArr == null) {
                    return;
                }
                w04.l.INSTANCE.D7(bArr);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ORIM", "error: " + th6);
        }
    }
}
