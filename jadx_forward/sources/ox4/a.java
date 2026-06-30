package ox4;

/* loaded from: classes8.dex */
public final class a implements zg0.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ox4.b f431321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zg0.v2 f431322b;

    public a(ox4.b bVar, zg0.v2 v2Var) {
        this.f431321a = bVar;
        this.f431322b = v2Var;
    }

    public void a(int i17, int i18) {
        boolean z17;
        int i19 = this.f431321a.f431323a;
        if (i19 != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewExtEventHandler", "checkWebViewIdValid failed %s, %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17));
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewExtEventHandler", "onImageViewPositionChanged dispatchEvent webViewId: " + i17 + ", pos: " + i18);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(ya.b.f77479x42930b2, java.lang.Integer.valueOf(i18));
            ((nw4.n) this.f431322b).o("onImagePreviewChanged", hashMap);
        }
    }
}
