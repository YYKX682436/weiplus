package com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a;

/* loaded from: classes15.dex */
public final class a implements com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11226xcd5b1db0 {

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.d f153863d;

    /* renamed from: handler */
    private android.os.Handler f32860x294b574a = null;

    /* renamed from: c, reason: collision with root package name */
    private java.util.List<com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11228xdc3b346b> f153862c = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11228xdc3b346b f153864e = new com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.b(this);

    public static /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.d c(com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.a aVar) {
        aVar.f153863d = null;
        return null;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11226xcd5b1db0
    /* renamed from: addListener */
    public final void mo48407x162a7075(com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11228xdc3b346b interfaceC11228xdc3b346b) {
        if (this.f153862c.contains(interfaceC11228xdc3b346b)) {
            return;
        }
        this.f153862c.add(interfaceC11228xdc3b346b);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11226xcd5b1db0
    /* renamed from: auth */
    public final boolean mo48408x2ddda8(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11228xdc3b346b interfaceC11228xdc3b346b) {
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("MicroMsg.SDK.DiffDevOAuth", "start auth, appId = ".concat(java.lang.String.valueOf(str)));
        if (str == null || str.length() <= 0 || str2 == null || str2.length() <= 0) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d("MicroMsg.SDK.DiffDevOAuth", java.lang.String.format("auth fail, invalid argument, appId = %s, scope = %s", str, str2));
            return false;
        }
        if (this.f32860x294b574a == null) {
            this.f32860x294b574a = new android.os.Handler(android.os.Looper.getMainLooper());
        }
        mo48407x162a7075(interfaceC11228xdc3b346b);
        if (this.f153863d != null) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d("MicroMsg.SDK.DiffDevOAuth", "auth, already running, no need to start auth again");
            return true;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.d dVar = new com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.d(str, str2, str3, str4, str5, this.f153864e);
        this.f153863d = dVar;
        dVar.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11226xcd5b1db0
    /* renamed from: detach */
    public final void mo48409xb06a1793() {
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("MicroMsg.SDK.DiffDevOAuth", "detach");
        this.f153862c.clear();
        mo48412x662d88ca();
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11226xcd5b1db0
    /* renamed from: removeAllListeners */
    public final void mo48410x95866442() {
        this.f153862c.clear();
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11226xcd5b1db0
    /* renamed from: removeListener */
    public final void mo48411xf1335d58(com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11228xdc3b346b interfaceC11228xdc3b346b) {
        this.f153862c.remove(interfaceC11228xdc3b346b);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11226xcd5b1db0
    /* renamed from: stopAuth */
    public final boolean mo48412x662d88ca() {
        boolean z17;
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i("MicroMsg.SDK.DiffDevOAuth", "stopAuth");
        try {
            com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.d dVar = this.f153863d;
            z17 = dVar == null ? true : dVar.a();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.w("MicroMsg.SDK.DiffDevOAuth", "stopAuth fail, ex = " + e17.getMessage());
            z17 = false;
        }
        this.f153863d = null;
        return z17;
    }
}
