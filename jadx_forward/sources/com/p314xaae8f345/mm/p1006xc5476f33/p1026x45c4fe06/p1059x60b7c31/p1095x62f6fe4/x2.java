package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
public class x2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d3 f163659d;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d3 d3Var) {
        this.f163659d = d3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a2;
        java.lang.Object b17 = com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12157x3cff1a94.TaskParams(2, 0, false), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.C12157x3cff1a94.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "invokeSync(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63 c16528xd9aafd63 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.C16528xd9aafd63) b17;
        c16528xd9aafd63.f230361r = false;
        c16528xd9aafd63.f230359p = false;
        c16528xd9aafd63.f230356m = lp0.b.K();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_appbrand_use_mmrecordui, true);
        boolean z17 = bm5.o1.f104252a.g(bm5.h0.RepairerConfig_Media_AppbrandUseMMrecord_Int, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseImage", "useMMRecordUI %b localConfigEnable:%b", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d3 d3Var = this.f163659d;
        if (!fj6 && !z17) {
            android.content.Intent intent = new android.content.Intent();
            m50421x3c6fed6a2 = d3Var.m50421x3c6fed6a();
            intent.setClassName(m50421x3c6fed6a2, "com.tencent.mm.plugin.mmsight.ui.SightCaptureUI");
            intent.putExtra("KEY_SIGHT_PARAMS", c16528xd9aafd63);
            d3Var.m50433x5dc77fb5(intent, 2);
            return;
        }
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = c16528xd9aafd63.f230352f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624.f(c11120x15dce88d, c11120x15dce88d.f152728h * 1000, 9);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        f17.f237215t = bool;
        f17.f237217v = bool;
        f17.f237220y = true;
        com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468 c10402x5bc41468 = new com.p314xaae8f345.mm.p665xac8f1cfd.api.p666xbb85ad5b.C10402x5bc41468((hp.a) null);
        java.util.Map map = c10402x5bc41468.f146312h;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.util.HashMap hashMap = (java.util.HashMap) map;
        hashMap.put("plugin_filter", bool2);
        hashMap.put("plugin_emoji", bool2);
        hashMap.put("plugin_text", bool2);
        hashMap.put("plugin_photo_crop", bool2);
        hashMap.put("plugin_doodle", bool2);
        f17.f237210o = c10402x5bc41468;
        f17.M.putBoolean("key_hide_operation", true);
        f17.M.putInt("key_camera_select", c16528xd9aafd63.f230351e);
        f17.M.putInt("key_sub_scene", 0);
        ((pc0.i) ((vb0.n) i95.n0.c(vb0.n.class))).getClass();
        f17.a(0, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17006x5840abd4.class.getName());
        qc0.c1 c1Var = (qc0.c1) i95.n0.c(qc0.c1.class);
        m50421x3c6fed6a = d3Var.m50421x3c6fed6a();
        ((pc0.e2) c1Var).wi(m50421x3c6fed6a, f17, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.w2(this));
    }
}
