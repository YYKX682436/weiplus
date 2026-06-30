package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

/* loaded from: classes8.dex */
public final class k8 implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va, zy2.ga {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x9 f187163a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ua f187164b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f187165c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f187166d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f187167e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f187168f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f187169g;

    public k8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.x9 manager, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.ua freqController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(freqController, "freqController");
        this.f187163a = manager;
        this.f187164b = freqController;
        this.f187165c = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.i8.f187129d);
        this.f187166d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g8(this));
        this.f187167e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.j8(this));
        this.f187168f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.e8.f187030d);
        this.f187169g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.h8.f187088d);
    }

    public final int A(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80 Kj = ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
        int L0 = Kj.L0(2, 2, str2);
        int L02 = Kj.L0(2, 1, str2);
        m92.b j37 = g92.a.j3(g92.b.f351302e, str2, false, 2, null);
        int i17 = j37 != null ? j37.f68721x6e5f342 : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", str + " finderUsername:" + str2 + ",unReadCount=" + L0 + ",hiCount=" + L02 + ",unReadTeamCount=" + i17);
        return L0 + i17;
    }

    public final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B() {
        return (java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock) ((jz5.n) this.f187166d).mo141623x754a37bb();
    }

    public final java.util.HashMap C() {
        return (java.util.HashMap) ((jz5.n) this.f187169g).mo141623x754a37bb();
    }

    public final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D() {
        return (java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock) ((jz5.n) this.f187167e).mo141623x754a37bb();
    }

    public final java.lang.String E(bw5.dv dvVar) {
        if (dvVar == null) {
            return "NULL";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("curCtrlId=");
        boolean[] zArr = dvVar.f108162h;
        sb6.append(zArr[1] ? dvVar.f108158d : "");
        sb6.append(",lastCtrlId=");
        sb6.append(zArr[2] ? dvVar.f108159e : "");
        sb6.append(",addPath=");
        sb6.append(dvVar.f108160f);
        sb6.append(",removePath=");
        sb6.append(dvVar.f108161g);
        return sb6.toString();
    }

    public final void F(java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", str + " read lock");
        readLock.lock();
    }

    public final void G(java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", str + " write lock");
        writeLock.lock();
    }

    public final void H(java.lang.String str, bw5.e0 e0Var) {
        boolean z17;
        java.lang.String str2;
        java.util.LinkedList<bw5.vy> linkedList = e0Var.b().f108600g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getShowInfos(...)");
        if (!linkedList.isEmpty()) {
            for (bw5.vy vyVar : linkedList) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vyVar.N[6] ? vyVar.f116047i : "", str)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            java.util.LinkedList<bw5.vy> linkedList2 = e0Var.b().f108600g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList2, "getShowInfos(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
            for (bw5.vy vyVar2 : linkedList2) {
                bw5.ry ryVar = vyVar2.N[22] ? vyVar2.B : new bw5.ry();
                java.util.LinkedList<bw5.hy> linkedList3 = (ryVar.f114236f[1] ? ryVar.f114234d : new bw5.iy()).f110255d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList3, "getNodes(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList3, 10));
                for (bw5.hy hyVar : linkedList3) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("style=");
                    sb6.append(hyVar.f109922g[1] ? hyVar.f109919d : bw5.jx.FinderTabTipsDSLRenderNodeStyle_Unknown);
                    sb6.append(",iconSize=");
                    boolean[] zArr = hyVar.f109922g;
                    bw5.ey eyVar = zArr[3] ? hyVar.f109921f : new bw5.ey();
                    bw5.ay ayVar = eyVar.f108628f[2] ? eyVar.f108627e : new bw5.ay();
                    sb6.append((ayVar.f106992o[7] ? ayVar.f106990m : new bw5.wx()).f116400d);
                    sb6.append('*');
                    bw5.ey eyVar2 = zArr[3] ? hyVar.f109921f : new bw5.ey();
                    bw5.ay ayVar2 = eyVar2.f108628f[2] ? eyVar2.f108627e : new bw5.ay();
                    sb6.append((ayVar2.f106992o[7] ? ayVar2.f106990m : new bw5.wx()).f116401e);
                    sb6.append(",content=");
                    bw5.gy gyVar = zArr[2] ? hyVar.f109920e : new bw5.gy();
                    if (gyVar != null) {
                        bw5.fy fyVar = gyVar.f109553g[1] ? gyVar.f109550d : new bw5.fy();
                        if (fyVar != null) {
                            str2 = fyVar.f109096h[1] ? fyVar.f109092d : "";
                            sb6.append(str2);
                            arrayList2.add(sb6.toString());
                        }
                    }
                    str2 = null;
                    sb6.append(str2);
                    arrayList2.add(sb6.toString());
                }
                arrayList.add(arrayList2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "printDetailInfo " + str + " affCtrlInfo=" + hc2.a.a(e0Var) + ",showInfoDetail " + arrayList);
        }
    }

    public final void I(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        r45.fz2 fz2Var;
        java.util.LinkedList<r45.cp5> linkedList;
        r45.x80 x80Var;
        r45.lp lpVar;
        r45.uy3 uy3Var;
        r45.lp lpVar2;
        r45.uy3 uy3Var2;
        if (jbVar.y0(str)) {
            java.util.List L0 = jbVar.L0();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(L0, 10));
            java.util.Iterator it = L0.iterator();
            while (it.hasNext()) {
                r45.ya0 ya0Var = ((r45.f03) it.next()).B;
                java.util.ArrayList arrayList2 = null;
                if (ya0Var != null && (fz2Var = ya0Var.f472451d) != null && (linkedList = fz2Var.f456274d) != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                    for (r45.cp5 cp5Var : linkedList) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("style=");
                        sb6.append(cp5Var.f453301d);
                        sb6.append(",iconSize=");
                        r45.yo5 yo5Var = cp5Var.f453303f;
                        sb6.append((yo5Var == null || (lpVar2 = yo5Var.f472795e) == null || (uy3Var2 = lpVar2.f461224m) == null) ? null : java.lang.Integer.valueOf(uy3Var2.f469267d));
                        sb6.append('*');
                        r45.yo5 yo5Var2 = cp5Var.f453303f;
                        sb6.append((yo5Var2 == null || (lpVar = yo5Var2.f472795e) == null || (uy3Var = lpVar.f461224m) == null) ? null : java.lang.Integer.valueOf(uy3Var.f469268e));
                        sb6.append(",content=");
                        r45.ap5 ap5Var = cp5Var.f453302e;
                        if (ap5Var == null || (x80Var = ap5Var.f451709d) == null) {
                            x80Var = ap5Var != null ? ap5Var.f451711f : null;
                        }
                        sb6.append(x80Var != null ? x80Var.f471386d : null);
                        arrayList3.add(sb6.toString());
                    }
                    arrayList2 = arrayList3;
                }
                arrayList.add(arrayList2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "printDetailInfo locCtrlInfo=" + jbVar + ",showInfoDetail=" + arrayList);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb a(java.lang.String path, java.lang.String tipsUuid, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsUuid, "tipsUuid");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "<get-readLock>(...)");
        F(B, "getByTipsUuid_".concat(path));
        try {
            bw5.e0 m112887xd7a64252 = z().m112887xd7a64252(tipsUuid);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "getByTipsUuid " + hc2.a.a(m112887xd7a64252));
            return hc2.a.b(m112887xd7a64252);
        } finally {
            B().unlock();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public boolean b(java.lang.String path, java.util.List ctrlTypeList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlTypeList, "ctrlTypeList");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "<get-readLock>(...)");
        F(B, "haveCtrlTypeAtPath_".concat(path));
        try {
            return ctrlTypeList.contains(java.lang.Integer.valueOf(z().m112886x74a3716b(path)));
        } finally {
            B().unlock();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb c(java.lang.String str) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "<get-readLock>(...)");
        F(B, "findByRevokeId");
        try {
            java.util.ArrayList<bw5.e0> m112905xc8b9c0cc = z().m112905xc8b9c0cc(str);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("findByRevokeId revokeId=");
            sb6.append(str);
            sb6.append(" redDotList=");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m112905xc8b9c0cc);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m112905xc8b9c0cc, 10));
            java.util.Iterator<T> it = m112905xc8b9c0cc.iterator();
            while (it.hasNext()) {
                arrayList.add(hc2.a.a((bw5.e0) it.next()));
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
            bw5.e0 e0Var = (bw5.e0) kz5.n0.k0(m112905xc8b9c0cc);
            return e0Var != null ? hc2.a.b(e0Var) : null;
        } finally {
            B().unlock();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.HashMap d(java.lang.String username, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "<get-readLock>(...)");
        F(B, "collectFindTabRedDot");
        try {
            return y(list);
        } finally {
            B().unlock();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.HashSet e(int i17, java.lang.String username, yz5.l filter) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "filter");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D = D();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "<get-writeLock>(...)");
        G(D, "clearCtrlInfo_type" + i17);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.f8 f8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.f8(username, i17, filter);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(f8Var.hashCode());
            sb6.append('_');
            sb6.append(android.os.SystemClock.elapsedRealtime());
            java.lang.String sb7 = sb6.toString();
            boolean z18 = true;
            if (sb7.length() > 0) {
                C().put(sb7, new java.lang.ref.WeakReference(f8Var));
            }
            if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                z17 = false;
            }
            if (!z17 && !z65.c.a()) {
                kb2.b bVar = kb2.b.f387758a;
                z18 = false;
            }
            if (z18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "before clearCtrlInfo uuid=" + sb7 + " type=" + i17 + " username=" + username);
            }
            java.util.ArrayList<java.lang.String> m112880x8ad46d6f = z().m112880x8ad46d6f(sb7, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "clearCtrlInfo uuid=" + sb7 + " type=" + i17 + " username=" + username + ", removePathList=" + m112880x8ad46d6f);
            C().remove(sb7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m112880x8ad46d6f);
            return kz5.n0.Q0(m112880x8ad46d6f);
        } finally {
            D().unlock();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.LinkedList f(int i17, java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "<get-readLock>(...)");
        F(B, "getAllCtrlInfoAtType");
        try {
            java.util.ArrayList<bw5.e0> m112902xa4ef9d49 = z().m112902xa4ef9d49(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m112902xa4ef9d49, "getAllRedDotCtrlInfoAtType(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = m112902xa4ef9d49.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb b17 = hc2.a.b((bw5.e0) it.next());
                if (b17 != null) {
                    arrayList.add(b17);
                }
            }
            return new java.util.LinkedList(arrayList);
        } finally {
            B().unlock();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public void g(java.lang.String groupId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupId, "groupId");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D = D();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "<get-writeLock>(...)");
        G(D, "clearCtrlInfoByGroupId_".concat(groupId));
        try {
            java.util.ArrayList<bw5.e0> m112892x87b3c23c = z().m112892x87b3c23c(groupId);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("clearCtrlInfoByGroupId ");
            sb6.append(groupId);
            sb6.append(",disposeCtrlInfoList=");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m112892x87b3c23c);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m112892x87b3c23c, 10));
            java.util.Iterator<T> it = m112892x87b3c23c.iterator();
            while (it.hasNext()) {
                arrayList.add(hc2.a.a((bw5.e0) it.next()));
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
            java.util.Iterator<T> it6 = m112892x87b3c23c.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb b17 = hc2.a.b((bw5.e0) it6.next());
                if (b17 != null) {
                    p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) a17).W6(b17, false);
                }
            }
        } finally {
            D().unlock();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public boolean h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo, java.lang.String path, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        boolean l17 = ctrlInfo.l1(path, j17, z17);
        if (l17) {
            r(ctrlInfo);
        }
        return l17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb i(java.lang.String path, java.lang.String str, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "<get-readLock>(...)");
        F(B, "ctrlInfoAtPath_".concat(path));
        try {
            boolean z19 = true;
            if (path.length() == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ctrlInfoAtPath path=");
                sb6.append(path);
                sb6.append(" username=");
                sb6.append(str);
                sb6.append(", checkFreqCtrl=");
                sb6.append(z17);
                sb6.append(", checkExposeLimit=");
                sb6.append(z18);
                sb6.append(',');
                boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                sb6.append(new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
                B().unlock();
                return null;
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27313x6c9c5175 z28 = z();
            if (z17 || z18) {
                z19 = false;
            }
            bw5.e0 m112890x8beac6dc = z28.m112890x8beac6dc(path, z19);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m112890x8beac6dc);
            H("Game.Entrance", m112890x8beac6dc);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "ctrlInfoAtPath " + path + " username=" + str + ", checkFreqCtrl=" + z17 + ", checkExposeLimit=" + z18 + ",affCtrlInfo=" + hc2.a.a(m112890x8beac6dc));
            return hc2.a.b(m112890x8beac6dc);
        } finally {
            B().unlock();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public void j() {
        this.f187163a.m1("onAccountChange");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public void k(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 swipeView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(swipeView, "swipeView");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "<get-readLock>(...)");
        F(B, "checkSwipeDownRevoke");
        try {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = swipeView.getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de == null) {
                return;
            }
            int x17 = c1162x665295de.x();
            z().m112911xf6b55130(x17, hc2.d0.b(i17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "checkSwipeDownRevoke pos=" + x17 + " curTabType=" + i17);
        } finally {
            B().unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x022d, code lost:
    
        if (r3.size() > 0) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Set l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb r21, r45.f03 r22, r45.ut2 r23) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k8.l(com.tencent.mm.plugin.finder.extension.reddot.jb, r45.f03, r45.ut2):java.util.Set");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.HashSet m(java.lang.String source, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo, java.lang.String path, boolean z17, java.lang.String username, yz5.l call) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(call, "call");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D = D();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "<get-writeLock>(...)");
        G(D, source.concat("_removeShowInfoWithCondition"));
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(call.hashCode());
            sb6.append('_');
            sb6.append(android.os.SystemClock.elapsedRealtime());
            java.lang.String sb7 = sb6.toString();
            if (sb7.length() > 0) {
                C().put(sb7, new java.lang.ref.WeakReference(call));
            }
            java.util.ArrayList<java.lang.String> m112885x1c778d9e = z().m112885x1c778d9e(path, ctrlInfo.f65882x5364c75d, false, sb7, z17);
            C().remove(sb7);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "removeShowInfoWithCondition uuid=" + sb7 + " path=" + path + " removePathList=" + m112885x1c778d9e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m112885x1c778d9e);
            return kz5.n0.Q0(m112885x1c778d9e);
        } finally {
            D().unlock();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.List n(java.lang.String path, java.lang.String finderUserName, boolean z17, boolean z18) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUserName, "finderUserName");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "<get-readLock>(...)");
        F(B, "ctrlInfoListAtPath_".concat(path));
        try {
            java.util.ArrayList<bw5.e0> m112901xa4ed7234 = z().m112901xa4ed7234(path);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("ctrlInfoListAtPath path=");
            sb6.append(path);
            sb6.append(" affRedDotList=");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m112901xa4ed7234);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m112901xa4ed7234, 10));
            java.util.Iterator<T> it = m112901xa4ed7234.iterator();
            while (it.hasNext()) {
                arrayList2.add(hc2.a.a((bw5.e0) it.next()));
            }
            sb6.append(arrayList2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<T> it6 = m112901xa4ed7234.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb b17 = hc2.a.b((bw5.e0) it6.next());
                if (b17 != null) {
                    arrayList3.add(b17);
                }
            }
            if (z17) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList3) {
                    if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187164b).C(path, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) obj)) {
                        arrayList4.add(obj);
                    }
                }
                arrayList = arrayList4;
            } else {
                arrayList = arrayList3;
            }
            java.util.List g17 = this.f187163a.g1("ctrlInfoAtPath", arrayList, path, z17, z18);
            if (g17 == null) {
                g17 = kz5.p0.f395529d;
            }
            return g17;
        } finally {
            B().unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0022 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #0 {all -> 0x001d, blocks: (B:15:0x0014, B:5:0x0022, B:9:0x003b), top: B:14:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[Catch: all -> 0x001d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x001d, blocks: (B:15:0x0014, B:5:0x0022, B:9:0x003b), top: B:14:0x0014 }] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean o(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "haveRedDot tipsUuid:"
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r4.B()
            java.lang.String r2 = "<get-readLock>(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)
            java.lang.String r2 = "haveRedDot"
            r4.F(r1, r2)
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L1f
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L1d
            if (r3 != 0) goto L1b
            goto L1f
        L1b:
            r3 = r2
            goto L20
        L1d:
            r5 = move-exception
            goto L53
        L1f:
            r3 = r1
        L20:
            if (r3 == 0) goto L3b
            java.lang.String r1 = "Finder.RedDotManagerCrossPlatformAff"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1d
            r3.append(r5)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L1d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r5)     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.B()
            r5.unlock()
            return r2
        L3b:
            com.tencent.wechat.aff.finder.RedDotManager r0 = r4.z()     // Catch: java.lang.Throwable -> L1d
            bw5.e0 r5 = r0.m112887xd7a64252(r5)     // Catch: java.lang.Throwable -> L1d
            com.tencent.mm.plugin.finder.extension.reddot.jb r5 = hc2.a.b(r5)     // Catch: java.lang.Throwable -> L1d
            if (r5 == 0) goto L4a
            goto L4b
        L4a:
            r1 = r2
        L4b:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.B()
            r5.unlock()
            return r1
        L53:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.B()
            r0.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.k8.o(java.lang.String):boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public jz5.l p(java.lang.String source, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D = D();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "<get-writeLock>(...)");
        G(D, source.concat("_addNewRedDot"));
        try {
            I("Game.Entrance", info);
            bw5.e0 r17 = info.r1();
            bw5.dv m112877x72f09c93 = z().m112877x72f09c93(false, r17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", source + " addNewRedDot source=$" + hc2.a.a(r17) + ", result = " + E(m112877x72f09c93));
            java.util.LinkedList linkedList = m112877x72f09c93.f108160f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getAddPath(...)");
            java.util.HashSet Q0 = kz5.n0.Q0(linkedList);
            java.util.LinkedList linkedList2 = m112877x72f09c93.f108161g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList2, "getRemovePath(...)");
            return new jz5.l(Q0, kz5.n0.Q0(linkedList2));
        } finally {
            D().unlock();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.List q(java.lang.String source, yz5.l freqControl) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(freqControl, "freqControl");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D = D();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "<get-writeLock>(...)");
        G(D, source.concat("_loadCtrlInfoFromDB"));
        try {
            cu2.k0 lk6 = ((c61.l7) i95.n0.c(c61.l7.class)).lk();
            java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb> a17 = lk6 != null ? lk6.a() : null;
            if (lk6 != null) {
                lk6.d(a17);
            }
            int i17 = 0;
            if (a17 != null) {
                for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar : a17) {
                    I("Game.Entrance", jbVar);
                    bw5.e0 r17 = jbVar.r1();
                    if (r17 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", "loadCtrlInfoFromDB source ctrlInfo:" + hc2.a.a(r17) + ",addNewRedDotCtrlInfoWithResult " + E(z().m112877x72f09c93(false, r17)));
                        f0Var = jz5.f0.f384359a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.RedDotManagerCrossPlatformAff", "loadCtrlInfoFromDB but " + jbVar + " is null!");
                    }
                }
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.ArrayList<bw5.dv> m112907xe3941b7 = z().m112907xe3941b7(false, g92.b.f351302e.T0());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(source);
            sb6.append(" loadCtrlInfoFromDB ");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m112907xe3941b7);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m112907xe3941b7, 10));
            java.util.Iterator<T> it = m112907xe3941b7.iterator();
            while (it.hasNext()) {
                arrayList.add(E((bw5.dv) it.next()));
            }
            sb6.append(arrayList);
            sb6.append(";\t");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(sb6.toString());
            for (java.lang.Object obj : m112907xe3941b7) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                bw5.dv dvVar = (bw5.dv) obj;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb b17 = hc2.a.b(z().m112887xd7a64252(dvVar.f108162h[1] ? dvVar.f108158d : ""));
                if (b17 != null) {
                    sb7.append("[index" + i17 + ": " + hc2.u0.e(b17.f65874xb5f7102a) + "] ");
                    java.util.HashSet hashSet = new java.util.HashSet(dvVar.f108160f);
                    freqControl.mo146xb9724478(hashSet);
                    linkedList.add(new jz5.l(b17, hashSet));
                } else {
                    sb7.append("affCtrlInfo to local is null!");
                }
                i17 = i18;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", sb7.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.h1 h1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.h1.f187077a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                arrayList2.add((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb) ((jz5.l) it6.next()).f384366d);
            }
            h1Var.a(new java.util.LinkedList(arrayList2));
            return linkedList;
        } finally {
            D().unlock();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D = D();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "<get-writeLock>(...)");
        G(D, "syncCtrInfo");
        try {
            z().m112917x13ca2174(ctrlInfo.r1());
        } finally {
            D().unlock();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.HashSet s(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrInfo, "ctrInfo");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D = D();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "<get-writeLock>(...)");
        G(D, "removeCtrlInfo");
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeCtrlInfo ");
            java.util.HashSet hashSet = new java.util.HashSet();
            for (java.lang.String str : ctrInfo.J0()) {
                java.util.ArrayList<bw5.e0> m112881xb4886dd1 = z().m112881xb4886dd1(str, ctrInfo.f65882x5364c75d, false);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append("path=");
                sb7.append(str);
                sb7.append(",result=");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m112881xb4886dd1);
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m112881xb4886dd1, 10));
                java.util.Iterator<T> it = m112881xb4886dd1.iterator();
                while (it.hasNext()) {
                    arrayList.add(hc2.a.a((bw5.e0) it.next()));
                }
                sb7.append(arrayList);
                sb7.append(';');
                sb6.append(sb7.toString());
                hashSet.add(str);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
            return hashSet;
        } finally {
            D().unlock();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public void t(java.lang.String removePath, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(removePath, "removePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.Set u() {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(B, "<get-readLock>(...)");
        F(B, "copyAllCtrlInfo");
        try {
            java.util.ArrayList<bw5.e0> m112899x67f8d006 = z().m112899x67f8d006();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("copyAllCtrlInfo ");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m112899x67f8d006);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m112899x67f8d006, 10));
            java.util.Iterator<T> it = m112899x67f8d006.iterator();
            while (it.hasNext()) {
                arrayList.add(hc2.a.a((bw5.e0) it.next()));
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it6 = m112899x67f8d006.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb b17 = hc2.a.b((bw5.e0) it6.next());
                if (b17 != null) {
                    arrayList2.add(b17);
                }
            }
            return kz5.n0.X0(arrayList2);
        } finally {
            B().unlock();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public void v() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public void w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.va
    public java.util.Map x() {
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D = D();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "<get-writeLock>(...)");
        G(D, "removeAllCtrlInfo");
        try {
            java.util.ArrayList<bw5.e0> m112899x67f8d006 = z().m112899x67f8d006();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("removeAllCtrlInfo affRedDotList=");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m112899x67f8d006);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m112899x67f8d006, 10));
            java.util.Iterator<T> it = m112899x67f8d006.iterator();
            while (it.hasNext()) {
                arrayList.add(hc2.a.a((bw5.e0) it.next()));
            }
            sb6.append(arrayList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
            z().m112879x6dcc3afa();
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb> arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it6 = m112899x67f8d006.iterator();
            while (it6.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb b17 = hc2.a.b((bw5.e0) it6.next());
                if (b17 != null) {
                    arrayList2.add(b17);
                }
            }
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar : arrayList2) {
                for (java.lang.String str : jbVar.J0()) {
                    java.lang.Object obj = hashMap.get(str);
                    if (obj == null) {
                        obj = new java.util.LinkedList();
                        hashMap.put(str, obj);
                    }
                    ((java.util.LinkedList) obj).add(jbVar);
                }
            }
            return hashMap;
        } finally {
            D().unlock();
        }
    }

    public final java.util.HashMap y(java.util.List list) {
        java.util.HashMap hashMap = null;
        for (java.lang.String str : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5.H.e()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb b17 = hc2.a.b(z().m112890x8beac6dc(str, true));
            if (b17 != null) {
                if ((list != null && list.contains(str)) || !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l5) this.f187164b).C(str, b17)) {
                    if (hashMap == null) {
                        hashMap = new java.util.HashMap();
                    }
                }
            }
        }
        return hashMap;
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27313x6c9c5175 z() {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27313x6c9c5175) ((jz5.n) this.f187168f).mo141623x754a37bb();
    }
}
