package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f;

/* loaded from: classes8.dex */
public final class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 f263536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f263537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f263538f;

    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var, int i17, int i18) {
        this.f263536d = e3Var;
        this.f263537e = i17;
        this.f263538f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = this.f263536d;
        pw4.c cVar = e3Var.f263471l;
        int f17 = e3Var.f263449a.mo120153xd15cf999().f();
        cVar.f440251g = this.f263537e;
        cVar.f440252h = f17;
        nw4.n g07 = e3Var.g0();
        boolean z17 = g07.f422428i;
        int i17 = this.f263538f;
        if (z17) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("fontSize", java.lang.String.valueOf(i17));
            g07.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("menu:setfont", hashMap, g07.f422436q, g07.f422437r) + ")", null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onFontSizeChanged fail, not ready");
        }
        java.util.Iterator it = e3Var.Z.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.f3) it.next()).g(i17);
        }
    }
}
