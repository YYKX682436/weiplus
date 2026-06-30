package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

/* loaded from: classes7.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f173732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f173733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f173734f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, l81.b1 b1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f173733e = context;
        this.f173734f = b1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.f(this.f173733e, this.f173734f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.l lVar;
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f173732d;
        l81.b1 b1Var = this.f173734f;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.v.f173858s;
                android.content.Context context = this.f173733e;
                this.f173732d = 1;
                a17 = uVar.a(context, b1Var, this);
                if (a17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                a17 = obj;
            }
            lVar = (jz5.l) a17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandWxAssistantLogic", "preInit failed", e17);
            lVar = null;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (lVar == null) {
            l81.e1 e1Var = b1Var.L;
            if (e1Var != null) {
                e1Var.b();
            }
            return f0Var;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4) lVar.f384366d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559) lVar.f384367e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.f173769a.getClass();
        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.n.f173771c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.od.a(c11809xbc286be4, (java.lang.String) ((jz5.n) gVar).mo141623x754a37bb());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3 c3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3.f173683a;
        c3Var.getClass();
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3.f173686d.b(c3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3.f173684b[1])).booleanValue()) {
            android.content.Context context2 = this.f173733e;
            android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.ActivityC12815x667e27eb.class);
            intent.setFlags(268435456);
            intent.putExtra("KEY_INIT_CONFIG", c11809xbc286be4);
            intent.putExtra("KEY_STAT_OBJECT", c12559xbdae8559);
            pf5.j0.a(intent, gm1.f.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/wxassistant/AppBrandWxAssistantLogic", "startByActivity", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/appbrand/wxassistant/AppBrandWxAssistantLogic", "startByActivity", "(Landroid/content/Context;Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startByHeadless appId:");
            sb6.append(c11809xbc286be4.f158811d);
            sb6.append(" statObject:");
            sb6.append(c12559xbdae8559 != null ? java.lang.Integer.valueOf(c12559xbdae8559.f169323f) : null);
            sb6.append(" stack:");
            sb6.append(android.util.Log.getStackTraceString(new java.lang.Throwable()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantLogic", sb6.toString());
            java.lang.String str = (java.lang.String) ((jz5.n) gVar).mo141623x754a37bb();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("KEY_INIT_CONFIG", c11809xbc286be4);
            bundle.putParcelable("KEY_STAT_OBJECT", c12559xbdae8559);
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.l.f173763d.getClass(), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.m.f173767d);
        }
        return f0Var;
    }
}
