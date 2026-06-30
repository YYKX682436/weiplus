package o9;

/* loaded from: classes15.dex */
public final class a extends i9.b {

    /* renamed from: t, reason: collision with root package name */
    public static final int f425210t = t9.d0.f("styl");

    /* renamed from: u, reason: collision with root package name */
    public static final int f425211u = t9.d0.f("tbox");

    /* renamed from: m, reason: collision with root package name */
    public final t9.p f425212m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f425213n;

    /* renamed from: o, reason: collision with root package name */
    public int f425214o;

    /* renamed from: p, reason: collision with root package name */
    public int f425215p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f425216q;

    /* renamed from: r, reason: collision with root package name */
    public float f425217r;

    /* renamed from: s, reason: collision with root package name */
    public int f425218s;

    public a(java.util.List list) {
        super("Tx3gDecoder");
        this.f425212m = new t9.p();
        if (list == null || list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f425214o = 0;
            this.f425215p = -1;
            this.f425216q = "sans-serif";
            this.f425213n = false;
            this.f425217r = 0.85f;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f425214o = bArr[24];
        this.f425215p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f425216q = "Serif".equals(new java.lang.String(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i17 = bArr[25] * 20;
        this.f425218s = i17;
        boolean z17 = (bArr[0] & 32) != 0;
        this.f425213n = z17;
        if (!z17) {
            this.f425217r = 0.85f;
            return;
        }
        float f17 = ((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i17;
        this.f425217r = f17;
        this.f425217r = java.lang.Math.max(0.0f, java.lang.Math.min(f17, 0.95f));
    }

    public static void g(android.text.SpannableStringBuilder spannableStringBuilder, int i17, int i18, int i19, int i27, int i28) {
        if (i17 != i18) {
            int i29 = i28 | 33;
            boolean z17 = (i17 & 1) != 0;
            boolean z18 = (i17 & 2) != 0;
            if (z17) {
                if (z18) {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(3), i19, i27, i29);
                } else {
                    spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i19, i27, i29);
                }
            } else if (z18) {
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i19, i27, i29);
            }
            boolean z19 = (i17 & 4) != 0;
            if (z19) {
                spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i19, i27, i29);
            }
            if (z19 || z17 || z18) {
                return;
            }
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(0), i19, i27, i29);
        }
    }

    @Override // i9.b
    public i9.d f(byte[] bArr, int i17, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        int i18;
        t9.p pVar = this.f425212m;
        pVar.u(bArr, i17);
        int i19 = 1;
        int i27 = 0;
        if (!(pVar.f498075c - pVar.f498074b >= 2)) {
            throw new i9.f("Unexpected subtitle format.");
        }
        int r17 = pVar.r();
        if (r17 == 0) {
            str2 = "";
        } else {
            int i28 = pVar.f498075c;
            int i29 = pVar.f498074b;
            if (i28 - i29 >= 2) {
                byte[] bArr2 = pVar.f498073a;
                char c17 = (char) ((bArr2[i29 + 1] & 255) | ((bArr2[i29] & 255) << 8));
                if (c17 == 65279 || c17 == 65534) {
                    str = new java.lang.String(pVar.f498073a, pVar.f498074b, r17, java.nio.charset.Charset.forName("UTF-16"));
                    pVar.f498074b += r17;
                    str2 = str;
                }
            }
            str = new java.lang.String(pVar.f498073a, pVar.f498074b, r17, java.nio.charset.Charset.forName(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            pVar.f498074b += r17;
            str2 = str;
        }
        if (str2.isEmpty()) {
            return o9.b.f425219e;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str2);
        g(spannableStringBuilder, this.f425214o, 0, 0, spannableStringBuilder.length(), 16711680);
        int i37 = this.f425215p;
        int length = spannableStringBuilder.length();
        if (i37 != -1) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan((i37 >>> 8) | ((i37 & 255) << 24)), 0, length, 16711713);
        }
        java.lang.String str3 = this.f425216q;
        int length2 = spannableStringBuilder.length();
        if (str3 != "sans-serif") {
            spannableStringBuilder.setSpan(new android.text.style.TypefaceSpan(str3), 0, length2, 16711713);
        }
        float f17 = this.f425217r;
        while (true) {
            int i38 = pVar.f498075c;
            int i39 = pVar.f498074b;
            if (i38 - i39 < 8) {
                return new o9.b(new i9.a(spannableStringBuilder, null, f17, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
            }
            int c18 = pVar.c();
            int c19 = pVar.c();
            if (c19 == f425210t) {
                if ((pVar.f498075c - pVar.f498074b >= 2 ? i19 : i27) == 0) {
                    throw new i9.f("Unexpected subtitle format.");
                }
                int r18 = pVar.r();
                int i47 = i27;
                while (i47 < r18) {
                    if ((pVar.f498075c - pVar.f498074b >= 12 ? i19 : i27) == 0) {
                        throw new i9.f("Unexpected subtitle format.");
                    }
                    int r19 = pVar.r();
                    int r27 = pVar.r();
                    pVar.x(2);
                    int m17 = pVar.m();
                    pVar.x(i19);
                    int c27 = pVar.c();
                    int i48 = i47;
                    int i49 = r18;
                    int i57 = i39;
                    g(spannableStringBuilder, m17, this.f425214o, r19, r27, 0);
                    if (c27 != this.f425215p) {
                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan((c27 >>> 8) | ((c27 & 255) << 24)), r19, r27, 33);
                    }
                    i47 = i48 + 1;
                    r18 = i49;
                    i39 = i57;
                    i19 = 1;
                    i27 = 0;
                }
                i18 = i39;
            } else {
                i18 = i39;
                if (c19 == f425211u && this.f425213n) {
                    if (!(pVar.f498075c - pVar.f498074b >= 2)) {
                        throw new i9.f("Unexpected subtitle format.");
                    }
                    f17 = java.lang.Math.max(0.0f, java.lang.Math.min(pVar.r() / this.f425218s, 0.95f));
                }
            }
            pVar.w(i18 + c18);
            i19 = 1;
            i27 = 0;
        }
    }
}
