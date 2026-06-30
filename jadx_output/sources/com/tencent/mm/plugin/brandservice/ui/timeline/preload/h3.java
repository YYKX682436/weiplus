package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class h3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f94262d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3 f94264f;

    /* renamed from: g, reason: collision with root package name */
    public int f94265g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(com.tencent.mm.plugin.brandservice.ui.timeline.preload.n3 n3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f94264f = n3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f94263e = obj;
        this.f94265g |= Integer.MIN_VALUE;
        return this.f94264f.d(null, null, this);
    }
}
