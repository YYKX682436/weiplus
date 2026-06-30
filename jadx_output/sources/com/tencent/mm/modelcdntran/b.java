package com.tencent.mm.modelcdntran;

/* loaded from: classes12.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f70878d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f70879e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f70880f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelcdntran.c f70881g;

    /* renamed from: h, reason: collision with root package name */
    public int f70882h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.modelcdntran.c cVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f70881g = cVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f70880f = obj;
        this.f70882h |= Integer.MIN_VALUE;
        return this.f70881g.c(this);
    }
}
