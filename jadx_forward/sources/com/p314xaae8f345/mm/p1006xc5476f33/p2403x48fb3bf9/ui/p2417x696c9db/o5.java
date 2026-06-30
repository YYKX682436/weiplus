package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class o5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 f268262d;

    public o5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var) {
        this.f268262d = b5Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var = this.f268262d;
        boolean p17 = b5Var.p();
        try {
            z17 = b5Var.f265480o.mo74477x143f1b92().A.lb();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "get has setuin failed : %s", e17.getMessage());
            z17 = false;
        }
        boolean z18 = (b5Var.f265480o.mo74477x143f1b92().R.b().f273710d & 16384) > 0;
        boolean z19 = (b5Var.f265480o.mo74477x143f1b92().R.b().f273710d & 32768) > 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "installMenuItems hasSetAcc = %b, canShareImage = %b, canFavImage = %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!p17) {
            if (z17 && z18) {
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x5(1, b5Var.l().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hr_)));
            }
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x5(2, b5Var.l().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i8c)));
            if (z17 && z19) {
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x5(3, b5Var.l().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg)));
            }
            if (!((qk.s6) gm0.j1.s(qk.s6.class)).mo13794x74219ae7()) {
                if (((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(7, 8)) {
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x5(6, ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Di(7, 8)));
                    ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ri(7, 8, tg0.e1.f500594d);
                } else {
                    arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x5(5, b5Var.l().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hku)));
                }
                android.os.Bundle bundle = new android.os.Bundle();
                try {
                    bundle.putString("web_search_data_ui_image_path", b5Var.f265467b);
                    bundle.putString("web_search_data_ui_image_path_origin_url", b5Var.f265474i);
                    b5Var.f265480o.mo74477x143f1b92().A.ng(54, bundle, b5Var.f265480o.mo74477x143f1b92().U());
                } catch (android.os.RemoteException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "processImgSosoLogic exp:%s", e18.getLocalizedMessage());
                }
            }
        }
        java.util.ArrayList arrayList2 = b5Var.f265466a;
        boolean L0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList2);
        kd0.p2 p2Var = b5Var.f265472g;
        if (!L0) {
            arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x5(4, ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var).m(arrayList2)));
        }
        b5Var.f265471f.o(null);
        g4Var.clear();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x5 x5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x5) arrayList.get(i17);
            int i18 = x5Var.f269200a;
            if (i18 == 4) {
                android.view.View c17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) p2Var).c(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s5(b5Var), arrayList2, null, 7);
                b5Var.f265471f.o(c17);
                if (c17 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.p2749xdcc86614.C22660xcf62c98b) {
                    if (arrayList.size() > 1) {
                        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2749xdcc86614.C22660xcf62c98b) c17).m81539x4078f8b0(0);
                    } else {
                        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2749xdcc86614.C22660xcf62c98b) c17).m81539x4078f8b0(8);
                    }
                }
            } else {
                g4Var.f(i18, x5Var.f269201b);
            }
        }
    }
}
