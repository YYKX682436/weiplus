package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes8.dex */
public class AppBrandVoIPDeviceListAuthorizeUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f89485d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f89486e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f89487f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f89488g = 0;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f89489h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f89490i = new java.util.ArrayList();

    public final java.lang.String V6(r45.ie0 ie0Var) {
        java.lang.String str = ie0Var.f376962e;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = ie0Var.f376961d;
        return str + (str2 != null ? str2 : "");
    }

    public final void W6(r45.ie0 ie0Var, r45.g27 g27Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.je7();
        lVar.f70665b = new r45.ke7();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp_modvoipdeviceauth";
        lVar.f70667d = 2522;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        r45.je7 je7Var = new r45.je7();
        je7Var.f377769d = this.f89486e;
        if (ie0Var != null) {
            java.lang.String str = ie0Var.f376961d;
            je7Var.f377770e = str;
            java.lang.String str2 = ie0Var.f376962e;
            je7Var.f377771f = str2;
            int i17 = ie0Var.f376964g;
            je7Var.f377772g = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "modifyAuthVoipDevice model_id:%s, name:%s, sn:%s, status:%d", str, ie0Var.f376963f, str2, java.lang.Integer.valueOf(i17));
        }
        if (g27Var != null) {
            java.lang.String str3 = g27Var.f374843d;
            je7Var.f377773h = str3;
            int i18 = g27Var.f374846g;
            je7Var.f377774i = i18;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "modifyAuthVoipDevice template_id:%s, name:%s, status:%d", str3, g27Var.f374844e, java.lang.Integer.valueOf(i18));
        }
        lVar.f70664a = je7Var;
        com.tencent.mm.modelbase.z2.e(lVar.a(), new com.tencent.mm.plugin.appbrand.ui.wb(this), true, this);
    }

    public final void X6(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "reportOperate opType:%d, templateId:%s, sessionId:%s, enterSource:%d", java.lang.Integer.valueOf(i17), str, this.f89487f, java.lang.Integer.valueOf(this.f89488g));
        com.tencent.mm.autogen.mmdata.rpt.WASettingVoipAuthorizeManagerReportStruct wASettingVoipAuthorizeManagerReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WASettingVoipAuthorizeManagerReportStruct();
        wASettingVoipAuthorizeManagerReportStruct.f62061f = this.f89488g;
        wASettingVoipAuthorizeManagerReportStruct.f62060e = wASettingVoipAuthorizeManagerReportStruct.b(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, this.f89487f, true);
        wASettingVoipAuthorizeManagerReportStruct.f62059d = wASettingVoipAuthorizeManagerReportStruct.b("pageId", "" + hashCode(), true);
        wASettingVoipAuthorizeManagerReportStruct.f62062g = (long) i17;
        wASettingVoipAuthorizeManagerReportStruct.f62063h = wASettingVoipAuthorizeManagerReportStruct.b("templateId", str, true);
        wASettingVoipAuthorizeManagerReportStruct.k();
    }

    public final void Y6() {
        com.tencent.mm.ui.base.preference.r preferenceScreen = getPreferenceScreen();
        this.f89485d = preferenceScreen;
        ((com.tencent.mm.ui.base.preference.h0) preferenceScreen).t();
        com.tencent.mm.ui.base.preference.Preference preference = new com.tencent.mm.ui.base.preference.Preference(this);
        preference.f197785v = false;
        preference.C("key_voip_auth_tips");
        preference.G = com.tencent.mm.R.layout.f488010ec;
        preference.L(getString(com.tencent.mm.R.string.n89));
        ((com.tencent.mm.ui.base.preference.h0) this.f89485d).d(preference, -1);
        java.util.Iterator it = this.f89489h.iterator();
        while (true) {
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            r45.ie0 ie0Var = (r45.ie0) it.next();
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = new com.tencent.mm.ui.base.preference.CheckBoxPreference(this);
            checkBoxPreference.f197785v = false;
            checkBoxPreference.C(V6(ie0Var));
            checkBoxPreference.L(ie0Var.f376963f);
            if (ie0Var.f376964g != 1) {
                z17 = false;
            }
            checkBoxPreference.L = z17;
            ((com.tencent.mm.ui.base.preference.h0) this.f89485d).d(checkBoxPreference, -1);
        }
        java.util.Iterator it6 = this.f89490i.iterator();
        while (it6.hasNext()) {
            r45.g27 g27Var = (r45.g27) it6.next();
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = new com.tencent.mm.ui.base.preference.CheckBoxPreference(this);
            checkBoxPreference2.f197785v = false;
            checkBoxPreference2.C(g27Var.f374843d);
            checkBoxPreference2.L(g27Var.f374844e);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(g27Var.f374845f)) {
                checkBoxPreference2.H(g27Var.f374845f);
            }
            checkBoxPreference2.L = g27Var.f374846g == 1;
            ((com.tencent.mm.ui.base.preference.h0) this.f89485d).d(checkBoxPreference2, -1);
        }
        if (!this.f89490i.isEmpty()) {
            com.tencent.mm.ui.base.preference.Preference preference2 = new com.tencent.mm.ui.base.preference.Preference(this);
            preference2.f197785v = false;
            preference2.C("key_check_voip_record");
            preference2.G = com.tencent.mm.R.layout.dyq;
            preference2.L(getString(com.tencent.mm.R.string.n88));
            ((com.tencent.mm.ui.base.preference.h0) this.f89485d).d(preference2, -1);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f89485d).notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494831d;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        this.f89486e = getIntent().getStringExtra("key_appid");
        getIntent().getStringExtra("key_username");
        this.f89487f = getIntent().getStringExtra("key_session_id");
        this.f89488g = getIntent().getIntExtra("key_enter_source", 0);
        java.lang.String str = this.f89486e;
        ak1.e eVar = ak1.e.f5572a;
        if (str.equals(ak1.e.f5575d)) {
            this.f89489h = ak1.e.f5573b;
            this.f89490i = ak1.e.f5574c;
        } else {
            java.lang.String str2 = this.f89486e;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "getAuthVoipDeviceList appId:%s", str2);
            eVar.a(str2, this, new com.tencent.mm.plugin.appbrand.ui.xb(this));
        }
        setBackBtn(new com.tencent.mm.plugin.appbrand.ui.vb(this));
        if (getIntent() == null || com.tencent.mm.sdk.platformtools.t8.K0(getIntent().getStringExtra("key_title"))) {
            setMMTitle(com.tencent.mm.R.string.a5k);
        } else {
            setMMTitle(getIntent().getStringExtra("key_title"));
        }
        Y6();
        X6(0, "");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        r45.ie0 ie0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandVoIPDeviceListAuthorizeUI", "click key :%s", preference.f197780q);
        java.util.Iterator it = this.f89489h.iterator();
        do {
            if (!it.hasNext()) {
                java.util.Iterator it6 = this.f89490i.iterator();
                while (it6.hasNext()) {
                    r45.g27 g27Var = (r45.g27) it6.next();
                    if (g27Var.f374843d.equals(preference.f197780q)) {
                        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference;
                        g27Var.f374846g = checkBoxPreference.N() ? 1 : 0;
                        W6(null, g27Var);
                        X6(checkBoxPreference.N() ? 1 : 2, g27Var.f374843d);
                        return true;
                    }
                }
                if (!"key_check_voip_record".equals(preference.f197780q)) {
                    return false;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", "notifymessage");
                intent.putExtra("key_biz_half_screen_chat_style", true);
                intent.putExtra("key_template_history_msg", true);
                intent.putExtra("finish_direct", true);
                intent.putExtra("key_template_msg_id", "");
                intent.putExtra("key_template_msg_username", "notifymessage");
                intent.putExtra("key_is_service_voip_template_msg", true);
                j45.l.u(this, "com.tencent.mm.ui.chatting.BizHalfScreenChattingUI", intent, null);
                X6(3, "");
                return false;
            }
            ie0Var = (r45.ie0) it.next();
        } while (!V6(ie0Var).equals(preference.f197780q));
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference;
        ie0Var.f376964g = checkBoxPreference2.N() ? 1 : 0;
        W6(ie0Var, null);
        X6(checkBoxPreference2.N() ? 1 : 2, ie0Var.f376961d);
        return true;
    }
}
