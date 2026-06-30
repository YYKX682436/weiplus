package by4;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.udr.x f36391d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ by4.k f36392e;

    public i(com.tencent.wechat.aff.udr.x xVar, by4.k kVar) {
        this.f36391d = xVar;
        this.f36392e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.tencent.mm.vfs.w6.M(new com.tencent.mm.vfs.r6(this.f36391d.getPath()).o()));
            ((ku5.t0) ku5.t0.f312615d).B(new by4.h(this.f36392e, jSONObject));
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("WebViewThirdPartyDisclaimHelper", "read file error", e17);
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.e("WebViewThirdPartyDisclaimHelper", "read file error", e18);
        }
    }
}
