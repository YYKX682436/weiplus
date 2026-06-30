package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes7.dex */
public final class so implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo f217445d;

    public so(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo uoVar) {
        this.f217445d = uoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        al5.v vVar;
        java.lang.String str = (java.lang.String) kz5.h0.C(this.f217445d.f217682e);
        if (str == null) {
            this.f217445d.f217686i = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMagicEmojiUIC", "stop trigger");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qo qoVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qo) this.f217445d.f217681d.get(str);
        if (qoVar == null) {
            return;
        }
        android.graphics.Rect rect = new android.graphics.Rect(0, 0, 0, 0);
        android.view.View view = qoVar.f217257a;
        jz5.f0 f0Var = null;
        if (view != null) {
            view.getGlobalVisibleRect(rect);
            if (view instanceof android.widget.TextView) {
                java.lang.CharSequence text = ((android.widget.TextView) view).getText();
                android.text.SpannedString spannedString = text instanceof android.text.SpannedString ? (android.text.SpannedString) text : null;
                if (spannedString != null) {
                    al5.v[] vVarArr = (al5.v[]) spannedString.getSpans(0, spannedString.length(), al5.v.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(vVarArr);
                    int length = vVarArr.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= length) {
                            vVar = null;
                            break;
                        }
                        vVar = vVarArr[i18];
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vVar.f87605f, "finder_thank_fireworks_icon.png")) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                    if (vVar != null) {
                        android.graphics.RectF rectF = vVar.f87606g;
                        int i19 = rect.left + ((int) rectF.left);
                        rect.left = i19;
                        rect.top += (int) rectF.top;
                        rect.right = (int) (i19 + rectF.width());
                        rect.bottom = (int) (rect.top + rectF.height());
                    }
                }
            }
        }
        int i27 = rect.top;
        int i28 = this.f217445d.f217683f;
        rect.top = i27 - i28;
        rect.bottom -= i28;
        if (rect.width() != 0 && (i17 = rect.left) >= 0) {
            com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29 c10860xa01d8e29 = this.f217445d.f217687m;
            if (i17 <= (c10860xa01d8e29 != null ? c10860xa01d8e29.getWidth() : 0)) {
                int i29 = rect.top;
                com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui.C10860xa01d8e29 c10860xa01d8e292 = this.f217445d.f217687m;
                if (i29 <= (c10860xa01d8e292 != null ? c10860xa01d8e292.getHeight() : 0)) {
                    qoVar.f217257a = null;
                    android.graphics.RectF rectF2 = qoVar.f217258b.f529900e;
                    if (rectF2 != null) {
                        rectF2.set(rect);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo uoVar = this.f217445d;
                    java.lang.System.currentTimeMillis();
                    uoVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMagicEmojiUIC", "doTrigger ".concat(str));
                    s12.f fVar = (s12.f) ((xp0.f) i95.n0.c(xp0.f.class));
                    fVar.getClass();
                    rk0.c.c("MagicFinderEmojiService", "triggerEmoji id:".concat(str), new java.lang.Object[0]);
                    s12.e eVar = fVar.f483662d;
                    if (eVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo uoVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo) eVar.f483661h;
                        uoVar2.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qo qoVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qo) uoVar2.f217681d.get(str);
                        wp0.b bVar = qoVar2 != null ? qoVar2.f217258b : null;
                        if (bVar != null) {
                            java.lang.String a17 = bVar.a(1, "");
                            jc3.j0 j0Var = eVar.f529908f;
                            if (j0Var != null) {
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6725xb1b08174 c6725xb1b08174 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6725xb1b08174();
                                c6725xb1b08174.f140628f = currentTimeMillis;
                                c6725xb1b08174.f140627e = 8;
                                c6725xb1b08174.k();
                                rc3.w0 w0Var = (rc3.w0) j0Var;
                                w0Var.A();
                                w0Var.k("MagicEmojiSent", a17);
                                f0Var = jz5.f0.f384359a;
                            }
                            if (f0Var == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MagicEmojiFinderCommentBiz", "triggerEmoji without biz...");
                            }
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo uoVar3 = this.f217445d;
                    uoVar3.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.so soVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.so(uoVar3);
                    java.util.regex.Pattern pattern = pm0.v.f438335a;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(soVar, 700L);
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMagicEmojiUIC", "skip Trigger");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.uo uoVar4 = this.f217445d;
        uoVar4.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.so soVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.so(uoVar4);
        java.util.regex.Pattern pattern2 = pm0.v.f438335a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(soVar2, 0L);
    }
}
