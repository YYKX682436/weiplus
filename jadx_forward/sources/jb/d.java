package jb;

/* loaded from: classes16.dex */
public class d implements java.io.Closeable, java.io.Flushable {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String[] f380200p = new java.lang.String[128];

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String[] f380201q;

    /* renamed from: d, reason: collision with root package name */
    public final java.io.Writer f380202d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f380203e;

    /* renamed from: f, reason: collision with root package name */
    public int f380204f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f380205g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380206h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f380207i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f380208m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f380209n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f380210o;

    static {
        for (int i17 = 0; i17 <= 31; i17++) {
            f380200p[i17] = java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(i17));
        }
        java.lang.String[] strArr = f380200p;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        java.lang.String[] strArr2 = (java.lang.String[]) strArr.clone();
        f380201q = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public d(java.io.Writer writer) {
        int[] iArr = new int[32];
        this.f380203e = iArr;
        this.f380204f = 0;
        if (iArr.length == 0) {
            this.f380203e = java.util.Arrays.copyOf(iArr, 0 * 2);
        }
        int[] iArr2 = this.f380203e;
        int i17 = this.f380204f;
        this.f380204f = i17 + 1;
        iArr2[i17] = 6;
        this.f380206h = ":";
        this.f380210o = true;
        if (writer == null) {
            throw new java.lang.NullPointerException("out == null");
        }
        this.f380202d = writer;
    }

    public jb.d A(java.lang.String str) {
        if (str == null) {
            return p();
        }
        D();
        a();
        v(str);
        return this;
    }

    public jb.d C(boolean z17) {
        D();
        a();
        this.f380202d.write(z17 ? "true" : "false");
        return this;
    }

    public final void D() {
        if (this.f380209n != null) {
            int q17 = q();
            if (q17 == 5) {
                this.f380202d.write(44);
            } else if (q17 != 3) {
                throw new java.lang.IllegalStateException("Nesting problem.");
            }
            l();
            this.f380203e[this.f380204f - 1] = 4;
            v(this.f380209n);
            this.f380209n = null;
        }
    }

    public final void a() {
        int q17 = q();
        if (q17 == 1) {
            this.f380203e[this.f380204f - 1] = 2;
            l();
            return;
        }
        java.io.Writer writer = this.f380202d;
        if (q17 == 2) {
            writer.append(',');
            l();
        } else {
            if (q17 == 4) {
                writer.append((java.lang.CharSequence) this.f380206h);
                this.f380203e[this.f380204f - 1] = 5;
                return;
            }
            if (q17 != 6) {
                if (q17 != 7) {
                    throw new java.lang.IllegalStateException("Nesting problem.");
                }
                if (!this.f380207i) {
                    throw new java.lang.IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f380203e[this.f380204f - 1] = 7;
        }
    }

    public jb.d b() {
        D();
        a();
        int i17 = this.f380204f;
        int[] iArr = this.f380203e;
        if (i17 == iArr.length) {
            this.f380203e = java.util.Arrays.copyOf(iArr, i17 * 2);
        }
        int[] iArr2 = this.f380203e;
        int i18 = this.f380204f;
        this.f380204f = i18 + 1;
        iArr2[i18] = 1;
        this.f380202d.write(91);
        return this;
    }

    public jb.d c() {
        D();
        a();
        int i17 = this.f380204f;
        int[] iArr = this.f380203e;
        if (i17 == iArr.length) {
            this.f380203e = java.util.Arrays.copyOf(iArr, i17 * 2);
        }
        int[] iArr2 = this.f380203e;
        int i18 = this.f380204f;
        this.f380204f = i18 + 1;
        iArr2[i18] = 3;
        this.f380202d.write(123);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f380202d.close();
        int i17 = this.f380204f;
        if (i17 > 1 || (i17 == 1 && this.f380203e[i17 - 1] != 7)) {
            throw new java.io.IOException("Incomplete document");
        }
        this.f380204f = 0;
    }

    public final jb.d f(int i17, int i18, char c17) {
        int q17 = q();
        if (q17 != i18 && q17 != i17) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        if (this.f380209n != null) {
            throw new java.lang.IllegalStateException("Dangling name: " + this.f380209n);
        }
        this.f380204f--;
        if (q17 == i18) {
            l();
        }
        this.f380202d.write(c17);
        return this;
    }

    public void flush() {
        if (this.f380204f == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        this.f380202d.flush();
    }

    public jb.d i() {
        f(1, 2, ']');
        return this;
    }

    public jb.d j() {
        f(3, 5, '}');
        return this;
    }

    public jb.d k(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("name == null");
        }
        if (this.f380209n != null) {
            throw new java.lang.IllegalStateException();
        }
        if (this.f380204f == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        this.f380209n = str;
        return this;
    }

    public final void l() {
        if (this.f380205g == null) {
            return;
        }
        java.io.Writer writer = this.f380202d;
        writer.write(10);
        int i17 = this.f380204f;
        for (int i18 = 1; i18 < i17; i18++) {
            writer.write(this.f380205g);
        }
    }

    public jb.d p() {
        if (this.f380209n != null) {
            if (!this.f380210o) {
                this.f380209n = null;
                return this;
            }
            D();
        }
        a();
        this.f380202d.write("null");
        return this;
    }

    public final int q() {
        int i17 = this.f380204f;
        if (i17 != 0) {
            return this.f380203e[i17 - 1];
        }
        throw new java.lang.IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f380208m
            if (r0 == 0) goto L7
            java.lang.String[] r0 = jb.d.f380201q
            goto L9
        L7:
            java.lang.String[] r0 = jb.d.f380200p
        L9:
            java.io.Writer r1 = r8.f380202d
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.d.v(java.lang.String):void");
    }

    public jb.d w(long j17) {
        D();
        a();
        this.f380202d.write(java.lang.Long.toString(j17));
        return this;
    }

    public jb.d x(java.lang.Boolean bool) {
        if (bool == null) {
            return p();
        }
        D();
        a();
        this.f380202d.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public jb.d z(java.lang.Number number) {
        if (number == null) {
            return p();
        }
        D();
        java.lang.String obj = number.toString();
        if (this.f380207i || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            a();
            this.f380202d.append((java.lang.CharSequence) obj);
            return this;
        }
        throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was " + number);
    }
}
