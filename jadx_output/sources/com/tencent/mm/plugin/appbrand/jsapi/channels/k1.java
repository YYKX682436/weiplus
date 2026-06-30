package com.tencent.mm.plugin.appbrand.jsapi.channels;

/* loaded from: classes7.dex */
public final class k1 implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.channels.l1 f80248a;

    public k1(com.tencent.mm.plugin.appbrand.jsapi.channels.l1 l1Var) {
        this.f80248a = l1Var;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        com.tencent.mm.plugin.appbrand.jsapi.channels.h1 h1Var = com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedResult.CREATOR;
        kotlin.jvm.internal.o.d(jSONObject);
        h1Var.getClass();
        this.f80248a.finishProcess(new com.tencent.mm.plugin.appbrand.jsapi.channels.OpenFinderFeedResult(com.tencent.mm.plugin.appbrand.jsapi.channels.s1.f80270g, 0, jSONObject));
    }
}
