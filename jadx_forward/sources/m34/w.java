package m34;

/* loaded from: classes4.dex */
public class w implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 f404911d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 c17691x8fb37d74) {
        this.f404911d = c17691x8fb37d74;
    }

    @Override // m34.e
    public void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayView", "onSeek time " + i17);
        double d17 = (double) i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 c17691x8fb37d74 = this.f404911d;
        c17691x8fb37d74.f244048o = d17;
        c17691x8fb37d74.f244046m.b(d17);
        c17691x8fb37d74.f244052s.mo50300x3fa464aa(c17691x8fb37d74.F);
        c17691x8fb37d74.f244052s.mo50297x7c4d7ca2(c17691x8fb37d74.F, 3000L);
    }

    @Override // m34.e
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 c17691x8fb37d74 = this.f404911d;
        c17691x8fb37d74.f244052s.mo50300x3fa464aa(c17691x8fb37d74.F);
        c17691x8fb37d74.g();
    }

    @Override // m34.e
    public void d(int i17) {
    }
}
