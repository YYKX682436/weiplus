package us5;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f512107a;

    /* renamed from: b, reason: collision with root package name */
    public int f512108b;

    /* renamed from: c, reason: collision with root package name */
    public double f512109c;

    public a(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f512107a = name;
    }

    public final void a(double d17) {
        java.lang.String str = this.f512107a;
        if (d17 > 2.147483647E9d || d17 < -2.147483648E9d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CollectAccumulationData", "accumulationData error name: " + str + " value: " + d17);
            return;
        }
        this.f512108b++;
        this.f512109c += d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CollectAccumulationData", "accumulationData name: " + str + " value: " + d17 + " count: " + this.f512108b + " totalData: " + this.f512109c);
    }
}
