package nw4;

/* loaded from: classes.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f422539e;

    public x1(nw4.n nVar, java.lang.String str) {
        this.f422539e = nVar;
        this.f422538d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f422539e.f422420a.mo14660x738236e6(this.f422538d, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onPullDownRefresh fail, ex = %s", e17.getMessage());
        }
    }
}
