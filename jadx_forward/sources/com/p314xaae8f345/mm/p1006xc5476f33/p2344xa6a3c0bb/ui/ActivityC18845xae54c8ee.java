package com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/voiceprint/ui/VoicePrintStateSettingUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI */
/* loaded from: classes8.dex */
public final class ActivityC18845xae54c8ee extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f257737f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f257738d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.f0(this));

    /* renamed from: e, reason: collision with root package name */
    public boolean f257739e;

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18845xae54c8ee activityC18845xae54c8ee, boolean z17) {
        activityC18845xae54c8ee.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePrintStateSettingUI", "showSwitchView() called with: enable = " + z17);
        activityC18845xae54c8ee.W6().f346966b.setVisibility(8);
        activityC18845xae54c8ee.W6().f346970f.setVisibility(8);
        activityC18845xae54c8ee.W6().f346971g.setVisibility(0);
        activityC18845xae54c8ee.W6().f346967c.m81392x52cfa5c6(z17);
        activityC18845xae54c8ee.W6().f346967c.m81396xb3e0a10a(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.q0(activityC18845xae54c8ee));
        activityC18845xae54c8ee.W6().f346969e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.r0(activityC18845xae54c8ee));
        activityC18845xae54c8ee.W6().f346968d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.s0(activityC18845xae54c8ee));
    }

    public final void U6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePrintStateSettingUI", "checkState() called with: opCode = " + i17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.k9p), true, false, com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.j0.f257792d);
        Q.show();
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.i0(i17, this, Q, null), 3, null);
    }

    public final void V6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePrintStateSettingUI", "createLock() called");
        java.lang.String str = fq4.e0.f347124a;
        if (str == null) {
            str = v61.d.a(1);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("voicelock_create", "view_clk", kz5.c1.k(new jz5.l("voicelock_sessionid", str), new jz5.l("page_id", "50395")), 34575);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.ActivityC18840xef9a7fc2.class);
        intent.putExtra("kscene_type", 71);
        intent.putExtra("trans_out_anim", com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        intent.putExtra("createVoicePrint", true);
        startActivityForResult(intent, 1);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
    }

    public final fq.f W6() {
        return (fq.f) ((jz5.n) this.f257738d).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d4j;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePrintStateSettingUI", "onActivityResult() called with: requestCode = " + i17 + ", resultCode = " + i18 + ", data = " + intent);
        if (i17 == 1 && i18 == -1) {
            if (intent != null ? intent.getBooleanExtra("KIsCreateSuccess", false) : false) {
                U6(1);
                return;
            } else {
                this.f257739e = true;
                return;
            }
        }
        if (i17 == 2 && i18 == -1) {
            if (intent != null ? intent.getBooleanExtra("KIsCreateSuccess", false) : false) {
                U6(0);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICEPRINT_MORE_TAB_DOT_SHOW_BOOLEAN;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        p17.x(u3Var, bool);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERFINO_VOICEPRINT_SETTING_DOT_SHOW_BOOLEAN, bool);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_DOT_SHOW_BOOLEAN, bool);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_NEW_SHOW_BOOLEAN, bool);
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.k0(this));
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        com.p314xaae8f345.mm.ui.bk.s0(W6().f346972h.getPaint());
        U6(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long n17 = j62.e.g().n();
        if (n17 == 0) {
            str = "0";
        } else if (n17 > 0) {
            str = java.lang.Long.toString(n17, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (n17 >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
            while (j17 > 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        sb6.append(str);
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        fq4.e0.f347124a = sb6.toString();
        java.lang.String str2 = fq4.e0.f347124a;
        if (str2 == null) {
            str2 = v61.d.a(1);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("page_in", kz5.c1.k(new jz5.l("voicelock_sessionid", str2), new jz5.l("page_id", "50395")), 34575);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        if (grantResults.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePrintStateSettingUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoicePrintStateSettingUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(grantResults[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 80) {
            if (grantResults[0] == 0) {
                V6();
            } else {
                db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.l0(this), com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.m0.f257797d);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.f257739e) {
            U6(0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(com.p314xaae8f345.mm.p1006xc5476f33.p2344xa6a3c0bb.ui.z.class);
    }
}
