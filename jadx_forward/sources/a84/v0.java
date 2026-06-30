package a84;

/* loaded from: classes4.dex */
public abstract class v0 {
    public static final void a(android.content.Context context, android.view.View view, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scaleWithText", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
        if (context == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scaleWithText", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
            return;
        }
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scaleWithText", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
            return;
        }
        if (view.getLayoutParams() == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scaleWithText", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
            return;
        }
        float b17 = i65.a.b(context, i17) * i65.a.q(context);
        float b18 = i65.a.b(context, i18) * i65.a.q(context);
        view.getLayoutParams().width = (int) b17;
        view.getLayoutParams().height = (int) b18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scaleWithText", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
    }

    public static final void b(android.widget.TextView textView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setTextWeight", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.graphics.Typeface create = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT, i17, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(create, "create(...)");
            if (textView != null) {
                textView.setTypeface(create, 0);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setTextWeight", "com.tencent.mm.plugin.sns.ad.utils.SnsAdViewUtils");
    }
}
