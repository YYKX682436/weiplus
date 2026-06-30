package or1;

/* loaded from: classes12.dex */
public class i implements or1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12975xaf74d12f f429037a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12975xaf74d12f activityC12975xaf74d12f) {
        this.f429037a = activityC12975xaf74d12f;
    }

    @Override // or1.l
    public void a(or1.m mVar, fb5.c cVar, int i17, java.lang.String str, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12975xaf74d12f activityC12975xaf74d12f = this.f429037a;
        if (activityC12975xaf74d12f.f175511i == 1 && cVar.f342414a == 5) {
            r45.xp xpVar = (r45.xp) cVar.f342415b;
            r45.pp ppVar = xpVar.f471832e;
            if (ppVar == null || ppVar.f464796f == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.BizSearchDetailPageUI", "bcdItem.ContactItem == null || bcdItem.ContactItem.ContactItem == null");
                return;
            }
            r45.qp j17 = mVar.j(i19);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str2 = activityC12975xaf74d12f.f175509g;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            sb6.append(str2);
            sb6.append(",");
            sb6.append(i17);
            sb6.append(",");
            sb6.append(str == null ? "" : str);
            sb6.append(",");
            sb6.append(i18);
            sb6.append(",");
            sb6.append(mVar.f429067q);
            sb6.append(",");
            if (j17 != null) {
                str3 = j17.f465693m + ",1";
            }
            sb6.append(str3);
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.mo68478xbd3cda5f(10866, sb7);
            if ((xpVar.f471832e.f464796f.f457154n & 8) > 0) {
                g0Var.mo68478xbd3cda5f(10298, str + ",35");
            }
        }
    }
}
