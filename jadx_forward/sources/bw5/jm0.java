package bw5;

/* loaded from: classes2.dex */
public class jm0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f110573d;

    /* renamed from: e, reason: collision with root package name */
    public int f110574e;

    /* renamed from: g, reason: collision with root package name */
    public int f110576g;

    /* renamed from: h, reason: collision with root package name */
    public long f110577h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f110575f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f110578i = new boolean[6];

    static {
        new bw5.jm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jm0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.jm0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jm0)) {
            return false;
        }
        bw5.jm0 jm0Var = (bw5.jm0) fVar;
        return n51.f.a(this.f110573d, jm0Var.f110573d) && n51.f.a(java.lang.Integer.valueOf(this.f110574e), java.lang.Integer.valueOf(jm0Var.f110574e)) && n51.f.a(this.f110575f, jm0Var.f110575f) && n51.f.a(java.lang.Integer.valueOf(this.f110576g), java.lang.Integer.valueOf(jm0Var.f110576g)) && n51.f.a(java.lang.Long.valueOf(this.f110577h), java.lang.Long.valueOf(jm0Var.f110577h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.jm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f110575f;
        int i18 = 0;
        boolean[] zArr = this.f110578i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f110573d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f110574e);
            }
            fVar.g(3, 8, linkedList);
            if (zArr[4]) {
                fVar.e(4, this.f110576g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f110577h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f110573d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f110574e);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f110576g);
            }
            return zArr[5] ? g17 + b36.f.h(5, this.f110577h) : g17;
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
            this.f110573d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f110574e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f110576g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f110577h = aVar2.i(intValue);
            zArr[5] = true;
            return 0;
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
        zArr[3] = true;
        return 0;
    }
}
