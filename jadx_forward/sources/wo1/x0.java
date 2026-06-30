package wo1;

/* loaded from: classes5.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f529581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f529582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f529583f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f529584g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f529585h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f529586i;

    public x0(android.net.Uri uri, po1.d dVar, java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, wo1.a1 a1Var, long j17) {
        this.f529581d = uri;
        this.f529582e = dVar;
        this.f529583f = str;
        this.f529584g = u3Var;
        this.f529585h = a1Var;
        this.f529586i = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        to1.g gVar = to1.g.f502444a;
        po1.d a17 = po1.d.a(this.f529582e, null, null, null, null, this.f529583f, null, null, 111, null);
        po1.d dVar = this.f529582e;
        java.lang.String str = dVar.f438832e;
        android.net.Uri uri = this.f529581d;
        fo1.n g17 = gVar.g(uri, a17, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseTaskStatusView", "result of save old device=" + g17 + ", device=" + dVar + ", path=" + this.f529583f + ", uri=" + uri);
        nf.e.f(new wo1.w0(this.f529584g, g17, this.f529585h, this.f529582e, this.f529586i));
    }
}
