package or1;

/* loaded from: classes12.dex */
public class f2 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12985xde48fa36 f429026d;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12985xde48fa36 activityC12985xde48fa36) {
        this.f429026d = activityC12985xde48fa36;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.SearchOrRecommendBizUI", "NetScene is null.");
            return;
        }
        if (m1Var.mo808xfb85f7b0() != 456) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandService.SearchOrRecommendBizUI", "The NetScene is not a RecommendGroupNetScene.");
            return;
        }
        gm0.j1.d().q(456, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.SearchOrRecommendBizUI", "errType(%d) , errCode(%d) , errMsg(%s)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList H = lr1.f0.H();
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.C12976x62b3a916 c12976x62b3a916 = this.f429026d.f175579g;
            or1.d2 d2Var = c12976x62b3a916 == null ? null : (or1.d2) c12976x62b3a916.m54300xf939df19();
            if (d2Var == null || H == null || H.size() <= 0) {
                return;
            }
            boolean z17 = d2Var.getCount() == 0;
            d2Var.f429006t = H;
            if (z17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new or1.e2(this, d2Var));
            }
        }
    }
}
