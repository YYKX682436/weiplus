package xn2;

/* loaded from: classes2.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f537046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f537047e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, xn2.p0 p0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f537046d = hVar;
        this.f537047e = p0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xn2.j(this.f537046d, interfaceC29045xdcb5ca57, this.f537047e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xn2.j jVar = (xn2.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        jVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.tw0 tw0Var = (r45.tw0) ((xg2.i) this.f537046d).f535926b;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        xn2.p0 p0Var = this.f537047e;
        p0Var.f537097v = currentTimeMillis;
        p0Var.f537096u = tw0Var.m75934xbce7f2f(4);
        r45.rw0 rw0Var = (r45.rw0) tw0Var.m75936x14adae67(3);
        if (rw0Var != null) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FEED_SAFE_CHECK_INTERVAL_SEC_INT_SYNC, new java.lang.Integer(rw0Var.m75939xb282bd08(0)));
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_FEED_SAFE_CHECK_LAST_COUNT_INT_SYNC, new java.lang.Integer(rw0Var.m75939xb282bd08(1)));
        }
        java.util.LinkedList m75941xfb821914 = tw0Var.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCheck_result(...)");
        java.util.ArrayList<r45.e20> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj4 : m75941xfb821914) {
            if (((r45.e20) obj4).m75942xfb822ef2(1) != 0) {
                arrayList.add(obj4);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p0Var.f537078c, "mega_verify spam list size: %d", new java.lang.Integer(arrayList.size()));
        if (arrayList.size() > 0) {
            for (r45.e20 e20Var : arrayList) {
                long m75942xfb822ef2 = e20Var.m75942xfb822ef2(0);
                java.util.Iterator it = p0Var.j().m56388xcaeb60d0().iterator();
                while (true) {
                    obj2 = null;
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    so2.j5 j5Var = (so2.j5) obj3;
                    if ((j5Var instanceof zn2.a) && j5Var.mo2128x1ed62e84() == m75942xfb822ef2) {
                        break;
                    }
                }
                so2.j5 j5Var2 = (so2.j5) obj3;
                java.util.Iterator it6 = p0Var.j().m56388xcaeb60d0().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    so2.j5 j5Var3 = (so2.j5) next;
                    if ((j5Var3 instanceof zn2.c) && j5Var3.mo2128x1ed62e84() == m75942xfb822ef2) {
                        obj2 = next;
                        break;
                    }
                }
                so2.j5 j5Var4 = (so2.j5) obj2;
                if (j5Var2 != null) {
                    if (e20Var.m75933x41a8a7f2(3)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p0Var.f537078c, "mega_verify spam lv all scene: %s", new java.lang.Long(m75942xfb822ef2));
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11();
                        c5437xe8b43b11.f135780g.f87970a = j5Var2.mo2128x1ed62e84();
                        c5437xe8b43b11.e();
                    } else {
                        xn2.p0.b(p0Var, j5Var2, true);
                    }
                } else if (j5Var4 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p0Var.f537078c, "mega_verify unkown feed: %s", new java.lang.Long(m75942xfb822ef2));
                } else if (e20Var.m75933x41a8a7f2(3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(p0Var.f537078c, "mega_verify spam later all scene: %s", new java.lang.Long(m75942xfb822ef2));
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5704xb2ebef43 c5704xb2ebef43 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5704xb2ebef43();
                    c5704xb2ebef43.f136026g.f89247a = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var4;
                    c5704xb2ebef43.e();
                } else {
                    xn2.p0.b(p0Var, j5Var4, false);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
