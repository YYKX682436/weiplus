package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes3.dex */
public final class x3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65 f241349d;

    public x3(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65 activityC17308x95e1b65) {
        this.f241349d = activityC17308x95e1b65;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65 activityC17308x95e1b65 = this.f241349d;
        if (activityC17308x95e1b65.isDestroyed() || activityC17308x95e1b65.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanTranslationResultUI", "receive onMMMenuItemSelected but activity is invalid");
            return;
        }
        boolean z17 = true;
        switch (menuItem.getItemId()) {
            case 32769:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationResultUI", "longClickMenu_cancelTranslation");
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65.T6(activityC17308x95e1b65);
                return;
            case 32770:
                java.lang.String str = activityC17308x95e1b65.f240919s;
                java.lang.String str2 = "ScanTranslationResultUI.SettingsRequestSessionId_" + str;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationResultUI", "longClickMenu_changeTranslateLanguage, currentImgPath: " + str);
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    return;
                }
                com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c c10687xa533b04c = new com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10687xa533b04c();
                c10687xa533b04c.f149354d = wd0.k2.IMAGE_OCR_TRANSLATE_RESULT;
                c10687xa533b04c.f149355e = str2;
                activityC17308x95e1b65.E = c10687xa533b04c.m45295x5a5dd5d();
                ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(activityC17308x95e1b65, c10687xa533b04c);
                return;
            case 32771:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationResultUI", "longClickMenu_translateFeedback");
                dm.aa y07 = activityC17308x95e1b65.A == 1 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).cj().y0(com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(activityC17308x95e1b65.f240919s + com.p314xaae8f345.mm.vfs.w6.l(activityC17308x95e1b65.f240919s))) : activityC17308x95e1b65.f240922v;
                if (y07 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanTranslationResultUI", "longClickMenu_translateFeedback, TranslationResult is null, source: " + activityC17308x95e1b65.A);
                } else {
                    ((pn4.l1) ((mn4.f) i95.n0.c(mn4.f.class))).wi(mn4.e.SCAN, y07.f65915xd108e39c, y07.f65914xc84b1af5, y07.f65918x22181090, y07.f65917x195a47e9);
                }
                dp.a.m125854x26a183b(activityC17308x95e1b65, activityC17308x95e1b65.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lwg), 1).show();
                return;
            case 32772:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslationResultUI", "longClickMenu_saveTranslateResult");
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17308x95e1b65.V6(activityC17308x95e1b65);
                return;
            default:
                return;
        }
    }
}
