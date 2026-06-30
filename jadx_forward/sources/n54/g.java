package n54;

/* loaded from: classes4.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f416668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f416669e;

    public g(boolean z17, float f17) {
        this.f416668d = z17;
        this.f416669e = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar;
        try {
            if (!this.f416668d || (aVar = n54.i.f416672a) == null) {
                return;
            }
            aVar.a(this.f416669e);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdHalfScreenLandingPageState", "onHalfScreenHeightChange, exp=" + th6.toString());
        }
    }
}
