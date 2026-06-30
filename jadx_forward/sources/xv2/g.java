package xv2;

/* loaded from: classes10.dex */
public final class g implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xv2.j f538943d;

    public g(xv2.j jVar) {
        this.f538943d = jVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str2;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.util.LinkedList linkedList;
        r45.q23 m76980xaa7f977e;
        r45.el2 m76948xfa25bce2;
        r45.el2 m76948xfa25bce22;
        java.lang.Object obj5;
        r45.el2 m76948xfa25bce23;
        xv2.j jVar = this.f538943d;
        java.lang.String str3 = jVar.f538947i;
        java.lang.String str4 = "on cdn callback someOneFailed:" + jVar.f538954s + ", mediaId = %s, startRet = %d, sceneResult %s";
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        if (hVar == null || (str2 = hVar.m125799x9616526c()) == null) {
            str2 = "null";
        }
        objArr[2] = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str4, objArr);
        if (!jVar.f538952q && !jVar.f538954s) {
            jVar.getClass();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                java.util.Map map = jVar.f538949n;
                if (map.containsKey(str) && gVar != null) {
                    float f17 = (((float) gVar.f69496x83ec3dd) * 1.0f) / ((float) gVar.f69500x8ab84c59);
                    java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
                    java.lang.Object obj6 = linkedHashMap.get(str);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj6);
                    if (f17 > ((java.lang.Number) obj6).floatValue()) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        map.put(str, java.lang.Float.valueOf(f17));
                    }
                    float H0 = kz5.n0.H0(linkedHashMap.values()) / map.size();
                    int i18 = ((int) (45 * H0)) + 45;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = jVar.f538946h;
                    sb6.append(c14994x9b99c079.m59260x51f8f5b0());
                    sb6.append(" updateProgress  ");
                    sb6.append(H0);
                    sb6.append(", ");
                    sb6.append(i18);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f538947i, sb6.toString());
                    if (c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4) < i18) {
                        c14994x9b99c079.m59277xa8f45ee4().set(4, java.lang.Integer.valueOf(i18));
                        cu2.u.f303974a.l(c14994x9b99c079);
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f();
                    long m59260x51f8f5b0 = c14994x9b99c079.m59260x51f8f5b0();
                    am.ga gaVar = c5442xd807898f.f135783g;
                    gaVar.f88282a = m59260x51f8f5b0;
                    gaVar.f88283b = c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4);
                    c5442xd807898f.e();
                }
            }
            java.lang.Object obj7 = null;
            java.lang.Object obj8 = null;
            r7 = null;
            r45.zi2 zi2Var = null;
            r7 = null;
            r45.zi2 zi2Var2 = null;
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(jVar.f538947i, "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
                if (i17 == -21005 || xv2.j.k(jVar, str)) {
                    return 0;
                }
                ((java.util.ArrayList) jVar.f538955t).add(str != null ? str : "");
                jVar.f538954s = true;
                java.util.Iterator<T> it = jVar.f538946h.m59264x7efe73ec().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.mb4) next).m75945x2fec8307(9), jVar.o(str))) {
                        obj8 = next;
                        break;
                    }
                }
                r45.mb4 mb4Var = (r45.mb4) obj8;
                if (mb4Var != null) {
                    xv2.j.m(jVar, i17, mb4Var);
                }
                jVar.p(false, true);
                xv2.j.l(jVar, new tv2.x(jVar.f538946h, 2));
                return 0;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && hVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f538947i, "retCode %d, fileId %s, url %s", java.lang.Integer.valueOf(hVar.f69553xb5f54fe9), hVar.f69522xf9dbbe9c, hVar.f69524x419c440e);
                if (hVar.f69553xb5f54fe9 != 0) {
                    if (xv2.j.k(jVar, str)) {
                        return 0;
                    }
                    ((java.util.ArrayList) jVar.f538955t).add(str != null ? str : "");
                    jVar.f538954s = true;
                    java.util.Iterator<T> it6 = jVar.f538946h.m59264x7efe73ec().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj5 = null;
                            break;
                        }
                        obj5 = it6.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.mb4) obj5).m75945x2fec8307(9), jVar.o(str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var2 = (r45.mb4) obj5;
                    if (mb4Var2 != null) {
                        xv2.j.m(jVar, hVar.f69553xb5f54fe9, mb4Var2);
                    }
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = jVar.f538946h.getFeedObject().m76802x2dd01666();
                    if (m76802x2dd01666 != null && (m76948xfa25bce23 = m76802x2dd01666.m76948xfa25bce2()) != null) {
                        zi2Var = (r45.zi2) m76948xfa25bce23.m75936x14adae67(0);
                    }
                    if (zi2Var != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(zi2Var.m75945x2fec8307(5)), jVar.o(str))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1530L, 3L, 1L);
                    }
                    jVar.p(false, true);
                    xv2.j.l(jVar, new tv2.x(jVar.f538946h, 2));
                    return 0;
                }
                jVar.f538950o.remove(str);
                java.util.LinkedList<r45.mb4> m59264x7efe73ec = jVar.f538946h.m59264x7efe73ec();
                int size = jVar.f538950o.size();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f538947i, "%s waitToUpload %d media localId:" + jVar.f538946h.m59260x51f8f5b0(), java.lang.Long.valueOf(jVar.f538946h.m59260x51f8f5b0()), java.lang.Integer.valueOf(size));
                java.util.Iterator<T> it7 = m59264x7efe73ec.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it7.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.mb4) obj).m75945x2fec8307(9), jVar.o(str))) {
                        break;
                    }
                }
                r45.mb4 mb4Var3 = (r45.mb4) obj;
                if (mb4Var3 != null) {
                    mb4Var3.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(mb4Var3.m75945x2fec8307(0)));
                    mb4Var3.set(11, hVar.f69524x419c440e);
                    mb4Var3.set(12, hVar.f69560x7b284d5e);
                    mb4Var3.set(6, hVar.f69526x419c9c3d);
                    mb4Var3.set(7, java.lang.Integer.valueOf((int) hVar.f69523x17c343e7));
                    jVar.f538946h.m59395xdb523460(m59264x7efe73ec);
                    xv2.j.m(jVar, 0, mb4Var3);
                    cu2.u.f303974a.l(jVar.f538946h);
                }
                if (mb4Var3 == null) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = jVar.f538946h.getFeedObject().m76802x2dd01666();
                    r45.zi2 zi2Var3 = (m76802x2dd016662 == null || (m76948xfa25bce22 = m76802x2dd016662.m76948xfa25bce2()) == null) ? null : (r45.zi2) m76948xfa25bce22.m75936x14adae67(0);
                    if (zi2Var3 != null) {
                        java.lang.String m75945x2fec8307 = zi2Var3.m75945x2fec8307(5);
                        if (m75945x2fec8307 == null) {
                            m75945x2fec8307 = "";
                        }
                        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec8307.getBytes()), jVar.o(str))) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f538947i, "upload audio track ok, url:" + hVar.f69524x419c440e);
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663 = jVar.f538946h.getFeedObject().m76802x2dd01666();
                            r45.zi2 m76957xbc8beb4b = m76802x2dd016663 != null ? m76802x2dd016663.m76957xbc8beb4b() : null;
                            if (m76957xbc8beb4b != null) {
                                m76957xbc8beb4b.set(5, hVar.f69524x419c440e);
                            }
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016664 = jVar.f538946h.getFeedObject().m76802x2dd01666();
                            if (m76802x2dd016664 != null && (m76948xfa25bce2 = m76802x2dd016664.m76948xfa25bce2()) != null) {
                                zi2Var2 = (r45.zi2) m76948xfa25bce2.m75936x14adae67(0);
                            }
                            if (zi2Var2 != null) {
                                zi2Var2.set(5, hVar.f69524x419c440e);
                            }
                            cu2.u.f303974a.l(jVar.f538946h);
                        }
                    }
                    java.util.Iterator<T> it8 = m59264x7efe73ec.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it8.next();
                        java.lang.String m75945x2fec83072 = ((r45.mb4) obj2).m75945x2fec8307(41);
                        if (m75945x2fec83072 == null) {
                            m75945x2fec83072 = "";
                        }
                        char[] cArr2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec83072.getBytes()), jVar.o(str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var4 = (r45.mb4) obj2;
                    if (mb4Var4 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f538947i, "upload fullCover ok, url:" + hVar.f69524x419c440e);
                        mb4Var4.set(40, hVar.f69524x419c440e);
                        r45.mb4 mb4Var5 = (r45.mb4) kz5.n0.Z(jVar.f538953r);
                        if (mb4Var5 != null) {
                            mb4Var5.set(40, hVar.f69524x419c440e);
                        }
                    }
                    java.util.Iterator<T> it9 = m59264x7efe73ec.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it9.next();
                        java.lang.String m75945x2fec83073 = ((r45.mb4) obj3).m75945x2fec8307(16);
                        if (m75945x2fec83073 == null) {
                            m75945x2fec83073 = "";
                        }
                        char[] cArr3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec83073.getBytes()), jVar.o(str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var6 = (r45.mb4) obj3;
                    if (mb4Var6 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f538947i, "upload cover ok, url:" + hVar.f69524x419c440e);
                        mb4Var6.set(23, hVar.f69524x419c440e);
                        r45.mb4 mb4Var7 = (r45.mb4) kz5.n0.Z(jVar.f538953r);
                        if (mb4Var7 != null) {
                            mb4Var7.set(23, hVar.f69524x419c440e);
                        }
                    }
                    java.util.Iterator<T> it10 = m59264x7efe73ec.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it10.next();
                        java.lang.String m75945x2fec83074 = ((r45.mb4) obj4).m75945x2fec8307(25);
                        if (m75945x2fec83074 == null) {
                            m75945x2fec83074 = "";
                        }
                        char[] cArr4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec83074.getBytes()), jVar.o(str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var8 = (r45.mb4) obj4;
                    if (mb4Var8 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f538947i, "upload fullThumb ok, url:" + hVar.f69524x419c440e);
                        mb4Var8.set(27, hVar.f69524x419c440e);
                    }
                    java.lang.String str5 = hVar.f69524x419c440e;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016665 = jVar.f538946h.getFeedObject().m76802x2dd01666();
                    r45.iy5 iy5Var = (m76802x2dd016665 == null || (m76980xaa7f977e = m76802x2dd016665.m76980xaa7f977e()) == null) ? null : m76980xaa7f977e.f465125n;
                    if (iy5Var != null && (linkedList = iy5Var.f458945d) != null) {
                        java.util.Iterator it11 = linkedList.iterator();
                        while (true) {
                            if (!it11.hasNext()) {
                                break;
                            }
                            java.lang.Object next2 = it11.next();
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a((java.lang.String) next2), jVar.o(str))) {
                                obj7 = next2;
                                break;
                            }
                        }
                        java.lang.String str6 = (java.lang.String) obj7;
                        if (str6 != null) {
                            linkedList.set(linkedList.indexOf(str6), str5 != null ? str5 : "");
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jVar.f538947i, "handleTemplateScyThumb target:" + str6 + " to mediaId:" + str);
                        }
                    }
                    cu2.u.f303974a.l(jVar.f538946h);
                }
                if (size == 0) {
                    jVar.p(true, true);
                    xv2.j.l(jVar, new xv2.e(jVar.f538946h, jVar.f538957v));
                }
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
