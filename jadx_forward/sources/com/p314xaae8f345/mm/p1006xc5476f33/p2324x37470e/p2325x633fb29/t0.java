package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f257255d;

    /* renamed from: e, reason: collision with root package name */
    public int f257256e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 f257257f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f257258g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f257259h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f257260i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var, java.util.List list, java.util.List list2, java.util.List list3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f257257f = u0Var;
        this.f257258g = list;
        this.f257259h = list2;
        this.f257260i = list3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.t0(this.f257257f, this.f257258g, this.f257259h, this.f257260i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.t0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        boolean z18;
        java.util.LinkedList linkedList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f257256e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.u0 u0Var = this.f257257f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            u0Var.f257263d.clear();
            u0Var.f257264e.clear();
            u0Var.f257265f.clear();
            u0Var.f257266g.clear();
            java.util.LinkedList linkedList2 = u0Var.f257263d;
            java.util.List list = this.f257258g;
            linkedList2.addAll(list);
            java.util.LinkedList linkedList3 = u0Var.f257264e;
            java.util.List list2 = this.f257259h;
            linkedList3.addAll(list2);
            u0Var.f257265f.addAll(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1.f257100d.a(list, list2, this.f257260i));
            java.util.LinkedList linkedList4 = u0Var.f257265f;
            if (!(linkedList4 instanceof java.util.Collection) || !linkedList4.isEmpty()) {
                java.util.Iterator it = linkedList4.iterator();
                while (it.hasNext()) {
                    if (!(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1) it.next()) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.o0)) {
                        z17 = false;
                        break;
                    }
                }
            }
            z17 = true;
            u0Var.f257267h = z17;
            java.util.LinkedList linkedList5 = u0Var.f257265f;
            if (!(linkedList5 instanceof java.util.Collection) || !linkedList5.isEmpty()) {
                java.util.Iterator it6 = linkedList5.iterator();
                while (it6.hasNext()) {
                    if (!(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1) it6.next()) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q1)) {
                        z18 = false;
                        break;
                    }
                }
            }
            z18 = true;
            u0Var.f257268i = z18;
            dq4.c cVar = dq4.c.f323902a;
            float f17 = (((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1) u0Var.f257265f.get(0)).f257102b * 1.0f) / ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1) u0Var.f257265f.get(0)).f257101a;
            if (f17 > cVar.c()) {
                f17 = cVar.c();
            } else if (f17 < 0.5625f) {
                f17 = 0.5625f;
            }
            u0Var.f257271o = f17;
            java.util.LinkedList linkedList6 = u0Var.f257266g;
            java.util.LinkedList linkedList7 = u0Var.f257265f;
            this.f257255d = linkedList6;
            this.f257256e = 1;
            java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.z0(linkedList7, null), this);
            if (g17 == aVar) {
                return aVar;
            }
            linkedList = linkedList6;
            obj = g17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedList = (java.util.LinkedList) this.f257255d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        linkedList.addAll((java.util.Collection) obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) kz5.n0.a0(u0Var.f257266g, 0);
        if (i1Var == null) {
            return null;
        }
        rm5.h a17 = rm5.h.f479022h.a(i1Var.f257160l);
        a17.mo122876x76500f83(63, 112);
        a17.a(kz5.b0.c(new java.lang.Long(0L)), new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.s0(u0Var));
        return jz5.f0.f384359a;
    }
}
