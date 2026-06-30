package q8;

/* loaded from: classes15.dex */
public final class j {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f442159h = {com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54259x1650c2d6, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54260x1650c2d7, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54258x7b032c6e};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f442160i = {44100, 48000, 32000};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f442161j = {32, 64, 96, 128, 160, 192, 224, 256, 288, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.r.f34562x366c91de, 384, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60852x9b1ed3e8, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f442162k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f442163l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, 384};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f442164m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f442165n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* renamed from: a, reason: collision with root package name */
    public int f442166a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f442167b;

    /* renamed from: c, reason: collision with root package name */
    public int f442168c;

    /* renamed from: d, reason: collision with root package name */
    public int f442169d;

    /* renamed from: e, reason: collision with root package name */
    public int f442170e;

    /* renamed from: f, reason: collision with root package name */
    public int f442171f;

    /* renamed from: g, reason: collision with root package name */
    public int f442172g;

    public static int a(int i17) {
        int i18;
        int i19;
        int i27;
        int i28;
        if ((i17 & (-2097152)) != -2097152 || (i18 = (i17 >>> 19) & 3) == 1 || (i19 = (i17 >>> 17) & 3) == 0 || (i27 = (i17 >>> 12) & 15) == 0 || i27 == 15 || (i28 = (i17 >>> 10) & 3) == 3) {
            return -1;
        }
        int i29 = f442160i[i28];
        if (i18 == 2) {
            i29 /= 2;
        } else if (i18 == 0) {
            i29 /= 4;
        }
        int i37 = (i17 >>> 9) & 1;
        if (i19 == 3) {
            return ((((i18 == 3 ? f442161j[i27 - 1] : f442162k[i27 - 1]) * 12000) / i29) + i37) * 4;
        }
        int i38 = i18 == 3 ? i19 == 2 ? f442163l[i27 - 1] : f442164m[i27 - 1] : f442165n[i27 - 1];
        if (i18 == 3) {
            return ((i38 * 144000) / i29) + i37;
        }
        return (((i19 == 1 ? 72000 : 144000) * i38) / i29) + i37;
    }

    public static boolean b(int i17, q8.j jVar) {
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        int i38;
        int i39;
        if ((i17 & (-2097152)) != -2097152 || (i18 = (i17 >>> 19) & 3) == 1 || (i19 = (i17 >>> 17) & 3) == 0 || (i27 = (i17 >>> 12) & 15) == 0 || i27 == 15 || (i28 = (i17 >>> 10) & 3) == 3) {
            return false;
        }
        int i47 = f442160i[i28];
        if (i18 == 2) {
            i47 /= 2;
        } else if (i18 == 0) {
            i47 /= 4;
        }
        int i48 = (i17 >>> 9) & 1;
        if (i19 == 3) {
            i29 = i18 == 3 ? f442161j[i27 - 1] : f442162k[i27 - 1];
            i38 = (((i29 * 12000) / i47) + i48) * 4;
            i39 = 384;
        } else {
            int i49 = dc1.e.f65819x366c91de;
            if (i18 == 3) {
                i29 = i19 == 2 ? f442163l[i27 - 1] : f442164m[i27 - 1];
                i37 = (144000 * i29) / i47;
            } else {
                i29 = f442165n[i27 - 1];
                if (i19 == 1) {
                    i49 = 576;
                }
                i37 = ((i19 == 1 ? 72000 : 144000) * i29) / i47;
            }
            i38 = i37 + i48;
            i39 = i49;
        }
        java.lang.String str = f442159h[3 - i19];
        int i57 = ((i17 >> 6) & 3) == 3 ? 1 : 2;
        jVar.f442166a = i18;
        jVar.f442167b = str;
        jVar.f442168c = i38;
        jVar.f442169d = i47;
        jVar.f442170e = i57;
        jVar.f442171f = i29 * 1000;
        jVar.f442172g = i39;
        return true;
    }
}
