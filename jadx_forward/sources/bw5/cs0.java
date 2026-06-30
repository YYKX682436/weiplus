package bw5;

/* loaded from: classes10.dex */
public class cs0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107749d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107750e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107751f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.e30 f107752g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.j3 f107753h;

    /* renamed from: m, reason: collision with root package name */
    public int f107755m;

    /* renamed from: n, reason: collision with root package name */
    public int f107756n;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f107754i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f107757o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f107758p = new boolean[10];

    static {
        new bw5.cs0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cs0)) {
            return false;
        }
        bw5.cs0 cs0Var = (bw5.cs0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107749d), java.lang.Integer.valueOf(cs0Var.f107749d)) && n51.f.a(this.f107750e, cs0Var.f107750e) && n51.f.a(this.f107751f, cs0Var.f107751f) && n51.f.a(this.f107752g, cs0Var.f107752g) && n51.f.a(this.f107753h, cs0Var.f107753h) && n51.f.a(this.f107754i, cs0Var.f107754i) && n51.f.a(java.lang.Integer.valueOf(this.f107755m), java.lang.Integer.valueOf(cs0Var.f107755m)) && n51.f.a(java.lang.Integer.valueOf(this.f107756n), java.lang.Integer.valueOf(cs0Var.f107756n)) && n51.f.a(this.f107757o, cs0Var.f107757o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.cs0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f107757o;
        java.util.LinkedList linkedList2 = this.f107754i;
        boolean[] zArr = this.f107758p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107749d);
            }
            java.lang.String str = this.f107750e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f107751f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.e30 e30Var = this.f107752g;
            if (e30Var != null && zArr[4]) {
                fVar.i(4, e30Var.mo75928xcd1e8d8());
                this.f107752g.mo75956x3d5d1f78(fVar);
            }
            bw5.j3 j3Var = this.f107753h;
            if (j3Var != null && zArr[5]) {
                fVar.i(5, j3Var.mo75928xcd1e8d8());
                this.f107753h.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 1, linkedList2);
            if (zArr[7]) {
                fVar.e(7, this.f107755m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f107756n);
            }
            fVar.g(9, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107749d) : 0;
            java.lang.String str3 = this.f107750e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f107751f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            bw5.e30 e30Var2 = this.f107752g;
            if (e30Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, e30Var2.mo75928xcd1e8d8());
            }
            bw5.j3 j3Var2 = this.f107753h;
            if (j3Var2 != null && zArr[5]) {
                e17 += b36.f.i(5, j3Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(6, 1, linkedList2);
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f107755m);
            }
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f107756n);
            }
            return g17 + b36.f.g(9, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
                this.f107749d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107750e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107751f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.e30 e30Var3 = new bw5.e30();
                    if (bArr != null && bArr.length > 0) {
                        e30Var3.mo11468x92b714fd(bArr);
                    }
                    this.f107752g = e30Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.j3 j3Var3 = new bw5.j3();
                    if (bArr2 != null && bArr2.length > 0) {
                        j3Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f107753h = j3Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                linkedList2.add(aVar2.k(intValue));
                zArr[6] = true;
                return 0;
            case 7:
                this.f107755m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107756n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.q3 q3Var = new bw5.q3();
                    if (bArr3 != null && bArr3.length > 0) {
                        q3Var.mo11468x92b714fd(bArr3);
                    }
                    linkedList.add(q3Var);
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.cs0) super.mo11468x92b714fd(bArr);
    }
}
