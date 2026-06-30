package wo5;

/* loaded from: classes16.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f529859a;

    /* renamed from: b, reason: collision with root package name */
    public final java.io.InputStream f529860b;

    /* renamed from: c, reason: collision with root package name */
    public int f529861c;

    /* renamed from: d, reason: collision with root package name */
    public int f529862d;

    public f(java.io.InputStream is6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(is6, "is");
        this.f529860b = is6;
        this.f529861c = is6.read();
        this.f529862d = is6.read();
    }

    public final int a(boolean z17) {
        if (this.f529859a == 8) {
            this.f529861c = this.f529862d;
            this.f529862d = this.f529860b.read();
            this.f529859a = 0;
            if (this.f529861c == -1) {
                return -1;
            }
        }
        int i17 = this.f529861c;
        int i18 = this.f529859a;
        int i19 = (i17 >> (7 - i18)) & 1;
        this.f529859a = i18 + 1;
        return i19;
    }

    public final boolean b(java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        return a(true) == 1;
    }

    public final long c(int i17) {
        if (i17 > 64) {
            throw new java.lang.IllegalArgumentException("Can not readByte more then 64 bit");
        }
        long j17 = 0;
        for (int i18 = 0; i18 < i17; i18++) {
            j17 = (j17 << 1) | a(true);
        }
        return j17;
    }

    public final int d(java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        int i17 = 0;
        int i18 = 0;
        while (a(true) == 0) {
            i18++;
        }
        if (i18 > 0) {
            i17 = (int) (((1 << i18) - 1) + c(i18));
        }
        java.lang.String.valueOf(i17);
        return i17;
    }

    public final void e(int i17) {
        if (i17 > 64) {
            throw new java.lang.IllegalArgumentException("Can not skip more then 64 bit");
        }
        for (int i18 = 0; i18 < i17; i18++) {
            a(true);
        }
    }

    public final void f(int i17) {
        int[] iArr = new int[i17];
        int i18 = 8;
        int i19 = 8;
        for (int i27 = 0; i27 < i17; i27++) {
            if (i18 != 0) {
                int i28 = 0;
                while (a(true) == 0) {
                    i28++;
                }
                int c17 = i28 > 0 ? (int) (((1 << i28) - 1) + c(i28)) : 0;
                int i29 = ((c17 >> 1) + (c17 & 1)) * ((r6 << 1) - 1);
                java.lang.String.valueOf(i29);
                i18 = ((i29 + i19) + 256) % 256;
            }
            if (i18 != 0) {
                i19 = i18;
            }
            iArr[i27] = i19;
        }
    }

    public final void g(java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        int i17 = 0;
        while (a(true) == 0) {
            i17++;
        }
        if (i17 > 0) {
            e(i17);
        }
    }
}
