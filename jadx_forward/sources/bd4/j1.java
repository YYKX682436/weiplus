package bd4;

/* loaded from: classes4.dex */
public final class j1 {
    public j1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bd4.j1.a(android.view.MotionEvent):void");
    }

    public final void b(int i17) {
        bd4.f2 f2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$Companion");
        java.lang.ref.WeakReference e17 = bd4.f2.e();
        if (e17 != null && (f2Var = (bd4.f2) e17.get()) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            if (f2Var.f100862j.length() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            } else {
                if (i17 == 0) {
                    wl5.x xVar = f2Var.f100861i;
                    if (xVar != null && xVar.K) {
                        xVar.K = false;
                        android.view.View view = xVar.f528698j;
                        java.lang.Runnable runnable = xVar.U;
                        view.removeCallbacks(runnable);
                        xVar.f528698j.postDelayed(runnable, 100);
                    }
                    if (f2Var.t()) {
                        f2Var.k();
                    } else {
                        wl5.x xVar2 = f2Var.f100861i;
                        android.util.Pair e18 = xVar2 != null ? xVar2.e() : null;
                        if (e18 == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                        } else {
                            java.lang.Integer num = (java.lang.Integer) e18.first;
                            java.lang.Integer num2 = (java.lang.Integer) e18.second;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
                            int intValue = num2.intValue();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                            int intValue2 = num.intValue();
                            if (intValue2 >= 0 && intValue2 < intValue) {
                                wl5.x xVar3 = f2Var.f100861i;
                                if (((xVar3 == null || xVar3.N) ? false : true) && xVar3 != null) {
                                    xVar3.o();
                                }
                                if (f2Var.f100869q) {
                                    f2Var.f100869q = false;
                                    f2Var.E();
                                }
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                            }
                        }
                    }
                } else {
                    wl5.x xVar4 = f2Var.f100861i;
                    if (xVar4 != null) {
                        xVar4.K = true;
                        xVar4.i();
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$Companion");
    }
}
