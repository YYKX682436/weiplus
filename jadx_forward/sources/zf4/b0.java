package zf4;

/* loaded from: classes13.dex */
public class b0 extends l75.n0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f554180f = {l75.n0.m145250x3fdc6f77(zf4.q.V, "VoiceRemindInfo")};

    /* renamed from: g, reason: collision with root package name */
    public static long f554181g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f554182d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f554183e;

    public b0(l75.k0 k0Var) {
        super(k0Var, zf4.q.V, "VoiceRemindInfo", dm.tb.f321713y);
        this.f554183e = new java.util.HashMap();
        this.f554182d = k0Var;
    }

    public static java.lang.String y0(java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String format = new java.text.SimpleDateFormat("ssHHmmMMddyy").format(new java.util.Date(currentTimeMillis));
        if (str != null && str.length() > 1) {
            format = format + kk.k.g(str.getBytes()).substring(0, 7);
        }
        java.lang.String str2 = format + (currentTimeMillis % com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str2);
        long j17 = f554181g;
        f554181g = 1 + j17;
        sb6.append(j17);
        return sb6.toString();
    }

    public boolean d(java.lang.String str) {
        iz5.a.g(null, str.length() > 0);
        if (this.f554182d.mo70514xb06685ab("VoiceRemindInfo", "filename= ?", new java.lang.String[]{str}) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.VoiceRemindStorage", "delete failed, no such file:".concat(str));
        }
        return true;
    }
}
