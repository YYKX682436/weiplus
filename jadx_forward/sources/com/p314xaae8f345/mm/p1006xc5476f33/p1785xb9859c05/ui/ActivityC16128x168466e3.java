package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI */
/* loaded from: classes8.dex */
public class ActivityC16128x168466e3 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f224070d;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f224072f;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 f224071e = null;

    /* renamed from: g, reason: collision with root package name */
    public int f224073g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f224074h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f224075i = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f224076m = false;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f224077n = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5645xbd38c0>(com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.ipcall.ui.IPCallAddressUI.1
        {
            this.f39173x3fe91575 = 682820784;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5645xbd38c0 c5645xbd38c0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16128x168466e3.this.f224071e;
            if (m0Var == null) {
                return true;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i0(m0Var));
            return true;
        }
    };

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f224078o = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o0(this);

    public final void T6() {
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.READ_CONTACTS", 48, null, null);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallAddressUI", "summerper checkPermission checkContacts[%b],stack[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (a17) {
            s75.d.b(this.f224078o, "IPCallAddressUI_LoadSystemAddressBook");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.blk;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (this.f224073g == 1) {
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.u(new android.content.Intent(), this);
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onBusinessPermissionDenied */
    public void mo53824x34301f29(java.lang.String str) {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_IPCALL_HAS_ACTIVITY_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (((java.lang.Boolean) p17.m(u3Var, bool)).booleanValue()) {
            c01.d9.b().p().x(u3Var, bool);
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16125x200eafe3.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo55332x76847179, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mo55332x76847179.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(mo55332x76847179, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
            this.f224075i = false;
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.n0(this));
        if (this.f224075i) {
            this.f224076m = true;
            T6();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p18 = c01.d9.b().p();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_IPCALL_FIRST_IN_BOOLEAN;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        this.f224074h = ((java.lang.Boolean) p18.m(u3Var2, bool2)).booleanValue();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.g3s);
        this.f224070d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.f564265mc);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f564287n3);
        this.f224072f = findViewById;
        android.widget.ListView listView = this.f224070d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0(this, listView, findViewById);
        this.f224071e = m0Var;
        m0Var.f224463b = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j3(this);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(this, com.p314xaae8f345.mm.R.C30864xbddafb2a.blw, null);
        listView.addHeaderView(viewGroup, null, false);
        listView.setAdapter((android.widget.ListAdapter) m0Var.f224463b);
        m0Var.f224467f = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f563923d9);
        m0Var.f224468g = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f563939dq);
        m0Var.f224469h = (android.widget.LinearLayout) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f563915d1);
        m0Var.f224470i = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f563916d2);
        m0Var.f224471j = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.oss);
        viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f563942ds).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.d0(m0Var));
        viewGroup.findViewById(com.p314xaae8f345.mm.R.id.cfm).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e0(m0Var));
        viewGroup.findViewById(com.p314xaae8f345.mm.R.id.cyv).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f0(m0Var));
        listView.setOnItemClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.g0(m0Var));
        listView.setOnItemLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.h0(m0Var));
        if (((java.lang.Boolean) c01.d9.b().p().m(u3Var2, bool2)).booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.k.a().d(true);
            c01.d9.b().p().x(u3Var2, bool);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.k.a().d(false);
        }
        if (m0Var.f224463b.getCount() > 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onCreate", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j0(m0Var));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i0(m0Var));
        m0Var.f224466e = true;
        c01.d9.e().a(257, this);
        this.f224077n.mo48813x58998cd();
        this.f224073g = getIntent().getIntExtra("IPCallAddressUI_KFrom", 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(257L, 0L, 1L, true);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var = this.f224071e;
        if (m0Var != null) {
            android.widget.ListView listView = m0Var.f224462a;
            listView.setOnItemClickListener(null);
            listView.setOnItemLongClickListener(null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j3 j3Var = m0Var.f224463b;
            j3Var.getClass();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().q(j3Var);
        }
        c01.d9.e().q(257, this);
        this.f224077n.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallAddressUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallAddressUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 48 && iArr[0] != 0 && this.f224074h) {
            this.f224074h = false;
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhf), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.p0(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.q0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var = this.f224071e;
        if (m0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j3 j3Var = m0Var.f224463b;
            if (j3Var != null && !m0Var.f224466e) {
                j3Var.notifyDataSetChanged();
                if (m0Var.f224463b.getCount() > 0) {
                    android.view.View view = m0Var.f224464c;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    android.view.View view2 = m0Var.f224464c;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallAddressController", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            m0Var.f224466e = false;
        }
        mo2548x55429c53();
        if (r83.b.f474844b == null) {
            r83.b.f474844b = new r83.b();
        }
        r83.b.f474844b.a(true);
        if (this.f224076m) {
            return;
        }
        this.f224076m = true;
        T6();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m0 m0Var;
        if ((m1Var instanceof p83.g) && i17 == 0 && i18 == 0 && (m0Var = this.f224071e) != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j0(m0Var));
        }
    }
}
