package u2;

/* loaded from: classes15.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public final u2.b f505341b;

    /* renamed from: c, reason: collision with root package name */
    public final u2.c f505342c;

    /* renamed from: a, reason: collision with root package name */
    public int f505340a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f505343d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f505344e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f505345f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f505346g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f505347h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f505348i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f505349j = false;

    public a(u2.b bVar, u2.c cVar) {
        this.f505341b = bVar;
        this.f505342c = cVar;
    }

    public final void a(u2.j jVar, float f17, boolean z17) {
        if (f17 == 0.0f) {
            return;
        }
        int i17 = this.f505347h;
        u2.b bVar = this.f505341b;
        if (i17 == -1) {
            this.f505347h = 0;
            this.f505346g[0] = f17;
            this.f505344e[0] = jVar.f505379a;
            this.f505345f[0] = -1;
            jVar.f505387i++;
            jVar.a(bVar);
            this.f505340a++;
            if (this.f505349j) {
                return;
            }
            int i18 = this.f505348i + 1;
            this.f505348i = i18;
            int[] iArr = this.f505344e;
            if (i18 >= iArr.length) {
                this.f505349j = true;
                this.f505348i = iArr.length - 1;
                return;
            }
            return;
        }
        int i19 = -1;
        for (int i27 = 0; i17 != -1 && i27 < this.f505340a; i27++) {
            int i28 = this.f505344e[i17];
            int i29 = jVar.f505379a;
            if (i28 == i29) {
                float[] fArr = this.f505346g;
                float f18 = fArr[i17] + f17;
                fArr[i17] = f18;
                if (f18 == 0.0f) {
                    if (i17 == this.f505347h) {
                        this.f505347h = this.f505345f[i17];
                    } else {
                        int[] iArr2 = this.f505345f;
                        iArr2[i19] = iArr2[i17];
                    }
                    if (z17) {
                        jVar.b(bVar);
                    }
                    if (this.f505349j) {
                        this.f505348i = i17;
                    }
                    jVar.f505387i--;
                    this.f505340a--;
                    return;
                }
                return;
            }
            if (i28 < i29) {
                i19 = i17;
            }
            i17 = this.f505345f[i17];
        }
        int i37 = this.f505348i;
        int i38 = i37 + 1;
        if (this.f505349j) {
            int[] iArr3 = this.f505344e;
            if (iArr3[i37] != -1) {
                i37 = iArr3.length;
            }
        } else {
            i37 = i38;
        }
        int[] iArr4 = this.f505344e;
        if (i37 >= iArr4.length && this.f505340a < iArr4.length) {
            int i39 = 0;
            while (true) {
                int[] iArr5 = this.f505344e;
                if (i39 >= iArr5.length) {
                    break;
                }
                if (iArr5[i39] == -1) {
                    i37 = i39;
                    break;
                }
                i39++;
            }
        }
        int[] iArr6 = this.f505344e;
        if (i37 >= iArr6.length) {
            i37 = iArr6.length;
            int i47 = this.f505343d * 2;
            this.f505343d = i47;
            this.f505349j = false;
            this.f505348i = i37 - 1;
            this.f505346g = java.util.Arrays.copyOf(this.f505346g, i47);
            this.f505344e = java.util.Arrays.copyOf(this.f505344e, this.f505343d);
            this.f505345f = java.util.Arrays.copyOf(this.f505345f, this.f505343d);
        }
        this.f505344e[i37] = jVar.f505379a;
        this.f505346g[i37] = f17;
        if (i19 != -1) {
            int[] iArr7 = this.f505345f;
            iArr7[i37] = iArr7[i19];
            iArr7[i19] = i37;
        } else {
            this.f505345f[i37] = this.f505347h;
            this.f505347h = i37;
        }
        jVar.f505387i++;
        jVar.a(bVar);
        this.f505340a++;
        if (!this.f505349j) {
            this.f505348i++;
        }
        int i48 = this.f505348i;
        int[] iArr8 = this.f505344e;
        if (i48 >= iArr8.length) {
            this.f505349j = true;
            this.f505348i = iArr8.length - 1;
        }
    }

    public final void b() {
        int i17 = this.f505347h;
        for (int i18 = 0; i17 != -1 && i18 < this.f505340a; i18++) {
            u2.j jVar = this.f505342c.f505356c[this.f505344e[i17]];
            if (jVar != null) {
                jVar.b(this.f505341b);
            }
            i17 = this.f505345f[i17];
        }
        this.f505347h = -1;
        this.f505348i = -1;
        this.f505349j = false;
        this.f505340a = 0;
    }

    public final float c(u2.j jVar) {
        int i17 = this.f505347h;
        for (int i18 = 0; i17 != -1 && i18 < this.f505340a; i18++) {
            if (this.f505344e[i17] == jVar.f505379a) {
                return this.f505346g[i17];
            }
            i17 = this.f505345f[i17];
        }
        return 0.0f;
    }

    public u2.j d(boolean[] zArr, u2.j jVar) {
        u2.i iVar;
        int i17 = this.f505347h;
        u2.j jVar2 = null;
        float f17 = 0.0f;
        for (int i18 = 0; i17 != -1 && i18 < this.f505340a; i18++) {
            float f18 = this.f505346g[i17];
            if (f18 < 0.0f) {
                u2.j jVar3 = this.f505342c.f505356c[this.f505344e[i17]];
                if ((zArr == null || !zArr[jVar3.f505379a]) && jVar3 != jVar && (((iVar = jVar3.f505384f) == u2.i.SLACK || iVar == u2.i.ERROR) && f18 < f17)) {
                    f17 = f18;
                    jVar2 = jVar3;
                }
            }
            i17 = this.f505345f[i17];
        }
        return jVar2;
    }

    public final u2.j e(int i17) {
        int i18 = this.f505347h;
        for (int i19 = 0; i18 != -1 && i19 < this.f505340a; i19++) {
            if (i19 == i17) {
                return this.f505342c.f505356c[this.f505344e[i18]];
            }
            i18 = this.f505345f[i18];
        }
        return null;
    }

    public final void f(u2.j jVar, float f17) {
        if (f17 == 0.0f) {
            g(jVar, true);
            return;
        }
        int i17 = this.f505347h;
        u2.b bVar = this.f505341b;
        if (i17 == -1) {
            this.f505347h = 0;
            this.f505346g[0] = f17;
            this.f505344e[0] = jVar.f505379a;
            this.f505345f[0] = -1;
            jVar.f505387i++;
            jVar.a(bVar);
            this.f505340a++;
            if (this.f505349j) {
                return;
            }
            int i18 = this.f505348i + 1;
            this.f505348i = i18;
            int[] iArr = this.f505344e;
            if (i18 >= iArr.length) {
                this.f505349j = true;
                this.f505348i = iArr.length - 1;
                return;
            }
            return;
        }
        int i19 = -1;
        for (int i27 = 0; i17 != -1 && i27 < this.f505340a; i27++) {
            int i28 = this.f505344e[i17];
            int i29 = jVar.f505379a;
            if (i28 == i29) {
                this.f505346g[i17] = f17;
                return;
            }
            if (i28 < i29) {
                i19 = i17;
            }
            i17 = this.f505345f[i17];
        }
        int i37 = this.f505348i;
        int i38 = i37 + 1;
        if (this.f505349j) {
            int[] iArr2 = this.f505344e;
            if (iArr2[i37] != -1) {
                i37 = iArr2.length;
            }
        } else {
            i37 = i38;
        }
        int[] iArr3 = this.f505344e;
        if (i37 >= iArr3.length && this.f505340a < iArr3.length) {
            int i39 = 0;
            while (true) {
                int[] iArr4 = this.f505344e;
                if (i39 >= iArr4.length) {
                    break;
                }
                if (iArr4[i39] == -1) {
                    i37 = i39;
                    break;
                }
                i39++;
            }
        }
        int[] iArr5 = this.f505344e;
        if (i37 >= iArr5.length) {
            i37 = iArr5.length;
            int i47 = this.f505343d * 2;
            this.f505343d = i47;
            this.f505349j = false;
            this.f505348i = i37 - 1;
            this.f505346g = java.util.Arrays.copyOf(this.f505346g, i47);
            this.f505344e = java.util.Arrays.copyOf(this.f505344e, this.f505343d);
            this.f505345f = java.util.Arrays.copyOf(this.f505345f, this.f505343d);
        }
        this.f505344e[i37] = jVar.f505379a;
        this.f505346g[i37] = f17;
        if (i19 != -1) {
            int[] iArr6 = this.f505345f;
            iArr6[i37] = iArr6[i19];
            iArr6[i19] = i37;
        } else {
            this.f505345f[i37] = this.f505347h;
            this.f505347h = i37;
        }
        jVar.f505387i++;
        jVar.a(bVar);
        int i48 = this.f505340a + 1;
        this.f505340a = i48;
        if (!this.f505349j) {
            this.f505348i++;
        }
        int[] iArr7 = this.f505344e;
        if (i48 >= iArr7.length) {
            this.f505349j = true;
        }
        if (this.f505348i >= iArr7.length) {
            this.f505349j = true;
            this.f505348i = iArr7.length - 1;
        }
    }

    public final float g(u2.j jVar, boolean z17) {
        int i17 = this.f505347h;
        if (i17 == -1) {
            return 0.0f;
        }
        int i18 = 0;
        int i19 = -1;
        while (i17 != -1 && i18 < this.f505340a) {
            if (this.f505344e[i17] == jVar.f505379a) {
                if (i17 == this.f505347h) {
                    this.f505347h = this.f505345f[i17];
                } else {
                    int[] iArr = this.f505345f;
                    iArr[i19] = iArr[i17];
                }
                if (z17) {
                    jVar.b(this.f505341b);
                }
                jVar.f505387i--;
                this.f505340a--;
                this.f505344e[i17] = -1;
                if (this.f505349j) {
                    this.f505348i = i17;
                }
                return this.f505346g[i17];
            }
            i18++;
            i19 = i17;
            i17 = this.f505345f[i17];
        }
        return 0.0f;
    }

    /* renamed from: toString */
    public java.lang.String m167422x9616526c() {
        int i17 = this.f505347h;
        java.lang.String str = "";
        for (int i18 = 0; i17 != -1 && i18 < this.f505340a; i18++) {
            str = ((str + " -> ") + this.f505346g[i17] + " : ") + this.f505342c.f505356c[this.f505344e[i17]];
            i17 = this.f505345f[i17];
        }
        return str;
    }
}
