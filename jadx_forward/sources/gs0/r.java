package gs0;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f356544a;

    /* renamed from: b, reason: collision with root package name */
    public ru5.i f356545b;

    /* renamed from: d, reason: collision with root package name */
    public boolean f356547d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f356548e;

    /* renamed from: g, reason: collision with root package name */
    public int f356550g;

    /* renamed from: h, reason: collision with root package name */
    public int f356551h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f356552i;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f356546c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("X264TransEncoder_writeDataThread");

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f356549f = new java.lang.Object();

    public r(int i17, int i18, int i19) {
        this.f356544a = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransEncoder", "create X264TransEncoder, width:" + i18 + ", height:" + i19);
    }

    public final void a() {
        this.f356547d = false;
        this.f356548e = false;
        this.f356550g = 0;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69241xeb56bb22(this.f356544a, 0);
        ru5.j jVar = ru5.g.f481330i;
        ru5.i iVar = new ru5.i(ru5.g.f481332k);
        iVar.f481334b = ru5.g.f481330i;
        gs0.q qVar = new gs0.q(this);
        ru5.i iVar2 = new ru5.i();
        iVar2.f481334b = iVar.e();
        iVar2.f481336d = iVar;
        iVar.f481337e = iVar2;
        iVar.f481335c = qVar;
        this.f356545b = iVar2;
        this.f356552i = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransEncoder", "start");
    }
}
