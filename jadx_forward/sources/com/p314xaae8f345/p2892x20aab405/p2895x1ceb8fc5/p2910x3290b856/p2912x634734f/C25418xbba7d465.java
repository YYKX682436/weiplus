package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f;

/* renamed from: com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable */
/* loaded from: classes16.dex */
public class C25418xbba7d465 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25410xa83fe816 {

    /* renamed from: essentialStblChunkMap */
    private final java.util.Map<java.lang.String, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.InterfaceC25423x5d15a765> f46019x681c69a8;

    /* renamed from: mdhd */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25424x2484f3 f46020x3310d3;

    /* renamed from: com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable$Function1 */
    /* loaded from: classes16.dex */
    public interface Function1<T, R> {
        /* renamed from: call */
        R mo94212x2e7a5e(T t17);
    }

    public C25418xbba7d465() {
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f46019x681c69a8 = hashMap;
        hashMap.put("stco", new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25425x277aad());
        hashMap.put("co64", new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25419x201c4a());
        hashMap.put("stts", new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25428x277cc0());
        hashMap.put("stsc", new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25426x277c91());
        hashMap.put("stsz", new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25427x277ca8());
        this.f46020x3310d3 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25424x2484f3();
    }

    /* renamed from: chunkOfSample */
    private static void m94203xeea3bee(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25426x277c91 c25426x277c91, int i17, int[] iArr) {
        boolean z17;
        int m94226x778f87b3 = c25426x277c91.m94226x778f87b3();
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        int i28 = 1;
        while (true) {
            int i29 = c25426x277c91.m94227xe31b4593()[i18];
            int i37 = ((i29 - i28) * i19) + i27;
            if (i17 < i37) {
                z17 = true;
                break;
            }
            i19 = c25426x277c91.m94229xaa4e0843()[i18];
            if (i18 < m94226x778f87b3) {
                i18++;
                i27 = i37;
            }
            if (i18 >= m94226x778f87b3) {
                z17 = false;
                i28 = i29;
                break;
            }
            i28 = i29;
        }
        int i38 = i19 != 0 ? z17 ? ((i17 - i27) / i19) + i28 : i28 : 1;
        iArr[0] = i38;
        iArr[1] = i27 + ((i38 - i28) * i19);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: needMoreChunks */
    public static boolean m94204xb68de091(java.util.HashSet<java.lang.String> hashSet) {
        if (hashSet.size() > 2) {
            return true;
        }
        return hashSet.contains("stco") && hashSet.contains("co64");
    }

    /* renamed from: offset64OfChunk */
    private static long m94205x462d6305(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25419x201c4a c25419x201c4a, int i17) {
        if (i17 > c25419x201c4a.m94217x778f87b3()) {
            return c25419x201c4a.m94216xbafc742a()[c25419x201c4a.m94217x778f87b3() - 1];
        }
        if (c25419x201c4a.m94217x778f87b3() > 0) {
            return c25419x201c4a.m94216xbafc742a()[i17 - 1];
        }
        return 8L;
    }

    /* renamed from: offsetOfChunk */
    private static int m94206x21b8aac3(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25425x277aad c25425x277aad, int i17) {
        if (i17 > c25425x277aad.m94225x778f87b3()) {
            return c25425x277aad.m94224xbafc742a()[c25425x277aad.m94225x778f87b3() - 1];
        }
        if (c25425x277aad.m94225x778f87b3() > 0) {
            return c25425x277aad.m94224xbafc742a()[i17 - 1];
        }
        return 8;
    }

    /* renamed from: offsetOfSampleInChunk */
    private static int m94207xa4a9b594(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25427x277ca8 c25427x277ca8, int i17, int i18) {
        if (c25427x277ca8.m94232xf6c89cc1() != 0) {
            return (i17 - i18) * c25427x277ca8.m94232xf6c89cc1();
        }
        int min = java.lang.Math.min(i17, c25427x277ca8.m94231xe16c2c4f());
        int i19 = 0;
        while (i18 < min) {
            i19 += c25427x277ca8.m94230xe2da44dd()[i18];
            i18++;
        }
        return i19;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.C25406x57b29a3b("invalid box: critical box not found!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005a, code lost:
    
        if (r8.mo94212x2e7a5e(r1).booleanValue() != false) goto L18;
     */
    /* renamed from: parseChunks */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void m94208xbb9d2039(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c r6, java.util.Map<java.lang.String, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.InterfaceC25423x5d15a765> r7, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.C25418xbba7d465.Function1<java.util.HashSet<java.lang.String>, java.lang.Boolean> r8) {
        /*
            com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.GhostBox r0 = new com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.GhostBox
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            java.util.Set r2 = r7.keySet()
            r1.<init>(r2)
        Le:
            if (r8 == 0) goto L1c
            java.lang.Object r2 = r8.mo94212x2e7a5e(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L4e
        L1c:
            int r2 = r1.size()
            if (r2 == 0) goto L4e
            long r2 = r6.mo94149xd4418ac9()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L4e
            r2 = 0
            r0.mo94215x6581ab3(r6, r2)
            java.lang.String r2 = r0.mo94214xfb85f7b0()
            java.lang.Object r3 = r7.get(r2)
            com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes.IMpeg4Box r3 = (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.InterfaceC25423x5d15a765) r3
            if (r3 != 0) goto L47
            long r2 = r0.mo94213xfb854877()
            r4 = 8
            long r2 = r2 - r4
            r6.mo94158x35e57f(r2)
            goto Le
        L47:
            r3.mo94215x6581ab3(r6, r0)
            r1.remove(r2)
            goto Le
        L4e:
            if (r8 == 0) goto L65
            java.lang.Object r6 = r8.mo94212x2e7a5e(r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5d
            goto L65
        L5d:
            com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException r6 = new com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException
            java.lang.String r7 = "invalid box: critical box not found!"
            r6.<init>(r7)
            throw r6
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.C25418xbba7d465.m94208xbb9d2039(com.tencent.qqmusic.mediaplayer.seektable.Parsable, java.util.Map, com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable$Function1):void");
    }

    /* renamed from: sampleOfTime */
    private static int m94209xff130b8e(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25428x277cc0 c25428x277cc0, int i17) {
        int m94233x778f87b3 = c25428x277cc0.m94233x778f87b3();
        boolean z17 = false;
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (true) {
            if (i18 >= m94233x778f87b3) {
                break;
            }
            i27 = c25428x277cc0.m94235xe17596f8()[i18];
            int i28 = c25428x277cc0.m94234xe16c2c4f()[i18];
            int i29 = i28 * i27;
            if (i17 < i29) {
                z17 = true;
                break;
            }
            i17 -= i29;
            i19 += i28;
            i18++;
        }
        return z17 ? i19 + (i17 / i27) : i19;
    }

    /* renamed from: seekInternal */
    private long m94210xb2760155(int i17) {
        long m94205x462d6305;
        int[] iArr = new int[2];
        m94203xeea3bee((com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25426x277c91) this.f46019x681c69a8.get("stsc"), m94209xff130b8e((com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25428x277cc0) this.f46019x681c69a8.get("stts"), i17), iArr);
        int i18 = iArr[0];
        int i19 = iArr[1];
        if (this.f46019x681c69a8.get("stco").mo94213xfb854877() != 0) {
            m94205x462d6305 = m94206x21b8aac3((com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25425x277aad) this.f46019x681c69a8.get("stco"), i18);
        } else {
            if (this.f46019x681c69a8.get("co64").mo94213xfb854877() == 0) {
                throw new java.lang.RuntimeException("invalid stbl: both [stco] nor [co64] was found!");
            }
            m94205x462d6305 = m94205x462d6305((com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25419x201c4a) this.f46019x681c69a8.get("co64"), i18);
        }
        return m94205x462d6305 + m94207xa4a9b594((com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25427x277ca8) this.f46019x681c69a8.get("stsz"), r9, i19);
    }

    /* renamed from: seekTo */
    private static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.InterfaceC25423x5d15a765 m94211xc9fc1b13(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25408x4aa5146c interfaceC25408x4aa5146c, java.lang.String str) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25422x10efc0dc c25422x10efc0dc = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25422x10efc0dc();
        java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(str, ".");
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25422x10efc0dc c25422x10efc0dc2 = null;
        while (stringTokenizer.hasMoreTokens()) {
            java.lang.String nextToken = stringTokenizer.nextToken();
            boolean z17 = false;
            while (true) {
                if (!z17 && interfaceC25408x4aa5146c.mo94149xd4418ac9() > 0) {
                    c25422x10efc0dc.mo94215x6581ab3(interfaceC25408x4aa5146c, null);
                    if (!nextToken.equalsIgnoreCase(c25422x10efc0dc.mo94214xfb85f7b0())) {
                        interfaceC25408x4aa5146c.mo94158x35e57f(c25422x10efc0dc.mo94213xfb854877() - 8);
                    } else {
                        if (!stringTokenizer.hasMoreTokens()) {
                            c25422x10efc0dc2 = c25422x10efc0dc;
                            break;
                        }
                        z17 = true;
                    }
                }
            }
        }
        return c25422x10efc0dc2;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25410xa83fe816
    /* renamed from: parse */
    public void mo94147x6581ab3(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.InterfaceC25439x37e1318e interfaceC25439x37e1318e) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.C25409x5a03bad5 c25409x5a03bad5 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.C25409x5a03bad5(interfaceC25439x37e1318e);
        if (m94211xc9fc1b13(c25409x5a03bad5, "moov.trak.mdia") == null) {
            throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.C25406x57b29a3b("invalid mp4: no [mdia] was found!");
        }
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("mdhd", this.f46020x3310d3);
        hashMap.put("minf", new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.p2913x59943b9.C25422x10efc0dc());
        m94208xbb9d2039(c25409x5a03bad5, hashMap, null);
        if (m94211xc9fc1b13(c25409x5a03bad5, "stbl") == null) {
            throw new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.C25406x57b29a3b("invalid mp4: no [stbl] was found!");
        }
        m94208xbb9d2039(c25409x5a03bad5, this.f46019x681c69a8, new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.C25418xbba7d465.Function1<java.util.HashSet<java.lang.String>, java.lang.Boolean>() { // from class: com.tencent.qqmusic.mediaplayer.seektable.mpeg4.Mp4SeekTable.1
            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.C25418xbba7d465.Function1
            /* renamed from: call, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public java.lang.Boolean mo94212x2e7a5e(java.util.HashSet<java.lang.String> hashSet) {
                return java.lang.Boolean.valueOf(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.p2912x634734f.C25418xbba7d465.m94204xb68de091(hashSet));
            }
        });
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2910x3290b856.InterfaceC25410xa83fe816
    /* renamed from: seek */
    public long mo94148x35ce78(long j17) {
        return m94210xb2760155((int) java.lang.Math.round((this.f46020x3310d3.m94223xebefc7() * j17) / 1000.0d));
    }
}
