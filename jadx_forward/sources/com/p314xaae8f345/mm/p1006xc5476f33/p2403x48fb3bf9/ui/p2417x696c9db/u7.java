package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class u7 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.x0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f268462e;

    public u7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        this.f268462e = new java.lang.ref.WeakReference(viewOnCreateContextMenuListenerC19337x37f3384d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void Ae(android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference = this.f268462e;
        if (weakReference.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubCallbackAIDLStub", "setCustomMenu");
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("keys");
        java.util.ArrayList<java.lang.String> stringArrayList2 = bundle.getStringArrayList("titles");
        int size = stringArrayList.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList.add(new ip.g(stringArrayList.get(i17), stringArrayList2.get(i17)));
        }
        if (stringArrayList.size() > 0) {
            java.lang.String mo120156xb5887639 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265348f.mo120156xb5887639();
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).P1.containsKey(mo120156xb5887639)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).P1.remove(mo120156xb5887639);
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).P1.put(mo120156xb5887639, arrayList);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public boolean Cg(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.h hVar) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void D3(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.g9(this, str));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public java.lang.String E6() {
        java.lang.ref.WeakReference weakReference = this.f268462e;
        if (weakReference.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing()) {
            return null;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).F7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public android.os.Bundle H6(java.lang.String str, java.lang.String str2) {
        return o45.vf.a(false, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void Ic(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.z9(this, str, str2));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public java.lang.String Ni() {
        java.lang.ref.WeakReference weakReference = this.f268462e;
        if (weakReference.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing()) {
            return null;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).L1.E;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void V1() {
        nw4.n nVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var;
        java.lang.ref.WeakReference weakReference = this.f268462e;
        if (weakReference.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing() || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265377p0 == null || (n3Var = (nVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265377p0).f422425f) == null) {
            return;
        }
        n3Var.mo50293x3498a0(new nw4.s0(nVar));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void W1(java.lang.String str) {
        java.lang.ref.WeakReference weakReference = this.f268462e;
        if (weakReference.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing()) {
            return;
        }
        int i17 = 0;
        try {
            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubCallbackAIDLStub", "setFontSizeCb, ex = " + e17.getMessage());
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265348f == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubCallbackAIDLStub", "setFontSizeCb fail, viewWV is null");
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.d9(this, i17));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public int X1() {
        java.lang.ref.WeakReference weakReference = this.f268462e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = weakReference.get() != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).L1 : null;
        if (e3Var != null) {
            return e3Var.O().f264916c;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubCallbackAIDLStub", "GetA8keyScene, controller is nil");
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public boolean aj(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f268462e;
        if (weakReference.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing() || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265377p0 == null) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.y8 y8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.y8(this, str, str2, bundle, z17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            y8Var.run();
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(y8Var);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void b(android.os.Bundle bundle) {
        if (this.f268462e.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) this.f268462e.get()).isFinishing()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubCallbackAIDLStub", "IUIController, closeWindow");
        if (bundle != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("result_data", bundle);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) this.f268462e.get()).setResult(-1, intent);
        }
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c9(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /* renamed from: callback */
    public boolean mo70207xf5bc2045(int i17, android.os.Bundle bundle) {
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubCallbackAIDLStub", "callback, actionCode = " + i17);
        final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) this.f268462e.get();
        int i19 = 0;
        if (viewOnCreateContextMenuListenerC19337x37f3384d == null || viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing()) {
            return false;
        }
        final nw4.n nVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265377p0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265409z1;
        if (i17 == 13) {
            if (bundle == null) {
                return true;
            }
            bundle.putString("application_language", viewOnCreateContextMenuListenerC19337x37f3384d.K1.mo74368x1bacd0ce());
            viewOnCreateContextMenuListenerC19337x37f3384d.R1 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.jc(bundle);
            return true;
        }
        if (i17 == 90) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.n8(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, bundle.getString("webview_network_type")));
            return true;
        }
        if (i17 == 2100) {
            final java.lang.String string = bundle.getString("background_audio_state_player_state");
            final java.lang.String string2 = bundle.getString("background_audio_state_event");
            final float f17 = bundle.getFloat("background_audio_state_player_duration");
            final java.lang.String string3 = bundle.getString("background_audio_state_player_src");
            final int i27 = bundle.getInt("background_audio_state_player_err_code");
            final java.lang.String string4 = bundle.getString("background_audio_state_player_err_msg");
            final java.lang.String string5 = bundle.getString("background_audio_state_player_src_id");
            final java.lang.String string6 = bundle.getString("background_audio_state_player_audio_id", "");
            final float f18 = bundle.getFloat("background_audio_state_current_time");
            final java.lang.String string7 = bundle.getString("background_audio_state_listen_item", "");
            final float f19 = bundle.getFloat("background_audio_state_buffered");
            final java.lang.String string8 = bundle.getString("background_audio_state_category_id", "");
            final boolean z17 = bundle.getBoolean("background_audio_state_is_ting", false);
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.ui.tools.u7$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d.this;
                    final nw4.n nVar2 = nVar;
                    boolean z18 = z17;
                    java.lang.String str = string;
                    java.lang.String str2 = string2;
                    float f27 = f17;
                    int i28 = i27;
                    java.lang.String str3 = string4;
                    float f28 = f18;
                    java.lang.String str4 = string7;
                    java.lang.String str5 = string8;
                    float f29 = f19;
                    java.lang.String str6 = string3;
                    java.lang.String str7 = string5;
                    java.lang.String str8 = string6;
                    if (viewOnCreateContextMenuListenerC19337x37f3384d2 == null || viewOnCreateContextMenuListenerC19337x37f3384d2.isFinishing() || nVar2 == null) {
                        return;
                    }
                    if (!z18) {
                        int i29 = (int) f27;
                        if (!nVar2.f422428i) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onBackgroundAudioStateChange fail, not ready");
                            return;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onBackgroundAudioStateChange, state : %s, duration : %d, src:%s, errCode:%d, errMsg:%s, srcId:%s", str, java.lang.Integer.valueOf(i29), str6, java.lang.Integer.valueOf(i28), str3, str7);
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("state", str);
                        hashMap.put("duration", java.lang.Integer.valueOf(i29));
                        hashMap.put("src", str6);
                        hashMap.put("errCode", java.lang.Integer.valueOf(i28));
                        hashMap.put("errMsg", str3);
                        hashMap.put("srcId", str7);
                        hashMap.put("audioId", str8);
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.h0(nVar2, nw4.x2.c("onBackgroundAudioStateChange", hashMap, nVar2.f422436q, nVar2.f422437r)));
                        return;
                    }
                    if (!nVar2.f422428i) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onTingAudioStateChanged fail, not ready");
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandler", "onTingAudioStateChanged, state : %s, event: %s, duration : %s, errCode:%d, errMsg:%s, currentTime:%s, categoryId:%s", str, str2, java.lang.Float.valueOf(f27), java.lang.Integer.valueOf(i28), str3, java.lang.Float.valueOf(f28), str5);
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("status", str);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        hashMap2.put("event", str2);
                    }
                    hashMap2.put("duration", java.lang.Float.valueOf(f27));
                    hashMap2.put("buffered", java.lang.Float.valueOf(f29));
                    hashMap2.put("err_code", java.lang.Integer.valueOf(i28));
                    hashMap2.put("err_msg", str3);
                    try {
                        hashMap2.put("item", new org.json.JSONObject(str4));
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiHandler", e17, "onTingAudioStateChanged exception", new java.lang.Object[0]);
                        hashMap2.put("item", str4);
                    }
                    hashMap2.put("categoryId", str5);
                    hashMap2.put("currentTime", java.lang.Float.valueOf(f28));
                    final java.lang.String c17 = nw4.x2.c("onTingAudioStateChanged", hashMap2, nVar2.f422436q, nVar2.f422437r);
                    ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: nw4.n$$e
                        @Override // java.lang.Runnable
                        public final void run() {
                            java.lang.String str9 = c17;
                            nw4.n nVar3 = nw4.n.this;
                            nVar3.getClass();
                            try {
                                nVar3.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + str9 + ")", new nw4.i0(nVar3));
                            } catch (java.lang.Exception e18) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandler", "onTingAudioStateChanged fail, ex = %s", e18.getMessage());
                            }
                        }
                    });
                }
            });
            return true;
        }
        if (i17 == 4007) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b8(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, bundle.getInt("nfc_key_on_touch_errcode", 0)));
            return true;
        }
        switch (i17) {
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32774x503933e6 /* 43 */:
            case 44:
            case 45:
            case 46:
                return true;
            case 47:
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l8(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, bundle.getBoolean("exdevice_lan_state")));
                return true;
            case 48:
                java.lang.String[] stringArray = bundle.getStringArray("msgIds");
                java.lang.String[] stringArray2 = bundle.getStringArray("contents");
                java.lang.String[] stringArray3 = bundle.getStringArray("senders");
                int[] intArray = bundle.getIntArray("msgTypes");
                int[] intArray2 = bundle.getIntArray("msgTimes");
                java.lang.String[] stringArray4 = bundle.getStringArray("msgSignature");
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                int length = stringArray == null ? 0 : stringArray.length;
                while (i19 < length) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        i18 = length;
                        try {
                            jSONObject.put("newMsgId", stringArray[i19]);
                            jSONObject.put("content", stringArray2[i19]);
                            jSONObject.put("sender", stringArray3[i19]);
                            jSONObject.put("msgType", intArray[i19]);
                            jSONObject.put("msgTime", intArray2[i19]);
                            jSONObject.put("msgSignature", stringArray4[i19]);
                            jSONArray.put(jSONObject);
                        } catch (org.json.JSONException e17) {
                            e = e17;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubCallbackAIDLStub", "GetMsgProofItems exception " + e.getMessage());
                            i19++;
                            length = i18;
                        }
                    } catch (org.json.JSONException e18) {
                        e = e18;
                        i18 = length;
                    }
                    i19++;
                    length = i18;
                }
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.m8(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, jSONArray));
                return true;
            default:
                switch (i17) {
                    case 1001:
                        if (viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing()) {
                            return true;
                        }
                        viewOnCreateContextMenuListenerC19337x37f3384d.finish();
                        return true;
                    case 1002:
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.f8(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, wVar, bundle));
                        return true;
                    case 1003:
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.q8(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, wVar, bundle));
                        return true;
                    case 1004:
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ca(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, wVar, bundle.getString("exdevice_device_id"), bundle.getInt("exdevice_on_state_change_state"), java.lang.Boolean.valueOf(bundle.getBoolean("exdevice_inner_call"))));
                        return true;
                    default:
                        switch (i17) {
                            case 1006:
                                if (nVar == null) {
                                    return true;
                                }
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.g8(this, viewOnCreateContextMenuListenerC19337x37f3384d, bundle, wVar, nVar));
                                return true;
                            case 1007:
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ba(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, wVar, bundle.getString("download_manager_appid", ""), bundle.getLong("download_manager_downloadid"), bundle.getInt("download_manager_progress"), bundle.getFloat("download_manager_progress_float")));
                                return true;
                            case 1008:
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b9(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, wVar, bundle));
                                return true;
                            default:
                                switch (i17) {
                                    case 1010:
                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.m9(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, wVar, bundle));
                                        return true;
                                    case 1011:
                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x9(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, wVar, bundle));
                                        return true;
                                    case 1012:
                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.aa(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, wVar, bundle));
                                        return true;
                                    case 1013:
                                        if (nVar == null) {
                                            return true;
                                        }
                                        try {
                                            java.util.LinkedList linkedList = new java.util.LinkedList();
                                            java.lang.String string9 = bundle.getString("__appId");
                                            java.lang.String string10 = bundle.getString("__url");
                                            if (bundle.containsKey("__webComptList")) {
                                                java.util.Iterator<java.lang.String> it = bundle.getStringArrayList("__webComptList").iterator();
                                                while (it.hasNext()) {
                                                    java.lang.String next = it.next();
                                                    r45.d24 d24Var = new r45.d24();
                                                    d24Var.mo11468x92b714fd(bundle.getByteArray(next));
                                                    linkedList.add(d24Var);
                                                }
                                            }
                                            if (nVar.y() == null) {
                                                return true;
                                            }
                                            nVar.y().b(string9, string10, linkedList);
                                            return true;
                                        } catch (java.io.IOException e19) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewStubCallbackAIDLStub", e19, "parse webCompt", new java.lang.Object[0]);
                                            return true;
                                        }
                                    default:
                                        switch (i17) {
                                            case 2002:
                                                java.util.HashMap hashMap = new java.util.HashMap();
                                                hashMap.put("err_msg", bundle.getString("playResult"));
                                                hashMap.put(dm.i4.f66867x2a5c95c7, bundle.getString(dm.i4.f66867x2a5c95c7));
                                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a8(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, hashMap));
                                                return true;
                                            case 2003:
                                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.v7(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                                return true;
                                            case 2004:
                                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.w7(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                                return true;
                                            case com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46359x61685111 /* 2005 */:
                                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x7(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                                return true;
                                            case com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46357xe9bcaf57 /* 2006 */:
                                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.y7(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                                return true;
                                            case com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46358xc68d61b8 /* 2007 */:
                                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c8(this, viewOnCreateContextMenuListenerC19337x37f3384d));
                                                return true;
                                            case 2008:
                                                java.util.HashMap hashMap2 = new java.util.HashMap();
                                                hashMap2.put(dm.i4.f66867x2a5c95c7, bundle.getString(dm.i4.f66867x2a5c95c7));
                                                hashMap2.put("err_msg", bundle.getString("recordResult"));
                                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.d8(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, hashMap2));
                                                return true;
                                            case com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46348x908ed654 /* 2009 */:
                                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.e8(this, viewOnCreateContextMenuListenerC19337x37f3384d));
                                                return true;
                                            case com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46355x206ed2ef /* 2010 */:
                                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.z7(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                                return true;
                                            case com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46349x3142bb26 /* 2011 */:
                                                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.da(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, bundle.getString("webview_jssdk_file_item_local_id"), bundle.getInt("webview_jssdk_file_item_progreess")));
                                                return true;
                                            default:
                                                switch (i17) {
                                                    case com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54070x4810c209 /* 80001 */:
                                                    case 80002:
                                                        viewOnCreateContextMenuListenerC19337x37f3384d.Q7(i17, bundle);
                                                        return true;
                                                    default:
                                                        switch (i17) {
                                                            case 100001:
                                                            case 100002:
                                                                break;
                                                            default:
                                                                switch (i17) {
                                                                    case 121000:
                                                                        if (((km0.c) gm0.j1.p().a()).a()) {
                                                                            return true;
                                                                        }
                                                                        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t8(this, viewOnCreateContextMenuListenerC19337x37f3384d, bundle));
                                                                        return true;
                                                                    case 121001:
                                                                        if (((km0.c) gm0.j1.p().a()).a()) {
                                                                            return true;
                                                                        }
                                                                        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u8(this, viewOnCreateContextMenuListenerC19337x37f3384d, bundle));
                                                                        return true;
                                                                    case 121002:
                                                                        if (((km0.c) gm0.j1.p().a()).a()) {
                                                                            return true;
                                                                        }
                                                                        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.v8(this, viewOnCreateContextMenuListenerC19337x37f3384d, bundle));
                                                                        return true;
                                                                    case 121003:
                                                                        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.w8(this, viewOnCreateContextMenuListenerC19337x37f3384d, bundle));
                                                                        return true;
                                                                    default:
                                                                        switch (i17) {
                                                                            case 200000:
                                                                            case 200001:
                                                                            case 200002:
                                                                            case 200003:
                                                                                break;
                                                                            default:
                                                                                switch (i17) {
                                                                                    case 15:
                                                                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.h8(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, bundle.getString("exdevice_device_id"), bundle.getByteArray("exdevice_broadcast_data"), bundle.getBoolean("exdevice_is_complete"), bundle.getBoolean("exdevice_is_lan_device"), wVar));
                                                                                        return true;
                                                                                    case 16:
                                                                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.i8(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, bundle.getString("exdevice_device_id"), bundle.getByteArray("exdevice_data"), bundle.getString("exdevice_brand_name")));
                                                                                        return true;
                                                                                    case 17:
                                                                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.j8(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, bundle.getString("exdevice_device_id"), bundle.getBoolean("exdevice_is_bound")));
                                                                                        return true;
                                                                                    case 18:
                                                                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.k8(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, bundle.getBoolean("exdevice_bt_state")));
                                                                                        return true;
                                                                                    default:
                                                                                        switch (i17) {
                                                                                            case 60:
                                                                                            case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45683xae69d160 /* 61 */:
                                                                                            case 62:
                                                                                                break;
                                                                                            default:
                                                                                                switch (i17) {
                                                                                                    case 70:
                                                                                                        java.lang.String string11 = bundle.getString("service_click_tid");
                                                                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubCallbackAIDLStub", "on service click, update tid = %s", string11);
                                                                                                        viewOnCreateContextMenuListenerC19337x37f3384d.f265391t2 = string11;
                                                                                                        viewOnCreateContextMenuListenerC19337x37f3384d.f265394u2 = java.lang.System.currentTimeMillis();
                                                                                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p8(this, viewOnCreateContextMenuListenerC19337x37f3384d));
                                                                                                        return true;
                                                                                                    case 71:
                                                                                                    case 72:
                                                                                                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.o8 o8Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.o8(this, viewOnCreateContextMenuListenerC19337x37f3384d, bundle);
                                                                                                        if (java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread()) {
                                                                                                            o8Var.run();
                                                                                                            return true;
                                                                                                        }
                                                                                                        ((ku5.t0) ku5.t0.f394148d).g(o8Var);
                                                                                                        return true;
                                                                                                    default:
                                                                                                        switch (i17) {
                                                                                                            case 119:
                                                                                                            case 120:
                                                                                                            case 121:
                                                                                                            case 122:
                                                                                                            case 123:
                                                                                                            case 124:
                                                                                                            case 125:
                                                                                                            case 126:
                                                                                                            case 127:
                                                                                                            case 128:
                                                                                                                break;
                                                                                                            default:
                                                                                                                switch (i17) {
                                                                                                                    case 133:
                                                                                                                    case 134:
                                                                                                                    case 135:
                                                                                                                    case 136:
                                                                                                                    case 137:
                                                                                                                    case 138:
                                                                                                                        break;
                                                                                                                    default:
                                                                                                                        switch (i17) {
                                                                                                                            case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50673x992affbf /* 142 */:
                                                                                                                            case com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50613xc9bdf6cd /* 143 */:
                                                                                                                            case 144:
                                                                                                                            case 145:
                                                                                                                                break;
                                                                                                                            default:
                                                                                                                                switch (i17) {
                                                                                                                                    case 147:
                                                                                                                                    case 148:
                                                                                                                                    case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.a2.f34600x366c91de /* 149 */:
                                                                                                                                    case 150:
                                                                                                                                    case 151:
                                                                                                                                    case 152:
                                                                                                                                    case com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5 /* 153 */:
                                                                                                                                    case 154:
                                                                                                                                    case 155:
                                                                                                                                    case 156:
                                                                                                                                        break;
                                                                                                                                    default:
                                                                                                                                        switch (i17) {
                                                                                                                                            case 161:
                                                                                                                                            case 162:
                                                                                                                                            case 163:
                                                                                                                                                break;
                                                                                                                                            default:
                                                                                                                                                switch (i17) {
                                                                                                                                                    case 254:
                                                                                                                                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.r8(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, bundle.getString("game_haowan_publish_post_id"), bundle.getInt("game_haowan_publish_retcode")));
                                                                                                                                                        return true;
                                                                                                                                                    case 255:
                                                                                                                                                        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s8(this, viewOnCreateContextMenuListenerC19337x37f3384d, nVar, bundle.getString("game_haowan_publish_post_id"), bundle.getFloat("game_haowan_publish_progress")));
                                                                                                                                                        return true;
                                                                                                                                                    case 256:
                                                                                                                                                        if (this.f268462e.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) this.f268462e.get()).L1 == null) {
                                                                                                                                                            return true;
                                                                                                                                                        }
                                                                                                                                                        java.util.Iterator it6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) this.f268462e.get()).L1.X.iterator();
                                                                                                                                                        while (it6.hasNext() && !((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.i3) it6.next()).i()) {
                                                                                                                                                        }
                                                                                                                                                        return true;
                                                                                                                                                    default:
                                                                                                                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubCallbackAIDLStub", "undefine action code!!!");
                                                                                                                                                        return true;
                                                                                                                                                }
                                                                                                                                        }
                                                                                                                                }
                                                                                                                        }
                                                                                                                }
                                                                                                        }
                                                                                                }
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                        if (viewOnCreateContextMenuListenerC19337x37f3384d.isFinishing()) {
                                                            return true;
                                                        }
                                                        viewOnCreateContextMenuListenerC19337x37f3384d.R7(i17, bundle);
                                                        return true;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void d5(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f268462e;
        if (weakReference.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing()) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).h7(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void da(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f268462e;
        if (weakReference.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing()) {
            return;
        }
        boolean booleanExtra = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).getIntent().getBooleanExtra("forceHideShare", false);
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.z8(this, booleanExtra, z17));
    }

    public final float e() {
        java.lang.ref.WeakReference weakReference = this.f268462e;
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265348f != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265348f.m81401x1f106092() : j65.f.f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void ec() {
        java.util.LinkedList linkedList;
        java.lang.ref.WeakReference weakReference = this.f268462e;
        if (weakReference.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing() || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265377p0 == null || (linkedList = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265377p0.f422424e) == null) {
            return;
        }
        linkedList.clear();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /* renamed from: getCurrentUrl */
    public java.lang.String mo70208xad58292c() {
        java.lang.ref.WeakReference weakReference = this.f268462e;
        if (weakReference.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing()) {
            return null;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).x7();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0084. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0087. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x008e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0b66  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0be0  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0bee  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0906  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.os.Bundle i(int r33, android.os.Bundle r34) {
        /*
            Method dump skipped, instructions count: 5892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7.i(int, android.os.Bundle):android.os.Bundle");
    }

    public final android.content.Intent j() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) this.f268462e.get()).getIntent();
    }

    public final int k(java.lang.String str) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) this.f268462e.get()).L1.k0(str);
    }

    public final void l(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.e eVar;
        if (bundle == null || this.f268462e.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) this.f268462e.get()).L1 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.x xVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) this.f268462e.get()).L1.Y0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.e eVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.e(i17, bundle);
        synchronized (xVar) {
            if (xVar.f265769a) {
                java.util.Iterator it = xVar.f265771c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        eVar = null;
                        break;
                    } else {
                        eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.e) it.next();
                        if (eVar.f265727a == eVar2.f265727a) {
                            break;
                        }
                    }
                }
                if (eVar != null) {
                    xVar.f265771c.remove(eVar);
                }
                xVar.f265771c.add(eVar2);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void t3(java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.lang.ref.WeakReference weakReference = this.f268462e;
        if (weakReference.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing() || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265379p2.f265470e == null || str == null || !str.equals(((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265379p2.f265470e.f367729c)) {
            return;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265379p2.f265470e != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265379p2.f265470e.b();
        }
        if (str2 == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265379p2 == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.e9(this, str2, i17, i18));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void te(int i17, android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference = this.f268462e;
        if (weakReference.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.f9(this, i17, bundle));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public boolean v3(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x8(this, i17));
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void w8(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f268462e;
        if (weakReference.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a9(this, z17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public java.lang.String za() {
        java.lang.ref.WeakReference weakReference = this.f268462e;
        if (weakReference.get() == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing()) {
            return null;
        }
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).getIntent().getStringExtra("srcUsername");
    }
}
