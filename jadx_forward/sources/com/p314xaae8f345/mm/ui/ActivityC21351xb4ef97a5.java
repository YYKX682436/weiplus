package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.CheckCanSubscribeBizUI */
/* loaded from: classes9.dex */
public class ActivityC21351xb4ef97a5 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements l75.z0, com.p314xaae8f345.mm.p944x882e457a.u0, l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f278145d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f278146e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f278147f;

    /* renamed from: g, reason: collision with root package name */
    public int f278148g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f278149h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f278150i;

    /* renamed from: m, reason: collision with root package name */
    public int f278151m;

    /* renamed from: n, reason: collision with root package name */
    public int f278152n;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f278155q;

    /* renamed from: u, reason: collision with root package name */
    public int f278159u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f278160v;

    /* renamed from: o, reason: collision with root package name */
    public boolean f278153o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f278154p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f278156r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f278157s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f278158t = false;

    /* renamed from: w, reason: collision with root package name */
    public int f278161w = 0;

    public static void T6(com.p314xaae8f345.mm.ui.ActivityC21351xb4ef97a5 activityC21351xb4ef97a5) {
        synchronized (activityC21351xb4ef97a5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanSubscribeBizUI", "dealSuccess..,canJump = " + activityC21351xb4ef97a5.f278153o);
            int i17 = activityC21351xb4ef97a5.f278159u;
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanSubscribeBizUI", "dealSuccess  MM_CHECK_CAN_SUBSCRIBE_BIZ_SCENE_WEBVIEW");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", activityC21351xb4ef97a5.f278160v);
                j45.l.j(activityC21351xb4ef97a5, "webview", ".ui.tools.WebViewUI", intent, null);
                activityC21351xb4ef97a5.finish();
                return;
            }
            if (i17 != 0 || activityC21351xb4ef97a5.f278161w != 1) {
                if (activityC21351xb4ef97a5.V6() && activityC21351xb4ef97a5.f278153o) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanSubscribeBizUI", "dealSuccess  jumpToChattingUI");
                    activityC21351xb4ef97a5.W6();
                } else if (activityC21351xb4ef97a5.f278153o) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanSubscribeBizUI", "dealSuccess  jumpToContactInfoUI");
                    activityC21351xb4ef97a5.X6();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanSubscribeBizUI", "dealSuccess  not canJump");
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanSubscribeBizUI", "dealSuccess  MM_CHECK_CAN_SUBSCRIBE_BIZ_SCENE_PROFILE  extInfo:" + activityC21351xb4ef97a5.f278147f);
            if (activityC21351xb4ef97a5.f278157s) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanSubscribeBizUI", "has jump ignore this scene");
                return;
            }
            activityC21351xb4ef97a5.f278157s = true;
            c01.d9.e().a(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, activityC21351xb4ef97a5);
            c01.d9.e().g(new com.p314xaae8f345.mm.p957x53236a1b.k0(activityC21351xb4ef97a5.f278147f, null, 4, 0, o45.cg.a(), new byte[0]));
        }
    }

    public final void U6(int i17, int i18, java.lang.String str) {
        dp.a.m125854x26a183b(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574969k62), 1).show();
        if (this.f278151m == 1) {
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.n7(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean V6() {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.ActivityC21351xb4ef97a5.V6():boolean");
    }

    public final void W6() {
        if (this.f278157s) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanSubscribeBizUI", "jump to ChattingUI");
        android.content.Intent putExtra = new android.content.Intent().putExtra("Chat_User", this.f278146e);
        putExtra.putExtra("finish_direct", true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f278146e)) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.g1.c(putExtra, this.f278146e);
        }
        putExtra.setClass(this, com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        if (this.f278156r) {
            return;
        }
        setResult(-1);
        this.f278157s = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/CheckCanSubscribeBizUI", "jumpToChattingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/CheckCanSubscribeBizUI", "jumpToChattingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    public final void X6() {
        if (this.f278157s) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanSubscribeBizUI", "jump to ContactInfoUI");
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f278146e, true);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_Scene", this.f278152n);
        intent.putExtra("Verify_ticket", this.f278155q);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        if (n17 != null) {
            intent.putExtra("Contact_Alias", n17.t0());
            intent.putExtra("Contact_Nick", n17.P0());
            intent.putExtra("Contact_Signature", n17.V);
            intent.putExtra("Contact_RegionCode", n17.f318103l1);
            intent.putExtra("Contact_Sex", n17.I);
            intent.putExtra("Contact_VUser_Info", n17.f318121y0);
            intent.putExtra("Contact_VUser_Info_Flag", n17.f1());
            intent.putExtra("Contact_KWeibo_flag", n17.i1());
            intent.putExtra("Contact_KWeibo", n17.f318118x0);
            intent.putExtra("Contact_KWeiboNick", n17.j1());
        }
        intent.putExtra("Contact_User", this.f278146e);
        if (this.f278156r) {
            return;
        }
        setResult(-1);
        this.f278157s = true;
        j45.l.j(this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        finish();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.lang.String)) {
            return;
        }
        mo735xb0dfc7d8((java.lang.String) obj, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bmq;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0185  */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.ActivityC21351xb4ef97a5.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.util.LinkedList linkedList = this.f278149h;
        if (linkedList != null) {
            linkedList.clear();
        }
        if (gm0.j1.a()) {
            c01.d9.e().q(605, this);
            r01.q3.cj().mo49775xc84af884(this);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4 && keyEvent.getRepeatCount() == 0) {
            this.f278156r = true;
            if (this.f278157s) {
                return true;
            }
        }
        return super.onKeyDown(i17, keyEvent);
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50293x3498a0(new com.p314xaae8f345.mm.ui.y1(this, str));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 605) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanSubscribeBizUI", "onSceneEnd, MMFunc_CheckCanSubscribeBiz  do nothing");
            return;
        }
        if (m1Var.mo808xfb85f7b0() != 233) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CheckCanSubscribeBizUI", "un support scene type : %d", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanSubscribeBizUI", "onSceneEnd, MMFunc_GetA8Key");
        c01.d9.e().q(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10095xfbb5a33d, this);
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CheckCanSubscribeBizUI", "onSceneEnd, geta8key  errType = %d, errCode = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            U6(i17, i18, str);
            return;
        }
        com.p314xaae8f345.mm.p957x53236a1b.k0 k0Var = (com.p314xaae8f345.mm.p957x53236a1b.k0) m1Var;
        int K = k0Var.K();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckCanSubscribeBizUI", "geta8key, action code = %d", java.lang.Integer.valueOf(K));
        if (K != 15) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CheckCanSubscribeBizUI", "onSceneEnd, geta8key  actionCode = " + K);
            U6(i17, i18, str);
            return;
        }
        java.lang.String Q = k0Var.Q();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec();
        am.df dfVar = c5587xf7a06bec.f135909g;
        dfVar.f87979a = K;
        dfVar.f87980b = Q;
        dfVar.f87981c = new java.lang.ref.WeakReference(this);
        c5587xf7a06bec.b(android.os.Looper.myLooper());
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
