package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class t1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.VipCardListUI f95377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f95378e;

    public t1(com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI, java.util.List list) {
        this.f95377d = vipCardListUI;
        this.f95378e = list;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        r45.xt xtVar = (r45.xt) this.f95378e.get(i17);
        int i18 = com.tencent.mm.plugin.card.ui.v3.VipCardListUI.S;
        com.tencent.mm.plugin.card.ui.v3.VipCardListUI vipCardListUI = this.f95377d;
        vipCardListUI.getClass();
        if (xtVar != null) {
            int i19 = xtVar.f390385e;
            if (i19 == 1) {
                java.lang.String str2 = xtVar.f390386f;
                if (str2 != null) {
                    lu1.d.j(vipCardListUI, str2, 0);
                    return;
                }
                return;
            }
            if (i19 == 2) {
                r45.iu iuVar = xtVar.f390387g;
                if (iuVar != null) {
                    lu1.d.f(iuVar.f377328d, iuVar.f377329e, iuVar.f377330f);
                    return;
                }
                return;
            }
            if (i19 == 3 && (str = xtVar.f390388h) != null && kotlin.jvm.internal.o.b(str, "weixin://mktcard/membercardhistory")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 1, 2);
                java.lang.String str3 = xtVar.f390384d;
                com.tencent.mars.xlog.Log.i(vipCardListUI.f95269i, "go to vip history card list");
                android.content.Intent intent = new android.content.Intent(vipCardListUI.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.card.ui.v4.HistoryCardListUI.class);
                intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str3);
                intent.putExtra("card_type", 3);
                androidx.appcompat.app.AppCompatActivity context = vipCardListUI.getContext();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v3/VipCardListUI", "gotoVipHistoryCardListUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/card/ui/v3/VipCardListUI", "gotoVipHistoryCardListUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }
}
