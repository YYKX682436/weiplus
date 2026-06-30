package w64;

/* loaded from: classes4.dex */
public class i implements zy2.c6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad f524836a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w64.n f524837b;

    public i(w64.n nVar, com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad) {
        this.f524837b = nVar;
        this.f524836a = c11137xb05b06ad;
    }

    @Override // zy2.c6
    public void a(zy2.dc dcVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDone", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$4");
        if (dcVar != null) {
            ya2.b2 b2Var = (ya2.b2) dcVar;
            int i17 = b2Var.f69313xcad4ef95;
            int i18 = b2Var.f69314x82c83a5b;
            int i19 = b2Var.f69310x3717790c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdClickActionHandler", "handleQuickAddFinder, getFinderContact onDone, followFlg=" + i17 + ", followNum=" + i18 + ", feedNum=" + i19);
            com.p314xaae8f345.mm.p958xdb1a85af.C11137xb05b06ad c11137xb05b06ad = this.f524836a;
            if (i17 == 0) {
                c11137xb05b06ad.f153003h = 47;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new w64.g(this, i18, i19));
            } else {
                c11137xb05b06ad.f153003h = 37;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new w64.h(this));
            }
            ca4.z0.x0(c11137xb05b06ad);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdClickActionHandler", "handleQuickAddFinder, getFinderContact onDone, iLocalFinderContact==null");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDone", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$4");
    }
}
