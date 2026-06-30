package df2;

/* loaded from: classes10.dex */
public final class ra extends tn0.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.zb f312773a;

    public ra(df2.zb zbVar) {
        this.f312773a = zbVar;
    }

    @Override // com.p314xaae8f345.p3109x36756d.AbstractC26788x7049bd9c.TRTCAudioFrameListener
    /* renamed from: onCapturedAudioFrame */
    public void mo14853xad1683f4(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        byte[] bArr;
        byte[] bArr2;
        if (tRTCAudioFrame == null || (bArr = tRTCAudioFrame.f57041x2eefaa) == null) {
            return;
        }
        df2.zb zbVar = this.f312773a;
        int i17 = tRTCAudioFrame.f57043x88751aa;
        int i18 = tRTCAudioFrame.f57040x2c0b7d03;
        zbVar.getClass();
        if ((bArr.length == 0) || i17 <= 0 || i18 <= 0) {
            bArr2 = new byte[0];
        } else {
            int length = bArr.length / 2;
            short[] sArr = new short[length];
            for (int i19 = 0; i19 < length; i19++) {
                int i27 = i19 * 2;
                sArr[i19] = (short) (((bArr[i27 + 1] << 8) & 65280) | (bArr[i27] & 255));
            }
            if (i18 >= 2) {
                int i28 = length / 2;
                short[] sArr2 = new short[i28];
                for (int i29 = 0; i29 < i28; i29++) {
                    sArr2[i29] = sArr[i29 * 2];
                }
                sArr = sArr2;
            }
            if (i17 == 16000) {
                bArr2 = new byte[sArr.length * 2];
                int length2 = sArr.length;
                for (int i37 = 0; i37 < length2; i37++) {
                    int i38 = i37 * 2;
                    short s17 = sArr[i37];
                    bArr2[i38] = (byte) (s17 & 255);
                    bArr2[i38 + 1] = (byte) ((s17 >> 8) & 255);
                }
            } else {
                int i39 = i17 / 16000;
                if (i39 <= 0) {
                    bArr2 = new byte[0];
                } else {
                    int f17 = e06.p.f(i39, 1, 8);
                    int length3 = sArr.length / i39;
                    short[] sArr3 = new short[length3];
                    for (int i47 = 0; i47 < length3; i47++) {
                        int i48 = i47 * i39;
                        int i49 = i48 + f17;
                        int length4 = sArr.length;
                        if (i49 > length4) {
                            i49 = length4;
                        }
                        int i57 = 0;
                        int i58 = 0;
                        while (i48 < i49) {
                            i57 += sArr[i48];
                            i58++;
                            i48++;
                        }
                        sArr3[i47] = (short) (i57 / i58);
                    }
                    bArr2 = new byte[length3 * 2];
                    for (int i59 = 0; i59 < length3; i59++) {
                        int i66 = i59 * 2;
                        short s18 = sArr3[i59];
                        bArr2[i66] = (byte) (s18 & 255);
                        bArr2[i66 + 1] = (byte) ((s18 >> 8) & 255);
                    }
                }
            }
        }
        if (!(bArr2.length == 0)) {
            rh2.e eVar = rh2.e.f477174a;
            if (!rh2.e.f477177d || rh2.e.f477176c == -1) {
                return;
            }
            synchronized (eVar) {
                if (!rh2.e.f477177d || rh2.e.f477176c == -1) {
                    return;
                }
                try {
                    int m21481x1ebb3bcb = rh2.e.f477175b.m21481x1ebb3bcb(rh2.e.f477176c, bArr2);
                    if (m21481x1ebb3bcb == -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.KWSEngine", "AddData returned error");
                    } else if (m21481x1ebb3bcb != 0 && m21481x1ebb3bcb == 1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KWSEngine", "AddData returned FINISHED");
                        eVar.b();
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KWSEngine", "processAudio error: " + e17.getMessage());
                }
            }
        }
    }
}
