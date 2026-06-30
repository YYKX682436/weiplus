package nw4;

/* loaded from: classes8.dex */
public class j0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422389a;

    public j0(nw4.n nVar, java.lang.String str) {
        this.f422389a = str;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "handle url %s, re %s", this.f422389a, (java.lang.String) obj);
    }
}
