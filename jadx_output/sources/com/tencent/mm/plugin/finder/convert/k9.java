package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class k9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(in5.s0 s0Var) {
        super(1);
        this.f103815d = s0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ed2.k trackWith = (ed2.k) obj;
        kotlin.jvm.internal.o.g(trackWith, "$this$trackWith");
        return new ed2.j("self_like_tips", 1L, 4, (com.tencent.mm.plugin.finder.model.BaseFinderFeed) this.f103815d.f293125i);
    }
}
