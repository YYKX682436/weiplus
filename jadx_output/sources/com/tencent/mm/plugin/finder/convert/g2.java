package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes8.dex */
public final class g2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f103445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.m2 f103446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f103447f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.tencent.mm.plugin.finder.convert.m2 m2Var, androidx.recyclerview.widget.RecyclerView recyclerView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f103446e = m2Var;
        this.f103447f = recyclerView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.convert.g2(this.f103446e, this.f103447f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.convert.g2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f103445d;
        com.tencent.mm.plugin.finder.convert.m2 m2Var = this.f103446e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.wechat.aff.emoticon.s sVar = m2Var.f103964f;
            bw5.ia iaVar = bw5.ia.EmoticonDesignerListDataType_IPSet;
            this.f103445d = 1;
            obj = sVar.a(iaVar, false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((com.tencent.wechat.aff.emoticon.o) obj) == com.tencent.wechat.aff.emoticon.o.f216657d) {
            java.util.ArrayList arrayList = m2Var.f103964f.f216670h;
            int size = m2Var.f103965g.size();
            int size2 = arrayList.size();
            m2Var.f103965g.addAll(arrayList);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.finder.convert.f2 f2Var = new com.tencent.mm.plugin.finder.convert.f2(this.f103447f, size, size2, null);
            this.f103445d = 2;
            if (kotlinx.coroutines.l.g(g3Var, f2Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
