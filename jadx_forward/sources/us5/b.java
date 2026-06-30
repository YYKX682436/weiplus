package us5;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f512110a;

    /* renamed from: b, reason: collision with root package name */
    public int f512111b;

    /* renamed from: c, reason: collision with root package name */
    public double f512112c;

    public b(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f512110a = name;
    }

    public final void a(double d17) {
        if (d17 > 2.147483647E9d || d17 < -2.147483648E9d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CollectAvgData", "averageData error value: " + d17);
            return;
        }
        int i17 = this.f512111b + 1;
        this.f512111b = i17;
        double d18 = this.f512112c;
        this.f512112c = d18 + ((d17 - d18) / i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CollectAvgData", "averageData name: " + this.f512110a + " value: " + d17 + " count: " + this.f512111b + " avgData: " + this.f512112c);
    }
}
