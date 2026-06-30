package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class g3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3 f94247e;

    /* renamed from: f, reason: collision with root package name */
    public int f94248f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3 n3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f94247e = n3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f94246d = obj;
        this.f94248f |= Integer.MIN_VALUE;
        return this.f94247e.c(null, this);
    }
}
