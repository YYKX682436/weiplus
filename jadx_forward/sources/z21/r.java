package z21;

/* loaded from: classes12.dex */
public class r implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public short[] f551208a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f551209b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z21.w f551210c;

    public r(z21.w wVar) {
        this.f551210c = wVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoiceInputAddr", "onRecError state = %s detailState = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f551210c.a(10, -1, -1);
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        int i18;
        boolean z17 = this.f551209b;
        z21.w wVar = this.f551210c;
        if (z17) {
            z21.d dVar = wVar.I;
            if (dVar != null) {
                java.lang.String voiceId = wVar.B;
                k23.t0 t0Var = (k23.t0) dVar;
                t0Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceId, "voiceId");
                k23.v0.x(t0Var.f385227a, 21, "{\"voiceId\":\"" + voiceId + "\"}", null, 4, null);
            }
            this.f551209b = false;
        }
        java.lang.System.currentTimeMillis();
        short[] sArr = this.f551208a;
        if (sArr == null || sArr.length < i17 / 2) {
            this.f551208a = new short[i17 / 2];
        }
        int i19 = 0;
        while (true) {
            i18 = i17 / 2;
            if (i19 >= i18) {
                break;
            }
            int i27 = i19 * 2;
            this.f551208a[i19] = (short) ((bArr[i27 + 1] << 8) | (bArr[i27] & 255));
            i19++;
        }
        yl.b bVar = wVar.f551232y;
        if (bVar != null && -1 == bVar.e(new tl.h0(bArr, i17), 0, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoiceInputAddr", "write to voice file failed");
        }
        short[] sArr2 = this.f551208a;
        wVar.getClass();
        for (int i28 = 0; i28 < i18; i28++) {
            short s17 = sArr2[i28];
            if (s17 > wVar.f551214d) {
                wVar.f551214d = s17;
            }
        }
        short[] sArr3 = this.f551208a;
        byte[] bArr2 = wVar.K;
        if (bArr2 == null || bArr2.length < i18 * 2) {
            wVar.K = new byte[i18 * 2];
        }
        for (int i29 = 0; i29 < i18; i29++) {
            byte[] bArr3 = wVar.K;
            int i37 = i29 * 2;
            short s18 = sArr3[i29];
            bArr3[i37] = (byte) (s18 & 255);
            bArr3[i37 + 1] = (byte) ((s18 & 65280) >> 8);
        }
        yl.b bVar2 = wVar.f551231x;
        int e17 = bVar2 != null ? bVar2.e(new tl.h0(wVar.K, i18 * 2), 0, true) : -1;
        if (-1 == e17) {
            wVar.a(4, -1, -1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SceneVoiceInputAddr", "write to file failed");
            return;
        }
        int i38 = wVar.f551215e + e17;
        wVar.f551215e = i38;
        if (wVar.f551217g || i38 <= 200 || wVar.f551216f) {
            return;
        }
        if (wVar.C) {
            z21.j0 j0Var = wVar.A;
            if (j0Var != null) {
                if (j0Var.e()) {
                    wVar.A.k();
                } else {
                    wVar.a(13, 131, -1);
                }
            }
        } else {
            gm0.j1.e().j(new z21.s(wVar));
        }
        wVar.f551216f = true;
    }
}
