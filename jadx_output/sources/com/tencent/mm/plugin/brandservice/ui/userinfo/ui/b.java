package com.tencent.mm.plugin.brandservice.ui.userinfo.ui;

/* loaded from: classes4.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f94562d;

    /* renamed from: e, reason: collision with root package name */
    public int f94563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym3.c f94564f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.userinfo.ui.c f94565g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f94566h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ym3.c cVar, com.tencent.mm.plugin.brandservice.ui.userinfo.ui.c cVar2, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f94564f = cVar;
        this.f94565g = cVar2;
        this.f94566h = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.brandservice.ui.userinfo.ui.b(this.f94564f, this.f94565g, this.f94566h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.brandservice.ui.userinfo.ui.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ym3.d dVar;
        r45.zm zmVar;
        int i17;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f94563e;
        com.tencent.mm.plugin.brandservice.ui.userinfo.ui.c cVar = this.f94565g;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            dVar = new ym3.d(this.f94564f);
            int i19 = ps1.c.f358054a;
            int i27 = cVar.f94568e;
            this.f94562d = dVar;
            this.f94563e = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            new ps1.a(i27).l().K(new ps1.b(nVar));
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                if (i18 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            dVar = (ym3.d) this.f94562d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        r45.r14 r14Var = (r45.r14) obj;
        int i28 = 0;
        if (r14Var == null) {
            dVar.f463148b = false;
        } else {
            dVar.f463148b = r14Var.f384430e == 1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            java.util.LinkedList<r45.zm> linkedList = r14Var.f384429d;
            if (linkedList != null) {
                for (r45.zm zmVar2 : linkedList) {
                    com.tencent.mm.storage.z3 n17 = Bi.n(zmVar2.f392204g, true);
                    if ((cVar.f94567d == 1 && n17.m2()) || (((i17 = cVar.f94567d) == 0 && n17.n2()) || (i17 == 5 && n17.l2()))) {
                        arrayList.add(new com.tencent.mm.plugin.brandservice.ui.userinfo.ui.a(zmVar2, false, dVar.f463148b));
                    }
                }
            }
            if ((!arrayList.isEmpty()) && !dVar.f463148b) {
                arrayList.add(new com.tencent.mm.plugin.brandservice.ui.userinfo.ui.a(new r45.zm(), true, dVar.f463148b));
            }
            java.util.ArrayList arrayList2 = dVar.f463149c;
            arrayList2.addAll(arrayList);
            com.tencent.mm.plugin.brandservice.ui.userinfo.ui.a aVar2 = (com.tencent.mm.plugin.brandservice.ui.userinfo.ui.a) kz5.n0.k0(arrayList2);
            if (aVar2 != null && (zmVar = aVar2.f94559d) != null) {
                i28 = zmVar.f392203f;
            }
            cVar.f94568e = i28;
        }
        this.f94562d = null;
        this.f94563e = 2;
        if (this.f94566h.emit(dVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
