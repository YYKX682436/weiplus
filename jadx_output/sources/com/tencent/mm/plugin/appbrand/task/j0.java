package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f89076d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(kotlinx.coroutines.q qVar) {
        super(0);
        this.f89076d = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        jz5.f0 f0Var = jz5.f0.f302826a;
        ((kotlinx.coroutines.r) this.f89076d).resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        return f0Var;
    }
}
