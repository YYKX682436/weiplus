package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes7.dex */
public final class g0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 f79502a;

    public g0(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var) {
        this.f79502a = m0Var;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var = this.f79502a;
        if (m0Var.f79525g != i17) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0.c(m0Var, intent);
        return true;
    }
}
