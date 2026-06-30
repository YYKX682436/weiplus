package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public final class mj implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nj f251456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.m33 f251457e;

    public mj(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nj njVar, r45.m33 m33Var) {
        this.f251456d = njVar;
        this.f251457e = m33Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.jj4 jj4Var;
        r45.jj4 jj4Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$showMenuForOCRTranslateResult$2");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.nj njVar = this.f251456d;
        r45.m33 b17 = njVar.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showMenuForOCRTranslateResult select >> ");
        r45.m33 m33Var = this.f251457e;
        r45.jj4 jj4Var3 = m33Var.f461642d;
        sb6.append(jj4Var3 != null ? jj4Var3.f459388d : null);
        sb6.append(' ');
        sb6.append((b17 == null || (jj4Var2 = b17.f461642d) == null) ? null : jj4Var2.f459388d);
        sb6.append(' ');
        sb6.append(menuItem.getItemId());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsImageTransSheetManager", sb6.toString());
        r45.jj4 jj4Var4 = m33Var.f461642d;
        if (!r26.i0.q(jj4Var4 != null ? jj4Var4.f459388d : null, (b17 == null || (jj4Var = b17.f461642d) == null) ? null : jj4Var.f459388d, false, 2, null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageTransSheetManager", "when select current item is no equal bind item");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$showMenuForOCRTranslateResult$2");
            return;
        }
        android.content.Context a17 = njVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d abstractActivityC18013x6b7f831d = a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AbstractActivityC18013x6b7f831d) a17 : null;
        if (abstractActivityC18013x6b7f831d != null) {
            if (abstractActivityC18013x6b7f831d.isDestroyed() || abstractActivityC18013x6b7f831d.isFinishing()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsImageTransSheetManager", "receive onMMMenuItemSelected but activity is invalid");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$showMenuForOCRTranslateResult$2");
                return;
            }
            int itemId = menuItem.getItemId();
            if (itemId == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsImageTransSheetManager", "longClickMenu_cancelTranslation");
                m33Var.f461646h = false;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("notifyDataChange", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
                if (abstractActivityC18013x6b7f831d.f248343o.mo70578x3219b31c() != null && abstractActivityC18013x6b7f831d.f248343o.mo70578x3219b31c().m80829xf939df19() != null) {
                    abstractActivityC18013x6b7f831d.f248343o.mo70578x3219b31c().m80829xf939df19().mo8343xced61ae5();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("notifyDataChange", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
            } else if (itemId == 2) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("SnsImageTrans_");
                r45.jj4 jj4Var5 = m33Var.f461642d;
                sb7.append(jj4Var5 != null ? jj4Var5.f459388d : null);
                java.lang.String sb8 = sb7.toString();
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("longClickMenu_changeTranslateLanguage, bindMediaId: ");
                r45.jj4 jj4Var6 = m33Var.f461642d;
                sb9.append(jj4Var6 != null ? jj4Var6.f459388d : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsImageTransSheetManager", sb9.toString());
                r45.jj4 jj4Var7 = m33Var.f461642d;
                java.lang.String str = jj4Var7 != null ? jj4Var7.f459388d : null;
                if (!(str == null || str.length() == 0)) {
                    com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c = new com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c();
                    c10687xa533b04c.f149354d = wd0.k2.IMAGE_OCR_TRANSLATE_RESULT;
                    c10687xa533b04c.f149355e = sb8;
                    ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(abstractActivityC18013x6b7f831d, c10687xa533b04c);
                }
            } else if (itemId == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsImageTransSheetManager", "longClickMenu_translateFeedback");
                dp.a.m125854x26a183b(njVar.a(), i65.a.r(njVar.a(), com.p314xaae8f345.mm.R.C30867xcad56011.lwg), 1).show();
            } else if (itemId == 4) {
                java.lang.String str2 = m33Var.f461647i;
                if (str2 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsImageTransSheetManager", "longClickMenu_saveTranslateResult " + str2);
                    if (str2 != null && com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.a(str2, njVar.a(), null);
                    }
                }
                dp.a.m125854x26a183b(abstractActivityC18013x6b7f831d, abstractActivityC18013x6b7f831d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.i87), 1).show();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager$showMenuForOCRTranslateResult$2");
    }
}
