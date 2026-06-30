package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class r5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66893d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.z5 f66895f;

    /* renamed from: g, reason: collision with root package name */
    public int f66896g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(com.tencent.mm.feature.finder.live.z5 z5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f66895f = z5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f66894e = obj;
        this.f66896g |= Integer.MIN_VALUE;
        return this.f66895f.Ui(null, 0, this);
    }
}
