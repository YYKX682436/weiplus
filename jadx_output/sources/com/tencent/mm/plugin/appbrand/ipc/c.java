package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public final class c extends hm0.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f78398d;

    public c(kotlin.coroutines.Continuation continuation) {
        this.f78398d = continuation;
    }

    @Override // hm0.t
    public void b() {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f78398d.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }
}
