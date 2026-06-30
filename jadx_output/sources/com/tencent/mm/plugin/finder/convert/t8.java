package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class t8 {
    public t8(kotlin.jvm.internal.i iVar) {
    }

    public final int a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.plugin.finder.convert.qe.f104356x0 > 0) {
            return com.tencent.mm.plugin.finder.assist.h4.f102221a.d(context, com.tencent.mm.plugin.finder.convert.qe.f104356x0, 14.0f);
        }
        com.tencent.mars.xlog.Log.i("Finder.FeedFullConvert", "getRecommendTvMaxWords realMaxRecommendTvWidth=" + com.tencent.mm.plugin.finder.convert.qe.f104356x0 + '!');
        return 0;
    }

    public final java.util.Map b(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        if (finderItem == null) {
            return null;
        }
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(finderItem.getFeedObject().getId()));
        lVarArr[1] = new jz5.l("session_buffer", finderItem.getFeedObject().getSessionBuffer());
        lVarArr[2] = new jz5.l("finder_username", finderItem.getFeedObject().getUsername());
        lVarArr[3] = new jz5.l("media_type", java.lang.Integer.valueOf(finderItem.getMediaType()));
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(finderItem.getMediaList());
        lVarArr[4] = new jz5.l("video_duration_time", java.lang.String.valueOf(mb4Var != null ? mb4Var.getInteger(3) : 0));
        long j17 = finderItem.field_id;
        if (j17 == 0) {
            j17 = finderItem.getLocalId();
        }
        lVarArr[5] = new jz5.l("long_video_id", pm0.v.u(j17));
        lVarArr[6] = new jz5.l("feed_display_type", "1");
        return kz5.c1.k(lVarArr);
    }

    public final void c(com.tencent.mm.ui.MMActivity activity, com.tencent.mm.plugin.finder.model.BaseFinderFeed item, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.Object a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
        if (e27 != null) {
            ya2.b2 contact = item.getContact();
            boolean z18 = contact != null && contact.field_liveStatus == 1;
            if (z17) {
                ec2.a aVar = new ec2.a(9, item.getItemId(), item.w());
                aVar.f250950h = new ec2.c(2, z18, false, 0, 0L, 0, 60, null);
                e27.a(aVar);
            } else {
                ec2.a aVar2 = new ec2.a(9, item.getItemId(), item.w());
                aVar2.f250950h = new ec2.c(1, z18, false, 0, 0L, 0, 60, null);
                e27.a(aVar2);
            }
        }
    }
}
