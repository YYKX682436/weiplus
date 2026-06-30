package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes15.dex */
public class h1 implements android.content.ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i f148698f;

    public h1(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, java.lang.String str, java.lang.String str2) {
        this.f148698f = iVar;
        this.f148696d = str;
        this.f148697e = str2;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        if (i17 >= 40) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp onTrimMemory, release");
            this.f148698f.Yj(this.f148696d, this.f148697e);
        }
    }
}
