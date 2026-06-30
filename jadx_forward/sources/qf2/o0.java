package qf2;

/* loaded from: classes3.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f444036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f444037f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, qf2.v0 v0Var, java.util.HashMap hashMap) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444035d = hVar;
        this.f444036e = v0Var;
        this.f444037f = hashMap;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.o0(this.f444035d, interfaceC29045xdcb5ca57, this.f444036e, this.f444037f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.o0 o0Var = (qf2.o0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        o0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.LinkedList<r45.yz1> m75941xfb821914;
        km2.q qVar;
        java.lang.String str;
        java.util.LinkedList m75941xfb8219142;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa4;
        r45.w22 w22Var;
        java.util.LinkedList m75941xfb8219143;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.rt1 rt1Var = (r45.rt1) ((xg2.i) this.f444035d).f535926b;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = zn0.x.f555947a.f555948a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrayList, "getRemoteUserConfigList(...)");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zn0.v vVar = (zn0.v) it.next();
            if (vVar != null) {
                java.lang.String str2 = vVar.f555939d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getUserName(...)");
                hashMap.put(str2, vVar);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getNewAnchorPkInfoData success new_pk_mic_infos: ");
        r45.wz1 wz1Var = (r45.wz1) rt1Var.m75936x14adae67(1);
        sb6.append((wz1Var == null || (m75941xfb8219143 = wz1Var.m75941xfb821914(12)) == null) ? null : new java.lang.Integer(m75941xfb8219143.size()));
        sb6.append(" configSize: ");
        sb6.append(hashMap.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", sb6.toString());
        r45.wz1 wz1Var2 = (r45.wz1) rt1Var.m75936x14adae67(1);
        if (wz1Var2 != null && (w22Var = (r45.w22) wz1Var2.m75936x14adae67(13)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", "originMicPkData = " + ((mm2.o4) this.f444036e.m56788xbba4bfc0(mm2.o4.class)).W);
            mm2.o4 o4Var = (mm2.o4) this.f444036e.m56788xbba4bfc0(mm2.o4.class);
            java.lang.String m75945x2fec8307 = w22Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            java.lang.String m75945x2fec83072 = w22Var.m75945x2fec8307(1);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            o4Var.W = new km2.c(m75945x2fec8307, m75945x2fec83072, w22Var.m75942xfb822ef2(2));
            ((mm2.o4) this.f444036e.m56788xbba4bfc0(mm2.o4.class)).X = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", "newMicPkData = " + ((mm2.o4) this.f444036e.m56788xbba4bfc0(mm2.o4.class)).W);
        }
        r45.wz1 wz1Var3 = (r45.wz1) rt1Var.m75936x14adae67(1);
        if (wz1Var3 != null && (m75941xfb8219142 = wz1Var3.m75941xfb821914(12)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : m75941xfb8219142) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(((r45.yz1) obj2).m75945x2fec8307(2), ((mm2.c1) this.f444036e.m56788xbba4bfc0(mm2.c1.class)).m8())) {
                    arrayList2.add(obj2);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                r45.yz1 yz1Var = (r45.yz1) next;
                if (((mm2.o4) this.f444036e.m56788xbba4bfc0(mm2.o4.class)).P.contains(yz1Var.m75945x2fec8307(2)) && this.f444037f.get(yz1Var.m75945x2fec8307(2)) == null) {
                    arrayList3.add(next);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", "getNewAnchorPkInfoData filter size: " + arrayList3.size());
            java.util.Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                r45.yz1 yz1Var2 = (r45.yz1) it7.next();
                if (hashMap.containsKey(yz1Var2.m75945x2fec8307(2))) {
                    java.lang.String m75945x2fec83073 = yz1Var2.m75945x2fec8307(2);
                    r45.xn1 xn1Var = (r45.xn1) yz1Var2.m75936x14adae67(3);
                    java.lang.String m76175x6d346f39 = (xn1Var == null || (c19782x23db1cfa4 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa4.m76175x6d346f39();
                    r45.xn1 xn1Var2 = (r45.xn1) yz1Var2.m75936x14adae67(3);
                    java.lang.String m76197x6c03c64c = (xn1Var2 == null || (c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa3.m76197x6c03c64c();
                    r45.xn1 xn1Var3 = (r45.xn1) yz1Var2.m75936x14adae67(3);
                    java.lang.String m76184x8010e5e4 = (xn1Var3 == null || (c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var3.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa2.m76184x8010e5e4();
                    java.lang.String m75945x2fec83074 = yz1Var2.m75945x2fec8307(0);
                    int m75939xb282bd08 = yz1Var2.m75939xb282bd08(6);
                    r45.xn1 xn1Var4 = (r45.xn1) yz1Var2.m75936x14adae67(3);
                    java.lang.String m75945x2fec83075 = xn1Var4 != null ? xn1Var4.m75945x2fec8307(8) : null;
                    r45.xn1 xn1Var5 = (r45.xn1) yz1Var2.m75936x14adae67(3);
                    r45.xn1 xn1Var6 = (r45.xn1) yz1Var2.m75936x14adae67(3);
                    km2.q qVar2 = new km2.q(m75945x2fec83073, m76175x6d346f39, m76197x6c03c64c, m76184x8010e5e4, 2, m75945x2fec83074, null, true, m75939xb282bd08, null, null, 0, 0, false, m75945x2fec83075, false, 0L, xn1Var5, false, null, xn1Var6 != null ? (r45.ba4) xn1Var6.m75936x14adae67(16) : null, 0, 0, 0L, null, null, 0L, null, 0, 0L, null, null, null, -1196544, 1, null);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("getNewAnchorPkInfoData anchorNick: ");
                    r45.xn1 xn1Var7 = (r45.xn1) yz1Var2.m75936x14adae67(3);
                    sb7.append((xn1Var7 == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var7.m75936x14adae67(0)) == null) ? null : c19782x23db1cfa.m76184x8010e5e4());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", sb7.toString());
                    java.util.List list = ((mm2.o4) this.f444036e.m56788xbba4bfc0(mm2.o4.class)).f410852p;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "<get-recomApplylinkMicUserList>(...)");
                    pm0.v.I(list, new qf2.m0(qVar2));
                    ((mm2.o4) this.f444036e.m56788xbba4bfc0(mm2.o4.class)).L7(qVar2);
                    c61.ac acVar = (c61.ac) i95.n0.c(c61.ac.class);
                    java.lang.String str3 = qVar2.f390705c;
                    if (str3 == null) {
                        str3 = "";
                    }
                    ((b92.g1) acVar).getClass();
                    mk2.h hVar = mk2.h.f408666a;
                    hVar.d(str3);
                    c61.ac acVar2 = (c61.ac) i95.n0.c(c61.ac.class);
                    java.lang.String str4 = qVar2.f390705c;
                    if (str4 == null) {
                        str4 = "";
                    }
                    ((b92.g1) acVar2).getClass();
                    hVar.b(str4);
                    ((mm2.o4) this.f444036e.m56788xbba4bfc0(mm2.o4.class)).V6(((mm2.o4) this.f444036e.m56788xbba4bfc0(mm2.o4.class)).T7(yz1Var2.m75941xfb821914(5)), yz1Var2.m75945x2fec8307(0), 0);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", "add pk mic not in configMap,sdkId: " + yz1Var2.m75945x2fec8307(2));
                }
            }
            if (arrayList3.size() > 0) {
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                tn0.w0 w0Var = dk2.ef.f314911d;
                if (w0Var != null) {
                    w0Var.M0(false);
                }
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.List<km2.q> list2 = ((mm2.o4) this.f444036e.m56788xbba4bfc0(mm2.o4.class)).f410857s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list2, "<get-anchorPkMicUserList>(...)");
        synchronized (list2) {
            for (km2.q qVar3 : list2) {
                if (qVar3 != null && (str = qVar3.f390703a) != null) {
                    hashMap2.put(str, qVar3);
                }
            }
        }
        r45.wz1 wz1Var4 = (r45.wz1) rt1Var.m75936x14adae67(1);
        if (wz1Var4 != null && (m75941xfb821914 = wz1Var4.m75941xfb821914(12)) != null) {
            for (r45.yz1 yz1Var3 : m75941xfb821914) {
                if (hashMap2.containsKey(yz1Var3.m75945x2fec8307(2)) && (qVar = (km2.q) hashMap2.get(yz1Var3.m75945x2fec8307(2))) != null) {
                    qVar.G = yz1Var3.m75945x2fec8307(0);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
