package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class j1 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.l1 f80244a;

    public j1(com.tencent.mm.plugin.appbrand.jsapi.channels.l1 l1Var) {
        this.f80244a = l1Var;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mm.plugin.appbrand.jsapi.channels.h1 h1Var = com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedResult.CREATOR;
        kotlin.jvm.internal.o.d(num);
        int intValue = num.intValue();
        h1Var.getClass();
        this.f80244a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedResult(com.tencent.mm.plugin.appbrand.jsapi.channels.s1.f80269f, intValue, new org.json.JSONObject()));
    }
}
