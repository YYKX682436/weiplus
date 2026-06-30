package bw5;

/* loaded from: classes9.dex */
public class q7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113512d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113513e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113514f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f113515g;

    /* renamed from: h, reason: collision with root package name */
    public int f113516h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.p7 f113517i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f113518m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f113519n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f113520o = new boolean[9];

    static {
        new bw5.q7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.q7 mo11468x92b714fd(byte[] bArr) {
        return (bw5.q7) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q7)) {
            return false;
        }
        bw5.q7 q7Var = (bw5.q7) fVar;
        return n51.f.a(this.f113512d, q7Var.f113512d) && n51.f.a(this.f113513e, q7Var.f113513e) && n51.f.a(this.f113514f, q7Var.f113514f) && n51.f.a(this.f113515g, q7Var.f113515g) && n51.f.a(java.lang.Integer.valueOf(this.f113516h), java.lang.Integer.valueOf(q7Var.f113516h)) && n51.f.a(this.f113517i, q7Var.f113517i) && n51.f.a(java.lang.Boolean.valueOf(this.f113518m), java.lang.Boolean.valueOf(q7Var.f113518m)) && n51.f.a(this.f113519n, q7Var.f113519n);
    }

    /* renamed from: getAppid */
    public java.lang.String m12798x74292946() {
        return this.f113520o[1] ? this.f113512d : "";
    }

    /* renamed from: getPath */
    public java.lang.String m12799xfb83cc9b() {
        return this.f113520o[2] ? this.f113513e : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.q7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f113520o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f113512d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f113513e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f113514f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f113515g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            if (zArr[5]) {
                fVar.e(5, this.f113516h);
            }
            bw5.p7 p7Var = this.f113517i;
            if (p7Var != null && zArr[6]) {
                fVar.i(6, p7Var.mo75928xcd1e8d8());
                this.f113517i.mo75956x3d5d1f78(fVar);
            }
            if (zArr[7]) {
                fVar.a(7, this.f113518m);
            }
            java.lang.String str5 = this.f113519n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f113512d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f113513e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f113514f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f113515g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f113516h);
            }
            bw5.p7 p7Var2 = this.f113517i;
            if (p7Var2 != null && zArr[6]) {
                i18 += b36.f.i(6, p7Var2.mo75928xcd1e8d8());
            }
            if (zArr[7]) {
                i18 += b36.f.a(7, this.f113518m);
            }
            java.lang.String str10 = this.f113519n;
            return (str10 == null || !zArr[8]) ? i18 : i18 + b36.f.j(8, str10);
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
                this.f113512d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113513e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113514f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113515g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f113516h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.p7 p7Var3 = new bw5.p7();
                    if (bArr != null && bArr.length > 0) {
                        p7Var3.mo11468x92b714fd(bArr);
                    }
                    this.f113517i = p7Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f113518m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f113519n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
