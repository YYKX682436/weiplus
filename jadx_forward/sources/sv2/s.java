package sv2;

/* loaded from: classes10.dex */
public final class s implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sv2.v f494884d;

    public s(sv2.v vVar) {
        this.f494884d = vVar;
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
        java.lang.Object obj5;
        java.lang.Object obj6;
        r45.el2 m76948xfa25bce2;
        r45.el2 m76948xfa25bce22;
        r45.el2 m76948xfa25bce23;
        r45.el2 m76948xfa25bce24;
        java.lang.Object obj7;
        r45.el2 m76948xfa25bce25;
        java.lang.Object obj8;
        sv2.v vVar = this.f494884d;
        java.lang.String str3 = vVar.f494888i;
        java.lang.String str4 = "on cdn callback someOneFailed:" + vVar.f494896t + ", mediaId = %s, startRet = %d, sceneResult %s";
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        if (hVar == null || (str2 = hVar.m125799x9616526c()) == null) {
            str2 = "null";
        }
        objArr[2] = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str4, objArr);
        if (!vVar.f494894r && !vVar.f494896t) {
            vVar.getClass();
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            cu2.o oVar = cu2.o.f303963a;
            if (!K0) {
                java.util.Map map = vVar.f494891o;
                if (map.containsKey(str) && gVar != null) {
                    float f17 = (((float) gVar.f69496x83ec3dd) * 1.0f) / ((float) gVar.f69500x8ab84c59);
                    java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
                    java.lang.Object obj9 = linkedHashMap.get(str);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj9);
                    if (f17 > ((java.lang.Number) obj9).floatValue()) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                        map.put(str, java.lang.Float.valueOf(f17));
                    }
                    float H0 = kz5.n0.H0(linkedHashMap.values()) / map.size();
                    int i18 = ((int) (45 * H0)) + 45;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = vVar.f494887h;
                    sb6.append(x80Var.f66236x88be67a1);
                    sb6.append(" updateProgress  ");
                    sb6.append(H0);
                    sb6.append(", ");
                    sb6.append(i18);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f494888i, sb6.toString());
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = vVar.f494889m;
                    if (c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4) < i18) {
                        c14994x9b99c079.m59277xa8f45ee4().set(4, java.lang.Integer.valueOf(i18));
                        oVar.b(x80Var);
                    }
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f();
                    long j17 = x80Var.f66236x88be67a1;
                    am.ga gaVar = c5442xd807898f.f135783g;
                    gaVar.f88282a = j17;
                    gaVar.f88283b = c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4);
                    c5442xd807898f.e();
                }
            }
            if (i17 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(vVar.f494888i, "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
                if (i17 != -21005) {
                    ((java.util.ArrayList) vVar.f494897u).add(str != null ? str : "");
                    vVar.f494896t = true;
                    java.util.Iterator<T> it = vVar.f494889m.m59264x7efe73ec().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj8 = null;
                            break;
                        }
                        obj8 = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.mb4) obj8).m75945x2fec8307(9), sv2.v.k(vVar, str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var = (r45.mb4) obj8;
                    if (mb4Var != null) {
                        sv2.v.m(vVar, i17, mb4Var);
                    }
                    sv2.v.q(vVar, false, false, 2, null);
                    sv2.v.l(vVar, new sv2.c(vVar.f494887h, 2));
                }
                return 0;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && hVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f494888i, "retCode %d, fileId %s, url %s", java.lang.Integer.valueOf(hVar.f69553xb5f54fe9), hVar.f69522xf9dbbe9c, hVar.f69524x419c440e);
                if (hVar.f69553xb5f54fe9 != 0) {
                    ((java.util.ArrayList) vVar.f494897u).add(str != null ? str : "");
                    vVar.f494896t = true;
                    java.util.Iterator<T> it6 = vVar.f494889m.m59264x7efe73ec().iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj7 = null;
                            break;
                        }
                        obj7 = it6.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.mb4) obj7).m75945x2fec8307(9), sv2.v.k(vVar, str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var2 = (r45.mb4) obj7;
                    if (mb4Var2 != null) {
                        sv2.v.m(vVar, hVar.f69553xb5f54fe9, mb4Var2);
                    }
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = vVar.f494889m.getFeedObject().m76802x2dd01666();
                    r45.zi2 zi2Var = (m76802x2dd01666 == null || (m76948xfa25bce25 = m76802x2dd01666.m76948xfa25bce2()) == null) ? null : (r45.zi2) m76948xfa25bce25.m75936x14adae67(0);
                    if (zi2Var != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(zi2Var.m75945x2fec8307(5)), sv2.v.k(vVar, str))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1530L, 3L, 1L);
                    }
                    sv2.v.q(vVar, false, false, 2, null);
                    sv2.v.l(vVar, new sv2.c(vVar.f494887h, 2));
                    return 0;
                }
                vVar.f494892p.remove(str);
                java.util.LinkedList<r45.mb4> m59264x7efe73ec = vVar.f494889m.m59264x7efe73ec();
                int size = vVar.f494892p.size();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f494888i, "%s waitToUpload %d media localId:" + vVar.f494887h.f66236x88be67a1, java.lang.Long.valueOf(vVar.f494887h.f66236x88be67a1), java.lang.Integer.valueOf(size));
                java.util.Iterator it7 = vVar.f494895s.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it7.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.mb4) obj).m75945x2fec8307(9), sv2.v.k(vVar, str))) {
                        break;
                    }
                }
                boolean z18 = obj != null;
                java.util.Iterator<T> it8 = m59264x7efe73ec.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it8.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.mb4) obj2).m75945x2fec8307(9), sv2.v.k(vVar, str))) {
                        break;
                    }
                }
                r45.mb4 mb4Var3 = (r45.mb4) obj2;
                if (mb4Var3 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f494888i, "hitMedia, isLongVideo:" + z18 + ", isHalf:false");
                    mb4Var3.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(mb4Var3.m75945x2fec8307(0)));
                    mb4Var3.set(11, hVar.f69524x419c440e);
                    mb4Var3.set(12, hVar.f69560x7b284d5e);
                    mb4Var3.set(6, hVar.f69526x419c9c3d);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = vVar.f494889m;
                    if (z18) {
                        m59264x7efe73ec.clear();
                        m59264x7efe73ec.add(mb4Var3);
                        c14994x9b99c0792.m59395xdb523460(m59264x7efe73ec);
                        sv2.v.m(vVar, 0, mb4Var3);
                    } else {
                        c14994x9b99c0792.m59395xdb523460(m59264x7efe73ec);
                        sv2.v.m(vVar, 0, mb4Var3);
                    }
                    oVar.b(vVar.f494887h);
                }
                if (mb4Var3 == null) {
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = vVar.f494889m.getFeedObject().m76802x2dd01666();
                    r45.zi2 zi2Var2 = (m76802x2dd016662 == null || (m76948xfa25bce24 = m76802x2dd016662.m76948xfa25bce2()) == null) ? null : (r45.zi2) m76948xfa25bce24.m75936x14adae67(0);
                    if (zi2Var2 != null) {
                        java.lang.String m75945x2fec8307 = zi2Var2.m75945x2fec8307(5);
                        if (m75945x2fec8307 == null) {
                            m75945x2fec8307 = "";
                        }
                        char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec8307.getBytes()), sv2.v.k(vVar, str))) {
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663 = vVar.f494889m.getFeedObject().m76802x2dd01666();
                            r45.zi2 zi2Var3 = (m76802x2dd016663 == null || (m76948xfa25bce23 = m76802x2dd016663.m76948xfa25bce2()) == null) ? null : (r45.zi2) m76948xfa25bce23.m75936x14adae67(0);
                            if (zi2Var3 != null) {
                                zi2Var3.set(5, hVar.f69524x419c440e);
                            }
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016664 = vVar.f494889m.getFeedObject().m76802x2dd01666();
                            r45.zi2 zi2Var4 = (m76802x2dd016664 == null || (m76948xfa25bce22 = m76802x2dd016664.m76948xfa25bce2()) == null) ? null : (r45.zi2) m76948xfa25bce22.m75936x14adae67(0);
                            if (zi2Var4 != null) {
                                zi2Var4.set(0, "");
                            }
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016665 = vVar.f494889m.getFeedObject().m76802x2dd01666();
                            r45.zi2 zi2Var5 = (m76802x2dd016665 == null || (m76948xfa25bce2 = m76802x2dd016665.m76948xfa25bce2()) == null) ? null : (r45.zi2) m76948xfa25bce2.m75936x14adae67(0);
                            if (zi2Var5 != null) {
                                zi2Var5.set(2, "");
                            }
                            oVar.b(vVar.f494887h);
                        }
                    }
                    java.util.Iterator<T> it9 = m59264x7efe73ec.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it9.next();
                        java.lang.String m75945x2fec83072 = ((r45.mb4) obj3).m75945x2fec8307(41);
                        if (m75945x2fec83072 == null) {
                            m75945x2fec83072 = "";
                        }
                        char[] cArr2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec83072.getBytes()), sv2.v.k(vVar, str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var4 = (r45.mb4) obj3;
                    if (mb4Var4 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f494888i, "upload fullCover ok, url:" + hVar.f69524x419c440e);
                        mb4Var4.set(40, hVar.f69524x419c440e);
                        r45.mb4 mb4Var5 = (r45.mb4) kz5.n0.Z(vVar.f494895s);
                        if (mb4Var5 != null) {
                            mb4Var5.set(40, hVar.f69524x419c440e);
                        }
                    }
                    java.util.Iterator<T> it10 = m59264x7efe73ec.iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it10.next();
                        java.lang.String m75945x2fec83073 = ((r45.mb4) obj4).m75945x2fec8307(16);
                        if (m75945x2fec83073 == null) {
                            m75945x2fec83073 = "";
                        }
                        char[] cArr3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec83073.getBytes()), sv2.v.k(vVar, str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var6 = (r45.mb4) obj4;
                    if (mb4Var6 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f494888i, "upload cover ok, url:" + hVar.f69524x419c440e);
                        mb4Var6.set(23, hVar.f69524x419c440e);
                        r45.mb4 mb4Var7 = (r45.mb4) kz5.n0.Z(vVar.f494895s);
                        if (mb4Var7 != null) {
                            mb4Var7.set(23, hVar.f69524x419c440e);
                        }
                    }
                    java.util.Iterator<T> it11 = m59264x7efe73ec.iterator();
                    while (true) {
                        if (!it11.hasNext()) {
                            obj5 = null;
                            break;
                        }
                        obj5 = it11.next();
                        java.lang.String m75945x2fec83074 = ((r45.mb4) obj5).m75945x2fec8307(25);
                        if (m75945x2fec83074 == null) {
                            m75945x2fec83074 = "";
                        }
                        char[] cArr4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec83074.getBytes()), sv2.v.k(vVar, str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var8 = (r45.mb4) obj5;
                    if (mb4Var8 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f494888i, "upload fullThumb ok, url:" + hVar.f69524x419c440e);
                        mb4Var8.set(27, hVar.f69524x419c440e);
                    }
                    java.util.Iterator<T> it12 = m59264x7efe73ec.iterator();
                    while (true) {
                        if (!it12.hasNext()) {
                            obj6 = null;
                            break;
                        }
                        obj6 = it12.next();
                        java.lang.String m75945x2fec83075 = ((r45.mb4) obj6).m75945x2fec8307(62);
                        if (m75945x2fec83075 == null) {
                            m75945x2fec83075 = "";
                        }
                        char[] cArr5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec83075.getBytes()), sv2.v.k(vVar, str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var9 = (r45.mb4) obj6;
                    if (mb4Var9 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f494888i, "upload fullThumb ok, url:" + hVar.f69524x419c440e);
                        mb4Var9.set(65, hVar.f69524x419c440e);
                    }
                    oVar.b(vVar.f494887h);
                }
                if (size == 0) {
                    sv2.v.q(vVar, true, false, 2, null);
                    sv2.v.l(vVar, new sv2.q(vVar.f494887h, vVar.f494899w));
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
