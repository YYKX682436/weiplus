package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
final class d3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {

    /* renamed from: d, reason: collision with root package name */
    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12160x62e35647 f163292d;

    /* renamed from: g, reason: collision with root package name */
    int f163295g;

    /* renamed from: h, reason: collision with root package name */
    boolean f163296h;

    /* renamed from: i, reason: collision with root package name */
    boolean f163297i;

    /* renamed from: m, reason: collision with root package name */
    double f163298m;

    /* renamed from: n, reason: collision with root package name */
    double f163299n;

    /* renamed from: o, reason: collision with root package name */
    java.lang.String f163300o;

    /* renamed from: r, reason: collision with root package name */
    private com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f163303r;

    /* renamed from: s, reason: collision with root package name */
    private android.content.DialogInterface.OnCancelListener f163304s;

    /* renamed from: e, reason: collision with root package name */
    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12161x45420d65 f163293e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12161x45420d65();

    /* renamed from: f, reason: collision with root package name */
    final int f163294f = hashCode() % 10000;

    /* renamed from: p, reason: collision with root package name */
    private boolean f163301p = true;

    /* renamed from: q, reason: collision with root package name */
    private java.util.HashSet<java.lang.Integer> f163302q = new java.util.HashSet<>();

    private d3() {
    }

    private void j() {
        m50421x3c6fed6a().m78545xde66c1f2(this);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_send_raw_image", !this.f163292d.f163162h);
        intent.putExtra("key_force_show_raw_image_button", this.f163292d.f163163i);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12160x62e35647 c12160x62e35647 = this.f163292d;
        intent.putExtra("key_is_raw_image_button_disable", c12160x62e35647.f163163i && !c12160x62e35647.f163162h);
        intent.putExtra("query_media_type", 1);
        intent.putExtra("key_force_hide_edit_image_button_after_album_take_image", true);
        intent.putExtra("album_business_tag", "album_business_bubble_media_by_jsapi_chooseimage");
        intent.putExtra("gallery_report_tag", 16);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12160x62e35647 c12160x62e356472 = this.f163292d;
        boolean z17 = c12160x62e356472.f163160f;
        if (z17 && c12160x62e356472.f163161g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseImage", "illegal scene, ignore this request");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12161x45420d65 c12161x45420d65 = this.f163293e;
            c12161x45420d65.f163165d = -2;
            m50420x7b736e5c(c12161x45420d65);
            return;
        }
        if (c12160x62e356472.f163161g) {
            intent.putExtra("show_header_view", false);
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
            int i17 = this.f163292d.f163159e;
            int i18 = this.f163295g;
            ((ub0.r) oVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.e(m50421x3c6fed6a, 1, i17, i18, intent);
            return;
        }
        if (z17) {
            n();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseImage", "unknown scene, ignore this request");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12161x45420d65 c12161x45420d652 = this.f163293e;
        c12161x45420d652.f163165d = -2;
        m50420x7b736e5c(c12161x45420d652);
    }

    private boolean k() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w(m50421x3c6fed6a()) > 200;
    }

    private void l(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiChooseImage", "take photo, but result is null");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12161x45420d65 c12161x45420d65 = this.f163293e;
            c12161x45420d65.f163165d = -2;
            m50420x7b736e5c(c12161x45420d65);
            return;
        }
        if (m50421x3c6fed6a() != null && m50421x3c6fed6a().getWindow() != null) {
            m50421x3c6fed6a().getWindow().getDecorView().setBackgroundColor(-16777216);
        }
        ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c3(this, str));
    }

    private void m(int i17) {
        this.f163304s = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y2(this);
        this.f163303r = db5.e1.Q(m50421x3c6fed6a(), m50423x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), m50423x2fec8307(i17), true, true, this.f163304s);
    }

    private void n() {
        ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.x2(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12160x62e35647 c12160x62e35647 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12160x62e35647) abstractC11887x3610e10c;
        this.f163292d = c12160x62e35647;
        c12160x62e35647.f163164m = true;
        c12160x62e35647.f163159e = java.lang.Math.max(1, java.lang.Math.min(9, c12160x62e35647.f163159e));
        this.f163295g = 16;
        if (!k()) {
            db5.t7.m123883x26a183b(m50421x3c6fed6a(), m50423x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571612kb), 1).show();
        }
        j();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v, com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        if (this.f163302q.contains(java.lang.Integer.valueOf(i17))) {
            return;
        }
        if (i18 == 0) {
            if ((i17 == 1 || i17 == 3) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f163300o)) {
                com.p314xaae8f345.mm.vfs.w6.h(this.f163300o);
                this.f163300o = null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12161x45420d65 c12161x45420d65 = this.f163293e;
            c12161x45420d65.f163165d = 0;
            m50420x7b736e5c(c12161x45420d65);
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    if (i17 != 4) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12161x45420d65 c12161x45420d652 = this.f163293e;
                        c12161x45420d652.f163165d = -2;
                        m50420x7b736e5c(c12161x45420d652);
                        return;
                    }
                }
            }
            if (intent == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12161x45420d65 c12161x45420d653 = this.f163293e;
                c12161x45420d653.f163165d = 0;
                m50420x7b736e5c(c12161x45420d653);
                return;
            }
            if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886 c16527xe4fc886 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886) intent.getParcelableExtra("key_req_result");
                if (c16527xe4fc886 == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12161x45420d65 c12161x45420d654 = this.f163293e;
                    c12161x45420d654.f163165d = 0;
                    m50420x7b736e5c(c12161x45420d654);
                    return;
                }
                stringExtra = c16527xe4fc886.f230348p;
            } else if (intent.getIntExtra("key_new_sight_media_opt_code", -1) != 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12161x45420d65 c12161x45420d655 = this.f163293e;
                c12161x45420d655.f163165d = 0;
                m50420x7b736e5c(c12161x45420d655);
                return;
            } else {
                stringExtra = intent.getStringExtra("key_new_sight_image_path");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseImage", "choose from new sight, but path is null");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12161x45420d65 c12161x45420d656 = this.f163293e;
                    c12161x45420d656.f163165d = 0;
                    m50420x7b736e5c(c12161x45420d656);
                    return;
                }
            }
            this.f163300o = stringExtra;
            l(stringExtra);
            return;
        }
        if (intent == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12161x45420d65 c12161x45420d657 = this.f163293e;
            c12161x45420d657.f163165d = 0;
            m50420x7b736e5c(c12161x45420d657);
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("CropImage_OutputPath_List");
        boolean booleanExtra = intent.getBooleanExtra("CropImage_Compress_Img", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12160x62e35647 c12160x62e35647 = this.f163292d;
        boolean z17 = c12160x62e35647.f163162h;
        boolean z18 = c12160x62e35647.f163163i;
        boolean z19 = ((z18 ^ true) && z17) || (booleanExtra && (z18 & z17));
        boolean z27 = intent.getBooleanExtra("isTakePhoto", false) || intent.getBooleanExtra("isPreviewPhoto", false);
        boolean z28 = this.f163292d.f163162h;
        boolean z29 = this.f163292d.f163163i;
        if (z19) {
            m(com.p314xaae8f345.mm.R.C30867xcad56011.f571613kc);
        }
        boolean z37 = !z19 && com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p7.f(stringArrayListExtra);
        if (z37) {
            m(com.p314xaae8f345.mm.R.C30867xcad56011.f571711n3);
        }
        ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a3(this, stringArrayListExtra, z27, z19, z37));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: onProcessInterrupted */
    public void mo50427x5b335c92() {
        super.mo50427x5b335c92();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f163303r;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f163303r = null;
        }
        this.f163302q.clear();
    }
}
