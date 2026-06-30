package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
final class z4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {

    /* renamed from: d, reason: collision with root package name */
    private com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12167xc1abb645 f163701d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12167xc1abb645();

    /* renamed from: e, reason: collision with root package name */
    private com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12166x73aec967 f163702e;

    /* renamed from: f, reason: collision with root package name */
    private java.lang.String f163703f;

    /* renamed from: g, reason: collision with root package name */
    private com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f163704g;

    /* renamed from: h, reason: collision with root package name */
    private android.content.DialogInterface.OnCancelListener f163705h;

    private z4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55 i(java.lang.String str, boolean z17) {
        gp.d dVar;
        int P;
        int P2;
        if (z17) {
            try {
                str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t7.e(str);
            } catch (java.lang.Exception e17) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseVideo", "addVideoItem, remux failed, exp = %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            }
        }
        try {
            dVar = new gp.d();
            dVar.setDataSource(str);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseVideo", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", e18);
            dVar = null;
        }
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseVideo", "addVideoItem, null meta data");
            return null;
        }
        int P3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(24), 0);
        if (P3 == 90 || P3 == 270) {
            P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(19), 0);
            P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(18), 0);
        } else {
            P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(18), 0);
            P2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(19), 0);
        }
        int P4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(9), 0);
        try {
            dVar.release();
        } catch (java.io.IOException unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55 c11696x173f8d55 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.c(this.f163702e.f163198d, str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11696x173f8d55.class, "mp4", false);
        if (c11696x173f8d55 == null) {
            return null;
        }
        c11696x173f8d55.f157645n = (P4 + 500) / 1000;
        c11696x173f8d55.f157647p = P;
        c11696x173f8d55.f157648q = P2;
        c11696x173f8d55.f157646o = com.p314xaae8f345.mm.vfs.w6.k(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseVideo", "addVideoItem, return %s", c11696x173f8d55);
        return c11696x173f8d55;
    }

    private static int j(java.lang.String str) {
        int i17;
        boolean a17 = d61.c.a(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseVideo", "checkRemux, isMp4 = %b", java.lang.Boolean.valueOf(a17));
        if (a17) {
            i17 = ((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10236xe35aebcb(str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.q1.f33748x366c91de, 500, 26214400, 300000.0d, 1000000);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseVideo", "checkRemux, ret = %d", java.lang.Integer.valueOf(i17));
        } else {
            i17 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55644xa67f77f6;
        }
        if (i17 == -1 || !a17) {
            long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseVideo", "fileLength = %d", java.lang.Long.valueOf(k17));
            i17 = k17 > 26214400 ? -1 : 1;
        }
        switch (i17) {
            case -6:
            case -5:
            case -4:
            case -3:
            case -2:
            case -1:
                return -50002;
            case 0:
                return -50006;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 1;
            default:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseVideo", "unknown check type");
                return -50001;
        }
    }

    private void k() {
        m50421x3c6fed6a().m78545xde66c1f2(this);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_send_raw_image", false);
        intent.putExtra("query_media_type", 2);
        intent.putExtra("GalleryUI_SkipVideoSizeLimit", true);
        intent.putExtra("gallery_report_tag", 16);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12166x73aec967 c12166x73aec967 = this.f163702e;
        boolean z17 = c12166x73aec967.f163200f;
        if (z17 && c12166x73aec967.f163201g) {
            this.f163703f = com.p314xaae8f345.mm.vfs.w6.i(lp0.b.m() + "microMsg." + java.lang.System.currentTimeMillis() + ".mp4", false);
            intent.putExtra("record_video_force_sys_camera", true);
            intent.putExtra("record_video_quality", 1);
            intent.putExtra("record_video_time_limit", this.f163702e.f163199e);
            intent.putExtra("video_full_path", this.f163703f);
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).wi(m50421x3c6fed6a(), 4, 1, 7, intent);
            return;
        }
        if (!z17) {
            if (!c12166x73aec967.f163201g) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12167xc1abb645 c12167xc1abb645 = this.f163701d;
                c12167xc1abb645.f163203d = -2;
                m50420x7b736e5c(c12167xc1abb645);
                return;
            } else {
                intent.putExtra("show_header_view", false);
                ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).wi(m50421x3c6fed6a(), 4, 1, 16, intent);
                return;
            }
        }
        this.f163703f = com.p314xaae8f345.mm.vfs.w6.i(lp0.b.m() + "microMsg." + java.lang.System.currentTimeMillis() + ".mp4", false);
        int i17 = this.f163702e.f163199e;
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
        java.lang.String str = this.f163703f;
        ((ub0.r) oVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.i(m50421x3c6fed6a, str, 5, i17, 0, 1, false);
    }

    private boolean l() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w(m50421x3c6fed6a()) > 200;
    }

    private static java.lang.String m(java.lang.String str) {
        if (j(str) != -50006) {
            return str;
        }
        int[] iArr = new int[2];
        ((vf0.l1) ((wf0.g1) i95.n0.c(wf0.g1.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.c3.d(str, iArr, 640, 480);
        int i17 = iArr[0];
        int i18 = iArr[1];
        java.lang.String str2 = lp0.b.m() + "microMsg." + java.lang.System.currentTimeMillis() + ".mp4";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseVideo", "remuxIfNeed [%s] to [%s], result %d, resolution:[%d, %d]", str, str2, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p764x685d99d.api.InterfaceC10689xe9fde544.class)).mo10233xcf34d77e(str, str2, i17, i18, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243941c, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243940b, 8, 2, 25.0f, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.d.f243942d, null, 0, false, 0, 51)), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        return str2;
    }

    private void n() {
        this.f163705h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w4(this);
        this.f163704g = db5.e1.Q(m50421x3c6fed6a(), m50423x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), m50423x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571614kd), true, true, this.f163705h);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12166x73aec967 c12166x73aec967 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12166x73aec967) abstractC11887x3610e10c;
        this.f163702e = c12166x73aec967;
        c12166x73aec967.f163199e = java.lang.Math.min(java.lang.Math.max(c12166x73aec967.f163199e, 60), 0);
        if (!l()) {
            db5.t7.m123883x26a183b(m50421x3c6fed6a(), m50423x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571614kd), 1).show();
        }
        k();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v, com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12167xc1abb645 c12167xc1abb645 = this.f163701d;
            c12167xc1abb645.f163203d = 0;
            m50420x7b736e5c(c12167xc1abb645);
            return;
        }
        if (-1 != i18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12167xc1abb645 c12167xc1abb6452 = this.f163701d;
            c12167xc1abb6452.f163203d = -2;
            m50420x7b736e5c(c12167xc1abb6452);
            return;
        }
        if (i17 == 4) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(stringArrayListExtra)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12167xc1abb645 c12167xc1abb6453 = this.f163701d;
                c12167xc1abb6453.f163203d = -2;
                m50420x7b736e5c(c12167xc1abb6453);
                return;
            } else {
                java.lang.String i19 = com.p314xaae8f345.mm.vfs.w6.i(stringArrayListExtra.get(0), false);
                n();
                java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.f172083a;
                ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y4(this, i19));
                return;
            }
        }
        if (i17 != 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12167xc1abb645 c12167xc1abb6454 = this.f163701d;
            c12167xc1abb6454.f163203d = -2;
            m50420x7b736e5c(c12167xc1abb6454);
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f163703f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12167xc1abb645 c12167xc1abb6455 = this.f163701d;
            c12167xc1abb6455.f163203d = -2;
            m50420x7b736e5c(c12167xc1abb6455);
        } else {
            n();
            java.util.Set set2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.f172083a;
            ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.x4(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: onProcessInterrupted */
    public void mo50427x5b335c92() {
        super.mo50427x5b335c92();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f163704g;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f163704g = null;
        }
    }
}
