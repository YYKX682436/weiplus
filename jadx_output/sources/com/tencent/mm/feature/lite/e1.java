package com.tencent.mm.feature.lite;

/* loaded from: classes8.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f67147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67148f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.lite.i f67149g;

    public e1(com.tencent.mm.feature.lite.i iVar, java.lang.String str, int i17, java.lang.String str2) {
        this.f67149g = iVar;
        this.f67146d = str;
        this.f67147e = i17;
        this.f67148f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f67147e);
        java.lang.String str = this.f67146d;
        java.lang.String str2 = this.f67148f;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp onTimer, appId:%s, engineId:%s, path:%s", str, valueOf, str2);
        this.f67149g.Yj(str, str2);
    }
}
