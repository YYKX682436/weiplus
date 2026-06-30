package ul0;

/* loaded from: classes13.dex */
public class d extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f510093e = {l75.n0.m145250x3fdc6f77(dm.qa.B, "SnsFeature")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f510094d;

    public d(l75.k0 k0Var) {
        super(k0Var, dm.qa.B, "SnsFeature", f510093e);
        this.f510094d = k0Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("SnsFeatureStorage_create_time_v1", 0L) == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("SnsFeatureStorage_create_time_v1", java.lang.System.currentTimeMillis());
        }
    }

    public int D0(java.lang.String str, int i17, int i18, long j17, long j18, int i19, int i27, boolean z17, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT COUNT(*) FROM (select * from SnsFeature where timestamp >= ? and timestamp <= ? and type = ? and action = ?");
        if (i19 >= 0) {
            sb6.append(" and dayOfWeek = ");
            sb6.append(i19);
        }
        if (i27 >= 0) {
            sb6.append(" and dayOfWeek = ");
            sb6.append(i27);
        }
        if (z17) {
            sb6.append(" and weishang = 1");
        }
        if (!android.text.TextUtils.isEmpty(str2)) {
            sb6.append(" and city = '");
            sb6.append(str2);
            sb6.append("'");
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            sb6.append(" and snsid = '");
            sb6.append(str);
            sb6.append("'");
        }
        sb6.append(")");
        android.database.Cursor B = this.f510094d.B(sb6.toString(), new java.lang.String[]{java.lang.String.valueOf(j17), java.lang.String.valueOf(j18), java.lang.String.valueOf(i18), java.lang.String.valueOf(i17)});
        try {
            int i28 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
            return i28;
        } catch (java.lang.Throwable th6) {
            if (B != null) {
                B.close();
            }
            throw th6;
        }
    }

    public void J0(dm.qa qaVar) {
        boolean z17;
        java.lang.String str = "select * from SnsFeature where owner = '" + qaVar.f68079x299cd32e + "' and snsid = '" + qaVar.f68080x29d12d0e + "' and type = ? and action = ?";
        java.lang.String[] strArr = {java.lang.String.valueOf(qaVar.f68082x2262335f), java.lang.String.valueOf(qaVar.f68075xf102ad1b)};
        l75.k0 k0Var = this.f510094d;
        android.database.Cursor B = k0Var.B(str, strArr);
        try {
            if (B.moveToFirst()) {
                B.close();
                z17 = true;
            } else {
                B.close();
                z17 = false;
            }
            if (z17) {
                return;
            }
            k0Var.l("SnsFeature", null, qaVar.mo9763xeb27878e());
        } catch (java.lang.Throwable th6) {
            if (B != null) {
                B.close();
            }
            throw th6;
        }
    }

    public int y0(int i17, int i18, long j17, long j18, int i19, int i27) {
        return D0(null, i17, i18, j17, j18, i19, i27, false, "");
    }

    public int z0(java.lang.String str, int i17, int i18, long j17, long j18, int i19, int i27) {
        return D0(str, i17, i18, j17, j18, i19, i27, false, "");
    }
}
