package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes11.dex */
public class m0 extends q35.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 f232300g;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 activityC16633xa26a1872, com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.x xVar) {
        this.f232300g = activityC16633xa26a1872;
    }

    @Override // q35.c
    public void a() {
    }

    @Override // q35.c
    public void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicMainUI", "shake %b", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 activityC16633xa26a1872 = this.f232300g;
        long j17 = activityC16633xa26a1872.A;
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (elapsedRealtime < 1200) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicMainUI", "tryStartShake delay too short:" + elapsedRealtime);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Music.MusicMainUI", "tryStartShake delay too enough:" + elapsedRealtime);
        activityC16633xa26a1872.A = android.os.SystemClock.elapsedRealtime();
        int i17 = activityC16633xa26a1872.B + 1;
        activityC16633xa26a1872.B = i17;
        if (i17 % 2 == 0) {
            kl3.i iVar = (kl3.i) sl3.b.b(kl3.i.class);
            int i18 = activityC16633xa26a1872.f232246r;
            kl3.z zVar = (kl3.z) iVar;
            zVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(285L, 2L, 1L, false);
            if (zVar.f390387c != 1) {
                zVar.f390387c = 1;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
                c5722xb16ab0f4.f136045g.f88569b = 5;
                c5722xb16ab0f4.e();
                pl3.c.f(2, 1, i18);
                return;
            }
            if (zVar.f390398n) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Music.MusicWechatPrivateLogic", "already running get list");
                return;
            }
            zVar.f390387c = 2;
            if (((java.util.ArrayList) zVar.f390389e).size() <= 1) {
                s75.d.b(new kl3.x(zVar, null), "music_get_list_task");
            } else {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f42 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4();
                c5722xb16ab0f42.f136045g.f88569b = 5;
                c5722xb16ab0f42.e();
            }
            pl3.c.f(1, 2, i18);
        }
    }
}
