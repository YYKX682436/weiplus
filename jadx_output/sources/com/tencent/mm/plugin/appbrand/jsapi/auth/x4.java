package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class x4 implements u81.f, com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.j5 f79786d;

    public x4(com.tencent.mm.plugin.appbrand.jsapi.auth.j5 j5Var) {
        this.f79786d = j5Var;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.DESTROYED == bVar) {
            this.f79786d.g(false);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        this.f79786d.g(false);
    }
}
