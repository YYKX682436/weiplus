package gf;

/* loaded from: classes7.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y f352696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f352697e;

    public q(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar, int i17) {
        this.f352696d = yVar;
        this.f352697e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(dm.i4.f66865x76d1ec5a, this.f352697e);
        this.f352696d.e("onSkylineWindowReady", jSONObject.toString(), 0);
    }
}
