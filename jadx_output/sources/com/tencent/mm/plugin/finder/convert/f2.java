package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f103327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103328e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f103329f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f103327d = recyclerView;
        this.f103328e = i17;
        this.f103329f = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.convert.f2(this.f103327d, this.f103328e, this.f103329f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.convert.f2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.recyclerview.widget.f2 adapter = this.f103327d.getAdapter();
        if (adapter == null) {
            return null;
        }
        adapter.notifyItemRangeChanged(this.f103328e, this.f103329f);
        return jz5.f0.f302826a;
    }
}
