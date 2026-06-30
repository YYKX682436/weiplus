package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes11.dex */
public final class z implements kv.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kv.h0 f79803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.b0 f79804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79805c;

    public z(kv.h0 h0Var, com.tencent.mm.plugin.appbrand.jsapi.auth.b0 b0Var, java.lang.String str) {
        this.f79803a = h0Var;
        this.f79804b = b0Var;
        this.f79805c = str;
    }

    @Override // kv.g0
    public final int a(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.appbrand.jsapi.auth.c0.f79421b, "GetHDHeadImg errType=%d  errCode=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        ((com.tencent.mm.modelavatar.m0) this.f79803a).b();
        com.tencent.mm.plugin.appbrand.jsapi.auth.b0 b0Var = this.f79804b;
        if (b0Var != null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            b0Var.a(com.tencent.mm.modelavatar.d1.Ai().j(this.f79805c, false));
        }
        return 0;
    }
}
