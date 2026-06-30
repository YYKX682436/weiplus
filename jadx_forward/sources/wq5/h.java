package wq5;

/* loaded from: classes13.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public long f530236a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f530237b;

    /* renamed from: c, reason: collision with root package name */
    public long f530238c;

    /* renamed from: d, reason: collision with root package name */
    public long f530239d;

    /* renamed from: e, reason: collision with root package name */
    public char f530240e;

    /* renamed from: f, reason: collision with root package name */
    public final java.io.Reader f530241f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f530242g;

    /* renamed from: h, reason: collision with root package name */
    public long f530243h;

    public h(java.io.Reader reader) {
        this.f530241f = reader.markSupported() ? reader : new java.io.BufferedReader(reader);
        this.f530237b = false;
        this.f530242g = false;
        this.f530240e = (char) 0;
        this.f530238c = 0L;
        this.f530236a = 1L;
        this.f530243h = 0L;
        this.f530239d = 1L;
    }

    public void a() {
        if (!this.f530242g) {
            long j17 = this.f530238c;
            if (j17 > 0) {
                this.f530238c = j17 - 1;
                char c17 = this.f530240e;
                if (c17 == '\r' || c17 == '\n') {
                    this.f530239d--;
                    this.f530236a = this.f530243h;
                } else {
                    long j18 = this.f530236a;
                    if (j18 > 0) {
                        this.f530236a = j18 - 1;
                    }
                }
                this.f530242g = true;
                this.f530237b = false;
                return;
            }
        }
        throw new wq5.b("Stepping back two steps is not supported");
    }

    public boolean b() {
        java.io.Reader reader = this.f530241f;
        if (this.f530242g) {
            return true;
        }
        try {
            reader.mark(1);
            try {
                if (reader.read() <= 0) {
                    this.f530237b = true;
                    return false;
                }
                reader.reset();
                return true;
            } catch (java.io.IOException e17) {
                throw new wq5.b("Unable to read the next character from the stream", e17);
            }
        } catch (java.io.IOException e18) {
            throw new wq5.b("Unable to preserve stream position", e18);
        }
    }

    public char c() {
        int read;
        if (this.f530242g) {
            this.f530242g = false;
            read = this.f530240e;
        } else {
            try {
                read = this.f530241f.read();
            } catch (java.io.IOException e17) {
                throw new wq5.b(e17);
            }
        }
        if (read <= 0) {
            this.f530237b = true;
            return (char) 0;
        }
        if (read > 0) {
            this.f530238c++;
            if (read == 13) {
                this.f530239d++;
                this.f530243h = this.f530236a;
                this.f530236a = 0L;
            } else if (read == 10) {
                if (this.f530240e != '\r') {
                    this.f530239d++;
                    this.f530243h = this.f530236a;
                }
                this.f530236a = 0L;
            } else {
                this.f530236a++;
            }
        }
        char c17 = (char) read;
        this.f530240e = c17;
        return c17;
    }

    public char d() {
        char c17;
        do {
            c17 = c();
            if (c17 == 0) {
                break;
            }
        } while (c17 <= ' ');
        return c17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x016e, code lost:
    
        throw f("Substring bounds error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x01c5, code lost:
    
        throw f("Unterminated string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e() {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wq5.h.e():java.lang.Object");
    }

    public wq5.b f(java.lang.String str) {
        return new wq5.b(str + m174331x9616526c());
    }

    /* renamed from: toString */
    public java.lang.String m174331x9616526c() {
        return " at " + this.f530238c + " [character " + this.f530236a + " line " + this.f530239d + "]";
    }
}
