package pj;

/* loaded from: classes12.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Map f436443a = java.util.Collections.emptyMap();

    public static void a() {
        java.lang.String valueOf;
        try {
            valueOf = fp.s0.b(android.os.Build.FINGERPRINT, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        } catch (java.lang.Throwable unused) {
            valueOf = java.lang.String.valueOf(o45.wf.f424562g);
        }
        java.lang.String string = e().getString("batt_amp_last_fp", null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.battery.PowerManagerCompat", "checkIfExpired: curr=" + valueOf + ", last=" + string);
        if (valueOf.equals(string) || android.text.TextUtils.isEmpty(valueOf)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.battery.PowerManagerCompat", "Expired!");
        e().clear();
        e().putString("batt_amp_last_fp", valueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(java.lang.String r16, java.lang.String r17, java.lang.String r18, m3.i r19) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pj.i.b(java.lang.String, java.lang.String, java.lang.String, m3.i):void");
    }

    public static java.lang.Boolean c(android.content.Context context) {
        int i17 = e().getInt("batt_amp_micro_pos", 0);
        int i18 = e().getInt("batt_amp_micro_neg", 0);
        if (i18 >= 0 && i17 > i18) {
            return java.lang.Boolean.TRUE;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.battery.PowerManagerCompat", "isMicroAmp low specs: " + wh.m.h(context) + ", " + i17 + " vs " + i18);
        if (!wh.m.w(context)) {
            long h17 = wh.m.h(context);
            if (h17 != -1) {
                return java.lang.Boolean.valueOf(h17 > ((long) 1000));
            }
        }
        return null;
    }

    public static java.lang.Boolean d(android.content.Context context) {
        int i17 = e().getInt("batt_amp_uncharge_pos", 0);
        int i18 = e().getInt("batt_amp_uncharge_neg", 0);
        if (i18 >= 0 && i17 > i18) {
            return java.lang.Boolean.TRUE;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.battery.PowerManagerCompat", "isPositiveInCharge low specs: " + wh.m.h(context) + ", " + i17 + " vs " + i18);
        if (wh.m.w(context)) {
            return null;
        }
        long h17 = wh.m.h(context);
        if (h17 == -1) {
            return null;
        }
        return java.lang.Boolean.valueOf(h17 > 0);
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.battery.PowerManagerCompat");
    }

    public static long f(long j17, long j18) {
        long j19 = (java.lang.Math.abs(j17) <= j18 || c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) == null) ? 1L : 1000L;
        if (j17 > 0 && d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) != null) {
            j19 *= -1;
        }
        return j17 / j19;
    }
}
