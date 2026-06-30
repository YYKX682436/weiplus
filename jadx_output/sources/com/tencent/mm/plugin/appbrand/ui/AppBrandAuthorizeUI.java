package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class AppBrandAuthorizeUI extends com.tencent.mm.ui.base.preference.MMPreference {
    public static final java.lang.String[] Z = {"preference_key_subscribe_msg", "scope.userInfo", "scope.userProfileChange", "scope.userLocation", "scope.userFuzzyLocation", "scope.bluetooth", "preference_key_employee_relation_info"};

    /* renamed from: p0, reason: collision with root package name */
    public static final java.lang.String[] f89299p0 = {"scope.receiptQrCode", "scope.personalC2CPay"};
    public com.tencent.mm.ui.widget.dialog.u3 F;
    public com.tencent.mm.ui.base.preference.Preference G;
    public r45.vb H;
    public r45.vb I;
    public com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData N;
    public com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo P;
    public com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo Q;
    public com.tencent.mm.plugin.appbrand.ui.z0 R;
    public boolean S;
    public boolean T;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f89303f;

    /* renamed from: g, reason: collision with root package name */
    public int f89304g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f89305h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes f89306i;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f89308n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.Preference f89309o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.Preference f89310p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.IconPreference f89311q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.IconPreference f89312r;

    /* renamed from: s, reason: collision with root package name */
    public r45.vb f89313s;

    /* renamed from: t, reason: collision with root package name */
    public r45.vb f89314t;

    /* renamed from: u, reason: collision with root package name */
    public r45.vb f89315u;

    /* renamed from: v, reason: collision with root package name */
    public r45.vb f89316v;

    /* renamed from: w, reason: collision with root package name */
    public r45.vb f89317w;

    /* renamed from: x, reason: collision with root package name */
    public int f89318x;

    /* renamed from: y, reason: collision with root package name */
    public int f89319y;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f89301d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public r45.uf7 f89302e = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f89307m = "";

    /* renamed from: z, reason: collision with root package name */
    public boolean f89320z = false;
    public boolean A = true;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;

    /* renamed from: J, reason: collision with root package name */
    public boolean f89300J = false;
    public boolean K = false;
    public boolean L = false;
    public boolean M = false;
    public boolean U = false;
    public boolean V = true;
    public final java.util.ArrayList W = new java.util.ArrayList();
    public final java.util.ArrayList X = new java.util.ArrayList();
    public final com.tencent.mm.sdk.event.IListener Y = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AppBrandNotifyMessageStatusChangedEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.1
        {
            this.__eventId = -1390647424;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.AppBrandNotifyMessageStatusChangedEvent appBrandNotifyMessageStatusChangedEvent) {
            com.tencent.mm.autogen.events.AppBrandNotifyMessageStatusChangedEvent appBrandNotifyMessageStatusChangedEvent2 = appBrandNotifyMessageStatusChangedEvent;
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.this;
            com.tencent.mm.ui.base.preference.r rVar = appBrandAuthorizeUI.f89308n;
            if (rVar == null || ((com.tencent.mm.ui.base.preference.h0) rVar).h("preference_key_notify_msg") == null) {
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "change notify preferent status by event");
            ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).h("preference_key_notify_msg")).O(appBrandNotifyMessageStatusChangedEvent2.f53982g.f8150b);
            return true;
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r0 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        if (r2 == false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void V6(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI r5, java.util.List r6, com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData r7, r45.uf7 r8) {
        /*
            boolean r0 = r5.L
            if (r0 == 0) goto La4
            boolean r0 = r5.M
            if (r0 == 0) goto La4
            boolean r0 = r5.n7()
            if (r0 == 0) goto L12
            boolean r0 = r5.U
            if (r0 == 0) goto La4
        L12:
            java.lang.String r0 = r5.f89303f
            boolean r0 = d7(r0, r6)
            r5.D = r0
            java.lang.String r0 = r5.f89303f
            boolean r0 = c7(r0, r6)
            r5.f89300J = r0
            r5.n7()
            boolean r0 = r5.D
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5e
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L58
            java.util.Iterator r0 = r6.iterator()
        L35:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r0.next()
            r45.vb r3 = (r45.vb) r3
            java.lang.String r4 = r3.f388058d
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r4 != 0) goto L35
            java.lang.String r3 = r3.f388058d
            java.lang.String r4 = "scope.userLocation"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L35
            r0 = r2
            goto L56
        L55:
            r0 = r1
        L56:
            if (r0 != 0) goto L5e
        L58:
            r5.h7()
            r5.g7()
        L5e:
            boolean r0 = r5.f89300J
            if (r0 == 0) goto L94
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L8e
            java.util.Iterator r0 = r6.iterator()
        L6c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L8b
            java.lang.Object r3 = r0.next()
            r45.vb r3 = (r45.vb) r3
            java.lang.String r4 = r3.f388058d
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r4 != 0) goto L6c
            java.lang.String r3 = r3.f388058d
            java.lang.String r4 = "scope.bluetooth"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L6c
            goto L8c
        L8b:
            r2 = r1
        L8c:
            if (r2 != 0) goto L94
        L8e:
            r5.f7()
            r5.e7()
        L94:
            com.tencent.mm.plugin.appbrand.ui.u r0 = new com.tencent.mm.plugin.appbrand.ui.u
            r0.<init>(r5, r1)
            r5.runOnUiThread(r0)
            com.tencent.mm.plugin.appbrand.ui.v r0 = new com.tencent.mm.plugin.appbrand.ui.v
            r0.<init>(r5, r6, r7, r8)
            r5.runOnUiThread(r0)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.V6(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI, java.util.List, com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData, r45.uf7):void");
    }

    public static void W6(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, boolean z17, boolean z18, com.tencent.mm.ui.base.preference.Preference preference, com.tencent.mm.ui.base.preference.r rVar, r45.vb vbVar) {
        appBrandAuthorizeUI.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ui.q0(appBrandAuthorizeUI, z17, preference, z18, vbVar, rVar));
    }

    public static void X6(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI) {
        appBrandAuthorizeUI.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ui.o(appBrandAuthorizeUI));
    }

    public static void Y6(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, int i17) {
        appBrandAuthorizeUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "updateLocationAuthState, state:%d", java.lang.Integer.valueOf(i17));
        appBrandAuthorizeUI.h7();
        appBrandAuthorizeUI.g7();
        if (i17 == 2) {
            r45.vb vbVar = appBrandAuthorizeUI.f89314t;
            if (vbVar != null) {
                vbVar.f388060f = 1;
            }
            r45.vb vbVar2 = appBrandAuthorizeUI.f89313s;
            if (vbVar2 != null) {
                vbVar2.f388060f = 1;
                return;
            }
            return;
        }
        if (i17 == 1) {
            r45.vb vbVar3 = appBrandAuthorizeUI.f89313s;
            if (vbVar3 != null) {
                vbVar3.f388060f = 1;
            }
            r45.vb vbVar4 = appBrandAuthorizeUI.f89314t;
            if (vbVar4 != null) {
                vbVar4.f388060f = 2;
                return;
            }
            return;
        }
        r45.vb vbVar5 = appBrandAuthorizeUI.f89313s;
        if (vbVar5 != null) {
            vbVar5.f388060f = 2;
        }
        r45.vb vbVar6 = appBrandAuthorizeUI.f89314t;
        if (vbVar6 != null) {
            vbVar6.f388060f = 2;
        }
    }

    public static void Z6(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, int i17) {
        appBrandAuthorizeUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "updateFyzzyLocationAuthState, state:%d", java.lang.Integer.valueOf(i17));
        if (appBrandAuthorizeUI.f89315u == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "create AuthItemLocation");
            r45.vb vbVar = new r45.vb();
            appBrandAuthorizeUI.f89315u = vbVar;
            vbVar.f388060f = 2;
            vbVar.f388058d = "scope.userFuzzyLocation";
            vbVar.f388059e = appBrandAuthorizeUI.getString(com.tencent.mm.R.string.f490057jp);
            appBrandAuthorizeUI.f89301d.add(appBrandAuthorizeUI.f89313s);
        }
        if (i17 == 2) {
            appBrandAuthorizeUI.f89315u.f388060f = 1;
        } else if (i17 == 1) {
            appBrandAuthorizeUI.f89315u.f388060f = 1;
        } else {
            appBrandAuthorizeUI.f89315u.f388060f = 2;
        }
    }

    public static boolean a7(java.util.List list) {
        if (list == null) {
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.vb vbVar = (r45.vb) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(vbVar.f388058d) && vbVar.f388058d.equalsIgnoreCase("scope.bluetoothBackground")) {
                return true;
            }
        }
        return false;
    }

    public static boolean b7(java.util.List list) {
        if (list == null) {
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.vb vbVar = (r45.vb) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(vbVar.f388058d) && vbVar.f388058d.equalsIgnoreCase("scope.userLocationBackground")) {
                return true;
            }
        }
        return false;
    }

    public static boolean c7(java.lang.String str, java.util.List list) {
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) ? false : com.tencent.mm.sdk.platformtools.o4.M("appbrand_background_config").i(java.lang.String.format("%s_bluetooth_background_required", str), false)) || a7(list);
    }

    public static boolean d7(java.lang.String str, java.util.List list) {
        boolean z17;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                r45.vb vbVar = (r45.vb) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(vbVar.f388058d) && vbVar.f388058d.equalsIgnoreCase("scope.userFuzzyLocation")) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            return false;
        }
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) ? false : com.tencent.mm.sdk.platformtools.o4.M("appbrand_background_config").i(java.lang.String.format("%s_location_background_required", str), false)) || b7(list);
    }

    public final void e7() {
        if (this.I == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "create AuthItemBluetoothBackground");
            r45.vb vbVar = new r45.vb();
            this.I = vbVar;
            vbVar.f388060f = 2;
            vbVar.f388058d = "scope.bluetoothBackground";
            vbVar.f388059e = getString(com.tencent.mm.R.string.f490051jj);
            this.f89301d.add(this.I);
        }
    }

    public final void f7() {
        if (this.H == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "create AuthItemBluetooth");
            r45.vb vbVar = new r45.vb();
            this.H = vbVar;
            vbVar.f388060f = 2;
            vbVar.f388058d = "scope.bluetooth";
            vbVar.f388059e = getString(com.tencent.mm.R.string.f490051jj);
            this.f89301d.add(this.H);
        }
    }

    public final void g7() {
        if (this.f89314t == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "create AuthItemLocationBackground");
            r45.vb vbVar = new r45.vb();
            this.f89314t = vbVar;
            vbVar.f388060f = 2;
            vbVar.f388058d = "scope.userLocationBackground";
            vbVar.f388059e = getString(com.tencent.mm.R.string.f490057jp);
            this.f89301d.add(this.f89314t);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494831d;
    }

    public final void h7() {
        if (this.f89313s == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "create AuthItemLocation");
            r45.vb vbVar = new r45.vb();
            this.f89313s = vbVar;
            vbVar.f388060f = 2;
            vbVar.f388058d = "scope.userLocation";
            vbVar.f388059e = getString(com.tencent.mm.R.string.f490057jp);
            this.f89301d.add(this.f89313s);
        }
    }

    public final void i7() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ys3();
        lVar.f70665b = new r45.zs3();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/getwxamsgconfig";
        lVar.f70667d = 357;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.z2.e(lVar.a(), new com.tencent.mm.plugin.appbrand.ui.r(this), true, this);
    }

    public final int j7() {
        r45.vb vbVar = this.H;
        if (((vbVar == null || vbVar.f388060f != 1) ? (char) 2 : (char) 1) == 2) {
            return 0;
        }
        r45.vb vbVar2 = this.I;
        return ((vbVar2 == null || vbVar2.f388060f != 1) ? (char) 2 : (char) 1) == 2 ? 1 : 2;
    }

    public final int k7() {
        r45.vb vbVar = this.f89313s;
        if (((vbVar == null || vbVar.f388060f != 1) ? (char) 2 : (char) 1) == 2) {
            return 0;
        }
        r45.vb vbVar2 = this.f89314t;
        return ((vbVar2 == null || vbVar2.f388060f != 1) ? (char) 2 : (char) 1) == 2 ? 1 : 2;
    }

    public final void l7(java.util.List list, com.tencent.mm.plugin.appbrand.ui.y0 y0Var) {
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ui.k(this, list, y0Var));
            return;
        }
        db5.t7.makeText(this, getString(com.tencent.mm.R.string.f490500wu), 1).show();
        if (y0Var != null) {
            y0Var.a(false);
        }
    }

    public final void m7() {
        int i17;
        if (this.B) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (r45.vb vbVar : this.f89301d) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("scope", vbVar.f388058d);
                    jSONObject.put("state", vbVar.f388060f);
                    jSONObject.put("desc", vbVar.f388059e);
                    jSONArray.put(jSONObject);
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandAuthorizeUI", e17, "", new java.lang.Object[0]);
                }
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = this.N;
            if (subscribeMsgSettingData != null) {
                try {
                    jSONObject2.put("mainSwitch", subscribeMsgSettingData.f71835e);
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    for (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem : this.N.f71836f) {
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                        jSONObject3.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, subscribeMsgTmpItem.f71802e);
                        jSONObject3.put("templateId", subscribeMsgTmpItem.f71803f);
                        jSONObject3.put("templateType", subscribeMsgTmpItem.f71804g);
                        if (subscribeMsgTmpItem.f71812r) {
                            i17 = -1;
                        } else {
                            int i18 = subscribeMsgTmpItem.f71807m;
                            i17 = 1;
                            if (i18 != 1 && i18 == 0) {
                                i17 = 0;
                            }
                        }
                        jSONObject3.put("status", i17);
                        jSONObject3.put("acceptAudio", subscribeMsgTmpItem.f71815u);
                        jSONObject3.put("isAudioTemplate", subscribeMsgTmpItem.f71814t);
                        jSONObject3.put("tid", subscribeMsgTmpItem.f71813s);
                        jSONArray2.put(jSONObject3);
                    }
                    jSONObject2.put("templatesInfo", jSONArray2);
                } catch (org.json.JSONException e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandAuthorizeUI", e18, "", new java.lang.Object[0]);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "setResData, authInfo:%s", jSONArray);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "setResData, subscriptionsSetting:%s", jSONObject2);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_app_authorize_state", jSONArray.toString());
            intent.putExtra("key_app_subscriptions_setting", jSONObject2.toString());
            setResult(-1, intent);
        }
    }

    public final boolean n7() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_notify_msg_enable, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "showNotifyMsgPreference, isABtestEnable: %b, isStarApp: %b", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(this.S));
        return this.S && fj6;
    }

    public final void o7() {
        if (this.G == null) {
            return;
        }
        int j76 = j7();
        if (j76 == 1) {
            this.G.G(com.tencent.mm.R.string.f490061jt);
        } else if (j76 != 2) {
            this.G.G(com.tencent.mm.R.string.f490062ju);
        } else {
            this.G.G(com.tencent.mm.R.string.f490053jl);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 100 && intent != null) {
            com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = (com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData) intent.getParcelableExtra("key_biz_data");
            if (subscribeMsgSettingData != null) {
                ca0.e eVar = (ca0.e) i95.n0.c(ca0.e.class);
                java.lang.String userName = this.f89305h;
                com.tencent.mm.plugin.appbrand.ui.y yVar = new com.tencent.mm.plugin.appbrand.ui.y(this);
                ((ba0.h) eVar).getClass();
                kotlin.jvm.internal.o.g(userName, "userName");
                o31.m.f342681a.a(userName, subscribeMsgSettingData, this, yVar);
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ui.n(this));
                return;
            }
            return;
        }
        if (i17 == 2 && intent != null) {
            i19 = intent.getBooleanExtra("key_result_is_open", true) ? 1 : 2;
            int intExtra = intent.getIntExtra("key_result_selected_user_id", 0);
            boolean booleanExtra = intent.getBooleanExtra("key_result_user_info_list_been_modified", false);
            r45.vb vbVar = this.f89316v;
            if (vbVar != null) {
                if (this.f89318x == intExtra && vbVar.f388060f == i19 && !booleanExtra) {
                    return;
                }
                com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ui.n(this));
                this.f89320z = true;
                this.f89318x = intExtra;
                this.f89316v.f388060f = i19;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "userinfo select id" + this.f89318x);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "userinfo main switch state" + this.f89316v.f388060f);
                java.util.ArrayList arrayList = new java.util.ArrayList(1);
                arrayList.add("scope.userInfo");
                l7(arrayList, new com.tencent.mm.plugin.appbrand.ui.w(this));
                return;
            }
            return;
        }
        if (i17 != 3 || intent == null) {
            return;
        }
        i19 = intent.getBooleanExtra("key_result_is_open", true) ? 1 : 2;
        int intExtra2 = intent.getIntExtra("key_result_selected_user_id", 0);
        boolean booleanExtra2 = intent.getBooleanExtra("key_result_user_info_list_been_modified", false);
        r45.vb vbVar2 = this.f89317w;
        if (vbVar2 != null) {
            if (this.f89319y == intExtra2 && vbVar2.f388060f == i19 && !booleanExtra2) {
                return;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ui.n(this));
            this.f89320z = true;
            this.f89319y = intExtra2;
            this.f89317w.f388060f = i19;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "userinfo select id" + this.f89319y);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "userinfo main switch state" + this.f89317w.f388060f);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
            arrayList2.add("scope.userProfileChange");
            l7(arrayList2, new com.tencent.mm.plugin.appbrand.ui.x(this));
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        m7();
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        this.R = new com.tencent.mm.plugin.appbrand.ui.z0(this);
        java.lang.String stringExtra = getIntent().getStringExtra("key_username");
        this.f89305h = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAuthorizeUI", "username is null");
            finish();
            return;
        }
        com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes a17 = k91.k4.a(this.f89305h, false);
        this.f89306i = a17;
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAuthorizeUI", "attrs is null");
            finish();
            return;
        }
        this.B = getIntent().getBooleanExtra("key_app_authorize_jsapi", false);
        this.C = getIntent().getBooleanExtra("key_app_authorize_profile", false);
        this.f89307m = getIntent().getStringExtra("key_app_session_id");
        setMMTitle(com.tencent.mm.R.string.f490059jr);
        setBackBtn(new com.tencent.mm.plugin.appbrand.ui.l0(this));
        this.f89308n = getPreferenceScreen();
        com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes wxaProfileAttributes = this.f89306i;
        this.f89303f = wxaProfileAttributes.f77499e;
        this.f89304g = wxaProfileAttributes.f77504m;
        this.S = com.tencent.mm.plugin.appbrand.app.r9.cj().z0(this.f89305h, this.f89304g);
        java.lang.String str = this.f89303f;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.cc7();
        lVar.f70665b = new r45.dc7();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp_getauthinfo";
        lVar.f70667d = 1115;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        r45.cc7 cc7Var = new r45.cc7();
        cc7Var.f371475d = str;
        cc7Var.f371476e = k91.g3.f305592a.a(str);
        lVar.f70664a = cc7Var;
        com.tencent.mm.modelbase.z2.e(lVar.a(), new com.tencent.mm.plugin.appbrand.ui.l(this), true, this);
        java.lang.String str2 = this.f89303f;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "getAuthVoipDeviceList appId:%s", str2);
        ak1.e.f5572a.a(str2, this, new com.tencent.mm.plugin.appbrand.ui.o0(this));
        java.lang.String str3 = this.B ? "1" : this.C ? "3" : "2";
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "report enter authorize page:%s", str3);
        com.tencent.mm.plugin.appbrand.backgroundrunning.v.a(this.f89303f, this.f89304g, java.lang.System.currentTimeMillis(), 1, str3, 0);
        java.lang.String userName = this.f89305h;
        ca0.e eVar = (ca0.e) i95.n0.c(ca0.e.class);
        com.tencent.mm.plugin.appbrand.ui.p0 p0Var = new com.tencent.mm.plugin.appbrand.ui.p0(this);
        ((ba0.h) eVar).getClass();
        kotlin.jvm.internal.o.g(userName, "userName");
        o31.k kVar = new o31.k(userName, p0Var);
        o31.j jVar = new o31.j();
        jVar.f342676d = kVar;
        keep(jVar);
        f31.f fVar = new f31.f(userName, 3);
        fVar.f259277f = jVar;
        fVar.a(f31.b.f259269a);
        if (n7()) {
            i7();
        }
        this.Y.alive();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.Y.dead();
        ck1.n0 n0Var = ck1.n0.f42354a;
        java.lang.String str = this.f89303f;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.UserInfoRevokeRepository", "invalidateCachedUsageInfo, appId: " + str);
        if (str == null) {
            return;
        }
        ((java.util.HashMap) ck1.n0.f42355b).remove(str);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.util.ArrayList arrayList;
        java.lang.String str = preference.f197780q;
        if (this.f89301d == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandAuthorizeUI", "onPreferenceTreeClick, authItem is null");
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAuthorizeUI", "onPreferenceTreeClick, key is null");
            return false;
        }
        if (str.equalsIgnoreCase("preference_key_employee_relation_info")) {
            com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
            if (h6Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAuthorizeUI", "onPreferenceTreeClick, appLauncher is null");
            } else {
                l81.b1 b1Var = new l81.b1();
                b1Var.f317037o = new android.webkit.ValueCallback() { // from class: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$a
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(java.lang.Object obj) {
                        java.lang.String str2 = (java.lang.String) obj;
                        java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Z;
                        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.this;
                        appBrandAuthorizeUI.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "handleUnBind " + str2);
                        try {
                            if ("unbind".equals(new org.json.JSONObject(str2).optString("operationResult"))) {
                                ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).w("preference_key_employee_relation_info");
                                com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = appBrandAuthorizeUI.N;
                                if (subscribeMsgSettingData != null) {
                                    for (int size = subscribeMsgSettingData.f71836f.size() - 1; size > -1; size--) {
                                        if (((com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) appBrandAuthorizeUI.N.f71836f.get(size)).f71820z == 1) {
                                            appBrandAuthorizeUI.N.f71836f.remove(size);
                                        }
                                    }
                                }
                                ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).notifyDataSetChanged();
                            }
                        } catch (org.json.JSONException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAuthorizeUI", "handleUnBind error ", e17);
                        }
                    }
                };
                b1Var.f317014b = "wx6bd2fb149a93a9c5";
                b1Var.f317018d = 0;
                b1Var.f317022f = "/packages/b2c-bind/pages/unbind-employee/unbind-employee.html";
                b1Var.f317032k = 1247;
                java.lang.String str2 = this.f89303f;
                com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes wxaProfileAttributes = this.f89306i;
                java.lang.String str3 = wxaProfileAttributes.f77502h;
                java.lang.String str4 = wxaProfileAttributes.f77500f;
                com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = this.N;
                if (subscribeMsgSettingData == null || subscribeMsgSettingData.f71836f.isEmpty()) {
                    arrayList = null;
                } else {
                    java.util.List<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> list = this.N.f71836f;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
                    for (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem : list) {
                        if (subscribeMsgTmpItem.f71820z == 1) {
                            arrayList2.add(subscribeMsgTmpItem.f71802e);
                        }
                    }
                    arrayList = arrayList2;
                }
                b1Var.f317028i = new com.tencent.mm.plugin.appbrand.ui.f4(str2, str3, str4, arrayList);
                java.lang.String str5 = this.f89303f;
                com.tencent.mm.plugin.appbrand.config.WxaProfileAttributes wxaProfileAttributes2 = this.f89306i;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "onClickEmployRelation, appId=%s, username=%s, iconUrl=%s", str5, wxaProfileAttributes2.f77500f, wxaProfileAttributes2.f77502h);
                ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(this, b1Var);
            }
            return false;
        }
        if (str.equalsIgnoreCase("scope.userLocation")) {
            if (this.f89313s == null || this.f89306i == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "onClickLocationPreference, auth item location or attrs is null");
                return false;
            }
            int k76 = k7();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "onClickLocationPreference, current location state:%s", java.lang.Integer.valueOf(k76));
            mmSetOnActivityResultCallback(new com.tencent.mm.plugin.appbrand.ui.h0(this, k76));
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI.class);
            intent.putExtra("key_title", this.f89313s.f388059e);
            intent.putExtra("key_desc", getString(com.tencent.mm.R.string.f490066jy));
            intent.putExtra("key_desc_oversea", getString(com.tencent.mm.R.string.f490067jz));
            intent.putExtra("key_desc_oversea_for_location", c01.e2.a0());
            intent.putExtra("key_has_prefix", false);
            intent.putExtra("key_state", k76);
            intent.putExtra("key_three_state", this.D);
            j45.l.n(this, "appbrand", ".ui.AppBrandAuthorizeDetailUI", intent, 1);
            java.lang.String str6 = this.D ? "1" : "2";
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "report click location auth item:%s", str6);
            com.tencent.mm.plugin.appbrand.backgroundrunning.v.a(this.f89303f, this.f89304g, java.lang.System.currentTimeMillis(), 2, str6, 0);
            return false;
        }
        if (str.equalsIgnoreCase("scope.userFuzzyLocation")) {
            r45.vb vbVar = this.f89315u;
            if (vbVar == null || this.f89306i == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "onClickLocationPreference, auth item location or attrs is null");
                return false;
            }
            int i17 = vbVar.f388060f;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "onClickLocationPreference, current location state:%s", java.lang.Integer.valueOf(i17));
            mmSetOnActivityResultCallback(new com.tencent.mm.plugin.appbrand.ui.k0(this, i17));
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI.class);
            intent2.putExtra("key_title", this.f89315u.f388059e);
            intent2.putExtra("key_desc", getString(com.tencent.mm.R.string.f490064jw));
            intent2.putExtra("key_desc_oversea", getString(com.tencent.mm.R.string.f490065jx));
            intent2.putExtra("key_desc_oversea_for_location", c01.e2.a0());
            intent2.putExtra("key_has_prefix", false);
            intent2.putExtra("key_state", i17 == 1 ? 1 : 0);
            intent2.putExtra("key_three_state", false);
            j45.l.n(this, "appbrand", ".ui.AppBrandAuthorizeDetailUI", intent2, 5);
            return false;
        }
        if (str.equalsIgnoreCase("scope.bluetooth")) {
            if (this.H == null || this.f89306i == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "onClickBluetoothPreference, auth item bluetooth or attrs is null");
                return false;
            }
            final int j76 = j7();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "onClickBluetoothPreference, current bluetooth state:%s", java.lang.Integer.valueOf(j76));
            mmSetOnActivityResultCallback(new com.tencent.mm.ui.da() { // from class: com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI$$b
                @Override // com.tencent.mm.ui.xc
                public final void mmOnActivityResult(int i18, int i19, android.content.Intent intent3) {
                    int i27;
                    int intExtra;
                    java.lang.String[] strArr = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Z;
                    com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.this;
                    appBrandAuthorizeUI.getClass();
                    if (i18 == 4 && i19 == -1 && intent3 != null && intent3.hasExtra("key_result_state") && (intExtra = intent3.getIntExtra("key_result_state", (i27 = j76))) != i27) {
                        appBrandAuthorizeUI.f89320z = true;
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "onClickBluetoothPreference, change bluetooth state to:%s", java.lang.Integer.valueOf(intExtra));
                        appBrandAuthorizeUI.p7(intExtra);
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(2);
                        arrayList3.add("scope.bluetooth");
                        arrayList3.add("scope.bluetoothBackground");
                        appBrandAuthorizeUI.l7(arrayList3, new com.tencent.mm.plugin.appbrand.ui.n0(appBrandAuthorizeUI, intExtra, i27));
                    }
                }
            });
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeDetailUI.class);
            intent3.putExtra("key_title", this.H.f388059e);
            intent3.putExtra("key_desc", this.H.f388062h);
            intent3.putExtra("key_state", j76);
            intent3.putExtra("key_three_state", this.f89300J);
            intent3.putExtra("key_override_authorize_usage_desc", this.H.f388062h);
            intent3.putExtra("key_override_authorize_both_desc", getString(com.tencent.mm.R.string.f490053jl));
            intent3.putExtra("key_override_authorize_option_order", new int[]{1, 2, 0});
            j45.l.n(this, "appbrand", ".ui.AppBrandAuthorizeDetailUI", intent3, 4);
            return false;
        }
        if (str.equalsIgnoreCase("scope.userInfo")) {
            if (this.f89316v == null) {
                return true;
            }
            android.content.Intent intent4 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandUserInfoAuthorizeUI.class);
            intent4.putExtra("key_app_id", this.f89303f);
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str7 = this.f89305h;
            ((sg3.a) v0Var).getClass();
            intent4.putExtra("key_nickname", c01.a2.e(str7));
            intent4.putExtra("key_user_info", this.P);
            intent4.putExtra("key_is_state_open", this.f89316v.f388060f == 1);
            startActivityForResult(intent4, 2);
            return true;
        }
        if ("scope.userProfileChange".equals(str)) {
            if (this.f89317w == null) {
                return true;
            }
            android.content.Intent intent5 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandUserProfileAuthorizeUI.class);
            intent5.putExtra("key_app_id", this.f89303f);
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str8 = this.f89305h;
            ((sg3.a) v0Var2).getClass();
            intent5.putExtra("key_nickname", c01.a2.e(str8));
            intent5.putExtra("key_user_info", this.Q);
            intent5.putExtra("key_is_state_open", this.f89317w.f388060f == 1);
            startActivityForResult(intent5, 3);
            return true;
        }
        if ("preference_key_subscribe_msg".equals(str)) {
            android.content.Intent intent6 = new android.content.Intent();
            intent6.setClassName(this, "com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI");
            intent6.putExtra("key_biz_username", this.f89305h);
            ((ba0.h) ((ca0.e) i95.n0.c(ca0.e.class))).getClass();
            intent6.putExtra("key_biz_presenter_class", i31.i.class.getName());
            tg3.v0 v0Var3 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str9 = this.f89305h;
            ((sg3.a) v0Var3).getClass();
            intent6.putExtra("key_biz_nickname", c01.a2.e(str9));
            intent6.putExtra("key_enter_scene", 1);
            intent6.putExtra("key_biz_data", this.N);
            startActivityForResult(intent6, 100);
            return true;
        }
        if ("preference_key_notify_msg".equals(str)) {
            java.lang.String str10 = this.f89303f;
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = (com.tencent.mm.ui.base.preference.CheckBoxPreference) preference;
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.le7 le7Var = new r45.le7();
            le7Var.f379398d = str10;
            le7Var.f379399e = !checkBoxPreference.N() ? 1 : 0;
            linkedList.add(le7Var);
            r45.h36 h36Var = new r45.h36();
            h36Var.f375808d = linkedList;
            h36Var.f375809e = 2;
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ui.n(this));
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70665b = new r45.i36();
            lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/setwxamsgconfig";
            lVar.f70667d = 3872;
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            lVar.f70664a = h36Var;
            com.tencent.mm.modelbase.z2.e(lVar.a(), new com.tencent.mm.plugin.appbrand.ui.q(this, checkBoxPreference, linkedList, str10), true, this);
            return true;
        }
        if ("preference_key_user_info".equals(str)) {
            java.lang.String str11 = this.f89303f;
            int i18 = com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage.f89931g;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "start, appId: " + str11);
            if (str11 == null) {
                return true;
            }
            kotlinx.coroutines.l.d(androidx.lifecycle.z.a(this), null, null, new ck1.b(str11, null), 3, null);
            android.content.Intent intent7 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.privacy.AppBrandPrivacyPageContainerUI.class);
            ak1.f.c(intent7, com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage.class);
            intent7.putExtra("appId", str11);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent7);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/ui/privacy/revoke/AppBrandUserInfoRevokePage$Companion", "start", "(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/appbrand/ui/privacy/revoke/AppBrandUserInfoRevokePage$Companion", "start", "(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if ("preference_key_privacy_use_record".equals(str)) {
            java.lang.String str12 = this.f89305h;
            int i19 = com.tencent.mm.plugin.appbrand.ui.privacy.use_record.AppBrandPrivacyUseRecordPage.f89935e;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPrivacyUseRecordPage", "start, username: " + str12);
            if (str12 == null) {
                return true;
            }
            android.content.Intent intent8 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.privacy.AppBrandPrivacyPageContainerUI.class);
            ak1.f.c(intent8, com.tencent.mm.plugin.appbrand.ui.privacy.use_record.AppBrandPrivacyUseRecordPage.class);
            intent8.putExtra(dm.i4.COL_USERNAME, str12);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(intent8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/ui/privacy/use_record/AppBrandPrivacyUseRecordPage$Companion", "start", "(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList4.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/appbrand/ui/privacy/use_record/AppBrandPrivacyUseRecordPage$Companion", "start", "(Landroidx/appcompat/app/AppCompatActivity;Ljava/lang/String;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if ("preference_key_voip_device_list".equals(str)) {
            android.content.Intent intent9 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandVoIPDeviceListAuthorizeUI.class);
            intent9.putExtra("key_title", preference.o());
            intent9.putExtra("key_appid", this.f89303f);
            intent9.putExtra("key_username", this.f89305h);
            intent9.putExtra("key_session_id", this.f89307m);
            intent9.putExtra("key_enter_source", 1);
            j45.l.j(this, "appbrand", ".ui.AppBrandVoIPDeviceListAuthorizeUI", intent9, null);
            return true;
        }
        if ("scope.devicePanel".equals(str)) {
            com.tencent.mm.plugin.appbrand.service.h6 h6Var2 = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
            if (h6Var2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandAuthorizeUI", "onPreferenceTreeClick, appLauncher is null");
                return true;
            }
            l81.b1 b1Var2 = new l81.b1();
            b1Var2.f317014b = "wxb6d22f922f37b35a";
            b1Var2.f317018d = 0;
            b1Var2.f317022f = java.lang.String.format(java.util.Locale.US, "/packages/settings/pages/device/device.html?appid=%s", this.f89303f);
            b1Var2.f317032k = 1247;
            ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var2).bj(this, b1Var2);
            return true;
        }
        for (r45.vb vbVar2 : this.f89301d) {
            java.lang.String str13 = vbVar2.f388058d;
            if (str13 == null) {
                str13 = "";
            }
            if (str.equals(str13)) {
                this.f89320z = true;
                if (((com.tencent.mm.ui.base.preference.CheckBoxPreference) preference).N()) {
                    vbVar2.f388060f = 1;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(1);
                    arrayList5.add(str);
                    l7(arrayList5, new com.tencent.mm.plugin.appbrand.ui.r0(this, preference, rVar, vbVar2));
                } else if (this.A) {
                    this.A = false;
                    vj1.b.f437659a.a(this, new com.tencent.mm.plugin.appbrand.ui.t0(this, vbVar2, str, preference, rVar), new com.tencent.mm.plugin.appbrand.ui.u0(this, vbVar2, preference, rVar), new com.tencent.mm.plugin.appbrand.ui.v0(this, vbVar2, preference, rVar), this.f89303f);
                } else {
                    vbVar2.f388060f = 2;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList(1);
                    arrayList6.add(str);
                    l7(arrayList6, new com.tencent.mm.plugin.appbrand.ui.w0(this, preference, rVar, vbVar2));
                }
            }
        }
        return false;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.ui.base.preference.r rVar;
        com.tencent.mm.ui.base.preference.r rVar2;
        super.onResume();
        if (this.V) {
            this.V = false;
            return;
        }
        this.S = com.tencent.mm.plugin.appbrand.app.r9.cj().z0(this.f89305h, this.f89304g);
        if (!n7() && (rVar2 = this.f89308n) != null && ((com.tencent.mm.ui.base.preference.h0) rVar2).h("preference_key_notify_msg") != null) {
            ((com.tencent.mm.ui.base.preference.h0) this.f89308n).w("preference_key_notify_msg");
        } else if (n7() && (rVar = this.f89308n) != null && ((com.tencent.mm.ui.base.preference.h0) rVar).h("preference_key_notify_msg") == null) {
            i7();
        }
    }

    public final void p7(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "updateBluetoothAuthState, state:%d", java.lang.Integer.valueOf(i17));
        f7();
        e7();
        if (i17 == 2) {
            r45.vb vbVar = this.I;
            if (vbVar != null) {
                vbVar.f388060f = 1;
            }
            r45.vb vbVar2 = this.H;
            if (vbVar2 != null) {
                vbVar2.f388060f = 1;
                return;
            }
            return;
        }
        if (i17 == 1) {
            r45.vb vbVar3 = this.H;
            if (vbVar3 != null) {
                vbVar3.f388060f = 1;
            }
            r45.vb vbVar4 = this.I;
            if (vbVar4 != null) {
                vbVar4.f388060f = 2;
                return;
            }
            return;
        }
        r45.vb vbVar5 = this.H;
        if (vbVar5 != null) {
            vbVar5.f388060f = 2;
        }
        r45.vb vbVar6 = this.I;
        if (vbVar6 != null) {
            vbVar6.f388060f = 2;
        }
    }

    public final void q7() {
        if (this.f89309o == null) {
            return;
        }
        int k76 = k7();
        if (k76 == 1) {
            this.f89309o.G(com.tencent.mm.R.string.f490061jt);
        } else if (k76 != 2) {
            this.f89309o.G(com.tencent.mm.R.string.f490062ju);
        } else {
            this.f89309o.G(com.tencent.mm.R.string.f490060js);
        }
    }

    public final void r7(com.tencent.mm.ui.base.preference.IconPreference iconPreference, r45.vb vbVar) {
        this.f89316v = vbVar;
        r45.sv6 sv6Var = vbVar.f388061g;
        if (sv6Var == null) {
            return;
        }
        this.f89318x = sv6Var.f385987g;
        iconPreference.Z(i65.a.b(getContext(), 40), i65.a.b(getContext(), 40));
        iconPreference.f197785v = false;
        iconPreference.C(this.f89316v.f388058d);
        iconPreference.L(this.f89316v.f388059e);
        r45.vb vbVar2 = this.f89316v;
        this.P = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo(vbVar2.f388061g, vbVar2.f388066o, vbVar2.f388065n, vbVar2.f388067p);
        if (this.f89316v.f388060f == 2) {
            iconPreference.G(com.tencent.mm.R.string.f490062ju);
            iconPreference.R(null);
            iconPreference.T(8);
            return;
        }
        iconPreference.H("");
        iconPreference.S(com.tencent.mm.R.drawable.cbh);
        iconPreference.T(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "userinfo default_avatar_id = " + this.f89316v.f388061g.f385987g);
        java.util.Iterator it = this.f89316v.f388061g.f385984d.iterator();
        while (it.hasNext()) {
            r45.tv6 tv6Var = (r45.tv6) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "userinfo list avatar id = " + tv6Var.f386822d);
            if (this.f89316v.f388061g.f385987g == tv6Var.f386822d) {
                l01.d0.f314761a.m(new com.tencent.mm.plugin.appbrand.ui.a0(this, iconPreference), tv6Var.f386824f, new com.tencent.mm.plugin.appbrand.ui.b0(this));
                return;
            }
        }
    }

    public final void s7(com.tencent.mm.ui.base.preference.IconPreference iconPreference, r45.vb vbVar) {
        this.f89317w = vbVar;
        r45.sv6 sv6Var = vbVar.f388061g;
        if (sv6Var == null) {
            return;
        }
        this.f89319y = sv6Var.f385987g;
        iconPreference.f197785v = false;
        iconPreference.C(vbVar.f388058d);
        iconPreference.L(this.f89317w.f388059e);
        r45.vb vbVar2 = this.f89317w;
        this.Q = new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.MMUserAvatarInfo(vbVar2.f388061g, vbVar2.f388066o, vbVar2.f388065n, vbVar2.f388067p);
        if (this.f89317w.f388060f == 2) {
            iconPreference.G(com.tencent.mm.R.string.f490062ju);
            iconPreference.R(null);
            iconPreference.T(8);
            iconPreference.Y(8);
            return;
        }
        iconPreference.H("");
        iconPreference.S(com.tencent.mm.R.drawable.cbh);
        iconPreference.T(0);
        iconPreference.Y(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "userinfo default_avatar_id = " + this.f89317w.f388061g.f385987g);
        java.util.Iterator it = this.f89317w.f388061g.f385984d.iterator();
        while (it.hasNext()) {
            r45.tv6 tv6Var = (r45.tv6) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "userinfo list avatar id = " + tv6Var.f386822d);
            if (this.f89317w.f388061g.f385987g == tv6Var.f386822d) {
                iconPreference.H(tv6Var.f386823e);
                l01.d0.f314761a.m(new com.tencent.mm.plugin.appbrand.ui.d0(this, iconPreference), tv6Var.f386824f, new com.tencent.mm.plugin.appbrand.ui.e0(this));
                return;
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class AuthStateChangedByUserEvent implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.AuthStateChangedByUserEvent> CREATOR = new com.tencent.mm.plugin.appbrand.ui.x0();

        /* renamed from: d, reason: collision with root package name */
        public boolean f89325d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f89326e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f89327f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f89328g;

        public AuthStateChangedByUserEvent() {
            this.f89325d = false;
            this.f89326e = false;
            this.f89327f = false;
            this.f89328g = false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeByte(this.f89325d ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f89326e ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f89327f ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f89328g ? (byte) 1 : (byte) 0);
        }

        public AuthStateChangedByUserEvent(android.os.Parcel parcel) {
            this.f89325d = parcel.readByte() != 0;
            this.f89326e = parcel.readByte() != 0;
            this.f89327f = parcel.readByte() != 0;
            this.f89328g = parcel.readByte() != 0;
        }
    }
}
