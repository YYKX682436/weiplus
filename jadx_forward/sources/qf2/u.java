package qf2;

/* loaded from: classes.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f444126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f444127e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, qf2.v0 v0Var, km2.q qVar) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444126d = v0Var;
        this.f444127e = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.u(interfaceC29045xdcb5ca57, this.f444126d, this.f444127e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.u uVar = (qf2.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        uVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.List list;
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f444126d.f372632e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 v1Var = ubVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v1) ubVar : null;
        if (v1Var != null) {
            qo0.c.a(v1Var, qo0.b.f446875d5, null, 2, null);
        }
        qf2.v0 v0Var = this.f444126d;
        km2.q qVar = this.f444127e;
        mm2.o4 o4Var = (mm2.o4) v0Var.m56788xbba4bfc0(mm2.o4.class);
        if (o4Var != null && (list = o4Var.f410851o) != null) {
            synchronized (list) {
                arrayList = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (true) {
                    boolean z17 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    km2.q qVar2 = (km2.q) next;
                    if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar2.f390703a, qVar.f390703a) && qVar2.f390710h) {
                        if (qVar2.f390714l == 7) {
                            z17 = true;
                        }
                    }
                    if (z17) {
                        arrayList.add(next);
                    }
                }
            }
            synchronized (arrayList) {
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    ((km2.q) it6.next()).f390714l = 0;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
