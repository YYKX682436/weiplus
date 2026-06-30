package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68;

/* renamed from: com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable */
/* loaded from: classes16.dex */
public class C25412x213ed8e implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25410xa83fe816 {

    /* renamed from: SEEK_POINT_SIZE */
    private static final int f45979x384b6d97 = 18;

    /* renamed from: TYPE_SEEKTABLE */
    private static final byte f45980x11650971 = 3;

    /* renamed from: TYPE_STREAMINFO */
    private static final byte f45981xb488c653 = 0;

    /* renamed from: firstFrameOffset */
    private long f45982x44b8bb90;

    /* renamed from: offsets */
    private long[] f45983xa3b52e40;

    /* renamed from: sampleNumbers */
    private long[] f45984xc95ddd40;

    /* renamed from: sampleRate */
    private int f45985x88751aa;

    /* renamed from: com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable$BlockHandler */
    /* loaded from: classes16.dex */
    public interface BlockHandler {
        /* renamed from: handle */
        boolean mo94172xb7026e28(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c interfaceC25408x4aa5146c, int i17);
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable$SeektableHandler */
    /* loaded from: classes16.dex */
    public class SeektableHandler implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.BlockHandler {
        public SeektableHandler() {
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.BlockHandler
        /* renamed from: handle */
        public boolean mo94172xb7026e28(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c interfaceC25408x4aa5146c, int i17) {
            if (i17 != 3) {
                return false;
            }
            byte[] bArr = new byte[3];
            interfaceC25408x4aa5146c.mo94150xbc0c0475(bArr, 0, 3);
            int m94160x3017aa = com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25411xfe3c16ed.m94160x3017aa(bArr) / 18;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.this.f45984xc95ddd40 = new long[m94160x3017aa];
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.this.f45983xa3b52e40 = new long[m94160x3017aa];
            for (int i18 = 0; i18 < m94160x3017aa; i18++) {
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.this.f45984xc95ddd40[i18] = interfaceC25408x4aa5146c.mo94154xcc46d932();
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.this.f45983xa3b52e40[i18] = interfaceC25408x4aa5146c.mo94154xcc46d932();
                interfaceC25408x4aa5146c.mo94158x35e57f(2L);
            }
            if (!com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.m94168x16aa9010(interfaceC25408x4aa5146c)) {
                throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.C25406x57b29a3b("can't find audio frame!");
            }
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.this.f45982x44b8bb90 = interfaceC25408x4aa5146c.mo94159x3643b1() - 2;
            return true;
        }
    }

    /* renamed from: com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable$StreamInfoHandler */
    /* loaded from: classes16.dex */
    public class StreamInfoHandler implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.BlockHandler {
        public StreamInfoHandler() {
        }

        @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.BlockHandler
        /* renamed from: handle */
        public boolean mo94172xb7026e28(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c interfaceC25408x4aa5146c, int i17) {
            if (i17 != 0) {
                return false;
            }
            interfaceC25408x4aa5146c.mo94158x35e57f(13L);
            interfaceC25408x4aa5146c.mo94150xbc0c0475(new byte[3], 0, 3);
            interfaceC25408x4aa5146c.mo94158x35e57f(21L);
            return true;
        }
    }

    public C25412x213ed8e(int i17) {
        this.f45985x88751aa = i17;
    }

    /* renamed from: binarySearchFloor */
    private static int m94167xb25dd883(long[] jArr, long j17, boolean z17, boolean z18) {
        int binarySearch = java.util.Arrays.binarySearch(jArr, j17);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        } else if (!z17) {
            binarySearch--;
        }
        return z18 ? java.lang.Math.max(0, binarySearch) : binarySearch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: seekToFirstFrame */
    public static boolean m94168x16aa9010(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c interfaceC25408x4aa5146c) {
        byte[] bArr = new byte[1];
        byte[] bArr2 = new byte[3];
        boolean z17 = false;
        while (interfaceC25408x4aa5146c.mo94149xd4418ac9() > 0) {
            if (z17) {
                byte[] bArr3 = new byte[2];
                interfaceC25408x4aa5146c.mo94150xbc0c0475(bArr3, 0, 2);
                return (bArr3[0] & 255) == 255 && ((bArr3[1] & 255) >> 2) == 62;
            }
            interfaceC25408x4aa5146c.mo94150xbc0c0475(bArr, 0, 1);
            if (((255 & bArr[0]) >> 7) == 1) {
                z17 = true;
            }
            interfaceC25408x4aa5146c.mo94150xbc0c0475(bArr2, 0, 3);
            interfaceC25408x4aa5146c.mo94158x35e57f(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25411xfe3c16ed.m94160x3017aa(bArr2));
        }
        return false;
    }

