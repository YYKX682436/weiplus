package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd;

/* loaded from: classes2.dex */
public class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0 {

    /* renamed from: runUiThread */
    private final boolean f35740x6e482d69;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> f35741xcbdd23aa;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122, boolean z17) {
        this.f35741xcbdd23aa = abstractC13919x46aff122;
        this.f35740x6e482d69 = z17;
    }

    /* renamed from: merge$default */
    public static /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0 m56446xa50211d5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h hVar, java.util.List list, int i17, java.lang.Object obj, int i18, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: merge");
        }
        if ((i18 & 4) != 0) {
            obj = null;
        }
        return hVar.mo56452x62fa438(list, i17, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[LOOP:0: B:2:0x0011->B:16:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[EDGE_INSN: B:17:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:2:0x0011->B:16:0x0053], SYNTHETIC] */
    /* renamed from: calculateIndex */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int mo56447xc373650c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.t0 r12) {
        /*
            r11 = this;
            java.lang.String r0 = "data"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<com.tencent.mm.plugin.finder.feed.model.internal.r0> r0 = r11.f35741xcbdd23aa
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.m56387xe6796cde()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L11:
            boolean r3 = r0.hasNext()
            r4 = 2
            r5 = -1
            r6 = 1
            if (r3 == 0) goto L56
            java.lang.Object r3 = r0.next()
            com.tencent.mm.plugin.finder.feed.model.internal.r0 r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0) r3
            boolean r7 = r3 instanceof so2.h1
            if (r7 == 0) goto L4f
            so2.h1 r3 = (so2.h1) r3
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r3.getFeedObject()
            r45.nw1 r7 = r7.m59258xd0557130()
            if (r7 == 0) goto L38
            int r7 = r7.m75939xb282bd08(r4)
            if (r7 != r6) goto L38
            r7 = r6
            goto L39
        L38:
            r7 = r1
        L39:
            if (r7 == 0) goto L4f
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            long r7 = r3.m76784x5db1b11()
            long r9 = r12.f189579a
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 != 0) goto L4f
            r3 = r6
            goto L50
        L4f:
            r3 = r1
        L50:
            if (r3 == 0) goto L53
            goto L57
        L53:
            int r2 = r2 + 1
            goto L11
        L56:
            r2 = r5
        L57:
            if (r2 != r5) goto L5a
            return r5
        L5a:
            if (r2 < 0) goto L73
            r12 = r1
            r0 = r12
        L5e:
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<com.tencent.mm.plugin.finder.feed.model.internal.r0> r3 = r11.f35741xcbdd23aa
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r3 = r3.m56387xe6796cde()
            java.lang.Object r3 = r3.get(r12)
            boolean r3 = r3 instanceof so2.h1
            if (r3 != 0) goto L6e
            int r0 = r0 + 1
        L6e:
            if (r12 == r2) goto L74
            int r12 = r12 + 1
            goto L5e
        L73:
            r0 = r1
        L74:
            int r0 = r0 % r4
            if (r0 != 0) goto L78
            goto L79
        L78:
            r1 = r6
        L79:
            int r12 = r2 % 2
            if (r12 != 0) goto L80
            if (r1 != 0) goto L82
            goto L83
        L80:
            if (r1 != 0) goto L83
        L82:
            r4 = r6
        L83:
            int r2 = r2 + r4
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h.mo56447xc373650c(com.tencent.mm.plugin.finder.feed.model.internal.t0):int");
    }

    /* renamed from: canFinallyHandleMergeList */
    public boolean m56448xda71539b(int i17) {
        return false;
    }

    /* renamed from: cleanDataList */
    public void mo56449xed8cf0d1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> dataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        dataList.clear();
    }

    /* renamed from: convertOpToReason */
    public final void m56450x8edc3bb3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0 op6, ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(op6, "op");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        java.lang.Object obj = op6.f189606d;
        int i17 = op6.f189603a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0 mo1053x5ee561e = mo1053x5ee561e(i17, op6.f189604b, op6.f189605c, obj);
        reason.f545052d = mo1053x5ee561e;
        reason.f545056h = mo1053x5ee561e.f189586b;
        reason.f545060l = i17;
    }

    /* renamed from: filterSameFeed */
    public boolean mo56451x6910aebc() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: findMergeIndex */
    public int mo56341x7e573613(java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> srcList, java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> newList, int i17, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcList, "srcList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newList, "newList");
        if (i17 == 1 || i17 == 5 || i17 == 9 || i17 == 13) {
            return this.f35741xcbdd23aa.m56387xe6796cde().size();
        }
        if (i17 == 2 || i17 == 4 || i17 == 6 || i17 == 10 || i17 != 11) {
            return 0;
        }
        return this.f35741xcbdd23aa.m56387xe6796cde().size();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: getListUpdateCallback */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.r1 mo56442x10675662() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.b(this.f35741xcbdd23aa);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: merge */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0 mo56452x62fa438(java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> newList, int i17, java.lang.Object obj) {
        int i18;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newList, "newList");
        m56455x94e0b8eb("newList", i17, newList);
        java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> m56387xe6796cde = this.f35741xcbdd23aa.m56387xe6796cde();
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> linkedList = new java.util.LinkedList<>();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> abstractC13919x46aff122 = this.f35741xcbdd23aa;
        java.util.Iterator<T> it = newList.iterator();
        boolean z18 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0) it.next();
            boolean z19 = r0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = z19 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) r0Var : null;
            java.lang.String w17 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.w() : null;
            java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> it6 = m56387xe6796cde.iterator();
            int i19 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i19 = -1;
                    break;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 next = it6.next();
                if (((next instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) && z19 && next.d(r0Var) == 0) || ((next instanceof so2.j3) && (r0Var instanceof so2.j3) && next.d(r0Var) == 0) || mo56039x75147724(next, r0Var)) {
                    break;
                }
                i19++;
            }
            java.util.Iterator<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> it7 = linkedList.iterator();
            int i27 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    i27 = -1;
                    break;
                }
                if (it7.next().d(r0Var) == 0) {
                    break;
                }
                i27++;
            }
            if (!(w17 == null || w17.length() == 0) || ((i19 == -1 && i27 == -1) || !mo56451x6910aebc())) {
                linkedList.add(r0Var);
            } else if (i19 != -1) {
                m56387xe6796cde.set(i19, r0Var);
                z18 = mo56454x581d04b(r0Var, i19);
                linkedList2.add(java.lang.Integer.valueOf(i19));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(abstractC13919x46aff122.getTAG(), "newList exist a same feed[" + linkedList.get(i27) + "], just ignore this feed=" + r0Var + " existIndex=" + i19 + " existIndexInIncrementList=" + i27);
            }
        }
        m56455x94e0b8eb("incrementList", i17, linkedList);
        if ((linkedList.size() > 0 || m56448xda71539b(i17) ? linkedList : null) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> abstractC13919x46aff1222 = this.f35741xcbdd23aa;
            int mo56341x7e573613 = mo56341x7e573613(m56387xe6796cde, linkedList, i17, obj);
            boolean m56438x2e93e3ab = m56438x2e93e3ab(m56387xe6796cde, linkedList, mo56341x7e573613, i17, obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC13919x46aff1222.getTAG(), "merge list index " + mo56341x7e573613 + " incrementList:" + linkedList.size() + " cmd=" + i17);
            m56387xe6796cde.addAll(mo56341x7e573613, linkedList);
            z17 = m56438x2e93e3ab;
            i18 = mo56341x7e573613;
        } else {
            i18 = 0;
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0 u0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0(i18, linkedList.size(), linkedList2, z17, z18);
        m56455x94e0b8eb("dataList", i17, this.f35741xcbdd23aa.m56387xe6796cde());
        return u0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeDataAndNotify */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0 mo1053x5ee561e(int i17, java.util.List list, boolean z17, java.lang.Object obj) {
        java.lang.Integer num;
        if (list == null) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0(-1, 0, new java.util.LinkedList(), false, false, 24, null);
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f35741xcbdd23aa.getTAG(), "nothing need to notify, just return. cmd=" + i17 + " size =" + list.size());
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0(-1, 0, new java.util.LinkedList(), false, false, 24, null);
        }
        int size = this.f35741xcbdd23aa.m56387xe6796cde().size();
        if ((i17 == 4 || i17 == 10 || i17 == 3 || i17 == 7) && mo56445x151f84ee(list) && ((!list.isEmpty()) || i17 == 7)) {
            mo56449xed8cf0d1(this.f35741xcbdd23aa.m56387xe6796cde());
            if (i17 == 4 || i17 == 10) {
                this.f35741xcbdd23aa.getDispatcher().e(0, size);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0 mo56452x62fa438 = mo56452x62fa438(list, i17, obj);
        java.lang.String tag = this.f35741xcbdd23aa.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mergeDataAndNotify insertIndex=");
        sb6.append(mo56452x62fa438.f189585a);
        sb6.append(" insertCount=");
        sb6.append(mo56452x62fa438.f189586b);
        sb6.append(" changeIndex=");
        java.util.LinkedList linkedList = mo56452x62fa438.f189587c;
        sb6.append(linkedList);
        sb6.append(" size: ");
        sb6.append(this.f35741xcbdd23aa.m56387xe6796cde().size());
        sb6.append(" isRemoveBeforeInsert=");
        boolean z18 = mo56452x62fa438.f189588d;
        sb6.append(z18);
        sb6.append(" loader:");
        sb6.append(getClass().getSimpleName());
        sb6.append(" cmd:");
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0.f189602e.a(i17));
        sb6.append('}');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, sb6.toString());
        if ((!linkedList.isEmpty()) && mo56452x62fa438.f189586b <= 0 && i17 != 9) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f35741xcbdd23aa.getTAG(), "just change all. cmd=" + i17);
            this.f35741xcbdd23aa.getDispatcher().a();
            return mo56452x62fa438;
        }
        if (i17 == 2 || i17 == 3 || i17 == 6 || i17 == 7) {
            this.f35741xcbdd23aa.getDispatcher().a();
        } else {
            int i18 = mo56452x62fa438.f189585a;
            if (z18) {
                this.f35741xcbdd23aa.getDispatcher().e(i18, size - i18);
            }
            if (i17 == 9 && (num = (java.lang.Integer) kz5.n0.Z(linkedList)) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> abstractC13919x46aff122 = this.f35741xcbdd23aa;
                if (num.intValue() == 0) {
                    abstractC13919x46aff122.getDispatcher().c(0, 1, 1);
                }
            }
            if (mo56452x62fa438.f189586b > 0) {
                this.f35741xcbdd23aa.getDispatcher().d(i18, mo56452x62fa438.f189586b);
            }
        }
        return mo56452x62fa438;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeInit */
    public void mo1054x60f5a168(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        if (response.m56409x97891cf7() == null) {
            response.m56420x2a5f836b(kz5.p0.f395529d);
        }
        java.lang.String tag = this.f35741xcbdd23aa.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initData dataFetch.initData ");
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> m56409x97891cf7 = response.m56409x97891cf7();
        sb6.append(m56409x97891cf7 != null ? java.lang.Integer.valueOf(m56409x97891cf7.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> abstractC13919x46aff122 = this.f35741xcbdd23aa;
        abstractC13919x46aff122.m56350xb5ecf5e6(this.f35740x6e482d69, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.c(abstractC13919x46aff122, response, lVar));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeInsert */
    public void mo56443xfa174911(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        ym5.s3 s3Var = new ym5.s3(2);
        s3Var.f545055g = true;
        s3Var.f545054f = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0(8, response.m56409x97891cf7(), false, null, 12, null);
        y0Var.f189606d = response.getRequest();
        this.f35741xcbdd23aa.m56350xb5ecf5e6(this.f35740x6e482d69, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.d(this, y0Var, s3Var, lVar, response));
    }

    /* renamed from: mergeInsertData */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0 m56453x1c5abc5b(java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> newList, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newList, "newList");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> abstractC13919x46aff122 = this.f35741xcbdd23aa;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 r0Var : newList) {
            java.util.Iterator it = abstractC13919x46aff122.m56387xe6796cde().iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0) it.next()).d(r0Var) == 0) {
                    break;
                }
                i18++;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
            if (!(valueOf.intValue() == -1)) {
                valueOf = null;
            }
            if (valueOf != null) {
                valueOf.intValue();
                linkedList.add(r0Var);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f35741xcbdd23aa.getTAG(), "mergeInsertData startIndex = " + i17 + ", incrementSize: " + linkedList.size());
        this.f35741xcbdd23aa.m56387xe6796cde().addAll(i17, linkedList);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0(i17, linkedList.size(), new java.util.LinkedList(), true, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeInsertSpecifiedLocation */
    public void mo56444x985fac74(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> response, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.t0 data, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        ym5.s3 s3Var = new ym5.s3(2);
        s3Var.f545055g = true;
        s3Var.f545054f = true;
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> m56409x97891cf7 = response.m56409x97891cf7();
        if (m56409x97891cf7 != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.e(this, data, m56409x97891cf7, this.f35741xcbdd23aa, s3Var, lVar, response));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeLoadMore */
    public void mo1055x1f1ce1b3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        ym5.s3 s3Var = new ym5.s3(1);
        java.util.List m56409x97891cf7 = response.m56409x97891cf7();
        s3Var.f545055g = m56409x97891cf7 != null ? m56409x97891cf7.isEmpty() : true;
        s3Var.f545054f = response.getHasMore();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0(response.getHasMore() ? 1 : 5, response.m56409x97891cf7(), false, null, 12, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> abstractC13919x46aff122 = this.f35741xcbdd23aa;
        abstractC13919x46aff122.m56350xb5ecf5e6(this.f35740x6e482d69, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.f(this, y0Var, s3Var, abstractC13919x46aff122, lVar, response));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeRefresh */
    public void mo1056x14dcd783(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        ym5.s3 s3Var = new ym5.s3(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0(response.getHasMore() ? 2 : 6, response.m56409x97891cf7(), false, null, 12, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> abstractC13919x46aff122 = this.f35741xcbdd23aa;
        abstractC13919x46aff122.m56350xb5ecf5e6(this.f35740x6e482d69, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.g(this, y0Var, s3Var, lVar, response, abstractC13919x46aff122));
    }

    /* renamed from: onDataReplace */
    public boolean mo56454x581d04b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 feed, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        return false;
    }

    /* renamed from: printList */
    public final void m56455x94e0b8eb(java.lang.String tag, int i17, java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> mmlist) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmlist, "mmlist");
        if (m56440x743f349d()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0> abstractC13919x46aff122 = this.f35741xcbdd23aa;
            int i18 = 0;
            for (java.lang.Object obj : mmlist) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC13919x46aff122.getTAG(), tag + " index " + i18 + " cmd:" + com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.y0.f189602e.a(i17) + ' ' + ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0) obj));
                i18 = i19;
            }
        }
    }

    /* renamed from: sameFeed */
    public boolean mo56039x75147724(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 existFeed, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 compareFeed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(existFeed, "existFeed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compareFeed, "compareFeed");
        return false;
    }

    public /* synthetic */ h(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(abstractC13919x46aff122, (i17 & 1) != 0 ? true : z17);
    }
}
