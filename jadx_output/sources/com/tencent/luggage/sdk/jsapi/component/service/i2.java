package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public final class i2 implements ui1.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.n2 f47452a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f47453b;

    public i2(com.tencent.luggage.sdk.jsapi.component.service.n2 n2Var, long j17) {
        this.f47452a = n2Var;
        this.f47453b = j17;
    }

    @Override // ui1.r
    public void a() {
        com.tencent.mm.weapp_core.JsBridge jsBridge = this.f47452a.f47502a;
        if (jsBridge == null) {
            kotlin.jvm.internal.o.o("jsBridge");
            throw null;
        }
        jsBridge.onUserAuthResult(this.f47453b, vp5.j.f439121d);
    }

    @Override // ui1.r
    public void c(int i17, java.lang.String str) {
        com.tencent.mm.weapp_core.JsBridge jsBridge = this.f47452a.f47502a;
        if (jsBridge == null) {
            kotlin.jvm.internal.o.o("jsBridge");
            throw null;
        }
        jsBridge.onUserAuthResult(this.f47453b, vp5.j.f439123f);
    }

    @Override // ui1.r
    public void onCancel() {
        com.tencent.mm.weapp_core.JsBridge jsBridge = this.f47452a.f47502a;
        if (jsBridge == null) {
            kotlin.jvm.internal.o.o("jsBridge");
            throw null;
        }
        jsBridge.onUserAuthResult(this.f47453b, vp5.j.f439122e);
    }
}
