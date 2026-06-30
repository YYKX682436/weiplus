package sx4;

/* loaded from: classes8.dex */
public class n extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x3 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sx4.q f495165e;

    public n(sx4.q qVar) {
        this.f495165e = qVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void b(android.os.Bundle bundle) {
        sx4.q qVar = this.f495165e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebView", "closeWindow");
        try {
            qVar.f495173d.removeView(qVar.f495172c);
            qVar.a();
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x3, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public android.os.Bundle i(int i17, android.os.Bundle bundle) {
        int i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebView", "game float invokeAsResult, actionCode = " + i17);
        android.os.Bundle bundle2 = new android.os.Bundle();
        int i19 = 1;
        sx4.q qVar = this.f495165e;
        if (i17 == 18) {
            sx4.s0 s0Var = qVar.f495174e;
            bundle2.putString("KPublisherId", sx4.s0.f495190a);
            sx4.s0 s0Var2 = qVar.f495174e;
            java.lang.String str = sx4.s0.f495191b;
            int i27 = sx4.s0.f495192c;
            qVar.getClass();
            if (i27 != 0) {
                i19 = i27;
            } else if (str == null || str.length() <= 0) {
                i19 = 0;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var = qVar.f495175f;
                if (v0Var != null) {
                    try {
                        if (!v0Var.wc(str)) {
                            i18 = qVar.f495175f.j8(str) ? 7 : 8;
                        }
                        i19 = i18;
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameFloatWebView", "getScene fail, ex = " + e17.getMessage());
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebView", "KGetA8KeyScene = %s", java.lang.Integer.valueOf(i19));
            bundle2.putInt("getA8KeyScene", i19);
        } else if (i17 == 37) {
            qVar.f495171b.runOnUiThread(new sx4.j(this, bundle.getString("show_kb_placeholder"), bundle.getInt("show_kb_max_length"), bundle.getInt("show_kb_show_remind_word_count")));
        } else if (i17 == 43) {
            qVar.f495171b.runOnUiThread(new sx4.l(this, bundle.getString("set_page_title_text"), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a1.c(bundle.getString("set_page_title_color"), qVar.f495171b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560120bl))));
        } else if (i17 == 79) {
            qVar.f495171b.runOnUiThread(new sx4.k(this, bundle2));
        } else if (i17 == 84) {
            java.lang.CharSequence m78518x4c0ad082 = qVar.f495171b.m78518x4c0ad082();
            bundle2.putString("webview_current_url", null);
            bundle2.putString("webview_current_title", m78518x4c0ad082 != null ? m78518x4c0ad082.toString() : "");
            bundle2.putString("webview_current_desc", "");
        } else if (i17 == 87) {
            sx4.p pVar = qVar.f495178i;
            boolean z17 = pVar.f269102v;
            java.lang.String str2 = pVar.f269103w;
            java.util.Map map = pVar.f269104x;
            if (z17) {
                bundle2.putString("result", "not_return");
            } else {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                bundle2.putString("full_url", str2 == null ? "" : str2);
                if (map == null || map.size() == 0) {
                    bundle2.putInt("set_cookie", 0);
                } else {
                    bundle2.putInt("set_cookie", 1);
                    for (java.lang.String str3 : map.keySet()) {
                        com.p314xaae8f345.p3210x3857dc.d.g().b(str2 == null ? "" : str2, str3 + "=" + ((java.lang.String) map.get(str3)));
                    }
                    com.p314xaae8f345.p3210x3857dc.d.g().mo120241x5d03b04();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = com.p314xaae8f345.p3210x3857dc.d.g().a(str2 != null ? str2 : "");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebView", "cookies:%s", objArr);
                }
            }
        } else if (i17 == 95) {
            qVar.f495184o.f495199f.c(bundle);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebView", "set game float page time data");
        } else if (i17 == 99) {
            sx4.s0 s0Var3 = qVar.f495174e;
            int i28 = sx4.s0.f495192c;
            bundle2.putInt("geta8key_scene", i28);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebView", "Key value: getA8KeyScene(%d)", java.lang.Integer.valueOf(i28));
        } else if (i17 == 101) {
            bundle.setClassLoader(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2424x304bf2.ActivityC19411xef36c7b.class.getClassLoader());
            android.content.Context context = qVar.f495170a;
            java.lang.String string = bundle.getString("open_ui_with_webview_ui_plugin_name");
            java.lang.String string2 = bundle.getString("open_ui_with_webview_ui_plugin_entry");
            android.content.Intent putExtras = new android.content.Intent().putExtras(bundle.getBundle("open_ui_with_webview_ui_extras"));
            sx4.s0 s0Var4 = qVar.f495174e;
            j45.l.j(context, string, string2, putExtras.putExtra("KPublisherId", sx4.s0.f495190a), null);
        } else if (i17 == 6001) {
            boolean z19 = bundle.getBoolean("clear_webview_cache_clear_cookie", false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebView", "includeCookie = %b", java.lang.Boolean.valueOf(z19));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE");
            intent.putExtra("tools_clean_webview_cache_ignore_cookie", z19);
            ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).getClass();
            com.p314xaae8f345.mm.p2829xfa87f9de.s0.a(intent);
        } else if (i17 == 53) {
            qVar.f495171b.runOnUiThread(new sx4.m(this, bundle));
        } else if (i17 == 54) {
            boolean z27 = bundle.getBoolean("add_shortcut_status");
            nw4.n nVar = qVar.f495176g;
            if (nVar != null) {
                nVar.B(z27);
            }
        } else if (i17 == 252) {
            qVar.f495180k.f149715o = 1;
            qVar.f495181l.f495122h = java.lang.System.currentTimeMillis();
        } else if (i17 != 253) {
            switch (i17) {
                case com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54063x6bbae3b4 /* 90001 */:
                    java.lang.String a17 = com.p314xaae8f345.p3210x3857dc.d.g().a(null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameFloatWebView", "url = %s, cookie = %s", null, a17);
                    bundle2.putString("cookie", a17);
                    bundle2.putFloat("density", i65.a.g(qVar.f495171b));
                    break;
                case 90002:
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.t7.f268429i.d(bundle.getString("traceid"), bundle.getString(dm.i4.f66875xa013b0d5));
                    break;
                default:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GameFloatWebView", "undefine action code!!!");
                    break;
            }
        } else {
            qVar.f495181l.f495123i = java.lang.System.currentTimeMillis();
        }
        return bundle2;
    }
}
