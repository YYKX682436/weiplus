package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsSelectCreateAccount */
/* loaded from: classes8.dex */
public class ActivityC17460x8b5f64b2 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f242195d;

    /* renamed from: e, reason: collision with root package name */
    public int f242196e = 0;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f242197f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f242198g = null;

    public final void V6() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 5298;
        lVar.f152199c = "/cgi-bin/micromsg-bin/precheckaffiliatedacct";
        r45.tb5 tb5Var = new r45.tb5();
        tb5Var.f467808e = this.f242198g;
        fo3.s sVar = fo3.s.INSTANCE;
        byte[] h17 = sVar.h();
        r45.k57 k57Var = new r45.k57();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(h17);
        k57Var.f459929f = cu5Var;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(sVar.L9());
        k57Var.f459933m = cu5Var2;
        r45.cu5 cu5Var3 = new r45.cu5();
        cu5Var3.d(k57Var.mo14344x5f01b1f6());
        tb5Var.f467807d = cu5Var3;
        tb5Var.f467809f = this.f242196e;
        lVar.f152197a = tb5Var;
        lVar.f152198b = new r45.ub5();
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.zl(this), false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getBottomView */
    public android.view.View mo60898x89f7f366() {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) com.p314xaae8f345.mm.ui.id.b(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ckx, (android.view.ViewGroup) null);
        linearLayout.findViewById(com.p314xaae8f345.mm.R.id.mq6).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.xl(this));
        return linearLayout;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getHeaderResourceId */
    public int mo48679xfc6e1bac() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cky;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return this.f242196e == 0 ? com.p314xaae8f345.mm.R.C30864xbddafb2a.f570986cm2 : com.p314xaae8f345.mm.R.C30864xbddafb2a.f570985cm1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.os.Bundle bundleExtra;
        super.onActivityResult(i17, i18, intent);
        if (i17 == 702) {
            if (intent != null) {
                java.util.Map map = (java.util.Map) intent.getBundleExtra("result_data").getSerializable("next_params");
                if (map != null) {
                    this.f242197f = (java.lang.String) map.get("ticket");
                }
                if (this.f242197f != null) {
                    c71.b.c(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.gbc, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), u11.b.d("CN"), "reg", 1, 0), 703, false);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23530, this.f242198g, wo.w0.k(), 0, 1, 1002, 0, null, java.lang.Integer.valueOf(this.f242196e));
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f242195d;
            if (u3Var == null || !u3Var.isShowing()) {
                return;
            }
            this.f242195d.dismiss();
            return;
        }
        if (i17 != 703) {
            if (i17 == 704) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f242195d;
                if (u3Var2 != null && u3Var2.isShowing()) {
                    this.f242195d.dismiss();
                }
                setResult(i18, intent);
                finish();
                return;
            }
            return;
        }
        if (intent != null && (bundleExtra = intent.getBundleExtra("result_data")) != null && bundleExtra.getString("go_next", "").equals("agree_privacy")) {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11459xde004648.class);
            intent2.putExtra("RegTicket", this.f242197f);
            intent2.putExtra("sessionID", this.f242198g);
            intent2.putExtra("RegScene", this.f242196e);
            startActivityForResult(intent2, 704);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var3 = this.f242195d;
        if (u3Var3 == null || !u3Var3.isShowing()) {
            return;
        }
        this.f242195d.dismiss();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f242196e = getIntent().getIntExtra("RegScene", 0);
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        if (m79335xcc101dd9() != null) {
            int dimensionPixelSize = mo55332x76847179().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            m79335xcc101dd9().setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            m79335xcc101dd9().setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        }
        java.lang.String str = java.lang.System.currentTimeMillis() + "";
        this.f242198g = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23530, str, wo.w0.k(), 0, 1, 1001, 0, null, java.lang.Integer.valueOf(this.f242196e));
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.yl(this));
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21574x28121786) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("register_by_phone")).I = true;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21574x28121786 c21574x28121786 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21574x28121786) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("register_by_weixin");
        c21574x28121786.I = true;
        if (this.f242196e == 0) {
            c21574x28121786.H(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ixk, c01.z1.l()));
        } else {
            c21574x28121786.H(getString(com.p314xaae8f345.mm.R.C30867xcad56011.ixj, c01.z1.l()));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str = c21560x1fce98fb.f279313q;
        if ("register_by_phone".equals(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(23530, this.f242198g, wo.w0.k(), 0, 2, 1001, 10101, null, java.lang.Integer.valueOf(this.f242196e));
            setResult(1);
            finish();
        } else if ("register_by_weixin".equals(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[8];
            objArr[0] = this.f242198g;
            objArr[1] = wo.w0.k();
            objArr[2] = 0;
            objArr[3] = 2;
            objArr[4] = 1001;
            objArr[5] = java.lang.Integer.valueOf(this.f242196e == 0 ? 10102 : 10104);
            objArr[6] = null;
            objArr[7] = java.lang.Integer.valueOf(this.f242196e);
            g0Var.d(23530, objArr);
            try {
                this.f242195d = db5.e1.Q(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, null);
                V6();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SettingsSelectCreateAccount", e17, null, new java.lang.Object[0]);
            }
        }
        return false;
    }
}
