package bd4;

/* loaded from: classes4.dex */
public final class w1 implements xl5.d {

    /* renamed from: a, reason: collision with root package name */
    public final xl5.e f100938a = new xl5.e();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f100939b;

    public w1(bd4.f2 f2Var) {
        this.f100939b = f2Var;
    }

    @Override // xl5.d
    public android.graphics.PointF a(android.view.View view, android.view.MotionEvent event, int i17, android.widget.Magnifier magnifier) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPosition", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$magnifierHelper$2$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        xl5.e eVar = this.f100938a;
        if (i17 < 0) {
            android.graphics.PointF a17 = eVar.a(view, event, i17, magnifier);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPosition", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$magnifierHelper$2$1$1");
            return a17;
        }
        int length = wl5.y.o(view).length();
        if (length < 0) {
            length = 0;
        }
        int f17 = e06.p.f(i17, 0, length);
        try {
            int d17 = wl5.y.d(view, f17);
            try {
                float m17 = wl5.y.m(view, f17);
                boolean z17 = view instanceof android.widget.TextView;
                int totalPaddingLeft = z17 ? ((android.widget.TextView) view).getTotalPaddingLeft() : view.getPaddingLeft();
                float f18 = totalPaddingLeft;
                float scrollX = (m17 + f18) - view.getScrollX();
                float i18 = (((wl5.y.i(view, d17) + wl5.y.c(view, d17)) / 2.0f) + (z17 ? ((android.widget.TextView) view).getTotalPaddingTop() : view.getPaddingTop())) - view.getScrollY();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getLongPressFingerXInView$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                bd4.f2 f2Var = this.f100939b;
                float f19 = f2Var.B;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getLongPressFingerXInView$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                if (bd4.f2.c(f2Var) && f19 >= 0.0f) {
                    scrollX = e06.p.e(f19, (wl5.y.f(view, d17) + f18) - view.getScrollX(), (wl5.y.g(view, d17) + f18) - view.getScrollX());
                }
                android.graphics.PointF pointF = new android.graphics.PointF(scrollX, i18);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPosition", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$magnifierHelper$2$1$1");
                return pointF;
            } catch (java.lang.Throwable unused) {
                android.graphics.PointF a18 = eVar.a(view, event, i17, magnifier);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPosition", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$magnifierHelper$2$1$1");
                return a18;
            }
        } catch (java.lang.Throwable unused2) {
            android.graphics.PointF a19 = eVar.a(view, event, i17, magnifier);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPosition", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$magnifierHelper$2$1$1");
            return a19;
        }
    }
}
