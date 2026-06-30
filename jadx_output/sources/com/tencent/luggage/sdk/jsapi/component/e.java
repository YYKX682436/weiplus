package com.tencent.luggage.sdk.jsapi.component;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.f f47335d;

    public e(com.tencent.luggage.sdk.jsapi.component.f fVar) {
        this.f47335d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.luggage.sdk.jsapi.component.f fVar = this.f47335d;
        fVar.f47336a.f47343m.f47344a.y3();
        com.tencent.mm.plugin.appbrand.page.fb a27 = fVar.f47336a.f47343m.f47344a.a2();
        if (a27 != null) {
            a27.setVerticalScrollBarEnabled(true);
        }
    }
}
