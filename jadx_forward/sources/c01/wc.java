package c01;

/* loaded from: classes12.dex */
public class wc {

    /* renamed from: a, reason: collision with root package name */
    public final c01.vc f119085a;

    /* renamed from: b, reason: collision with root package name */
    public long f119086b;

    /* renamed from: c, reason: collision with root package name */
    public long f119087c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f119088d;

    /* renamed from: e, reason: collision with root package name */
    public int f119089e;

    public wc(c01.vc vcVar) {
        this.f119085a = null;
        this.f119086b = 0L;
        this.f119087c = 0L;
        this.f119088d = "";
        this.f119089e = 1;
        iz5.a.g(null, vcVar != null);
        this.f119085a = vcVar;
        this.f119089e = 1;
        this.f119086b = 0L;
        this.f119087c = 0L;
        this.f119088d = "";
    }

    public final synchronized void a() {
        if (this.f119089e != 1) {
            long j17 = this.f119086b + this.f119087c;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (j17 < java.lang.System.currentTimeMillis()) {
                b();
            }
        }
    }

    public synchronized void b() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (this.f119089e == 1) {
            return;
        }
        this.f119089e = 1;
        this.f119086b = 0L;
        this.f119087c = 0L;
        this.f119088d = "";
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6147x4c31235f c6147x4c31235f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6147x4c31235f();
        c6147x4c31235f.f136409g.getClass();
        c6147x4c31235f.e();
    }

    public synchronized void c() {
        int i17 = this.f119089e;
        if (i17 != 2) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncPauser", "ERR: setFullPause but currState is %d  %s", java.lang.Integer.valueOf(i17), new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            return;
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.System.currentTimeMillis();
        this.f119089e = 3;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6147x4c31235f c6147x4c31235f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6147x4c31235f();
        c6147x4c31235f.f136409g.getClass();
        c6147x4c31235f.e();
    }
}
