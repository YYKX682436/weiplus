package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes9.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.UgcEmojiChangedEvent f104760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f104761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.o0 f104762f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f104763g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.tencent.mm.autogen.events.UgcEmojiChangedEvent ugcEmojiChangedEvent, java.util.ArrayList arrayList, so2.o0 o0Var, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f104760d = ugcEmojiChangedEvent;
        this.f104761e = arrayList;
        this.f104762f = o0Var;
        this.f104763g = wxRecyclerView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.convert.v2(this.f104760d, this.f104761e, this.f104762f, this.f104763g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.convert.v2 v2Var = (com.tencent.mm.plugin.finder.convert.v2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.feature.emoji.api.o5 o5Var = (com.tencent.mm.feature.emoji.api.o5) i95.n0.c(com.tencent.mm.feature.emoji.api.o5.class);
        this.f104760d.f54908g.getClass();
        ((com.tencent.mm.feature.emoji.b0) o5Var).getClass();
        new gr.g(1, null, null);
        throw null;
    }
}
