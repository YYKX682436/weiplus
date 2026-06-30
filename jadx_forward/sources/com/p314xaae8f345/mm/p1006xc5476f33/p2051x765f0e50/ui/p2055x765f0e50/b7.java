package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public final class b7 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.a7 f242394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void O6(byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAuthDataUIC", "getAuthData nextPageData: %s", bArr);
        gm0.j1.d().g(new k14.c0(bArr, true));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        gm0.j1.d().a(1146, this);
        O6(null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        gm0.j1.d().q(1146, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.a7 a7Var;
        boolean z17;
        boolean z18;
        int i19;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getUserAuthList onSceneEnd errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        sb6.append(", type: ");
        sb6.append(m1Var != null ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAuthDataUIC", sb6.toString());
        if (i17 != 0 || i18 != 0) {
            if (!(m1Var != null && m1Var.mo808xfb85f7b0() == 1146) || (a7Var = this.f242394d) == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsAuthUI", "getAuthData onFailed errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f = ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.u7) a7Var).f243133a;
            activityC17414x34d8ac5f.f241876v = false;
            activityC17414x34d8ac5f.Z6(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l7 l7Var = activityC17414x34d8ac5f.f241868n;
            if (l7Var != null && l7Var.x()) {
                activityC17414x34d8ac5f.Y6(true);
                activityC17414x34d8ac5f.a7(false, "");
                return;
            }
            android.view.View view = activityC17414x34d8ac5f.f241877w;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.ime)).setVisibility(0);
            android.view.View view2 = activityC17414x34d8ac5f.f241877w;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
            ((android.widget.ProgressBar) view2.findViewById(com.p314xaae8f345.mm.R.id.imd)).setVisibility(8);
            return;
        }
        if (m1Var != null && m1Var.mo808xfb85f7b0() == 1146) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.model.NetSceneGetUserAuthList");
            k14.c0 c0Var = (k14.c0) m1Var;
            c0Var.H();
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.a7 a7Var2 = this.f242394d;
            if (a7Var2 != null) {
                boolean z19 = c0Var.f384847f != null;
                r45.cq3 cq3Var = c0Var.f384846e;
                java.util.List emptyList = cq3Var != null ? cq3Var.f453321e : java.util.Collections.emptyList();
                byte[] H = c0Var.H();
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17414x34d8ac5f activityC17414x34d8ac5f2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.u7) a7Var2).f243133a;
                activityC17414x34d8ac5f2.f241876v = false;
                activityC17414x34d8ac5f2.f241869o = H;
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.l7 l7Var2 = activityC17414x34d8ac5f2.f241868n;
                if (l7Var2 != null) {
                    java.util.List list = l7Var2.f242809f;
                    if (z19) {
                        z18 = false;
                    } else {
                        l7Var2.f242810g = false;
                        ((java.util.ArrayList) list).clear();
                        z18 = true;
                    }
                    if (emptyList == null || emptyList.isEmpty()) {
                        i19 = 0;
                    } else {
                        i19 = !l7Var2.f242811h ? ((java.util.ArrayList) list).size() : 0;
                        l7Var2.f242812i += emptyList.size();
                        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(emptyList, 10));
                        java.util.Iterator it = emptyList.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h7(1, (r45.ov6) it.next()));
                        }
                        ((java.util.ArrayList) list).addAll(arrayList);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f = l7Var2.f242808e;
                    if (H == null) {
                        if (!l7Var2.f242810g) {
                            l7Var2.f242810g = true;
                            ((java.util.ArrayList) list).add(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.h7(2, null));
                        }
                        c12808x5de4409f.m1(false);
                    } else {
                        c12808x5de4409f.m1(true);
                    }
                    if (z18) {
                        l7Var2.m8146xced61ae5();
                    } else {
                        l7Var2.m8153xd399a4d9(i19, ((java.util.ArrayList) list).size() - i19);
                    }
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("updateAuthData loadFirst: ");
                    sb7.append(l7Var2.f242811h);
                    sb7.append(", loadFinished: ");
                    sb7.append(l7Var2.f242810g);
                    sb7.append(", requestNextPage: ");
                    sb7.append(z19);
                    sb7.append(", getDataSize: ");
                    sb7.append(emptyList != null ? java.lang.Integer.valueOf(emptyList.size()) : null);
                    sb7.append(", currentDataSize: ");
                    sb7.append(l7Var2.f242812i);
                    sb7.append(", insertPosition: ");
                    sb7.append(i19);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAuthUI", sb7.toString());
                    z17 = false;
                    l7Var2.f242811h = false;
                } else {
                    z17 = false;
                }
                activityC17414x34d8ac5f2.Z6(z17);
                activityC17414x34d8ac5f2.W6();
            }
        }
    }
}
