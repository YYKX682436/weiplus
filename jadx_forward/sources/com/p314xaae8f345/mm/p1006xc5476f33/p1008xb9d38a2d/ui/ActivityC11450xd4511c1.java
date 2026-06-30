package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* renamed from: com.tencent.mm.plugin.account.ui.MMFBLoginUI */
/* loaded from: classes14.dex */
public class ActivityC11450xd4511c1 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f154992p = {"public_profile", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c, "user_location"};

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l f154993d;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f154995f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f154996g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p957x53236a1b.v0 f154997h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f154998i;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.j f155000n;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f154994e = "";

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52 f154999m = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6968xc4cd5a52();

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f155001o = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370>(this, com.p314xaae8f345.mm.app.a0.f134821d) { // from class: com.tencent.mm.plugin.account.ui.MMFBLoginUI.1
        {
            this.f39173x3fe91575 = -1399051904;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370 c5690x46542370) {
            am.gj gjVar;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5690x46542370 c5690x465423702 = c5690x46542370;
            if (c5690x465423702 == null || (gjVar = c5690x465423702.f136016g) == null) {
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FacebookLoginUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", gjVar.f88301a, gjVar.f88302b);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_disaster_content", gjVar.f88301a);
            intent.putExtra("key_disaster_url", gjVar.f88302b);
            intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11402x33c6c555.class).addFlags(268435456);
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/MMFBLoginUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/account/ui/MMFBLoginUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1 activityC11450xd4511c1, boolean z17) {
        activityC11450xd4511c1.getClass();
        int i17 = z17 ? 19 : 20;
        gm0.j1.u().f354681a.f(i17, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) gm0.j1.u().f354681a.a(i17), 0) + 1));
    }

    public final void W6() {
        try {
            com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = this.f154993d;
            if (lVar != null) {
                com.p314xaae8f345.p3210x3857dc.d.g().e();
                lVar.g(null);
                lVar.f290747b = 0L;
                lVar.h(this);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FacebookLoginUI", e17, "", new java.lang.Object[0]);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L14,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L14"));
        sb6.append(",1");
        n71.a.b(10645, sb6.toString());
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar2 = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l();
        this.f154993d = lVar2;
        lVar2.a(this, f154992p, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.p9(this, null));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(582L, 5L, 1L, false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576405ae;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f154993d = new com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l();
        this.f154996g = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.n9(this);
        W6();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.o9(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Boolean.valueOf(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FacebookLoginUI", "onActivityResult, requestCode:%d, resultCode:%d, data==null:%b", objArr);
        if (i18 == -1 && i17 == 1024 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("VoiceLoginAuthPwd");
            int intExtra = intent.getIntExtra("KVoiceHelpCode", 0);
            java.lang.Object[] objArr2 = new java.lang.Object[3];
            objArr2[0] = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra));
            objArr2[1] = java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) ? 0 : stringExtra.length());
            objArr2[2] = java.lang.Integer.valueOf(intExtra);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FacebookLoginUI", "onActivityResult, do voiceprint auth, authPwd is null:%b, authPwd.len:%d, lastErrCode:%d", objArr2);
            if (intExtra == -217) {
                W6();
                return;
            }
        }
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = this.f154993d;
        if (lVar != null) {
            lVar.b(i17, i18, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ghi);
        ((com.p314xaae8f345.mm.app.o7) ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi()).getClass();
        com.p314xaae8f345.mm.ui.vb.e();
        this.f154998i = n71.a.a();
        mo43517x10010bd5();
        gm0.j1.d().a(701, this);
        gm0.j1.d().a(252, this);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(701, this);
        gm0.j1.d().q(252, this);
        com.p314xaae8f345.mm.ui.p2722x33325c.sdk.l lVar = this.f154993d;
        if (lVar != null) {
            lVar.c(this);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        n71.a.e(this.f154998i);
        finish();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f155001o.mo48814x2efc64();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L100_200_FB,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L100_200_FB"));
        sb6.append(",2");
        n71.a.c(10645, false, sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FacebookLoginUI", "onPreferenceTreeClick, key is null");
            return true;
        }
        if (!str.equals("facebook_auth_bind_btn")) {
            return false;
        }
        W6();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        this.f155001o.mo48813x58998cd();
        super.onResume();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.b();
        sb6.append(gm0.m.e());
        sb6.append(",");
        sb6.append(getClass().getName());
        sb6.append(",L100_200_FB,");
        gm0.j1.b();
        sb6.append(gm0.m.f("L100_200_FB"));
        sb6.append(",1");
        n71.a.c(10645, true, sb6.toString());
        n71.a.d("L100_200_FB");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        if (r20 != (-3)) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015b  */
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r19, int r20, java.lang.String r21, com.p314xaae8f345.mm.p944x882e457a.m1 r22) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11450xd4511c1.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
