package cg4;

/* loaded from: classes9.dex */
public class i extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public i() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5405x3c27d29a c5405x3c27d29a = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5405x3c27d29a) abstractC20979x809547d1;
        if (c5405x3c27d29a == null) {
            return false;
        }
        am.b9 b9Var = c5405x3c27d29a.f135752g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b9Var.f87757a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceTransformTextClickEventListener", "fileName is null");
            return false;
        }
        w21.w0 y07 = w21.p0.Di().y0(b9Var.f87757a);
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoiceTransformTextClickEventListener", "voiceInfo is null");
            return false;
        }
        int i17 = b9Var.f87758b;
        if (i17 == 1 || i17 == 2) {
            java.lang.String str = y07.f524020d;
            int i18 = b9Var.f87759c;
            int i19 = y07.f524028l;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceTransformTextReporter", "reportTransformTextClick voiceId: %s, clickScene: %d, voiceLengthMs: %d", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14220, java.lang.Integer.valueOf(i18), 0, 0, 0, 0, 0, 0, str, java.lang.Integer.valueOf(i19));
        } else if (i17 == 3) {
            java.lang.String str2 = y07.f524020d;
            int i27 = b9Var.f87759c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceTransformTextReporter", "reportTransformTextDoubleClick voiceId: %s, clickScene: %d", str2, java.lang.Integer.valueOf(i27));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14220, 0, java.lang.Integer.valueOf(i27), 0, 0, 0, 0, 0, str2);
        }
        return true;
    }
}
