package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ga0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f194199p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f194200q;

    /* renamed from: r, reason: collision with root package name */
    public st2.h1 f194201r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f194199p = statusMonitor;
        this.f194200q = "Finder.LiveShoppingListPlugin";
        if (zl2.r4.f555483a.w1() && ((mm2.c1) P0(mm2.c1.class)).Y4) {
            root.setElevation(root.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562079a43));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "FinderLiveShoppingListPlugin init!");
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        dk2.xf xfVar;
        st2.h1 h1Var = this.f194201r;
        if (h1Var == null || i17 != 1013) {
            return;
        }
        if (i18 != -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "onActivityResult:REQUEST_MANAGER_PRODUCT,resultCode:" + i18);
            return;
        }
        java.io.Serializable a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.q1.f197186a.a(intent, "KEY_PRODUCTLIST");
        java.util.List list = null;
        java.util.List<byte[]> list2 = a17 instanceof java.util.List ? (java.util.List) a17 : null;
        if (list2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            for (byte[] bArr : list2) {
                r45.y46 y46Var = new r45.y46();
                if (bArr != null) {
                    try {
                        y46Var.mo11468x92b714fd(bArr);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                    arrayList.add(y46Var);
                }
                y46Var = null;
                arrayList.add(y46Var);
            }
            list = kz5.n0.V(arrayList);
        }
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_DELETE", false) : false;
        if (list != null && (xfVar = h1Var.f493869g) != null) {
            android.content.Context context = h1Var.f493866d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
            gk2.e eVar = h1Var.f493868f;
            ((dk2.r4) xfVar).a0(abstractActivityC21394xb3d2c0cf, ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.c1) eVar.a(mm2.c1.class)).f410385o, zl2.r4.f555483a.I(booleanExtra ? 102 : 101, new java.util.LinkedList(list)), new st2.g0(h1Var));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "list:" + list + ",delete:" + booleanExtra);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        st2.h1 h1Var = this.f194201r;
        if (h1Var != null) {
            java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
            java.lang.String str = string != null ? string : "";
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "PORTRAIT_ACTION_FULL_SCREEN_MINIPRO")) {
                st2.j0 j0Var = new st2.j0(h1Var, obj, j17);
                java.util.regex.Pattern pattern = pm0.v.f438335a;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(j0Var, j17);
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "PORTRAIT_ACTION_HALF_SCREEN_MINIPRO")) {
                st2.k0 k0Var = new st2.k0(h1Var, obj, j17);
                java.util.regex.Pattern pattern2 = pm0.v.f438335a;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(k0Var, j17);
            }
        }
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        st2.h1 h1Var = this.f194201r;
        if (h1Var != null) {
            h1Var.u();
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // qo0.a
    public void J0() {
        android.content.Context context = this.f446856d.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        t1(activity != null ? activity.getIntent() : null);
        st2.h1 h1Var = this.f194201r;
        if (h1Var == null || !h1Var.z()) {
            return;
        }
        h1Var.B(null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = h1Var.f493870h;
        if (lVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(lVar, null, null, new st2.k(h1Var, false, null), 3, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f2, code lost:
    
        if (r5.m75939xb282bd08(0) == 1) goto L57;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void M0(qo0.b r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0.M0(qo0.b, android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void O0() {
        super.O0();
        st2.h1 h1Var = this.f194201r;
        if (h1Var != null) {
            tt2.e1 e1Var = h1Var.P;
            e1Var.f503425w = null;
            e1Var.f503426x = null;
            e1Var.f503427y = null;
            e1Var.f503428z = null;
            e1Var.A = null;
            tt2.a aVar = h1Var.Q;
            aVar.f503361m = null;
            aVar.f503362n = null;
            tt2.e1 e1Var2 = h1Var.R;
            e1Var2.f503425w = null;
            e1Var2.f503426x = null;
            e1Var2.f503427y = null;
            e1Var2.f503428z = null;
            e1Var2.A = null;
            ut2.j5 k17 = h1Var.k();
            java.lang.Object mo141623x754a37bb = ((jz5.n) k17.f512475m).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ((android.view.View) mo141623x754a37bb).setOnClickListener(null);
            k17.j().setOnClickListener(null);
            k17.m().setOnClickListener(null);
            k17.h().setOnClickListener(null);
            android.view.View view = h1Var.f493879s;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blankArea");
                throw null;
            }
            view.setOnClickListener(null);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.v2 v2Var = h1Var.f493876p0;
            if (v2Var != null) {
                h1Var.q().U0(v2Var);
            }
            h1Var.f493876p0 = null;
            h1Var.h().m81307xf9cef5a7(null);
            e1Var.f503424v = null;
            aVar.getClass();
            e1Var2.f503424v = null;
            st2.p2 p2Var = h1Var.K;
            if (p2Var != null && p2Var.f493953g != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14399xad75a698 c14399xad75a698 = p2Var.f493948b;
                c14399xad75a698.m57905x5dfd9471(null);
                c14399xad75a698.m57904x6fb39c33(false);
                p2Var.f493947a.k();
            }
            h1Var.K = null;
        }
        this.f194201r = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return ((mm2.g0) P0(mm2.g0.class)).U6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l
    public void k1(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f194200q, "clickEmptyAreaClose = " + (intent != null ? intent.getBooleanExtra("extra_start_by_half_screen_empty_area_click_scene", false) : false));
        t1(intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return false;
    }

    public final void t1(android.content.Intent intent) {
        android.app.Activity activity;
        android.content.Intent intent2;
        android.content.Intent intent3;
        android.content.Intent intent4;
        int intExtra = intent != null ? intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) : 0;
        android.view.ViewGroup viewGroup = this.f446856d;
        qo0.c cVar = this.f194199p;
        boolean z17 = true;
        if (intExtra == 6) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", false);
            java.lang.Long valueOf = intent != null ? java.lang.Long.valueOf(intent.getLongExtra("KEY_SHOP_SHELF_TARGET_PRODUCT_ID", -1L)) : null;
            if (valueOf != null && valueOf.longValue() == -1) {
                z17 = false;
            }
            if (!z17) {
                valueOf = null;
            }
            if (valueOf != null) {
                bundle.putLong("PARAM_FINDER_LIVE_AUTO_LOCATE_PRODUCTID", valueOf.longValue());
            }
            cVar.mo46557x60d69242(qo0.b.f446882f2, bundle);
            android.content.Context context = viewGroup.getContext();
            activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null || (intent2 = activity.getIntent()) == null) {
                return;
            }
            intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            return;
        }
        if (intExtra == 17) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", false);
            bundle2.putBoolean("PARAM_FINDER_LIVE_SHOPPING_LOCATE_HOT_SALE_TAB", true);
            cVar.mo46557x60d69242(qo0.b.f446882f2, bundle2);
            android.content.Context context2 = viewGroup.getContext();
            activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
            if (activity == null || (intent3 = activity.getIntent()) == null) {
                return;
            }
            intent3.putExtra("KEY_PARAMS_DO_ACTION", 0);
            return;
        }
        if (intExtra != 18) {
            return;
        }
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", false);
        bundle3.putBoolean("PARAM_FINDER_LIVE_SHOPPING_AUTO_SHOW_COUPON", true);
        cVar.mo46557x60d69242(qo0.b.f446882f2, bundle3);
        android.content.Context context3 = viewGroup.getContext();
        activity = context3 instanceof android.app.Activity ? (android.app.Activity) context3 : null;
        if (activity == null || (intent4 = activity.getIntent()) == null) {
            return;
        }
        intent4.putExtra("KEY_PARAMS_DO_ACTION", 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void z0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f194200q, "FinderLiveShoppingListPlugin mount!");
        super.z0();
        st2.h1 h1Var = new st2.h1(this.f446856d, this.f194199p, S0(), W0(), this);
        this.f194201r = h1Var;
        st2.d0 d0Var = new st2.d0(h1Var);
        tt2.e1 e1Var = h1Var.P;
        h1Var.H(e1Var);
        tt2.a aVar = h1Var.Q;
        aVar.f503361m = d0Var;
        aVar.f503362n = new st2.z(h1Var);
        tt2.e1 e1Var2 = h1Var.R;
        e1Var2.f503425w = h1Var.Z;
        e1Var2.f503426x = new st2.t(h1Var);
        e1Var2.f503428z = new st2.u(h1Var);
        android.view.View view = h1Var.f493879s;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blankArea");
            throw null;
        }
        view.setOnClickListener(h1Var);
        android.view.View view2 = h1Var.F;
        if (view2 != null) {
            view2.setOnClickListener(h1Var);
        }
        android.view.View view3 = h1Var.D;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("goodListOfCouponBack");
            throw null;
        }
        view3.setOnClickListener(h1Var);
        android.view.View view4 = h1Var.E;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("secondaryPageBack");
            throw null;
        }
        view4.setOnClickListener(h1Var);
        st2.v vVar = new st2.v(h1Var);
        h1Var.q().P(vVar);
        h1Var.f493876p0 = vVar;
        h1Var.h().m81307xf9cef5a7(new st2.x(h1Var));
        e1Var.f503424v = h1Var;
        e1Var2.f503424v = h1Var;
        aVar.getClass();
        android.view.ViewGroup viewGroup = this.f446856d;
        android.content.Context context = viewGroup.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        android.content.Intent intent = activity != null ? activity.getIntent() : null;
        if ((intent != null && intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) == 8) || ((mm2.f6) P0(mm2.f6.class)).f410585x1) {
            if (intent != null) {
                intent.putExtra("KEY_PARAMS_DO_ACTION", 0);
            }
            ((mm2.f6) P0(mm2.f6.class)).T6(false);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", false);
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOW_SHOP_FROM_SNS", true);
            this.f194199p.mo46557x60d69242(qo0.b.f446882f2, bundle);
        }
        android.content.Context context2 = viewGroup.getContext();
        android.app.Activity activity2 = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        t1(activity2 != null ? activity2.getIntent() : null);
    }
}
