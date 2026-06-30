package bw5;

/* loaded from: classes10.dex */
public class pc0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113094d;

    /* renamed from: e, reason: collision with root package name */
    public int f113095e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.e30 f113096f;

    /* renamed from: g, reason: collision with root package name */
    public int f113097g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f113098h;

    /* renamed from: i, reason: collision with root package name */
    public long f113099i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f113100m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f113101n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.j3 f113102o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f113104q;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f113103p = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f113105r = new boolean[12];

    static {
        new bw5.pc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pc0)) {
            return false;
        }
        bw5.pc0 pc0Var = (bw5.pc0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113094d), java.lang.Integer.valueOf(pc0Var.f113094d)) && n51.f.a(java.lang.Integer.valueOf(this.f113095e), java.lang.Integer.valueOf(pc0Var.f113095e)) && n51.f.a(this.f113096f, pc0Var.f113096f) && n51.f.a(java.lang.Integer.valueOf(this.f113097g), java.lang.Integer.valueOf(pc0Var.f113097g)) && n51.f.a(this.f113098h, pc0Var.f113098h) && n51.f.a(java.lang.Long.valueOf(this.f113099i), java.lang.Long.valueOf(pc0Var.f113099i)) && n51.f.a(this.f113100m, pc0Var.f113100m) && n51.f.a(this.f113101n, pc0Var.f113101n) && n51.f.a(this.f113102o, pc0Var.f113102o) && n51.f.a(this.f113103p, pc0Var.f113103p) && n51.f.a(this.f113104q, pc0Var.f113104q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f113103p;
        boolean[] zArr = this.f113105r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113094d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f113095e);
            }
            bw5.e30 e30Var = this.f113096f;
            if (e30Var != null && zArr[3]) {
                fVar.i(3, e30Var.mo75928xcd1e8d8());
                this.f113096f.mo75956x3d5d1f78(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f113097g);
            }
            java.lang.String str = this.f113098h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            if (zArr[6]) {
                fVar.h(6, this.f113099i);
            }
            java.lang.String str2 = this.f113100m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f113101n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            bw5.j3 j3Var = this.f113102o;
            if (j3Var != null && zArr[9]) {
                fVar.i(9, j3Var.mo75928xcd1e8d8());
                this.f113102o.mo75956x3d5d1f78(fVar);
            }
            fVar.g(10, 8, linkedList);
            java.lang.String str4 = this.f113104q;
            if (str4 == null || !zArr[11]) {
                return 0;
            }
            fVar.j(11, str4);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f113094d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f113095e);
            }
            bw5.e30 e30Var2 = this.f113096f;
            if (e30Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, e30Var2.mo75928xcd1e8d8());
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f113097g);
            }
            java.lang.String str5 = this.f113098h;
            if (str5 != null && zArr[5]) {
                e17 += b36.f.j(5, str5);
            }
            if (zArr[6]) {
                e17 += b36.f.h(6, this.f113099i);
            }
            java.lang.String str6 = this.f113100m;
            if (str6 != null && zArr[7]) {
                e17 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f113101n;
            if (str7 != null && zArr[8]) {
                e17 += b36.f.j(8, str7);
            }
            bw5.j3 j3Var2 = this.f113102o;
            if (j3Var2 != null && zArr[9]) {
                e17 += b36.f.i(9, j3Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(10, 8, linkedList);
            java.lang.String str8 = this.f113104q;
            return (str8 == null || !zArr[11]) ? g17 : g17 + b36.f.j(11, str8);
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
                this.f113094d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113095e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.e30 e30Var3 = new bw5.e30();
                    if (bArr != null && bArr.length > 0) {
                        e30Var3.mo11468x92b714fd(bArr);
                    }
                    this.f113096f = e30Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f113097g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113098h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113099i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113100m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f113101n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.j3 j3Var3 = new bw5.j3();
                    if (bArr2 != null && bArr2.length > 0) {
                        j3Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f113102o = j3Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
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
                zArr[10] = true;
                return 0;
            case 11:
                this.f113104q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.pc0) super.mo11468x92b714fd(bArr);
    }
}
