package com.tencent.mm.feature.emoji;

/* loaded from: classes12.dex */
public final class d3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66221d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f66222e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f66223f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66224g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.c4 f66225h;

    /* renamed from: i, reason: collision with root package name */
    public int f66226i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(com.tencent.mm.feature.emoji.c4 c4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f66225h = c4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f66224g = obj;
        this.f66226i |= Integer.MIN_VALUE;
        return this.f66225h.Ui(null, this);
    }
}
