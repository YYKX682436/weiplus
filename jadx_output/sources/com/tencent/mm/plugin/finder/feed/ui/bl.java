package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class bl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f109714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f109715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f109716f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI f109717g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f109718h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f109719i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f109720m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f109721n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f109722o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r45.e21 f109723p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f109724q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f109725r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f109726s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f109727t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(java.lang.String str, int i17, java.lang.String str2, com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, java.lang.String str6, r45.e21 e21Var, kotlin.jvm.internal.c0 c0Var, java.lang.String str7, java.lang.String str8, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f109714d = str;
        this.f109715e = i17;
        this.f109716f = str2;
        this.f109717g = finderSharePostUI;
        this.f109718h = str3;
        this.f109719i = str4;
        this.f109720m = str5;
        this.f109721n = i18;
        this.f109722o = str6;
        this.f109723p = e21Var;
        this.f109724q = c0Var;
        this.f109725r = str7;
        this.f109726s = str8;
        this.f109727t = h0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("postType", 4);
        java.lang.String str7 = this.f109714d;
        intent.putExtra("KEY_POST_REMOTE_URL", str7);
        int i18 = this.f109715e;
        intent.putExtra("KEY_POST_FROM_APPTYPE", i18);
        intent.putExtra("KEY_POST_FROM_APP_PARAMJSON", this.f109716f);
        intent.putExtra("key_finder_post_from", 8);
        com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI = this.f109717g;
        r45.n46 n46Var = finderSharePostUI.A;
        if (n46Var == null) {
            kotlin.jvm.internal.o.o("shareData");
            throw null;
        }
        intent.putExtra("KEY_POST_FROM_SHARE", n46Var.toByteArray());
        intent.putExtra("saveDesc", this.f109718h);
        intent.putExtra("KEY_POST_EXTEND_URL", this.f109719i);
        intent.putExtra("KEY_MIAOJIAN_EXTINFO", this.f109720m);
        intent.putExtra("KEY_POST_FROM_APP_SOURCE", this.f109721n);
        intent.putExtra("key_app_id", this.f109722o);
        intent.putExtra("key_activity_src_type", "key_scene_from_outside");
        java.lang.String str8 = finderSharePostUI.f109545t;
        r45.e21 e21Var = this.f109723p;
        if (e21Var != null) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
            str2 = "shareData";
            intent.putExtra("key_topic_id", e21Var.getLong(0));
            intent.putExtra("key_activity_type", 102);
            if (finderContact == null || (str3 = finderContact.getUsername()) == null) {
                str3 = "";
            }
            intent.putExtra("key_user_name", str3);
            if (finderContact == null || (str4 = finderContact.getNickname()) == null) {
                str4 = "";
            }
            intent.putExtra("key_nick_name", str4);
            if (finderContact == null || (str5 = finderContact.getHeadUrl()) == null) {
                str5 = "";
            }
            intent.putExtra("key_avatar_url", str5);
            java.lang.String string = e21Var.getString(5);
            if (string == null) {
                string = "";
            }
            intent.putExtra("key_cover_url", string);
            intent.putExtra("key_activity_display_mask", e21Var.getLong(17));
            java.lang.String string2 = e21Var.getString(2);
            if (string2 == null) {
                string2 = "";
            }
            intent.putExtra("key_activity_name", string2);
            java.lang.String string3 = e21Var.getString(3);
            if (string3 == null) {
                string3 = "";
            }
            intent.putExtra("key_activity_desc", string3);
            str = str7;
            intent.putExtra("key_activity_end_time", e21Var.getLong(13));
            intent.putExtra("saveActivity", true);
            if (finderContact == null || (str6 = finderContact.getNickname()) == null) {
                str6 = "";
            }
            com.tencent.mars.xlog.Log.i(str8, "eventInfo nickname = ".concat(str6));
            java.lang.String string4 = e21Var.getString(2);
            if (string4 == null) {
                string4 = "";
            }
            com.tencent.mars.xlog.Log.i(str8, "eventInfo eventname = ".concat(string4));
            java.lang.String string5 = e21Var.getString(3);
            if (string5 == null) {
                string5 = "";
            }
            com.tencent.mars.xlog.Log.i(str8, "eventInfo description = ".concat(string5));
        } else {
            str = str7;
            str2 = "shareData";
        }
        if (this.f109724q.f310112d) {
            intent.putExtra("isLongVideoPost", true);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        kotlin.jvm.internal.h0 h0Var = this.f109727t;
        arrayList.add(h0Var.f310123d);
        intent.putStringArrayListExtra("postMediaList", arrayList);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(11, 8, 74, intent);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_OPEN_UPLOAD_DRAFT_STRING_SYNC, "");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("from:");
        java.lang.String str9 = this.f109725r;
        sb6.append(str9);
        com.tencent.mars.xlog.Log.i(str8, sb6.toString());
        if (!kotlin.jvm.internal.o.b(str9, "channels") || com.tencent.mm.plugin.finder.report.p2.f125238b == null) {
            com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
            p2Var.W(p2Var.i(finderSharePostUI.getContext(), 8, false));
        } else {
            intent.putExtra("KEY_SHARE_VIDEO_SOURCE", 4);
        }
        if (kotlin.jvm.internal.o.b(str9, "channels-samestyle")) {
            i17 = 4;
            intent.putExtra("KEY_SHARE_VIDEO_SOURCE", 4);
        } else {
            i17 = 4;
        }
        r45.n46 n46Var2 = finderSharePostUI.A;
        if (n46Var2 == null) {
            kotlin.jvm.internal.o.o(str2);
            throw null;
        }
        r45.bu5 bu5Var = (r45.bu5) n46Var2.getCustom(1);
        if (bu5Var != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) bu5Var.getCustom(i17)) != null) {
            com.tencent.mars.xlog.Log.i(str8, "put jumpInfo, " + finderJumpInfo.getJumpinfo_type());
            intent.putExtra("JUMP_INFO", finderJumpInfo.toByteArray());
        }
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i0Var.hk(context, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        java.lang.String wording = "success, rawPath:" + this.f109726s + ", path:" + com.tencent.mm.vfs.w6.i((java.lang.String) h0Var.f310123d, false) + " url:" + str + ", fromApp:" + i18;
        kotlin.jvm.internal.o.g(wording, "wording");
        java.lang.String str10 = com.tencent.mm.sdk.platformtools.z.f193105a;
        finderSharePostUI.overridePendingTransition(0, 0);
        finderSharePostUI.c7();
        return jz5.f0.f302826a;
    }
}
