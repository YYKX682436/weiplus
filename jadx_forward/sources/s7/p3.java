package s7;

/* loaded from: classes16.dex */
public class p3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f485303a;

    /* renamed from: c, reason: collision with root package name */
    public final int f485305c;

    /* renamed from: b, reason: collision with root package name */
    public int f485304b = 0;

    /* renamed from: d, reason: collision with root package name */
    public final s7.z f485306d = new s7.z();

    public p3(java.lang.String str) {
        this.f485305c = 0;
        java.lang.String trim = str.trim();
        this.f485303a = trim;
        this.f485305c = trim.length();
    }

    public int a() {
        int i17 = this.f485304b;
        int i18 = this.f485305c;
        if (i17 == i18) {
            return -1;
        }
        int i19 = i17 + 1;
        this.f485304b = i19;
        if (i19 < i18) {
            return this.f485303a.charAt(i19);
        }
        return -1;
    }

    public java.lang.Boolean b(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        p();
        int i17 = this.f485304b;
        if (i17 == this.f485305c) {
            return null;
        }
        char charAt = this.f485303a.charAt(i17);
        if (charAt != '0' && charAt != '1') {
            return null;
        }
        this.f485304b++;
        return java.lang.Boolean.valueOf(charAt == '1');
    }

    public float c(float f17) {
        if (java.lang.Float.isNaN(f17)) {
            return Float.NaN;
        }
        p();
        return i();
    }

    public boolean d(char c17) {
        int i17 = this.f485304b;
        boolean z17 = i17 < this.f485305c && this.f485303a.charAt(i17) == c17;
        if (z17) {
            this.f485304b++;
        }
        return z17;
    }

    public boolean e(java.lang.String str) {
        int length = str.length();
        int i17 = this.f485304b;
        boolean z17 = i17 <= this.f485305c - length && this.f485303a.substring(i17, i17 + length).equals(str);
        if (z17) {
            this.f485304b += length;
        }
        return z17;
    }

    public boolean f() {
        return this.f485304b == this.f485305c;
    }

    public boolean g(int i17) {
        return i17 == 32 || i17 == 10 || i17 == 13 || i17 == 9;
    }

    public java.lang.Integer h() {
        int i17 = this.f485304b;
        if (i17 == this.f485305c) {
            return null;
        }
        this.f485304b = i17 + 1;
        return java.lang.Integer.valueOf(this.f485303a.charAt(i17));
    }

    public float i() {
        int i17 = this.f485304b;
        int i18 = this.f485305c;
        s7.z zVar = this.f485306d;
        float a17 = zVar.a(this.f485303a, i17, i18);
        if (!java.lang.Float.isNaN(a17)) {
            this.f485304b = zVar.f485440a;
        }
        return a17;
    }

    public s7.t0 j() {
        float i17 = i();
        if (java.lang.Float.isNaN(i17)) {
            return null;
        }
        s7.q2 n17 = n();
        return n17 == null ? new s7.t0(i17, s7.q2.px) : new s7.t0(i17, n17);
    }

    public java.lang.String k() {
        if (f()) {
            return null;
        }
        int i17 = this.f485304b;
        java.lang.String str = this.f485303a;
        char charAt = str.charAt(i17);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        int a17 = a();
        while (a17 != -1 && a17 != charAt) {
            a17 = a();
        }
        if (a17 == -1) {
            this.f485304b = i17;
            return null;
        }
        int i18 = this.f485304b + 1;
        this.f485304b = i18;
        return str.substring(i17 + 1, i18 - 1);
    }

    public java.lang.String l() {
        return m(' ', false);
    }

    public java.lang.String m(char c17, boolean z17) {
        if (f()) {
            return null;
        }
        int i17 = this.f485304b;
        java.lang.String str = this.f485303a;
        char charAt = str.charAt(i17);
        if ((!z17 && g(charAt)) || charAt == c17) {
            return null;
        }
        int i18 = this.f485304b;
        int a17 = a();
        while (a17 != -1 && a17 != c17 && (z17 || !g(a17))) {
            a17 = a();
        }
        return str.substring(i18, this.f485304b);
    }

    public s7.q2 n() {
        if (f()) {
            return null;
        }
        int i17 = this.f485304b;
        java.lang.String str = this.f485303a;
        if (str.charAt(i17) == '%') {
            this.f485304b++;
            return s7.q2.percent;
        }
        int i18 = this.f485304b;
        if (i18 > this.f485305c - 2) {
            return null;
        }
        try {
            s7.q2 m164022xdce0328 = s7.q2.m164022xdce0328(str.substring(i18, i18 + 2).toLowerCase(java.util.Locale.US));
            this.f485304b += 2;
            return m164022xdce0328;
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public float o() {
        p();
        int i17 = this.f485304b;
        int i18 = this.f485305c;
        s7.z zVar = this.f485306d;
        float a17 = zVar.a(this.f485303a, i17, i18);
        if (!java.lang.Float.isNaN(a17)) {
            this.f485304b = zVar.f485440a;
        }
        return a17;
    }

    public boolean p() {
        q();
        int i17 = this.f485304b;
        if (i17 == this.f485305c || this.f485303a.charAt(i17) != ',') {
            return false;
        }
        this.f485304b++;
        q();
        return true;
    }

    public void q() {
        while (true) {
            int i17 = this.f485304b;
            if (i17 >= this.f485305c || !g(this.f485303a.charAt(i17))) {
                return;
            } else {
                this.f485304b++;
            }
        }
    }
}
