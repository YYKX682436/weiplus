package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public final class z1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66572d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f66573e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f66574f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f66575g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66576h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c2 f66577i;

    /* renamed from: m, reason: collision with root package name */
    public int f66578m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.feature.emoji.c2 c2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f66577i = c2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f66576h = obj;
        this.f66578m |= Integer.MIN_VALUE;
        return com.tencent.mm.feature.emoji.c2.a(this.f66577i, this);
    }
}
