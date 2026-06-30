package com.tencent.luggage.sdk.jsapi.component;

/* loaded from: classes7.dex */
public class i implements com.tencent.mm.plugin.appbrand.jsapi.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.j f47345a;

    public i(com.tencent.luggage.sdk.jsapi.component.j jVar) {
        this.f47345a = jVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.y
    public void a() {
        com.tencent.luggage.sdk.jsapi.component.j jVar = this.f47345a;
        jVar.f47347d.A(this);
        jVar.f47347d.a2().e0(new java.lang.Runnable() { // from class: com.tencent.luggage.sdk.jsapi.component.i$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.luggage.sdk.jsapi.component.j jVar2 = com.tencent.luggage.sdk.jsapi.component.i.this.f47345a;
                jVar2.f47347d.y3();
                com.tencent.mm.plugin.appbrand.page.fb a27 = jVar2.f47347d.a2();
                if (a27 != null) {
                    a27.setVerticalScrollBarEnabled(true);
                }
            }
        });
    }
}
