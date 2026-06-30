package rh2;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final rh2.e f477174a = new rh2.e();

    /* renamed from: b, reason: collision with root package name */
    public static final com.qq.wx.p309x6b2e132.vad.C2884xdf3c62d3 f477175b = new com.qq.wx.p309x6b2e132.vad.C2884xdf3c62d3();

    /* renamed from: c, reason: collision with root package name */
    public static volatile long f477176c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static volatile boolean f477177d;

    /* renamed from: e, reason: collision with root package name */
    public static yz5.p f477178e;

    public final void a() {
        synchronized (this) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KWSEngine", "Destroying KWSEngine");
            if (f477176c != -1) {
                try {
                    com.qq.wx.p309x6b2e132.vad.C2884xdf3c62d3 c2884xdf3c62d3 = f477175b;
                    c2884xdf3c62d3.End(f477176c);
                    c2884xdf3c62d3.m21487xa439bfe7(f477176c);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KWSEngine", "Error releasing engine: " + e17.getMessage());
                }
                f477176c = -1L;
            }
            f477177d = false;
            f477178e = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KWSEngine", "KWSEngine destroyed");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058 A[Catch: all -> 0x00f4, Exception -> 0x00f6, TRY_LEAVE, TryCatch #2 {Exception -> 0x00f6, blocks: (B:3:0x000e, B:5:0x001d, B:7:0x0048, B:9:0x004c, B:14:0x0058, B:16:0x0087, B:18:0x00a7, B:36:0x00af, B:37:0x00c4), top: B:2:0x000e, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rh2.e.b():void");
    }
}
