package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui;

/* loaded from: classes9.dex */
public class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19028xce441c18 f260163d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19028xce441c18 activityC19028xce441c18) {
        this.f260163d = activityC19028xce441c18;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/bind/ui/WalletResetInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19028xce441c18.f260122r;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19028xce441c18 activityC19028xce441c18 = this.f260163d;
        if (!activityC19028xce441c18.U6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Micromsg.WalletResetInfoUI", "input format illegal!");
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletResetInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (activityC19028xce441c18.f260126g.getVisibility() == 0) {
            activityC19028xce441c18.f260130n.f261085q = activityC19028xce441c18.f260126g.m83183xfb85ada3();
        }
        if (activityC19028xce441c18.f260125f.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c71 = activityC19028xce441c18.f260130n;
            java.lang.String m83183xfb85ada3 = activityC19028xce441c18.f260125f.m83183xfb85ada3();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m83183xfb85ada3 == null) {
                m83183xfb85ada3 = "";
            }
            c19090x75920c71.f261086r = m83183xfb85ada3;
        }
        if (activityC19028xce441c18.f260128i.getVisibility() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c712 = activityC19028xce441c18.f260130n;
            java.lang.String m83183xfb85ada32 = activityC19028xce441c18.f260127h.m83183xfb85ada3();
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            c19090x75920c712.f261083o = m83183xfb85ada32 != null ? m83183xfb85ada32 : "";
            activityC19028xce441c18.m83105x7498fe14().putString("key_mobile", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.e0(activityC19028xce441c18.f260130n.f261083o));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19090x75920c71 c19090x75920c713 = activityC19028xce441c18.f260130n;
        java.lang.String str = c19090x75920c713.f261078g;
        java.lang.String str2 = c19090x75920c713.f261079h;
        c19090x75920c713.f261076e = 1;
        c19090x75920c713.M = "+" + activityC19028xce441c18.f260128i.m73926x81cc056d();
        if (activityC19028xce441c18.m83105x7498fe14().getBoolean("key_is_changing_balance_phone_num", false)) {
            activityC19028xce441c18.m83098x5406100e(zr4.a.b(activityC19028xce441c18.f260130n, activityC19028xce441c18.f260129m, activityC19028xce441c18.m83105x7498fe14().getBoolean("key_isbalance", false)));
        } else {
            as4.b a17 = zr4.a.a(activityC19028xce441c18.f260130n, activityC19028xce441c18.f260129m, false);
            if (a17 != null) {
                activityC19028xce441c18.m83098x5406100e(a17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletResetInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
