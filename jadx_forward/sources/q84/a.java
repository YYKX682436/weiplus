package q84;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final q84.d f442316a;

    public a(q84.d dVar) {
        this.f442316a = dVar;
    }

    public void a(q84.e eVar) {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewHelper");
        q84.d dVar = this.f442316a;
        if (dVar == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewHelper");
            return;
        }
        q84.e mo69576x32d7cb92 = dVar.mo69576x32d7cb92();
        if (mo69576x32d7cb92 != null && mo69576x32d7cb92 != eVar) {
            b(mo69576x32d7cb92);
        }
        if (eVar != null) {
            q84.c cVar = (q84.c) eVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCountDownView", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            cVar.f442319c = new java.lang.ref.WeakReference(dVar);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCountDownView", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            l44.r4 r4Var = cVar.f442317a;
            r4Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("start", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
            q84.b bVar = (q84.b) r4Var;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValid", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel$1");
            boolean c17 = a84.f0.c(bVar.f397859a, bVar.f397860b);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValid", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel$1");
            if (c17) {
                l44.q4 q4Var = r4Var.f397862d;
                if (q4Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isFinished", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
                    boolean z17 = q4Var.f397850b;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isFinished", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer$Impl");
                    if (!z17) {
                        r4Var.f397862d.cancel();
                        r4Var.f397862d = null;
                    }
                }
                r4Var.f397863e = cVar;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("remaining", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCurrentTimeMillis", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel$1");
                long b17 = a84.f0.b();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCurrentTimeMillis", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel$1");
                if (b17 >= r4Var.f397859a) {
                    j17 = r4Var.f397860b - b17;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("remaining", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("remaining", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
                    j17 = -1;
                }
                if (j17 > 0) {
                    l44.q4 q4Var2 = new l44.q4(r4Var, j17);
                    r4Var.f397862d = q4Var2;
                    q4Var2.start();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("start", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("startCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewHelper");
    }

    public void b(q84.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewHelper");
        if (eVar != null) {
            q84.c cVar = (q84.c) eVar;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stopCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            l44.r4 r4Var = cVar.f442317a;
            r4Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("stop", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
            l44.q4 q4Var = r4Var.f397862d;
            if (q4Var != null) {
                q4Var.cancel();
                r4Var.f397862d = null;
            }
            r4Var.f397863e = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stop", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCountDownView", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            cVar.f442319c = null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCountDownView", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("stopCountDown", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewHelper");
    }
}
