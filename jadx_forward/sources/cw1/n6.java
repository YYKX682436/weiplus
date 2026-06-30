package cw1;

/* loaded from: classes8.dex */
public class n6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f304716d;

    public n6(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13122x435a878b activityC13122x435a878b, long j17) {
        this.f304716d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        int i17;
        int i18;
        java.lang.String m17 = gm0.j1.u().m();
        if (m17 == null) {
            m17 = "null";
        }
        java.lang.String str = m17;
        try {
            j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().q("other_storage_other_account_" + gm0.j1.b().j(), -1L);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CleanNewUI", "get other_storage_other_account failed : " + th6.getMessage());
            j17 = 0L;
        }
        long j18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("extreme_storage_wechat_total", -1L);
        long j19 = this.f304716d;
        long j27 = j17 >= 0 ? j19 - j17 : j19;
        if (j18 != -1) {
            float f17 = (float) j18;
            i17 = (int) ((((float) j19) / f17) * 100.0f);
            i18 = (int) ((((float) j27) / f17) * 100.0f);
        } else {
            i17 = -1;
            i18 = -1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25984, 50, "updateOtherRoot", "", "", java.lang.Long.valueOf(j27), java.lang.Long.valueOf(j19), str, 0, 0, 0, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }
}
