package ee4;

/* loaded from: classes4.dex */
public final class v extends ee4.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ce4.b pcContext) {
        super(pcContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcContext, "pcContext");
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCapturePc");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCapturePc");
        return "SnsPublish.PicCapturePc";
    }

    public final void p() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCapturePc");
        int f17 = 9 - m().v().f();
        if (f17 <= 0) {
            e("has select the max image count");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCapturePc");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd63 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63(2, 0);
        java.lang.String k17 = ai3.d.k(t21.o2.Bi().Ai());
        java.lang.String m17 = ai3.d.m(k17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.h.f246389a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m17);
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d videoParams = c16528xd9aafd63.f230352f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(videoParams, "videoParams");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 b17 = hVar.b(k17, m17, videoParams, c16528xd9aafd63.f230352f.f152728h * 1000, 49);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_ignore_remux_without_edit, false)) {
            b17.f237202d = 2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd();
        c16995x8ab634cd.f237223d = 7;
        b17.I = c16995x8ab634cd;
        long c17 = c01.id.c();
        if (f17 < 9) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13822, 1, 2, ca4.z0.l(), java.lang.Long.valueOf(c17));
            b17.f237215t = java.lang.Boolean.FALSE;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13822, 1, 2, ca4.z0.l(), java.lang.Long.valueOf(c17));
        }
        p3325xe03a0797.p3326xc267989b.l.d(o().q(), null, null, new ee4.u(this, b17, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCapturePc");
    }

    public final void q(java.lang.Object o17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCapturePc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o17, "o");
        if (o17 instanceof qc0.m1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMediaOptResult: resultCode=");
            qc0.m1 m1Var = (qc0.m1) o17;
            int i17 = m1Var.f442944b;
            sb6.append(i17);
            sb6.append(", optCode=");
            int i18 = m1Var.f442945c;
            sb6.append(i18);
            f(sb6.toString());
            if (i17 == -1 && i18 == 0) {
                qc0.l1 a17 = m1Var.a();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g6 g6Var = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.g6.f245743a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                java.lang.String str = a17.f442929b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                android.os.Bundle bundle = m1Var.f442947e;
                g6Var.c(str, bundle, "key_edit_safe_strategy_emotion_info_list");
                if (!a17.a()) {
                    r45.vh4 vh4Var = new r45.vh4();
                    vh4Var.f469768e = true;
                    vh4Var.f469767d = false;
                    java.lang.String str2 = a17.f442929b;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886 c16527xe4fc886 = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16527xe4fc886(true, str2, a17.f442930c, com.p314xaae8f345.mm.vfs.w6.q(str2), by5.x.c(str2), (int) (a17.f442931d / 1000), vh4Var);
                    c().getIntent().putExtra("key_extra_data", bundle);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18133x39856dcd) c()).p7(c16527xe4fc886);
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_clear_sns_tmp_file, true)) {
                        dw3.c0.f325715a.w(str);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.p2225x45d52d5.p2226x2eefaa.AbstractC18435x78de886c c17 = m().v().c(str, 0, true);
                    ee4.b1 m17 = m();
                    java.util.List k17 = kz5.c0.k(c17);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addPreviewPublishPicItem$default", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                    m17.r(k17, true, false, false);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addPreviewPublishPicItem$default", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCapturePc");
                    return;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCapturePc");
    }
}
