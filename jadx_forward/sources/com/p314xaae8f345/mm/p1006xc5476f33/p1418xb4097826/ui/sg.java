package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class sg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f211342d;

    /* renamed from: e, reason: collision with root package name */
    public int f211343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15066x6f77678c f211344f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15066x6f77678c activityC15066x6f77678c, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f211344f = activityC15066x6f77678c;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sg(this.f211344f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.sg) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object x17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15066x6f77678c activityC15066x6f77678c;
        java.lang.Object obj2;
        java.lang.Object obj3;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f211343e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g92.b bVar = g92.b.f351302e;
            this.f211343e = 1;
            x17 = bVar.x1(2, this);
            if (x17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            x17 = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        }
        if (p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(x17)) {
            r45.lk2 lk2Var = (r45.lk2) x17;
            r45.nc4 nc4Var = new r45.nc4();
            java.util.LinkedList m75941xfb821914 = lk2Var.m75941xfb821914(20);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFinder_list(...)");
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                activityC15066x6f77678c = this.f211344f;
                if (!hasNext) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.ac5) obj2).m75936x14adae67(1);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null, activityC15066x6f77678c.f210255d)) {
                    break;
                }
            }
            r45.ac5 ac5Var = (r45.ac5) obj2;
            byte[] mo14344x5f01b1f6 = ac5Var != null ? ac5Var.mo14344x5f01b1f6() : null;
            if (mo14344x5f01b1f6 != null) {
                try {
                    nc4Var.mo11468x92b714fd(mo14344x5f01b1f6);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            activityC15066x6f77678c.f210257f = nc4Var;
            java.util.LinkedList m75941xfb8219142 = lk2Var.m75941xfb821914(20);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getFinder_list(...)");
            java.util.Iterator it6 = m75941xfb8219142.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it6.next();
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) ((r45.ac5) obj3).m75936x14adae67(1);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76197x6c03c64c() : null, activityC15066x6f77678c.f210255d)) {
                    break;
                }
            }
            r45.ac5 ac5Var2 = (r45.ac5) obj3;
            activityC15066x6f77678c.f210258g = ac5Var2 != null ? (r45.d1) ac5Var2.m75936x14adae67(10) : null;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.rg rgVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.rg(activityC15066x6f77678c, null);
            this.f211342d = x17;
            this.f211343e = 2;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, rgVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
