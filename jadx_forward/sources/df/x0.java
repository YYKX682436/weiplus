package df;

/* loaded from: classes7.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f311136a;

    /* renamed from: b, reason: collision with root package name */
    public final df.y0 f311137b = new df.y0();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f311138c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public boolean f311139d = true;

    /* renamed from: e, reason: collision with root package name */
    public int f311140e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f311141f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f311142g = new java.util.ArrayList();

    public x0(long j17) {
        this.f311136a = j17;
    }

    public final void a(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("runtimePtr:");
        long j17 = this.f311136a;
        sb6.append(j17);
        sb6.append(" firstEngine costTime: ");
        df.y0 y0Var = this.f311137b;
        sb6.append(y0Var.f311147b - y0Var.f311146a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineManager", sb6.toString());
        java.util.HashMap hashMap = this.f311138c;
        int size = hashMap.size();
        if (size != 0) {
            long j18 = 0;
            for (df.y0 y0Var2 : hashMap.values()) {
                j18 += y0Var2.f311147b - y0Var2.f311146a;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SkylineManager", "runtimePtr:" + j17 + " otherEngine sum:" + j18 + " count:" + size + " avgTime: " + (j18 / size));
        }
    }
}
