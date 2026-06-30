package m34;

/* loaded from: classes4.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f404903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f404904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m34.s f404905f;

    public q(m34.s sVar, int i17, int i18) {
        this.f404905f = sVar;
        this.f404903d = i17;
        this.f404904e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play time ");
        int i17 = this.f404903d;
        sb6.append(i17);
        sb6.append(" video time ");
        int i18 = this.f404904e;
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayView", sb6.toString());
        m34.s sVar = this.f404905f;
        if (i18 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17691x8fb37d74 c17691x8fb37d74 = sVar.f404907d;
            c17691x8fb37d74.f244057x = i18;
            if (c17691x8fb37d74.f244047n != null && c17691x8fb37d74.f244042f) {
                c17691x8fb37d74.f244042f = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.iy iyVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.iy) c17691x8fb37d74.f244044h;
            iyVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPlayInfo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933 activityC18151xfc5a9933 = iyVar.f250991a;
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18151xfc5a9933.V6(activityC18151xfc5a9933) == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$802", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                activityC18151xfc5a9933.f249199q = i18;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$802", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$900", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                r45.jj4 jj4Var = activityC18151xfc5a9933.f249188J;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$900", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
                jj4Var.A = i18;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPlayInfo", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$1");
        }
        m34.d dVar = sVar.f404907d.f244047n;
        if (dVar != null) {
            if (dVar.mo69281xdf1112ec() != i18) {
                sVar.f404907d.f244047n.mo61298xa7077af8(i18);
            }
            sVar.f404907d.f244047n.a(i17);
            sVar.f404907d.f244047n.mo61296x11f3be80(true);
        }
        if (sVar.f404907d.f244043g.getVisibility() == 0) {
            sVar.f404907d.f244043g.setVisibility(8);
        }
        sVar.f404907d.f244048o = i17;
    }
}
