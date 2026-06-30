package n8;

/* loaded from: classes15.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f416991a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f416992b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f416993c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f416994d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f416995e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, 384, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f416996f = {69, 87, 104, 121, 139, 174, 208, 243, 278, yc1.p.f77525x366c91de, 417, 487, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lab.d.f34388x366c91de, 696, 835, 975, 1114, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.e.f33379x366c91de, 1393};

    public static int a(int i17, int i18) {
        int i19 = i18 / 2;
        if (i17 < 0 || i17 >= 3 || i18 < 0 || i19 >= 19) {
            return -1;
        }
        int i27 = f416992b[i17];
        if (i27 == 44100) {
            return (f416996f[i19] + (i18 % 2)) * 2;
        }
        int i28 = f416995e[i19];
        return i27 == 32000 ? i28 * 6 : i28 * 4;
    }
}
