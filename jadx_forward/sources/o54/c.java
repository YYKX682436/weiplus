package o54;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o54.d f424655d;

    public c(o54.d dVar) {
        this.f424655d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        o54.d dVar = this.f424655d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$ComponentStaticBuilder$1");
        try {
            o54.g.b(1673L, 1L, dVar.f424656a);
            o54.g.b(1673L, 2L, dVar.f424657b);
            o54.g.b(1673L, 3L, dVar.f424658c);
            o54.g.b(1673L, 4L, dVar.f424659d);
            o54.g.b(1673L, 5L, dVar.f424660e);
            o54.g.b(1673L, 15L, dVar.f424661f);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("imgCnt=");
            sb6.append(dVar.f424656a);
            sb6.append(", sightCnt=");
            sb6.append(dVar.f424657b);
            sb6.append(", streamCnt=");
            sb6.append(dVar.f424658c);
            sb6.append(", commVideoCnt=");
            sb6.append(dVar.f424659d);
            sb6.append(", total=");
            sb6.append(dVar.f424660e);
            sb6.append(", normalTotal=");
            sb6.append(dVar.f424661f);
            sb6.append("|fpImgCnt=");
            sb6.append(dVar.f424662g);
            sb6.append(", fpSightCnt=");
            sb6.append(dVar.f424663h);
            sb6.append(", fpStreamCnt=");
            sb6.append(dVar.f424664i);
            sb6.append(", fpCommVideoCnt=");
            sb6.append(dVar.f424665j);
            sb6.append(", fpTotal=");
            sb6.append(dVar.f424666k);
            sb6.append(", fpNormalTotal=");
            sb6.append(dVar.f424667l);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingPageStaticHelper.ComponentStaticBuilder", "report exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.landingpage.helper.AdLandingPageStaticHelper$ComponentStaticBuilder$1");
    }
}
