package vl;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f519308a = true;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Integer[] f519309b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Integer[] f519310c;

    public a() {
        java.lang.Integer[] numArr = new java.lang.Integer[4];
        for (int i17 = 0; i17 < 4; i17++) {
            numArr[i17] = 0;
        }
        this.f519309b = numArr;
        java.lang.Integer[] numArr2 = new java.lang.Integer[4];
        for (int i18 = 0; i18 < 4; i18++) {
            numArr2[i18] = 0;
        }
        this.f519310c = numArr2;
    }

    public final void a(int i17, byte[] data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (this.f519308a && i17 != 0) {
            int i18 = i17 / 2;
            short[] sArr = new short[i18];
            for (int i19 = 0; i19 < i18; i19++) {
                int i27 = i19 * 2;
                sArr[i19] = (short) (((data[i27 + 1] & 255) << 8) | (data[i27] & 255));
            }
            double d17 = 0.0d;
            for (int i28 = 0; i28 < i18; i28++) {
                short s17 = sArr[i28];
                d17 += s17 * s17;
            }
            double sqrt = java.lang.Math.sqrt(d17 / i18);
            if (sqrt < 50.0d) {
                java.lang.Integer[] numArr = this.f519309b;
                numArr[0] = java.lang.Integer.valueOf(numArr[0].intValue() + 1);
            } else if (sqrt < 300.0d) {
                java.lang.Integer[] numArr2 = this.f519309b;
                numArr2[1] = java.lang.Integer.valueOf(numArr2[1].intValue() + 1);
            } else if (sqrt < 2000.0d) {
                java.lang.Integer[] numArr3 = this.f519309b;
                numArr3[2] = java.lang.Integer.valueOf(numArr3[2].intValue() + 1);
            } else {
                java.lang.Integer[] numArr4 = this.f519309b;
                numArr4[3] = java.lang.Integer.valueOf(numArr4[3].intValue() + 1);
            }
        }
    }

    public final void b(int i17, int i18, java.lang.String featureKey, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(featureKey, "featureKey");
        int i27 = 0;
        for (java.lang.Integer num : this.f519309b) {
            i27 += num.intValue();
        }
        if (i27 != 0) {
            int intValue = (this.f519309b[0].intValue() * 100) / i27;
            int intValue2 = (this.f519309b[1].intValue() * 100) / i27;
            int intValue3 = (this.f519309b[2].intValue() * 100) / i27;
            int intValue4 = (this.f519309b[3].intValue() * 100) / i27;
            int intValue5 = (this.f519310c[0].intValue() * 100) / i27;
            int intValue6 = (this.f519310c[1].intValue() * 100) / i27;
            int intValue7 = (this.f519310c[2].intValue() * 100) / i27;
            int intValue8 = (this.f519310c[3].intValue() * 100) / i27;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPlayerReportUtil", "audioType = " + i17 + " ,scenes = " + i18 + ",featureKey=" + featureKey + ",pcmSilent=" + intValue + ", pcmLow=" + intValue2 + ",pcmMiddle=" + intValue3 + ",pcmHigh=" + intValue4 + ",systemSilent=" + intValue5 + ",systemLow=" + intValue6 + ",systemMiddle=" + intValue7 + ",systemHigh=" + intValue8 + ",streamType=" + i19 + '}');
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.r(18554, true, true, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), featureKey, java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2), java.lang.Integer.valueOf(intValue3), java.lang.Integer.valueOf(intValue4), java.lang.Integer.valueOf(intValue5), java.lang.Integer.valueOf(intValue6), java.lang.Integer.valueOf(intValue7), java.lang.Integer.valueOf(intValue8), java.lang.Integer.valueOf(i19));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r52) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.a.c(int):void");
    }

    public final void d(int i17) {
        this.f519308a = false;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceMsgPCMPlayerIDKeyStat", "markMsgPlayerReport");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1206L, 0L, 1L);
        } else {
            if (i17 != 1) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VOIPPCMPlayerIDKeyStat", "markMsgPlayerReport");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1207L, 0L, 1L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r51) {
        /*
            Method dump skipped, instructions count: 1596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.a.e(int):void");
    }
}
