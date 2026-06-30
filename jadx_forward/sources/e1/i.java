package e1;

/* loaded from: classes14.dex */
public final class i implements e1.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Path f327796a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f327797b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f327798c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Matrix f327799d;

    public i(android.graphics.Path internalPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(internalPath, "internalPath");
        this.f327796a = internalPath;
        this.f327797b = new android.graphics.RectF();
        this.f327798c = new float[8];
        this.f327799d = new android.graphics.Matrix();
    }

    public void a(d1.i roundRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roundRect, "roundRect");
        android.graphics.RectF rectF = this.f327797b;
        rectF.set(roundRect.f307166a, roundRect.f307167b, roundRect.f307168c, roundRect.f307169d);
        long j17 = roundRect.f307170e;
        float b17 = d1.a.b(j17);
        float[] fArr = this.f327798c;
        fArr[0] = b17;
        fArr[1] = d1.a.c(j17);
        long j18 = roundRect.f307171f;
        fArr[2] = d1.a.b(j18);
        fArr[3] = d1.a.c(j18);
        long j19 = roundRect.f307172g;
        fArr[4] = d1.a.b(j19);
        fArr[5] = d1.a.c(j19);
        long j27 = roundRect.f307173h;
        fArr[6] = d1.a.b(j27);
        fArr[7] = d1.a.c(j27);
        this.f327796a.addRoundRect(rectF, fArr, android.graphics.Path.Direction.CCW);
    }

    public boolean b(e1.p0 path1, e1.p0 path2, int i17) {
        android.graphics.Path.Op op6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path1, "path1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path2, "path2");
        if (i17 == 0) {
            op6 = android.graphics.Path.Op.DIFFERENCE;
        } else {
            if (i17 == 1) {
                op6 = android.graphics.Path.Op.INTERSECT;
            } else {
                if (i17 == 4) {
                    op6 = android.graphics.Path.Op.REVERSE_DIFFERENCE;
                } else {
                    op6 = i17 == 2 ? android.graphics.Path.Op.UNION : android.graphics.Path.Op.XOR;
                }
            }
        }
        if (!(path1 instanceof e1.i)) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        e1.i iVar = (e1.i) path1;
        if (path2 instanceof e1.i) {
            return this.f327796a.op(iVar.f327796a, ((e1.i) path2).f327796a, op6);
        }
        throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public void c() {
        this.f327796a.reset();
    }
}
