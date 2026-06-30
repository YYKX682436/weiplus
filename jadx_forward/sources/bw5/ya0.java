package bw5;

/* loaded from: classes2.dex */
public class ya0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f116947d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116948e;

    /* renamed from: f, reason: collision with root package name */
    public int f116949f;

    /* renamed from: g, reason: collision with root package name */
    public int f116950g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f116951h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f116952i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.e80 f116953m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f116954n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f116955o = new boolean[9];

    static {
        new bw5.ya0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ya0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ya0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ya0)) {
            return false;
        }
        bw5.ya0 ya0Var = (bw5.ya0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f116947d), java.lang.Integer.valueOf(ya0Var.f116947d)) && n51.f.a(this.f116948e, ya0Var.f116948e) && n51.f.a(java.lang.Integer.valueOf(this.f116949f), java.lang.Integer.valueOf(ya0Var.f116949f)) && n51.f.a(java.lang.Integer.valueOf(this.f116950g), java.lang.Integer.valueOf(ya0Var.f116950g)) && n51.f.a(this.f116951h, ya0Var.f116951h) && n51.f.a(this.f116952i, ya0Var.f116952i) && n51.f.a(this.f116953m, ya0Var.f116953m) && n51.f.a(this.f116954n, ya0Var.f116954n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ya0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116955o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f116947d);
            }
            java.lang.String str = this.f116948e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f116949f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116950g);
            }
            java.lang.String str2 = this.f116951h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f116952i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            bw5.e80 e80Var = this.f116953m;
            if (e80Var != null && zArr[7]) {
                fVar.i(7, e80Var.mo75928xcd1e8d8());
                this.f116953m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f116954n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f116947d) : 0;
            java.lang.String str5 = this.f116948e;
            if (str5 != null && zArr[2]) {
                e17 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f116949f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f116950g);
            }
            java.lang.String str6 = this.f116951h;
            if (str6 != null && zArr[5]) {
                e17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f116952i;
            if (str7 != null && zArr[6]) {
                e17 += b36.f.j(6, str7);
            }
            bw5.e80 e80Var2 = this.f116953m;
            if (e80Var2 != null && zArr[7]) {
                e17 += b36.f.i(7, e80Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f116954n;
            return (str8 == null || !zArr[8]) ? e17 : e17 + b36.f.j(8, str8);
        }
        if (i17 == 2) {
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
                this.f116947d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f116948e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f116949f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116950g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116951h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116952i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.e80 e80Var3 = new bw5.e80();
                    if (bArr != null && bArr.length > 0) {
                        e80Var3.mo11468x92b714fd(bArr);
                    }
                    this.f116953m = e80Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f116954n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
