package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes11.dex */
public class k0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 f232296a;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 activityC16633xa26a1872) {
        this.f232296a = activityC16633xa26a1872;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.k
    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.ActivityC16633xa26a1872 activityC16633xa26a1872 = this.f232296a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.u uVar = activityC16633xa26a1872.f232241m;
        if (uVar == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Music.MusicMainUI", "pager is null, return");
            return;
        }
        if (activityC16633xa26a1872.f232245q == 1 && !activityC16633xa26a1872.f232247s) {
            long currentTimeMillis = ((float) (java.lang.System.currentTimeMillis() - activityC16633xa26a1872.getIntent().getLongExtra("music_player_beg_time", 0L))) + (activityC16633xa26a1872.getIntent().getFloatExtra("key_offset", 0.0f) * 1000.0f);
            if (currentTimeMillis >= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.u uVar2 = activityC16633xa26a1872.f232241m;
                uVar2.getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.o(uVar2, activityC16633xa26a1872.f232239h.m80830xfda78ef6(), currentTimeMillis + 200));
            }
        } else if (i17 >= 0 && i18 > 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.o(uVar, activityC16633xa26a1872.f232239h.m80830xfda78ef6(), i17));
        }
        android.os.Message message = new android.os.Message();
        message.what = 1;
        activityC16633xa26a1872.H.mo50308x2936bf5f(message);
    }
}
