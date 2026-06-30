package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class v {
    public v(kotlin.jvm.internal.i iVar) {
    }

    public final void a(r45.j51 j51Var, android.content.Context context, long j17, java.lang.String tag) {
        boolean z17;
        kotlin.jvm.internal.o.g(j51Var, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tag, "tag");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        long j18 = j51Var.getLong(13);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_FEED_COMMENT_OPTION_LONG_SYNC, java.lang.Long.valueOf(j18));
        java.util.List<com.tencent.mm.protocal.protobuf.FinderCommentInfo> list = j51Var.getList(12);
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        int i17 = 0;
        for (com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo : list) {
            if (i17 != finderCommentInfo.getContent_type() && (!arrayList2.isEmpty())) {
                arrayList.add(arrayList2);
                arrayList2.clear();
            }
            int content_type = finderCommentInfo.getContent_type();
            if (content_type == 1) {
                arrayList.add(kz5.b0.c(finderCommentInfo));
            } else if (content_type == 2) {
                if ((2 & j18) != 0) {
                    arrayList2.add(finderCommentInfo);
                } else {
                    arrayList.add(kz5.b0.c(finderCommentInfo));
                }
            }
            i17 = finderCommentInfo.getContent_type();
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(arrayList2);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((java.util.List) obj).size() == 1) {
                arrayList3.add(obj);
            }
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(kz5.d0.r(arrayList3));
        if (!linkedList.isEmpty()) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.finder.feed.model.t(context, tag, j17, linkedList));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList) {
            java.util.List list2 = (java.util.List) obj2;
            int size = list2.size();
            if (size >= 5) {
                if (!list2.isEmpty()) {
                    java.util.Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((com.tencent.mm.protocal.protobuf.FinderCommentInfo) it.next()).getContent_type() == 2) {
                            z17 = true;
                            break;
                        }
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.w(tag, "multiImageCommentDescList comments size = " + size);
            }
            z17 = false;
            if (z17) {
                arrayList4.add(obj2);
            }
        }
        if (!arrayList4.isEmpty()) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.finder.feed.model.u(j51Var, context, tag, j17, arrayList4));
        }
    }
}
