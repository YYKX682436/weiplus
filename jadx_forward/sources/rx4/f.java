package rx4;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430 f482681d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430 c19404xac949430) {
        this.f482681d = c19404xac949430;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic.C19404xac949430 c19404xac949430 = this.f482681d;
        android.view.ViewGroup viewGroup = c19404xac949430.f266174e;
        if (viewGroup == null || viewGroup.getVisibility() == 0 || !c19404xac949430.f266180n) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.hitest.FTSFlutterSearchUIC", "Flutter view is not visible after 1s, show it");
        viewGroup.setVisibility(0);
    }
}
