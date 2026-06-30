package ul0;

/* loaded from: classes13.dex */
public class a extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f510087e = {l75.n0.m145250x3fdc6f77(dm.b2.f317353z, "ChattingEvent")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f510088d;

    public a(l75.k0 k0Var) {
        super(k0Var, dm.b2.f317353z, "ChattingEvent", f510087e);
        this.f510088d = k0Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong("ChattingEventStorage_create_time_v1", 0L) == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong("ChattingEventStorage_create_time_v1", java.lang.System.currentTimeMillis());
        }
    }

    public final boolean y0(dm.b2 b2Var) {
        android.database.Cursor B = this.f510088d.B("select * from ChattingEvent where talker = '" + b2Var.f65968x114ef53e + "' and msgid = ? and type = ? and action = ?", new java.lang.String[]{java.lang.String.valueOf(b2Var.f65967x297eb8d7), java.lang.String.valueOf(b2Var.f65970x2262335f), java.lang.String.valueOf(b2Var.f65963xf102ad1b)});
        try {
            if (B.moveToFirst()) {
                B.close();
                return true;
            }
            B.close();
            return false;
        } catch (java.lang.Throwable th6) {
            if (B != null) {
                B.close();
            }
            throw th6;
        }
    }

    public void z0(dm.b2 b2Var) {
        if (b2Var.f65967x297eb8d7 == 0) {
            return;
        }
        int i17 = b2Var.f65966xff84aeb9;
        l75.k0 k0Var = this.f510088d;
        if (i17 == 0 && b2Var.f65963xf102ad1b == 2) {
            b2Var.f65963xf102ad1b = 1;
            if (!y0(b2Var)) {
                k0Var.l("ChattingEvent", null, b2Var.mo9763xeb27878e());
            }
            b2Var.f65963xf102ad1b = 2;
        }
        if (y0(b2Var)) {
            return;
        }
        k0Var.l("ChattingEvent", null, b2Var.mo9763xeb27878e());
    }
}
