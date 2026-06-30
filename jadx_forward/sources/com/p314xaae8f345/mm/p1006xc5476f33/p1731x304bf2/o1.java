package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2;

/* loaded from: classes8.dex */
public class o1 implements p012xc85e97e9.p093xedfae76a.k0 {
    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1 p1Var) {
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameService", "gameFindPageEntrance notify onChanged isShow=%s!", java.lang.Boolean.valueOf(aVar.f186860a));
        if (!aVar.f186860a) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5473x47b32e0a c5473x47b32e0a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5473x47b32e0a();
            c5473x47b32e0a.f135811g.f88468a = 2;
            c5473x47b32e0a.e();
        } else if (aVar.f186862c != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5473x47b32e0a c5473x47b32e0a2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5473x47b32e0a();
            c5473x47b32e0a2.f135811g.f88468a = 1;
            c5473x47b32e0a2.e();
        }
        w71.m1 wi6 = ((h70.a) ((f70.e) i95.n0.c(f70.e.class))).wi();
        if (wi6 != null) {
            p3380x6a61f93.p3386xf51b86f1.C30596x21b1ccf3.m170128x21b094b4(((w71.n1) wi6).m105978x2737f10(), "Game.Entrance");
        }
    }
}
