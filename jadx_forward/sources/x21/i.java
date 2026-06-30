package x21;

/* loaded from: classes14.dex */
public final class i implements x21.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f533068a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public x21.h f533069b;

    /* renamed from: c, reason: collision with root package name */
    public x21.g f533070c;

    @Override // x21.d
    public x21.m a() {
        x21.m mVar;
        java.lang.Object m143895xf1229813;
        x21.m mVar2;
        do {
            x21.g gVar = this.f533070c;
            mVar = null;
            if (gVar == null || gVar.f533061e || gVar.f533062f || !gVar.f533063g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MSP.MultiFileSilkDecoder", "createDecoderContext");
                x21.h hVar = this.f533069b;
                java.util.List list = this.f533068a;
                x21.h hVar2 = hVar == null ? (x21.h) kz5.n0.Z(list) : (x21.h) kz5.n0.a0(list, kz5.n0.c0(list, hVar) + 1);
                if (hVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MSP.MultiFileSilkDecoder", "get file null");
                    gVar = null;
                } else {
                    this.f533069b = hVar2;
                    x21.g gVar2 = new x21.g(hVar2);
                    x21.h hVar3 = gVar2.f533057a;
                    java.lang.String str = gVar2.f533058b;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
                    try {
                        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(hVar3.f533065a);
                        try {
                            byte[] bArr = new byte[E.available()];
                            E.read(bArr);
                            vz5.b.a(E, null);
                            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(bArr);
                        } finally {
                            try {
                                break;
                            } catch (java.lang.Throwable th6) {
                            }
                        }
                    } catch (java.lang.Throwable th7) {
                        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
                    }
                    java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
                    if (m143898xd4a2fc34 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "open file error", m143898xd4a2fc34);
                    }
                    if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                        m143895xf1229813 = null;
                    }
                    byte[] bArr2 = (byte[]) m143895xf1229813;
                    if (bArr2 != null) {
                        if (bArr2.length == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "dataBuffer is empty, no data to decode");
                            gVar2.f533062f = true;
                        } else {
                            gVar2.f533060d = com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48251x1fdab703(new byte[]{bArr2[0]}, 0L);
                            if (hVar3.f533067c == 0) {
                                hVar3.f533067c = (((bArr2.length * 2) * 1000) / 23900) * 8;
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "init duration, " + hVar3.f533067c);
                            }
                            gVar2.f533059c = new w21.v(gVar2.f533060d, bArr2, bArr2.length);
                            gVar2.f533063g = true;
                            gVar2.f533062f = false;
                        }
                    }
                    gVar = gVar2;
                }
                x21.g gVar3 = this.f533070c;
                if (gVar3 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar3.f533058b, "decoder uninit");
                    gVar3.f533063g = false;
                    w21.v vVar = gVar3.f533059c;
                    if (vVar != null) {
                        com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48246xd1cf9af6(vVar.f524015a);
                    }
                }
            }
            this.f533070c = gVar;
            if (gVar == null) {
                return null;
            }
            boolean z17 = gVar.f533063g;
            java.lang.String str2 = gVar.f533058b;
            if (z17) {
                w21.v vVar2 = gVar.f533059c;
                if (vVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "silk decoder init error");
                } else {
                    int i17 = gVar.f533060d;
                    int i18 = (i17 * 20) / 1000;
                    byte[] bArr3 = new byte[android.media.AudioTrack.getMinBufferSize(i17, 4, 2) * 2];
                    int m48247xb934ae02 = com.p314xaae8f345.mm.p963x7eba77a9.C11150x241988a2.m48247xb934ae02(bArr3, (short) i18, vVar2.f524015a);
                    x21.h hVar4 = gVar.f533057a;
                    if (m48247xb934ae02 > 0) {
                        java.lang.String str3 = hVar4.f533065a;
                        int i19 = hVar4.f533066b;
                        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr3);
                        wrap.limit(i18 * 2);
                        int i27 = gVar.f533060d;
                        long j17 = gVar.f533064h;
                        long j18 = 20 + j17;
                        gVar.f533064h = j18;
                        long j19 = hVar4.f533067c;
                        mVar2 = new x21.m(str3, i19, wrap, i27, j17, j19 == 0 ? 0.0f : java.lang.Math.min(1.0f, ((float) j18) / ((float) j19)), false);
                    } else if (m48247xb934ae02 == 0) {
                        gVar.f533062f = true;
                        gVar.f533063g = false;
                        hVar4.f533067c = gVar.f533064h;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "decode done, duration: " + gVar.f533064h);
                        java.lang.String str4 = hVar4.f533065a;
                        int i28 = hVar4.f533066b;
                        java.nio.ByteBuffer wrap2 = java.nio.ByteBuffer.wrap(bArr3);
                        wrap2.limit(i18 * 2);
                        int i29 = gVar.f533060d;
                        long j27 = gVar.f533064h;
                        long j28 = 20 + j27;
                        gVar.f533064h = j28;
                        long j29 = hVar4.f533067c;
                        mVar2 = new x21.m(str4, i28, wrap2, i29, j27, j29 == 0 ? 0.0f : java.lang.Math.min(1.0f, ((float) j28) / ((float) j29)), true);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "decode error code " + m48247xb934ae02);
                        gVar.f533061e = true;
                    }
                    mVar = mVar2;
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "decoder is not working");
            }
        } while (mVar == null);
        return mVar;
    }
}
