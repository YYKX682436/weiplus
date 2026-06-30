package x84;

/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final x84.a f534116a = new x84.a(null);

    public static final void a(android.widget.TextView textView, java.lang.String str, int i17, int i18, int i19, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendImageSpanToTextViewEndPosition", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("appendImageSpanToTextViewEndPosition", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        if (textView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendImageSpanToTextViewEndPosition", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHandleImageSpanLogic", "appendImageSpanToTextViewEndPosition, imgUrl is " + str + ", isRefresh is " + z17);
            if (str == null || str.length() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendImageSpanToTextViewEndPosition", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
            } else {
                textView.setTag(com.p314xaae8f345.mm.R.id.n5q, str);
                a84.m.g(str, new x84.b(textView, str, i17, i18, i19, z17));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendImageSpanToTextViewEndPosition", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("appendImageSpanToTextViewEndPosition", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic");
    }

    public static final java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e;
        x84.e eVar;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e2;
        x84.e eVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e3;
        x84.e eVar3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4 m70354x74235b3e4;
        x84.e eVar4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImgUrlFromReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic");
        x84.a aVar = f534116a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getImgUrlFromReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        str = "";
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        } else {
            java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
            java.lang.String a17 = aVar.a(t07 != null ? t07 : "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHandleImageSpanLogic", "getReadState, snsId is " + t07 + ", key is " + a17);
            str = p34.o.c(a17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "1")) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                if (c17933xe8d1b226 != null && (m70354x74235b3e4 = c17933xe8d1b226.m70354x74235b3e()) != null && (eVar4 = m70354x74235b3e4.f38185x37270f7c) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
                    str2 = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) eVar4.f534122d).a(eVar4, x84.e.f534118f[3]);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
                }
                str2 = null;
            } else {
                if (c17933xe8d1b226 != null && (m70354x74235b3e3 = c17933xe8d1b226.m70354x74235b3e()) != null && (eVar3 = m70354x74235b3e3.f38185x37270f7c) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getReadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
                    str2 = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) eVar3.f534121c).a(eVar3, x84.e.f534118f[2]);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getReadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
                }
                str2 = null;
            }
        } else if (com.p314xaae8f345.mm.ui.bk.C()) {
            if (c17933xe8d1b226 != null && (m70354x74235b3e2 = c17933xe8d1b226.m70354x74235b3e()) != null && (eVar2 = m70354x74235b3e2.f38185x37270f7c) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUnreadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
                str2 = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) eVar2.f534120b).a(eVar2, x84.e.f534118f[1]);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUnreadStateDarkImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            }
            str2 = null;
        } else {
            if (c17933xe8d1b226 != null && (m70354x74235b3e = c17933xe8d1b226.m70354x74235b3e()) != null && (eVar = m70354x74235b3e.f38185x37270f7c) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUnreadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
                str2 = (java.lang.String) ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.r0) eVar.f534119a).a(eVar, x84.e.f534118f[0]);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUnreadStateImageUrl", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHeadStateInfo");
            }
            str2 = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImgUrlFromReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getImgUrlFromReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic");
        return str2;
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic");
        x84.a aVar = f534116a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        } else if (c17933xe8d1b226.m70377x3172ed() && c17933xe8d1b226.m70421xaf68c82a()) {
            java.lang.String t07 = ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e);
            java.lang.String a17 = aVar.a(t07 == null ? "" : t07);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHandleImageSpanLogic", "setReadState, snsId is " + t07 + ", key is " + a17);
            p34.o.g(a17, "1");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic$Companion");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setReadState", "com.tencent.mm.plugin.sns.ad.widget.nickname.AdHandleImageSpanLogic");
    }
}
