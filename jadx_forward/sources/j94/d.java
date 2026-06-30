package j94;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j94.d f380080a = new j94.d();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(android.content.Context r10, h94.a r11, r45.x30 r12) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j94.d.a(android.content.Context, h94.a, r45.x30):boolean");
    }

    public final void b(android.content.Context context, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("launchMarketIntent", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpAppMarketHelper");
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/wsfold/helper/WsFoldJumpAppMarketHelper", "launchMarketIntent", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/ad/wsfold/helper/WsFoldJumpAppMarketHelper", "launchMarketIntent", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("launchMarketIntent", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpAppMarketHelper");
    }

    public final void c(android.content.Context context, h94.a aVar, r45.mz4 mz4Var, android.content.Intent intent) {
        k44.i iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showHalfScreenAppMarket", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpAppMarketHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("convertOpenAppMarketHalfScreenInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo$Companion");
        if (mz4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertOpenAppMarketHalfScreenInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo$Companion");
            iVar = null;
        } else {
            k44.i iVar2 = new k44.i();
            java.lang.String str = mz4Var.f462476d;
            if (str == null) {
                str = "";
            }
            iVar2.d(str);
            java.lang.String str2 = mz4Var.f462477e;
            if (str2 == null) {
                str2 = "";
            }
            iVar2.e(str2);
            java.lang.String str3 = mz4Var.f462478f;
            if (str3 == null) {
                str3 = "";
            }
            iVar2.f(str3);
            int i17 = mz4Var.f462479g;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setExpandClickArea", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
            iVar2.f385633d = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setExpandClickArea", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
            int i18 = mz4Var.f462480h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setForbidTapBgToClose", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
            iVar2.f385634e = i18;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setForbidTapBgToClose", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
            java.lang.String str4 = mz4Var.f462481i;
            java.lang.String str5 = str4 != null ? str4 : "";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAppDesc", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
            iVar2.f385635f = str5;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAppDesc", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
            java.util.LinkedList linkedList = mz4Var.f462482m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (linkedList != null) {
                int size = linkedList.size() <= 3 ? linkedList.size() : 3;
                for (int i19 = 0; i19 < size; i19++) {
                    arrayList.add(linkedList.get(i19));
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setAppImageList", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
            iVar2.f385636g = arrayList;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setAppImageList", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("convertOpenAppMarketHalfScreenInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.OpenAppMarketHalfScreenInfo$Companion");
            iVar = iVar2;
        }
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WsFoldJumpAppMarketHelper", "showHalfScreenAppMarket, convert returned null, fallback to direct launch");
            b(context, intent);
            a44.m.a(5, 13);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showHalfScreenAppMarket", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpAppMarketHelper");
            return;
        }
        h44.c cVar = new h44.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setOpenAppMarketHalfScreenInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
        cVar.f360465g = iVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setOpenAppMarketHalfScreenInfo", "com.tencent.mm.plugin.sns.ad.halfscreen.params.AdOpenAppParams");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("buildOpenAppReportParams", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpAppMarketHelper");
        java.lang.String c17 = aVar.c();
        java.lang.String e17 = aVar.e();
        i64.p0 p0Var = new i64.p0(c17, e17, "", 5, aVar.a(), aVar.d(), ca4.m0.L(e17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("buildOpenAppReportParams", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpAppMarketHelper");
        p0Var.f370813j = 106;
        cVar.e(p0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.xml.C17713x74160c71 c17713x74160c71 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2092x1c644e5f.xml.C17713x74160c71(context);
        j94.c cVar2 = new j94.c(context, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        c17713x74160c71.f244222x = cVar2;
        c17713x74160c71.f244223y = false;
        c17713x74160c71.u(cVar);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showBottomSheet", "com.tencent.mm.plugin.sns.ad.halfscreen.xml.AdGalleryOpenAppMarketHalfScreenHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showHalfScreenAppMarket", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldJumpAppMarketHelper");
    }
}
