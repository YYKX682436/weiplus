package p3340xac5a444f.p3341x21ffc6bd.p3342x567c76fa;

/* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase */
/* loaded from: classes16.dex */
public final class C29277xaf0a52d5 {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f427604e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f427605f = new java.lang.String[0];

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f427606g = {"*"};

    /* renamed from: h, reason: collision with root package name */
    public static final p3340xac5a444f.p3341x21ffc6bd.p3342x567c76fa.C29277xaf0a52d5 f427607h = new p3340xac5a444f.p3341x21ffc6bd.p3342x567c76fa.C29277xaf0a52d5();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f427608a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f427609b = new java.util.concurrent.CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f427610c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f427611d;

    public static java.lang.String a(byte[] bArr, byte[][] bArr2, int i17) {
        int i18;
        boolean z17;
        int i19;
        int i27;
        int length = bArr.length;
        int i28 = 0;
        while (i28 < length) {
            int i29 = (i28 + length) / 2;
            while (i29 > -1 && bArr[i29] != 10) {
                i29--;
            }
            int i37 = i29 + 1;
            int i38 = 1;
            while (true) {
                i18 = i37 + i38;
                if (bArr[i18] == 10) {
                    break;
                }
                i38++;
            }
            int i39 = i18 - i37;
            int i47 = i17;
            boolean z18 = false;
            int i48 = 0;
            int i49 = 0;
            while (true) {
                if (z18) {
                    i19 = 46;
                    z17 = false;
                } else {
                    z17 = z18;
                    i19 = bArr2[i47][i48] & 255;
                }
                i27 = i19 - (bArr[i37 + i49] & 255);
                if (i27 == 0) {
                    i49++;
                    i48++;
                    if (i49 == i39) {
                        break;
                    }
                    if (bArr2[i47].length != i48) {
                        z18 = z17;
                    } else {
                        if (i47 == bArr2.length - 1) {
                            break;
                        }
                        i47++;
                        i48 = -1;
                        z18 = true;
                    }
                } else {
                    break;
                }
            }
            if (i27 >= 0) {
                if (i27 <= 0) {
                    int i57 = i39 - i49;
                    int length2 = bArr2[i47].length - i48;
                    while (true) {
                        i47++;
                        if (i47 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i47].length;
                    }
                    if (length2 >= i57) {
                        if (length2 <= i57) {
                            return new java.lang.String(bArr, i37, i39, m36.e.f404922d);
                        }
                    }
                }
                i28 = i18 + 1;
            }
            length = i37 - 1;
        }
        return null;
    }

    public final void b() {
        java.io.InputStream resourceAsStream = p3340xac5a444f.p3341x21ffc6bd.p3342x567c76fa.C29277xaf0a52d5.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        x36.m b17 = x36.v.b(new x36.s(x36.v.f(resourceAsStream)));
        try {
            x36.b0 b0Var = (x36.b0) b17;
            byte[] bArr = new byte[b0Var.mo174957x40655679()];
            b0Var.mo174956xbc4273d4(bArr);
            byte[] bArr2 = new byte[b0Var.mo174957x40655679()];
            b0Var.mo174956xbc4273d4(bArr2);
            synchronized (this) {
                this.f427610c = bArr;
                this.f427611d = bArr2;
            }
            this.f427609b.countDown();
        } finally {
            m36.e.c(b17);
        }
    }
}
