package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class ck implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSelectActivityUI2 f109759d;

    public ck(com.tencent.mm.plugin.finder.feed.ui.FinderSelectActivityUI2 finderSelectActivityUI2) {
        this.f109759d = finderSelectActivityUI2;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        r45.e21 e21Var;
        java.lang.String str;
        byte[] byteArray;
        java.lang.String headUrl;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.feed.ui.FinderSelectActivityUI2 finderSelectActivityUI2 = this.f109759d;
        com.tencent.mm.plugin.finder.search.eventsearch.FinderActivitySearchLoader finderActivitySearchLoader = finderSelectActivityUI2.E;
        if (finderActivitySearchLoader == null) {
            kotlin.jvm.internal.o.o("feedloader");
            throw null;
        }
        java.lang.Object obj = finderActivitySearchLoader.getDataList().get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        if ((j5Var instanceof so2.x) && (e21Var = ((so2.x) j5Var).f410694d) != null) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mars.xlog.Log.i(finderSelectActivityUI2.C, "onSelectActivity: eventTopicId:" + e21Var + ".eventTopicId  eventName:" + e21Var + ".eventName description:" + e21Var + ".description cover:" + e21Var + ".coverImgUrl");
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
            java.lang.String str2 = "";
            if (finderContact == null || (str = finderContact.getUsername()) == null) {
                str = "";
            }
            intent.putExtra("key_user_name", str);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
            intent.putExtra("key_nick_name", finderContact2 != null ? finderContact2.getNickname() : null);
            intent.putExtra("key_cover_url", e21Var.getString(5));
            com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
            if (finderContact3 != null && (headUrl = finderContact3.getHeadUrl()) != null) {
                str2 = headUrl;
            }
            intent.putExtra("key_avatar_url", str2);
            intent.putExtra("key_topic_id", e21Var.getLong(0));
            intent.putExtra("key_activity_name", e21Var.getString(2));
            intent.putExtra("key_activity_desc", e21Var.getString(3));
            intent.putExtra("key_activity_end_time", e21Var.getLong(13));
            intent.putExtra("key_activity_type", 102);
            intent.putExtra("key_activity_already_participate", true);
            intent.putExtra("key_activity_display_mask", e21Var.getLong(17));
            intent.putExtra("vst_id", finderSelectActivityUI2.F);
            r45.h21 h21Var = (r45.h21) e21Var.getCustom(18);
            if (h21Var != null && (byteArray = h21Var.toByteArray()) != null) {
                intent.putExtra("key_wording_info", byteArray);
            }
            intent.setClass(finderSelectActivityUI2, com.tencent.mm.plugin.finder.ui.FinderActivityDescUI.class);
            finderSelectActivityUI2.startActivityForResult(intent, 0);
        }
        com.tencent.mm.plugin.finder.report.e3 e3Var = com.tencent.mm.plugin.finder.report.e3.f125009a;
        androidx.appcompat.app.AppCompatActivity context = finderSelectActivityUI2.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e3Var.a("4", xy2.c.e(context), new org.json.JSONObject().put("vst_id", finderSelectActivityUI2.F));
    }
}
