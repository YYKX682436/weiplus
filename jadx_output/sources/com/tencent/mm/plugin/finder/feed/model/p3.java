package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class p3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f108246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.s3 f108247e;

    public p3(java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.feed.model.s3 s3Var) {
        this.f108246d = linkedList;
        this.f108247e = s3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = this.f108246d;
        if (linkedList2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList2) {
                if (obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                    arrayList2.add(obj);
                }
            }
            java.util.ArrayList<com.tencent.mm.plugin.finder.model.BaseFinderFeed> arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList2) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2;
                boolean z17 = com.tencent.mm.plugin.finder.feed.model.i1.f107930a.d(baseFinderFeed.getFeedObject().getUserName()) != null;
                if (z17) {
                    linkedList.add(baseFinderFeed.getFeedObject().getUserName());
                }
                if (!z17) {
                    arrayList3.add(obj2);
                }
            }
            arrayList = new java.util.ArrayList(kz5.d0.q(arrayList3, 10));
            for (com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 : arrayList3) {
                kotlin.jvm.internal.o.e(baseFinderFeed2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed2.getFeedObject();
                java.lang.Long valueOf = java.lang.Long.valueOf(feedObject.getExpectId());
                java.lang.String objectNonceId = feedObject.getObjectNonceId();
                java.lang.String str = "";
                if (objectNonceId == null) {
                    objectNonceId = "";
                }
                java.lang.String str2 = feedObject.field_username;
                if (str2 != null) {
                    str = str2;
                }
                arrayList.add(new jz5.o(valueOf, objectNonceId, str));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            if ((true ^ arrayList.isEmpty() ? arrayList : null) != null) {
                java.util.LinkedList linkedList3 = new java.util.LinkedList(arrayList);
                com.tencent.mm.plugin.finder.feed.model.s3 s3Var = this.f108247e;
                com.tencent.mm.sdk.platformtools.n3 J0 = s3Var.J0();
                int i17 = s3Var.f108323t;
                J0.removeMessages(i17);
                s3Var.J0().sendMessage(s3Var.J0().obtainMessage(i17, linkedList3));
            }
        }
    }
}
