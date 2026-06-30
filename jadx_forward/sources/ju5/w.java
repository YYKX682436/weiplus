package ju5;

/* loaded from: classes15.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju5.y f383696d;

    public w(ju5.y yVar) {
        this.f383696d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gu5.d dVar = this.f383696d.f383700c.f383706h;
        if (dVar != null) {
            pe4.g gVar = (pe4.g) dVar;
            gVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SoterControllerFingerprint", "hy: mp user trying failed");
            pe4.m mVar = gVar.f435234a;
            if (mVar.f435250a.f476056e.booleanValue()) {
                re4.d0 d0Var = mVar.f435251b;
                d0Var.f476059a = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54069x7617ffff;
                android.os.Handler handler = mVar.f435253d;
                if (handler != null) {
                    handler.obtainMessage(7, d0Var).sendToTarget();
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
                    return;
                }
            }
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jis);
            if (!mVar.f435250a.f476055d.booleanValue()) {
                if (mVar.f435246o == null) {
                    mVar.f435246o = pe4.m.h(mVar.f435244m.getContext(), -1L);
                }
                if (mVar.f435247p == null) {
                    mVar.f435247p = pe4.m.h(mVar.f435244m.getContext(), -1L);
                }
                mVar.f435246o.setAnimationListener(new pe4.k(mVar, string));
                mVar.f435245n.startAnimation(mVar.f435246o);
                mVar.f435244m.startAnimation(mVar.f435247p);
            }
            mVar.f435248q.postDelayed(new pe4.f(gVar), 500L);
        }
    }
}
