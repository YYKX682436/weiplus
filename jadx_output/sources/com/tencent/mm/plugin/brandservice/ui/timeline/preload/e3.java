package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes.dex */
public final class e3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f94228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(kotlin.coroutines.Continuation continuation) {
        super(1);
        this.f94228d = continuation;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f94228d.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue())));
        return jz5.f0.f302826a;
    }
}
