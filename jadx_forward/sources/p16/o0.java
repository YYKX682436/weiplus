package p16;

/* loaded from: classes16.dex */
public class o0 extends p16.g {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f432863n;

    /* renamed from: e, reason: collision with root package name */
    public final int f432864e;

    /* renamed from: f, reason: collision with root package name */
    public final p16.g f432865f;

    /* renamed from: g, reason: collision with root package name */
    public final p16.g f432866g;

    /* renamed from: h, reason: collision with root package name */
    public final int f432867h;

    /* renamed from: i, reason: collision with root package name */
    public final int f432868i;

    /* renamed from: m, reason: collision with root package name */
    public int f432869m = 0;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i17 = 1;
        int i18 = 1;
        while (i17 > 0) {
            arrayList.add(java.lang.Integer.valueOf(i17));
            int i19 = i18 + i17;
            i18 = i17;
            i17 = i19;
        }
        arrayList.add(Integer.MAX_VALUE);
        f432863n = new int[arrayList.size()];
        int i27 = 0;
        while (true) {
            int[] iArr = f432863n;
            if (i27 >= iArr.length) {
                return;
            }
            iArr[i27] = ((java.lang.Integer) arrayList.get(i27)).intValue();
            i27++;
        }
    }

    public o0(p16.g gVar, p16.g gVar2) {
        this.f432865f = gVar;
        this.f432866g = gVar2;
        int mo157707x35e001 = gVar.mo157707x35e001();
        this.f432867h = mo157707x35e001;
        this.f432864e = mo157707x35e001 + gVar2.mo157707x35e001();
        this.f432868i = java.lang.Math.max(gVar.j(), gVar2.j()) + 1;
    }

    /* renamed from: equals */
    public boolean m157722xb2c87fbf(java.lang.Object obj) {
        int p17;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p16.g)) {
            return false;
        }
        p16.g gVar = (p16.g) obj;
        int mo157707x35e001 = gVar.mo157707x35e001();
        int i17 = this.f432864e;
        if (i17 != mo157707x35e001) {
            return false;
        }
        if (i17 == 0) {
            return true;
        }
        if (this.f432869m != 0 && (p17 = gVar.p()) != 0 && this.f432869m != p17) {
            return false;
        }
        p16.m0 m0Var = new p16.m0(this, null);
        p16.f0 f0Var = (p16.f0) m0Var.next();
        p16.m0 m0Var2 = new p16.m0(gVar, null);
        p16.f0 f0Var2 = (p16.f0) m0Var2.next();
        int i18 = 0;
        int i19 = 0;
        int i27 = 0;
        while (true) {
            int length = f0Var.f432814e.length - i18;
            int length2 = f0Var2.f432814e.length - i19;
            int min = java.lang.Math.min(length, length2);
            if (!(i18 == 0 ? f0Var.t(f0Var2, i19, min) : f0Var2.t(f0Var, i18, min))) {
                return false;
            }
            i27 += min;
            if (i27 >= i17) {
                if (i27 == i17) {
                    return true;
                }
                throw new java.lang.IllegalStateException();
            }
            if (min == length) {
                f0Var = (p16.f0) m0Var.next();
                i18 = 0;
            } else {
                i18 += min;
            }
            if (min == length2) {
                f0Var2 = (p16.f0) m0Var2.next();
                i19 = 0;
            } else {
                i19 += min;
            }
        }
    }

    @Override // p16.g
    public void h(byte[] bArr, int i17, int i18, int i19) {
        int i27 = i17 + i19;
        p16.g gVar = this.f432865f;
        int i28 = this.f432867h;
        if (i27 <= i28) {
            gVar.h(bArr, i17, i18, i19);
            return;
        }
        p16.g gVar2 = this.f432866g;
        if (i17 >= i28) {
            gVar2.h(bArr, i17 - i28, i18, i19);
            return;
        }
        int i29 = i28 - i17;
        gVar.h(bArr, i17, i18, i29);
        gVar2.h(bArr, 0, i18 + i29, i19 - i29);
    }

    /* renamed from: hashCode */
    public int m157723x8cdac1b() {
        int i17 = this.f432869m;
        if (i17 == 0) {
            int i18 = this.f432864e;
            i17 = n(i18, 0, i18);
            if (i17 == 0) {
                i17 = 1;
            }
            this.f432869m = i17;
        }
        return i17;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new p16.n0(this, null);
    }

    @Override // p16.g
    public int j() {
        return this.f432868i;
    }

    @Override // p16.g
    public boolean k() {
        return this.f432864e >= f432863n[this.f432868i];
    }

    @Override // p16.g
    public boolean l() {
        int o17 = this.f432865f.o(0, 0, this.f432867h);
        p16.g gVar = this.f432866g;
        return gVar.o(o17, 0, gVar.mo157707x35e001()) == 0;
    }

    @Override // p16.g
    public int n(int i17, int i18, int i19) {
        int i27 = i18 + i19;
        p16.g gVar = this.f432865f;
        int i28 = this.f432867h;
        if (i27 <= i28) {
            return gVar.n(i17, i18, i19);
        }
        p16.g gVar2 = this.f432866g;
        if (i18 >= i28) {
            return gVar2.n(i17, i18 - i28, i19);
        }
        int i29 = i28 - i18;
        return gVar2.n(gVar.n(i17, i18, i29), 0, i19 - i29);
    }

    @Override // p16.g
    public int o(int i17, int i18, int i19) {
        int i27 = i18 + i19;
        p16.g gVar = this.f432865f;
        int i28 = this.f432867h;
        if (i27 <= i28) {
            return gVar.o(i17, i18, i19);
        }
        p16.g gVar2 = this.f432866g;
        if (i18 >= i28) {
            return gVar2.o(i17, i18 - i28, i19);
        }
        int i29 = i28 - i18;
        return gVar2.o(gVar.o(i17, i18, i29), 0, i19 - i29);
    }

    @Override // p16.g
    public int p() {
        return this.f432869m;
    }

    @Override // p16.g
    public java.lang.String r(java.lang.String str) {
        byte[] bArr;
        int mo157707x35e001 = mo157707x35e001();
        if (mo157707x35e001 == 0) {
            bArr = p16.y.f432902a;
        } else {
            byte[] bArr2 = new byte[mo157707x35e001];
            h(bArr2, 0, 0, mo157707x35e001);
            bArr = bArr2;
        }
        return new java.lang.String(bArr, str);
    }

    @Override // p16.g
    public void s(java.io.OutputStream outputStream, int i17, int i18) {
        int i19 = i17 + i18;
        p16.g gVar = this.f432865f;
        int i27 = this.f432867h;
        if (i19 <= i27) {
            gVar.s(outputStream, i17, i18);
            return;
        }
        p16.g gVar2 = this.f432866g;
        if (i17 >= i27) {
            gVar2.s(outputStream, i17 - i27, i18);
            return;
        }
        int i28 = i27 - i17;
        gVar.s(outputStream, i17, i28);
        gVar2.s(outputStream, 0, i18 - i28);
    }

    @Override // p16.g
    /* renamed from: size */
    public int mo157707x35e001() {
        return this.f432864e;
    }
}
