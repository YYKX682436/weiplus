package com.tencent.mm.plugin.appbrand.launch.magicbrush_frame;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f84312d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kotlinx.coroutines.q qVar) {
        super(1);
        this.f84312d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCVoid it = (com.tencent.mm.ipcinvoker.type.IPCVoid) obj;
        kotlin.jvm.internal.o.g(it, "it");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        jz5.f0 f0Var = jz5.f0.f302826a;
        ((kotlinx.coroutines.r) this.f84312d).resumeWith(kotlin.Result.m521constructorimpl(f0Var));
        return f0Var;
    }
}
