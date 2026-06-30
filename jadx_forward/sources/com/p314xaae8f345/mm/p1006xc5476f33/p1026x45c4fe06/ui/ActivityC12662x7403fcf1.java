package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI */
/* loaded from: classes9.dex */
public class ActivityC12662x7403fcf1 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f170932d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.t6 f170933e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.String str2;
        int i17;
        android.os.Bundle bundle2;
        boolean z17;
        super.onCreate(bundle);
        boolean z18 = false;
        overridePendingTransition(0, 0);
        com.p314xaae8f345.mm.ui.v9.e(getWindow());
        com.p314xaae8f345.mm.ui.v9.c(getWindow(), false);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        if (getIntent() == null) {
            finish();
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_dialog_touser");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            java.util.HashMap hashMap = (java.util.HashMap) getIntent().getSerializableExtra("key_dialog_params");
            boolean a17 = c01.od.a(hashMap.get("is_video"), false);
            int b17 = c01.od.b(hashMap.get("type"), 1);
            java.lang.String c17 = c01.od.c(hashMap.get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28), "");
            java.lang.String c18 = c01.od.c(hashMap.get("img_url"), null);
            if (b17 == 2 || b17 == 3) {
                int b18 = c01.od.b(hashMap.get("pkg_type"), 0);
                int b19 = c01.od.b(hashMap.get("pkg_version"), 0);
                java.lang.String c19 = c01.od.c(hashMap.get(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd), null);
                java.lang.String c27 = c01.od.c(hashMap.get("cache_key"), null);
                java.lang.String c28 = c01.od.c(hashMap.get(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714), null);
                java.lang.String c29 = c01.od.c(hashMap.get("delay_load_img_path"), null);
                java.lang.String c37 = c01.od.c(hashMap.get("nickname"), "");
                boolean a18 = c01.od.a(hashMap.get("is_dynamic"), false);
                int b27 = c01.od.b(hashMap.get("biz"), 2);
                if (ot0.o.b(b27)) {
                    java.lang.String c38 = c01.od.c(hashMap.get("tail_lang"), "");
                    str = c18;
                    java.lang.String c39 = c01.od.c(hashMap.get("icon_url"), "");
                    str2 = "pkg_version";
                    bundle2 = new android.os.Bundle();
                    i17 = b19;
                    bundle2.putInt("key_biz", b27);
                    bundle2.putString("key_footer_text_default", c37);
                    bundle2.putString("key_footer_text", ot0.o.a(b27, c38, mo55332x76847179()));
                    bundle2.putString("key_footer_icon", c39);
                } else {
                    str = c18;
                    str2 = "pkg_version";
                    i17 = b19;
                    if (a17) {
                        bundle2 = new android.os.Bundle();
                        bundle2.putBoolean("is_video", true);
                        java.lang.String c47 = c01.od.c(hashMap.get("footer_icon"), "");
                        java.lang.String c48 = c01.od.c(hashMap.get("footer_text"), "");
                        bundle2.putString("key_footer_icon", c47);
                        bundle2.putString("key_footer_text", c48);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandProcessShareMessageProxyUI", "fake native share msg biz invalidate, biz: %d.", java.lang.Integer.valueOf(b27));
                        bundle2 = null;
                    }
                }
                android.view.View wi6 = ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).wi(this, bundle2, false, null);
                java.lang.String a19 = ik1.i0.a(this);
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, c19);
                bundle3.putString("msg_id", java.lang.String.format("%d-%d", java.lang.Integer.valueOf(b18), java.lang.Integer.valueOf(i17)));
                bundle3.putInt("msg_pkg_type", b18);
                bundle3.putInt(str2, i17);
                bundle3.putString("image_url", str);
                bundle3.putBoolean("is_dynamic_page", a18);
                bundle3.putString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, c17);
                bundle3.putString("cache_key", c27);
                bundle3.putString("msg_path", c28);
                bundle3.putString("delay_load_img_path", c29);
                if (a17) {
                    java.lang.String c49 = c01.od.c(hashMap.get("video_path"), "");
                    java.lang.String c57 = c01.od.c(hashMap.get("video_thumb_path"), "");
                    z17 = true;
                    bundle3.putBoolean("is_video", true);
                    bundle3.putString("video_path", c49);
                    bundle3.putString("video_thumb_path", c57);
                } else {
                    z17 = true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w6 w6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.w6(this, this);
                w6Var.f171841h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.o6(this, a19, wi6);
                ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Ri(a19, wi6, bundle3, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p6(this, w6Var));
                this.f170933e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.t6(this);
                o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
                java.lang.String string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4x);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.q6 q6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.q6(this, w6Var);
                ((r35.k1) q1Var).getClass();
                r35.i1 i1Var = new r35.i1(this);
                i1Var.l(stringExtra);
                i1Var.c(wi6);
                i1Var.g(java.lang.Boolean.TRUE);
                i1Var.h(false);
                i1Var.f450670d = string;
                i1Var.a(q6Var);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = i1Var.f450669c;
                this.f170932d = j0Var;
                j0Var.setOnDismissListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.r6(this, a19, wi6));
                this.f170932d.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.s6(this, w6Var));
                this.f170932d.show();
            } else {
                z17 = true;
            }
            z18 = z17;
        }
        if (z18) {
            return;
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        super.mo48758x6c4bab6();
        mo2550x7c2abd06(1);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f170932d;
        if (j0Var == null || !j0Var.isShowing()) {
            return;
        }
        this.f170932d.dismiss();
        this.f170932d = null;
        this.f170933e = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: setMMOrientation */
    public void mo50393x3c0b42ee() {
        int intExtra = getIntent().getIntExtra("orientation", -1);
        if (intExtra != -1) {
            setRequestedOrientation(intExtra);
        }
    }
}
