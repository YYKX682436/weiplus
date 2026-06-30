package com.tencent.mm.feature.lite;

/* loaded from: classes15.dex */
public class h1 implements android.content.ComponentCallbacks2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67165f;

    public h1(com.tencent.mm.feature.lite.i iVar, java.lang.String str, java.lang.String str2) {
        this.f67165f = iVar;
        this.f67163d = str;
        this.f67164e = str2;
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
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp onTrimMemory, release");
            this.f67165f.Yj(this.f67163d, this.f67164e);
        }
    }
}
