package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3;

/* loaded from: classes9.dex */
public final class t1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf f176910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f176911e;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf, java.util.List list) {
        this.f176910d = activityC13074xfcf8fabf;
        this.f176911e = list;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        r45.xt xtVar = (r45.xt) this.f176911e.get(i17);
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf.S;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v3.ActivityC13074xfcf8fabf activityC13074xfcf8fabf = this.f176910d;
        activityC13074xfcf8fabf.getClass();
        if (xtVar != null) {
            int i19 = xtVar.f471918e;
            if (i19 == 1) {
                java.lang.String str2 = xtVar.f471919f;
                if (str2 != null) {
                    lu1.d.j(activityC13074xfcf8fabf, str2, 0);
                    return;
                }
                return;
            }
            if (i19 == 2) {
                r45.iu iuVar = xtVar.f471920g;
                if (iuVar != null) {
                    lu1.d.f(iuVar.f458861d, iuVar.f458862e, iuVar.f458863f);
                    return;
                }
                return;
            }
            if (i19 == 3 && (str = xtVar.f471921h) != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "weixin://mktcard/membercardhistory")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19747, 1, 2);
                java.lang.String str3 = xtVar.f471917d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13074xfcf8fabf.f176802i, "go to vip history card list");
                android.content.Intent intent = new android.content.Intent(activityC13074xfcf8fabf.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76.class);
                intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str3);
                intent.putExtra("card_type", 3);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13074xfcf8fabf.mo55332x76847179();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v3/VipCardListUI", "gotoVipHistoryCardListUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/card/ui/v3/VipCardListUI", "gotoVipHistoryCardListUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }
}
