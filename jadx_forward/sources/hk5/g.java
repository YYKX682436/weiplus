package hk5;

/* loaded from: classes5.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk5.k f363537d;

    public g(hk5.k kVar) {
        this.f363537d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean booleanValue;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/uic/preview/ForwardMsgPreviewAppBrandUIC$overrideConfirmButtons$confirmClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hk5.k kVar = this.f363537d;
        if (kVar.f363544n) {
            yj0.a.h(this, "com/tencent/mm/ui/transmit/uic/preview/ForwardMsgPreviewAppBrandUIC$overrideConfirmButtons$confirmClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        hk5.c cVar = kVar.f363543m;
        if (cVar != null) {
            java.lang.String str = cVar.f363532a;
            java.lang.String str2 = cVar.f363533b;
            kVar.f363544n = true;
            kVar.W6().a().setEnabled(false);
            kVar.W6().i().setEnabled(false);
            android.widget.ImageView imageView = (android.widget.ImageView) kVar.W6().h().findViewById(com.p314xaae8f345.mm.R.id.sdz);
            if (imageView != null) {
                android.view.ViewParent parent = imageView.getParent();
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = parent instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) parent : null;
                if (c1073x7e08a787 != null) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 c22651x9410f9f9 = kVar.f363542i;
                    if (c22651x9410f9f9 != null) {
                        c1073x7e08a787.removeView(c22651x9410f9f9);
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 c22651x9410f9f92 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9(kVar.m158354x19263085());
                    c22651x9410f9f92.setId(android.view.View.generateViewId());
                    p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-2, -2);
                    layoutParams.f92426h = 0;
                    layoutParams.f92432k = 0;
                    layoutParams.f92439q = 0;
                    layoutParams.f92441s = 0;
                    c22651x9410f9f92.setLayoutParams(layoutParams);
                    c22651x9410f9f92.setVisibility(0);
                    c22651x9410f9f92.e();
                    c1073x7e08a787.addView(c22651x9410f9f92);
                    kVar.f363542i = c22651x9410f9f92;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForwardMsgPreviewAppBrandUIC", "uploadAndConfirm appId:" + str + " path:" + str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.b0 b0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.b0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.b0.class);
            hk5.j jVar = new hk5.j(kVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.p pVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.p) b0Var;
            pVar.getClass();
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            java.lang.Boolean bool = pVar.f161863d;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                pVar.f161863d = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_wxa_share_to_yuanbao, 0) == 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandYuanbaoService", "enableShareToYuanbao: " + pVar.f161863d);
                java.lang.Boolean bool2 = pVar.f161863d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool2);
                booleanValue = bool2.booleanValue();
            }
            if (!booleanValue) {
                jVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.c0(false, null, null, null, 0L, 30, null));
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandYuanbaoService", "getAndUploadPageContent fail, appId is null");
                jVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.c0(false, null, null, null, 0L, 30, null));
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.e(pVar, str, jVar, str2, null), 3, null);
            } else {
                jVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727.c0(false, null, null, null, 0L, 30, null));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandYuanbaoService", "getAndUploadPageContent fail, process:" + bm5.f1.a() + " error");
            }
        } else {
            j75.f Q6 = kVar.Q6();
            if (Q6 != null) {
                Q6.B3(new wg5.d());
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/transmit/uic/preview/ForwardMsgPreviewAppBrandUIC$overrideConfirmButtons$confirmClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
