package sx4;

/* loaded from: classes8.dex */
public class g0 extends com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f495141a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b f495142b;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b activityC19411xef36c7b, java.lang.String str) {
        this.f495142b = activityC19411xef36c7b;
        this.f495141a = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.d
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b activityC19411xef36c7b = this.f495142b;
        if (activityC19411xef36c7b.N3) {
            return;
        }
        activityC19411xef36c7b.N3 = true;
        activityC19411xef36c7b.Q2.mo50297x7c4d7ca2(new sx4.e0(this), 1000L);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.d
    public void b(boolean z17) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b.S3;
        this.f495142b.Q2.mo50293x3498a0(new sx4.f0(this, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2458x5c6729a.d
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.GameWebViewUI", "onReload");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b activityC19411xef36c7b = this.f495142b;
        activityC19411xef36c7b.R3 = true;
        if (activityC19411xef36c7b.Q3) {
            activityC19411xef36c7b.Q3 = false;
            activityC19411xef36c7b.R3 = false;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new sx4.m0(activityC19411xef36c7b), 100L);
        }
    }
}
