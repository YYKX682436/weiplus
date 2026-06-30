package qn1;

/* loaded from: classes12.dex */
public class c extends kn1.f {

    /* renamed from: p, reason: collision with root package name */
    public static qn1.c f446471p;

    /* renamed from: j, reason: collision with root package name */
    public qn1.d f446472j;

    /* renamed from: k, reason: collision with root package name */
    public qn1.c0 f446473k;

    /* renamed from: l, reason: collision with root package name */
    public qn1.t f446474l;

    /* renamed from: m, reason: collision with root package name */
    public xn1.h f446475m;

    /* renamed from: n, reason: collision with root package name */
    public ln1.g f446476n;

    /* renamed from: o, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f446477o = null;

    public static synchronized qn1.c i() {
        qn1.c cVar;
        synchronized (qn1.c.class) {
            if (f446471p == null) {
                qn1.c cVar2 = new qn1.c();
                f446471p = cVar2;
                kn1.a.a(cVar2);
            }
            cVar = f446471p;
        }
        return cVar;
    }

    public static boolean n(android.content.Context context, int i17) {
        if (!o().f446501h || !o().h()) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.u(context.getString(i17));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
        u1Var.q(false);
        return true;
    }

    public static qn1.d o() {
        return i().j();
    }

    @Override // kn1.a
    public synchronized void b() {
        f446471p = null;
    }

    @Override // kn1.f
    public void c(java.lang.Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        ((java.lang.Boolean) objArr[0]).booleanValue();
        qn1.d j17 = i().j();
        j17.getClass();
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50297x7c4d7ca2(new qn1.i(j17), 100L);
    }

    @Override // kn1.f
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcModel", "startWakeLock");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new qn1.a(this));
    }

    @Override // kn1.f
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupPcModel", "stopWakeLock");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new qn1.b(this));
    }

    public ln1.g h() {
        if (this.f446476n == null) {
            this.f446476n = new ln1.g();
        }
        return this.f446476n;
    }

    public qn1.d j() {
        if (this.f446472j == null) {
            this.f446472j = new qn1.d();
        }
        return this.f446472j;
    }

    public qn1.t k() {
        if (this.f446474l == null) {
            this.f446474l = new qn1.t();
        }
        return this.f446474l;
    }

    public qn1.c0 l() {
        if (this.f446473k == null) {
            this.f446473k = new qn1.c0();
        }
        return this.f446473k;
    }

    public xn1.h m() {
        if (this.f446475m == null) {
            xn1.h hVar = new xn1.h();
            this.f446475m = hVar;
            hVar.f536996i = xn1.a.f536985e;
        }
        return this.f446475m;
    }
}
