package uf1;

/* loaded from: classes7.dex */
public class f implements sf.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t f508691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f508692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf.f f508693c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf1.a f508694d;

    public f(uf1.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, sf.f fVar) {
        this.f508694d = aVar;
        this.f508691a = tVar;
        this.f508692b = lVar;
        this.f508693c = fVar;
    }

    @Override // sf.e
    public void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t) this.f508692b;
        android.view.View mo50748xfb86a31b = this.f508694d.f508672h.mo50748xfb86a31b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s mo51311x3eebbc35 = tVar.mo51311x3eebbc35();
        android.view.ViewGroup n17 = mo51311x3eebbc35 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia) mo51311x3eebbc35).n(0, false, false) : null;
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler", "onBackground(%d), removeCameraNativeView failed null topLevelContainer, appId:%s", tVar.mo48798x74292566());
        } else {
            n17.removeView(mo50748xfb86a31b);
        }
    }

    @Override // sf.e
    public void b() {
        uf1.a.r(this.f508694d, this.f508691a);
    }

    @Override // sf.e
    /* renamed from: onDestroy */
    public void mo10362xac79a11b() {
        this.f508693c.f();
        this.f508694d.f508672h = null;
    }
}
