package gi;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f353558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353559e;

    public f(gi.g gVar, int i17, java.lang.String str) {
        this.f353558d = i17;
        this.f353559e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f353559e;
        if (mm.o.c()) {
            java.lang.String f17 = ri.i.f();
            int d17 = ri.i.d();
            int e17 = ri.i.e();
            java.lang.String a17 = ri.t.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.BatteryReporter", "#statJiffiesParseErrorR2");
            ri.s.b(0, 5, f17, str, d17, e17, "statError2", 0L, "mode", this.f353558d, "", 0L, a17, "", 0L, 0L, 0L, "");
        }
    }
}
