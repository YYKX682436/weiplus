package pr1;

/* loaded from: classes9.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f439472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 f439473e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1, int i17) {
        this.f439473e = viewOnCreateContextMenuListenerC12986xffd38cd1;
        this.f439472d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceSortView", "showRemoveBizAlertDialog run");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1291x2e06d1.ViewOnCreateContextMenuListenerC12986xffd38cd1 viewOnCreateContextMenuListenerC12986xffd38cd1 = this.f439473e;
        java.util.List<fb5.n> m79353x744cac53 = viewOnCreateContextMenuListenerC12986xffd38cd1.m79353x744cac53();
        int i17 = this.f439472d;
        if (i17 < 0 || m79353x744cac53 == null || i17 >= m79353x744cac53.size()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandServiceSortView", "showRemoveBizAlertDialog run refresh all");
            viewOnCreateContextMenuListenerC12986xffd38cd1.i();
        } else {
            m79353x744cac53.remove(i17);
            fb5.m m79351xf939df19 = viewOnCreateContextMenuListenerC12986xffd38cd1.m79351xf939df19();
            m79351xf939df19.c(m79351xf939df19.f342427d);
        }
    }
}
