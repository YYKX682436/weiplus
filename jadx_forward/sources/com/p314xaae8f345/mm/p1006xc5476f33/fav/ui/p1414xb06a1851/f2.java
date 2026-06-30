package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class f2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13594x1487ddc7 f182253d;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13594x1487ddc7 activityC13594x1487ddc7) {
        this.f182253d = activityC13594x1487ddc7;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13594x1487ddc7 activityC13594x1487ddc7 = this.f182253d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            java.lang.String str = activityC13594x1487ddc7.f182191f;
            activityC13594x1487ddc7.getClass();
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Bi(activityC13594x1487ddc7.mo55332x76847179(), str, new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.h2(activityC13594x1487ddc7, str, activityC13594x1487ddc7));
            return;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        jd5.c cVar = new jd5.c();
        java.lang.String str2 = activityC13594x1487ddc7.f182190e;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str2 == null) {
            str2 = "";
        }
        cVar.o(str2);
        java.lang.String str3 = activityC13594x1487ddc7.f182191f;
        cVar.r(str3 != null ? str3 : "");
        cVar.q(activityC13594x1487ddc7.f182192g);
        n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13594x1487ddc7.mo55332x76847179();
        n13.r a17 = n13.r.a(1);
        a17.f415653d.f415672a = 6;
        ((dk5.b0) b0Var).Bi(mo55332x76847179, cVar, a17);
        if (activityC13594x1487ddc7.f182206x == 0) {
            o72.v2.d(activityC13594x1487ddc7.getIntent().getLongExtra("key_detail_info_id", 0L), 1, 0);
        }
    }
}
