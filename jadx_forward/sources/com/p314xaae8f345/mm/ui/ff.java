package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public class ff implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21424xdbf688d7 f290123e;

    public ff(com.p314xaae8f345.mm.ui.C21424xdbf688d7 c21424xdbf688d7, java.lang.String str) {
        this.f290123e = c21424xdbf688d7;
        this.f290122d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MultiTalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomPopupNav", "click enter button..");
        java.lang.String str = this.f290122d;
        com.p314xaae8f345.mm.ui.C21424xdbf688d7 c21424xdbf688d7 = this.f290123e;
        if (str != null) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).ff()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkRoomPopupNav", "now is in other voip..");
                db5.e1.s(c21424xdbf688d7.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h1z), null);
                yj0.a.h(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            java.util.List P6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).P6(c21424xdbf688d7.f278533m);
            if (P6 == null || P6.size() != 1) {
                com.p314xaae8f345.mm.ui.kf kfVar = com.p314xaae8f345.mm.ui.kf.Inviting;
                if (P6 != null && P6.size() >= zj3.j.e()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkRoomPopupNav", "now is up to the limit,memberList size:" + P6.size());
                    db5.e1.s(c21424xdbf688d7.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574125h26, java.lang.Integer.valueOf(zj3.j.e())), null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    java.lang.Object[] objArr = new java.lang.Object[7];
                    objArr[0] = 1;
                    objArr[1] = java.lang.Integer.valueOf(c21424xdbf688d7.f278536p == kfVar ? 1 : 0);
                    objArr[2] = 1;
                    objArr[3] = 1;
                    objArr[4] = c21424xdbf688d7.f278533m;
                    objArr[5] = java.lang.Integer.valueOf(c21424xdbf688d7.f278541u.f66526xeabee3b);
                    objArr[6] = java.lang.Long.valueOf(c21424xdbf688d7.f278541u.f66527xc6d1e13f);
                    g0Var.d(13945, objArr);
                    yj0.a.h(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).e5()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkRoomPopupNav", "now is inviting other people voip..");
                    db5.e1.s(c21424xdbf688d7.getContext(), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h1y), null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    java.lang.Object[] objArr2 = new java.lang.Object[7];
                    objArr2[0] = 1;
                    objArr2[1] = java.lang.Integer.valueOf(c21424xdbf688d7.f278536p == kfVar ? 1 : 0);
                    objArr2[2] = 0;
                    objArr2[3] = 1;
                    objArr2[4] = c21424xdbf688d7.f278533m;
                    objArr2[5] = java.lang.Integer.valueOf(c21424xdbf688d7.f278541u.f66526xeabee3b);
                    objArr2[6] = java.lang.Long.valueOf(c21424xdbf688d7.f278541u.f66527xc6d1e13f);
                    g0Var2.d(13945, objArr2);
                    yj0.a.h(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.Z = new com.p314xaae8f345.mm.ui.C22398x5cc4721();
                c21424xdbf688d7.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomPopupNav", "now try enter multitalk:" + str);
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).mh(str)) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).B2(str);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    java.lang.Object[] objArr3 = new java.lang.Object[7];
                    objArr3[0] = 1;
                    objArr3[1] = java.lang.Integer.valueOf(c21424xdbf688d7.f278536p == kfVar ? 1 : 0);
                    objArr3[2] = 0;
                    objArr3[3] = 0;
                    objArr3[4] = c21424xdbf688d7.f278533m;
                    objArr3[5] = java.lang.Integer.valueOf(c21424xdbf688d7.f278541u.f66526xeabee3b);
                    objArr3[6] = java.lang.Long.valueOf(c21424xdbf688d7.f278541u.f66527xc6d1e13f);
                    g0Var3.d(13945, objArr3);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkRoomPopupNav", "try enter fail!" + str);
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h1k), 0).show();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    java.lang.Object[] objArr4 = new java.lang.Object[7];
                    objArr4[0] = 1;
                    objArr4[1] = java.lang.Integer.valueOf(c21424xdbf688d7.f278536p == kfVar ? 1 : 0);
                    objArr4[2] = 0;
                    objArr4[3] = 1;
                    objArr4[4] = c21424xdbf688d7.f278533m;
                    objArr4[5] = java.lang.Integer.valueOf(c21424xdbf688d7.f278541u.f66526xeabee3b);
                    objArr4[6] = java.lang.Long.valueOf(c21424xdbf688d7.f278541u.f66527xc6d1e13f);
                    g0Var4.d(13945, objArr4);
                }
                com.p314xaae8f345.mm.ui.Cif cif = c21424xdbf688d7.f278546z;
                if (cif != null) {
                    ((wj5.q) cif).f528366a.f528369g.m0();
                }
            } else {
                c21424xdbf688d7.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomPopupNav", "when only on menber do clear banner!");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).J4(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomPopupNav", "when only on member do exit talk!");
                if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.y.class)).Gf(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomPopupNav", "when only on member do exit talk failure! groupId:" + str);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13945, 1, 0, 0, 1, c21424xdbf688d7.f278533m, java.lang.Integer.valueOf(c21424xdbf688d7.f278541u.f66526xeabee3b), java.lang.Long.valueOf(c21424xdbf688d7.f278541u.f66527xc6d1e13f));
            }
        }
        com.p314xaae8f345.mm.ui.jf.a(c21424xdbf688d7.f278537q);
        c21424xdbf688d7.f278527d.setVisibility(0);
        c21424xdbf688d7.mo78794x295c769d(com.p314xaae8f345.mm.R.C30861xcebc809e.b7a);
        c21424xdbf688d7.f278528e.setVisibility(0);
        c21424xdbf688d7.f278538r.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
