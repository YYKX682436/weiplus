package h36;

/* loaded from: classes13.dex */
public abstract class f {

    /* renamed from: h, reason: collision with root package name */
    public static int f360120h;

    /* renamed from: a, reason: collision with root package name */
    public int f360121a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public int f360122b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f360123c = 0;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f360124d = new byte[4096];

    /* renamed from: e, reason: collision with root package name */
    public int f360125e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f360126f = 0;

    /* renamed from: g, reason: collision with root package name */
    public h36.h f360127g;

    public byte[] a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length + this.f360127g.f360129b.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = this.f360127g.f360129b;
        java.lang.System.arraycopy(bArr3, 0, bArr2, bArr.length, bArr3.length);
        return bArr2;
    }

    public byte[] b(byte[] bArr, int i17, int i18) {
        int length = bArr.length + 4;
        byte[] bArr2 = new byte[length];
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr2, 0, i17);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr2, 2, i18);
        java.lang.System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        byte[] b17 = k36.e.b(bArr2, 0, length, this.f360127g.f360130c);
        int length2 = b17.length;
        byte[] bArr3 = this.f360127g.f360130c;
        byte[] bArr4 = new byte[length2 + bArr3.length];
        java.lang.System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        java.lang.System.arraycopy(b17, 0, bArr4, this.f360127g.f360130c.length, b17.length);
        return bArr4;
    }

    public void c(byte[] bArr, int i17, int i18) {
        j36.e0 e0Var = new j36.e0();
        if (e0Var.e(bArr, i17, i18) < 0) {
            p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29275x7c39dbfc c29275x7c39dbfc = this.f360127g.f360150w;
            c29275x7c39dbfc.f427192d = 0;
            c29275x7c39dbfc.f427193e = "";
            c29275x7c39dbfc.f427194f = "";
            c29275x7c39dbfc.f427195g = "";
            return;
        }
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29275x7c39dbfc c29275x7c39dbfc2 = this.f360127g.f360150w;
        int i19 = e0Var.f379066f;
        byte[] bArr2 = new byte[i19];
        java.lang.System.arraycopy(e0Var.f379072d, 10, bArr2, 0, i19);
        c29275x7c39dbfc2.f427193e = new java.lang.String(bArr2);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29275x7c39dbfc c29275x7c39dbfc3 = this.f360127g.f360150w;
        int i27 = e0Var.f379067g;
        byte[] bArr3 = new byte[i27];
        java.lang.System.arraycopy(e0Var.f379072d, e0Var.f379066f + 12, bArr3, 0, i27);
        c29275x7c39dbfc3.f427194f = new java.lang.String(bArr3);
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29275x7c39dbfc c29275x7c39dbfc4 = this.f360127g.f360150w;
        int i28 = e0Var.f379068h;
        byte[] bArr4 = new byte[i28];
        java.lang.System.arraycopy(e0Var.f379072d, e0Var.f379066f + 16 + e0Var.f379067g, bArr4, 0, i28);
        c29275x7c39dbfc4.f427195g = new java.lang.String(bArr4);
    }

    public void d(int i17, int i18, int i19, long j17, int i27, int i28, int i29, int i37, byte[] bArr) {
        int length = bArr.length;
        int i38 = f360120h + 1;
        f360120h = i38;
        byte[] bArr2 = this.f360124d;
        bArr2[0] = (byte) 2;
        int i39 = 0 + 1;
        this.f360122b = i39;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(bArr2, i39, length + 29);
        int i47 = this.f360122b + 2;
        this.f360122b = i47;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(this.f360124d, i47, i17);
        int i48 = this.f360122b + 2;
        this.f360122b = i48;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(this.f360124d, i48, i18);
        int i49 = this.f360122b + 2;
        this.f360122b = i49;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.q(this.f360124d, i49, i38);
        int i57 = this.f360122b + 2;
        this.f360122b = i57;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(this.f360124d, i57, (int) j17);
        int i58 = this.f360122b + 4;
        byte[] bArr3 = this.f360124d;
        byte b17 = (byte) 3;
        bArr3[i58 + 0] = b17;
        int i59 = i58 + 1;
        bArr3[i59 + 0] = (byte) 0;
        int i66 = i59 + 1;
        bArr3[i66 + 0] = (byte) (i27 >> 0);
        int i67 = i66 + 1;
        this.f360122b = i67;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(bArr3, i67, i28);
        int i68 = this.f360122b + 4;
        this.f360122b = i68;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(this.f360124d, i68, i29);
        int i69 = this.f360122b + 4;
        this.f360122b = i69;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.r(this.f360124d, i69, i37);
        int i76 = this.f360122b + 4;
        this.f360122b = i76;
        int i77 = length + i76 + 1;
        if (i77 > this.f360121a) {
            int i78 = i77 + 128;
            this.f360121a = i78;
            byte[] bArr4 = new byte[i78];
            java.lang.System.arraycopy(this.f360124d, 0, bArr4, 0, i76);
            this.f360124d = bArr4;
        }
        java.lang.System.arraycopy(bArr, 0, this.f360124d, this.f360122b, length);
        int i79 = this.f360122b + length;
        this.f360124d[i79 + 0] = b17;
        this.f360122b = i79 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int e(byte[] r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 1539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h36.f.e(byte[], int, int):int");
    }

    public void f(p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29275x7c39dbfc c29275x7c39dbfc) {
        h36.h hVar = this.f360127g;
        p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29275x7c39dbfc c29275x7c39dbfc2 = hVar.f360150w;
        c29275x7c39dbfc2.f427192d = 0;
        c29275x7c39dbfc2.f427193e = "";
        c29275x7c39dbfc2.f427194f = "";
        c29275x7c39dbfc2.f427195g = "";
        if (c29275x7c39dbfc != null) {
            try {
                hVar.f360150w = (p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29275x7c39dbfc) c29275x7c39dbfc.m151453x5a5dd5d();
            } catch (java.lang.CloneNotSupportedException e17) {
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.Writer) stringWriter, true);
                e17.printStackTrace(printWriter);
                printWriter.flush();
                stringWriter.flush();
                p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29276x36f002.d("exception", stringWriter.toString());
                p3335x340bc8.p3336x27ae93cd.p3339x696c9db.C29275x7c39dbfc c29275x7c39dbfc3 = this.f360127g.f360150w;
                c29275x7c39dbfc3.f427192d = 0;
                c29275x7c39dbfc3.f427193e = "";
                c29275x7c39dbfc3.f427194f = "";
                c29275x7c39dbfc3.f427195g = "";
            }
        }
    }
}
