package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class qb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f74136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.MobileInputUI f74137e;

    public qb(com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI, boolean[] zArr) {
        this.f74137e = mobileInputUI;
        this.f74136d = zArr;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/ui/MobileInputUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean[] zArr = this.f74136d;
        boolean z17 = zArr[0];
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = this.f74137e;
        if (z17) {
            zArr[0] = false;
        } else {
            int i17 = com.tencent.mm.plugin.account.ui.MobileInputUI.W;
            boolean X6 = mobileInputUI.X6();
            fo3.s sVar = fo3.s.INSTANCE;
            if (X6) {
                java.lang.String a17 = fo3.l.a(1);
                mobileInputUI.Q = a17;
                sVar.qb("ce_reg", "<Reg>", a17);
                sVar.H2("ce_reg", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
                sVar.Qa("ce_reg");
            }
            if (mobileInputUI.W6()) {
                java.lang.String a18 = fo3.l.a(2);
                mobileInputUI.R = a18;
                sVar.qb("ce_login_id", "<Login>", a18);
                sVar.H2("ce_login_id", android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 65535));
                sVar.Qa("ce_login_id");
            }
        }
        java.util.Map map = mobileInputUI.S;
        java.lang.Object obj = ((java.util.HashMap) map).get("login_page_type");
        if (obj instanceof java.lang.Integer) {
            if (((java.lang.Integer) obj).intValue() == 4) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("agree_continue_login_process", "view_clk", map, 34575);
            } else {
                v61.d.g("login_account", 2);
            }
        }
        mobileInputUI.hideVKB();
        mobileInputUI.V.a(mobileInputUI, new com.tencent.mm.plugin.account.ui.ub(mobileInputUI));
        yj0.a.h(this, "com/tencent/mm/plugin/account/ui/MobileInputUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
