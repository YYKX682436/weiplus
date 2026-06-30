package fa3;

/* loaded from: classes10.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f342299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g f342300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fa3.b f342301f;

    public l(fa3.b bVar, java.util.Map map, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.g gVar) {
        this.f342301f = bVar;
        this.f342299d = map;
        this.f342300e = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f342301f.g(this.f342299d, this.f342300e);
    }
}
