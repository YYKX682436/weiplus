package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes.dex */
public final class x1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.y1 f79776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f79777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f79778c;

    public x1(com.tencent.mm.plugin.appbrand.jsapi.auth.y1 y1Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f79776a = y1Var;
        this.f79777b = e9Var;
        this.f79778c = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.appbrand.jsapi.auth.y1 y1Var = this.f79776a;
        if (y1Var.f79794g != i17) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.y1.C(y1Var, intent, this.f79777b, this.f79778c, i18);
        return true;
    }
}
