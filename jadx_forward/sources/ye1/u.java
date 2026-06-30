package ye1;

/* loaded from: classes15.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ye1.w f542734d;

    public u(ye1.w wVar, ye1.t tVar) {
        this.f542734d = wVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ye1.v vVar = this.f542734d.f542738d;
        if (vVar != null) {
            af1.m mVar = (af1.m) vVar;
            synchronized (mVar.f86025a) {
                if (!mVar.f86025a.K) {
                    if (mVar.f86025a.M()) {
                        af1.x xVar = mVar.f86025a;
                        int i17 = ((m8.k) xVar.f86036r).f406116k;
                        if (i17 != 1) {
                            if (i17 == 2 || i17 == 3) {
                                int g17 = xVar.M() ? ((m8.k) xVar.f86036r).g() : 0;
                                af1.x xVar2 = mVar.f86025a;
                                if (g17 != xVar2.H) {
                                    xVar2.D(g17);
                                    mVar.f86025a.H = g17;
                                }
                            } else if (i17 != 4) {
                            }
                        }
                        xVar.V(false);
                    }
                }
            }
        }
        if (this.f542734d.f542735a) {
            ye1.w wVar = this.f542734d;
            wVar.f542737c.postDelayed(wVar.f542739e, wVar.f542736b);
        }
    }
}
