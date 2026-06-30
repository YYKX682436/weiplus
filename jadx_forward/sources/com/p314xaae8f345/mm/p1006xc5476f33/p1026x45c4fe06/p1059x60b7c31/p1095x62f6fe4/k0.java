package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
public final class k0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t0 f163421a;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t0 t0Var) {
        this.f163421a = t0Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd63 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63) obj;
        km5.b c17 = km5.u.c();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_appbrand_use_mmrecordui, true);
        boolean z17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Media_AppbrandUseMMrecord_Int, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.ChooseMediaWorkFlow", "useMMRecordUI %b localConfigEnable:%b", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.x.f163657a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.t0 t0Var = this.f163421a;
        if (!fj6 && !z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(t0Var.f163593a.getF229340d(), "com.tencent.mm.plugin.mmsight.ui.SightCaptureUI");
            intent.putExtra("KEY_SIGHT_PARAMS", c16528xd9aafd63);
            android.app.Activity a17 = q75.a.a(t0Var.f163593a.getF229340d());
            if (a17 != null) {
                nf.g.a(a17).j(intent, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.j0(c17));
                a17.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, -1);
                return xVar;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:goSightCaptureUI context !is activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y("fail:internal error invalid android context");
            c17.c(yVar);
            return yVar;
        }
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = c16528xd9aafd63.f230352f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.f(c11120x15dce88d, c11120x15dce88d.f152728h * 1000, 9);
        f17.f237215t = java.lang.Boolean.TRUE;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        f17.f237214s = bool;
        f17.f237217v = bool;
        f17.f237220y = true;
        android.os.Bundle bundle = f17.M;
        bundle.putBoolean("key_show_top_countdown_cover", c16528xd9aafd63.f230362s);
        bundle.putBoolean("key_hide_operation", true);
        bundle.putInt("key_sub_scene", 1);
        bundle.putInt("key_camera_select", c16528xd9aafd63.f230351e);
        bundle.putInt("key_record_bitrate_ratio", 1);
        hp.b bVar = new hp.b();
        bVar.a(true);
        bVar.f(true);
        bVar.d(true);
        bVar.h(true);
        bVar.e(true);
        bVar.c(true);
        f17.f237210o = bVar.f364437a;
        f17.a(2, "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout");
        ((pc0.i) ((vb0.n) i95.n0.c(vb0.n.class))).getClass();
        f17.a(0, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17006x5840abd4.class.getName());
        android.app.Activity a18 = q75.a.a(t0Var.f163593a.getF229340d());
        if (a18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:goSightCaptureUI context !is activity");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y yVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y("fail:internal error invalid android context");
            c17.c(yVar2);
            return yVar2;
        }
        if (a18 instanceof p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i0(a18, f17, c17, null), 3, null);
            return xVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ChooseMediaWorkFlow", "step:goSightCaptureUI context !is activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y yVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y("fail:internal error invalid android context");
        c17.c(yVar3);
        return yVar3;
    }
}
