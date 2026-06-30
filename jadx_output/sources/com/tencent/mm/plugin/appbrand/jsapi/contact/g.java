package com.tencent.mm.plugin.appbrand.jsapi.contact;

/* loaded from: classes15.dex */
public class g implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.contact.h f80549a;

    public g(com.tencent.mm.plugin.appbrand.jsapi.contact.h hVar) {
        this.f80549a = hVar;
    }

    @Override // nf.j
    public void onResult(int i17, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.contact.h hVar = this.f80549a;
        if (i17 == 0) {
            hVar.f80553f.a(hVar.f80554g, hVar.f80555h.o("cancel"));
        } else {
            hVar.f80553f.a(hVar.f80554g, hVar.f80555h.o("ok"));
        }
    }
}
