package su4;

/* loaded from: classes8.dex */
public class y2 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f494678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ su4.d3 f494679b;

    public y2(su4.d3 d3Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59) {
        this.f494679b = d3Var;
        this.f494678a = c22633x83752a59;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494679b.f494391a, "loadJavaScript, jsContent evaluateJavascript cb, ret = %s, view %s", (java.lang.String) obj, this.f494678a.toString());
    }
}
