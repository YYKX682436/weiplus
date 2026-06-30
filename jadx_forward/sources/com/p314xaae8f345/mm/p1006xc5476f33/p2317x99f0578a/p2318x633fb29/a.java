package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f256891e = com.p314xaae8f345.mm.p2621x8fb0427b.v3.f277806a + "voice_temp.silk";

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f256892a;

    /* renamed from: b, reason: collision with root package name */
    public yl.b f256893b;

    /* renamed from: c, reason: collision with root package name */
    public z21.a0 f256894c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f256895d;

    public a() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f256892a = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5976xd9495943>(a0Var) { // from class: com.tencent.mm.plugin.transvoice.model.CutShortSentence$1

            /* renamed from: d, reason: collision with root package name */
            public short[] f256889d;

            {
                this.f39173x3fe91575 = 822073171;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5976xd9495943 c5976xd9495943) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5976xd9495943 c5976xd94959432 = c5976xd9495943;
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.a.this) {
                    am.dt dtVar = c5976xd94959432.f136273g;
                    byte[] bArr = dtVar.f88032a;
                    int i17 = dtVar.f88033b;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CutShortSentence", "rec data, len: %s time: %s.", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                    short[] sArr = this.f256889d;
                    if (sArr == null || sArr.length < i17 / 2) {
                        this.f256889d = new short[i17 / 2];
                    }
                    for (int i18 = 0; i18 < i17 / 2; i18++) {
                        int i19 = i18 * 2;
                        this.f256889d[i18] = (short) ((bArr[i19 + 1] << 8) | (bArr[i19] & 255));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.a.a(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.a.this, this.f256889d, i17 / 2);
                }
                return false;
            }
        };
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CutShortSentence", "init cut sentence, time %s.", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        try {
            java.lang.String str = f256891e;
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
            com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f294799a.r(m18.f294800b);
                }
            }
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str);
            if (!r6Var.m()) {
                r6Var.k();
            }
            r6Var.l();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CutShortSentence", e17, "delete file failed", new java.lang.Object[0]);
        }
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.a aVar, short[] sArr, int i17) {
        aVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CutShortSentence", "saveTofile, size: %s", java.lang.Integer.valueOf(i17));
        byte[] bArr = aVar.f256895d;
        if (bArr == null || bArr.length < i17 * 2) {
            aVar.f256895d = new byte[i17 * 2];
        }
        for (int i18 = 0; i18 < i17; i18++) {
            byte[] bArr2 = aVar.f256895d;
            int i19 = i18 * 2;
            short s17 = sArr[i18];
            bArr2[i19] = (byte) (s17 & 255);
            bArr2[i19 + 1] = (byte) ((65280 & s17) >> 8);
        }
        yl.b bVar = aVar.f256893b;
        if (-1 == (bVar != null ? ((yl.g) bVar).e(new tl.h0(aVar.f256895d, i17 * 2), 0, true) : -1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CutShortSentence", "error localCode = %s.", 2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CutShortSentence", "write to file failed");
        }
    }

    public void b(z21.a0 a0Var) {
        this.f256894c = a0Var;
        yl.g gVar = new yl.g(16000, 23900);
        this.f256893b = gVar;
        if (!gVar.b(f256891e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CutShortSentence", "init speex writer failed");
            ((yl.g) this.f256893b).d();
            this.f256893b = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CutShortSentence", "error localCode = %s.", 1);
        }
        z21.a0 a0Var2 = this.f256894c;
        if (a0Var2 != null) {
            a0Var2.a();
        }
        this.f256892a.mo48813x58998cd();
    }
}
