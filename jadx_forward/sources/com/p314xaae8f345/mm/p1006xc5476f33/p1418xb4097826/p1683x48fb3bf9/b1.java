package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public class b1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 f218383d;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var) {
        this.f218383d = n1Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var = this.f218383d;
        n1Var.getClass();
        try {
            z17 = n1Var.f().mo63365x1e89676e().lb();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "get has setuin failed : %s", e17.getMessage());
            z17 = false;
        }
        boolean z18 = (n1Var.f().mo63367xfb83db66().b().f273710d & 16384) > 0;
        boolean z19 = (n1Var.f().mo63367xfb83db66().b().f273710d & 32768) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "installMenuItems hasSetAcc = %b, canShareImage = %b, canFavImage = %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17 && z18) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.i1(1, n1Var.f().getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hr_)));
        }
        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.i1(2, n1Var.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8c)));
        if (z17 && z19) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.i1(3, n1Var.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg)));
        }
        if (!((qk.s6) gm0.j1.s(qk.s6.class)).mo13794x74219ae7()) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.i1(5, n1Var.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hku)));
            android.os.Bundle bundle = new android.os.Bundle();
            try {
                bundle.putString("web_search_data_ui_image_path", n1Var.f218431b);
                bundle.putString("web_search_data_ui_image_path_origin_url", n1Var.f218438i);
                n1Var.f().mo63365x1e89676e().ng(54, bundle, ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) n1Var.f().getWebViewController()).U());
            } catch (android.os.RemoteException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic exp:%s", e18.getLocalizedMessage());
            }
        }
        java.util.ArrayList arrayList2 = n1Var.f218430a;
        boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList2);
        kd0.p2 p2Var = n1Var.f218436g;
        if (!L0) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.i1(4, ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var).m(arrayList2)));
        }
        n1Var.f218435f.o(null);
        g4Var.clear();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.i1) arrayList.get(i17);
            int i18 = i1Var.f218407a;
            if (i18 == 4) {
                android.view.View c17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var).c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.f1(n1Var), arrayList2, null, 7);
                n1Var.f218435f.o(c17);
                if (c17 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2749xdcc86614.C22660xcf62c98b) {
                    if (arrayList.size() > 1) {
                        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2749xdcc86614.C22660xcf62c98b) c17).m81539x4078f8b0(0);
                    } else {
                        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2749xdcc86614.C22660xcf62c98b) c17).m81539x4078f8b0(8);
                    }
                }
            } else {
                g4Var.f(i18, i1Var.f218408b);
            }
        }
    }
}
