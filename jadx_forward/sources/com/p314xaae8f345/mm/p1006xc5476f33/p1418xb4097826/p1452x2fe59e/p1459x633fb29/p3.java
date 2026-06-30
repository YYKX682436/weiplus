package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class p3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f189779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3 f189780e;

    public p3(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3 s3Var) {
        this.f189779d = linkedList;
        this.f189780e = s3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = this.f189779d;
        if (linkedList2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList2) {
                if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    arrayList2.add(obj);
                }
            }
            java.util.ArrayList<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5> arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj2;
                boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a.d(abstractC14490x69736cb5.getFeedObject().m59299x6bf53a6c()) != null;
                if (z17) {
                    linkedList.add(abstractC14490x69736cb5.getFeedObject().m59299x6bf53a6c());
                }
                if (!z17) {
                    arrayList3.add(obj2);
                }
            }
            arrayList = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 : arrayList3) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC14490x69736cb52, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = abstractC14490x69736cb52.getFeedObject();
                java.lang.Long valueOf = java.lang.Long.valueOf(feedObject.m59233x87980ca());
                java.lang.String m59276x6c285d75 = feedObject.m59276x6c285d75();
                java.lang.String str = "";
                if (m59276x6c285d75 == null) {
                    m59276x6c285d75 = "";
                }
                java.lang.String str2 = feedObject.f66949xdec927b;
                if (str2 != null) {
                    str = str2;
                }
                arrayList.add(new jz5.o(valueOf, m59276x6c285d75, str));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            if ((true ^ arrayList.isEmpty() ? arrayList : null) != null) {
                java.util.LinkedList linkedList3 = new java.util.LinkedList(arrayList);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3 s3Var = this.f189780e;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 J0 = s3Var.J0();
                int i17 = s3Var.f189856t;
                J0.mo50303x856b99f0(i17);
                s3Var.J0().mo50308x2936bf5f(s3Var.J0().mo50292x733c63a2(i17, linkedList3));
            }
        }
    }
}
