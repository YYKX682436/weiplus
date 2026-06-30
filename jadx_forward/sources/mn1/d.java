package mn1;

/* loaded from: classes12.dex */
public class d extends kn1.f {

    /* renamed from: p, reason: collision with root package name */
    public static mn1.d f411363p;

    /* renamed from: j, reason: collision with root package name */
    public mn1.y f411364j;

    /* renamed from: k, reason: collision with root package name */
    public mn1.e f411365k;

    /* renamed from: l, reason: collision with root package name */
    public xn1.h f411366l;

    /* renamed from: m, reason: collision with root package name */
    public ln1.g f411367m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f411368n = "tickit";

    /* renamed from: o, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f411369o = null;

    public static mn1.d i() {
        if (f411363p == null) {
            mn1.d dVar = new mn1.d();
            f411363p = dVar;
            kn1.a.a(dVar);
        }
        return f411363p;
    }

    @Override // kn1.a
    public void b() {
        f411363p = null;
    }

    @Override // kn1.f
    public void c(java.lang.Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mn1.a(this, (java.lang.String) objArr[0]));
    }

    @Override // kn1.f
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveModel", "startWakeLock");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mn1.b(this));
    }

    @Override // kn1.f
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupMoveModel", "stopWakeLock");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new mn1.c(this));
    }

    public ln1.g h() {
        if (this.f411367m == null) {
            this.f411367m = new ln1.g();
        }
        return this.f411367m;
    }

    public mn1.e j() {
        if (this.f411365k == null) {
            this.f411365k = new mn1.e();
        }
        return this.f411365k;
    }

    public mn1.y k() {
        if (this.f411364j == null) {
            this.f411364j = new mn1.y();
        }
        return this.f411364j;
    }

    public xn1.h l() {
        if (this.f411366l == null) {
            this.f411366l = new xn1.h();
        }
        return this.f411366l;
    }
}
