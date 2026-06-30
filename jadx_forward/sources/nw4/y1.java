package nw4;

/* loaded from: classes.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422544e;

    public y1(nw4.n nVar, java.lang.String str) {
        this.f422544e = nVar;
        this.f422543d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f422544e.f422420a.mo14660x738236e6(this.f422543d, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onPullDownRefresh fail, ex = %s", e17.getMessage());
        }
    }
}
