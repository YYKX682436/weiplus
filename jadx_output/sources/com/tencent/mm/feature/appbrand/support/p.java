package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f65097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f65097d = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f65097d.resumeWith(kotlin.Result.m521constructorimpl((com.tencent.mm.ipcinvoker.type.IPCBoolean) obj));
        return jz5.f0.f302826a;
    }
}
