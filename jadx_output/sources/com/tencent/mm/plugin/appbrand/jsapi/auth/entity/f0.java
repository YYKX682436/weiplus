package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes7.dex */
public final class f0 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 f79499d;

    public f0(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var) {
        this.f79499d = m0Var;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var = this.f79499d;
        if (m0Var.f79525g == i17) {
            com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0.c(m0Var, intent);
        }
    }
}
