package ho1;

/* loaded from: classes5.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f364158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ po1.d f364159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f364160f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f364161g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f364162h;

    public b0(android.net.Uri uri, po1.d dVar, po1.d dVar2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, yz5.l lVar) {
        this.f364158d = uri;
        this.f364159e = dVar;
        this.f364160f = dVar2;
        this.f364161g = u3Var;
        this.f364162h = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fo1.n g17 = to1.g.f502444a.g(this.f364158d, this.f364159e, this.f364160f.f438832e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackup.FlutterBackupPlugin", "[saveOldPath] error code of save is " + g17);
        pm0.v.X(new ho1.a0(this.f364161g, g17, this.f364162h));
    }
}
