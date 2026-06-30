package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class b2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.k0 f102923d;

    public b2(so2.k0 k0Var) {
        this.f102923d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert$updateProgress$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0 f0Var = mv2.f0.f331561a;
        com.tencent.mm.plugin.finder.storage.x80 draft = this.f102923d.f410452d;
        kotlin.jvm.internal.o.g(draft, "draft");
        com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", "Finder.PostLog repost draft " + draft.field_localId + ", " + draft.field_objectId);
        com.tencent.mm.plugin.finder.storage.x80 D0 = ((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(draft.field_localId);
        if (D0 == null) {
            com.tencent.mars.xlog.Log.e("LogPost.FinderPostManager", "repost draftItem empty, " + draft.v0());
        } else {
            D0.field_localFlag = 1;
            com.tencent.mm.plugin.finder.storage.FinderItem t07 = D0.t0();
            r45.qb4 postInfo = t07.getPostInfo();
            postInfo.set(1, 0);
            postInfo.set(4, 0);
            if (postInfo.getInteger(2) == 2) {
                postInfo.set(2, 0);
            }
            java.util.Iterator<T> it = t07.getMediaList().iterator();
            while (it.hasNext()) {
                r45.dd4 dd4Var = (r45.dd4) ((r45.mb4) it.next()).getCustom(14);
                if (dd4Var != null) {
                    dd4Var.set(7, 0);
                }
            }
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = t07.field_reportObject;
            if (finderFeedReportObject != null) {
                finderFeedReportObject.setClickRepostCount(finderFeedReportObject.getClickRepostCount() + 1);
                hc2.p0.b(finderFeedReportObject, "clickRepost");
            }
            if (t07.isMvFeed()) {
                java.util.Iterator<T> it6 = t07.getClipListExt().iterator();
                while (it6.hasNext()) {
                    java.util.Iterator<T> it7 = ((com.tencent.mm.plugin.finder.storage.FinderItem) it6.next()).getMediaList().iterator();
                    while (it7.hasNext()) {
                        r45.dd4 dd4Var2 = (r45.dd4) ((r45.mb4) it7.next()).getCustom(14);
                        if (dd4Var2 != null) {
                            dd4Var2.set(7, 0);
                        }
                    }
                }
            }
            cu2.o.f222430a.b(D0);
            f0Var.c();
            boolean isLongVideo = D0.t0().isLongVideo();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.C(1718L, 15L, 1L);
            if (isLongVideo) {
                g0Var.C(1719L, 15L, 1L);
            }
            boolean isLongVideo2 = D0.t0().isLongVideo();
            g0Var.C(1718L, 42L, 1L);
            if (isLongVideo2) {
                g0Var.C(1719L, 42L, 1L);
            }
            if (D0.t0().isLongVideo()) {
                g0Var.C(1718L, 53L, 1L);
                g0Var.C(1719L, 53L, 1L);
            }
            com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent = new com.tencent.mm.autogen.events.FeedPostProgressEvent();
            long j17 = D0.field_localId;
            am.ga gaVar = feedPostProgressEvent.f54250g;
            gaVar.f6749a = j17;
            gaVar.f6750b = D0.getPostInfo().getInteger(4);
            feedPostProgressEvent.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderDraftInfoConvert$updateProgress$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
