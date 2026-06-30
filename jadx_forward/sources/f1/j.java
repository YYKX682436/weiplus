package f1;

/* loaded from: classes14.dex */
public final class j extends f1.k {

    /* renamed from: d, reason: collision with root package name */
    public final f1.y f340031d;

    /* renamed from: e, reason: collision with root package name */
    public final f1.y f340032e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f340033f;

    public j(f1.y yVar, f1.y yVar2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(yVar, yVar2, yVar, yVar2, i17, null, null);
        float[] f17;
        this.f340031d = yVar;
        this.f340032e = yVar2;
        boolean c17 = f1.e.c(yVar.f340056d, yVar2.f340056d);
        float[] fArr = yVar.f340061i;
        float[] fArr2 = yVar2.f340062j;
        if (c17) {
            f17 = f1.e.f(fArr2, fArr);
        } else {
            f1.a0 a0Var = yVar.f340056d;
            float[] a17 = a0Var.a();
            f1.a0 a0Var2 = yVar2.f340056d;
            float[] a18 = a0Var2.a();
            f1.a0 a0Var3 = f1.l.f340038b;
            boolean c18 = f1.e.c(a0Var, a0Var3);
            float[] fArr3 = f1.l.f340041e;
            float[] fArr4 = f1.b.f339997b.f339998a;
            if (!c18) {
                float[] copyOf = java.util.Arrays.copyOf(fArr3, 3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(this, size)");
                fArr = f1.e.f(f1.e.b(fArr4, a17, copyOf), fArr);
            }
            if (!f1.e.c(a0Var2, a0Var3)) {
                float[] copyOf2 = java.util.Arrays.copyOf(fArr3, 3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf2, "copyOf(this, size)");
                fArr2 = f1.e.e(f1.e.f(f1.e.b(fArr4, a18, copyOf2), yVar2.f340061i));
            }
            f17 = f1.e.f(fArr2, i17 == 3 ? f1.e.g(new float[]{a17[0] / a18[0], a17[1] / a18[1], a17[2] / a18[2]}, fArr) : fArr);
        }
        this.f340033f = f17;
    }

    @Override // f1.k
    public float[] a(float[] v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        f1.y yVar = this.f340031d;
        v17[0] = (float) ((java.lang.Number) ((f1.w) yVar.f340066n).mo146xb9724478(java.lang.Double.valueOf(v17[0]))).doubleValue();
        v17[1] = (float) ((java.lang.Number) ((f1.w) yVar.f340066n).mo146xb9724478(java.lang.Double.valueOf(v17[1]))).doubleValue();
        v17[2] = (float) ((java.lang.Number) ((f1.w) yVar.f340066n).mo146xb9724478(java.lang.Double.valueOf(v17[2]))).doubleValue();
        f1.e.h(this.f340033f, v17);
        f1.y yVar2 = this.f340032e;
        v17[0] = (float) ((java.lang.Number) ((f1.x) yVar2.f340064l).mo146xb9724478(java.lang.Double.valueOf(v17[0]))).doubleValue();
        v17[1] = (float) ((java.lang.Number) ((f1.x) yVar2.f340064l).mo146xb9724478(java.lang.Double.valueOf(v17[1]))).doubleValue();
        v17[2] = (float) ((java.lang.Number) ((f1.x) yVar2.f340064l).mo146xb9724478(java.lang.Double.valueOf(v17[2]))).doubleValue();
        return v17;
    }
}
