package dg1;

/* loaded from: classes13.dex */
public class f implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f313808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f313809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f313810f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dg1.g f313811g;

    public f(dg1.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        this.f313811g = gVar;
        this.f313808d = tVar;
        this.f313809e = lVar;
        this.f313810f = jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.w
    /* renamed from: onDestroy */
    public void mo32094xac79a11b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "onDestroy");
        this.f313808d.K(this);
        this.f313811g.f313815m = null;
        vc1.h3.a(this.f313809e.mo48798x74292566(), vc1.e3.b(this.f313809e, this.f313810f));
        this.f313811g.f313812g.m77787xbe88f509();
    }
}
