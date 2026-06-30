package uo2;

/* loaded from: classes2.dex */
public final class x implements fz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 f511180d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 c14493xfdc11530) {
        this.f511180d = c14493xfdc11530;
    }

    @Override // fz2.b
    public void M7(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onHeadsetStateChange on:");
        sb6.append(z17);
        sb6.append(" isPlaying:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1571x636ee25.C14493xfdc11530 c14493xfdc11530 = this.f511180d;
        vo2.d dVar = c14493xfdc11530.player;
        sb6.append(dVar != null ? ((vo2.c) dVar).b() : false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderImgFeedMusicTag", sb6.toString());
        if (z17) {
            return;
        }
        vo2.d dVar2 = c14493xfdc11530.player;
        if (dVar2 != null ? ((vo2.c) dVar2).b() : false) {
            c14493xfdc11530.getOnHeadsetStateChangePauseMusicTag().mo152xb9724478();
        }
    }
}
