package fr2;

/* loaded from: classes2.dex */
public final class u implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr2.x f347290d;

    public u(fr2.x xVar) {
        this.f347290d = xVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        fr2.x xVar = this.f347290d;
        r45.zz2 zz2Var = xVar.f347304o;
        if (zz2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "setOnMenuSelectedListener: share info is null");
            return;
        }
        int itemId = menuItem.getItemId();
        if (itemId == 20002) {
            i95.m c17 = i95.n0.c(zy2.db.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.db dbVar = (zy2.db) c17;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = xVar.m158354x19263085();
            android.app.Activity context = xVar.m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            ((b92.s2) dbVar).Bi(m158354x19263085, zz2Var, nyVar != null ? nyVar.V6() : null, "");
            return;
        }
        if (itemId != 20003) {
            return;
        }
        zy2.db dbVar2 = (zy2.db) i95.n0.c(zy2.db.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context2 = xVar.m158354x19263085();
        android.app.Activity context3 = xVar.m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context3, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context3 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar2 != null ? nyVar2.V6() : null;
        ((b92.s2) dbVar2).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "shareFinderLiveThemeToSnsTimeLine: themeId=" + zz2Var.f474016g + ", main_title=" + zz2Var.f474013d);
        ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsFinderShareLiveTheme", "com.tencent.mm.feature.sns.SnsShareObjectService");
        new r45.hd2();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsFinderShareLiveTheme", "com.tencent.mm.feature.sns.SnsShareObjectService");
        r45.hd2 hd2Var = new r45.hd2();
        hd2Var.set(0, zz2Var.f474013d);
        hd2Var.set(1, zz2Var.f474014e);
        hd2Var.set(3, zz2Var.f474016g);
        hd2Var.set(2, zz2Var.f474015f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShareObject", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
        java.lang.String i18 = zy2.d5.i(hd2Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i18, "makeLiveThemeContent(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLiveTheme");
        intent.putExtra("ksnsupload_finder_live_theme_xml", i18);
        intent.putExtra("Ksnsupload_type", 40);
        intent.putExtra("need_result", true);
        if (context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            j45.l.x((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context2, ".plugin.sns.ui.SnsUploadUI", intent, 1002, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.o6(context2, zz2Var, V6));
        } else {
            j45.l.u(context2, ".plugin.sns.ui.SnsUploadUI", intent, null);
        }
    }
}
