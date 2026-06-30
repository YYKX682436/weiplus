package be5;

/* loaded from: classes9.dex */
public final class a implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21856x604a8fa f101095d;

    public a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21856x604a8fa c21856x604a8fa) {
        this.f101095d = c21856x604a8fa;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ae5.n nVar = (ae5.n) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initDataObserver >> ");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2672xc9fa65a8.p2673x636d539.p2674x9da2e250.C21856x604a8fa c21856x604a8fa = this.f101095d;
        sb6.append(c21856x604a8fa.f284212r);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiAllResultFragment", sb6.toString());
        if (c21856x604a8fa.f284212r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiAllResultFragment", "initDataObserver >> " + nVar);
            if (nVar == ae5.n.f85967f) {
                p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = c21856x604a8fa.mo7430x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7430x19263085);
                pf5.z zVar = pf5.z.f435481a;
                if (!(mo7430x19263085 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                c21856x604a8fa.r0(((ee5.h0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) mo7430x19263085).a(ee5.h0.class)).R6());
                c21856x604a8fa.f284212r = false;
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiAllResultFragment", "initDataObserver >> setResult to gone");
            android.widget.TextView textView = c21856x604a8fa.f284210p;
            if (textView != null) {
                textView.setVisibility(8);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c21856x604a8fa.f284209o;
            if (c1163xf1deaba4 == null) {
                return;
            }
            c1163xf1deaba4.setVisibility(8);
        }
    }
}
