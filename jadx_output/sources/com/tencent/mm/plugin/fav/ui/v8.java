package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public final class v8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f101493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y8 f101495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f101496g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f101497h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(java.lang.String str, com.tencent.mm.plugin.fav.ui.y8 y8Var, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f101494e = str;
        this.f101495f = y8Var;
        this.f101496g = i17;
        this.f101497h = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.fav.ui.v8(this.f101494e, this.f101495f, this.f101496g, this.f101497h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.fav.ui.v8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f101493d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = "[removeTag] start, current thread = " + java.lang.Thread.currentThread().getName();
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTopMenu", str, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(this.f101494e);
            o72.z4 uj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).uj();
            this.f101493d = 1;
            obj = ((t72.l) uj6).W6(arrayList, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
            return f0Var;
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.plugin.fav.ui.u8 u8Var = new com.tencent.mm.plugin.fav.ui.u8(this.f101495f, this.f101496g, this.f101494e, this.f101497h, null);
        this.f101493d = 2;
        return kotlinx.coroutines.l.g(g3Var, u8Var, this) == aVar ? aVar : f0Var;
    }
}
