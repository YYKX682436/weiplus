package y84;

/* loaded from: classes4.dex */
public final class e3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y84.h3 f541573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f541574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f541575f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f541576g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f541577h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f541578i;

    public e3(y84.h3 h3Var, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, int i17) {
        this.f541573d = h3Var;
        this.f541574e = e0Var;
        this.f541575f = e0Var2;
        this.f541576g = g0Var;
        this.f541577h = c0Var;
        this.f541578i = i17;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$setClickEvent$1$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$setClickEvent$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        y84.h3 h3Var = this.f541573d;
        java.lang.String j17 = h3Var.j();
        try {
            int action = motionEvent.getAction();
            p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f541574e;
            p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var2 = this.f541575f;
            p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f541576g;
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f541577h;
            if (action == 0) {
                e0Var.f391648d = motionEvent.getX();
                e0Var2.f391648d = motionEvent.getY();
                g0Var.f391654d = java.lang.System.currentTimeMillis();
                c0Var.f391645d = true;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$stopAutoScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                h3Var.X0();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$stopAutoScroll", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
            } else {
                int action2 = motionEvent.getAction();
                int i17 = this.f541578i;
                if (action2 == 2) {
                    float abs = java.lang.Math.abs(motionEvent.getX() - e0Var.f391648d);
                    float abs2 = java.lang.Math.abs(motionEvent.getY() - e0Var2.f391648d);
                    float f17 = i17;
                    if (abs > f17 || abs2 > f17) {
                        c0Var.f391645d = false;
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (c0Var.f391645d && motionEvent.getAction() == 1) {
                        float abs3 = java.lang.Math.abs(motionEvent.getX() - e0Var.f391648d);
                        float abs4 = java.lang.Math.abs(motionEvent.getY() - e0Var2.f391648d);
                        long currentTimeMillis = java.lang.System.currentTimeMillis() - g0Var.f391654d;
                        float f18 = i17;
                        if (abs3 < f18 && abs4 < f18 && currentTimeMillis < 200) {
                            view.performClick();
                        }
                    }
                    if (!c0Var.f391645d) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMScrollCount$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        int i18 = h3Var.Q0;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMScrollCount$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMScrollCount$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        h3Var.Q0 = i18 + 1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMScrollCount$p", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                    }
                    c0Var.f391645d = false;
                    y84.h3.O(h3Var);
                }
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ad/widget/randomselectcard/AdRandomSelectCardComponent$setClickEvent$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent$setClickEvent$1$1");
        return false;
    }
}
