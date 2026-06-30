package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public final class r8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f101377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t72.a f101379f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(java.util.ArrayList arrayList, int i17, t72.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f101377d = arrayList;
        this.f101378e = i17;
        this.f101379f = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.fav.ui.r8(this.f101377d, this.f101378e, this.f101379f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.fav.ui.r8 r8Var = (com.tencent.mm.plugin.fav.ui.r8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = this.f101378e;
        this.f101377d.add(new java.lang.Integer(i17));
        java.lang.String str = "[removeTag] finish tag = " + this.f101379f + ", index = " + i17 + ", current thread = " + java.lang.Thread.currentThread().getName();
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTopMenu", str, null);
        return jz5.f0.f302826a;
    }
}
