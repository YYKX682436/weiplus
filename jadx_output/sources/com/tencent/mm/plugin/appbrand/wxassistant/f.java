package com.tencent.mm.plugin.appbrand.wxassistant;

/* loaded from: classes7.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f92199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f92200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f92201f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, l81.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f92200e = context;
        this.f92201f = b1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.appbrand.wxassistant.f(this.f92200e, this.f92201f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.appbrand.wxassistant.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.l lVar;
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f92199d;
        l81.b1 b1Var = this.f92201f;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.tencent.mm.plugin.appbrand.wxassistant.u uVar = com.tencent.mm.plugin.appbrand.wxassistant.v.f92325s;
                android.content.Context context = this.f92200e;
                this.f92199d = 1;
                a17 = uVar.a(context, b1Var, this);
                if (a17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                a17 = obj;
            }
            lVar = (jz5.l) a17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandWxAssistantLogic", "preInit failed", e17);
            lVar = null;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (lVar == null) {
            l81.e1 e1Var = b1Var.L;
            if (e1Var != null) {
                e1Var.b();
            }
            return f0Var;
        }
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = (com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC) lVar.f302833d;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = (com.tencent.mm.plugin.appbrand.report.AppBrandStatObject) lVar.f302834e;
        com.tencent.mm.plugin.appbrand.wxassistant.n.f92236a.getClass();
        jz5.g gVar = com.tencent.mm.plugin.appbrand.wxassistant.n.f92238c;
        com.tencent.mm.plugin.appbrand.launching.od.a(appBrandInitConfigWC, (java.lang.String) ((jz5.n) gVar).getValue());
        com.tencent.mm.plugin.appbrand.wxassistant.c3 c3Var = com.tencent.mm.plugin.appbrand.wxassistant.c3.f92150a;
        c3Var.getClass();
        if (((java.lang.Boolean) com.tencent.mm.plugin.appbrand.wxassistant.c3.f92153d.b(c3Var, com.tencent.mm.plugin.appbrand.wxassistant.c3.f92151b[1])).booleanValue()) {
            android.content.Context context2 = this.f92200e;
            android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.wxassistant.AppBrandWxAssistantUI.class);
            intent.setFlags(268435456);
            intent.putExtra("KEY_INIT_CONFIG", appBrandInitConfigWC);
            intent.putExtra("KEY_STAT_OBJECT", appBrandStatObject);
            pf5.j0.a(intent, gm1.f.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/wxassistant/AppBrandWxAssistantLogic", "startByActivity", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/appbrand/wxassistant/AppBrandWxAssistantLogic", "startByActivity", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startByHeadless appId:");
            sb6.append(appBrandInitConfigWC.f77278d);
            sb6.append(" statObject:");
            sb6.append(appBrandStatObject != null ? java.lang.Integer.valueOf(appBrandStatObject.f87790f) : null);
            sb6.append(" stack:");
            sb6.append(android.util.Log.getStackTraceString(new java.lang.Throwable()));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantLogic", sb6.toString());
            java.lang.String str = (java.lang.String) ((jz5.n) gVar).getValue();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("KEY_INIT_CONFIG", appBrandInitConfigWC);
            bundle.putParcelable("KEY_STAT_OBJECT", appBrandStatObject);
            com.tencent.mm.ipcinvoker.d0.d(str, bundle, com.tencent.mm.plugin.appbrand.wxassistant.l.f92230d.getClass(), com.tencent.mm.plugin.appbrand.wxassistant.m.f92234d);
        }
        return f0Var;
    }
}
