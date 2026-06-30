package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.g0 f267310a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.g0();

    public final void a(r45.ee eeVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17) {
        if (eeVar == null || abstractActivityC21394xb3d2c0cf == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MPVideoShareToSns", "doShareToSns msgInfo is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createSnsMpVideoShareObject", "com.tencent.mm.feature.sns.SnsShareObjectService");
        m21.q qVar = new m21.q();
        qVar.f404531a = eeVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createSnsMpVideoShareObject", "com.tencent.mm.feature.sns.SnsShareObjectService");
        intent.putExtra("ksnsupload_mp_video_xml", qVar.a());
        intent.putExtra("Ksnsupload_type", 19);
        intent.putExtra("need_result", true);
        j45.l.w(abstractActivityC21394xb3d2c0cf, ".plugin.sns.ui.SnsUploadUI", intent, 209, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.f0(abstractActivityC21394xb3d2c0cf, eeVar, i17));
    }
}
