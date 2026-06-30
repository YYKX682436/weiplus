package z21;

/* loaded from: classes12.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f551235a;

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f551243i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f551236b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f551237c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f551238d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f551239e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f551240f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f551241g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f551242h = false;

    /* renamed from: j, reason: collision with root package name */
    public long f551244j = 0;

    public z(z21.a0 a0Var) {
        this.f551235a = a(a0Var.f551083a);
    }

    public final java.lang.String a(java.lang.String str) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f551244j = currentTimeMillis;
        long j17 = currentTimeMillis & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
        long nextInt = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2 & new java.util.Random(java.lang.System.currentTimeMillis()).nextInt();
        long j18 = (j17 << 32) | nextInt;
        if (j18 < 0) {
            j18 = java.lang.Math.abs(j18);
        }
        java.lang.String str2 = str + j18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortSentenceContainer", "finally random = %s(%s) time = %s(%s) id = %s(%s) session = %s strId = %s", java.lang.Long.valueOf(nextInt), java.lang.Long.toBinaryString(nextInt), java.lang.Long.valueOf(j17), java.lang.Long.toBinaryString(j17), java.lang.Long.valueOf(j18), java.lang.Long.toBinaryString(j18), str, str2);
        return str2;
    }

    public z(z21.a0 a0Var, java.lang.String str) {
        this.f551235a = a(str);
    }
}
