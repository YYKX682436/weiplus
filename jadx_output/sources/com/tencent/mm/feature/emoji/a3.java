package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public final class a3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66021d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f66022e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f66023f;

    /* renamed from: g, reason: collision with root package name */
    public int f66024g;

    /* renamed from: h, reason: collision with root package name */
    public int f66025h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66026i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66027m;

    /* renamed from: n, reason: collision with root package name */
    public int f66028n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.tencent.mm.feature.emoji.c4 c4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f66027m = c4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f66026i = obj;
        this.f66028n |= Integer.MIN_VALUE;
        return this.f66027m.Ri(null, null, null, null, 0, 0, this);
    }
}
