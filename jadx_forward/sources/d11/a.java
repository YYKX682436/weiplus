package d11;

/* loaded from: classes10.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d11.w[] f307187a;

    static {
        f307187a = r0;
        d11.w[] wVarArr = {new d11.w(0, 120, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48866x28b7342c, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, 30, 1200000, 1200000), new d11.w(120, 300, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3, 640, 24, 544000, 544000)};
    }

    public static boolean a() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20056xe8668d66()) == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0003, code lost:
    
        if (r2.length <= 0) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(d11.w[] r2, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d r3, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d r4) {
        /*
            r1 = this;
            if (r2 == 0) goto L5
            int r0 = r2.length     // Catch: java.lang.Exception -> Ld
            if (r0 > 0) goto L7
        L5:
            d11.w[] r2 = d11.a.f307187a     // Catch: java.lang.Exception -> Ld
        L7:
            int r0 = r2.length     // Catch: java.lang.Exception -> Ld
            int r2 = r1.c(r0, r2, r3, r4)     // Catch: java.lang.Exception -> Ld
            goto L26
        Ld:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "do calc bitrate error: "
            r3.<init>(r4)
            java.lang.String r2 = r2.toString()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "MicroMsg.BitrateCalculator"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r2)
            r2 = 0
        L26:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d11.a.b(d11.w[], com.tencent.mm.modelcontrol.VideoTransPara, com.tencent.mm.modelcontrol.VideoTransPara):int");
    }

    public final int c(int i17, d11.w[] wVarArr, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2) {
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        c11120x15dce88d2.f152724d = c11120x15dce88d.f152724d;
        c11120x15dce88d2.f152725e = c11120x15dce88d.f152725e;
        c11120x15dce88d2.f152726f = c11120x15dce88d.f152726f;
        c11120x15dce88d2.f152727g = c11120x15dce88d.f152727g;
        int i38 = c11120x15dce88d.f152728h;
        c11120x15dce88d2.f152728h = i38;
        int i39 = c11120x15dce88d.f152724d;
        int i47 = c11120x15dce88d.f152725e;
        boolean z17 = i39 > i47;
        int i48 = z17 ? i39 : i47;
        if (z17) {
            i39 = i47;
        }
        int i49 = c11120x15dce88d.f152728h;
        int i57 = wVarArr[i17 - 1].f307235e;
        d11.w[] wVarArr2 = f307187a;
        if (i38 >= i57 && i38 >= wVarArr2[1].f307235e) {
            return 0;
        }
        for (int i58 = 0; i58 < i17; i58++) {
            d11.w wVar = wVarArr[i58];
            if (i49 >= wVar.f307234d && i49 < (i28 = wVar.f307235e)) {
                int i59 = wVar.f307236f;
                int i66 = wVar.f307237g;
                if (i48 > i59 || i39 > i66) {
                    int i67 = i48 * i66;
                    int i68 = i39 * i59;
                    if (i67 > i68) {
                        i37 = i68 / i48;
                        i29 = i59;
                    } else {
                        i29 = i67 / i39;
                        i37 = i66;
                    }
                    i48 = ((i29 + 8) >> 4) << 4;
                    i39 = ((i37 + 8) >> 4) << 4;
                }
                c11120x15dce88d2.f152724d = z17 ? i48 : i39;
                if (!z17) {
                    i39 = i48;
                }
                c11120x15dce88d2.f152725e = i39;
                int i69 = c11120x15dce88d2.f152726f;
                int i76 = wVar.f307238h;
                if (i69 > i76) {
                    i69 = i76;
                }
                c11120x15dce88d2.f152726f = i69;
                int i77 = wVar.f307239i;
                int i78 = wVar.f307240m;
                int i79 = c11120x15dce88d2.f152728h;
                int sqrt = (int) ((((((((i77 * i28) + (i78 * i79)) - (i77 * i79)) - (i78 * r15)) / (i28 - r15)) * java.lang.Math.sqrt(((r3 * i39) * 1.0d) / (i59 * i66))) * (c11120x15dce88d2.f152726f + 10)) / 40.0d);
                c11120x15dce88d2.f152727g = sqrt;
                return sqrt;
            }
        }
        for (int i86 = 0; i86 < 2; i86++) {
            d11.w wVar2 = wVarArr2[i86];
            if (i49 >= wVar2.f307234d && i49 < (i18 = wVar2.f307235e)) {
                int i87 = wVar2.f307236f;
                int i88 = wVar2.f307237g;
                if (i48 > i87 || i39 > i88) {
                    int i89 = i48 * i88;
                    int i96 = i39 * i87;
                    if (i89 > i96) {
                        i27 = i96 / i48;
                        i19 = i87;
                    } else {
                        i19 = i89 / i39;
                        i27 = i88;
                    }
                    i48 = ((i19 + 8) >> 4) << 4;
                    i39 = ((i27 + 8) >> 4) << 4;
                }
                c11120x15dce88d2.f152724d = z17 ? i48 : i39;
                if (!z17) {
                    i39 = i48;
                }
                c11120x15dce88d2.f152725e = i39;
                int i97 = c11120x15dce88d2.f152726f;
                int i98 = wVar2.f307238h;
                if (i97 > i98) {
                    i97 = i98;
                }
                c11120x15dce88d2.f152726f = i97;
                int i99 = wVar2.f307239i;
                int i100 = wVar2.f307240m;
                int i101 = c11120x15dce88d2.f152728h;
                int sqrt2 = (int) ((((((((i99 * i18) + (i100 * i101)) - (i99 * i101)) - (i100 * r5)) / (i18 - r5)) * java.lang.Math.sqrt(((r7 * i39) * 1.0d) / (i87 * i88))) * (c11120x15dce88d2.f152726f + 10)) / 40.0d);
                c11120x15dce88d2.f152727g = sqrt2;
                return sqrt2;
            }
        }
        return 0;
    }
}
