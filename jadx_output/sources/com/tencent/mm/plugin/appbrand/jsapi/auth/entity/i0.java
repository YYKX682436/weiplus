package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes7.dex */
public final class i0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 f79506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f79507b;

    public i0(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var, int i17) {
        this.f79506a = m0Var;
        this.f79507b = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var = this.f79506a;
        if (m0Var.f79525g != i17) {
            return true;
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0.d(m0Var, this.f79507b, intent);
        return true;
    }
}
