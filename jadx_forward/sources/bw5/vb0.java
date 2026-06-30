package bw5;

/* loaded from: classes2.dex */
public class vb0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115808d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115809e;

    /* renamed from: g, reason: collision with root package name */
    public int f115811g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f115810f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f115812h = new boolean[5];

    static {
        new bw5.vb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vb0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.vb0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vb0)) {
            return false;
        }
        bw5.vb0 vb0Var = (bw5.vb0) fVar;
        return n51.f.a(this.f115808d, vb0Var.f115808d) && n51.f.a(this.f115809e, vb0Var.f115809e) && n51.f.a(this.f115810f, vb0Var.f115810f) && n51.f.a(java.lang.Integer.valueOf(this.f115811g), java.lang.Integer.valueOf(vb0Var.f115811g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.vb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f115810f;
        boolean[] zArr = this.f115812h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115808d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f115809e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            if (zArr[4]) {
                fVar.e(4, this.f115811g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f115808d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f115809e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            return zArr[4] ? g17 + b36.f.e(4, this.f115811g) : g17;
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
            this.f115808d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f115809e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f115811g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ub0 ub0Var = new bw5.ub0();
            if (bArr != null && bArr.length > 0) {
                ub0Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(ub0Var);
        }
        zArr[3] = true;
        return 0;
    }
}
