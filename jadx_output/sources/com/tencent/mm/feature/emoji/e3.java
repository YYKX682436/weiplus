package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public final class e3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66237d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f66238e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66239f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66240g;

    /* renamed from: h, reason: collision with root package name */
    public int f66241h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(com.tencent.mm.feature.emoji.c4 c4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f66240g = c4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f66239f = obj;
        this.f66241h |= Integer.MIN_VALUE;
        return this.f66240g.Vi(null, null, this);
    }
}
