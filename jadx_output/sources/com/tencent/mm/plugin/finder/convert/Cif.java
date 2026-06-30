package com.tencent.mm.plugin.finder.convert;

/* renamed from: com.tencent.mm.plugin.finder.convert.if, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Cif extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f103663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f103664e;

    /* renamed from: f, reason: collision with root package name */
    public int f103665f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cif(com.tencent.mm.plugin.finder.convert.zf zfVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f103664e = zfVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f103663d = obj;
        this.f103665f |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.finder.convert.zf.O1(this.f103664e, 0L, this);
    }
}
