package v32;

/* loaded from: classes9.dex */
public class e extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f514627e = {l75.n0.m145250x3fdc6f77(v32.d.D, "HardIotCdnInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f514628d;

    public e(l75.k0 k0Var) {
        super(k0Var, v32.d.D, "HardIotCdnInfo", null);
        this.f514628d = k0Var;
    }

    public boolean y0(long j17) {
        if (this.f514628d.mo70514xb06685ab("HardIotCdnInfo", "msgid=?", new java.lang.String[]{java.lang.String.valueOf(j17)}) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.HardIotCdnInfoStorage", "delete HardIotCdnInfo fail, msgId = %d", java.lang.Long.valueOf(j17));
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.exdevice.HardIotCdnInfoStorage", "delete HardIotCdnInfo ok, msgId = %d", java.lang.Long.valueOf(j17));
        return true;
    }
}
