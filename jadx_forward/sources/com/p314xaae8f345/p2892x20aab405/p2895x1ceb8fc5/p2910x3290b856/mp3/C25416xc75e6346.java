package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3;

/* renamed from: com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3SeekTable */
/* loaded from: classes16.dex */
public class C25416xc75e6346 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25410xa83fe816 {

    /* renamed from: mInfo */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25415x434612a8.Mp3Info f46016x622dabb = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25415x434612a8.Mp3Info();

    /* renamed from: timeToBytePositionInCbr */
    private static long m94195xee12a775(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25415x434612a8.Mp3Info mp3Info, long j17) {
        int i17;
        if (mp3Info == null || (i17 = mp3Info.f45999x4203a8d2) <= 0 || j17 < 0) {
            return -1L;
        }
        long j18 = (i17 / 8) * j17;
        int i18 = mp3Info.f46008x118e5178;
        return i18 > 0 ? j18 + i18 : j18;
    }

    /* renamed from: timeToBytePositionInVBRIVbr */
    private static long m94196x81b2c505(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25415x434612a8.Mp3Info mp3Info, long j17) {
        long[] jArr;
        if (mp3Info == null || (jArr = mp3Info.f46015x575a4a17) == null) {
            return -1L;
        }
        long j18 = mp3Info.f46004x114a464;
        if (j18 <= 0) {
            return -1L;
        }
        long j19 = mp3Info.f46005x531a24e6;
        if (j19 < 0) {
            return -1L;
        }
        long j27 = mp3Info.f46001x89444d94;
        if (j27 <= 0 || j17 < 0) {
            return -1L;
        }
        int i17 = mp3Info.f46002xcfa71f02;
        int i18 = i17 + 1;
        int i19 = (int) (((j17 * 1.0d) / j27) * i18);
        if (i19 >= 0) {
            j19 = jArr[i19];
        }
        if (i19 < i17) {
            j18 = jArr[i19 + 1];
        }
        long j28 = (i19 * j27) / i18;
        return j19 + (j18 == j19 ? 0L : (long) ((((j18 - j19) * 1.0d) * (j17 - j28)) / ((((i19 + 1) * j27) / r14) - j28)));
    }

    /* renamed from: timeToBytePositionInXingVbr */
    private static long m94197x2fa470fe(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25415x434612a8.Mp3Info mp3Info, long j17) {
        long[] jArr;
        if (mp3Info == null || (jArr = mp3Info.f46015x575a4a17) == null) {
            return -1L;
        }
        long j18 = mp3Info.f46004x114a464;
        if (j18 <= 0) {
            return -1L;
        }
        long j19 = mp3Info.f46005x531a24e6;
        if (j19 < 0) {
            return -1L;
        }
        long j27 = mp3Info.f46001x89444d94;
        if (j27 < 0 || j17 < 0) {
            return -1L;
        }
        double d17 = (j17 * 100.0d) / j27;
        double d18 = 0.0d;
        if (d17 > 0.0d) {
            if (d17 >= 100.0d) {
                d18 = 256.0d;
            } else {
                int i17 = (int) d17;
                d18 = (i17 == 0 ? 0.0f : (float) jArr[i17]) + (((i17 < 99 ? (float) jArr[i17 + 1] : 256.0f) - r4) * (d17 - i17));
            }
        }
        long round = java.lang.Math.round(d18 * 0.00390625d * j18) + j19;
        long j28 = (j19 + j18) - 1;
        int i18 = mp3Info.f46008x118e5178;
        if (i18 > 0) {
            j28 -= i18;
        }
        return round < j28 ? round : j28;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25410xa83fe816
    /* renamed from: parse */
    public void mo94147x6581ab3(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25415x434612a8.m94190x796a6248(new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25417x658b1af9(interfaceC25439x37e1318e), this.f46016x622dabb);
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25410xa83fe816
    /* renamed from: seek */
    public long mo94148x35ce78(long j17) {
        if (j17 < 0) {
            return -1L;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25415x434612a8.Mp3Info mp3Info = this.f46016x622dabb;
        int i17 = mp3Info.f45998x3aa34b80;
        if (i17 == 0) {
            return m94195xee12a775(mp3Info, j17);
        }
        if (i17 == 1) {
            return m94196x81b2c505(mp3Info, j17);
        }
        if (i17 != 2) {
            return -1L;
        }
        return m94197x2fa470fe(mp3Info, j17);
    }
}
