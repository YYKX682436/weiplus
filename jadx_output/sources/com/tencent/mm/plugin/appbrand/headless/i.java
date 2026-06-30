package com.tencent.mm.plugin.appbrand.headless;

/* loaded from: classes7.dex */
public final class i implements l81.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.headless.p f78303a;

    public i(com.tencent.mm.plugin.appbrand.headless.p pVar) {
        this.f78303a = pVar;
    }

    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.headless.p pVar = this.f78303a;
        if (pVar != null) {
            pVar.a(i17, str);
        }
    }

    @Override // l81.v0
    public void onSuccess() {
        throw new java.lang.IllegalStateException("onError should not be called");
    }
}
