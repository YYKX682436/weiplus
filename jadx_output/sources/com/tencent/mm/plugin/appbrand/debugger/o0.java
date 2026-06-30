package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public final class o0 implements com.tencent.mm.plugin.appbrand.debugger.e {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f77820a = jz5.h.b(com.tencent.mm.plugin.appbrand.debugger.n0.f77803d);

    @Override // com.tencent.mm.plugin.appbrand.debugger.e
    public void a(android.content.Intent intent) {
        java.lang.String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("url")) == null) {
            return;
        }
        ((tg1.h) ((jz5.n) this.f77820a).getValue()).b(com.tencent.mm.sdk.platformtools.x2.f193071a, stringExtra, 1011, new android.os.Bundle(), null, null);
    }

    @Override // com.tencent.mm.plugin.appbrand.debugger.e
    public java.lang.String name() {
        return "MockScanCodeUrl";
    }
}
