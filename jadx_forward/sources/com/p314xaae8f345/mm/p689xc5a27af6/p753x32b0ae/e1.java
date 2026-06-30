package com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae;

/* loaded from: classes8.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f148680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148681f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i f148682g;

    public e1(com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar, java.lang.String str, int i17, java.lang.String str2) {
        this.f148682g = iVar;
        this.f148679d = str;
        this.f148680e = i17;
        this.f148681f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f148680e);
        java.lang.String str = this.f148679d;
        java.lang.String str2 = this.f148681f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppFeatureService", "preloadLiteApp onTimer, appId:%s, engineId:%s, path:%s", str, valueOf, str2);
        this.f148682g.Yj(str, str2);
    }
}
