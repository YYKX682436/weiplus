package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.plugin.account.ui.ContactsSyncUI */
/* loaded from: classes8.dex */
public final class ActivityC11399x9e1038c2 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.accounts.AccountAuthenticatorResponse f154803d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Bundle f154804e = null;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        android.accounts.AccountAuthenticatorResponse accountAuthenticatorResponse = this.f154803d;
        if (accountAuthenticatorResponse != null) {
            android.os.Bundle bundle = this.f154804e;
            if (bundle != null) {
                accountAuthenticatorResponse.onResult(bundle);
            } else {
                accountAuthenticatorResponse.onError(4, "canceled");
            }
            this.f154803d = null;
        }
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        if (!gm0.j1.b().n() || gm0.m.r()) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(this, new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b.class), getIntent());
            finish();
            return;
        }
        if (getIntent() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactsSyncUI", "initView fail, intent is null");
            finish();
            return;
        }
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(getIntent(), "contact_sync_scene", -1);
        if (getIntent().getAction() == null || !getIntent().getAction().equalsIgnoreCase("com.tencent.mm.login.ACTION_LOGIN")) {
            java.lang.String resolveType = getIntent().resolveType(this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsSyncUI", "scheme = " + resolveType + ", action = " + getIntent().getAction());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(resolveType)) {
                g17 = resolveType.equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.profile") ? 2 : resolveType.equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip") ? 12 : resolveType.equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip.video") ? 13 : resolveType.equals("vnd.android.cursor.item/vnd.com.tencent.mm.plugin.sns.timeline") ? 3 : resolveType.equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.phonenum") ? 6 : -1;
            }
        } else {
            g17 = 4;
        }
        if (g17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactsSyncUI", "unkown scene, finish");
            finish();
            return;
        }
        v61.h hVar = null;
        if (g17 != 1) {
            if (g17 != 2) {
                if (g17 == 3) {
                    hVar = new v61.i(2, com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), "k_phone_num"), getIntent().getData());
                } else if (g17 == 4) {
                    android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("accountAuthenticatorResponse");
                    this.f154803d = null;
                    if (parcelableExtra != null && (parcelableExtra instanceof android.accounts.AccountAuthenticatorResponse)) {
                        this.f154803d = (android.accounts.AccountAuthenticatorResponse) parcelableExtra;
                    }
                    android.accounts.AccountAuthenticatorResponse accountAuthenticatorResponse = this.f154803d;
                    if (accountAuthenticatorResponse != null) {
                        accountAuthenticatorResponse.onRequestContinued();
                    }
                    if (!getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("upload_contacts_already_displayed", false)) {
                        hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d1(this, !com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(getIntent(), "k_login_without_bind_mobile", false));
                    }
                } else if (g17 != 6) {
                    if (g17 == 12) {
                        hVar = new v61.i(3, com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), "k_phone_num"), getIntent().getData());
                    } else if (g17 == 13) {
                        hVar = new v61.i(4, com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), "k_phone_num"), getIntent().getData());
                    }
                }
            }
            hVar = new v61.i(1, com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.l(getIntent(), "k_phone_num"), getIntent().getData());
        } else {
            android.os.Parcelable parcelableExtra2 = getIntent().getParcelableExtra("accountAuthenticatorResponse");
            this.f154803d = null;
            if (parcelableExtra2 != null && (parcelableExtra2 instanceof android.accounts.AccountAuthenticatorResponse)) {
                this.f154803d = (android.accounts.AccountAuthenticatorResponse) parcelableExtra2;
            }
            android.accounts.AccountAuthenticatorResponse accountAuthenticatorResponse2 = this.f154803d;
            if (accountAuthenticatorResponse2 != null) {
                accountAuthenticatorResponse2.onRequestContinued();
            }
            hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.d1(this, !com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(getIntent(), "k_login_without_bind_mobile", false));
        }
        if (hVar != null) {
            int a17 = hVar.a(this);
            if (a17 == 2) {
                android.content.Intent intent = getIntent();
                intent.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11399x9e1038c2.class);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970.class);
                intent2.putExtra("key_upload_scene", 2);
                intent2.putExtra("bind_scene", 2);
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(this, intent2, intent);
                finish();
            } else if (a17 == 3) {
                android.content.Intent intent3 = getIntent();
                intent3.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11399x9e1038c2.class);
                android.content.Intent intent4 = new android.content.Intent();
                intent4.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b.class);
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(this, intent4, intent3);
                finish();
            } else if (a17 == 4) {
                android.content.Intent intent5 = getIntent();
                intent5.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11399x9e1038c2.class);
                android.content.Intent intent6 = new android.content.Intent();
                intent6.setClass(this, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11470xc22f6d8b.class);
                intent6.putExtra("accountAuthenticatorResponse", this.f154803d);
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.Y6(this, intent6, intent5);
                finish();
            } else if (a17 == 5) {
                return;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactsSyncUI", "unkown scene, finish");
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.g(getIntent(), "wizard_activity_result_code", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsSyncUI", "onCreate() resultCode[%d]", java.lang.Integer.valueOf(g17));
        if (g17 != -1 && g17 != 0) {
            if (g17 == 1) {
                finish();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactsSyncUI", "onCreate, should not reach here, resultCode = " + g17);
            finish();
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.READ_CONTACTS", 48, null, null);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsSyncUI", "summerper checkPermission checkContacts read[%b],stack[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        if (a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsSyncUI", "summerper checkPermission checkContacts write[%b],stack[%s]", java.lang.Boolean.TRUE, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
            mo43517x10010bd5();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsSyncUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsSyncUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 48) {
            return;
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhf), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.y0(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.z0(this));
        } else {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.x0(this, strArr[0]));
        }
    }
}
