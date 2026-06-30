package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class k8 implements com.tencent.mm.plugin.finder.extension.reddot.va, zy2.ga {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.x9 f105630a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.ua f105631b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f105632c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f105633d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f105634e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f105635f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f105636g;

    public k8(com.tencent.mm.plugin.finder.extension.reddot.x9 manager, com.tencent.mm.plugin.finder.extension.reddot.ua freqController) {
        kotlin.jvm.internal.o.g(manager, "manager");
        kotlin.jvm.internal.o.g(freqController, "freqController");
        this.f105630a = manager;
        this.f105631b = freqController;
        this.f105632c = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.i8.f105596d);
        this.f105633d = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.g8(this));
        this.f105634e = jz5.h.b(new com.tencent.mm.plugin.finder.extension.reddot.j8(this));
        this.f105635f = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.e8.f105497d);
        this.f105636g = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.h8.f105555d);
    }

    public final int A(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.finder.storage.t80 Kj = ((c61.l7) i95.n0.c(c61.l7.class)).Kj();
        int L0 = Kj.L0(2, 2, str2);
        int L02 = Kj.L0(2, 1, str2);
        m92.b j37 = g92.a.j3(g92.b.f269769e, str2, false, 2, null);
        int i17 = j37 != null ? j37.field_systemMsgCount : 0;
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", str + " finderUsername:" + str2 + ",unReadCount=" + L0 + ",hiCount=" + L02 + ",unReadTeamCount=" + i17);
        return L0 + i17;
    }

    public final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B() {
        return (java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock) ((jz5.n) this.f105633d).getValue();
    }

    public final java.util.HashMap C() {
        return (java.util.HashMap) ((jz5.n) this.f105636g).getValue();
    }

    public final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D() {
        return (java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock) ((jz5.n) this.f105634e).getValue();
    }

    public final java.lang.String E(bw5.dv dvVar) {
        if (dvVar == null) {
            return "NULL";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("curCtrlId=");
        boolean[] zArr = dvVar.f26629h;
        sb6.append(zArr[1] ? dvVar.f26625d : "");
        sb6.append(",lastCtrlId=");
        sb6.append(zArr[2] ? dvVar.f26626e : "");
        sb6.append(",addPath=");
        sb6.append(dvVar.f26627f);
        sb6.append(",removePath=");
        sb6.append(dvVar.f26628g);
        return sb6.toString();
    }

    public final void F(java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", str + " read lock");
        readLock.lock();
    }

    public final void G(java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", str + " write lock");
        writeLock.lock();
    }

    public final void H(java.lang.String str, bw5.e0 e0Var) {
        boolean z17;
        java.lang.String str2;
        java.util.LinkedList<bw5.vy> linkedList = e0Var.b().f27067g;
        kotlin.jvm.internal.o.f(linkedList, "getShowInfos(...)");
        if (!linkedList.isEmpty()) {
            for (bw5.vy vyVar : linkedList) {
                if (kotlin.jvm.internal.o.b(vyVar.N[6] ? vyVar.f34514i : "", str)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            java.util.LinkedList<bw5.vy> linkedList2 = e0Var.b().f27067g;
            kotlin.jvm.internal.o.f(linkedList2, "getShowInfos(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
            for (bw5.vy vyVar2 : linkedList2) {
                bw5.ry ryVar = vyVar2.N[22] ? vyVar2.B : new bw5.ry();
                java.util.LinkedList<bw5.hy> linkedList3 = (ryVar.f32703f[1] ? ryVar.f32701d : new bw5.iy()).f28722d;
                kotlin.jvm.internal.o.f(linkedList3, "getNodes(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList3, 10));
                for (bw5.hy hyVar : linkedList3) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("style=");
                    sb6.append(hyVar.f28389g[1] ? hyVar.f28386d : bw5.jx.FinderTabTipsDSLRenderNodeStyle_Unknown);
                    sb6.append(",iconSize=");
                    boolean[] zArr = hyVar.f28389g;
                    bw5.ey eyVar = zArr[3] ? hyVar.f28388f : new bw5.ey();
                    bw5.ay ayVar = eyVar.f27095f[2] ? eyVar.f27094e : new bw5.ay();
                    sb6.append((ayVar.f25459o[7] ? ayVar.f25457m : new bw5.wx()).f34867d);
                    sb6.append('*');
                    bw5.ey eyVar2 = zArr[3] ? hyVar.f28388f : new bw5.ey();
                    bw5.ay ayVar2 = eyVar2.f27095f[2] ? eyVar2.f27094e : new bw5.ay();
                    sb6.append((ayVar2.f25459o[7] ? ayVar2.f25457m : new bw5.wx()).f34868e);
                    sb6.append(",content=");
                    bw5.gy gyVar = zArr[2] ? hyVar.f28387e : new bw5.gy();
                    if (gyVar != null) {
                        bw5.fy fyVar = gyVar.f28020g[1] ? gyVar.f28017d : new bw5.fy();
                        if (fyVar != null) {
                            str2 = fyVar.f27563h[1] ? fyVar.f27559d : "";
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
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "printDetailInfo " + str + " affCtrlInfo=" + hc2.a.a(e0Var) + ",showInfoDetail " + arrayList);
        }
    }

    public final void I(java.lang.String str, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
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
                if (ya0Var != null && (fz2Var = ya0Var.f390918d) != null && (linkedList = fz2Var.f374741d) != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                    for (r45.cp5 cp5Var : linkedList) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("style=");
                        sb6.append(cp5Var.f371768d);
                        sb6.append(",iconSize=");
                        r45.yo5 yo5Var = cp5Var.f371770f;
                        sb6.append((yo5Var == null || (lpVar2 = yo5Var.f391262e) == null || (uy3Var2 = lpVar2.f379691m) == null) ? null : java.lang.Integer.valueOf(uy3Var2.f387734d));
                        sb6.append('*');
                        r45.yo5 yo5Var2 = cp5Var.f371770f;
                        sb6.append((yo5Var2 == null || (lpVar = yo5Var2.f391262e) == null || (uy3Var = lpVar.f379691m) == null) ? null : java.lang.Integer.valueOf(uy3Var.f387735e));
                        sb6.append(",content=");
                        r45.ap5 ap5Var = cp5Var.f371769e;
                        if (ap5Var == null || (x80Var = ap5Var.f370176d) == null) {
                            x80Var = ap5Var != null ? ap5Var.f370178f : null;
                        }
                        sb6.append(x80Var != null ? x80Var.f389853d : null);
                        arrayList3.add(sb6.toString());
                    }
                    arrayList2 = arrayList3;
                }
                arrayList.add(arrayList2);
            }
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "printDetailInfo locCtrlInfo=" + jbVar + ",showInfoDetail=" + arrayList);
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public com.tencent.mm.plugin.finder.extension.reddot.jb a(java.lang.String path, java.lang.String tipsUuid, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(tipsUuid, "tipsUuid");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        kotlin.jvm.internal.o.f(B, "<get-readLock>(...)");
        F(B, "getByTipsUuid_".concat(path));
        try {
            bw5.e0 ctrlInfoWithTipsUuid = z().ctrlInfoWithTipsUuid(tipsUuid);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "getByTipsUuid " + hc2.a.a(ctrlInfoWithTipsUuid));
            return hc2.a.b(ctrlInfoWithTipsUuid);
        } finally {
            B().unlock();
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public boolean b(java.lang.String path, java.util.List ctrlTypeList) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(ctrlTypeList, "ctrlTypeList");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        kotlin.jvm.internal.o.f(B, "<get-readLock>(...)");
        F(B, "haveCtrlTypeAtPath_".concat(path));
        try {
            return ctrlTypeList.contains(java.lang.Integer.valueOf(z().ctrlInfoTypeAtPath(path)));
        } finally {
            B().unlock();
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public com.tencent.mm.plugin.finder.extension.reddot.jb c(java.lang.String str) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        kotlin.jvm.internal.o.f(B, "<get-readLock>(...)");
        F(B, "findByRevokeId");
        try {
            java.util.ArrayList<bw5.e0> redDotCtrlInfoListWithRevokeId = z().getRedDotCtrlInfoListWithRevokeId(str);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("findByRevokeId revokeId=");
            sb6.append(str);
            sb6.append(" redDotList=");
            kotlin.jvm.internal.o.d(redDotCtrlInfoListWithRevokeId);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(redDotCtrlInfoListWithRevokeId, 10));
            java.util.Iterator<T> it = redDotCtrlInfoListWithRevokeId.iterator();
            while (it.hasNext()) {
                arrayList.add(hc2.a.a((bw5.e0) it.next()));
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
            bw5.e0 e0Var = (bw5.e0) kz5.n0.k0(redDotCtrlInfoListWithRevokeId);
            return e0Var != null ? hc2.a.b(e0Var) : null;
        } finally {
            B().unlock();
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.HashMap d(java.lang.String username, java.util.List list) {
        kotlin.jvm.internal.o.g(username, "username");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        kotlin.jvm.internal.o.f(B, "<get-readLock>(...)");
        F(B, "collectFindTabRedDot");
        try {
            return y(list);
        } finally {
            B().unlock();
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.HashSet e(int i17, java.lang.String username, yz5.l filter) {
        boolean z17;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(filter, "filter");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D = D();
        kotlin.jvm.internal.o.f(D, "<get-writeLock>(...)");
        G(D, "clearCtrlInfo_type" + i17);
        try {
            com.tencent.mm.plugin.finder.extension.reddot.f8 f8Var = new com.tencent.mm.plugin.finder.extension.reddot.f8(username, i17, filter);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(f8Var.hashCode());
            sb6.append('_');
            sb6.append(android.os.SystemClock.elapsedRealtime());
            java.lang.String sb7 = sb6.toString();
            boolean z18 = true;
            if (sb7.length() > 0) {
                C().put(sb7, new java.lang.ref.WeakReference(f8Var));
            }
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (!z17 && !z65.c.a()) {
                kb2.b bVar = kb2.b.f306225a;
                z18 = false;
            }
            if (z18) {
                com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "before clearCtrlInfo uuid=" + sb7 + " type=" + i17 + " username=" + username);
            }
            java.util.ArrayList<java.lang.String> clearCtrlInfoWithCondition = z().clearCtrlInfoWithCondition(sb7, false);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "clearCtrlInfo uuid=" + sb7 + " type=" + i17 + " username=" + username + ", removePathList=" + clearCtrlInfoWithCondition);
            C().remove(sb7);
            kotlin.jvm.internal.o.d(clearCtrlInfoWithCondition);
            return kz5.n0.Q0(clearCtrlInfoWithCondition);
        } finally {
            D().unlock();
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.LinkedList f(int i17, java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        kotlin.jvm.internal.o.f(B, "<get-readLock>(...)");
        F(B, "getAllCtrlInfoAtType");
        try {
            java.util.ArrayList<bw5.e0> allRedDotCtrlInfoAtType = z().getAllRedDotCtrlInfoAtType(i17);
            kotlin.jvm.internal.o.f(allRedDotCtrlInfoAtType, "getAllRedDotCtrlInfoAtType(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = allRedDotCtrlInfoAtType.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.finder.extension.reddot.jb b17 = hc2.a.b((bw5.e0) it.next());
                if (b17 != null) {
                    arrayList.add(b17);
                }
            }
            return new java.util.LinkedList(arrayList);
        } finally {
            B().unlock();
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public void g(java.lang.String groupId) {
        kotlin.jvm.internal.o.g(groupId, "groupId");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D = D();
        kotlin.jvm.internal.o.f(D, "<get-writeLock>(...)");
        G(D, "clearCtrlInfoByGroupId_".concat(groupId));
        try {
            java.util.ArrayList<bw5.e0> disposeGroupTipsWithGroupId = z().disposeGroupTipsWithGroupId(groupId);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("clearCtrlInfoByGroupId ");
            sb6.append(groupId);
            sb6.append(",disposeCtrlInfoList=");
            kotlin.jvm.internal.o.d(disposeGroupTipsWithGroupId);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(disposeGroupTipsWithGroupId, 10));
            java.util.Iterator<T> it = disposeGroupTipsWithGroupId.iterator();
            while (it.hasNext()) {
                arrayList.add(hc2.a.a((bw5.e0) it.next()));
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
            java.util.Iterator<T> it6 = disposeGroupTipsWithGroupId.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.finder.extension.reddot.jb b17 = hc2.a.b((bw5.e0) it6.next());
                if (b17 != null) {
                    androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class);
                    kotlin.jvm.internal.o.f(a17, "get(...)");
                    ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) a17).W6(b17, false);
                }
            }
        } finally {
            D().unlock();
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public boolean h(com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo, java.lang.String path, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        kotlin.jvm.internal.o.g(path, "path");
        boolean l17 = ctrlInfo.l1(path, j17, z17);
        if (l17) {
            r(ctrlInfo);
        }
        return l17;
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public com.tencent.mm.plugin.finder.extension.reddot.jb i(java.lang.String path, java.lang.String str, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(path, "path");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        kotlin.jvm.internal.o.f(B, "<get-readLock>(...)");
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
                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                sb6.append(new com.tencent.mm.sdk.platformtools.z3());
                com.tencent.mars.xlog.Log.e("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
                B().unlock();
                return null;
            }
            com.tencent.wechat.aff.finder.RedDotManager z28 = z();
            if (z17 || z18) {
                z19 = false;
            }
            bw5.e0 currentCtrlInfoIgnoreAtPath = z28.currentCtrlInfoIgnoreAtPath(path, z19);
            kotlin.jvm.internal.o.d(currentCtrlInfoIgnoreAtPath);
            H("Game.Entrance", currentCtrlInfoIgnoreAtPath);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "ctrlInfoAtPath " + path + " username=" + str + ", checkFreqCtrl=" + z17 + ", checkExposeLimit=" + z18 + ",affCtrlInfo=" + hc2.a.a(currentCtrlInfoIgnoreAtPath));
            return hc2.a.b(currentCtrlInfoIgnoreAtPath);
        } finally {
            B().unlock();
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public void j() {
        this.f105630a.m1("onAccountChange");
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public void k(androidx.recyclerview.widget.RecyclerView swipeView, int i17) {
        kotlin.jvm.internal.o.g(swipeView, "swipeView");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        kotlin.jvm.internal.o.f(B, "<get-readLock>(...)");
        F(B, "checkSwipeDownRevoke");
        try {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = swipeView.getLayoutManager();
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int x17 = linearLayoutManager.x();
            z().revokeRedDotByViewAction(x17, hc2.d0.b(i17));
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "checkSwipeDownRevoke pos=" + x17 + " curTabType=" + i17);
        } finally {
            B().unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x022d, code lost:
    
        if (r3.size() > 0) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Set l(com.tencent.mm.plugin.finder.extension.reddot.jb r21, r45.f03 r22, r45.ut2 r23) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.k8.l(com.tencent.mm.plugin.finder.extension.reddot.jb, r45.f03, r45.ut2):java.util.Set");
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.HashSet m(java.lang.String source, com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo, java.lang.String path, boolean z17, java.lang.String username, yz5.l call) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(call, "call");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D = D();
        kotlin.jvm.internal.o.f(D, "<get-writeLock>(...)");
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
            java.util.ArrayList<java.lang.String> clearShowInfoByPathAndUuid = z().clearShowInfoByPathAndUuid(path, ctrlInfo.field_tips_uuid, false, sb7, z17);
            C().remove(sb7);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "removeShowInfoWithCondition uuid=" + sb7 + " path=" + path + " removePathList=" + clearShowInfoByPathAndUuid);
            kotlin.jvm.internal.o.d(clearShowInfoByPathAndUuid);
            return kz5.n0.Q0(clearShowInfoByPathAndUuid);
        } finally {
            D().unlock();
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.List n(java.lang.String path, java.lang.String finderUserName, boolean z17, boolean z18) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        kotlin.jvm.internal.o.f(B, "<get-readLock>(...)");
        F(B, "ctrlInfoListAtPath_".concat(path));
        try {
            java.util.ArrayList<bw5.e0> allRedDotCtrlInfoAtPath = z().getAllRedDotCtrlInfoAtPath(path);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("ctrlInfoListAtPath path=");
            sb6.append(path);
            sb6.append(" affRedDotList=");
            kotlin.jvm.internal.o.d(allRedDotCtrlInfoAtPath);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(allRedDotCtrlInfoAtPath, 10));
            java.util.Iterator<T> it = allRedDotCtrlInfoAtPath.iterator();
            while (it.hasNext()) {
                arrayList2.add(hc2.a.a((bw5.e0) it.next()));
            }
            sb6.append(arrayList2);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<T> it6 = allRedDotCtrlInfoAtPath.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.finder.extension.reddot.jb b17 = hc2.a.b((bw5.e0) it6.next());
                if (b17 != null) {
                    arrayList3.add(b17);
                }
            }
            if (z17) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList3) {
                    if (!((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105631b).C(path, (com.tencent.mm.plugin.finder.extension.reddot.jb) obj)) {
                        arrayList4.add(obj);
                    }
                }
                arrayList = arrayList4;
            } else {
                arrayList = arrayList3;
            }
            java.util.List g17 = this.f105630a.g1("ctrlInfoAtPath", arrayList, path, z17, z18);
            if (g17 == null) {
                g17 = kz5.p0.f313996d;
            }
            return g17;
        } finally {
            B().unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0022 A[Catch: all -> 0x001d, TRY_LEAVE, TryCatch #0 {all -> 0x001d, blocks: (B:15:0x0014, B:5:0x0022, B:9:0x003b), top: B:14:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[Catch: all -> 0x001d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x001d, blocks: (B:15:0x0014, B:5:0x0022, B:9:0x003b), top: B:14:0x0014 }] */
    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
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
            kotlin.jvm.internal.o.f(r1, r2)
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
            com.tencent.mars.xlog.Log.w(r1, r5)     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r4.B()
            r5.unlock()
            return r2
        L3b:
            com.tencent.wechat.aff.finder.RedDotManager r0 = r4.z()     // Catch: java.lang.Throwable -> L1d
            bw5.e0 r5 = r0.ctrlInfoWithTipsUuid(r5)     // Catch: java.lang.Throwable -> L1d
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.k8.o(java.lang.String):boolean");
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public jz5.l p(java.lang.String source, com.tencent.mm.plugin.finder.extension.reddot.jb info) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(info, "info");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D = D();
        kotlin.jvm.internal.o.f(D, "<get-writeLock>(...)");
        G(D, source.concat("_addNewRedDot"));
        try {
            I("Game.Entrance", info);
            bw5.e0 r17 = info.r1();
            bw5.dv addNewRedDotCtrlInfoWithResult = z().addNewRedDotCtrlInfoWithResult(false, r17);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", source + " addNewRedDot source=$" + hc2.a.a(r17) + ", result = " + E(addNewRedDotCtrlInfoWithResult));
            java.util.LinkedList linkedList = addNewRedDotCtrlInfoWithResult.f26627f;
            kotlin.jvm.internal.o.f(linkedList, "getAddPath(...)");
            java.util.HashSet Q0 = kz5.n0.Q0(linkedList);
            java.util.LinkedList linkedList2 = addNewRedDotCtrlInfoWithResult.f26628g;
            kotlin.jvm.internal.o.f(linkedList2, "getRemovePath(...)");
            return new jz5.l(Q0, kz5.n0.Q0(linkedList2));
        } finally {
            D().unlock();
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.List q(java.lang.String source, yz5.l freqControl) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(freqControl, "freqControl");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D = D();
        kotlin.jvm.internal.o.f(D, "<get-writeLock>(...)");
        G(D, source.concat("_loadCtrlInfoFromDB"));
        try {
            cu2.k0 lk6 = ((c61.l7) i95.n0.c(c61.l7.class)).lk();
            java.util.LinkedList<com.tencent.mm.plugin.finder.extension.reddot.jb> a17 = lk6 != null ? lk6.a() : null;
            if (lk6 != null) {
                lk6.d(a17);
            }
            int i17 = 0;
            if (a17 != null) {
                for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : a17) {
                    I("Game.Entrance", jbVar);
                    bw5.e0 r17 = jbVar.r1();
                    if (r17 != null) {
                        com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", "loadCtrlInfoFromDB source ctrlInfo:" + hc2.a.a(r17) + ",addNewRedDotCtrlInfoWithResult " + E(z().addNewRedDotCtrlInfoWithResult(false, r17)));
                        f0Var = jz5.f0.f302826a;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        com.tencent.mars.xlog.Log.w("Finder.RedDotManagerCrossPlatformAff", "loadCtrlInfoFromDB but " + jbVar + " is null!");
                    }
                }
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.ArrayList<bw5.dv> loadRedDotInfoFromDBWithResult = z().loadRedDotInfoFromDBWithResult(false, g92.b.f269769e.T0());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(source);
            sb6.append(" loadCtrlInfoFromDB ");
            kotlin.jvm.internal.o.d(loadRedDotInfoFromDBWithResult);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(loadRedDotInfoFromDBWithResult, 10));
            java.util.Iterator<T> it = loadRedDotInfoFromDBWithResult.iterator();
            while (it.hasNext()) {
                arrayList.add(E((bw5.dv) it.next()));
            }
            sb6.append(arrayList);
            sb6.append(";\t");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(sb6.toString());
            for (java.lang.Object obj : loadRedDotInfoFromDBWithResult) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                bw5.dv dvVar = (bw5.dv) obj;
                com.tencent.mm.plugin.finder.extension.reddot.jb b17 = hc2.a.b(z().ctrlInfoWithTipsUuid(dvVar.f26629h[1] ? dvVar.f26625d : ""));
                if (b17 != null) {
                    sb7.append("[index" + i17 + ": " + hc2.u0.e(b17.field_ctrInfo) + "] ");
                    java.util.HashSet hashSet = new java.util.HashSet(dvVar.f26627f);
                    freqControl.invoke(hashSet);
                    linkedList.add(new jz5.l(b17, hashSet));
                } else {
                    sb7.append("affCtrlInfo to local is null!");
                }
                i17 = i18;
            }
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", sb7.toString());
            com.tencent.mm.plugin.finder.extension.reddot.h1 h1Var = com.tencent.mm.plugin.finder.extension.reddot.h1.f105544a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                arrayList2.add((com.tencent.mm.plugin.finder.extension.reddot.jb) ((jz5.l) it6.next()).f302833d);
            }
            h1Var.a(new java.util.LinkedList(arrayList2));
            return linkedList;
        } finally {
            D().unlock();
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public void r(com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo) {
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D = D();
        kotlin.jvm.internal.o.f(D, "<get-writeLock>(...)");
        G(D, "syncCtrInfo");
        try {
            z().syncCtrlInfo(ctrlInfo.r1());
        } finally {
            D().unlock();
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.HashSet s(com.tencent.mm.plugin.finder.extension.reddot.jb ctrInfo) {
        kotlin.jvm.internal.o.g(ctrInfo, "ctrInfo");
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D = D();
        kotlin.jvm.internal.o.f(D, "<get-writeLock>(...)");
        G(D, "removeCtrlInfo");
        try {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeCtrlInfo ");
            java.util.HashSet hashSet = new java.util.HashSet();
            for (java.lang.String str : ctrInfo.J0()) {
                java.util.ArrayList<bw5.e0> clearRedDotByPathAndUuid = z().clearRedDotByPathAndUuid(str, ctrInfo.field_tips_uuid, false);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append("path=");
                sb7.append(str);
                sb7.append(",result=");
                kotlin.jvm.internal.o.d(clearRedDotByPathAndUuid);
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(clearRedDotByPathAndUuid, 10));
                java.util.Iterator<T> it = clearRedDotByPathAndUuid.iterator();
                while (it.hasNext()) {
                    arrayList.add(hc2.a.a((bw5.e0) it.next()));
                }
                sb7.append(arrayList);
                sb7.append(';');
                sb6.append(sb7.toString());
                hashSet.add(str);
            }
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
            return hashSet;
        } finally {
            D().unlock();
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public void t(java.lang.String removePath, com.tencent.mm.plugin.finder.extension.reddot.jb ctrlInfo) {
        kotlin.jvm.internal.o.g(removePath, "removePath");
        kotlin.jvm.internal.o.g(ctrlInfo, "ctrlInfo");
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.Set u() {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock B = B();
        kotlin.jvm.internal.o.f(B, "<get-readLock>(...)");
        F(B, "copyAllCtrlInfo");
        try {
            java.util.ArrayList<bw5.e0> allCurRedDotCtrlInfo = z().getAllCurRedDotCtrlInfo();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("copyAllCtrlInfo ");
            kotlin.jvm.internal.o.d(allCurRedDotCtrlInfo);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allCurRedDotCtrlInfo, 10));
            java.util.Iterator<T> it = allCurRedDotCtrlInfo.iterator();
            while (it.hasNext()) {
                arrayList.add(hc2.a.a((bw5.e0) it.next()));
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it6 = allCurRedDotCtrlInfo.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.finder.extension.reddot.jb b17 = hc2.a.b((bw5.e0) it6.next());
                if (b17 != null) {
                    arrayList2.add(b17);
                }
            }
            return kz5.n0.X0(arrayList2);
        } finally {
            B().unlock();
        }
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public void v() {
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public void w(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
    }

    @Override // com.tencent.mm.plugin.finder.extension.reddot.va
    public java.util.Map x() {
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock D = D();
        kotlin.jvm.internal.o.f(D, "<get-writeLock>(...)");
        G(D, "removeAllCtrlInfo");
        try {
            java.util.ArrayList<bw5.e0> allCurRedDotCtrlInfo = z().getAllCurRedDotCtrlInfo();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("removeAllCtrlInfo affRedDotList=");
            kotlin.jvm.internal.o.d(allCurRedDotCtrlInfo);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(allCurRedDotCtrlInfo, 10));
            java.util.Iterator<T> it = allCurRedDotCtrlInfo.iterator();
            while (it.hasNext()) {
                arrayList.add(hc2.a.a((bw5.e0) it.next()));
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i("Finder.RedDotManagerCrossPlatformAff", sb6.toString());
            z().clearAllRedDotInfo();
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.ArrayList<com.tencent.mm.plugin.finder.extension.reddot.jb> arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it6 = allCurRedDotCtrlInfo.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.finder.extension.reddot.jb b17 = hc2.a.b((bw5.e0) it6.next());
                if (b17 != null) {
                    arrayList2.add(b17);
                }
            }
            for (com.tencent.mm.plugin.finder.extension.reddot.jb jbVar : arrayList2) {
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
        for (java.lang.String str : com.tencent.mm.plugin.finder.extension.reddot.l5.H.e()) {
            com.tencent.mm.plugin.finder.extension.reddot.jb b17 = hc2.a.b(z().currentCtrlInfoIgnoreAtPath(str, true));
            if (b17 != null) {
                if ((list != null && list.contains(str)) || !((com.tencent.mm.plugin.finder.extension.reddot.l5) this.f105631b).C(str, b17)) {
                    if (hashMap == null) {
                        hashMap = new java.util.HashMap();
                    }
                }
            }
        }
        return hashMap;
    }

    public final com.tencent.wechat.aff.finder.RedDotManager z() {
        return (com.tencent.wechat.aff.finder.RedDotManager) ((jz5.n) this.f105635f).getValue();
    }
}
