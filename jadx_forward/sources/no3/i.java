package no3;

/* loaded from: classes11.dex */
public class i implements com.p314xaae8f345.mm.p2621x8fb0427b.i8 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f420294d = true;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Map f420295e = null;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f420296f = new no3.h(this, android.os.Looper.getMainLooper());

    @Override // com.p314xaae8f345.mm.p2621x8fb0427b.i8
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotificationObserver", "event: %d", java.lang.Integer.valueOf(i17));
        if (obj instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) obj;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            int i18 = 0;
            if (!(c01.d9.f118638b == null)) {
                i18 = (int) ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).q(str).E2;
                ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).k0(str);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f420296f;
            n3Var.mo50303x856b99f0(i18);
            android.os.Message obtain = android.os.Message.obtain();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("com.tencent.mm.notification.observer", str);
            obtain.setData(bundle);
            obtain.what = i18;
            n3Var.mo50311x7ab51103(obtain, 50L);
        }
    }
}
