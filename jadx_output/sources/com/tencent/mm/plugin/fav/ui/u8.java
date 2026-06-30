package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public final class u8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.y8 f101473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101475f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f101476g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(com.tencent.mm.plugin.fav.ui.y8 y8Var, int i17, java.lang.String str, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f101473d = y8Var;
        this.f101474e = i17;
        this.f101475f = str;
        this.f101476g = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.fav.ui.u8(this.f101473d, this.f101474e, this.f101475f, this.f101476g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.fav.ui.u8 u8Var = (com.tencent.mm.plugin.fav.ui.u8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.fav.ui.y8 y8Var = this.f101473d;
        java.util.List list = y8Var.f101626e;
        int i17 = this.f101474e;
        list.remove(i17);
        java.lang.String str = "[removeTag] finish tag = " + this.f101475f + ", position = " + this.f101476g + ", index = " + i17 + ", current thread = " + java.lang.Thread.currentThread().getName();
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTopMenu", str, null);
        y8Var.notifyDataSetChanged();
        return jz5.f0.f302826a;
    }
}
