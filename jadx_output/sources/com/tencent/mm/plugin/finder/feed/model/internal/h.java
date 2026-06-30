package com.tencent.mm.plugin.finder.feed.model.internal;

/* loaded from: classes2.dex */
public class h extends com.tencent.mm.plugin.finder.feed.model.internal.a0 {
    private final boolean runUiThread;
    final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<com.tencent.mm.plugin.finder.feed.model.internal.r0> this$0;

    public h(com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, boolean z17) {
        this.this$0 = baseFeedLoader;
        this.runUiThread = z17;
    }

    public static /* synthetic */ com.tencent.mm.plugin.finder.feed.model.internal.u0 merge$default(com.tencent.mm.plugin.finder.feed.model.internal.h hVar, java.util.List list, int i17, java.lang.Object obj, int i18, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: merge");
        }
        if ((i18 & 4) != 0) {
            obj = null;
        }
        return hVar.merge(list, i17, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[LOOP:0: B:2:0x0011->B:16:0x0053, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[EDGE_INSN: B:17:0x0057->B:18:0x0057 BREAK  A[LOOP:0: B:2:0x0011->B:16:0x0053], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int calculateIndex(com.tencent.mm.plugin.finder.feed.model.internal.t0 r12) {
        /*
            r11 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.o.g(r12, r0)
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<com.tencent.mm.plugin.finder.feed.model.internal.r0> r0 = r11.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r0 = r0.getDataList()
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
            com.tencent.mm.plugin.finder.feed.model.internal.r0 r3 = (com.tencent.mm.plugin.finder.feed.model.internal.r0) r3
            boolean r7 = r3 instanceof so2.h1
            if (r7 == 0) goto L4f
            so2.h1 r3 = (so2.h1) r3
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r3.getFeedObject()
            r45.nw1 r7 = r7.getLiveInfo()
            if (r7 == 0) goto L38
            int r7 = r7.getInteger(r4)
            if (r7 != r6) goto L38
            r7 = r6
            goto L39
        L38:
            r7 = r1
        L39:
            if (r7 == 0) goto L4f
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            long r7 = r3.getId()
            long r9 = r12.f108046a
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
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<com.tencent.mm.plugin.finder.feed.model.internal.r0> r3 = r11.this$0
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r3 = r3.getDataList()
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.internal.h.calculateIndex(com.tencent.mm.plugin.finder.feed.model.internal.t0):int");
    }

    public boolean canFinallyHandleMergeList(int i17) {
        return false;
    }

    public void cleanDataList(com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<com.tencent.mm.plugin.finder.feed.model.internal.r0> dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        dataList.clear();
    }

    public final void convertOpToReason(com.tencent.mm.plugin.finder.feed.model.internal.y0 op6, ym5.s3 reason) {
        kotlin.jvm.internal.o.g(op6, "op");
        kotlin.jvm.internal.o.g(reason, "reason");
        java.lang.Object obj = op6.f108073d;
        int i17 = op6.f108070a;
        com.tencent.mm.plugin.finder.feed.model.internal.u0 mergeDataAndNotify = mergeDataAndNotify(i17, op6.f108071b, op6.f108072c, obj);
        reason.f463519d = mergeDataAndNotify;
        reason.f463523h = mergeDataAndNotify.f108053b;
        reason.f463527l = i17;
    }

    public boolean filterSameFeed() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public int findMergeIndex(java.util.ArrayList<com.tencent.mm.plugin.finder.feed.model.internal.r0> srcList, java.util.List<com.tencent.mm.plugin.finder.feed.model.internal.r0> newList, int i17, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(srcList, "srcList");
        kotlin.jvm.internal.o.g(newList, "newList");
        if (i17 == 1 || i17 == 5 || i17 == 9 || i17 == 13) {
            return this.this$0.getDataList().size();
        }
        if (i17 == 2 || i17 == 4 || i17 == 6 || i17 == 10 || i17 != 11) {
            return 0;
        }
        return this.this$0.getDataList().size();
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public androidx.recyclerview.widget.r1 getListUpdateCallback() {
        return new com.tencent.mm.plugin.finder.feed.model.internal.b(this.this$0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.tencent.mm.plugin.finder.feed.model.internal.u0 merge(java.util.List<com.tencent.mm.plugin.finder.feed.model.internal.r0> newList, int i17, java.lang.Object obj) {
        int i18;
        boolean z17;
        kotlin.jvm.internal.o.g(newList, "newList");
        printList("newList", i17, newList);
        java.util.ArrayList<com.tencent.mm.plugin.finder.feed.model.internal.r0> dataList = this.this$0.getDataList();
        java.util.LinkedList<com.tencent.mm.plugin.finder.feed.model.internal.r0> linkedList = new java.util.LinkedList<>();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<com.tencent.mm.plugin.finder.feed.model.internal.r0> baseFeedLoader = this.this$0;
        java.util.Iterator<T> it = newList.iterator();
        boolean z18 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.finder.feed.model.internal.r0 r0Var = (com.tencent.mm.plugin.finder.feed.model.internal.r0) it.next();
            boolean z19 = r0Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = z19 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r0Var : null;
            java.lang.String w17 = baseFinderFeed != null ? baseFinderFeed.w() : null;
            java.util.Iterator<com.tencent.mm.plugin.finder.feed.model.internal.r0> it6 = dataList.iterator();
            int i19 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i19 = -1;
                    break;
                }
                com.tencent.mm.plugin.finder.feed.model.internal.r0 next = it6.next();
                if (((next instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) && z19 && next.d(r0Var) == 0) || ((next instanceof so2.j3) && (r0Var instanceof so2.j3) && next.d(r0Var) == 0) || sameFeed(next, r0Var)) {
                    break;
                }
                i19++;
            }
            java.util.Iterator<com.tencent.mm.plugin.finder.feed.model.internal.r0> it7 = linkedList.iterator();
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
            if (!(w17 == null || w17.length() == 0) || ((i19 == -1 && i27 == -1) || !filterSameFeed())) {
                linkedList.add(r0Var);
            } else if (i19 != -1) {
                dataList.set(i19, r0Var);
                z18 = onDataReplace(r0Var, i19);
                linkedList2.add(java.lang.Integer.valueOf(i19));
            } else {
                com.tencent.mars.xlog.Log.w(baseFeedLoader.getTAG(), "newList exist a same feed[" + linkedList.get(i27) + "], just ignore this feed=" + r0Var + " existIndex=" + i19 + " existIndexInIncrementList=" + i27);
            }
        }
        printList("incrementList", i17, linkedList);
        if ((linkedList.size() > 0 || canFinallyHandleMergeList(i17) ? linkedList : null) != null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<com.tencent.mm.plugin.finder.feed.model.internal.r0> baseFeedLoader2 = this.this$0;
            int findMergeIndex = findMergeIndex(dataList, linkedList, i17, obj);
            boolean finallyHandleMergeList = finallyHandleMergeList(dataList, linkedList, findMergeIndex, i17, obj);
            com.tencent.mars.xlog.Log.i(baseFeedLoader2.getTAG(), "merge list index " + findMergeIndex + " incrementList:" + linkedList.size() + " cmd=" + i17);
            dataList.addAll(findMergeIndex, linkedList);
            z17 = finallyHandleMergeList;
            i18 = findMergeIndex;
        } else {
            i18 = 0;
            z17 = false;
        }
        com.tencent.mm.plugin.finder.feed.model.internal.u0 u0Var = new com.tencent.mm.plugin.finder.feed.model.internal.u0(i18, linkedList.size(), linkedList2, z17, z18);
        printList("dataList", i17, this.this$0.getDataList());
        return u0Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public com.tencent.mm.plugin.finder.feed.model.internal.u0 mergeDataAndNotify(int i17, java.util.List list, boolean z17, java.lang.Object obj) {
        java.lang.Integer num;
        if (list == null) {
            return new com.tencent.mm.plugin.finder.feed.model.internal.u0(-1, 0, new java.util.LinkedList(), false, false, 24, null);
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i(this.this$0.getTAG(), "nothing need to notify, just return. cmd=" + i17 + " size =" + list.size());
            return new com.tencent.mm.plugin.finder.feed.model.internal.u0(-1, 0, new java.util.LinkedList(), false, false, 24, null);
        }
        int size = this.this$0.getDataList().size();
        if ((i17 == 4 || i17 == 10 || i17 == 3 || i17 == 7) && needCleanWhenRefresh(list) && ((!list.isEmpty()) || i17 == 7)) {
            cleanDataList(this.this$0.getDataList());
            if (i17 == 4 || i17 == 10) {
                this.this$0.getDispatcher().e(0, size);
            }
        }
        com.tencent.mm.plugin.finder.feed.model.internal.u0 merge = merge(list, i17, obj);
        java.lang.String tag = this.this$0.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mergeDataAndNotify insertIndex=");
        sb6.append(merge.f108052a);
        sb6.append(" insertCount=");
        sb6.append(merge.f108053b);
        sb6.append(" changeIndex=");
        java.util.LinkedList linkedList = merge.f108054c;
        sb6.append(linkedList);
        sb6.append(" size: ");
        sb6.append(this.this$0.getDataList().size());
        sb6.append(" isRemoveBeforeInsert=");
        boolean z18 = merge.f108055d;
        sb6.append(z18);
        sb6.append(" loader:");
        sb6.append(getClass().getSimpleName());
        sb6.append(" cmd:");
        sb6.append(com.tencent.mm.plugin.finder.feed.model.internal.y0.f108069e.a(i17));
        sb6.append('}');
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        if ((!linkedList.isEmpty()) && merge.f108053b <= 0 && i17 != 9) {
            com.tencent.mars.xlog.Log.i(this.this$0.getTAG(), "just change all. cmd=" + i17);
            this.this$0.getDispatcher().a();
            return merge;
        }
        if (i17 == 2 || i17 == 3 || i17 == 6 || i17 == 7) {
            this.this$0.getDispatcher().a();
        } else {
            int i18 = merge.f108052a;
            if (z18) {
                this.this$0.getDispatcher().e(i18, size - i18);
            }
            if (i17 == 9 && (num = (java.lang.Integer) kz5.n0.Z(linkedList)) != null) {
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<com.tencent.mm.plugin.finder.feed.model.internal.r0> baseFeedLoader = this.this$0;
                if (num.intValue() == 0) {
                    baseFeedLoader.getDispatcher().c(0, 1, 1);
                }
            }
            if (merge.f108053b > 0) {
                this.this$0.getDispatcher().d(i18, merge.f108053b);
            }
        }
        return merge;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeInit(com.tencent.mm.plugin.finder.feed.model.internal.IResponse<com.tencent.mm.plugin.finder.feed.model.internal.r0> response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        if (response.getIncrementList() == null) {
            response.setIncrementList(kz5.p0.f313996d);
        }
        java.lang.String tag = this.this$0.getTAG();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initData dataFetch.initData ");
        java.util.List<com.tencent.mm.plugin.finder.feed.model.internal.r0> incrementList = response.getIncrementList();
        sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
        com.tencent.mars.xlog.Log.i(tag, sb6.toString());
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<com.tencent.mm.plugin.finder.feed.model.internal.r0> baseFeedLoader = this.this$0;
        baseFeedLoader.checkIsNeedUiThread(this.runUiThread, new com.tencent.mm.plugin.finder.feed.model.internal.c(baseFeedLoader, response, lVar));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeInsert(com.tencent.mm.plugin.finder.feed.model.internal.IResponse<com.tencent.mm.plugin.finder.feed.model.internal.r0> response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        ym5.s3 s3Var = new ym5.s3(2);
        s3Var.f463522g = true;
        s3Var.f463521f = true;
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = new com.tencent.mm.plugin.finder.feed.model.internal.y0(8, response.getIncrementList(), false, null, 12, null);
        y0Var.f108073d = response.getRequest();
        this.this$0.checkIsNeedUiThread(this.runUiThread, new com.tencent.mm.plugin.finder.feed.model.internal.d(this, y0Var, s3Var, lVar, response));
    }

    public final com.tencent.mm.plugin.finder.feed.model.internal.u0 mergeInsertData(java.util.List<com.tencent.mm.plugin.finder.feed.model.internal.r0> newList, int i17) {
        kotlin.jvm.internal.o.g(newList, "newList");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<com.tencent.mm.plugin.finder.feed.model.internal.r0> baseFeedLoader = this.this$0;
        for (com.tencent.mm.plugin.finder.feed.model.internal.r0 r0Var : newList) {
            java.util.Iterator it = baseFeedLoader.getDataList().iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (((com.tencent.mm.plugin.finder.feed.model.internal.r0) it.next()).d(r0Var) == 0) {
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
        com.tencent.mars.xlog.Log.i(this.this$0.getTAG(), "mergeInsertData startIndex = " + i17 + ", incrementSize: " + linkedList.size());
        this.this$0.getDataList().addAll(i17, linkedList);
        return new com.tencent.mm.plugin.finder.feed.model.internal.u0(i17, linkedList.size(), new java.util.LinkedList(), true, false);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeInsertSpecifiedLocation(com.tencent.mm.plugin.finder.feed.model.internal.IResponse<com.tencent.mm.plugin.finder.feed.model.internal.r0> response, com.tencent.mm.plugin.finder.feed.model.internal.t0 data, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        kotlin.jvm.internal.o.g(data, "data");
        ym5.s3 s3Var = new ym5.s3(2);
        s3Var.f463522g = true;
        s3Var.f463521f = true;
        java.util.List<com.tencent.mm.plugin.finder.feed.model.internal.r0> incrementList = response.getIncrementList();
        if (incrementList != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.feed.model.internal.e(this, data, incrementList, this.this$0, s3Var, lVar, response));
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        ym5.s3 s3Var = new ym5.s3(1);
        java.util.List incrementList = response.getIncrementList();
        s3Var.f463522g = incrementList != null ? incrementList.isEmpty() : true;
        s3Var.f463521f = response.getHasMore();
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = new com.tencent.mm.plugin.finder.feed.model.internal.y0(response.getHasMore() ? 1 : 5, response.getIncrementList(), false, null, 12, null);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<com.tencent.mm.plugin.finder.feed.model.internal.r0> baseFeedLoader = this.this$0;
        baseFeedLoader.checkIsNeedUiThread(this.runUiThread, new com.tencent.mm.plugin.finder.feed.model.internal.f(this, y0Var, s3Var, baseFeedLoader, lVar, response));
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.a0
    public void mergeRefresh(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response, yz5.l lVar) {
        kotlin.jvm.internal.o.g(response, "response");
        ym5.s3 s3Var = new ym5.s3(0);
        com.tencent.mm.plugin.finder.feed.model.internal.y0 y0Var = new com.tencent.mm.plugin.finder.feed.model.internal.y0(response.getHasMore() ? 2 : 6, response.getIncrementList(), false, null, 12, null);
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<com.tencent.mm.plugin.finder.feed.model.internal.r0> baseFeedLoader = this.this$0;
        baseFeedLoader.checkIsNeedUiThread(this.runUiThread, new com.tencent.mm.plugin.finder.feed.model.internal.g(this, y0Var, s3Var, lVar, response, baseFeedLoader));
    }

    public boolean onDataReplace(com.tencent.mm.plugin.finder.feed.model.internal.r0 feed, int i17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        return false;
    }

    public final void printList(java.lang.String tag, int i17, java.util.List<com.tencent.mm.plugin.finder.feed.model.internal.r0> mmlist) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(mmlist, "mmlist");
        if (getDEBUG()) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<com.tencent.mm.plugin.finder.feed.model.internal.r0> baseFeedLoader = this.this$0;
            int i18 = 0;
            for (java.lang.Object obj : mmlist) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mars.xlog.Log.i(baseFeedLoader.getTAG(), tag + " index " + i18 + " cmd:" + com.tencent.mm.plugin.finder.feed.model.internal.y0.f108069e.a(i17) + ' ' + ((com.tencent.mm.plugin.finder.feed.model.internal.r0) obj));
                i18 = i19;
            }
        }
    }

    public boolean sameFeed(com.tencent.mm.plugin.finder.feed.model.internal.r0 existFeed, com.tencent.mm.plugin.finder.feed.model.internal.r0 compareFeed) {
        kotlin.jvm.internal.o.g(existFeed, "existFeed");
        kotlin.jvm.internal.o.g(compareFeed, "compareFeed");
        return false;
    }

    public /* synthetic */ h(com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this(baseFeedLoader, (i17 & 1) != 0 ? true : z17);
    }
}
