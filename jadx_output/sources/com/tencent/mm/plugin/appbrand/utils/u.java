package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class u implements com.tencent.mm.plugin.appbrand.utils.y3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f90571a;

    public u(kotlin.coroutines.Continuation continuation) {
        this.f90571a = continuation;
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.y3
    public final void a(com.tencent.mm.plugin.appbrand.utils.i4 result) {
        kotlin.jvm.internal.o.g(result, "result");
        this.f90571a.resumeWith(kotlin.Result.m521constructorimpl(result));
    }
}
