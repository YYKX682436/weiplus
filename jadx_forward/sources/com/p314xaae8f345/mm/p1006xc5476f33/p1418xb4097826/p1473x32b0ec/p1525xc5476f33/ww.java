package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ww extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f196529p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f196530q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a f196531r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        android.view.ViewGroup viewGroup;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196529p = statusMonitor;
        this.f196530q = new java.util.concurrent.ConcurrentHashMap();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lv lvVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lv) X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lv.class);
        android.view.View findViewById = (lvVar == null || (viewGroup = lvVar.f446856d) == null) ? null : viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f8q);
        if (findViewById != null) {
            android.view.ViewParent parent = findViewById.getParent();
            this.f196531r = parent instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1478xadd9b48c.C14179xd6e3454a) parent : null;
        }
    }

    @Override // qo0.a
    public void C0(java.util.LinkedHashMap micUserMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micUserMap, "micUserMap");
        pm2.a aVar = ((mm2.y2) P0(mm2.y2.class)).f411093m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLuckyMoneyBubblePlugin", "onMicUserChanged: curWidgetMode: " + aVar + " luckyMicMap.size:" + this.f196530q.size() + ", audienceLinkMicUserList.size:" + ((mm2.o4) P0(mm2.o4.class)).f410860v.size() + ", micUserMap:" + micUserMap);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f196530q;
        synchronized (concurrentHashMap) {
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                java.lang.String v17 = v1((java.lang.String) entry.getKey());
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(v17, ((mm2.e1) P0(mm2.e1.class)).f410520q.f461834n) && !micUserMap.containsKey(v17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLuckyMoneyBubblePlugin", "old mic " + entry.getValue() + " removed, sdkUserID:" + v17);
                    arrayList.add(entry.getKey());
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            x1((java.lang.String) it.next());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = micUserMap.entrySet().iterator();
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) ((java.util.Map.Entry) it6.next()).getKey();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f196530q;
            synchronized (concurrentHashMap2) {
                for (java.util.Map.Entry entry2 : concurrentHashMap2.entrySet()) {
                    java.lang.String v18 = v1((java.lang.String) entry2.getKey());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLuckyMoneyBubblePlugin", "micModeChangeRemove oldLuckyMicKey: " + ((java.lang.String) entry2.getKey()) + " micUserId: " + v18);
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, v18)) {
                        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(entry2.getKey(), t1(str, aVar, u1()))) {
                            arrayList2.add(entry2.getKey());
                        }
                    }
                }
            }
        }
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            x1((java.lang.String) it7.next());
        }
        java.util.Iterator it8 = micUserMap.entrySet().iterator();
        while (it8.hasNext()) {
            w1(aVar, u1(), (java.lang.String) ((java.util.Map.Entry) it8.next()).getKey());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7()) {
            super.K0(i17);
        } else {
            this.f446856d.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderLiveLuckyMoneyBubblePlugin", "setVisible return for isTeenMode");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            pm2.a aVar = ((mm2.y2) P0(mm2.y2.class)).f411093m;
            boolean u17 = u1();
            java.lang.String str = ((mm2.e1) P0(mm2.e1.class)).f410520q.f461834n;
            if (str == null) {
                str = "";
            }
            w1(aVar, u17, str);
            return;
        }
        if (ordinal == 27) {
            long m75942xfb822ef2 = ((mm2.e1) P0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            rl2.j jVar = (rl2.j) ((jz5.n) ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4.class)).f148529t).mo141623x754a37bb();
            jVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveLuckyMoneyStorage", "clearCache liveId:" + m75942xfb822ef2);
            jVar.f478733f.clear();
            jVar.f478732e.mo70514xb06685ab("FinderLiveLuckyMoneyInfo", "liveId=?", new java.lang.String[]{pm0.v.u(m75942xfb822ef2)});
            return;
        }
        if (ordinal != 183 || bundle == null || (string = bundle.getString("PARAM_FINDER_LIVE_LUCKY_MONEY_SEND_ID")) == null) {
            return;
        }
        java.util.Iterator it = this.f196530q.entrySet().iterator();
        while (it.hasNext()) {
            te2.c4 c4Var = (te2.c4) ((te2.w3) ((jz5.l) ((java.util.Map.Entry) it.next()).getValue()).f384366d);
            c4Var.getClass();
            java.util.Iterator it6 = c4Var.f499458i.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it6.next();
                    if (((te2.z3) obj).f500090b.equals(string)) {
                        break;
                    }
                }
            }
            te2.z3 z3Var = (te2.z3) obj;
            if (z3Var != null) {
                c4Var.h(z3Var);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f196530q;
        synchronized (concurrentHashMap) {
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(((java.util.Map.Entry) it.next()).getKey());
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            x1((java.lang.String) it6.next());
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String t1(java.lang.String r6, pm2.a r7, boolean r8) {
        /*
            r5 = this;
            java.lang.Class<mm2.o4> r0 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r5.P0(r0)
            mm2.o4 r0 = (mm2.o4) r0
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r0 = r0.A
            java.lang.Object r0 = r0.mo3195x754a37bb()
            xh2.c r0 = (xh2.c) r0
            r1 = 0
            if (r0 == 0) goto L3b
            java.util.LinkedList r0 = r0.f536064a
            if (r0 == 0) goto L3b
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r0.next()
            r3 = r2
            xh2.a r3 = (xh2.a) r3
            java.lang.String r3 = r3.b()
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r6)
            if (r3 == 0) goto L1b
            goto L34
        L33:
            r2 = r1
        L34:
            xh2.a r2 = (xh2.a) r2
            if (r2 == 0) goto L3b
            xh2.i r0 = r2.f536054b
            goto L3c
        L3b:
            r0 = r1
        L3c:
            if (r0 == 0) goto L41
            int r2 = r0.f536086e
            goto L42
        L41:
            r2 = 1
        L42:
            if (r0 == 0) goto L47
            int r3 = r0.f536090i
            goto L48
        L47:
            r3 = 0
        L48:
            r4 = 2
            boolean r3 = pm0.v.z(r3, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            r6 = 64
            r4.append(r6)
            int r7 = r7.ordinal()
            r4.append(r7)
            r4.append(r6)
            r4.append(r2)
            r4.append(r6)
            r4.append(r3)
            r4.append(r6)
            if (r0 == 0) goto L78
            int r7 = r0.f536088g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
        L78:
            r4.append(r1)
            r4.append(r6)
            r4.append(r8)
            java.lang.String r6 = r4.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ww.t1(java.lang.String, pm2.a, boolean):java.lang.String");
    }

    public final boolean u1() {
        boolean z17;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        xh2.i iVar;
        xh2.c cVar = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.mo3195x754a37bb();
        if (cVar != null && cVar.f536066c == 1) {
            java.util.Iterator it = cVar.f536064a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh2.a) obj).b(), ((mm2.e1) P0(mm2.e1.class)).f410520q.f461834n)) {
                    break;
                }
            }
            xh2.a aVar = (xh2.a) obj;
            if (aVar != null && (iVar = aVar.f536054b) != null && iVar.f536088g == 2) {
                z17 = true;
                if (z17 && !((mm2.o4) P0(mm2.o4.class)).A7()) {
                    if (((mm2.y2) P0(mm2.y2.class)).a7()) {
                        xh2.c cVar2 = (xh2.c) ((mm2.o4) P0(mm2.o4.class)).A.mo3195x754a37bb();
                        if (((cVar2 == null || (linkedList = cVar2.f536064a) == null) ? 0 : linkedList.size()) > 1) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        z17 = false;
        return z17 ? true : true;
    }

    public final java.lang.String v1(java.lang.String str) {
        java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"@"}, false, 0, 6, null);
        java.lang.String str2 = f07.isEmpty() ^ true ? (java.lang.String) f07.get(0) : "";
        return str2 == null ? "" : str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x014e, code lost:
    
        if (((r9 == null || (r4 = r9.f536054b) == null || r4.f536088g != 2) ? false : true) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0173, code lost:
    
        if (r5 == null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w1(pm2.a r51, boolean r52, java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ww.w1(pm2.a, boolean, java.lang.String):void");
    }

    public final void x1(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveLuckyMoneyBubblePlugin", "unregister sdkUserId:".concat(key));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f196530q;
        jz5.l lVar = (jz5.l) concurrentHashMap.get(key);
        if (lVar == null) {
            return;
        }
        te2.w3 w3Var = (te2.w3) lVar.f384366d;
        te2.x3 x3Var = (te2.x3) lVar.f384367e;
        ((te2.c4) w3Var).mo979x3f5eee52();
        x3Var.mo166308x41012807();
        concurrentHashMap.remove(key);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1() {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ww.y1():void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
    }
}
