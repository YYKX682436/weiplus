package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class s2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f85132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f85134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC f85135g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(kotlin.jvm.internal.c0 c0Var, java.lang.String str, boolean z17, com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC appBrandSysConfigWC) {
        super(0);
        this.f85132d = c0Var;
        this.f85133e = str;
        this.f85134f = z17;
        this.f85135g = appBrandSysConfigWC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f85132d.f310112d = true;
        return ((ku5.t0) ku5.t0.f312615d).c(new com.tencent.mm.plugin.appbrand.launching.v2(this.f85133e, this.f85134f, this.f85135g, null));
    }
}
