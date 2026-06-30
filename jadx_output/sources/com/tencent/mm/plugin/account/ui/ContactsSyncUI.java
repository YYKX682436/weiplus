package com.tencent.mm.plugin.account.ui;

@java.lang.Deprecated
/* loaded from: classes8.dex */
public final class ContactsSyncUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.accounts.AccountAuthenticatorResponse f73270d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Bundle f73271e = null;

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        android.accounts.AccountAuthenticatorResponse accountAuthenticatorResponse = this.f73270d;
        if (accountAuthenticatorResponse != null) {
            android.os.Bundle bundle = this.f73271e;
            if (bundle != null) {
                accountAuthenticatorResponse.onResult(bundle);
            } else {
                accountAuthenticatorResponse.onError(4, "canceled");
            }
            this.f73270d = null;
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (!gm0.j1.b().n() || gm0.m.r()) {
            com.tencent.mm.ui.MMWizardActivity.Y6(this, new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.SimpleLoginUI.class), getIntent());
            finish();
            return;
        }
        if (getIntent() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactsSyncUI", "initView fail, intent is null");
            finish();
            return;
        }
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(getIntent(), "contact_sync_scene", -1);
        if (getIntent().getAction() == null || !getIntent().getAction().equalsIgnoreCase("com.tencent.mm.login.ACTION_LOGIN")) {
            java.lang.String resolveType = getIntent().resolveType(this);
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactsSyncUI", "scheme = " + resolveType + ", action = " + getIntent().getAction());
            if (!com.tencent.mm.sdk.platformtools.t8.K0(resolveType)) {
                g17 = resolveType.equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.profile") ? 2 : resolveType.equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip") ? 12 : resolveType.equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.voip.video") ? 13 : resolveType.equals("vnd.android.cursor.item/vnd.com.tencent.mm.plugin.sns.timeline") ? 3 : resolveType.equals("vnd.android.cursor.item/vnd.com.tencent.mm.chatting.phonenum") ? 6 : -1;
            }
        } else {
            g17 = 4;
        }
        if (g17 == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactsSyncUI", "unkown scene, finish");
            finish();
            return;
        }
        v61.h hVar = null;
        if (g17 != 1) {
            if (g17 != 2) {
                if (g17 == 3) {
                    hVar = new v61.i(2, com.tencent.mm.sdk.platformtools.c2.l(getIntent(), "k_phone_num"), getIntent().getData());
                } else if (g17 == 4) {
                    android.os.Parcelable parcelableExtra = getIntent().getParcelableExtra("accountAuthenticatorResponse");
                    this.f73270d = null;
                    if (parcelableExtra != null && (parcelableExtra instanceof android.accounts.AccountAuthenticatorResponse)) {
                        this.f73270d = (android.accounts.AccountAuthenticatorResponse) parcelableExtra;
                    }
                    android.accounts.AccountAuthenticatorResponse accountAuthenticatorResponse = this.f73270d;
                    if (accountAuthenticatorResponse != null) {
                        accountAuthenticatorResponse.onRequestContinued();
                    }
                    if (!getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("upload_contacts_already_displayed", false)) {
                        hVar = new com.tencent.mm.plugin.account.ui.d1(this, !com.tencent.mm.sdk.platformtools.c2.c(getIntent(), "k_login_without_bind_mobile", false));
                    }
                } else if (g17 != 6) {
                    if (g17 == 12) {
                        hVar = new v61.i(3, com.tencent.mm.sdk.platformtools.c2.l(getIntent(), "k_phone_num"), getIntent().getData());
                    } else if (g17 == 13) {
                        hVar = new v61.i(4, com.tencent.mm.sdk.platformtools.c2.l(getIntent(), "k_phone_num"), getIntent().getData());
                    }
                }
            }
            hVar = new v61.i(1, com.tencent.mm.sdk.platformtools.c2.l(getIntent(), "k_phone_num"), getIntent().getData());
        } else {
            android.os.Parcelable parcelableExtra2 = getIntent().getParcelableExtra("accountAuthenticatorResponse");
            this.f73270d = null;
            if (parcelableExtra2 != null && (parcelableExtra2 instanceof android.accounts.AccountAuthenticatorResponse)) {
                this.f73270d = (android.accounts.AccountAuthenticatorResponse) parcelableExtra2;
            }
            android.accounts.AccountAuthenticatorResponse accountAuthenticatorResponse2 = this.f73270d;
            if (accountAuthenticatorResponse2 != null) {
                accountAuthenticatorResponse2.onRequestContinued();
            }
            hVar = new com.tencent.mm.plugin.account.ui.d1(this, !com.tencent.mm.sdk.platformtools.c2.c(getIntent(), "k_login_without_bind_mobile", false));
        }
        if (hVar != null) {
            int a17 = hVar.a(this);
            if (a17 == 2) {
                android.content.Intent intent = getIntent();
                intent.setClass(this, com.tencent.mm.plugin.account.ui.ContactsSyncUI.class);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClass(this, com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.class);
                intent2.putExtra("key_upload_scene", 2);
                intent2.putExtra("bind_scene", 2);
                com.tencent.mm.ui.MMWizardActivity.Y6(this, intent2, intent);
                finish();
            } else if (a17 == 3) {
                android.content.Intent intent3 = getIntent();
                intent3.setClass(this, com.tencent.mm.plugin.account.ui.ContactsSyncUI.class);
                android.content.Intent intent4 = new android.content.Intent();
                intent4.setClass(this, com.tencent.mm.plugin.account.ui.SimpleLoginUI.class);
                com.tencent.mm.ui.MMWizardActivity.Y6(this, intent4, intent3);
                finish();
            } else if (a17 == 4) {
                android.content.Intent intent5 = getIntent();
                intent5.setClass(this, com.tencent.mm.plugin.account.ui.ContactsSyncUI.class);
                android.content.Intent intent6 = new android.content.Intent();
                intent6.setClass(this, com.tencent.mm.plugin.account.ui.SimpleLoginUI.class);
                intent6.putExtra("accountAuthenticatorResponse", this.f73270d);
                com.tencent.mm.ui.MMWizardActivity.Y6(this, intent6, intent5);
                finish();
            } else if (a17 == 5) {
                return;
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactsSyncUI", "unkown scene, finish");
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(getIntent(), "wizard_activity_result_code", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactsSyncUI", "onCreate() resultCode[%d]", java.lang.Integer.valueOf(g17));
        if (g17 != -1 && g17 != 0) {
            if (g17 == 1) {
                finish();
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactsSyncUI", "onCreate, should not reach here, resultCode = " + g17);
            finish();
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.READ_CONTACTS", 48, null, null);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactsSyncUI", "summerper checkPermission checkContacts read[%b],stack[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        if (a17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactsSyncUI", "summerper checkPermission checkContacts write[%b],stack[%s]", java.lang.Boolean.TRUE, new com.tencent.mm.sdk.platformtools.z3());
            initView();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactsSyncUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactsSyncUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 48) {
            return;
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhf), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.account.ui.y0(this), new com.tencent.mm.plugin.account.ui.z0(this));
        } else {
            new com.tencent.mm.sdk.platformtools.n3().post(new com.tencent.mm.plugin.account.ui.x0(this, strArr[0]));
        }
    }
}
