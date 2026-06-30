package bg2;

/* loaded from: classes3.dex */
public final class u extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f102067e;

    /* renamed from: f, reason: collision with root package name */
    public int f102068f;

    /* renamed from: g, reason: collision with root package name */
    public int f102069g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f102070h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f102071i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f102072m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f102073n;

    /* renamed from: o, reason: collision with root package name */
    public we2.p f102074o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f102067e = "Finder.LiveConvertCommentDataController";
        this.f102068f = 200;
        this.f102069g = 5;
        this.f102070h = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f102071i = java.util.Collections.synchronizedList(new java.util.LinkedList());
    }

    @Override // tc2.h
    public void H0(r45.r71 resp) {
        java.util.ArrayList<r45.ch1> arrayList;
        java.util.ArrayList<r45.t12> arrayList2;
        int i17;
        int[] iArr;
        dk2.zf b17;
        int[] iArr2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        if (this.f102072m) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(14);
            if (m75941xfb821914 != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : m75941xfb821914) {
                    r45.ch1 ch1Var = (r45.ch1) obj;
                    we2.p pVar = this.f102074o;
                    if (pVar == null || (iArr2 = pVar.f()) == null) {
                        iArr2 = new int[0];
                    }
                    if (kz5.z.F(iArr2, ch1Var.m75939xb282bd08(1))) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            if (!(arrayList != null && (arrayList.isEmpty() ^ true))) {
                arrayList = null;
            }
            if (arrayList != null) {
                for (r45.ch1 ch1Var2 : arrayList) {
                    zl2.r4 r4Var = zl2.r4.f555483a;
                    r4Var.M2(this.f102067e, "LiveCommentMsgInterceptor before extraFilter msg_type:" + ch1Var2.m75939xb282bd08(1));
                    if (ch1Var2.m75939xb282bd08(1) == 20035) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102067e, "[MMFinder_LiveAppMsg_Type_Location] msg = " + pm0.b0.g(ch1Var2));
                    }
                    we2.p pVar2 = this.f102074o;
                    if (pVar2 != null && (b17 = pVar2.b(ch1Var2)) != null) {
                        if (!Z6(b17)) {
                            b17 = null;
                        }
                        if (b17 != null) {
                            r4Var.M2(this.f102067e, "LiveCommentMsgInterceptor after extraFilter msg_type:" + b17.mo124533xfb85f7b0());
                            linkedList.add(b17);
                        }
                    }
                }
            }
            java.util.LinkedList m75941xfb8219142 = resp.m75941xfb821914(14);
            if (m75941xfb8219142 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(m75941xfb8219142).removeAll(linkedList);
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList m75941xfb8219143 = resp.m75941xfb821914(2);
            if (m75941xfb8219143 != null) {
                arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : m75941xfb8219143) {
                    r45.t12 t12Var = (r45.t12) obj2;
                    we2.p pVar3 = this.f102074o;
                    if (pVar3 == null || (iArr = pVar3.f()) == null) {
                        iArr = new int[0];
                    }
                    if (kz5.z.F(iArr, t12Var.m75939xb282bd08(3))) {
                        arrayList2.add(obj2);
                    }
                }
            } else {
                arrayList2 = null;
            }
            if (!(arrayList2 != null && (arrayList2.isEmpty() ^ true))) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                for (r45.t12 t12Var2 : arrayList2) {
                    we2.p pVar4 = this.f102074o;
                    if (pVar4 != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t12Var2);
                        dk2.zf c17 = pVar4.c(t12Var2);
                        if (c17 != null) {
                            if (!Z6(c17)) {
                                c17 = null;
                            }
                            if (c17 != null) {
                                linkedList2.add(c17);
                            }
                        }
                    }
                }
            }
            java.util.LinkedList m75941xfb8219144 = resp.m75941xfb821914(2);
            if (m75941xfb8219144 != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(m75941xfb8219144).removeAll(linkedList2);
            }
            linkedList.addAll(linkedList2);
            kz5.g0.t(linkedList, new bg2.t());
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : linkedList) {
                long m17 = ((dk2.zf) obj3).m();
                java.util.List cacheDataList = this.f102071i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cacheDataList, "cacheDataList");
                synchronized (cacheDataList) {
                    java.util.Iterator it = cacheDataList.iterator();
                    i17 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i17 = -1;
                            break;
                        } else if (((dk2.zf) it.next()).m() == m17) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                if (i17 == -1) {
                    arrayList3.add(obj3);
                }
            }
            Y6(arrayList3);
        }
    }

    @Override // tc2.c
    public void P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f498674d.f498681h;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject.m59240x7c94657b();
        r45.kr0 d17 = m59240x7c94657b != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.d(m59240x7c94657b) : null;
        boolean z17 = (d17 != null ? (r45.qg6) d17.m75936x14adae67(3) : null) != null;
        this.f102072m = z17;
        if (z17) {
            we2.p pVar = new we2.p();
            pVar.g(new bg2.s(m59240x7c94657b, this));
            this.f102074o = pVar;
        } else {
            bg2.a aVar = bg2.a.f101439a;
            bg2.a.f101441c.clear();
            bg2.a.f101440b = 0L;
        }
    }

    @Override // tc2.c
    public void Q6() {
        r45.nw1 m76794xd0557130;
        r45.qg6 qg6Var;
        r45.qg6 qg6Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f498674d.f498681h;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject.m59240x7c94657b();
        r45.kr0 d17 = m59240x7c94657b != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.d(m59240x7c94657b) : null;
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        boolean z17 = d2Var != null && d2Var.f101546i;
        this.f102072m = z17;
        long j17 = 0;
        if (!z17) {
            bg2.a aVar = bg2.a.f101439a;
            bg2.a.f101441c.clear();
            bg2.a.f101440b = 0L;
            return;
        }
        int i17 = 5;
        int i18 = 200;
        if (d2Var != null && d2Var.f101546i) {
            if (d17 != null && (qg6Var2 = (r45.qg6) d17.m75936x14adae67(3)) != null) {
                i18 = qg6Var2.m75939xb282bd08(1);
            }
            this.f102068f = i18;
            if (d17 != null && (qg6Var = (r45.qg6) d17.m75936x14adae67(3)) != null) {
                i17 = qg6Var.m75939xb282bd08(0);
            }
            this.f102069g = i17;
        } else {
            this.f102068f = 200;
            this.f102069g = 5;
        }
        java.util.List list = this.f102071i;
        list.clear();
        bg2.a aVar2 = bg2.a.f101439a;
        if (m59240x7c94657b != null && (m76794xd0557130 = m59240x7c94657b.m76794xd0557130()) != null) {
            j17 = m76794xd0557130.m75942xfb822ef2(0);
        }
        java.util.List a17 = aVar2.a(j17);
        java.util.ArrayList arrayList = (java.util.ArrayList) a17;
        if (arrayList.size() > this.f102069g) {
            list.addAll(arrayList.subList(arrayList.size() - this.f102069g, arrayList.size()));
        } else {
            list.addAll(a17);
        }
        Y6(list);
    }

    @Override // tc2.c
    public void U6() {
        this.f102070h.clear();
    }

    @Override // tc2.c
    public void X6() {
        we2.p pVar = this.f102074o;
        if (pVar != null) {
            pVar.h();
        }
        this.f102074o = null;
    }

    public final void Y6(java.util.List list) {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealWithMsgList msgDataBarrier:");
        sb6.append(this.f102073n);
        sb6.append(", msgList size:");
        sb6.append(list.size());
        sb6.append(", dataList size:");
        java.util.List list2 = this.f102070h;
        sb6.append(list2.size());
        sb6.append(", CacheCommentSize:");
        sb6.append(this.f102068f);
        sb6.append(", OutSideViewLimit:");
        sb6.append(this.f102069g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102067e, sb6.toString());
        if (this.f102073n) {
            return;
        }
        list2.addAll(list);
        while (true) {
            int size = list2.size();
            int i18 = this.f102068f;
            if (size <= i18 || i18 < (i17 = this.f102069g)) {
                return;
            } else {
                list2.remove(i17);
            }
        }
    }

    public final boolean Z6(dk2.zf zfVar) {
        if (zfVar.mo124533xfb85f7b0() == 20036) {
            java.lang.String j17 = zfVar.j();
            if (j17 == null || j17.length() == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // tc2.h
    public void d4(r45.hc1 resp) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        java.lang.String m59226x730bcac6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String m76175x6d346f39;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.List list = this.f102070h;
        if (list.isEmpty()) {
            java.lang.String m75945x2fec8307 = resp.m75945x2fec8307(38);
            boolean z17 = m75945x2fec8307 == null || m75945x2fec8307.length() == 0;
            tc2.g gVar = this.f498674d;
            java.lang.String str3 = "";
            if (z17 ? (abstractC14490x69736cb5 = gVar.f498681h) == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59226x730bcac6 = feedObject.m59226x730bcac6()) == null : (m59226x730bcac6 = resp.m75945x2fec8307(38)) == null) {
                m59226x730bcac6 = "";
            }
            if (!(m59226x730bcac6.length() > 0) || (abstractC14490x69736cb52 = gVar.f498681h) == null || (feedObject2 = abstractC14490x69736cb52.getFeedObject()) == null || (m59240x7c94657b = feedObject2.m59240x7c94657b()) == null) {
                return;
            }
            r45.t12 t12Var = new r45.t12();
            r45.xn1 xn1Var = new r45.xn1();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = m59240x7c94657b.m76760x76845fea();
            if (m76760x76845fea == null || (str = m76760x76845fea.m76197x6c03c64c()) == null) {
                str = "";
            }
            c19782x23db1cfa.m76240x66bc2758(str);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea2 = m59240x7c94657b.m76760x76845fea();
            if (m76760x76845fea2 == null || (str2 = m76760x76845fea2.m76184x8010e5e4()) == null) {
                str2 = "";
            }
            c19782x23db1cfa.m76227x7ac946f0(str2);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea3 = m59240x7c94657b.m76760x76845fea();
            if (m76760x76845fea3 != null && (m76175x6d346f39 = m76760x76845fea3.m76175x6d346f39()) != null) {
                str3 = m76175x6d346f39;
            }
            c19782x23db1cfa.m76218xe0a5bcad(str3);
            xn1Var.set(0, c19782x23db1cfa);
            t12Var.set(8, xn1Var);
            t12Var.set(2, m59226x730bcac6);
            t12Var.set(3, 100000);
            dk2.mf mfVar = new dk2.mf(t12Var);
            list.add(mfVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f102067e, "appendWelcomeTip:" + mfVar.f315306a.m75945x2fec8307(2));
        }
    }

    @Override // tc2.h
    public void g5(android.content.Intent intent, r45.wk0 enterLiveParams) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterLiveParams, "enterLiveParams");
        super.g5(intent, enterLiveParams);
        if (this.f102072m) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f498674d.f498681h;
            long m75942xfb822ef2 = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null) ? 0L : m59258xd0557130.m75942xfb822ef2(0);
            bg2.a aVar = bg2.a.f101439a;
            java.util.List list = this.f102070h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CommentDataTransfer", "passToLive liveId:" + pm0.v.u(m75942xfb822ef2) + ", cache size:" + list.size());
            java.util.List list2 = bg2.a.f101441c;
            list2.clear();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                dk2.zf zfVar = (dk2.zf) obj;
                if ((zfVar.mo124533xfb85f7b0() == 100000 || zfVar.mo124533xfb85f7b0() == 100004) ? false : true) {
                    arrayList.add(obj);
                }
            }
            list2.addAll(arrayList);
            bg2.a.f101440b = m75942xfb822ef2;
            r45.ta4 ta4Var = (r45.ta4) enterLiveParams.m75936x14adae67(7);
            if (ta4Var == null) {
                ta4Var = new r45.ta4();
            }
            ta4Var.set(19, java.lang.Boolean.TRUE);
            enterLiveParams.set(7, ta4Var);
        }
    }

    @Override // tc2.h
    /* renamed from: onLiveEnd */
    public void mo10394x5aa1a970() {
        this.f102070h.clear();
    }
}
