package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3;

/* renamed from: com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse */
/* loaded from: classes16.dex */
class C25415x434612a8 {

    /* renamed from: DECODE_ERROR_IO_READ */
    private static final int f45989xc1284127 = -3;

    /* renamed from: DECODE_ERROR_MEMORY_ALLOC */
    private static final int f45990xb715113f = -2;

    /* renamed from: DECODE_ERROR_SUCCESS */
    private static final int f45991xdad243fb = 0;

    /* renamed from: DECODE_FAIL */
    private static final int f45992xc93286cf = -1;
    private static final java.lang.String TAG = "Mp3FrameInfoParse";

    /* renamed from: VBR_TYPE_CBR */
    public static final int f45995x43f89e47 = 0;

    /* renamed from: VBR_TYPE_VBRI */
    public static final int f45996x3b23cdef = 1;

    /* renamed from: VBR_TYPE_XING */
    public static final int f45997x3b24d076 = 2;

    /* renamed from: BitrateTable */
    private static final int[][][] f45988xcb264081 = {new int[][]{new int[]{0, 32, 64, 96, 128, 160, 192, 224, 256, 288, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r.f34562x366c91de, 384, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60852x9b1ed3e8, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df}, new int[]{0, 32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, 384}, new int[]{0, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e}}, new int[][]{new int[]{0, 32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256}, new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}, new int[]{0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160}}};

    /* renamed from: SAMPLE_RATE_TABLE */
    private static final int[][] f45994xfc1e144 = {new int[]{11025, 12000, 8000}, new int[]{0, 0, 0}, new int[]{22050, 24000, 16000}, new int[]{44100, 48000, 32000}};

    /* renamed from: SAMPLE_PER_FRAME */
    private static final int[][] f45993x6a3aaf36 = {new int[]{384, dc1.e.f65819x366c91de, dc1.e.f65819x366c91de}, new int[]{384, dc1.e.f65819x366c91de, 576}, new int[]{384, dc1.e.f65819x366c91de, 576}};

    /* renamed from: com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse$Mp3Info */
    /* loaded from: classes16.dex */
    public static class Mp3Info {

        /* renamed from: channels */
        int f46000x556423d0 = 0;

        /* renamed from: bit_rate */
        int f45999x4203a8d2 = 0;

        /* renamed from: sample_rate */
        long f46013x9218a55 = 0;

        /* renamed from: duration */
        long f46001x89444d94 = 0;

        /* renamed from: isVbr */
        int f46009x5fd39bc = 0;

        /* renamed from: idv2Size */
        int f46008x118e5178 = 0;

        /* renamed from: firstFramePosition */
        long f46005x531a24e6 = 0;

        /* renamed from: firstFrameSize */
        long f46006x6b2ad23e = 0;

        /* renamed from: mpeg_version */
        int f46012x14b8ac1e = 0;

        /* renamed from: layer */
        int f46010x61fd551 = 0;

        /* renamed from: lengthInFrames */
        long f46011x5ebaa731 = 0;

        /* renamed from: fileLengthInBytes */
        long f46004x114a464 = 0;

        /* renamed from: toc_table */
        long[] f46015x575a4a17 = null;

        /* renamed from: flag_value */
        int f46007x2fdeb2de = 0;

        /* renamed from: VBRType */
        int f45998x3aa34b80 = 0;

        /* renamed from: entry_count */
        int f46002xcfa71f02 = 0;

        /* renamed from: entry_size */
        int f46003x8adb07ae = 0;

        /* renamed from: scale_factor */
        int f46014x76cbc5e4 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* renamed from: IsMp3Header */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m94189x47c56b73(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25417x658b1af9 r21, byte[] r22, int r23, int r24, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25415x434612a8.Mp3Info r25) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25415x434612a8.m94189x47c56b73(com.tencent.qqmusic.mediaplayer.seektable.mp3.TrackPositionDataSource, byte[], int, int, com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse$Mp3Info):boolean");
    }

    /* renamed from: parseFrameInfo */
    public static int m94190x796a6248(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25417x658b1af9 c25417x658b1af9, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25415x434612a8.Mp3Info mp3Info) {
        int i17;
        int i18 = -1;
        if (c25417x658b1af9 == null) {
            return -1;
        }
        byte[] bArr = new byte[1024];
        if (c25417x658b1af9.m94200x355996(bArr, 1024) < 1024) {
            return -2;
        }
        long j17 = 0;
        if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25414xf36e2ccf.m94175x726f47a(bArr, 4)) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "hasId3v2");
            m94194x7b9ba8b5(c25417x658b1af9, bArr, mp3Info);
        } else {
            c25417x658b1af9.m94201x35ce78(0L);
        }
        long m94199xfb854877 = c25417x658b1af9.m94199xfb854877();
        long j18 = mp3Info.f46008x118e5178;
        if (j18 > 0 && m94199xfb854877 > j18) {
            m94199xfb854877 -= j18;
        }
        int i19 = 0;
        while (true) {
            long m94198x4abe8653 = c25417x658b1af9.m94198x4abe8653();
            if (j18 > 0) {
                m94198x4abe8653 -= j18;
            }
            if (m94198x4abe8653 >= m94199xfb854877 / 10) {
                return -3;
            }
            if (i19 >= 3) {
                i17 = i19;
                if (c25417x658b1af9.m94201x35ce78(c25417x658b1af9.m94198x4abe8653() - 3) < j17) {
                    return -3;
                }
            } else {
                i17 = i19;
            }
            int m94200x355996 = c25417x658b1af9.m94200x355996(bArr, 1024);
            if (m94200x355996 == i18) {
                mp3Info.f46005x531a24e6 = -1L;
                return -3;
            }
            i19 = i17 + m94200x355996;
            for (int i27 = 0; i27 + 4 <= m94200x355996; i27++) {
                if (255 == (bArr[i27] & 255) && 224 == (bArr[i27 + 1] & 224) && m94189x47c56b73(c25417x658b1af9, bArr, 1024, i27, mp3Info)) {
                    mp3Info.f46005x531a24e6 = ((mp3Info.f46008x118e5178 + i19) - m94200x355996) + i27;
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "FirstFramePos = " + mp3Info.f46005x531a24e6);
                    if (c25417x658b1af9.m94201x35ce78(mp3Info.f46005x531a24e6) < 0) {
                        return -1;
                    }
                    return (c25417x658b1af9.m94201x35ce78(0L) < 0 || !m94191x26b3a968(c25417x658b1af9, mp3Info)) ? -1 : 0;
                }
                j17 = 0;
            }
            i18 = -1;
        }
    }

    /* renamed from: parseVBRFrameInfo */
    private static boolean m94191x26b3a968(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25417x658b1af9 c25417x658b1af9, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25415x434612a8.Mp3Info mp3Info) {
        if (c25417x658b1af9 == null || mp3Info == null) {
            return false;
        }
        long j17 = mp3Info.f46013x9218a55;
        int i17 = mp3Info.f46000x556423d0;
        byte[] bArr = new byte[1024];
        long j18 = 21;
        if (mp3Info.f46012x14b8ac1e == 0) {
            if (i17 != 1) {
                j18 = 36;
            }
        } else if (i17 == 1) {
            j18 = 13;
        }
        if (c25417x658b1af9.m94201x35ce78(c25417x658b1af9.m94198x4abe8653() + j18) < 0 || c25417x658b1af9.m94200x355996(bArr, 1024) < 1024) {
            return false;
        }
        if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25414xf36e2ccf.m94177xfa5742ff(bArr, 4)) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "is Xing VBR");
            mp3Info.f45998x3aa34b80 = 2;
            mp3Info.f46009x5fd39bc = 1;
            m94193xf6d0d40b(bArr, j17, mp3Info);
            return true;
        }
        if (c25417x658b1af9.m94201x35ce78(c25417x658b1af9.m94198x4abe8653() - (j18 + 1024)) < 0 || c25417x658b1af9.m94201x35ce78(c25417x658b1af9.m94198x4abe8653() + 36) < 0 || c25417x658b1af9.m94200x355996(bArr, 1024) < 1024) {
            return false;
        }
        if (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25414xf36e2ccf.m94176xd10721e6(bArr, 4)) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "is VBRI VBR");
            mp3Info.f45998x3aa34b80 = 1;
            mp3Info.f46009x5fd39bc = 1;
            m94192xe68d00e4(mp3Info, bArr, j17);
        } else {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "is CBR");
            mp3Info.f45998x3aa34b80 = 0;
            long m94199xfb854877 = c25417x658b1af9.m94199xfb854877();
            if (mp3Info.f46004x114a464 <= 0) {
                mp3Info.f46004x114a464 = m94199xfb854877;
            }
            mp3Info.f46001x89444d94 = (((float) (mp3Info.f46004x114a464 - mp3Info.f46008x118e5178)) * 8.0f) / mp3Info.f45999x4203a8d2;
        }
        return true;
    }

    /* renamed from: parseVBRIInfo */
    private static void m94192xe68d00e4(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25415x434612a8.Mp3Info mp3Info, byte[] bArr, long j17) {
        int i17;
        long[] jArr;
        int m94187x9da5b286;
        if (bArr == null || mp3Info == null) {
            return;
        }
        long m94183xcc46d932 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25414xf36e2ccf.m94183xcc46d932(bArr, 10, 4);
        mp3Info.f46004x114a464 = m94183xcc46d932;
        long m94183xcc46d9322 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25414xf36e2ccf.m94183xcc46d932(bArr, 14, 4);
        if (m94183xcc46d9322 > 0 && j17 > 0) {
            int i18 = mp3Info.f46012x14b8ac1e;
            int i19 = mp3Info.f46010x61fd551 - 1;
            mp3Info.f46011x5ebaa731 = m94183xcc46d9322;
            mp3Info.f46001x89444d94 = (long) ((((m94183xcc46d9322 * f45993x6a3aaf36[i18][i19]) * 1.0d) / j17) * 1000.0d);
        }
        int m94185xbcf3c886 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25414xf36e2ccf.m94185xbcf3c886(bArr, 18, 2);
        int m94185xbcf3c8862 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25414xf36e2ccf.m94185xbcf3c886(bArr, 20, 2);
        int m94185xbcf3c8863 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25414xf36e2ccf.m94185xbcf3c886(bArr, 22, 2);
        if (m94185xbcf3c886 <= 0 || m94185xbcf3c8862 <= 0) {
            return;
        }
        int i27 = m94185xbcf3c886 + 1;
        long[] jArr2 = new long[i27];
        long j18 = mp3Info.f46005x531a24e6;
        int i28 = j18 > 0 ? (int) (0 + j18) : 0;
        long j19 = mp3Info.f46006x6b2ad23e;
        if (j19 > 0) {
            i28 = (int) (i28 + j19);
        }
        int i29 = 24;
        int i37 = 1;
        while (true) {
            if (i37 >= i27) {
                break;
            }
            if (m94185xbcf3c8863 == 1) {
                int m94179xcc4273be = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25414xf36e2ccf.m94179xcc4273be(bArr, i29, 1);
                i29++;
                jArr = jArr2;
                i17 = m94179xcc4273be;
            } else {
                if (m94185xbcf3c8863 == 2) {
                    m94187x9da5b286 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25414xf36e2ccf.m94185xbcf3c886(bArr, i29, 2);
                    i29 += 2;
                } else if (m94185xbcf3c8863 == 3) {
                    m94187x9da5b286 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25414xf36e2ccf.m94187x9da5b286(bArr, i29, 3);
                    i29 += 3;
                } else if (m94185xbcf3c8863 == 4) {
                    int m94181x40655679 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25414xf36e2ccf.m94181x40655679(bArr, i29, 4);
                    i29 += 4;
                    jArr = jArr2;
                    i17 = m94181x40655679;
                } else {
                    i17 = -1;
                    jArr = null;
                }
                jArr = jArr2;
                i17 = m94187x9da5b286;
            }
            if (i17 < 0) {
                jArr2 = jArr;
                break;
            }
            i28 += i17 * m94185xbcf3c8862;
            if (i28 >= m94183xcc46d932) {
                i28 = (int) m94183xcc46d932;
            }
            jArr[i37] = i28;
            i37++;
            jArr2 = jArr;
        }
        mp3Info.f46002xcfa71f02 = m94185xbcf3c886;
        mp3Info.f46003x8adb07ae = m94185xbcf3c8863;
        mp3Info.f46014x76cbc5e4 = m94185xbcf3c8862;
        mp3Info.f46015x575a4a17 = jArr2;
    }

    /* renamed from: parseXingInfo */
    private static void m94193xf6d0d40b(byte[] bArr, long j17, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25415x434612a8.Mp3Info mp3Info) {
        long[] jArr;
        if (bArr == null || mp3Info == null) {
            return;
        }
        int m94181x40655679 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25414xf36e2ccf.m94181x40655679(bArr, 4, 4);
        int i17 = 8;
        if ((m94181x40655679 & 1) == 1) {
            long m94183xcc46d932 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25414xf36e2ccf.m94183xcc46d932(bArr, 8, 4) - 1;
            if (m94183xcc46d932 > 0 && j17 > 0) {
                int i18 = mp3Info.f46012x14b8ac1e;
                int i19 = mp3Info.f46010x61fd551 - 1;
                mp3Info.f46011x5ebaa731 = m94183xcc46d932;
                mp3Info.f46001x89444d94 = (long) ((((m94183xcc46d932 * f45993x6a3aaf36[i18][i19]) * 1.0d) / j17) * 1000.0d);
            }
            i17 = 12;
        }
        if ((m94181x40655679 & 2) == 2) {
            mp3Info.f46004x114a464 = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25414xf36e2ccf.m94183xcc46d932(bArr, i17, 4);
            i17 += 4;
        }
        if ((m94181x40655679 & 4) == 4) {
            jArr = new long[100];
            for (int i27 = 0; i27 < 100; i27++) {
                jArr[i27] = bArr[i27 + i17] & 255;
            }
        } else {
            jArr = null;
        }
        if (m94181x40655679 <= 0 || jArr == null) {
            return;
        }
        mp3Info.f46015x575a4a17 = jArr;
        mp3Info.f46007x2fdeb2de = m94181x40655679;
    }

    /* renamed from: skipId3v2 */
    private static void m94194x7b9ba8b5(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25417x658b1af9 c25417x658b1af9, byte[] bArr, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.mp3.C25415x434612a8.Mp3Info mp3Info) {
        int i17;
        boolean z17;
        if (c25417x658b1af9 != null && bArr != null && bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51) {
            int i18 = ((bArr[6] & Byte.MAX_VALUE) << 21) + ((bArr[7] & Byte.MAX_VALUE) << 14) + ((bArr[8] & Byte.MAX_VALUE) << 7) + (bArr[9] & Byte.MAX_VALUE);
            if ((bArr[5] & com.p314xaae8f345.p3206x37e841.C27806x41b77320.f60796x98e30028) != 0) {
                i17 = i18 + 20;
                z17 = true;
            } else {
                i17 = i18 + 10;
                z17 = false;
            }
            if (c25417x658b1af9.m94201x35ce78(i17) < 0) {
                return;
            }
            if (!z17) {
                byte[] bArr2 = new byte[1];
                int m94200x355996 = c25417x658b1af9.m94200x355996(bArr2, 1);
                while (bArr2[0] == 0 && m94200x355996 == 1) {
                    i17++;
                    m94200x355996 = c25417x658b1af9.m94200x355996(bArr2, 1);
                }
            }
            mp3Info.f46008x118e5178 = i17;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "id3V2 Size: " + mp3Info.f46008x118e5178);
            c25417x658b1af9.m94201x35ce78((long) i17);
        }
    }
}
