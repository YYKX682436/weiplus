package bw5;

/* loaded from: classes2.dex */
public class c20 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107418d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107419e;

    /* renamed from: f, reason: collision with root package name */
    public int f107420f;

    /* renamed from: g, reason: collision with root package name */
    public int f107421g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.v00 f107422h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.v00 f107423i;

    /* renamed from: m, reason: collision with root package name */
    public int f107424m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f107425n;

    /* renamed from: o, reason: collision with root package name */
    public int f107426o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.ui f107427p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f107428q = new boolean[22];

    static {
        new bw5.c20();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.c20 mo11468x92b714fd(byte[] bArr) {
        return (bw5.c20) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c20)) {
            return false;
        }
        bw5.c20 c20Var = (bw5.c20) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107418d), java.lang.Integer.valueOf(c20Var.f107418d)) && n51.f.a(this.f107419e, c20Var.f107419e) && n51.f.a(java.lang.Integer.valueOf(this.f107420f), java.lang.Integer.valueOf(c20Var.f107420f)) && n51.f.a(java.lang.Integer.valueOf(this.f107421g), java.lang.Integer.valueOf(c20Var.f107421g)) && n51.f.a(this.f107422h, c20Var.f107422h) && n51.f.a(this.f107423i, c20Var.f107423i) && n51.f.a(java.lang.Integer.valueOf(this.f107424m), java.lang.Integer.valueOf(c20Var.f107424m)) && n51.f.a(this.f107425n, c20Var.f107425n) && n51.f.a(java.lang.Integer.valueOf(this.f107426o), java.lang.Integer.valueOf(c20Var.f107426o)) && n51.f.a(this.f107427p, c20Var.f107427p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.c20();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107428q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107418d);
            }
            java.lang.String str = this.f107419e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f107420f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f107421g);
            }
            bw5.v00 v00Var = this.f107422h;
            if (v00Var != null && zArr[5]) {
                fVar.i(5, v00Var.mo75928xcd1e8d8());
                this.f107422h.mo75956x3d5d1f78(fVar);
            }
            bw5.v00 v00Var2 = this.f107423i;
            if (v00Var2 != null && zArr[6]) {
                fVar.i(6, v00Var2.mo75928xcd1e8d8());
                this.f107423i.mo75956x3d5d1f78(fVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f107424m);
            }
            java.lang.String str2 = this.f107425n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            if (zArr[20]) {
                fVar.e(20, this.f107426o);
            }
            bw5.ui uiVar = this.f107427p;
            if (uiVar != null && zArr[21]) {
                fVar.i(21, uiVar.mo75928xcd1e8d8());
                this.f107427p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107418d) : 0;
            java.lang.String str3 = this.f107419e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f107420f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f107421g);
            }
            bw5.v00 v00Var3 = this.f107422h;
            if (v00Var3 != null && zArr[5]) {
                e17 += b36.f.i(5, v00Var3.mo75928xcd1e8d8());
            }
            bw5.v00 v00Var4 = this.f107423i;
            if (v00Var4 != null && zArr[6]) {
                e17 += b36.f.i(6, v00Var4.mo75928xcd1e8d8());
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f107424m);
            }
            java.lang.String str4 = this.f107425n;
            if (str4 != null && zArr[8]) {
                e17 += b36.f.j(8, str4);
            }
            if (zArr[20]) {
                e17 += b36.f.e(20, this.f107426o);
            }
            bw5.ui uiVar2 = this.f107427p;
            return (uiVar2 == null || !zArr[21]) ? e17 : e17 + b36.f.i(21, uiVar2.mo75928xcd1e8d8());
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
        if (intValue == 20) {
            this.f107426o = aVar2.g(intValue);
            zArr[20] = true;
            return 0;
        }
        if (intValue == 21) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.ui uiVar3 = new bw5.ui();
                if (bArr != null && bArr.length > 0) {
                    uiVar3.mo11468x92b714fd(bArr);
                }
                this.f107427p = uiVar3;
            }
            zArr[21] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f107418d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f107419e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107420f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107421g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.v00 v00Var5 = new bw5.v00();
                    if (bArr2 != null && bArr2.length > 0) {
                        v00Var5.mo11468x92b714fd(bArr2);
                    }
                    this.f107422h = v00Var5;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.v00 v00Var6 = new bw5.v00();
                    if (bArr3 != null && bArr3.length > 0) {
                        v00Var6.mo11468x92b714fd(bArr3);
                    }
                    this.f107423i = v00Var6;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f107424m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f107425n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
