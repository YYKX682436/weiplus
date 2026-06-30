package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes.dex */
public final class w1 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.y1 f79766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f79767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f79768f;

    public w1(com.tencent.mm.plugin.appbrand.jsapi.auth.y1 y1Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f79766d = y1Var;
        this.f79767e = e9Var;
        this.f79768f = i17;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.y1 y1Var = this.f79766d;
        if (y1Var.f79794g == i17) {
            com.tencent.mm.plugin.appbrand.jsapi.auth.y1.C(y1Var, intent, this.f79767e, this.f79768f, i18);
        }
    }
}
