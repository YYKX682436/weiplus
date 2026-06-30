package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes5.dex */
public final class k0 extends com.tencent.mm.plugin.appbrand.jsapi.auth.l0 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f79611b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f79612c;

    /* renamed from: d, reason: collision with root package name */
    public final int f79613d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f79614e;

    /* renamed from: f, reason: collision with root package name */
    public final int f79615f;

    /* renamed from: g, reason: collision with root package name */
    public final int f79616g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(android.content.Context context, java.lang.String userName, int i17, java.lang.String path, int i18, int i19) {
        super(null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(path, "path");
        this.f79611b = context;
        this.f79612c = userName;
        this.f79613d = i17;
        this.f79614e = path;
        this.f79615f = i18;
        this.f79616g = i19;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.l0
    public void a() {
        l81.b1 b1Var = new l81.b1();
        b1Var.f317012a = this.f79612c;
        b1Var.f317022f = this.f79614e;
        b1Var.f317032k = this.f79615f;
        b1Var.f317016c = this.f79613d;
        b1Var.f317018d = this.f79616g;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f79611b, b1Var);
    }
}
