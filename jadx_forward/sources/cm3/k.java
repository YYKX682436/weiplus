package cm3;

/* loaded from: classes10.dex */
public final class k extends gp1.e0 {
    @Override // gp1.x
    public void G0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        fm3.f0 f0Var = fm3.f0.f345581a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMusicStop, songName:");
        r45.hf2 hf2Var = fm3.f0.f345589i;
        sb6.append(hf2Var != null ? hf2Var.m75945x2fec8307(0) : null);
        sb6.append(", singer:");
        r45.hf2 hf2Var2 = fm3.f0.f345589i;
        sb6.append(hf2Var2 != null ? hf2Var2.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvChattingDataManger", sb6.toString());
        fm3.f0.f345598r = 2;
        if (!fm3.f0.f345599s) {
            f0Var.b();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onMusicStop, songName:");
        r45.hf2 hf2Var3 = fm3.z.f345700c;
        sb7.append(hf2Var3 != null ? hf2Var3.m75945x2fec8307(0) : null);
        sb7.append(", singer:");
        r45.hf2 hf2Var4 = fm3.z.f345700c;
        sb7.append(hf2Var4 != null ? hf2Var4.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvDataManager", sb7.toString());
        fm3.z.f345701d = 2;
        if (fm3.z.f345702e) {
            return;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onSessionEnd, songName:");
        r45.hf2 hf2Var5 = fm3.z.f345700c;
        sb8.append(hf2Var5 != null ? hf2Var5.m75945x2fec8307(0) : null);
        sb8.append(", singer:");
        r45.hf2 hf2Var6 = fm3.z.f345700c;
        sb8.append(hf2Var6 != null ? hf2Var6.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvDataManager", sb8.toString());
        fm3.z.f345698a = true;
        fm3.z.f345704g = 0L;
        fm3.z.f345705h = 0L;
    }

    @Override // gp1.e0, gp1.x
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
    }

    @Override // gp1.e0, gp1.x
    public void X0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        fm3.f0 f0Var = fm3.f0.f345581a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMusicStart, songName:");
        r45.hf2 hf2Var = fm3.f0.f345589i;
        sb6.append(hf2Var != null ? hf2Var.m75945x2fec8307(0) : null);
        sb6.append(", singer:");
        r45.hf2 hf2Var2 = fm3.f0.f345589i;
        sb6.append(hf2Var2 != null ? hf2Var2.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MvChattingDataManger", sb6.toString());
        fm3.f0.f345598r = 1;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onMusicStart, songName:");
        r45.hf2 hf2Var3 = fm3.z.f345700c;
        sb7.append(hf2Var3 != null ? hf2Var3.m75945x2fec8307(0) : null);
        sb7.append(", singer:");
        r45.hf2 hf2Var4 = fm3.z.f345700c;
        sb7.append(hf2Var4 != null ? hf2Var4.m75945x2fec8307(1) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mv.MusicMvDataManager", sb7.toString());
        fm3.z.f345701d = 1;
    }

    @Override // gp1.x
    public void r0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
    }
}
