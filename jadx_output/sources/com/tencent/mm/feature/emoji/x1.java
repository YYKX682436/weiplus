package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public final class x1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66538d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c2 f66540f;

    /* renamed from: g, reason: collision with root package name */
    public int f66541g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.tencent.mm.feature.emoji.c2 c2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f66540f = c2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f66539e = obj;
        this.f66541g |= Integer.MIN_VALUE;
        return this.f66540f.c(null, this);
    }
}
