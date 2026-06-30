package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes7.dex */
public final class o1 implements com.tencent.mm.plugin.appbrand.screenshot.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f88538a;

    public o1(kotlin.coroutines.Continuation continuation) {
        this.f88538a = continuation;
    }

    @Override // com.tencent.mm.plugin.appbrand.screenshot.r0
    public final void a(java.lang.String enterPath) {
        kotlin.jvm.internal.o.g(enterPath, "enterPath");
        this.f88538a.resumeWith(kotlin.Result.m521constructorimpl(enterPath));
    }
}
