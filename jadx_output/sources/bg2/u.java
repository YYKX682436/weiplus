package bg2;

/* loaded from: classes3.dex */
public final class u extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f20534e;

    /* renamed from: f, reason: collision with root package name */
    public int f20535f;

    /* renamed from: g, reason: collision with root package name */
    public int f20536g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f20537h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f20538i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20539m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20540n;

    /* renamed from: o, reason: collision with root package name */
    public we2.p f20541o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f20534e = "Finder.LiveConvertCommentDataController";
        this.f20535f = 200;
        this.f20536g = 5;
        this.f20537h = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f20538i = java.util.Collections.synchronizedList(new java.util.LinkedList());
    }

    @Override // tc2.h
    public void H0(r45.r71 resp) {
        java.util.ArrayList<r45.ch1> arrayList;
        java.util.ArrayList<r45.t12> arrayList2;
        int i17;
        int[] iArr;
        dk2.zf b17;
        int[] iArr2;
        kotlin.jvm.internal.o.g(resp, "resp");
        if (this.f20539m) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.LinkedList list = resp.getList(14);
            if (list != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    r45.ch1 ch1Var = (r45.ch1) obj;
                    we2.p pVar = this.f20541o;
                    if (pVar == null || (iArr2 = pVar.f()) == null) {
                        iArr2 = new int[0];
                    }
                    if (kz5.z.F(iArr2, ch1Var.getInteger(1))) {
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
                    zl2.r4 r4Var = zl2.r4.f473950a;
                    r4Var.M2(this.f20534e, "LiveCommentMsgInterceptor before extraFilter msg_type:" + ch1Var2.getInteger(1));
                    if (ch1Var2.getInteger(1) == 20035) {
                        com.tencent.mars.xlog.Log.i(this.f20534e, "[MMFinder_LiveAppMsg_Type_Location] msg = " + pm0.b0.g(ch1Var2));
                    }
                    we2.p pVar2 = this.f20541o;
                    if (pVar2 != null && (b17 = pVar2.b(ch1Var2)) != null) {
                        if (!Z6(b17)) {
                            b17 = null;
                        }
                        if (b17 != null) {
                            r4Var.M2(this.f20534e, "LiveCommentMsgInterceptor after extraFilter msg_type:" + b17.getType());
                            linkedList.add(b17);
                        }
                    }
                }
            }
            java.util.LinkedList list2 = resp.getList(14);
            if (list2 != null) {
                kotlin.jvm.internal.m0.a(list2).removeAll(linkedList);
            }
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.LinkedList list3 = resp.getList(2);
            if (list3 != null) {
                arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list3) {
                    r45.t12 t12Var = (r45.t12) obj2;
                    we2.p pVar3 = this.f20541o;
                    if (pVar3 == null || (iArr = pVar3.f()) == null) {
                        iArr = new int[0];
                    }
                    if (kz5.z.F(iArr, t12Var.getInteger(3))) {
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
                    we2.p pVar4 = this.f20541o;
                    if (pVar4 != null) {
                        kotlin.jvm.internal.o.d(t12Var2);
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
            java.util.LinkedList list4 = resp.getList(2);
            if (list4 != null) {
                kotlin.jvm.internal.m0.a(list4).removeAll(linkedList2);
            }
            linkedList.addAll(linkedList2);
            kz5.g0.t(linkedList, new bg2.t());
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : linkedList) {
                long m17 = ((dk2.zf) obj3).m();
                java.util.List cacheDataList = this.f20538i;
                kotlin.jvm.internal.o.f(cacheDataList, "cacheDataList");
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
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? null : feedObject.getFinderObject();
        r45.kr0 d17 = finderObject != null ? com.tencent.mm.plugin.finder.storage.FinderItem.Companion.d(finderObject) : null;
        boolean z17 = (d17 != null ? (r45.qg6) d17.getCustom(3) : null) != null;
        this.f20539m = z17;
        if (z17) {
            we2.p pVar = new we2.p();
            pVar.g(new bg2.s(finderObject, this));
            this.f20541o = pVar;
        } else {
            bg2.a aVar = bg2.a.f19906a;
            bg2.a.f19908c.clear();
            bg2.a.f19907b = 0L;
        }
    }

    @Override // tc2.c
    public void Q6() {
        r45.nw1 liveInfo;
        r45.qg6 qg6Var;
        r45.qg6 qg6Var2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? null : feedObject.getFinderObject();
        r45.kr0 d17 = finderObject != null ? com.tencent.mm.plugin.finder.storage.FinderItem.Companion.d(finderObject) : null;
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        boolean z17 = d2Var != null && d2Var.f20013i;
        this.f20539m = z17;
        long j17 = 0;
        if (!z17) {
            bg2.a aVar = bg2.a.f19906a;
            bg2.a.f19908c.clear();
            bg2.a.f19907b = 0L;
            return;
        }
        int i17 = 5;
        int i18 = 200;
        if (d2Var != null && d2Var.f20013i) {
            if (d17 != null && (qg6Var2 = (r45.qg6) d17.getCustom(3)) != null) {
                i18 = qg6Var2.getInteger(1);
            }
            this.f20535f = i18;
            if (d17 != null && (qg6Var = (r45.qg6) d17.getCustom(3)) != null) {
                i17 = qg6Var.getInteger(0);
            }
            this.f20536g = i17;
        } else {
            this.f20535f = 200;
            this.f20536g = 5;
        }
        java.util.List list = this.f20538i;
        list.clear();
        bg2.a aVar2 = bg2.a.f19906a;
        if (finderObject != null && (liveInfo = finderObject.getLiveInfo()) != null) {
            j17 = liveInfo.getLong(0);
        }
        java.util.List a17 = aVar2.a(j17);
        java.util.ArrayList arrayList = (java.util.ArrayList) a17;
        if (arrayList.size() > this.f20536g) {
            list.addAll(arrayList.subList(arrayList.size() - this.f20536g, arrayList.size()));
        } else {
            list.addAll(a17);
        }
        Y6(list);
    }

    @Override // tc2.c
    public void U6() {
        this.f20537h.clear();
    }

    @Override // tc2.c
    public void X6() {
        we2.p pVar = this.f20541o;
        if (pVar != null) {
            pVar.h();
        }
        this.f20541o = null;
    }

    public final void Y6(java.util.List list) {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealWithMsgList msgDataBarrier:");
        sb6.append(this.f20540n);
        sb6.append(", msgList size:");
        sb6.append(list.size());
        sb6.append(", dataList size:");
        java.util.List list2 = this.f20537h;
        sb6.append(list2.size());
        sb6.append(", CacheCommentSize:");
        sb6.append(this.f20535f);
        sb6.append(", OutSideViewLimit:");
        sb6.append(this.f20536g);
        com.tencent.mars.xlog.Log.i(this.f20534e, sb6.toString());
        if (this.f20540n) {
            return;
        }
        list2.addAll(list);
        while (true) {
            int size = list2.size();
            int i18 = this.f20535f;
            if (size <= i18 || i18 < (i17 = this.f20536g)) {
                return;
            } else {
                list2.remove(i17);
            }
        }
    }

    public final boolean Z6(dk2.zf zfVar) {
        if (zfVar.getType() == 20036) {
            java.lang.String j17 = zfVar.j();
            if (j17 == null || j17.length() == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // tc2.h
    public void d4(r45.hc1 resp) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        java.lang.String description;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String headUrl;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.List list = this.f20537h;
        if (list.isEmpty()) {
            java.lang.String string = resp.getString(38);
            boolean z17 = string == null || string.length() == 0;
            tc2.g gVar = this.f417141d;
            java.lang.String str3 = "";
            if (z17 ? (baseFinderFeed = gVar.f417148h) == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (description = feedObject.getDescription()) == null : (description = resp.getString(38)) == null) {
                description = "";
            }
            if (!(description.length() > 0) || (baseFinderFeed2 = gVar.f417148h) == null || (feedObject2 = baseFinderFeed2.getFeedObject()) == null || (finderObject = feedObject2.getFinderObject()) == null) {
                return;
            }
            r45.t12 t12Var = new r45.t12();
            r45.xn1 xn1Var = new r45.xn1();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
            com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
            if (contact == null || (str = contact.getUsername()) == null) {
                str = "";
            }
            finderContact.setUsername(str);
            com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderObject.getContact();
            if (contact2 == null || (str2 = contact2.getNickname()) == null) {
                str2 = "";
            }
            finderContact.setNickname(str2);
            com.tencent.mm.protocal.protobuf.FinderContact contact3 = finderObject.getContact();
            if (contact3 != null && (headUrl = contact3.getHeadUrl()) != null) {
                str3 = headUrl;
            }
            finderContact.setHeadUrl(str3);
            xn1Var.set(0, finderContact);
            t12Var.set(8, xn1Var);
            t12Var.set(2, description);
            t12Var.set(3, 100000);
            dk2.mf mfVar = new dk2.mf(t12Var);
            list.add(mfVar);
            com.tencent.mars.xlog.Log.i(this.f20534e, "appendWelcomeTip:" + mfVar.f233773a.getString(2));
        }
    }

    @Override // tc2.h
    public void g5(android.content.Intent intent, r45.wk0 enterLiveParams) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(enterLiveParams, "enterLiveParams");
        super.g5(intent, enterLiveParams);
        if (this.f20539m) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
            long j17 = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null) ? 0L : liveInfo.getLong(0);
            bg2.a aVar = bg2.a.f19906a;
            java.util.List list = this.f20537h;
            kotlin.jvm.internal.o.d(list);
            com.tencent.mars.xlog.Log.i("Finder.CommentDataTransfer", "passToLive liveId:" + pm0.v.u(j17) + ", cache size:" + list.size());
            java.util.List list2 = bg2.a.f19908c;
            list2.clear();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                dk2.zf zfVar = (dk2.zf) obj;
                if ((zfVar.getType() == 100000 || zfVar.getType() == 100004) ? false : true) {
                    arrayList.add(obj);
                }
            }
            list2.addAll(arrayList);
            bg2.a.f19907b = j17;
            r45.ta4 ta4Var = (r45.ta4) enterLiveParams.getCustom(7);
            if (ta4Var == null) {
                ta4Var = new r45.ta4();
            }
            ta4Var.set(19, java.lang.Boolean.TRUE);
            enterLiveParams.set(7, ta4Var);
        }
    }

    @Override // tc2.h
    public void onLiveEnd() {
        this.f20537h.clear();
    }
}
