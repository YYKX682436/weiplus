package bw5;

/* loaded from: classes2.dex */
public class f2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108648d;

    /* renamed from: f, reason: collision with root package name */
    public bw5.b70 f108650f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.o60 f108651g;

    /* renamed from: h, reason: collision with root package name */
    public int f108652h;

    /* renamed from: i, reason: collision with root package name */
    public int f108653i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f108649e = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f108654m = new boolean[7];

    static {
        new bw5.f2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.f2)) {
            return false;
        }
        bw5.f2 f2Var = (bw5.f2) fVar;
        return n51.f.a(this.f108648d, f2Var.f108648d) && n51.f.a(this.f108649e, f2Var.f108649e) && n51.f.a(this.f108650f, f2Var.f108650f) && n51.f.a(this.f108651g, f2Var.f108651g) && n51.f.a(java.lang.Integer.valueOf(this.f108652h), java.lang.Integer.valueOf(f2Var.f108652h)) && n51.f.a(java.lang.Integer.valueOf(this.f108653i), java.lang.Integer.valueOf(f2Var.f108653i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.f2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108649e;
        int i18 = 0;
        boolean[] zArr = this.f108654m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108648d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            bw5.b70 b70Var = this.f108650f;
            if (b70Var != null && zArr[3]) {
                fVar.i(3, b70Var.mo75928xcd1e8d8());
                this.f108650f.mo75956x3d5d1f78(fVar);
            }
            bw5.o60 o60Var = this.f108651g;
            if (o60Var != null && zArr[4]) {
                fVar.i(4, o60Var.mo75928xcd1e8d8());
                this.f108651g.mo75956x3d5d1f78(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f108652h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f108653i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f108648d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            bw5.b70 b70Var2 = this.f108650f;
            if (b70Var2 != null && zArr[3]) {
                g17 += b36.f.i(3, b70Var2.mo75928xcd1e8d8());
            }
            bw5.o60 o60Var2 = this.f108651g;
            if (o60Var2 != null && zArr[4]) {
                g17 += b36.f.i(4, o60Var2.mo75928xcd1e8d8());
            }
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f108652h);
            }
            return zArr[6] ? g17 + b36.f.e(6, this.f108653i) : g17;
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
        switch (intValue) {
            case 1:
                this.f108648d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.x40 x40Var = new bw5.x40();
                    if (bArr != null && bArr.length > 0) {
                        x40Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(x40Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.b70 b70Var3 = new bw5.b70();
                    if (bArr2 != null && bArr2.length > 0) {
                        b70Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f108650f = b70Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.o60 o60Var3 = new bw5.o60();
                    if (bArr3 != null && bArr3.length > 0) {
                        o60Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f108651g = o60Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f108652h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108653i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.f2) super.mo11468x92b714fd(bArr);
    }
}
