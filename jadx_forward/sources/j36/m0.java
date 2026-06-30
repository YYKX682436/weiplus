package j36;

/* loaded from: classes13.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f379069a = 128;

    /* renamed from: b, reason: collision with root package name */
    public int f379070b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f379071c = 0;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f379072d = new byte[128];

    /* renamed from: e, reason: collision with root package name */
    public int f379073e = 0;

    public void a(byte[] bArr, int i17) {
        if (i17 > this.f379069a - 4) {
            int i18 = i17 + 4 + 64;
            this.f379069a = i18;
            byte[] bArr2 = new byte[i18];
            java.lang.System.arraycopy(this.f379072d, 0, bArr2, 0, this.f379070b);
            this.f379072d = bArr2;
        }
        this.f379071c = i17;
        java.lang.System.arraycopy(bArr, 0, this.f379072d, this.f379070b, i17);
        this.f379070b += i17;
    }

    public void b(int i17) {
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(this.f379072d, this.f379070b, i17);
        int i18 = this.f379070b + 2;
        this.f379070b = i18;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(this.f379072d, i18, 0);
        this.f379070b += 2;
    }

    public byte[] c() {
        int i17 = this.f379070b;
        byte[] bArr = new byte[i17];
        java.lang.System.arraycopy(this.f379072d, 0, bArr, 0, i17);
        return bArr;
    }

    public byte[] d() {
        int i17 = this.f379071c;
        byte[] bArr = new byte[i17];
        java.lang.System.arraycopy(this.f379072d, 4, bArr, 0, i17);
        return bArr;
    }

    public int e(byte[] bArr, int i17, int i18) {
        int i19;
        int f17 = f(bArr, i17, i18, this.f379073e);
        if (f17 < 0 || 4 >= (i19 = i18 - (f17 - i17))) {
            return -1;
        }
        int f18 = p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.f(bArr, f17 + 2);
        this.f379071c = f18;
        int i27 = f18 + 4;
        if (i27 > i19) {
            return -1;
        }
        if (i27 > this.f379069a) {
            int i28 = i27 + 128;
            this.f379069a = i28;
            this.f379072d = new byte[i28];
        }
        this.f379070b = i27;
        java.lang.System.arraycopy(bArr, f17, this.f379072d, 0, i27);
        this.f379073e = p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.f(bArr, f17);
        this.f379071c = i27 - 4;
        if (h().booleanValue()) {
            return f17 + 4 + this.f379071c;
        }
        return -1005;
    }

    public int f(byte[] bArr, int i17, int i18, int i19) {
        int length = bArr.length;
        while (i17 < length) {
            int i27 = i17 + 2;
            if (i27 > length) {
                break;
            }
            if (p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.f(bArr, i17) == i19) {
                return i17;
            }
            if (i27 + 2 > length) {
                break;
            }
            i17 = p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.f(bArr, i27) + 2 + i27;
        }
        return -1;
    }

    public void g() {
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(this.f379072d, 2, this.f379070b - 4);
    }

    public java.lang.Boolean h() {
        return java.lang.Boolean.TRUE;
    }
}
