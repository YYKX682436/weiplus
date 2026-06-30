package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class c0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f65369d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f65370e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f65371f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f65372g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f65373h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatrecordstts.b1 f65374i;

    /* renamed from: m, reason: collision with root package name */
    public int f65375m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.feature.chatrecordstts.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f65374i = b1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f65373h = obj;
        this.f65375m |= Integer.MIN_VALUE;
        return com.tencent.mm.feature.chatrecordstts.b1.aj(this.f65374i, null, this);
    }
}
