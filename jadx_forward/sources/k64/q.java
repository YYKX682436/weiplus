package k64;

/* loaded from: classes4.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e74.j f386137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f386138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f386139f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f386140g;

    public q(k64.r rVar, e74.j jVar, int i17, java.lang.String str, java.util.List list) {
        this.f386137d = jVar;
        this.f386138e = i17;
        this.f386139f = str;
        this.f386140g = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate$1");
        e74.j jVar = this.f386137d;
        if (jVar != null) {
            jVar.a(this.f386138e, this.f386139f, this.f386140g);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.netscene.NetSceneAdDynamicUpdate$1");
    }
}
