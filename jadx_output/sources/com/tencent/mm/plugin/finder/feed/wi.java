package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class wi {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.wi f110978a = new com.tencent.mm.plugin.finder.feed.wi();

    public static final void a(com.tencent.mm.plugin.finder.feed.wi wiVar, androidx.appcompat.app.AppCompatActivity activity, java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, yz5.l lVar) {
        wiVar.getClass();
        if (!hc2.o0.d(finderItem.getFeedObject())) {
            java.lang.String string = activity.getString(com.tencent.mm.R.string.exu);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            hc2.f1.B(activity, string);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share live  ");
        sb6.append(finderItem.getId());
        sb6.append(' ');
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = finderItem.getFeedObject();
        sb6.append(feedObject != null ? java.lang.Integer.valueOf(feedObject.getForward_style()) : null);
        sb6.append(" to conversation,liveId:");
        r45.nw1 liveInfo = finderItem.getLiveInfo();
        sb6.append(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null);
        sb6.append(",desc:");
        sb6.append(finderItem.getDescription());
        sb6.append(",liveStatus ");
        r45.nw1 liveInfo2 = finderItem.getLiveInfo();
        sb6.append(liveInfo2 != null ? java.lang.Integer.valueOf(liveInfo2.getInteger(2)) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", sb6.toString());
        ot0.q qVar = new ot0.q();
        zy2.c cVar = new zy2.c();
        r45.g92 finderLive = finderItem.getFinderLive();
        kotlin.jvm.internal.o.g(finderLive, "<set-?>");
        cVar.f477359b = finderLive;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a(activity).c(zy2.v9.class))).Q6(cVar.f477359b);
        ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a(activity).c(zy2.v9.class))).P6(cVar.f477359b);
        qVar.f(cVar);
        jz5.l c17 = wiVar.c(finderItem);
        qVar.f348666i = ((java.lang.Number) c17.f302833d).intValue();
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", ((java.lang.Number) c17.f302834e).intValue());
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_Msg_content", ot0.q.u(qVar, null, null));
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        intent.putExtra("Retr_MsgQuickShare", true);
        intent.putExtra("custom_send_text", str);
        intent.putExtra("Select_Conv_User", str2);
        intent.putExtra("Retr_finder_in_stream", true);
        intent.setClassName(activity, "com.tencent.mm.ui.transmit.MsgRetransmitUI");
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) activity : null;
        com.tencent.mm.ui.vc startActivityForResult = mMFragmentActivity != null ? mMFragmentActivity.startActivityForResult(intent) : null;
        if (startActivityForResult != null) {
            ((com.tencent.mm.ui.bd) startActivityForResult).f197877a = new com.tencent.mm.plugin.finder.feed.ui(finderItem, lVar);
        }
    }

    public static final void b(com.tencent.mm.plugin.finder.feed.wi wiVar) {
        wiVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", "3");
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f328362m, jSONObject.toString(), null, 4, null);
    }

    public final jz5.l c(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        if (!((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).hk(finderItem.getLiveInfo())) {
            if (!((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Ui(finderItem.getLiveInfo())) {
                return new jz5.l(63, 23);
            }
        }
        return new jz5.l(88, 31);
    }
}
