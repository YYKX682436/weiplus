package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f85941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f85942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.menu.devtools.b0 f85943f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85944g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.view.MenuItem menuItem, com.tencent.mm.plugin.appbrand.menu.devtools.b0 b0Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f85942e = menuItem;
        this.f85943f = b0Var;
        this.f85944g = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.menu.devtools.y(this.f85942e, this.f85943f, this.f85944g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.menu.devtools.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f85941d;
        android.view.MenuItem menuItem = this.f85942e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int itemId = menuItem.getItemId();
            java.lang.String str = itemId != 0 ? itemId != 1 ? com.eclipsesource.mmv8.Platform.UNKNOWN : "burst" : "one";
            ix5.h hVar = ix5.h.f295631b;
            java.util.Map e17 = kz5.b1.e(new jz5.l("mode", str));
            this.f85941d = 1;
            obj = hVar.g("frameCapture", e17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Object obj2 = ((java.util.Map) obj).get("result");
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        android.content.Context context = this.f85944g;
        com.tencent.mm.plugin.appbrand.menu.devtools.b0 b0Var = this.f85943f;
        if (booleanValue) {
            java.lang.String str2 = ((java.lang.Object) menuItem.getTitle()) + "成功";
            b0Var.getClass();
            d75.b.g(new com.tencent.mm.plugin.appbrand.menu.devtools.a0(context, str2));
        } else {
            java.lang.String str3 = ((java.lang.Object) menuItem.getTitle()) + "失败";
            b0Var.getClass();
            d75.b.g(new com.tencent.mm.plugin.appbrand.menu.devtools.a0(context, str3));
        }
        return jz5.f0.f302826a;
    }
}
