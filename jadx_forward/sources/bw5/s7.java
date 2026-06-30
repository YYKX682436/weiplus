package bw5;

/* loaded from: classes7.dex */
public class s7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114358d;

    /* renamed from: e, reason: collision with root package name */
    public int f114359e;

    /* renamed from: f, reason: collision with root package name */
    public int f114360f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114361g;

    /* renamed from: h, reason: collision with root package name */
    public int f114362h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f114363i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.r7 f114364m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f114365n;

    /* renamed from: o, reason: collision with root package name */
    public int f114366o;

    /* renamed from: q, reason: collision with root package name */
    public int f114368q;

    /* renamed from: r, reason: collision with root package name */
    public int f114369r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f114370s;

    /* renamed from: t, reason: collision with root package name */
    public int f114371t;

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f114367p = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f114372u = new boolean[15];

    static {
        new bw5.s7();
    }

    public java.lang.String b() {
        return this.f114372u[1] ? this.f114358d : "";
    }

    public java.lang.String c() {
        return this.f114372u[4] ? this.f114361g : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s7)) {
            return false;
        }
        bw5.s7 s7Var = (bw5.s7) fVar;
        return n51.f.a(this.f114358d, s7Var.f114358d) && n51.f.a(java.lang.Integer.valueOf(this.f114359e), java.lang.Integer.valueOf(s7Var.f114359e)) && n51.f.a(java.lang.Integer.valueOf(this.f114360f), java.lang.Integer.valueOf(s7Var.f114360f)) && n51.f.a(this.f114361g, s7Var.f114361g) && n51.f.a(java.lang.Integer.valueOf(this.f114362h), java.lang.Integer.valueOf(s7Var.f114362h)) && n51.f.a(java.lang.Boolean.valueOf(this.f114363i), java.lang.Boolean.valueOf(s7Var.f114363i)) && n51.f.a(this.f114364m, s7Var.f114364m) && n51.f.a(java.lang.Boolean.valueOf(this.f114365n), java.lang.Boolean.valueOf(s7Var.f114365n)) && n51.f.a(java.lang.Integer.valueOf(this.f114366o), java.lang.Integer.valueOf(s7Var.f114366o)) && n51.f.a(this.f114367p, s7Var.f114367p) && n51.f.a(java.lang.Integer.valueOf(this.f114368q), java.lang.Integer.valueOf(s7Var.f114368q)) && n51.f.a(java.lang.Integer.valueOf(this.f114369r), java.lang.Integer.valueOf(s7Var.f114369r)) && n51.f.a(java.lang.Boolean.valueOf(this.f114370s), java.lang.Boolean.valueOf(s7Var.f114370s)) && n51.f.a(java.lang.Integer.valueOf(this.f114371t), java.lang.Integer.valueOf(s7Var.f114371t));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.s7 mo11468x92b714fd(byte[] bArr) {
        return (bw5.s7) super.mo11468x92b714fd(bArr);
    }

    public bw5.s7 e(java.lang.String str) {
        this.f114361g = str;
        this.f114372u[4] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.s7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114372u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114358d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f114359e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f114360f);
            }
            java.lang.String str2 = this.f114361g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f114362h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f114363i);
            }
            bw5.r7 r7Var = this.f114364m;
            if (r7Var != null && zArr[7]) {
                fVar.i(7, r7Var.mo75928xcd1e8d8());
                this.f114364m.mo75956x3d5d1f78(fVar);
            }
            if (zArr[8]) {
                fVar.a(8, this.f114365n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f114366o);
            }
            fVar.g(10, 8, this.f114367p);
            if (zArr[11]) {
                fVar.e(11, this.f114368q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f114369r);
            }
            if (zArr[13]) {
                fVar.a(13, this.f114370s);
            }
            if (!zArr[14]) {
                return 0;
            }
            fVar.e(14, this.f114371t);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f114358d;
            int j17 = (str3 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str3);
            if (zArr[2]) {
                j17 += b36.f.e(2, this.f114359e);
            }
            if (zArr[3]) {
                j17 += b36.f.e(3, this.f114360f);
            }
            java.lang.String str4 = this.f114361g;
            if (str4 != null && zArr[4]) {
                j17 += b36.f.j(4, str4);
            }
            if (zArr[5]) {
                j17 += b36.f.e(5, this.f114362h);
            }
            if (zArr[6]) {
                j17 += b36.f.a(6, this.f114363i);
            }
            bw5.r7 r7Var2 = this.f114364m;
            if (r7Var2 != null && zArr[7]) {
                j17 += b36.f.i(7, r7Var2.mo75928xcd1e8d8());
            }
            if (zArr[8]) {
                j17 += b36.f.a(8, this.f114365n);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f114366o);
            }
            int g17 = j17 + b36.f.g(10, 8, this.f114367p);
            if (zArr[11]) {
                g17 += b36.f.e(11, this.f114368q);
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f114369r);
            }
            if (zArr[13]) {
                g17 += b36.f.a(13, this.f114370s);
            }
            return zArr[14] ? g17 + b36.f.e(14, this.f114371t) : g17;
        }
        if (i17 == 2) {
            this.f114367p.clear();
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
                this.f114358d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114359e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114360f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114361g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114362h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f114363i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.r7 r7Var3 = new bw5.r7();
                    if (bArr != null && bArr.length > 0) {
                        r7Var3.mo11468x92b714fd(bArr);
                    }
                    this.f114364m = r7Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f114365n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f114366o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.w7 w7Var = new bw5.w7();
                    if (bArr2 != null && bArr2.length > 0) {
                        w7Var.mo11468x92b714fd(bArr2);
                    }
                    this.f114367p.add(w7Var);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f114368q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f114369r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f114370s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f114371t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }
}
