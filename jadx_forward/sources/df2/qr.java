package df2;

/* loaded from: classes10.dex */
public final class qr extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f312717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr(df2.lt ltVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312717d = ltVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.qr(this.f312717d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.qr qrVar = (df2.qr) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        qrVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        java.lang.String str;
        r45.bm1 bm1Var;
        r45.bm1 bm1Var2;
        r45.bm1 bm1Var3;
        java.util.LinkedList m75941xfb821914;
        r45.bm1 bm1Var4;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        while (!((mm2.c1) this.f312717d.m56788xbba4bfc0(mm2.c1.class)).f410347h3.isEmpty()) {
            df2.lt ltVar = this.f312717d;
            synchronized (ltVar.f312246u) {
                r45.am1 am1Var = (r45.am1) ((mm2.c1) ltVar.m56788xbba4bfc0(mm2.c1.class)).f410347h3.poll();
                if (am1Var != null) {
                    java.util.Iterator it = ltVar.f312250y.iterator();
                    int i18 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i18 = -1;
                            break;
                        }
                        in5.c cVar = (in5.c) it.next();
                        dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((hVar == null || (bm1Var4 = hVar.f315078h) == null) ? null : bm1Var4.m75945x2fec8307(0), am1Var.m75945x2fec8307(0))) {
                            break;
                        }
                        i18++;
                    }
                    if (i18 != -1 && ltVar.f312250y.size() > 0) {
                        java.lang.Object obj2 = ltVar.f312250y.get(i18);
                        dk2.h hVar2 = obj2 instanceof dk2.h ? (dk2.h) obj2 : null;
                        if (((hVar2 == null || (bm1Var3 = hVar2.f315078h) == null || (m75941xfb821914 = bm1Var3.m75941xfb821914(13)) == null) ? 0 : m75941xfb821914.size()) != am1Var.m75941xfb821914(1).size() && hVar2 != null) {
                            hVar2.f315077g = 0;
                        }
                        if (am1Var.m75941xfb821914(1).size() > 0) {
                            r45.bm1 bm1Var5 = hVar2 != null ? hVar2.f315078h : null;
                            if (bm1Var5 != null) {
                                bm1Var5.set(13, am1Var.m75941xfb821914(1));
                            }
                        }
                        java.lang.String str2 = df2.lt.W;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("version banner livemsg ");
                        sb6.append((hVar2 == null || (bm1Var2 = hVar2.f315078h) == null) ? null : new java.lang.Integer(bm1Var2.m75939xb282bd08(19)));
                        sb6.append(" , wording: ");
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) am1Var.m75936x14adae67(2);
                        sb6.append(c19786x6a1e2862 != null ? c19786x6a1e2862.m76523x98b23862() : null);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", sb6.toString());
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) am1Var.m75936x14adae67(2);
                        if (c19786x6a1e28622 != null) {
                            dk2.h hVar3 = new dk2.h(c19786x6a1e28622);
                            java.util.Iterator it6 = ltVar.f312249x.iterator();
                            int i19 = 0;
                            while (true) {
                                if (!it6.hasNext()) {
                                    i17 = -1;
                                    break;
                                }
                                in5.c cVar2 = (in5.c) it6.next();
                                dk2.h hVar4 = cVar2 instanceof dk2.h ? (dk2.h) cVar2 : null;
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((hVar4 == null || (bm1Var = hVar4.f315078h) == null) ? null : bm1Var.m75945x2fec8307(0), am1Var.m75945x2fec8307(0))) {
                                    i17 = i19;
                                    break;
                                }
                                i19++;
                            }
                            ltVar.f312249x.set(i17, hVar3);
                            r45.bm1 bm1Var6 = hVar3.f315078h;
                            if (bm1Var6 != null && bm1Var6.m75933x41a8a7f2(20)) {
                                jz5.l lVar = ltVar.V;
                                java.lang.String str3 = lVar != null ? (java.lang.String) lVar.f384366d : null;
                                java.lang.String str4 = lVar != null ? (java.lang.String) lVar.f384367e : null;
                                if (str3 != null && str4 != null) {
                                    java.lang.String str5 = df2.lt.W;
                                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                    sb7.append("banner cacheInfo clear id: ");
                                    sb7.append(str4);
                                    sb7.append(" url ");
                                    sb7.append(str3);
                                    sb7.append(" , new info : id ");
                                    r45.bm1 bm1Var7 = hVar3.f315078h;
                                    sb7.append(bm1Var7 != null ? bm1Var7.m75945x2fec8307(0) : null);
                                    sb7.append(" wording ");
                                    sb7.append(hVar3.f315074d.m76523x98b23862());
                                    sb7.append(" needPreload ");
                                    r45.bm1 bm1Var8 = hVar3.f315078h;
                                    sb7.append(bm1Var8 != null ? new java.lang.Integer(bm1Var8.m75939xb282bd08(1)) : null);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", sb7.toString());
                                    ((yg0.u3) ((zg0.c3) i95.n0.c(zg0.c3.class))).Ai(str3);
                                    ltVar.U.put(str4, new java.lang.Long(0L));
                                }
                                if (bm1Var6.m75939xb282bd08(1) == 1) {
                                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19799x6a7e198 m76494x46f709d9 = hVar3.f315074d.m76494x46f709d9();
                                    if (m76494x46f709d9 == null || (str = m76494x46f709d9.m77166xb5887639()) == null) {
                                        str = "";
                                    }
                                    df2.lt.a7(ltVar, str, bm1Var6);
                                }
                            }
                            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(hVar2 != null ? hVar2.f315074d : null, c19786x6a1e28622)) {
                                ltVar.f312250y.set(i18, hVar3);
                                if (i18 == ltVar.f312245t % ltVar.f312250y.size()) {
                                    java.lang.String str6 = df2.lt.W;
                                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                                    sb8.append("notify index: ");
                                    sb8.append(i18);
                                    sb8.append(", wording: ");
                                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28623 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) am1Var.m75936x14adae67(2);
                                    sb8.append(c19786x6a1e28623 != null ? c19786x6a1e28623.m76523x98b23862() : null);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePromoteBannerController", sb8.toString());
                                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = ltVar.f312240o;
                                    if (c22848x6ddd90cf != null) {
                                        c22848x6ddd90cf.m8148xed6e4d18(ltVar.f312245t, "bannerselected");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
