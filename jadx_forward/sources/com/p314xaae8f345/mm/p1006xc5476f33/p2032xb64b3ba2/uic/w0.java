package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f240061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x0 f240062e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x0 x0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f240062e = x0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.w0(this.f240062e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.w0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f240061d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.x0 x0Var = this.f240062e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                ux3.e eVar = new ux3.e(x0Var.f240072g, x0Var.f240071f + 1);
                this.f240061d = 1;
                a17 = rm0.h.a(eVar, 0L, null, this, 3, null);
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
            t45.n nVar = (t45.n) a17;
            x0Var.f240070e = nVar.f497146d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            boolean z17 = x0Var.f240071f == -1;
            java.util.LinkedList<t45.l> Infos = nVar.f497147e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Infos, "Infos");
            for (t45.l lVar : Infos) {
                int i18 = x0Var.f240071f;
                if (i18 == -1 || i18 < lVar.f497133e) {
                    x0Var.f240071f = lVar.f497133e;
                }
                arrayList.add(lVar);
            }
            x0Var.f240069d = arrayList;
            if (z17) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = x0Var.m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                ox3.l lVar2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g.class)).f239940d;
                lVar2.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneDataViewModel", "clearDataSource");
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) lVar2.f431297d).e(new ed0.s0(null, 1));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = x0Var.f240069d.iterator();
            while (it.hasNext()) {
                t45.n0 n0Var = ((t45.l) it.next()).f497132d;
                if (n0Var != null) {
                    arrayList2.add(new ox3.g(n0Var));
                }
            }
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtoneFinderAuthorDataUIC", "GetFinderAuthorRingBack failed: " + e17.getMessage());
            x0Var.f240070e = false;
            x0Var.f240069d = new java.util.ArrayList();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = x0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g) pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.g.class)).O6();
            return f0Var;
        }
    }
}
