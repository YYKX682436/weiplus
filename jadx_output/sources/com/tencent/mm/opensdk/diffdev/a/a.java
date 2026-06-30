package com.tencent.mm.opensdk.diffdev.a;

/* loaded from: classes15.dex */
public final class a implements com.tencent.mm.opensdk.diffdev.IDiffDevOAuth {

    /* renamed from: d, reason: collision with root package name */
    private com.tencent.mm.opensdk.diffdev.a.d f72330d;
    private android.os.Handler handler = null;

    /* renamed from: c, reason: collision with root package name */
    private java.util.List<com.tencent.mm.opensdk.diffdev.OAuthListener> f72329c = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private com.tencent.mm.opensdk.diffdev.OAuthListener f72331e = new com.tencent.mm.opensdk.diffdev.a.b(this);

    public static /* synthetic */ com.tencent.mm.opensdk.diffdev.a.d c(com.tencent.mm.opensdk.diffdev.a.a aVar) {
        aVar.f72330d = null;
        return null;
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public final void addListener(com.tencent.mm.opensdk.diffdev.OAuthListener oAuthListener) {
        if (this.f72329c.contains(oAuthListener)) {
            return;
        }
        this.f72329c.add(oAuthListener);
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public final boolean auth(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.mm.opensdk.diffdev.OAuthListener oAuthListener) {
        com.tencent.mm.opensdk.utils.Log.i("MicroMsg.SDK.DiffDevOAuth", "start auth, appId = ".concat(java.lang.String.valueOf(str)));
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            com.tencent.mm.opensdk.utils.Log.d("MicroMsg.SDK.DiffDevOAuth", java.lang.String.format("auth fail, invalid argument, appId = %s, scope = %s", str, str2));
            return false;
        }
        if (this.handler == null) {
            this.handler = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        addListener(oAuthListener);
        if (this.f72330d != null) {
            com.tencent.mm.opensdk.utils.Log.d("MicroMsg.SDK.DiffDevOAuth", "auth, already running, no need to start auth again");
            return true;
        }
        com.tencent.mm.opensdk.diffdev.a.d dVar = new com.tencent.mm.opensdk.diffdev.a.d(str, str2, str3, str4, str5, this.f72331e);
        this.f72330d = dVar;
        dVar.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
        return true;
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public final void detach() {
        com.tencent.mm.opensdk.utils.Log.i("MicroMsg.SDK.DiffDevOAuth", "detach");
        this.f72329c.clear();
        stopAuth();
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public final void removeAllListeners() {
        this.f72329c.clear();
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public final void removeListener(com.tencent.mm.opensdk.diffdev.OAuthListener oAuthListener) {
        this.f72329c.remove(oAuthListener);
    }

    @Override // com.tencent.mm.opensdk.diffdev.IDiffDevOAuth
    public final boolean stopAuth() {
        boolean z17;
        com.tencent.mm.opensdk.utils.Log.i("MicroMsg.SDK.DiffDevOAuth", "stopAuth");
        try {
            com.tencent.mm.opensdk.diffdev.a.d dVar = this.f72330d;
            z17 = dVar == null ? true : dVar.a();
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.w("MicroMsg.SDK.DiffDevOAuth", "stopAuth fail, ex = " + e17.getMessage());
            z17 = false;
        }
        this.f72330d = null;
        return z17;
    }
}
