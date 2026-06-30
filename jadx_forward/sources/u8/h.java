package u8;

/* loaded from: classes15.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final int f506791a = t9.d0.f("vide");

    /* renamed from: b, reason: collision with root package name */
    public static final int f506792b = t9.d0.f("soun");

    /* renamed from: c, reason: collision with root package name */
    public static final int f506793c = t9.d0.f(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24);

    /* renamed from: d, reason: collision with root package name */
    public static final int f506794d = t9.d0.f("sbtl");

    /* renamed from: e, reason: collision with root package name */
    public static final int f506795e = t9.d0.f("subt");

    /* renamed from: f, reason: collision with root package name */
    public static final int f506796f = t9.d0.f("clcp");

    /* renamed from: g, reason: collision with root package name */
    public static final int f506797g;

    static {
        t9.d0.f("cenc");
        f506797g = t9.d0.f("meta");
    }

    public static android.util.Pair a(t9.p pVar, int i17) {
        java.lang.String str;
        pVar.w(i17 + 8 + 4);
        pVar.x(1);
        b(pVar);
        pVar.x(2);
        int m17 = pVar.m();
        if ((m17 & 128) != 0) {
            pVar.x(2);
        }
        if ((m17 & 64) != 0) {
            pVar.x(pVar.r());
        }
        if ((m17 & 32) != 0) {
            pVar.x(2);
        }
        pVar.x(1);
        b(pVar);
        int m18 = pVar.m();
        if (m18 == 32) {
            str = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54281xbe3b50e9;
        } else if (m18 == 33) {
            str = "video/avc";
        } else if (m18 != 35) {
            if (m18 != 64) {
                str = null;
                if (m18 == 107) {
                    return android.util.Pair.create(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54258x7b032c6e, null);
                }
                if (m18 == 96 || m18 == 97) {
                    str = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54283x92f0a69;
                } else if (m18 == 165) {
                    str = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54244xb1630448;
                } else if (m18 != 166) {
                    switch (m18) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (m18) {
                                case be1.r.f4230x366c91de /* 169 */:
                                case 172:
                                    return android.util.Pair.create(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54250xb16311ba, null);
                                case 170:
                                case 171:
                                    return android.util.Pair.create(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54252xb7cd49a1, null);
                            }
                    }
                } else {
                    str = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54253xe4f8678e;
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        pVar.x(12);
        pVar.x(1);
        int b17 = b(pVar);
        byte[] bArr = new byte[b17];
        pVar.b(bArr, 0, b17);
        return android.util.Pair.create(str, bArr);
    }

    public static int b(t9.p pVar) {
        int m17 = pVar.m();
        int i17 = m17 & 127;
        while ((m17 & 128) == 128) {
            m17 = pVar.m();
            i17 = (i17 << 7) | (m17 & 127);
        }
        return i17;
    }

    public static android.util.Pair c(t9.p pVar, int i17, int i18) {
        java.lang.Integer num;
        u8.r rVar;
        android.util.Pair create;
        int i19;
        int i27;
        byte[] bArr;
        int i28 = pVar.f498074b;
        while (i28 - i17 < i18) {
            pVar.w(i28);
            int c17 = pVar.c();
            t9.a.b(c17 > 0, "childAtomSize should be positive");
            if (pVar.c() == u8.c.W) {
                int i29 = i28 + 8;
                int i37 = 0;
                int i38 = -1;
                java.lang.String str = null;
                java.lang.Integer num2 = null;
                while (i29 - i28 < c17) {
                    pVar.w(i29);
                    int c18 = pVar.c();
                    int c19 = pVar.c();
                    if (c19 == u8.c.f506726c0) {
                        num2 = java.lang.Integer.valueOf(pVar.c());
                    } else if (c19 == u8.c.X) {
                        pVar.x(4);
                        str = pVar.k(4);
                    } else if (c19 == u8.c.Y) {
                        i38 = i29;
                        i37 = c18;
                    }
                    i29 += c18;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    t9.a.b(num2 != null, "frma atom is mandatory");
                    t9.a.b(i38 != -1, "schi atom is mandatory");
                    int i39 = i38 + 8;
                    while (true) {
                        if (i39 - i38 >= i37) {
                            num = num2;
                            rVar = null;
                            break;
                        }
                        pVar.w(i39);
                        int c27 = pVar.c();
                        if (pVar.c() == u8.c.Z) {
                            int c28 = (pVar.c() >> 24) & 255;
                            pVar.x(1);
                            if (c28 == 0) {
                                pVar.x(1);
                                i19 = 0;
                                i27 = 0;
                            } else {
                                int m17 = pVar.m();
                                int i47 = (m17 & 240) >> 4;
                                i19 = m17 & 15;
                                i27 = i47;
                            }
                            boolean z17 = pVar.m() == 1;
                            int m18 = pVar.m();
                            byte[] bArr2 = new byte[16];
                            pVar.b(bArr2, 0, 16);
                            if (z17 && m18 == 0) {
                                int m19 = pVar.m();
                                byte[] bArr3 = new byte[m19];
                                pVar.b(bArr3, 0, m19);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            rVar = new u8.r(z17, str, m18, bArr2, i27, i19, bArr);
                        } else {
                            i39 += c27;
                        }
                    }
                    t9.a.b(rVar != null, "tenc atom is mandatory");
                    create = android.util.Pair.create(num, rVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i28 += c17;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:432:0x009d, code lost:
    
        if (r9 == 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static u8.q d(u8.a r49, u8.b r50, long r51, com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.drm.C1602x8a6a4379 r53, boolean r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 2056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.h.d(u8.a, u8.b, long, com.google.android.exoplayer2.drm.DrmInitData, boolean, boolean):u8.q");
    }
}
