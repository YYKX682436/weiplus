package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class ExdeviceDeviceProfileUI extends com.tencent.mm.ui.base.preference.MMPreference implements com.tencent.mm.modelbase.u0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f99254y = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f99255d = null;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f99256e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f99257f;

    /* renamed from: g, reason: collision with root package name */
    public long f99258g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f99259h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f99260i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f99261m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f99262n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f99263o;

    /* renamed from: p, reason: collision with root package name */
    public int f99264p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f99265q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f99266r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f99267s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f99268t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f99269u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f99270v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f99271w;

    /* renamed from: x, reason: collision with root package name */
    public db5.a1 f99272x;

    public final void V6(com.tencent.mm.plugin.exdevice.ui.DeviceProfileHeaderPreference deviceProfileHeaderPreference) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.t8.K0(this.f99266r) ? this.f99259h : this.f99266r;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f99265q)) {
            deviceProfileHeaderPreference.W = str;
            android.widget.TextView textView = deviceProfileHeaderPreference.M;
            if (textView != null) {
                textView.setText(str);
            }
            deviceProfileHeaderPreference.V = "";
            android.widget.TextView textView2 = deviceProfileHeaderPreference.P;
            if (textView2 != null) {
                textView2.setText("");
            }
            deviceProfileHeaderPreference.Q(3, false);
            deviceProfileHeaderPreference.Q(4, false);
            deviceProfileHeaderPreference.Q(1, this.f99267s);
        } else {
            java.lang.String str2 = this.f99265q;
            deviceProfileHeaderPreference.W = str2;
            android.widget.TextView textView3 = deviceProfileHeaderPreference.M;
            if (textView3 != null) {
                textView3.setText(str2);
            }
            java.lang.String string = getString(com.tencent.mm.R.string.c3a, str);
            deviceProfileHeaderPreference.V = string;
            android.widget.TextView textView4 = deviceProfileHeaderPreference.P;
            if (textView4 != null) {
                textView4.setText(string);
            }
            deviceProfileHeaderPreference.Q(3, true);
            deviceProfileHeaderPreference.Q(4, true);
            deviceProfileHeaderPreference.Q(1, false);
        }
        java.lang.String str3 = this.f99268t;
        deviceProfileHeaderPreference.U = str3;
        android.widget.TextView textView5 = deviceProfileHeaderPreference.R;
        if (textView5 != null) {
            textView5.setText(str3);
        }
    }

    public final void W6(v32.b bVar) {
        if (bVar != null) {
            this.f99261m = bVar.field_deviceID;
            this.f99262n = bVar.field_deviceType;
            java.lang.String str = bVar.f237106y;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            this.f99265q = str;
            java.lang.String str2 = bVar.B;
            if (str2 == null) {
                str2 = "";
            }
            this.f99266r = str2;
            java.lang.String str3 = bVar.field_brandName;
            if (str3 == null) {
                str3 = "";
            }
            this.f99259h = str3;
            java.lang.String str4 = bVar.C;
            if (str4 == null) {
                str4 = "";
            }
            this.f99268t = str4;
            java.lang.String str5 = bVar.f237107z;
            if (str5 == null) {
                str5 = "";
            }
            this.f99269u = str5;
            java.lang.String str6 = bVar.A;
            this.f99260i = str6 != null ? str6 : "";
        }
    }

    public final void X6() {
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) getPreferenceScreen();
        com.tencent.mm.plugin.exdevice.ui.DeviceProfileHeaderPreference deviceProfileHeaderPreference = (com.tencent.mm.plugin.exdevice.ui.DeviceProfileHeaderPreference) h0Var.h("device_profile_header");
        deviceProfileHeaderPreference.O(1, new com.tencent.mm.plugin.exdevice.ui.j2(this));
        deviceProfileHeaderPreference.O(4, new com.tencent.mm.plugin.exdevice.ui.k2(this));
        V6(deviceProfileHeaderPreference);
        deviceProfileHeaderPreference.N(this.f99269u);
        com.tencent.mm.ui.base.preference.KeyValuePreference keyValuePreference = (com.tencent.mm.ui.base.preference.KeyValuePreference) h0Var.h("message_manage");
        com.tencent.mm.ui.base.preference.KeyValuePreference keyValuePreference2 = (com.tencent.mm.ui.base.preference.KeyValuePreference) h0Var.h("connect_setting");
        com.tencent.mm.ui.base.preference.KeyValuePreference keyValuePreference3 = (com.tencent.mm.ui.base.preference.KeyValuePreference) h0Var.h("user_list");
        keyValuePreference.O(true);
        keyValuePreference2.O(true);
        keyValuePreference3.O(true);
        h0Var.m("message_manage", true);
        h0Var.m("connect_setting", true);
        h0Var.m("user_list", true);
        if (this.f99270v) {
            h0Var.m("sub_device_desc", false);
            h0Var.h("sub_device_desc").L(getResources().getString(com.tencent.mm.R.string.c5e, this.f99271w));
            h0Var.m("bind_device", true);
            h0Var.m("unbind_device", true);
        } else {
            h0Var.m("sub_device_desc", true);
            h0Var.m("bind_device", this.f99267s);
            h0Var.m("unbind_device", !this.f99267s);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f99260i)) {
            h0Var.m("open_device_panel", true);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494869ab;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x018d, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r8.f99263o) != false) goto L73;
     */
    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.exdevice.ui.ExdeviceDeviceProfileUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        gm0.j1.n().f273288b.q(537, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str;
        if (!"bind_device".equals(preference.f197780q)) {
            if ("unbind_device".equals(preference.f197780q)) {
                r45.nv3 nv3Var = new r45.nv3();
                nv3Var.f381692e = this.f99261m;
                nv3Var.f381691d = this.f99262n;
                v32.b L0 = com.tencent.mm.plugin.exdevice.model.l3.Ui().L0(this.f99261m, this.f99262n);
                if (L0 != null && (str = L0.K) != null && str.length() > 0) {
                    for (java.lang.String str2 : str.split(",")) {
                        com.tencent.mm.plugin.exdevice.model.l3.Ui().y0(str2, this.f99262n);
                    }
                }
                com.tencent.mm.plugin.exdevice.model.r2 r2Var = new com.tencent.mm.plugin.exdevice.model.r2(nv3Var, 2);
                runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.e2(this, r2Var));
                gm0.j1.n().f273288b.a(537, this);
                gm0.j1.n().f273288b.g(r2Var);
            } else if ("open_device_panel".equals(preference.f197780q)) {
                com.tencent.mm.plugin.exdevice.model.q0.c(getContext(), this.f99260i);
            } else if ("contact_info_biz_go_chatting".equals(preference.f197780q)) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f99259h, true);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, this.f99261m);
                intent.putExtra("device_type", this.f99262n);
                intent.putExtra("KIsHardDevice", true);
                intent.putExtra("KHardDeviceBindTicket", this.f99263o);
                if (n17 != null) {
                    if (n17.r2() && n17.k2()) {
                        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Ai(n17.d1());
                        intent.putExtra("Chat_User", this.f99259h);
                        intent.putExtra("finish_direct", true);
                        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, getContext());
                    } else {
                        intent.putExtra("Contact_User", this.f99259h);
                        intent.putExtra("force_get_contact", true);
                        j45.l.j(getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
                    }
                }
            } else if (!"message_manage".equals(preference.f197780q) && !"connect_setting".equals(preference.f197780q) && !"user_list".equals(preference.f197780q)) {
                return false;
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f99263o)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceDeviceProfileUI", "Do unauth bind device.");
            com.tencent.mm.plugin.exdevice.model.f2 f2Var = new com.tencent.mm.plugin.exdevice.model.f2(a42.i.h(this.f99257f), this.f99259h, "3", this.f99258g);
            runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.e2(this, f2Var));
            gm0.j1.n().f273288b.a(1262, this);
            gm0.j1.n().f273288b.g(f2Var);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceDeviceProfileUI", "Do normal bind device.");
            java.lang.String str3 = this.f99263o;
            int i17 = this.f99264p;
            gm0.j1.n().f273288b.a(536, this);
            com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent exDeviceBindHardDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceBindHardDeviceEvent();
            am.y4 y4Var = exDeviceBindHardDeviceEvent.f54112g;
            y4Var.f8430a = str3;
            y4Var.f8432c = 1;
            y4Var.f8431b = i17;
            exDeviceBindHardDeviceEvent.e();
            this.f99255d = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.c2f), true, true, new com.tencent.mm.plugin.exdevice.ui.l2(this, exDeviceBindHardDeviceEvent.f54113h.f8514a));
        }
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceDeviceProfileUI", "scene is null.");
            return;
        }
        m1Var.getType();
        if (m1Var instanceof com.tencent.mm.plugin.exdevice.model.e2) {
            runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.y1(this));
            gm0.j1.n().f273288b.q(m1Var.getType(), this);
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd error(%d, %d, %s).(type : %d)", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(m1Var.getType()));
                runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.z1(this));
                return;
            } else {
                runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.c2(this));
                W6(com.tencent.mm.plugin.exdevice.model.l3.Ui().L0(this.f99261m, this.f99262n));
                runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.m2(this));
                return;
            }
        }
        if (m1Var instanceof com.tencent.mm.plugin.exdevice.model.f2) {
            runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.y1(this));
            gm0.j1.n().f273288b.q(m1Var.getType(), this);
            v32.b W0 = com.tencent.mm.plugin.exdevice.model.l3.Ui().W0(a42.i.h(this.f99257f));
            if (i17 != 0 || i18 != 0 || W0 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd error(%d, %d, %s).(type : %d)", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(m1Var.getType()));
                runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.z1(this));
                return;
            } else {
                W6(W0);
                runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.n2(this));
                runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.c2(this));
                return;
            }
        }
        if (!(m1Var instanceof com.tencent.mm.plugin.exdevice.model.s2)) {
            if (m1Var instanceof com.tencent.mm.plugin.exdevice.model.r2) {
                runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.y1(this));
                if (i17 == 0 && i18 == 0) {
                    runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.p2(this));
                    finish();
                    return;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd, unbind failed (%d, %d, %s).(type : %d)", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(m1Var.getType()));
                    runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.f2(this));
                    return;
                }
            }
            return;
        }
        runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.y1(this));
        gm0.j1.n().f273288b.q(1263, this);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExdeviceDeviceProfileUI", "onSceneEnd error(%d, %d, %s).(type : %d)", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), str, java.lang.Integer.valueOf(m1Var.getType()));
            dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.c3f), 1).show();
            return;
        }
        this.f99265q = ((com.tencent.mm.plugin.exdevice.model.s2) m1Var).f99061g;
        runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.o2(this));
        v32.b L0 = com.tencent.mm.plugin.exdevice.model.l3.Ui().L0(this.f99261m, this.f99262n);
        if (L0 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ExdeviceDeviceProfileUI", "hard device info is null.(deviceId:%s, deviceType:%s)", this.f99261m, this.f99262n);
            return;
        }
        L0.f237106y = this.f99265q;
        L0.f237101t = true;
        com.tencent.mm.plugin.exdevice.model.l3.Ui().update(L0, new java.lang.String[0]);
    }
}
