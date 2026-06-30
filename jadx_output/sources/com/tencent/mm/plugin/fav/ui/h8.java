package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public final class h8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y8 f101136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t72.a f101138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101139g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f101140h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(com.tencent.mm.plugin.fav.ui.y8 y8Var, int i17, t72.a aVar, java.lang.String str, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f101136d = y8Var;
        this.f101137e = i17;
        this.f101138f = aVar;
        this.f101139g = str;
        this.f101140h = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.fav.ui.h8(this.f101136d, this.f101137e, this.f101138f, this.f101139g, this.f101140h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.fav.ui.h8 h8Var = (com.tencent.mm.plugin.fav.ui.h8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        h8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.fav.ui.y8 y8Var = this.f101136d;
        java.util.List list = y8Var.f101626e;
        t72.a aVar2 = this.f101138f;
        int i17 = this.f101137e;
        list.set(i17, aVar2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[editTag] newName = ");
        sb6.append(this.f101139g);
        sb6.append(", position = ");
        int i18 = this.f101140h;
        sb6.append(i18);
        sb6.append(", index = ");
        sb6.append(i17);
        java.lang.String sb7 = sb6.toString();
        int i19 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTopMenu", sb7, null);
        y8Var.notifyItemChanged(i18);
        return jz5.f0.f302826a;
    }
}
