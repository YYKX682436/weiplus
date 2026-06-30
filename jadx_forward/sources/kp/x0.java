package kp;

/* loaded from: classes13.dex */
public final class x0 implements android.net.wifi.p2p.WifiP2pManager.ActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f392389b;

    public x0(kp.i1 i1Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f392388a = i1Var;
        this.f392389b = qVar;
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onFailure(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WiFiDirectService", "removeGroup fail: " + i17);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f392389b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
    }

    @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
    public void onSuccess() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WiFiDirectService", "removeGroup success");
        kp.i1 i1Var = this.f392388a;
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) i1Var.f392300h).k(null);
        ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) i1Var.f392301i).k(java.lang.Boolean.FALSE);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f392389b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE));
    }
}
