package cp2;

/* loaded from: classes2.dex */
public final class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc f302412a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc) {
        super(c14500x958689dc, false);
        this.f302412a = c14500x958689dc;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h
    /* renamed from: calculateIndex */
    public int mo56447xc373650c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.t0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = this.f302412a;
        java.lang.String f204960d = c14500x958689dc.getF204960d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("calculateIndex : ");
        boolean z17 = data.f189580b;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f204960d, sb6.toString());
        if (!z17) {
            return super.mo56447xc373650c(data);
        }
        java.util.Iterator it = c14500x958689dc.m56387xe6796cde().iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            so2.j5 j5Var = (so2.j5) it.next();
            if ((j5Var instanceof so2.h4) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((so2.h4) j5Var).f491933d.m75945x2fec8307(1), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h6n))) {
                break;
            }
            i17++;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        return (valueOf != null ? valueOf.intValue() : 0) + 1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeLoadMore */
    public void mo1055x1f1ce1b3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa response, yz5.l lVar) {
        java.util.LinkedList linkedList;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        java.lang.Object request = response.getRequest();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(request, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader.FinderLiveFriendsRequest");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc c14500x958689dc = this.f302412a;
        int i18 = ((cp2.l) request).f302374h;
        if (i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc.c(c14500x958689dc, false, response.getHasMore(), "mergeLoadMore0");
            super.mo1055x1f1ce1b3(response, lVar);
            pm0.v.X(new cp2.n(c14500x958689dc));
            return;
        }
        if (i18 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.C14500x958689dc.c(c14500x958689dc, true, response.getHasMore(), "mergeLoadMore1");
            ym5.s3 s3Var = new ym5.s3(1);
            java.util.List m56409x97891cf7 = response.m56409x97891cf7();
            s3Var.f545055g = m56409x97891cf7 != null ? m56409x97891cf7.isEmpty() : true;
            s3Var.f545054f = true;
            s3Var.f545050b = 1;
            java.util.List m56409x97891cf72 = response.m56409x97891cf7();
            if (m56409x97891cf72 == null) {
                m56409x97891cf72 = new java.util.LinkedList();
            }
            java.util.Iterator it = c14500x958689dc.m56387xe6796cde().iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                }
                so2.j5 j5Var = (so2.j5) it.next();
                if ((j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) j5Var).f192726e == 4) {
                    break;
                } else {
                    i19++;
                }
            }
            java.util.LinkedList linkedList2 = i19 > 0 ? new java.util.LinkedList(c14500x958689dc.m56387xe6796cde().subList(0, i19)) : new java.util.LinkedList(c14500x958689dc.m56387xe6796cde());
            if (i19 <= 0 || (i17 = i19 + 1) >= c14500x958689dc.m56387xe6796cde().size()) {
                boolean hasMore = response.getHasMore();
                java.lang.String f204960d = c14500x958689dc.getF204960d();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkIfAddOldRecommendList isFetchFollowMoreResp:true hasMoreFollowList:");
                sb6.append(hasMore);
                sb6.append(" recommendFeedList:");
                java.util.LinkedList linkedList3 = c14500x958689dc.f203010u;
                sb6.append(linkedList3.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f204960d, sb6.toString());
                linkedList = !hasMore ? linkedList3 : new java.util.LinkedList();
            } else {
                boolean hasMore2 = response.getHasMore();
                java.util.LinkedList linkedList4 = new java.util.LinkedList(c14500x958689dc.m56387xe6796cde().subList(i17, c14500x958689dc.m56387xe6796cde().size()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14500x958689dc.getF204960d(), "checkIfSaveRecommendList isFetchFollowMoreResp:true hasMoreFollowList:" + hasMore2 + " recommendList:" + linkedList4.size());
                linkedList = c14500x958689dc.f203010u;
                linkedList.clear();
                linkedList.addAll(linkedList4);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var4 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
            java.util.LinkedList linkedList5 = new java.util.LinkedList(c14500x958689dc.m56387xe6796cde());
            java.util.LinkedList linkedList6 = new java.util.LinkedList();
            linkedList6.addAll(linkedList2);
            linkedList6.addAll(m56409x97891cf72);
            if (!response.getHasMore()) {
                linkedList6.addAll(linkedList);
                if (i19 > 0) {
                    f0Var3.f391649d = i19;
                    f0Var4.f391649d = 1;
                    f0Var.f391649d = i19;
                    f0Var2.f391649d = m56409x97891cf72.size() + linkedList.size();
                } else {
                    f0Var3.f391649d = -1;
                    f0Var4.f391649d = 0;
                    f0Var.f391649d = linkedList5.size();
                    f0Var2.f391649d = m56409x97891cf72.size() + linkedList.size();
                }
            } else if (i19 > 0) {
                f0Var3.f391649d = i19;
                f0Var4.f391649d = linkedList.size() + 1;
                f0Var.f391649d = i19;
                f0Var2.f391649d = m56409x97891cf72.size();
            } else {
                f0Var3.f391649d = -1;
                f0Var4.f391649d = 0;
                f0Var.f391649d = linkedList5.size();
                f0Var2.f391649d = m56409x97891cf72.size();
            }
            java.lang.String p17 = hc2.o0.p(linkedList6);
            java.lang.String p18 = hc2.o0.p(linkedList5);
            java.lang.String p19 = hc2.o0.p(linkedList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14500x958689dc.getF204960d(), "mergeLoadMore() hasMore:" + response.getHasMore() + " moreFollowCardIndex:" + i19 + " removeIndex:" + f0Var3.f391649d + "  removeSize:" + f0Var4.f391649d + " insertIndex:" + f0Var.f391649d + "  insertSize:" + f0Var2.f391649d + " newList:" + p17 + " oldList:" + p18 + " oldRecommendList:" + p19);
            pm0.v.X(new cp2.o(this.f302412a, linkedList6, f0Var3, f0Var4, f0Var, f0Var2, s3Var, lVar, response));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e5, code lost:
    
        if ((r13 != null && r13.m75939xb282bd08(2) == 1) == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9 A[LOOP:1: B:15:0x00b2->B:29:0x00f9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6 A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.a0
    /* renamed from: mergeRefresh */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1056x14dcd783(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa r19, yz5.l r20) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cp2.q.mo1056x14dcd783(com.tencent.mm.plugin.finder.feed.model.internal.IResponse, yz5.l):void");
    }
}
