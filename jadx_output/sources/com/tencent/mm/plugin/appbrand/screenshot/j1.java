package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes4.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.LifecycleScope f88500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.screenshot.n1 f88501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f88502f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope, com.tencent.mm.plugin.appbrand.screenshot.n1 n1Var, java.lang.String str) {
        super(1);
        this.f88500d = lifecycleScope;
        this.f88501e = n1Var;
        this.f88502f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        v65.i.b(this.f88500d, null, new com.tencent.mm.plugin.appbrand.screenshot.i1(this.f88501e, this.f88502f, null), 1, null);
        return jz5.f0.f302826a;
    }
}
