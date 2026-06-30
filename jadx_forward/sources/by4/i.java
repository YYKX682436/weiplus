package by4;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x f117924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ by4.k f117925e;

    public i(com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x xVar, by4.k kVar) {
        this.f117924d = xVar;
        this.f117925e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.p314xaae8f345.mm.vfs.w6.M(new com.p314xaae8f345.mm.vfs.r6(this.f117924d.m117639xfb83cc9b()).o()));
            ((ku5.t0) ku5.t0.f394148d).B(new by4.h(this.f117925e, jSONObject));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WebViewThirdPartyDisclaimHelper", "read file error", e17);
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WebViewThirdPartyDisclaimHelper", "read file error", e18);
        }
    }
}
