package xc2;

/* loaded from: classes2.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f534671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc2.k0 f534672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f534673f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, xc2.k0 k0Var, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f534671d = c14994x9b99c079;
        this.f534672e = k0Var;
        this.f534673f = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xc2.g0(this.f534671d, this.f534672e, this.f534673f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xc2.g0 g0Var = (xc2.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        g0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        xc2.k0 k0Var;
        java.lang.Object obj2;
        java.util.HashSet hashSet;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f534671d;
        r45.lu0 m76754xe4c0157 = c14994x9b99c079.getFeedObject().m76754xe4c0157();
        if (m76754xe4c0157 != null) {
            boolean z17 = false;
            java.util.LinkedList m75941xfb821914 = m76754xe4c0157.m75941xfb821914(0);
            if (m75941xfb821914 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = m75941xfb821914.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    k0Var = this.f534672e;
                    if (!hasNext) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    r45.ku0 ku0Var = (r45.ku0) next;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ku0Var);
                    xc2.u uVar = xc2.k0.f534706y;
                    k0Var.getClass();
                    if (!(ku0Var.m75939xb282bd08(0) == 1)) {
                        arrayList.add(next);
                    }
                }
                java.util.ArrayList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862> arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it6 = arrayList.iterator();
                while (true) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = null;
                    if (!it6.hasNext()) {
                        break;
                    }
                    r45.rc1 rc1Var = (r45.rc1) ((r45.ku0) it6.next()).m75936x14adae67(3);
                    if (rc1Var != null) {
                        c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) rc1Var.m75936x14adae67(0);
                    }
                    arrayList2.add(c19786x6a1e2862);
                }
                int i17 = this.f534673f;
                long m59233x87980ca = c14994x9b99c079.m59233x87980ca();
                java.lang.String m59229xb5af1dd5 = c14994x9b99c079.m59229xb5af1dd5();
                xc2.u uVar2 = xc2.k0.f534706y;
                p012xc85e97e9.p093xedfae76a.j0 W6 = k0Var.W6(m59233x87980ca, i17, m59229xb5af1dd5);
                java.util.Collection collection = (java.util.Set) W6.mo3195x754a37bb();
                if (collection == null) {
                    collection = new java.util.HashSet();
                }
                java.util.HashSet<xc2.t> hashSet2 = new java.util.HashSet(collection);
                for (xc2.t tVar : hashSet2) {
                    kz5.h0.B(tVar.f534835d, new xc2.e0(tVar));
                }
                for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 : arrayList2) {
                    if (c19786x6a1e28622 != null) {
                        java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e28622.m76521x7528c3fb();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
                        for (r45.wf6 wf6Var : m76521x7528c3fb) {
                            java.util.Iterator it7 = hashSet2.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it7.next();
                                if (((xc2.t) obj2).f534834c == wf6Var.m75939xb282bd08(1) ? true : z17) {
                                    break;
                                }
                            }
                            xc2.t tVar2 = (xc2.t) obj2;
                            if (tVar2 == null) {
                                hashSet = hashSet2;
                                tVar2 = new xc2.t(i17, c14994x9b99c079.m59233x87980ca(), wf6Var.m75939xb282bd08(1), new java.util.LinkedList(), false, null, 48, null);
                            } else {
                                hashSet = hashSet2;
                            }
                            kz5.h0.B(tVar2.f534835d, new xc2.f0(c19786x6a1e28622));
                            tVar2.f534835d.add(c19786x6a1e28622);
                            tVar2.f534838g.remove(new java.lang.Integer(c19786x6a1e28622.hashCode()));
                            hashSet.remove(tVar2);
                            hashSet.add(tVar2);
                            hashSet2 = hashSet;
                            z17 = false;
                        }
                    }
                    hashSet2 = hashSet2;
                    z17 = false;
                }
                W6.mo7808x76db6cb1(hashSet2);
            }
        }
        return jz5.f0.f384359a;
    }
}
