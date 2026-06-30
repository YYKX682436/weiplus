package com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf;

/* loaded from: classes7.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f146640d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f146641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.t f146642f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1051x5c6729a.C11865xc185f759 f146643g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1051x5c6729a.C11865xc185f759 c11865xc185f759, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f146642f = tVar;
        this.f146643g = c11865xc185f759;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.r rVar = new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.r(this.f146642f, this.f146643g, interfaceC29045xdcb5ca57);
        rVar.f146641e = obj;
        return rVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f146640d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1051x5c6729a.C11865xc185f759 c11865xc185f759 = this.f146643g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f146641e;
            java.util.List R6 = this.f146642f.R6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : R6) {
                ft.b bVar = (ft.b) obj2;
                if (bVar.a() || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bVar.getF146571d(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b)) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessManagerServiceImpl", "startActivityFromAppBrandUI no process to handle");
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                android.content.Intent intent = c11865xc185f759.f159548g;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceImpl$startActivityFromAppBrandUI$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/feature/appbrand/support/AppBrandProcessManagerServiceImpl$startActivityFromAppBrandUI$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return f0Var;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.q((ft.b) it.next(), c11865xc185f759, c0Var2, null), 3, null));
            }
            this.f146641e = c0Var2;
            this.f146640d = 1;
            if (p3325xe03a0797.p3326xc267989b.h.c(arrayList3, this) == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.c0) this.f146641e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandProcessManagerServiceImpl", "startActivityFromAppBrandUI handled " + c0Var.f391645d);
        if (!c0Var.f391645d) {
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            android.content.Intent intent2 = c11865xc185f759.f159548g;
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
