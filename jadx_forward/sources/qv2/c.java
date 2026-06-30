package qv2;

/* loaded from: classes10.dex */
public final class c implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qv2.e f448470d;

    public c(qv2.e eVar) {
        this.f448470d = eVar;
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
        java.lang.Object obj7;
        java.util.LinkedList linkedList;
        r45.q23 m76980xaa7f977e;
        r45.zi2 zi2Var;
        r45.el2 m76948xfa25bce2;
        r45.el2 m76948xfa25bce22;
        java.lang.String s17 = this.f448470d.s();
        java.lang.String str3 = "on cdn callback someOneFailed:" + this.f448470d.f448478r + ", mediaId = %s, startRet = %d, sceneResult %s";
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        if (hVar == null || (str2 = hVar.m125799x9616526c()) == null) {
            str2 = "null";
        }
        objArr[2] = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s17, str3, objArr);
        if (!this.f448470d.f448472i) {
            qv2.e eVar = this.f448470d;
            if (!eVar.f448478r) {
                eVar.E(str, gVar);
                if (i17 != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f448470d.s(), "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
                    if (i17 == -21005 || qv2.e.k(this.f448470d, str)) {
                        return 0;
                    }
                    qv2.e eVar2 = this.f448470d;
                    eVar2.f448478r = true;
                    eVar2.t(str, i17);
                    return 0;
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && hVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f448470d.s(), "retCode %d, fileId %s, url %s", java.lang.Integer.valueOf(hVar.f69553xb5f54fe9), hVar.f69522xf9dbbe9c, hVar.f69524x419c440e);
                    if (hVar.f69553xb5f54fe9 != 0) {
                        if (qv2.e.k(this.f448470d, str)) {
                            return 0;
                        }
                        qv2.e eVar3 = this.f448470d;
                        eVar3.f448478r = true;
                        eVar3.t(str, hVar.f69553xb5f54fe9);
                        return 0;
                    }
                    this.f448470d.f448475o.remove(str);
                    java.util.LinkedList<r45.mb4> m59264x7efe73ec = this.f448470d.f448471h.m59264x7efe73ec();
                    int size = this.f448470d.f448475o.size();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f448470d.s(), "%s waitToUpload %d media localId:" + this.f448470d.f448471h.m59260x51f8f5b0(), java.lang.Long.valueOf(this.f448470d.f448471h.m59260x51f8f5b0()), java.lang.Integer.valueOf(size));
                    qv2.e eVar4 = this.f448470d;
                    java.util.Iterator it = eVar4.f448477q.iterator();
                    while (true) {
                        obj = null;
                        zi2Var = null;
                        zi2Var = null;
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.mb4) obj2).m75945x2fec8307(9), eVar4.x(str))) {
                            break;
                        }
                    }
                    boolean z18 = obj2 != null;
                    qv2.e eVar5 = this.f448470d;
                    java.util.Iterator<T> it6 = m59264x7efe73ec.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it6.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.mb4) obj3).m75945x2fec8307(9), eVar5.x(str))) {
                            break;
                        }
                    }
                    r45.mb4 mb4Var = (r45.mb4) obj3;
                    if (mb4Var != null) {
                        qv2.e eVar6 = this.f448470d;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar6.s(), "hitMedia, upload media ok isLongVideo:" + z18 + ", isHalf:false");
                        mb4Var.set(9, com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(mb4Var.m75945x2fec8307(0)));
                        mb4Var.set(11, hVar.f69524x419c440e);
                        mb4Var.set(12, hVar.f69560x7b284d5e);
                        mb4Var.set(6, hVar.f69526x419c9c3d);
                        if (z18) {
                            m59264x7efe73ec.clear();
                            m59264x7efe73ec.add(mb4Var);
                            eVar6.f448471h.m59395xdb523460(m59264x7efe73ec);
                            eVar6.D(0, mb4Var);
                        } else {
                            eVar6.f448471h.m59395xdb523460(m59264x7efe73ec);
                            eVar6.D(0, mb4Var);
                        }
                        eVar6.y();
                    }
                    if (mb4Var == null) {
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = this.f448470d.f448471h.getFeedObject().m76802x2dd01666();
                        r45.zi2 zi2Var2 = (m76802x2dd01666 == null || (m76948xfa25bce22 = m76802x2dd01666.m76948xfa25bce2()) == null) ? null : (r45.zi2) m76948xfa25bce22.m75936x14adae67(0);
                        if (zi2Var2 != null) {
                            java.lang.String m75945x2fec8307 = zi2Var2.m75945x2fec8307(5);
                            if (m75945x2fec8307 == null) {
                                m75945x2fec8307 = "";
                            }
                            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec8307.getBytes()), this.f448470d.x(str))) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f448470d.s(), "upload audio track ok, url:" + hVar.f69524x419c440e);
                                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = this.f448470d.f448471h.getFeedObject().m76802x2dd01666();
                                r45.zi2 m76957xbc8beb4b = m76802x2dd016662 != null ? m76802x2dd016662.m76957xbc8beb4b() : null;
                                if (m76957xbc8beb4b != null) {
                                    m76957xbc8beb4b.set(5, hVar.f69524x419c440e);
                                }
                                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016663 = this.f448470d.f448471h.getFeedObject().m76802x2dd01666();
                                if (m76802x2dd016663 != null && (m76948xfa25bce2 = m76802x2dd016663.m76948xfa25bce2()) != null) {
                                    zi2Var = (r45.zi2) m76948xfa25bce2.m75936x14adae67(0);
                                }
                                if (zi2Var != null) {
                                    zi2Var.set(5, hVar.f69524x419c440e);
                                }
                                this.f448470d.y();
                            }
                        }
                        qv2.e eVar7 = this.f448470d;
                        java.util.Iterator<T> it7 = m59264x7efe73ec.iterator();
                        while (true) {
                            if (!it7.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it7.next();
                            java.lang.String m75945x2fec83072 = ((r45.mb4) obj4).m75945x2fec8307(41);
                            if (m75945x2fec83072 == null) {
                                m75945x2fec83072 = "";
                            }
                            char[] cArr2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec83072.getBytes()), eVar7.x(str))) {
                                break;
                            }
                        }
                        r45.mb4 mb4Var2 = (r45.mb4) obj4;
                        if (mb4Var2 != null) {
                            qv2.e eVar8 = this.f448470d;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar8.s(), "upload fullCover ok, url:" + hVar.f69524x419c440e);
                            mb4Var2.set(40, hVar.f69524x419c440e);
                            r45.mb4 mb4Var3 = (r45.mb4) kz5.n0.Z(eVar8.f448477q);
                            if (mb4Var3 != null) {
                                mb4Var3.set(40, hVar.f69524x419c440e);
                            }
                        }
                        qv2.e eVar9 = this.f448470d;
                        java.util.Iterator<T> it8 = m59264x7efe73ec.iterator();
                        while (true) {
                            if (!it8.hasNext()) {
                                obj5 = null;
                                break;
                            }
                            obj5 = it8.next();
                            java.lang.String m75945x2fec83073 = ((r45.mb4) obj5).m75945x2fec8307(16);
                            if (m75945x2fec83073 == null) {
                                m75945x2fec83073 = "";
                            }
                            char[] cArr3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec83073.getBytes()), eVar9.x(str))) {
                                break;
                            }
                        }
                        r45.mb4 mb4Var4 = (r45.mb4) obj5;
                        if (mb4Var4 != null) {
                            qv2.e eVar10 = this.f448470d;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar10.s(), "upload cover ok, url:" + hVar.f69524x419c440e);
                            mb4Var4.set(23, hVar.f69524x419c440e);
                            r45.mb4 mb4Var5 = (r45.mb4) kz5.n0.Z(eVar10.f448477q);
                            if (mb4Var5 != null) {
                                mb4Var5.set(23, hVar.f69524x419c440e);
                            }
                        }
                        qv2.e eVar11 = this.f448470d;
                        java.util.Iterator<T> it9 = m59264x7efe73ec.iterator();
                        while (true) {
                            if (!it9.hasNext()) {
                                obj6 = null;
                                break;
                            }
                            obj6 = it9.next();
                            java.lang.String m75945x2fec83074 = ((r45.mb4) obj6).m75945x2fec8307(25);
                            if (m75945x2fec83074 == null) {
                                m75945x2fec83074 = "";
                            }
                            char[] cArr4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec83074.getBytes()), eVar11.x(str))) {
                                break;
                            }
                        }
                        r45.mb4 mb4Var6 = (r45.mb4) obj6;
                        if (mb4Var6 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f448470d.s(), "upload fullThumb ok, url:" + hVar.f69524x419c440e);
                            mb4Var6.set(27, hVar.f69524x419c440e);
                        }
                        qv2.e eVar12 = this.f448470d;
                        java.util.Iterator<T> it10 = m59264x7efe73ec.iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                obj7 = null;
                                break;
                            }
                            obj7 = it10.next();
                            java.lang.String m75945x2fec83075 = ((r45.mb4) obj7).m75945x2fec8307(62);
                            if (m75945x2fec83075 == null) {
                                m75945x2fec83075 = "";
                            }
                            char[] cArr5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(m75945x2fec83075.getBytes()), eVar12.x(str))) {
                                break;
                            }
                        }
                        r45.mb4 mb4Var7 = (r45.mb4) obj7;
                        if (mb4Var7 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f448470d.s(), "upload shareCoverUrl ok, url:" + hVar.f69524x419c440e);
                            mb4Var7.set(65, hVar.f69524x419c440e);
                        }
                        qv2.e eVar13 = this.f448470d;
                        java.lang.String str4 = hVar.f69524x419c440e;
                        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016664 = eVar13.f448471h.getFeedObject().m76802x2dd01666();
                        r45.iy5 iy5Var = (m76802x2dd016664 == null || (m76980xaa7f977e = m76802x2dd016664.m76980xaa7f977e()) == null) ? null : m76980xaa7f977e.f465125n;
                        if (iy5Var != null && (linkedList = iy5Var.f458945d) != null) {
                            java.util.Iterator it11 = linkedList.iterator();
                            while (true) {
                                if (!it11.hasNext()) {
                                    break;
                                }
                                java.lang.Object next = it11.next();
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a((java.lang.String) next), eVar13.x(str))) {
                                    obj = next;
                                    break;
                                }
                            }
                            java.lang.String str5 = (java.lang.String) obj;
                            if (str5 != null) {
                                linkedList.set(linkedList.indexOf(str5), str4 != null ? str4 : "");
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar13.s(), "handleTemplateScyThumb target:" + str5 + " to mediaId:" + str);
                            }
                        }
                        this.f448470d.y();
                    }
                    if (size == 0) {
                        this.f448470d.C(true, true);
                        qv2.e eVar14 = this.f448470d;
                        eVar14.z(eVar14.q());
                    }
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
