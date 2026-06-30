package n54;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f416670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f416671e;

    public h(boolean z17, boolean z18) {
        this.f416670d = z17;
        this.f416671e = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = n54.i.f416672a;
            if (aVar == null) {
                return;
            }
            boolean z17 = this.f416670d;
            boolean z18 = this.f416671e;
            if (z17) {
                aVar.c(true, z18, 0);
            } else {
                aVar.c(false, z18, 0);
                if (!z18) {
                    n54.i.f416672a.b();
                    n54.i.e(null);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdHalfScreenLandingPageState", "onHalfScreenAnimationChange, exp=" + th6.toString());
        }
    }
}
