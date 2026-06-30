package com.tencent.mm.modelsimple;

/* loaded from: classes11.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f71339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.j f71340e;

    /* renamed from: f, reason: collision with root package name */
    public int f71341f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.modelsimple.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f71340e = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f71339d = obj;
        this.f71341f |= Integer.MIN_VALUE;
        return this.f71340e.b(0, null, null, null, null, null, 0, null, this);
    }
}
