package zu3;

/* loaded from: classes10.dex */
public abstract class a implements zu3.o {

    /* renamed from: a, reason: collision with root package name */
    public zu3.e f557291a;

    /* renamed from: b, reason: collision with root package name */
    public bv3.d f557292b;

    /* renamed from: c, reason: collision with root package name */
    public final bv3.d f557293c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f557294d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f557295e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Matrix f557296f;

    public a(zu3.e dataType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataType, "dataType");
        this.f557291a = dataType;
        this.f557293c = new bv3.d(2147483647L, false, 2, null);
        this.f557295e = true;
        this.f557296f = new android.graphics.Matrix();
    }

    public final bv3.d d() {
        return this.f557293c;
    }

    public final r45.bi0 e() {
        r45.bi0 bi0Var = new r45.bi0();
        bv3.d dVar = this.f557293c;
        bi0Var.f452305d = dVar.c();
        bi0Var.f452306e = dVar.b();
        return bi0Var;
    }

    public final r45.zz6 f(android.graphics.Matrix matrix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        float[] fArr = new float[9];
        r45.zz6 zz6Var = new r45.zz6();
        matrix.getValues(fArr);
        for (int i17 = 0; i17 < 9; i17++) {
            zz6Var.f474027d.add(java.lang.Float.valueOf(fArr[i17]));
        }
        return zz6Var;
    }

    public final float[] g(r45.zz6 viewMatrix) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewMatrix, "viewMatrix");
        float[] fArr = new float[9];
        java.util.LinkedList<java.lang.Float> value = viewMatrix.f474027d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
        int i17 = 0;
        for (java.lang.Float f17 : value) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
            fArr[i17] = f17.floatValue();
            i17++;
        }
        return fArr;
    }

    public final void h(boolean z17) {
        this.f557295e = z17;
    }
}
