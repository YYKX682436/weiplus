package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class i1 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f80242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.l1 f80243b;

    public i1(boolean z17, com.tencent.mm.plugin.appbrand.jsapi.channels.l1 l1Var) {
        this.f80242a = z17;
        this.f80243b = l1Var;
    }

    @Override // zy2.i5
    public final void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedResult.CREATOR.getClass();
        com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedResult openFinderFeedResult = new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedResult(com.tencent.mm.plugin.appbrand.jsapi.channels.s1.f80269f, 0, new org.json.JSONObject());
        boolean z17 = this.f80242a;
        com.tencent.mm.plugin.appbrand.jsapi.channels.l1 l1Var = this.f80243b;
        if (z17) {
            l1Var.sendResult(openFinderFeedResult);
        } else {
            l1Var.finishProcess(openFinderFeedResult);
        }
    }
}
