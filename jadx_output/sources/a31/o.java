package a31;

/* loaded from: classes14.dex */
public class o implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout f993d;

    public o(com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout voiceSearchLayout) {
        this.f993d = voiceSearchLayout;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout voiceSearchLayout = this.f993d;
        z21.q qVar = voiceSearchLayout.f71761n;
        if (qVar == null) {
            return true;
        }
        int i17 = voiceSearchLayout.f71765r;
        int[] iArr = com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout.f71753v;
        if (i17 < 5) {
            voiceSearchLayout.f71765r = i17 + 1;
            voiceSearchLayout.setAmpImage(iArr[i17]);
            return true;
        }
        int i18 = qVar.f469663e;
        qVar.f469663e = 0;
        if (i18 > z21.q.f469661v) {
            z21.q.f469661v = i18;
        }
        int i19 = (i18 * 100) / z21.q.f469661v;
        int i27 = voiceSearchLayout.f71762o;
        int i28 = voiceSearchLayout.f71763p;
        if (i27 == i28) {
            if (i19 <= 10) {
                int i29 = voiceSearchLayout.f71764q + 1;
                voiceSearchLayout.f71764q = i29;
                int[] iArr2 = com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout.f71752u;
                if (i29 >= 10) {
                    voiceSearchLayout.f71764q = 0;
                }
                voiceSearchLayout.setAmpImage(iArr2[voiceSearchLayout.f71764q]);
                return true;
            }
            int i37 = i19 / 5;
            int[] iArr3 = com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout.f71751t;
            if (i37 >= 14) {
                i37 = 13;
            }
            voiceSearchLayout.f71763p = i37;
        } else if (i27 > i28) {
            voiceSearchLayout.f71762o = i27 - 1;
        } else {
            voiceSearchLayout.f71762o = i27 + 1;
        }
        voiceSearchLayout.setAmpImage(com.tencent.mm.modelvoiceaddr.ui.VoiceSearchLayout.f71751t[i27]);
        return true;
    }
}
