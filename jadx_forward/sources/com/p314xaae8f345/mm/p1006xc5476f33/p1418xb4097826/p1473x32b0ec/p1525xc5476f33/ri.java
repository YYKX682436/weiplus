package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes14.dex */
public abstract class ri extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {
    public int A;
    public long B;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f195674p;

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f195675q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f195676r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f195677s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f195678t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f195679u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f195680v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.HashMap f195681w;

    /* renamed from: x, reason: collision with root package name */
    public ik2.e f195682x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f195683y;

    /* renamed from: z, reason: collision with root package name */
    public long f195684z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(android.view.ViewGroup entranceRoot, qo0.c statusMonitor) {
        super(entranceRoot, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entranceRoot, "entranceRoot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f195674p = entranceRoot;
        this.f195675q = statusMonitor;
        this.f195676r = "MicroMsg.FinderLiveGameDynamicFrameSetPlugin";
        this.f195677s = new java.util.ArrayList();
        this.f195678t = new java.util.ArrayList();
        this.f195679u = new java.util.ArrayList();
        this.f195680v = new java.util.HashMap();
        this.f195681w = new java.util.HashMap();
        v1();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void I0() {
        hq0.e0 e0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195676r, "pause");
        ik2.e eVar = this.f195682x;
        if (eVar == null || (e0Var = eVar.f373420c) == null) {
            return;
        }
        e0Var.f();
    }

    @Override // qo0.a
    public void J0() {
        hq0.e0 e0Var;
        ik2.e eVar = this.f195682x;
        if (eVar == null || (e0Var = eVar.f373420c) == null) {
            return;
        }
        e0Var.j();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (status.ordinal() != 123) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f195684z <= 3000 || this.f195679u.size() != 0) {
            return;
        }
        this.f195684z = currentTimeMillis;
        pm0.v.V(1000L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qi(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f195676r, "unMount");
        super.O0();
        this.f195677s.clear();
        this.f195678t.clear();
        this.f195680v.clear();
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pi> arrayList = this.f195679u;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pi piVar : arrayList) {
        }
        arrayList.clear();
        this.f195681w.clear();
        ik2.e eVar = this.f195682x;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f410334f2 != 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        java.util.HashMap hashMap;
        java.util.ArrayList arrayList;
        java.util.HashMap hashMap2;
        ik2.d dVar;
        r45.uq1 uq1Var = ((mm2.c1) P0(mm2.c1.class)).Q2;
        java.lang.String str = this.f195676r;
        if (uq1Var == null) {
            K0(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "liveGameData is null");
            return;
        }
        if (!uq1Var.m75933x41a8a7f2(3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "liveGameData updated is false");
            return;
        }
        int m75939xb282bd08 = uq1Var.m75939xb282bd08(2);
        if (uq1Var.m75939xb282bd08(2) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "game_frameset_visibility is 0");
            K0(8);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "liveGameData game_frameset_visibility:%d, origin game_frameset_visibility:%d", java.lang.Integer.valueOf(uq1Var.m75939xb282bd08(2)), java.lang.Integer.valueOf(m75939xb282bd08));
        java.util.ArrayList arrayList2 = this.f195677s;
        if (arrayList2.isEmpty() || arrayList2.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "filteredFrameSetList is empty， parentId:%s", u1());
            K0(8);
            if (this.A < 5) {
                v1();
                return;
            }
            return;
        }
        this.A = 0;
        ik2.e eVar = this.f195682x;
        if (eVar == null) {
            K0(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "surfaceMgr is null");
            return;
        }
        if ((eVar != null ? eVar.f373420c : null) == null) {
            java.lang.String str2 = ((mm2.c1) P0(mm2.c1.class)).f410385o;
            ik2.e eVar2 = this.f195682x;
            if (eVar2 != null) {
                android.content.Context context = this.f446856d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                eVar2.a(context, str2, ((mm2.e1) P0(mm2.e1.class)).f410516m);
            }
        }
        ik2.e eVar3 = this.f195682x;
        if ((eVar3 != null ? eVar3.f373420c : null) == null) {
            K0(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "getFrameSetRoot is null");
            return;
        }
        int m75939xb282bd082 = uq1Var.m75939xb282bd08(2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ik2.d dVar2 = (ik2.d) it.next();
            if ((dVar2.f373397f & m75939xb282bd082) == 0) {
                arrayList3.add(dVar2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "frameset id:%s is invisible, remove it", dVar2.f373392a);
            } else {
                java.lang.String str3 = dVar2.f373392a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                arrayList4.add(str3);
            }
        }
        arrayList2.removeAll(arrayList3);
        java.util.Iterator it6 = arrayList3.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            hashMap = this.f195680v;
            arrayList = this.f195679u;
            hashMap2 = this.f195681w;
            if (!hasNext) {
                break;
            }
            ik2.d dVar3 = (ik2.d) it6.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pi piVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pi) p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(hashMap2).remove(dVar3.f373392a);
            if (piVar != null) {
                piVar.O0();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(arrayList).remove(piVar);
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(hashMap).remove(dVar3.f373392a);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "remove frame plugin id:%s from invisible removeList", dVar3.f373392a);
        }
        arrayList3.clear();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.ArrayList arrayList6 = this.f195678t;
        java.util.Iterator it7 = arrayList6.iterator();
        while (it7.hasNext()) {
            ik2.d dVar4 = (ik2.d) it7.next();
            if (kz5.n0.O(arrayList4, dVar4.f373392a)) {
                java.lang.String str4 = dVar4.f373392a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str4);
                arrayList5.add(str4);
            } else {
                arrayList3.add(dVar4);
            }
        }
        java.util.Iterator it8 = arrayList3.iterator();
        while (it8.hasNext()) {
            ik2.d dVar5 = (ik2.d) it8.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pi piVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pi) p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(hashMap2).remove(dVar5.f373392a);
            if (piVar2 != null) {
                piVar2.O0();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(arrayList).remove(piVar2);
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(hashMap).remove(dVar5.f373392a);
            arrayList6.remove(dVar5);
            arrayList2.remove(dVar5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "remove frame plugin id:%s from not contains currentFrameSetParamList", dVar5.f373392a);
        }
        arrayList6.clear();
        arrayList6.addAll(arrayList2);
        if (arrayList2.size() > 0) {
            java.util.Iterator it9 = arrayList2.iterator();
            while (it9.hasNext()) {
                ik2.d frameSetParam = (ik2.d) it9.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetParam, "frameSetParam");
                android.view.ViewGroup viewGroup = this.f195674p;
                android.content.Context context2 = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = new com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d(context2, null, 0, 6, null);
                java.lang.String str5 = frameSetParam.f373392a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str5);
                c10867x3e50a04d.e(str5);
                int generateViewId = android.view.View.generateViewId();
                c10867x3e50a04d.setId(generateViewId);
                java.lang.String str6 = frameSetParam.f373392a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str6);
                hashMap.put(str6, java.lang.Integer.valueOf(generateViewId));
                java.util.Iterator it10 = it9;
                android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(frameSetParam.f373402k, frameSetParam.f373403l);
                c10867x3e50a04d.setLayoutParams(layoutParams);
                viewGroup.addView(c10867x3e50a04d);
                x1(layoutParams, frameSetParam);
                c10867x3e50a04d.setLayoutParams(layoutParams);
                ik2.e eVar4 = this.f195682x;
                hq0.e0 e0Var = eVar4 != null ? eVar4.f373420c : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e0Var);
                c10867x3e50a04d.a(e0Var);
                c10867x3e50a04d.bringToFront();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pi piVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pi(c10867x3e50a04d, this.f195675q);
                piVar3.f195424r = frameSetParam;
                java.lang.String str7 = frameSetParam.f373392a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str7);
                hashMap2.put(str7, piVar3);
                arrayList.add(piVar3);
                it9 = it10;
            }
        }
        if (!arrayList5.isEmpty()) {
            java.util.Iterator it11 = arrayList5.iterator();
            while (it11.hasNext()) {
                java.lang.String str8 = (java.lang.String) it11.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pi piVar4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pi) hashMap2.get(str8);
                if (piVar4 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams2 = piVar4.f195422p.getLayoutParams();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) layoutParams2;
                    java.util.Iterator it12 = arrayList6.iterator();
                    while (true) {
                        if (!it12.hasNext()) {
                            dVar = null;
                            break;
                        } else {
                            dVar = (ik2.d) it12.next();
                            if (str8.equals(dVar.f373392a)) {
                                break;
                            }
                        }
                    }
                    if (dVar != null) {
                        x1(layoutParams3, dVar);
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "framePluginList size :%d", java.lang.Integer.valueOf(arrayList2.size()));
        java.util.Iterator it13 = arrayList.iterator();
        while (it13.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pi piVar5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pi) it13.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "plugin hasCode:%d", java.lang.Integer.valueOf(piVar5.hashCode()));
            piVar5.t1();
        }
        if (arrayList6.size() > 0) {
            K0(0);
            w1(uq1Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "check currentFrameSetParamList empty");
            K0(8);
        }
    }

    public abstract java.lang.String u1();

    public final void v1() {
        this.A++;
        ik2.b bVar = ik2.b.f373385a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFrameSetDataLoader", "loadFrameSetLayoutData");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = ik2.b.f373387c;
        synchronized (arrayList) {
            if (!(!arrayList.isEmpty()) || currentTimeMillis - ik2.b.f373386b > com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8) {
                java.lang.String a17 = bVar.a();
                if (android.text.TextUtils.isEmpty(a17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveFrameSetDataLoader", "loadFrameSetLayoutData exptGameFrameSetData is empty!");
                    synchronized (arrayList) {
                        arrayList.clear();
                    }
                } else {
                    synchronized (arrayList) {
                        java.util.ArrayList a18 = ik2.c.f373391a.a(a17);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveFrameSetDataLoader", "parseRetList size :%d", java.lang.Integer.valueOf(a18.size()));
                        arrayList.clear();
                        arrayList.addAll(a18);
                        if (!arrayList.isEmpty()) {
                            ik2.b.f373386b = currentTimeMillis;
                        }
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveFrameSetDataLoader", "fetch from frameSetData cache");
            }
        }
        if (arrayList.isEmpty() || arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f195676r, "loadFrameSetData frameSetParamList is empty");
            K0(8);
            return;
        }
        java.lang.String parentId = u1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentId, "parentId");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!android.text.TextUtils.isEmpty(parentId)) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ik2.d dVar = (ik2.d) it.next();
                if (parentId.equals(dVar.f373393b)) {
                    arrayList2.add(dVar);
                }
            }
        }
        if (arrayList2.isEmpty() || arrayList2.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f195676r, "loadFrameSetData filteredFrameSetList is empty， parentId:%s", u1());
            K0(8);
        } else {
            this.f195677s.clear();
            this.f195677s.addAll(arrayList2);
        }
    }

    public final void w1(r45.uq1 gameData) {
        hq0.e0 e0Var;
        hq0.e0 e0Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gameData, "gameData");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = gameData.m75934xbce7f2f(1);
        java.lang.String h17 = m75934xbce7f2f != null ? m75934xbce7f2f.h(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c) : null;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f195683y, h17);
        java.lang.String str = this.f195676r;
        if (!b17 && h17 != null) {
            this.f195683y = h17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "notifyGameData");
            ik2.e eVar = this.f195682x;
            if (eVar != null && (e0Var2 = eVar.f373420c) != null) {
                e0Var2.a(h17, null);
            }
            this.B = currentTimeMillis;
            return;
        }
        if (h17 == null || currentTimeMillis - this.B <= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "notifyGameData");
        ik2.e eVar2 = this.f195682x;
        if (eVar2 != null && (e0Var = eVar2.f373420c) != null) {
            e0Var.a(h17, null);
        }
        this.B = currentTimeMillis;
    }

    public final void x1(android.widget.RelativeLayout.LayoutParams layoutParam, ik2.d frameSetParam) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layoutParam, "layoutParam");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetParam, "frameSetParam");
        layoutParam.width = frameSetParam.f373402k;
        layoutParam.height = frameSetParam.f373403l;
        layoutParam.leftMargin = frameSetParam.f373399h;
        layoutParam.rightMargin = frameSetParam.f373400i;
        layoutParam.topMargin = frameSetParam.f373398g;
        layoutParam.bottomMargin = frameSetParam.f373401j;
        int[] rules = layoutParam.getRules();
        if (rules != null) {
            if (!(rules.length == 0)) {
                int length = rules.length;
                for (int i17 = 0; i17 < length; i17++) {
                    layoutParam.removeRule(i17);
                }
            }
        }
        if (frameSetParam.f373404m) {
            layoutParam.addRule(10);
        }
        if (frameSetParam.f373405n) {
            layoutParam.addRule(9);
        }
        if (frameSetParam.f373406o) {
            layoutParam.addRule(11);
        }
        if (frameSetParam.f373407p) {
            layoutParam.addRule(12);
        }
        if (frameSetParam.f373408q) {
            layoutParam.addRule(20);
        }
        if (frameSetParam.f373409r) {
            layoutParam.addRule(21);
        }
        if (frameSetParam.f373410s) {
            layoutParam.addRule(13);
        }
        if (frameSetParam.f373412u) {
            layoutParam.addRule(15);
        }
        if (frameSetParam.f373411t) {
            layoutParam.addRule(14);
        }
        boolean isEmpty = android.text.TextUtils.isEmpty(frameSetParam.f373413v);
        java.util.HashMap hashMap = this.f195680v;
        if (!isEmpty && hashMap.containsKey(frameSetParam.f373413v)) {
            java.lang.Object obj = hashMap.get(frameSetParam.f373413v);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(6, ((java.lang.Integer) obj).intValue());
        }
        if (!android.text.TextUtils.isEmpty(frameSetParam.f373414w) && hashMap.containsKey(frameSetParam.f373414w)) {
            java.lang.Object obj2 = hashMap.get(frameSetParam.f373414w);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(8, ((java.lang.Integer) obj2).intValue());
        }
        if (!android.text.TextUtils.isEmpty(frameSetParam.f373415x) && hashMap.containsKey(frameSetParam.f373415x)) {
            java.lang.Object obj3 = hashMap.get(frameSetParam.f373415x);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(5, ((java.lang.Integer) obj3).intValue());
        }
        if (!android.text.TextUtils.isEmpty(frameSetParam.f373416y) && hashMap.containsKey(frameSetParam.f373416y)) {
            java.lang.Object obj4 = hashMap.get(frameSetParam.f373416y);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(7, ((java.lang.Integer) obj4).intValue());
        }
        if (!android.text.TextUtils.isEmpty(frameSetParam.f373417z) && hashMap.containsKey(frameSetParam.f373417z)) {
            java.lang.Object obj5 = hashMap.get(frameSetParam.f373417z);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj5, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(3, ((java.lang.Integer) obj5).intValue());
        }
        if (!android.text.TextUtils.isEmpty(frameSetParam.A) && hashMap.containsKey(frameSetParam.A)) {
            java.lang.Object obj6 = hashMap.get(frameSetParam.A);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj6, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(2, ((java.lang.Integer) obj6).intValue());
        }
        if (!android.text.TextUtils.isEmpty(frameSetParam.B) && hashMap.containsKey(frameSetParam.B)) {
            java.lang.Object obj7 = hashMap.get(frameSetParam.B);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj7, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(0, ((java.lang.Integer) obj7).intValue());
        }
        if (!android.text.TextUtils.isEmpty(frameSetParam.C) && hashMap.containsKey(frameSetParam.C)) {
            java.lang.Object obj8 = hashMap.get(frameSetParam.C);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj8, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(1, ((java.lang.Integer) obj8).intValue());
        }
        if (!android.text.TextUtils.isEmpty(frameSetParam.D) && hashMap.containsKey(frameSetParam.D)) {
            java.lang.Object obj9 = hashMap.get(frameSetParam.D);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj9, "null cannot be cast to non-null type kotlin.Int");
            layoutParam.addRule(16, ((java.lang.Integer) obj9).intValue());
        }
        if (android.text.TextUtils.isEmpty(frameSetParam.E) || !hashMap.containsKey(frameSetParam.E)) {
            return;
        }
        java.lang.Object obj10 = hashMap.get(frameSetParam.E);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj10, "null cannot be cast to non-null type kotlin.Int");
        layoutParam.addRule(17, ((java.lang.Integer) obj10).intValue());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        super.z0();
    }
}
