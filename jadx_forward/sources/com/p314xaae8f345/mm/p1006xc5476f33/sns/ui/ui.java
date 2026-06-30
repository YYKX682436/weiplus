package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class ui extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.a3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 f252115a;

    public ui(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 c18062xf8f7b205) {
        this.f252115a = c18062xf8f7b205;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.a3, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.y2
    public void b(boolean z17, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrolled", "com.tencent.mm.plugin.sns.ui.SnsHeader$2");
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrolled", "com.tencent.mm.plugin.sns.ui.SnsHeader$2");
            return;
        }
        float f17 = -i18;
        float f18 = 1.0f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 c18062xf8f7b205 = this.f252115a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.c3 b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205.b(c18062xf8f7b205);
        b17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        int i19 = b17.f252632c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getOpenTarget", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
        float f19 = (f17 * 1.0f) / i19;
        if (f19 <= 1.0f) {
            f18 = 0.0f;
            if (f19 >= 0.0f) {
                f18 = f19;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17856x1e30bcc c17856x1e30bcc = c18062xf8f7b205.f248698d.f249725i;
        c17856x1e30bcc.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("opening", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        float f27 = c17856x1e30bcc.f245536i;
        float f28 = c17856x1e30bcc.f245537m;
        float f29 = ((f27 - f28) * f18) + f28;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.AbstractC17851x632b993b abstractC17851x632b993b = c17856x1e30bcc.f245532e;
        if (abstractC17851x632b993b != null) {
            abstractC17851x632b993b.setTranslationY(f29);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("opening", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205.a(c18062xf8f7b205, f18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrolled", "com.tencent.mm.plugin.sns.ui.SnsHeader$2");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.a3, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.y2
    public void c(int i17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onOpenStateChange", "com.tencent.mm.plugin.sns.ui.SnsHeader$2");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsHeader", "onOpenStateChange: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205 c18062xf8f7b205 = this.f252115a;
        if (i17 == 0) {
            c18062xf8f7b205.f248698d.f249725i.a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205.a(c18062xf8f7b205, 0.0f);
        } else if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17856x1e30bcc c17856x1e30bcc = c18062xf8f7b205.f248698d.f249725i;
            c17856x1e30bcc.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverContainerLayout", "[" + c17856x1e30bcc.hashCode() + "] onPostOpen");
            c17856x1e30bcc.f245535h.f515700a = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.AbstractC17851x632b993b abstractC17851x632b993b = c17856x1e30bcc.f245532e;
            if (abstractC17851x632b993b != null) {
                abstractC17851x632b993b.mo45310xd2370609();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPostOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18062xf8f7b205.a(c18062xf8f7b205, 1.0f);
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17856x1e30bcc c17856x1e30bcc2 = c18062xf8f7b205.f248698d.f249725i;
            c17856x1e30bcc2.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverContainerLayout", "[" + c17856x1e30bcc2.hashCode() + "] onPreOpen");
            android.view.View view = c17856x1e30bcc2.f245534g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/cover/preview/SnsCoverContainerLayout", "onPreOpen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/cover/preview/SnsCoverContainerLayout", "onPreOpen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.api.AbstractC17851x632b993b abstractC17851x632b993b2 = c17856x1e30bcc2.f245532e;
            if (abstractC17851x632b993b2 != null) {
                abstractC17851x632b993b2.mo45312x3c9d44ae();
            }
            c17856x1e30bcc2.coverReporter.f();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreOpen", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("coverVibrate", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                ((android.os.Vibrator) c18062xf8f7b205.f248703i.getSystemService("vibrator")).vibrate(10L);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("coverVibrate", "com.tencent.mm.plugin.sns.ui.SnsHeader");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCoverPreOpen", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            if (c18062xf8f7b205.f248715x != null) {
                c18062xf8f7b205.f248715x.animate().translationY(-r6.getHeight()).start();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCoverPreOpen", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        } else if (i17 == 3) {
            c18062xf8f7b205.f248698d.f249725i.b();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCoverPreClose", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            android.view.View view2 = c18062xf8f7b205.f248715x;
            if (view2 != null) {
                view2.animate().translationY(0.0f).start();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCoverPreClose", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onOpenStateChange", "com.tencent.mm.plugin.sns.ui.SnsHeader$2");
    }
}
