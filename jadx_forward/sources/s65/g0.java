package s65;

/* loaded from: classes11.dex */
public class g0 extends com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String[] f484989g;

    /* renamed from: h, reason: collision with root package name */
    public s65.f0 f484990h;

    /* renamed from: i, reason: collision with root package name */
    public q65.b f484991i;

    /* renamed from: j, reason: collision with root package name */
    public int f484992j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f484993k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f484994l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f484995m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f484996n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f484997o;

    /* renamed from: p, reason: collision with root package name */
    public final q65.b f484998p;

    public g0(int i17, java.lang.String str, int i18, java.lang.String[] strArr, boolean z17) {
        super(i17, str, i18, z17);
        this.f484990h = null;
        this.f484992j = 0;
        this.f484993k = false;
        this.f484996n = false;
        this.f484997o = new s65.a0(this);
        this.f484998p = new s65.c0(this);
        this.f484989g = strArr;
    }

    public static void e(s65.g0 g0Var, r45.js5 js5Var) {
        g0Var.getClass();
        try {
            s75.d.b(new s65.b0(g0Var, js5Var), "NetSceneGetUpdatePackFromCDN_genApk");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "exception in genNewAPKInNewThread()");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetUpdatePackFromCDN", e17, "", new java.lang.Object[0]);
            android.os.Message obtain = android.os.Message.obtain();
            obtain.what = 1;
            obtain.arg1 = 3;
            obtain.obj = js5Var;
            g0Var.f484997o.mo50308x2936bf5f(obtain);
        }
    }

    @Override // q65.c
    public void a(q65.b bVar) {
        this.f484991i = bVar;
        if (!fp.m.c().equals("mounted")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "SDCard not available.");
            bVar.d(-1, -1, null);
            return;
        }
        if (this.f484996n) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "netscene had been canceled.");
            bVar.d(-1, -1, null);
            return;
        }
        int i17 = 0;
        boolean z17 = this.f273834e ? !com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) : false;
        boolean z18 = this.f484993k;
        java.lang.String[] strArr = this.f484989g;
        if (z17 || f() >= strArr.length) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "exceed max download url. url count = " + strArr.length);
            if (z18) {
                bVar.d(1, -1, null);
                return;
            } else {
                bVar.d(-1, -1, null);
                return;
            }
        }
        if (!fp.i.c(this.f273831b)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "SDCard full");
            if (z18) {
                bVar.d(13, -1, null);
                return;
            } else {
                bVar.d(-1, -1, null);
                return;
            }
        }
        int i18 = this.f273831b;
        java.lang.String d17 = d();
        if (d17 != null) {
            java.io.File file = new java.io.File(d17);
            if (file.exists()) {
                i17 = (int) file.length();
            }
        }
        s65.f0 f0Var = new s65.f0(this, i18, i17, this.f484998p);
        this.f484990h = f0Var;
        f0Var.execute(strArr[f()]);
    }

    @Override // com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l
    public java.lang.String b() {
        boolean z17 = this.f484993k;
        java.lang.String str = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l.f273829f;
        if (z17) {
            return str + this.f484995m + ".apk";
        }
        return str + this.f273833d + ".apk";
    }

    @Override // q65.c
    /* renamed from: cancel */
    public void mo159547xae7a2e7a() {
        this.f484996n = true;
        s65.f0 f0Var = this.f484990h;
        if (f0Var == null || f0Var.isCancelled()) {
            return;
        }
        this.f484990h.cancel(true);
    }

    @Override // com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l
    public java.lang.String d() {
        if (!this.f484993k) {
            return super.d();
        }
        return com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l.f273829f + this.f484994l + ".temp";
    }

    public final int f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetUpdatePackFromCDN", "requestCount=" + this.f484992j + ", curLinkIdx = " + (this.f484992j / 5));
        return this.f484992j / 5;
    }

    public g0(int i17, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17) {
        super(i17, str, i18, z17);
        this.f484990h = null;
        this.f484992j = 0;
        this.f484993k = false;
        this.f484996n = false;
        this.f484997o = new s65.a0(this);
        this.f484998p = new s65.c0(this);
        this.f484989g = new java.lang.String[]{str2};
        this.f484993k = true;
        this.f484994l = str3;
        this.f484995m = str4;
    }
}
