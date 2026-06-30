package cm3;

/* loaded from: classes10.dex */
public final class k extends gp1.e0 {
    @Override // gp1.x
    public void G0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        fm3.f0 f0Var = fm3.f0.f264048a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMusicStop, songName:");
        r45.hf2 hf2Var = fm3.f0.f264056i;
        sb6.append(hf2Var != null ? hf2Var.getString(0) : null);
        sb6.append(", singer:");
        r45.hf2 hf2Var2 = fm3.f0.f264056i;
        sb6.append(hf2Var2 != null ? hf2Var2.getString(1) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvChattingDataManger", sb6.toString());
        fm3.f0.f264065r = 2;
        if (!fm3.f0.f264066s) {
            f0Var.b();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onMusicStop, songName:");
        r45.hf2 hf2Var3 = fm3.z.f264167c;
        sb7.append(hf2Var3 != null ? hf2Var3.getString(0) : null);
        sb7.append(", singer:");
        r45.hf2 hf2Var4 = fm3.z.f264167c;
        sb7.append(hf2Var4 != null ? hf2Var4.getString(1) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvDataManager", sb7.toString());
        fm3.z.f264168d = 2;
        if (fm3.z.f264169e) {
            return;
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("onSessionEnd, songName:");
        r45.hf2 hf2Var5 = fm3.z.f264167c;
        sb8.append(hf2Var5 != null ? hf2Var5.getString(0) : null);
        sb8.append(", singer:");
        r45.hf2 hf2Var6 = fm3.z.f264167c;
        sb8.append(hf2Var6 != null ? hf2Var6.getString(1) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvDataManager", sb8.toString());
        fm3.z.f264165a = true;
        fm3.z.f264171g = 0L;
        fm3.z.f264172h = 0L;
    }

    @Override // gp1.e0, gp1.x
    public void V(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }

    @Override // gp1.e0, gp1.x
    public void X0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        fm3.f0 f0Var = fm3.f0.f264048a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMusicStart, songName:");
        r45.hf2 hf2Var = fm3.f0.f264056i;
        sb6.append(hf2Var != null ? hf2Var.getString(0) : null);
        sb6.append(", singer:");
        r45.hf2 hf2Var2 = fm3.f0.f264056i;
        sb6.append(hf2Var2 != null ? hf2Var2.getString(1) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvChattingDataManger", sb6.toString());
        fm3.f0.f264065r = 1;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onMusicStart, songName:");
        r45.hf2 hf2Var3 = fm3.z.f264167c;
        sb7.append(hf2Var3 != null ? hf2Var3.getString(0) : null);
        sb7.append(", singer:");
        r45.hf2 hf2Var4 = fm3.z.f264167c;
        sb7.append(hf2Var4 != null ? hf2Var4.getString(1) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvDataManager", sb7.toString());
        fm3.z.f264168d = 1;
    }

    @Override // gp1.x
    public void r0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
    }
}
