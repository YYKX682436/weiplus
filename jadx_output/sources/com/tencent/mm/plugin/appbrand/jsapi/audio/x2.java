package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class x2 implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f79299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.audio.d3 f79300e;

    public x2(com.tencent.mm.plugin.appbrand.jsapi.audio.d3 d3Var, com.tencent.mm.plugin.appbrand.e9 e9Var) {
        this.f79300e = d3Var;
        this.f79299d = e9Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        com.tencent.mm.plugin.appbrand.jsapi.audio.l3.C(this.f79299d);
        this.f79300e.f79177h.K(this);
    }
}
