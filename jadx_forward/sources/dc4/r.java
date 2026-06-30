package dc4;

/* loaded from: classes4.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dc4.u f310345d;

    public r(dc4.u uVar) {
        this.f310345d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$2");
        dc4.u uVar = this.f310345d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = uVar.f310365e;
        if (c17933xe8d1b226 != null && c17933xe8d1b226.m70378x4c74e984()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdNormalSightDetailItem", "forbidAutoPlay");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
            uVar.o();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$2");
            return;
        }
        if (dc4.u.l(uVar).w() || dc4.u.l(uVar).f0()) {
            dc4.u.l(uVar).K();
        } else {
            l44.b3.f397574a.h(uVar.f310365e);
            dc4.u.l(uVar).C();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.detail.item.AdNormalSightDetailItem$2");
    }
}
