package fa3;

/* loaded from: classes10.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f342296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g f342297e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fa3.b f342298f;

    public k(fa3.b bVar, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar) {
        this.f342298f = bVar;
        this.f342296d = map;
        this.f342297e = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppCameraManager", "LiteAppCamera startRecord onTimer");
        fa3.b bVar = this.f342298f;
        bVar.I = true;
        bVar.k(this.f342296d, this.f342297e);
    }
}
