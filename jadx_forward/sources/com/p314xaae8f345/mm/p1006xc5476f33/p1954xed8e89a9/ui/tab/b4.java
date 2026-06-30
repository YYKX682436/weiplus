package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes8.dex */
public final class b4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 f235788d;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.s4 s4Var) {
        this.f235788d = s4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.wl wlVar;
        r45.x6 x6Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.m0 m0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.u0) this.f235788d.f236082c).f236136a;
        if (m0Var.f235992n != null && (wlVar = m0Var.f235995q) != null && (x6Var = wlVar.G) != null) {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x6Var.f471343g);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m0Var.f235989h;
            if (!K0) {
                java.lang.String username = m0Var.f235992n.d1();
                long j17 = m0Var.D;
                android.content.Intent intent = abstractActivityC21394xb3d2c0cf.getIntent();
                int i17 = m0Var.L;
                int i18 = m0Var.f236000v;
                java.lang.String base64BizUin = m0Var.f235995q.G.f471343g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(base64BizUin, "base64BizUin");
                gr3.e.d(username, 2602, j17, intent, i17, i18, 0, null, "", base64BizUin, 0, 0, 3072, null);
            }
            java.lang.String str = m0Var.f235995q.G.f471344h;
            if (str.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactWidgetTabBizHeaderController", "goToAIChat extInfo empty");
            } else {
                try {
                    byte[] decode = android.util.Base64.decode(str, 0);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 d0Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0();
                    d0Var.mo11468x92b714fd(decode);
                    ((wx.u) ((wx.e1) i95.n0.c(wx.e1.class))).wi(abstractActivityC21394xb3d2c0cf, d0Var, m0Var.j());
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactWidgetTabBizHeaderController", "goToAIChat error: " + e17);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateFocus$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
