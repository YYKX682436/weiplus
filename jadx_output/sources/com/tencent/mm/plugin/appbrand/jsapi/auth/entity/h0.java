package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes7.dex */
public final class h0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 f79503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79504e;

    public h0(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var, int i17) {
        this.f79503d = m0Var;
        this.f79504e = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var = this.f79503d;
        if (m0Var.f79525g == i17) {
            com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0.d(m0Var, this.f79504e, intent);
        }
    }
}
