package com.tencent.mm.plugin.appbrand.jsapi.chattool;

/* loaded from: classes7.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f80422d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f80423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.chattool.t f80424f;

    /* renamed from: g, reason: collision with root package name */
    public int f80425g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f80424f = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f80423e = obj;
        this.f80425g |= Integer.MIN_VALUE;
        return this.f80424f.j(false, this);
    }
}
