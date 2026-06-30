package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes3.dex */
public final class p3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f94179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI f94180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI bizTimeLineSettingUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f94180e = bizTimeLineSettingUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.brandservice.ui.timeline.p3(this.f94180e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.brandservice.ui.timeline.p3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f94179d;
        try {
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizTimeLineSettingUI", "e = " + e17.getMessage());
        }
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f94179d = 1;
            if (kotlinx.coroutines.k1.b(800L, this) == aVar) {
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
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.plugin.brandservice.ui.timeline.o3 o3Var = new com.tencent.mm.plugin.brandservice.ui.timeline.o3(this.f94180e, null);
        this.f94179d = 2;
        if (kotlinx.coroutines.l.g(g3Var, o3Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
