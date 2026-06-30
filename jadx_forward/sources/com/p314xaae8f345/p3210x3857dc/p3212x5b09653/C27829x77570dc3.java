package com.p314xaae8f345.p3210x3857dc.p3212x5b09653;

/* renamed from: com.tencent.xweb.debug.FragmentPlugin */
/* loaded from: classes13.dex */
public class C27829x77570dc3 extends p012xc85e97e9.p100xa8fcbcdb.AbstractC1149x21d497cd implements p012xc85e97e9.p100xa8fcbcdb.o {

    /* renamed from: p, reason: collision with root package name */
    public final qx5.l f301784p;

    /* renamed from: q, reason: collision with root package name */
    public final qx5.f f301785q = new qx5.f();

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f301786r = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f301787s = com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61207x493967e4;

    public C27829x77570dc3(qx5.l lVar) {
        this.f301784p = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractC1149x21d497cd, p012xc85e97e9.p100xa8fcbcdb.b0
    public boolean H(p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb c1146x1fce98fb) {
        java.lang.String str = c1146x1fce98fb.f93291r;
        by5.c4.f("FragmentPlugin", "onPreferenceTreeClick, key:" + str);
        boolean z17 = c1146x1fce98fb instanceof com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27832x81f55412;
        qx5.l lVar = this.f301784p;
        if (z17 || (c1146x1fce98fb instanceof com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27833xd0a7f126)) {
            qx5.m mVar = (qx5.m) c1146x1fce98fb;
            qx5.a b17 = mVar.b(lVar);
            by5.c4.f("FragmentPlugin", "onPreferenceTreeClick, debugKey:" + mVar.h() + ", commandResult:" + b17);
            if (lVar != null) {
                lVar.e(mo7438x76847179(), b17);
            }
            return true;
        }
        boolean equals = "switch_plugin_config_url".equals(str);
        qx5.f fVar = this.f301785q;
        if (equals) {
            android.content.Context mo7438x76847179 = mo7438x76847179();
            if (android.text.TextUtils.isEmpty(by5.e4.e())) {
                if (by5.e4.h("https://dldir1v6.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig_test.xml")) {
                    by5.c4.f("FragmentPlugin", "switchPluginConfigUrl, set default test url success");
                    c1146x1fce98fb.H("当前使用默认测试版");
                }
                r3 = false;
            } else {
                if (by5.e4.h("")) {
                    by5.c4.f("FragmentPlugin", "switchPluginConfigUrl, clear test url success");
                    c1146x1fce98fb.H("当前使用正式版");
                }
                r3 = false;
            }
            fVar.a(mo7438x76847179, lVar, r3);
            return r3;
        }
        if ("use_office_reader_force_yes".equals(str)) {
            if (android.text.TextUtils.isEmpty(this.f301786r)) {
                fVar.a(mo7438x76847179(), lVar, false);
                return false;
            }
            android.content.Context mo7438x768471792 = mo7438x76847179();
            boolean c17 = qx5.u.c(this.f301786r, com.p314xaae8f345.p3210x3857dc.m.yes);
            fVar.a(mo7438x768471792, lVar, c17);
            return c17;
        }
        if ("use_office_reader_force_no".equals(str)) {
            if (android.text.TextUtils.isEmpty(this.f301786r)) {
                fVar.a(mo7438x76847179(), lVar, false);
                return false;
            }
            android.content.Context mo7438x768471793 = mo7438x76847179();
            boolean c18 = qx5.u.c(this.f301786r, com.p314xaae8f345.p3210x3857dc.m.no);
            fVar.a(mo7438x768471793, lVar, c18);
            return c18;
        }
        if ("use_office_reader_force_none".equals(str)) {
            if (android.text.TextUtils.isEmpty(this.f301786r)) {
                fVar.a(mo7438x76847179(), lVar, false);
                return false;
            }
            android.content.Context mo7438x768471794 = mo7438x76847179();
            boolean c19 = qx5.u.c(this.f301786r, com.p314xaae8f345.p3210x3857dc.m.none);
            fVar.a(mo7438x768471794, lVar, c19);
            return c19;
        }
        if ("update_plugin".equals(str)) {
            if (android.text.TextUtils.isEmpty(this.f301787s)) {
                fVar.a(mo7438x76847179(), lVar, false);
                return false;
            }
            android.content.Context mo7438x768471795 = mo7438x76847179();
            boolean b18 = qx5.u.b(mo7438x76847179(), this.f301787s, "1", lVar != null);
            fVar.a(mo7438x768471795, lVar, b18);
            return b18;
        }
        if ("clear_plugin".equals(str)) {
            if (android.text.TextUtils.isEmpty(this.f301787s)) {
                fVar.a(mo7438x76847179(), lVar, false);
                return false;
            }
            android.content.Context mo7438x768471796 = mo7438x76847179();
            cy5.h d17 = cy5.m.d(this.f301787s);
            if (d17 != null) {
                int f17 = d17.f(true);
                if (f17 >= 0) {
                    java.lang.String o17 = d17.o(f17);
                    d17.u(-1, true);
                    if (o17 != null && !o17.isEmpty()) {
                        r3 = by5.u.h(o17);
                    }
                }
                fVar.a(mo7438x768471796, lVar, r3);
                return r3;
            }
            r3 = false;
            fVar.a(mo7438x768471796, lVar, r3);
            return r3;
        }
        if ("install_plugin_32".equals(str)) {
            if (android.text.TextUtils.isEmpty(this.f301787s)) {
                fVar.a(mo7438x76847179(), lVar, false);
                return false;
            }
            android.content.Context mo7438x768471797 = mo7438x76847179();
            boolean f18 = qx5.u.f(mo7438x76847179(), this.f301787s, false, false, null);
            fVar.a(mo7438x768471797, lVar, f18);
            return f18;
        }
        if (!"install_plugin_64".equals(str)) {
            if ("show_file_reader_info".equals(str)) {
                new android.app.AlertDialog.Builder(mo7438x76847179()).setTitle("File Reader Type").setMessage(qx5.u.e()).setPositiveButton("复制到剪贴板", new qx5.i(this)).setNegativeButton("取消", (android.content.DialogInterface.OnClickListener) null).show();
            }
            if (c1146x1fce98fb.f93293t != null) {
                mo7430x19263085();
            }
            return false;
        }
        if (android.text.TextUtils.isEmpty(this.f301787s)) {
            fVar.a(mo7438x76847179(), lVar, false);
            return false;
        }
        android.content.Context mo7438x768471798 = mo7438x76847179();
        boolean f19 = qx5.u.f(mo7438x76847179(), this.f301787s, false, true, null);
        fVar.a(mo7438x768471798, lVar, f19);
        return f19;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012xc85e97e9.p100xa8fcbcdb.o
    public boolean h0(p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb c1146x1fce98fb, java.lang.Object obj) {
        java.lang.String str = c1146x1fce98fb.f93291r;
        by5.c4.f("FragmentPlugin", "onPreferenceChange, key:" + str + ", newValue:" + obj);
        if (!(c1146x1fce98fb instanceof com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27830x4e7b5ac9) && !(c1146x1fce98fb instanceof com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27831x1967bfd0)) {
            if ("office_reader_format".equals(str)) {
                java.lang.String valueOf = java.lang.String.valueOf(obj);
                this.f301786r = valueOf;
                c1146x1fce98fb.H(valueOf);
                return false;
            }
            if (!"plugin_name".equals(str)) {
                return false;
            }
            java.lang.String valueOf2 = java.lang.String.valueOf(obj);
            this.f301787s = valueOf2;
            c1146x1fce98fb.H(valueOf2);
            return false;
        }
        qx5.m mVar = (qx5.m) c1146x1fce98fb;
        qx5.l lVar = this.f301784p;
        qx5.a a17 = mVar.a(lVar, obj);
        by5.c4.f("FragmentPlugin", "onPreferenceChange, debugKey:" + mVar.h() + ", commandResult:" + a17);
        if (lVar != null) {
            lVar.e(mo7438x76847179(), a17);
        }
        n0();
        return true;
    }

    @Override // p012xc85e97e9.p100xa8fcbcdb.AbstractC1149x21d497cd
    public void l0(android.os.Bundle bundle, java.lang.String str) {
        android.content.SharedPreferences sharedPreferences;
        m0(com.p314xaae8f345.p3222x9cba06de.R.xml.f61421x37659a3b, str);
        p012xc85e97e9.p100xa8fcbcdb.C1151xb1835d47 c1151xb1835d47 = this.f93308d.f93333g;
        this.f301785q.b(c1151xb1835d47, this);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreatePreferences, SharedPreferences:");
        if (c1151xb1835d47.f93281e != null) {
            c1151xb1835d47.k();
            sharedPreferences = c1151xb1835d47.f93281e.b();
        } else {
            sharedPreferences = null;
        }
        sb6.append(sharedPreferences);
        by5.c4.g("FragmentPlugin", sb6.toString());
        c1151xb1835d47.k();
        by5.c4.g("FragmentPlugin", "onCreatePreferences, PreferenceDataStore:null");
        n0();
    }

    public final void n0() {
        p012xc85e97e9.p100xa8fcbcdb.C1154xb544bb1 c1154xb544bb1 = (p012xc85e97e9.p100xa8fcbcdb.C1154xb544bb1) j0("disable_file_reader_cache");
        if (c1154xb544bb1 != null) {
            com.p314xaae8f345.p3210x3857dc.u0 u0Var = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
            android.content.SharedPreferences e17 = by5.d4.e();
            c1154xb544bb1.M(e17 == null ? false : e17.getBoolean("fr_disable_cache", false));
        }
        p012xc85e97e9.p100xa8fcbcdb.C1154xb544bb1 c1154xb544bb12 = (p012xc85e97e9.p100xa8fcbcdb.C1154xb544bb1) j0("disable_file_reader_crash_detect");
        if (c1154xb544bb12 != null) {
            com.p314xaae8f345.p3210x3857dc.u0 u0Var2 = com.p314xaae8f345.p3210x3857dc.t0.f302127a;
            android.content.SharedPreferences e18 = by5.d4.e();
            c1154xb544bb12.M(e18 != null ? e18.getBoolean("fr_disable_crash_detect", false) : false);
        }
        p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb j07 = j0("switch_plugin_config_url");
        if (j07 != null) {
            java.lang.String e19 = by5.e4.e();
            if (android.text.TextUtils.isEmpty(e19)) {
                j07.H("当前使用正式版");
            } else if (e19.equalsIgnoreCase("https://dldir1v6.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig_test.xml")) {
                j07.H("当前使用默认测试版");
            } else {
                j07.H("当前使用自定义测试版");
            }
        }
        p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb j08 = j0("set_plugin_config_url");
        if (j08 != null) {
            java.lang.String e27 = by5.e4.e();
            if (android.text.TextUtils.isEmpty(e27)) {
                j08.H("");
            } else {
                j08.H(e27);
            }
        }
    }
}
