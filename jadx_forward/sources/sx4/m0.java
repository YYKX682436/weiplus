package sx4;

/* loaded from: classes8.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b f495164d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b activityC19411xef36c7b) {
        this.f495164d = activityC19411xef36c7b;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b.S3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b activityC19411xef36c7b = this.f495164d;
        if (activityC19411xef36c7b.f265348f != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.GameWebViewUI", "home page, reload url:%s from net", activityC19411xef36c7b.f265340c2);
            activityC19411xef36c7b.f265348f.mo120194xc77ccada();
            activityC19411xef36c7b.f265348f.mo32265x141096a9(activityC19411xef36c7b.f265340c2);
        }
    }
}
