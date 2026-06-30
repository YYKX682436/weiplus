package sp2;

/* loaded from: classes2.dex */
public final class p3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f492715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.x3 f492716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f492717f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f492718g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(sp2.x3 x3Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492716e = x3Var;
        this.f492717f = c1163xf1deaba4;
        this.f492718g = c22848x6ddd90cf;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sp2.p3(this.f492716e, this.f492717f, this.f492718g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.p3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f492715d;
        boolean z17 = false;
        sp2.x3 x3Var = this.f492716e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = x3Var.f492813n.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                for (bq2.b bVar : sp2.n3.f492649a.c(this.f492717f, this.f492718g, kz5.c0.d(new java.lang.Integer(intValue)))) {
                    if (sp2.x3.O6(x3Var, intValue, bVar)) {
                        sp2.x3.Q6(x3Var, intValue, bVar);
                        if (!arrayList.contains(bVar)) {
                            arrayList.add(bVar);
                        }
                        if (!arrayList2.contains(new java.lang.Integer(intValue))) {
                            arrayList2.add(new java.lang.Integer(intValue));
                        }
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x3Var.f492806d, "handleLoopMsg requestSize: " + arrayList2.size() + " objectSize: " + arrayList.size());
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            sp2.o3 o3Var = new sp2.o3(arrayList2, arrayList, x3Var, null);
            this.f492715d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, o3Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        int T6 = x3Var.T6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = x3Var.m158354x19263085();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = m158354x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) m158354x19263085 : null;
        if (abstractActivityC15087xee12defa != null && abstractActivityC15087xee12defa.mo78538xecd98af8()) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x3Var.f492806d, "handleLoopMsg next refreshInterval: " + T6 + " isPagePaused: " + z17);
        if (T6 > 0 && !z17) {
            x3Var.f492815p.mo50307xb9e94560(1, T6 * 1000);
        }
        return jz5.f0.f384359a;
    }
}
