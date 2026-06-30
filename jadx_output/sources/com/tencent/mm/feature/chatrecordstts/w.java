package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f65546d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f65547e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65548f;

    /* renamed from: g, reason: collision with root package name */
    public int f65549g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.feature.chatrecordstts.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f65548f = b1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f65547e = obj;
        this.f65549g |= Integer.MIN_VALUE;
        return this.f65548f.fj(this);
    }
}
