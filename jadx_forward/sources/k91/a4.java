package k91;

/* loaded from: classes4.dex */
public final class a4 extends k91.j4 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f387070f = {l75.n0.m145250x3fdc6f77(k91.v5.E1, "WxaAttrAvailableBackupTable")};

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f387071e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(l75.k0 db6) {
        super(db6, "WxaAttrAvailableBackupTable", null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f387071e = db6;
    }

    public final boolean C1(java.lang.String str, int i17) {
        if (str == null || str.length() == 0) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.WxaAttrAvailableBackupStorage", "removeForAppIdAndVersionLessThan(appId:" + str + ", version:" + i17 + ')');
        try {
            k91.v5 k17 = k1(str, "versionInfo");
            if (k17 != null && k17.w0().f158977d < i17) {
                mo49766xb06685ab(k17, false, new java.lang.String[0]);
                return true;
            }
        } catch (java.lang.Exception unused) {
            if (Integer.MAX_VALUE == i17) {
                k91.v5 v5Var = new k91.v5();
                v5Var.f68904x28d45f97 = str;
                return super.mo9951xb06685ab(v5Var, "appId");
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z1(k91.v5 v5Var) {
        java.lang.String obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 w07;
        if (v5Var == null) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WxaAttrAvailableBackupStorage.insertOrUpdate(");
        sb6.append(v5Var.f68924xdec927b);
        sb6.append('|');
        sb6.append(v5Var.f68904x28d45f97);
        sb6.append('|');
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 w08 = v5Var.w0();
        sb6.append(w08 != null ? w08.f158977d : -1);
        sb6.append(')');
        java.lang.String sb7 = sb6.toString();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(n1(v5Var.f68924xdec927b, "appId") != null ? mo51732xbf274172(v5Var, false, dm.i4.f66875xa013b0d5) : mo51731x24249762(v5Var, false));
        if (valueOf.booleanValue() && (w07 = v5Var.w0()) != null) {
            C1(v5Var.f68904x28d45f97, w07.f158977d);
        }
        if (valueOf instanceof cf.h) {
            obj = ((cf.h) valueOf).I();
        } else {
            obj = valueOf.toString();
            if (obj == null) {
                obj = "";
            }
        }
        boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a();
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime() - elapsedRealtime;
        if (elapsedRealtime2 <= 32 || !a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Utils.Profile", "runProfiled:log:" + sb7 + " cost " + elapsedRealtime2 + " ms result:" + obj + " isMainThread: " + a17 + ' ');
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.Utils.Profile", "block main thread and skip " + ((int) (elapsedRealtime2 / 16)) + " frames! runProfiled:log:" + sb7 + " cost " + elapsedRealtime2 + " ms result:" + obj + " isMainThread: " + a17 + ' ');
        }
        return valueOf.booleanValue();
    }
}
