package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui;

/* loaded from: classes4.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f176095d;

    /* renamed from: e, reason: collision with root package name */
    public int f176096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym3.c f176097f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.c f176098g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f176099h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ym3.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.c cVar2, p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f176097f = cVar;
        this.f176098g = cVar2;
        this.f176099h = i2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.b(this.f176097f, this.f176098g, this.f176099h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ym3.d dVar;
        r45.zm zmVar;
        int i17;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f176096e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.c cVar = this.f176098g;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            dVar = new ym3.d(this.f176097f);
            int i19 = ps1.c.f439587a;
            int i27 = cVar.f176101e;
            this.f176095d = dVar;
            this.f176096e = 1;
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
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            dVar = (ym3.d) this.f176095d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.r14 r14Var = (r45.r14) obj;
        int i28 = 0;
        if (r14Var == null) {
            dVar.f544681b = false;
        } else {
            dVar.f544681b = r14Var.f465963e == 1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            java.util.LinkedList<r45.zm> linkedList = r14Var.f465962d;
            if (linkedList != null) {
                for (r45.zm zmVar2 : linkedList) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = Bi.n(zmVar2.f473737g, true);
                    if ((cVar.f176100d == 1 && n17.m2()) || (((i17 = cVar.f176100d) == 0 && n17.n2()) || (i17 == 5 && n17.l2()))) {
                        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.a(zmVar2, false, dVar.f544681b));
                    }
                }
            }
            if ((!arrayList.isEmpty()) && !dVar.f544681b) {
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.a(new r45.zm(), true, dVar.f544681b));
            }
            java.util.ArrayList arrayList2 = dVar.f544682c;
            arrayList2.addAll(arrayList);
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.a aVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.a) kz5.n0.k0(arrayList2);
            if (aVar2 != null && (zmVar = aVar2.f176092d) != null) {
                i28 = zmVar.f473736f;
            }
            cVar.f176101e = i28;
        }
        this.f176095d = null;
        this.f176096e = 2;
        if (this.f176099h.mo771x2f8fd3(dVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
