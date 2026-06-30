package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class bl extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f191248e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191249f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14093x52d98fcd f191250g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191251h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191252i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191253m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f191254n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191255o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ r45.e21 f191256p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f191257q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191258r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f191259s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f191260t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(java.lang.String str, int i17, java.lang.String str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14093x52d98fcd activityC14093x52d98fcd, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i18, java.lang.String str6, r45.e21 e21Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.String str7, java.lang.String str8, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(0);
        this.f191247d = str;
        this.f191248e = i17;
        this.f191249f = str2;
        this.f191250g = activityC14093x52d98fcd;
        this.f191251h = str3;
        this.f191252i = str4;
        this.f191253m = str5;
        this.f191254n = i18;
        this.f191255o = str6;
        this.f191256p = e21Var;
        this.f191257q = c0Var;
        this.f191258r = str7;
        this.f191259s = str8;
        this.f191260t = h0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("postType", 4);
        java.lang.String str7 = this.f191247d;
        intent.putExtra("KEY_POST_REMOTE_URL", str7);
        int i18 = this.f191248e;
        intent.putExtra("KEY_POST_FROM_APPTYPE", i18);
        intent.putExtra("KEY_POST_FROM_APP_PARAMJSON", this.f191249f);
        intent.putExtra("key_finder_post_from", 8);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14093x52d98fcd activityC14093x52d98fcd = this.f191250g;
        r45.n46 n46Var = activityC14093x52d98fcd.A;
        if (n46Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareData");
            throw null;
        }
        intent.putExtra("KEY_POST_FROM_SHARE", n46Var.mo14344x5f01b1f6());
        intent.putExtra("saveDesc", this.f191251h);
        intent.putExtra("KEY_POST_EXTEND_URL", this.f191252i);
        intent.putExtra("KEY_MIAOJIAN_EXTINFO", this.f191253m);
        intent.putExtra("KEY_POST_FROM_APP_SOURCE", this.f191254n);
        intent.putExtra("key_app_id", this.f191255o);
        intent.putExtra("key_activity_src_type", "key_scene_from_outside");
        java.lang.String str8 = activityC14093x52d98fcd.f191078t;
        r45.e21 e21Var = this.f191256p;
        if (e21Var != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
            str2 = "shareData";
            intent.putExtra("key_topic_id", e21Var.m75942xfb822ef2(0));
            intent.putExtra("key_activity_type", 102);
            if (c19782x23db1cfa == null || (str3 = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                str3 = "";
            }
            intent.putExtra("key_user_name", str3);
            if (c19782x23db1cfa == null || (str4 = c19782x23db1cfa.m76184x8010e5e4()) == null) {
                str4 = "";
            }
            intent.putExtra("key_nick_name", str4);
            if (c19782x23db1cfa == null || (str5 = c19782x23db1cfa.m76175x6d346f39()) == null) {
                str5 = "";
            }
            intent.putExtra("key_avatar_url", str5);
            java.lang.String m75945x2fec8307 = e21Var.m75945x2fec8307(5);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            intent.putExtra("key_cover_url", m75945x2fec8307);
            intent.putExtra("key_activity_display_mask", e21Var.m75942xfb822ef2(17));
            java.lang.String m75945x2fec83072 = e21Var.m75945x2fec8307(2);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            intent.putExtra("key_activity_name", m75945x2fec83072);
            java.lang.String m75945x2fec83073 = e21Var.m75945x2fec8307(3);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            intent.putExtra("key_activity_desc", m75945x2fec83073);
            str = str7;
            intent.putExtra("key_activity_end_time", e21Var.m75942xfb822ef2(13));
            intent.putExtra("saveActivity", true);
            if (c19782x23db1cfa == null || (str6 = c19782x23db1cfa.m76184x8010e5e4()) == null) {
                str6 = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, "eventInfo nickname = ".concat(str6));
            java.lang.String m75945x2fec83074 = e21Var.m75945x2fec8307(2);
            if (m75945x2fec83074 == null) {
                m75945x2fec83074 = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, "eventInfo eventname = ".concat(m75945x2fec83074));
            java.lang.String m75945x2fec83075 = e21Var.m75945x2fec8307(3);
            if (m75945x2fec83075 == null) {
                m75945x2fec83075 = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, "eventInfo description = ".concat(m75945x2fec83075));
        } else {
            str = str7;
            str2 = "shareData";
        }
        if (this.f191257q.f391645d) {
            intent.putExtra("isLongVideoPost", true);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f191260t;
        arrayList.add(h0Var.f391656d);
        intent.putStringArrayListExtra("postMediaList", arrayList);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(11, 8, 74, intent);
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_OPEN_UPLOAD_DRAFT_STRING_SYNC, "");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("from:");
        java.lang.String str9 = this.f191258r;
        sb6.append(str9);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, sb6.toString());
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str9, "channels") || com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
            p2Var.W(p2Var.i(activityC14093x52d98fcd.mo55332x76847179(), 8, false));
        } else {
            intent.putExtra("KEY_SHARE_VIDEO_SOURCE", 4);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str9, "channels-samestyle")) {
            i17 = 4;
            intent.putExtra("KEY_SHARE_VIDEO_SOURCE", 4);
        } else {
            i17 = 4;
        }
        r45.n46 n46Var2 = activityC14093x52d98fcd.A;
        if (n46Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(str2);
            throw null;
        }
        r45.bu5 bu5Var = (r45.bu5) n46Var2.m75936x14adae67(1);
        if (bu5Var != null && (c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) bu5Var.m75936x14adae67(i17)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str8, "put jumpInfo, " + c19786x6a1e2862.m76503x92bc3c07());
            intent.putExtra("JUMP_INFO", c19786x6a1e2862.mo14344x5f01b1f6());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        i0Var.hk(context, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        java.lang.String wording = "success, rawPath:" + this.f191259s + ", path:" + com.p314xaae8f345.mm.vfs.w6.i((java.lang.String) h0Var.f391656d, false) + " url:" + str + ", fromApp:" + i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        java.lang.String str10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        activityC14093x52d98fcd.overridePendingTransition(0, 0);
        activityC14093x52d98fcd.c7();
        return jz5.f0.f384359a;
    }
}
