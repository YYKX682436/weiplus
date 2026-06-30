package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f231666a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.concurrent.CopyOnWriteArrayList f231667b;

    public t0() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkEngine", "init multiTalk engine");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) gm0.j1.u().f354681a.a(1));
    }

    public void a(boolean z17) {
        byte[] bArr = {z17 ? (byte) 1 : (byte) 0};
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MT.MultiTalkEngine", "setEngineHeadsetPlugged, %s", java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.c(425, bArr, 1);
        if (!z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.l1.f33738x366c91de, bArr, 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.m0.f33740x366c91de, bArr, 1);
            c(ym1.f.f544667h.k());
        } else {
            if (ym1.f.Ri()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.l1.f33738x366c91de, bArr, 1);
            }
            if (ym1.f.Ni()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1062x7dd491a9.m0.f33740x366c91de, bArr, 1);
            }
        }
    }

    public void b(boolean z17) {
        byte[] bArr = new byte[1];
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.MT.MultiTalkEngine", "setEngineMicOn, %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            bArr[0] = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.c(413, bArr, 1);
        } else {
            bArr[0] = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.c(412, bArr, 1);
        }
    }

    public void c(boolean z17) {
        byte[] bArr = new byte[1];
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.MT.MultiTalkEngine", "qipengfeng, setEngineSpeakerOn, %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            bArr[0] = 1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.c(401, bArr, 1);
        } else {
            bArr[0] = 0;
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.g0.c(402, bArr, 1);
        }
    }

    public void d() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f231666a;
        if (b4Var != null) {
            b4Var.d();
            this.f231666a.m77787xbe88f509();
            this.f231666a.mo50302x6b17ad39(null);
        }
    }
}
