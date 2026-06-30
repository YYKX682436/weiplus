package or1;

/* loaded from: classes12.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or1.d2 f429017d;

    public e2(or1.f2 f2Var, or1.d2 d2Var) {
        this.f429017d = d2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandService.SearchOrRecommendBizUI", "Has got recommend groups, so notifyDataSetChanged.");
        this.f429017d.notifyDataSetChanged();
    }
}
