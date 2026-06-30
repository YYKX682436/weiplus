package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f229881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c f229882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i f229883f;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i iVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c) {
        this.f229883f = iVar;
        this.f229881d = i17;
        this.f229882e = c19100xad1ade2c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mall/ui/FunctionListAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.h hVar = this.f229883f.f229926f;
        if (hVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.y) hVar;
            yVar.getClass();
            int i17 = this.f229881d;
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19100xad1ade2c c19100xad1ade2c = this.f229882e;
            if (c19100xad1ade2c != null) {
                boolean z17 = false;
                boolean z18 = (bt4.c.a(c19100xad1ade2c.f261352d) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19100xad1ade2c.f261362q)) ? false : true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16473xfb0d5c3 abstractActivityC16473xfb0d5c3 = yVar.f230047a;
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "onFunctionItemClick show disclaimer funcId=%s", c19100xad1ade2c.f261352d);
                    java.lang.String string = abstractActivityC16473xfb0d5c3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gsz);
                    java.lang.String string2 = abstractActivityC16473xfb0d5c3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11565x2acac113 c11565x2acac113 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11565x2acac113();
                    c11565x2acac113.f156519d = 2;
                    c11565x2acac113.f156521f = string;
                    c11565x2acac113.f156522g = c19100xad1ade2c.f261362q;
                    c11565x2acac113.f156523h = string2;
                    c11565x2acac113.f156524i = false;
                    c11565x2acac113.f156520e = c19100xad1ade2c.f261352d;
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putParcelable("weapp_open_declare_prompt_key", c11565x2acac113);
                    if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_dialog_optimize_switch, 1) == 1)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "handleFunctionByAppBrand clicfg_appbrand_dialog_optimize_switch close");
                    } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19100xad1ade2c.f261357i)) {
                        if (((tg1.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i6.class))).wi(c19100xad1ade2c.f261357i, bundle)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallIndexBaseUI", "handleFunctionByAppBrand, intercept by AppBrandNativeLink, nativeUrl = %s", c19100xad1ade2c.f261357i);
                            bt4.f.b().f(c19100xad1ade2c.f261352d);
                            bt4.g.b().d(c19100xad1ade2c.f261352d);
                            if (c19100xad1ade2c.f261360o != null) {
                                bt4.f.b().d(c19100xad1ade2c);
                            }
                            if (i17 >= 0) {
                                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.p2370x330614.C19101x8593f27 c19101x8593f27 = c19100xad1ade2c.f261360o;
                                java.lang.String str = (c19101x8593f27 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19101x8593f27.f261367g)) ? "" : c19100xad1ade2c.f261360o.f261367g;
                                java.util.ArrayList arrayList2 = abstractActivityC16473xfb0d5c3.f229777i;
                                int size = arrayList2 == null ? 0 : arrayList2.size();
                                boolean d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.i.d(c19100xad1ade2c);
                                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                                java.lang.Object[] objArr = new java.lang.Object[10];
                                objArr[0] = c19100xad1ade2c.f261352d;
                                objArr[1] = java.lang.Integer.valueOf(size);
                                objArr[2] = 0;
                                objArr[3] = java.lang.Integer.valueOf(i17);
                                objArr[4] = str;
                                objArr[5] = java.lang.Integer.valueOf(d17 ? 2 : 1);
                                objArr[6] = 1;
                                objArr[7] = 0;
                                objArr[8] = 0;
                                objArr[9] = 0;
                                g0Var.d(10881, objArr);
                            }
                            z17 = true;
                        }
                    }
                    if (!z17) {
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = abstractActivityC16473xfb0d5c3.mo55332x76847179();
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
                        aVar.f293242a = string;
                        aVar.f293262s = c19100xad1ade2c.f261362q;
                        aVar.f293265v = string2;
                        aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.w(yVar, c19100xad1ade2c, i17);
                        aVar.A = true;
                        aVar.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.x(yVar, c19100xad1ade2c);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
                        j0Var.e(aVar);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
                        if (d0Var != null) {
                            d0Var.a(j0Var.f293370r);
                        }
                        j0Var.show();
                    }
                } else {
                    abstractActivityC16473xfb0d5c3.Y6(c19100xad1ade2c, i17);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14419, abstractActivityC16473xfb0d5c3.f229776h, 4, java.lang.Integer.valueOf(c19100xad1ade2c.f261361p));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MallIndexBaseUI", "onFunctionItemClick functionItem null; pos=%d", java.lang.Integer.valueOf(i17));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mall/ui/FunctionListAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
