package com.tencent.mm.feature.appbrand.support;

/* loaded from: classes7.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f65107d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f65108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.appbrand.support.t f65109f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent f65110g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.feature.appbrand.support.t tVar, com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent startActivityFromAppBrandEvent, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f65109f = tVar;
        this.f65110g = startActivityFromAppBrandEvent;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.feature.appbrand.support.r rVar = new com.tencent.mm.feature.appbrand.support.r(this.f65109f, this.f65110g, continuation);
        rVar.f65108e = obj;
        return rVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.appbrand.support.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.c0 c0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f65107d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.appbrand.event.StartActivityFromAppBrandEvent startActivityFromAppBrandEvent = this.f65110g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f65108e;
            java.util.List R6 = this.f65109f.R6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : R6) {
                ft.b bVar = (ft.b) obj2;
                if (bVar.a() || kotlin.jvm.internal.o.b(bVar.getF65038d(), com.tencent.mm.sdk.platformtools.x2.f193072b)) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessManagerServiceImpl", "startActivityFromAppBrandUI no process to handle");
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                android.content.Intent intent = startActivityFromAppBrandEvent.f78015g;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceImpl$startActivityFromAppBrandUI$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceImpl$startActivityFromAppBrandUI$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return f0Var;
            }
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.feature.appbrand.support.q((ft.b) it.next(), startActivityFromAppBrandEvent, c0Var2, null), 3, null));
            }
            this.f65108e = c0Var2;
            this.f65107d = 1;
            if (kotlinx.coroutines.h.c(arrayList3, this) == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (kotlin.jvm.internal.c0) this.f65108e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessManagerServiceImpl", "startActivityFromAppBrandUI handled " + c0Var.f310112d);
        if (!c0Var.f310112d) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            android.content.Intent intent2 = startActivityFromAppBrandEvent.f78015g;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(intent2);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(context2, arrayList4.toArray(), "com/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceImpl$startActivityFromAppBrandUI$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList4.get(0));
            yj0.a.f(context2, "com/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceImpl$startActivityFromAppBrandUI$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return f0Var;
    }
}
