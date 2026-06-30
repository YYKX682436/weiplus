package bw5;

/* loaded from: classes2.dex */
public class zl0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117583d;

    /* renamed from: e, reason: collision with root package name */
    public float f117584e;

    /* renamed from: f, reason: collision with root package name */
    public long f117585f;

    /* renamed from: g, reason: collision with root package name */
    public long f117586g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f117587h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f117588i = new boolean[6];

    static {
        new bw5.zl0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zl0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.zl0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zl0)) {
            return false;
        }
        bw5.zl0 zl0Var = (bw5.zl0) fVar;
        return n51.f.a(this.f117583d, zl0Var.f117583d) && n51.f.a(java.lang.Float.valueOf(this.f117584e), java.lang.Float.valueOf(zl0Var.f117584e)) && n51.f.a(java.lang.Long.valueOf(this.f117585f), java.lang.Long.valueOf(zl0Var.f117585f)) && n51.f.a(java.lang.Long.valueOf(this.f117586g), java.lang.Long.valueOf(zl0Var.f117586g)) && n51.f.a(this.f117587h, zl0Var.f117587h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zl0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f117587h;
        int i18 = 0;
        boolean[] zArr = this.f117588i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f117583d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.d(2, this.f117584e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f117585f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f117586g);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f117583d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.d(2, this.f117584e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f117585f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f117586g);
            }
            return i18 + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f117583d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f117584e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f117585f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f117586g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.km0 km0Var = new bw5.km0();
            if (bArr != null && bArr.length > 0) {
                km0Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(km0Var);
        }
        zArr[5] = true;
        return 0;
    }
}
