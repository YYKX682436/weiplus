package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes9.dex */
public final class rd extends gp1.a0 {
    @Override // gp1.a0, gp1.z
    public void G0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
    }

    @Override // gp1.a0, gp1.z
    public void V(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
    }

    @Override // gp1.a0, gp1.z
    public void X0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
    }

    @Override // gp1.a0, gp1.z
    public void r0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceStateHolder", "onFloatBallInfoClicked, ballInfo:" + c12886x91aa2b6d);
        if (c12886x91aa2b6d != null) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.sd sdVar = com.p314xaae8f345.mm.ui.p2740x696c9db.sd.f292275a;
            int i17 = c12886x91aa2b6d.f174579d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceStateHolder", "open ball page type: " + i17);
            if (i17 != 6 && i17 != 8 && i17 != 9) {
                switch (i17) {
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceStateHolder", "need stop set to false for other float ball");
                        sdVar.b(false);
                        return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceStateHolder", "need stop set to true for voice/video ball");
            sdVar.b(true);
        }
    }
}
