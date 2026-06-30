package s7;

/* loaded from: classes16.dex */
public class a1 implements s7.b1 {

    /* renamed from: b, reason: collision with root package name */
    public int f485115b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f485117d = 0;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f485114a = new byte[8];

    /* renamed from: c, reason: collision with root package name */
    public float[] f485116c = new float[16];

    @Override // s7.b1
    public void a(float f17, float f18) {
        f((byte) 0);
        g(2);
        float[] fArr = this.f485116c;
        int i17 = this.f485117d;
        int i18 = i17 + 1;
        fArr[i17] = f17;
        this.f485117d = i18 + 1;
        fArr[i18] = f18;
    }

    @Override // s7.b1
    public void b(float f17, float f18) {
        f((byte) 1);
        g(2);
        float[] fArr = this.f485116c;
        int i17 = this.f485117d;
        int i18 = i17 + 1;
        fArr[i17] = f17;
        this.f485117d = i18 + 1;
        fArr[i18] = f18;
    }

    @Override // s7.b1
    public void c(float f17, float f18, float f19, float f27) {
        f((byte) 3);
        g(4);
        float[] fArr = this.f485116c;
        int i17 = this.f485117d;
        int i18 = i17 + 1;
        fArr[i17] = f17;
        int i19 = i18 + 1;
        fArr[i18] = f18;
        int i27 = i19 + 1;
        fArr[i19] = f19;
        this.f485117d = i27 + 1;
        fArr[i27] = f27;
    }

    @Override // s7.b1
    /* renamed from: close */
    public void mo163950x5a5ddf8() {
        f((byte) 8);
    }

    @Override // s7.b1
    public void d(float f17, float f18, float f19, float f27, float f28, float f29) {
        f((byte) 2);
        g(6);
        float[] fArr = this.f485116c;
        int i17 = this.f485117d;
        int i18 = i17 + 1;
        fArr[i17] = f17;
        int i19 = i18 + 1;
        fArr[i18] = f18;
        int i27 = i19 + 1;
        fArr[i19] = f19;
        int i28 = i27 + 1;
        fArr[i27] = f27;
        int i29 = i28 + 1;
        fArr[i28] = f28;
        this.f485117d = i29 + 1;
        fArr[i29] = f29;
    }

    @Override // s7.b1
    public void e(float f17, float f18, float f19, boolean z17, boolean z18, float f27, float f28) {
        f((byte) ((z17 ? 2 : 0) | 4 | (z18 ? 1 : 0)));
        g(5);
        float[] fArr = this.f485116c;
        int i17 = this.f485117d;
        int i18 = i17 + 1;
        fArr[i17] = f17;
        int i19 = i18 + 1;
        fArr[i18] = f18;
        int i27 = i19 + 1;
        fArr[i19] = f19;
        int i28 = i27 + 1;
        fArr[i27] = f27;
        this.f485117d = i28 + 1;
        fArr[i28] = f28;
    }

    public final void f(byte b17) {
        int i17 = this.f485115b;
        byte[] bArr = this.f485114a;
        if (i17 == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f485114a = bArr2;
        }
        byte[] bArr3 = this.f485114a;
        int i18 = this.f485115b;
        this.f485115b = i18 + 1;
        bArr3[i18] = b17;
    }

    public final void g(int i17) {
        float[] fArr = this.f485116c;
        if (fArr.length < this.f485117d + i17) {
            float[] fArr2 = new float[fArr.length * 2];
            java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.f485116c = fArr2;
        }
    }

    public void h(s7.b1 b1Var) {
        int i17;
        int i18 = 0;
        for (int i19 = 0; i19 < this.f485115b; i19++) {
            byte b17 = this.f485114a[i19];
            if (b17 == 0) {
                float[] fArr = this.f485116c;
                int i27 = i18 + 1;
                i17 = i27 + 1;
                b1Var.a(fArr[i18], fArr[i27]);
            } else if (b17 != 1) {
                if (b17 == 2) {
                    float[] fArr2 = this.f485116c;
                    int i28 = i18 + 1;
                    float f17 = fArr2[i18];
                    int i29 = i28 + 1;
                    float f18 = fArr2[i28];
                    int i37 = i29 + 1;
                    float f19 = fArr2[i29];
                    int i38 = i37 + 1;
                    float f27 = fArr2[i37];
                    int i39 = i38 + 1;
                    float f28 = fArr2[i38];
                    i18 = i39 + 1;
                    b1Var.d(f17, f18, f19, f27, f28, fArr2[i39]);
                } else if (b17 == 3) {
                    float[] fArr3 = this.f485116c;
                    int i47 = i18 + 1;
                    int i48 = i47 + 1;
                    int i49 = i48 + 1;
                    b1Var.c(fArr3[i18], fArr3[i47], fArr3[i48], fArr3[i49]);
                    i18 = i49 + 1;
                } else if (b17 != 8) {
                    boolean z17 = (b17 & 2) != 0;
                    boolean z18 = (b17 & 1) != 0;
                    float[] fArr4 = this.f485116c;
                    int i57 = i18 + 1;
                    float f29 = fArr4[i18];
                    int i58 = i57 + 1;
                    float f37 = fArr4[i57];
                    int i59 = i58 + 1;
                    float f38 = fArr4[i58];
                    int i66 = i59 + 1;
                    b1Var.e(f29, f37, f38, z17, z18, fArr4[i59], fArr4[i66]);
                    i18 = i66 + 1;
                } else {
                    b1Var.mo163950x5a5ddf8();
                }
            } else {
                float[] fArr5 = this.f485116c;
                int i67 = i18 + 1;
                i17 = i67 + 1;
                b1Var.b(fArr5[i18], fArr5[i67]);
            }
            i18 = i17;
        }
    }
}
