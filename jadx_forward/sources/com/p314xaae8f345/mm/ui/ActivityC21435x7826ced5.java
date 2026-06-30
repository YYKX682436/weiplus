package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.ServiceNotifySettingsUI */
/* loaded from: classes9.dex */
public class ActivityC21435x7826ced5 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f278589o = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 f278590d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f278591e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.xh f278592f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f278593g;

    /* renamed from: h, reason: collision with root package name */
    public android.database.DataSetObserver f278594h;

    /* renamed from: i, reason: collision with root package name */
    public int f278595i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f278596m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f278597n;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cki;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        this.f278595i = intent.getIntExtra("mode", 0);
        this.f278596m = intent.getStringExtra("scene_id");
        this.f278597n = intent.getStringExtra("from_scene");
        intent.putExtra("scene_id", this.f278596m);
        java.lang.String stringExtra = intent.getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.hdg);
        } else {
            mo54450xbf7c1df6(stringExtra);
        }
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.ui.mh(this));
        this.f278590d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById(com.p314xaae8f345.mm.R.id.btf);
        this.f278591e = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.i3y);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.i3_)).setText(this.f278595i == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.hch : com.p314xaae8f345.mm.R.C30867xcad56011.hce);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.ob6)).setText(this.f278595i == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.hcj : com.p314xaae8f345.mm.R.C30867xcad56011.hcl);
        if (this.f278595i == 0) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.p5b);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/ServiceNotifySettingsUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/ServiceNotifySettingsUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) findViewById.findViewById(com.p314xaae8f345.mm.R.id.p5a);
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(c01.d9.b().p().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SUBSCRIBEMSG_VOICE_BROADCAST_BOOLEAN, true));
            viewOnClickListenerC22631x1cc07cc8.m81396xb3e0a10a(new com.p314xaae8f345.mm.ui.nh(this));
        }
        com.p314xaae8f345.mm.ui.xh xhVar = new com.p314xaae8f345.mm.ui.xh(this, getLayoutInflater(), this.f278595i, this.f278596m);
        this.f278592f = xhVar;
        this.f278591e.setAdapter((android.widget.ListAdapter) xhVar);
        com.p314xaae8f345.mm.ui.oh ohVar = new com.p314xaae8f345.mm.ui.oh(this);
        this.f278594h = ohVar;
        this.f278592f.registerDataSetObserver(ohVar);
        if (this.f278595i == 1) {
            c01.d9.e().a(1145, this);
            com.p314xaae8f345.mm.p944x882e457a.r1 e17 = c01.d9.e();
            ((k01.a) ((k01.n0) i95.n0.c(k01.n0.class))).getClass();
            e17.g(new k01.a1(12));
            this.f278593g = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.ui.ph(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = this.f278590d;
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC;
        if (this.f278595i == 1) {
            u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC;
        }
        viewOnClickListenerC22631x1cc07cc82.m81392x52cfa5c6(c01.d9.b().p().o(u3Var, true));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        c01.d9.e().q(1145, this);
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC;
        boolean o17 = c01.d9.b().p().o(this.f278595i == 1 ? com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC : u3Var, true);
        boolean z17 = this.f278590d.f292896x != o17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (z17) {
            r45.vi6 vi6Var = new r45.vi6();
            vi6Var.f469828e = this.f278590d.f292896x ? 1 : 0;
            vi6Var.f469827d = this.f278595i == 1 ? 2 : 0;
            linkedList.add(vi6Var);
            boolean z18 = !o17;
            if (this.f278595i == 1) {
                u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC;
                bn0.g.f104312a.i("USERINFO_WXA_CUSTOM_SESSION_MESSAGE_NOTICE_BOOLEAN_SYNC", z18);
            } else {
                bn0.g.f104312a.i("USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC", z18);
            }
            c01.d9.b().p().x(u3Var, java.lang.Boolean.valueOf(z18));
            ((zr.c) com.p314xaae8f345.mm.sdk.p2600x5c6729a.q.f273936a.a(zr.c.class)).O6(new java.lang.Object());
            if (this.f278595i == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13798, java.lang.Integer.valueOf(vi6Var.f469828e == 1 ? 3 : 2), "", 0, this.f278596m, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13796, java.lang.Integer.valueOf(vi6Var.f469828e == 1 ? 11 : 10), "", "", 0, java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()));
            }
            if ("scene_service_notify_conversation".equals(this.f278597n)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[10];
                objArr[0] = 3;
                objArr[1] = null;
                objArr[2] = java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1());
                objArr[3] = null;
                objArr[4] = null;
                objArr[5] = 0;
                objArr[6] = 0;
                objArr[7] = java.lang.Integer.valueOf(this.f278590d.f292896x ? 1 : 2);
                objArr[8] = 0;
                objArr[9] = te5.v1.f500291b;
                g0Var.d(21825, objArr);
            }
        }
        int i17 = this.f278595i == 1 ? 2 : 1;
        java.util.LinkedList linkedList2 = this.f278592f.f294094i;
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            int i18 = this.f278595i != 1 ? 1 : 3;
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.ui.vh vhVar = (com.p314xaae8f345.mm.ui.vh) it.next();
                r45.vi6 vi6Var2 = new r45.vi6();
                vi6Var2.f469829f = vhVar.f292690a;
                vi6Var2.f469827d = i18;
                vi6Var2.f469828e = 1;
                linkedList.add(vi6Var2);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6210x3f282433 c6210x3f282433 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6210x3f282433();
                java.lang.String str = vhVar.f292690a;
                am.g00 g00Var = c6210x3f282433.f136460g;
                g00Var.f88257a = str;
                g00Var.f88258b = 2;
                g00Var.f88259c = i17;
                c6210x3f282433.e();
            }
        }
        if (!linkedList.isEmpty()) {
            c01.d9.e().a(1176, new com.p314xaae8f345.mm.ui.qh(this, z17, o17, linkedList, i17));
            com.p314xaae8f345.mm.p944x882e457a.r1 e17 = c01.d9.e();
            ((k01.a) ((k01.n0) i95.n0.c(k01.n0.class))).getClass();
            e17.g(new k01.z0(linkedList));
        }
        this.f278592f.unregisterDataSetObserver(this.f278594h);
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f278593g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ServiceNotifySettingsUI", "onSceneEnd(GetServiceNotifyOptions), errType : %s, errCode : %s, errMsg : %s.", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            db5.t7.m123882x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.hcs, 0).show();
            return;
        }
        r45.un3 un3Var = (r45.un3) ((k01.a1) ((k01.o0) m1Var)).f384534d.f152244b.f152233a;
        if (this.f278595i == 1) {
            this.f278590d.m81392x52cfa5c6(un3Var.f469025f);
        } else {
            this.f278590d.m81392x52cfa5c6(un3Var.f469023d);
        }
        runOnUiThread(new com.p314xaae8f345.mm.ui.rh(this, un3Var));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.addAll(super.mo43419xa59964ef());
        hashSet.add(com.p314xaae8f345.mm.ui.lh.class);
    }
}
