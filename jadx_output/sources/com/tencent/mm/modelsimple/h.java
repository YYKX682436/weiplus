package com.tencent.mm.modelsimple;

/* loaded from: classes11.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f71331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.j f71332e;

    /* renamed from: f, reason: collision with root package name */
    public int f71333f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.modelsimple.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f71332e = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f71331d = obj;
        this.f71333f |= Integer.MIN_VALUE;
        return this.f71332e.a(this);
    }
}
