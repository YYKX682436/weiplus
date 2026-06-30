package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes.dex */
public class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f171263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f171264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f171265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12665xd7b71662 f171266h;

    public g7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12665xd7b71662 activityC12665xd7b71662, java.lang.String str, int i17, int i18, int i19) {
        this.f171266h = activityC12665xd7b71662;
        this.f171262d = str;
        this.f171263e = i17;
        this.f171264f = i18;
        this.f171265g = i19;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar = this.f171266h.f265377p0;
        if (nVar != null) {
            if (!nVar.f422428i) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onSearchGuideDataReady fail, not ready");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onSearchGuideDataReady success, ready");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("json", this.f171262d);
            hashMap.put("isCacheData", java.lang.Integer.valueOf(this.f171263e));
            hashMap.put("isExpired", java.lang.Integer.valueOf(this.f171264f));
            hashMap.put("isPreload", java.lang.Integer.valueOf(this.f171265g));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.s1(nVar, nw4.x2.c("onSearchGuideDataReady", hashMap, nVar.f422436q, nVar.f422437r)));
        }
    }
}
