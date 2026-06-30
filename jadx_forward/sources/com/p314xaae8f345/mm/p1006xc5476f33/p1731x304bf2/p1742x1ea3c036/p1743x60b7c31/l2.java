package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public class l2 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.b f221241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j2 f221242b;

    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.j2 j2Var, sd.b bVar) {
        this.f221242b = j2Var;
        this.f221241a = bVar;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "openLiteApp failed");
        this.f221242b.f(this.f221241a);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenGameUrlWithExtraWebView", "openLiteApp success");
        this.f221241a.a();
    }
}
