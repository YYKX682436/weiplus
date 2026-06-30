package ul0;

/* loaded from: classes7.dex */
public class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f510089e = {l75.n0.m145250x3fdc6f77(dm.m7.f320035t, "LiveHomeNoRedDotEvent")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f510090d;

    public b(l75.k0 k0Var) {
        super(k0Var, dm.m7.f320035t, "LiveHomeNoRedDotEvent", f510089e);
        this.f510090d = k0Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("LiveHomePageRedDot_create_time_v1", 0L) == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("LiveHomePageRedDot_create_time_v1", java.lang.System.currentTimeMillis());
        }
    }

    public int y0(int i17, boolean z17, long j17, long j18, int i18, int i19) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT COUNT(*) FROM (select * from LiveHomeNoRedDotEvent where timestamp >= ? and timestamp <= ? and action = ?");
        if (i18 >= 0) {
            sb6.append(" and dayOfWeek = ");
            sb6.append(i18);
        }
        if (i19 >= 0) {
            sb6.append(" and dayOfWeek = ");
            sb6.append(i19);
        }
        if (z17) {
            sb6.append(" and hasDisturbance = 1");
        }
        sb6.append(")");
        android.database.Cursor B = this.f510090d.B(sb6.toString(), new java.lang.String[]{java.lang.String.valueOf(j17), java.lang.String.valueOf(j18), java.lang.String.valueOf(i17)});
        try {
            int i27 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
            return i27;
        } catch (java.lang.Throwable th6) {
            if (B != null) {
                B.close();
            }
            throw th6;
        }
    }

    public void z0(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(currentTimeMillis));
        int i18 = calendar.get(11);
        int i19 = calendar.get(7);
        dm.m7 m7Var = new dm.m7();
        m7Var.f67444x9de75411 = currentTimeMillis;
        m7Var.f67441x6f12d422 = i19;
        m7Var.f67443xd557edbc = i18;
        m7Var.f67442xa78282b9 = zs.c.f556756a ? 1 : 0;
        m7Var.f67440xf102ad1b = i17;
        this.f510090d.l("LiveHomeNoRedDotEvent", null, m7Var.mo9763xeb27878e());
    }
}