    /* renamed from: seekToFlac */
    private static boolean m94169xe9a3cd1b(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c interfaceC25408x4aa5146c) {
        byte[] bArr = new byte[4];
        interfaceC25408x4aa5146c.mo94150xbc0c0475(bArr, 0, 4);
        if (bArr[0] == 73 && bArr[1] == 68 && bArr[2] == 51) {
            interfaceC25408x4aa5146c.mo94158x35e57f(2L);
            interfaceC25408x4aa5146c.mo94158x35e57f(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25413xc342967a.m94174x220ce7c1(interfaceC25408x4aa5146c.mo94151x40655679()));
            interfaceC25408x4aa5146c.mo94150xbc0c0475(bArr, 0, 4);
        }
        return bArr[0] == 102 && bArr[1] == 76 && bArr[2] == 97 && bArr[3] == 67;
    }

    /* renamed from: walkThrough */
    private static boolean m94170xd19dacbc(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c interfaceC25408x4aa5146c, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.BlockHandler... blockHandlerArr) {
        byte[] bArr = new byte[1];
        byte[] bArr2 = new byte[3];
        java.util.HashSet hashSet = new java.util.HashSet();
        while (hashSet.size() < blockHandlerArr.length && interfaceC25408x4aa5146c.mo94149xd4418ac9() > 0) {
            interfaceC25408x4aa5146c.mo94150xbc0c0475(bArr, 0, 1);
            int i17 = bArr[0] & Byte.MAX_VALUE;
            int length = blockHandlerArr.length;
            int i18 = 0;
            boolean z17 = false;
            while (true) {
                if (i18 >= length) {
                    break;
                }
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.BlockHandler blockHandler = blockHandlerArr[i18];
                boolean mo94172xb7026e28 = blockHandler.mo94172xb7026e28(interfaceC25408x4aa5146c, i17);
                if (mo94172xb7026e28) {
                    hashSet.add(java.lang.Integer.valueOf(blockHandler.hashCode()));
                    z17 = mo94172xb7026e28;
                    break;
                }
                i18++;
                z17 = mo94172xb7026e28;
            }
            if (!z17) {
                if (((bArr[0] & 255) >> 7) == 1) {
                    break;
                }
                interfaceC25408x4aa5146c.mo94150xbc0c0475(bArr2, 0, 3);
                interfaceC25408x4aa5146c.mo94158x35e57f(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25411xfe3c16ed.m94160x3017aa(bArr2));
            }
        }
        return hashSet.size() == blockHandlerArr.length;
    }

    /* renamed from: getOffsetRangeOfSample */
    public long[] m94171xe3f371b5(int i17) {
        int m94167xb25dd883 = m94167xb25dd883(this.f45984xc95ddd40, i17, true, true);
        int i18 = m94167xb25dd883 + 1;
        long[] jArr = this.f45983xa3b52e40;
        if (i18 >= jArr.length) {
            return new long[]{this.f45982x44b8bb90 + jArr[m94167xb25dd883], -1};
        }
        long j17 = this.f45982x44b8bb90;
        return new long[]{jArr[m94167xb25dd883] + j17, j17 + jArr[i18]};
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25410xa83fe816
    /* renamed from: parse */
    public void mo94147x6581ab3(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.C25409x5a03bad5 c25409x5a03bad5 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.C25409x5a03bad5(interfaceC25439x37e1318e);
        if (m94169xe9a3cd1b(c25409x5a03bad5)) {
            if (!m94170xd19dacbc(c25409x5a03bad5, this.f45985x88751aa == 0 ? new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.BlockHandler[]{new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.SeektableHandler(), new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.StreamInfoHandler()} : new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.BlockHandler[]{new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2911x2fff68.C25412x213ed8e.SeektableHandler()})) {
                throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.C25406x57b29a3b("lack one or more critical BLOCK(s) to create seek table!");
            }
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25410xa83fe816
    /* renamed from: seek */
    public long mo94148x35ce78(long j17) {
        return this.f45982x44b8bb90 + this.f45983xa3b52e40[m94167xb25dd883(this.f45984xc95ddd40, (int) (java.lang.Math.round(j17 / 1000.0d) * this.f45985x88751aa), true, true)];
    }
}
