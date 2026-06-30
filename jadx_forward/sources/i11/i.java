package i11;

/* loaded from: classes12.dex */
public class i implements com.p314xaae8f345.mm.app.s5 {
    @Override // com.p314xaae8f345.mm.app.s5
    public void Jb(java.lang.String str) {
        if (i11.h.f368624J > 0 && i11.h.K > 0) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis() - i11.h.K;
            ob0.r2 r2Var = (ob0.r2) i95.n0.c(ob0.r2.class);
            int i17 = i11.h.f368624J;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.q) r2Var).getClass();
            java.util.List list = ri.p.f477492a;
            if (uptimeMillis > gi.d.c() && i17 > 0) {
                qh.b b17 = qh.b.b(uptimeMillis);
                if (b17.f444853m) {
                    long max = java.lang.Math.max(1L, uptimeMillis / 60000);
                    int c17 = b17.c();
                    int d17 = b17.d();
                    long j17 = i17 / max;
                    if (j17 > 2) {
                        java.lang.String f17 = ri.i.f();
                        java.lang.String str2 = b17.f444849i;
                        java.lang.String c18 = ri.j.c(null, true);
                        if (!android.text.TextUtils.isEmpty(b17.f444851k) && ("background".equals(b17.f444849i) || "bg".equals(b17.f444849i))) {
                            str2 = "bg-" + b17.f444851k;
                        }
                        java.lang.String str3 = str2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.BatteryReporter", "#reportTmsLocationException");
                        android.util.SparseArray sparseArray = ri.s.f477541a;
                        ri.s.b(1, 5, f17, "", c17, d17, "avgTmsLocationErr", j17, "", 0L, "duringMin", max, str3, null, b17.f444842b, b17.f444845e, b17.f444850j, c18);
                    }
                }
            }
        }
        i11.h.f368624J = 0;
        i11.h.K = -1L;
    }

    @Override // com.p314xaae8f345.mm.app.s5
    public void k2(java.lang.String str) {
        i11.h.K = android.os.SystemClock.uptimeMillis();
    }
}
