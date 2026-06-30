package oy1;

/* loaded from: classes13.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oy1.s f431451d;

    public q(oy1.s sVar) {
        this.f431451d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        java.util.Iterator it = ((java.util.LinkedHashMap) this.f431451d.f431458f).keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            oy1.m mVar = oy1.m.f431418a;
            java.util.List list = oy1.m.f431422e;
            if (list != null) {
                z17 = ((java.util.ArrayList) list).contains(java.lang.Integer.valueOf(intValue));
            } else {
                z17 = true;
            }
            if (z17) {
                oy1.c0 a17 = oy1.u.f431461a.a(intValue);
                if (a17 != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 i17 = a17.i();
                    android.os.Message mo50288x733c63a2 = a17.i().mo50288x733c63a2();
                    mo50288x733c63a2.what = 1003;
                    i17.mo50308x2936bf5f(mo50288x733c63a2);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiReporter", "bizId = " + intValue + " start do history msg!");
            }
        }
    }
}
