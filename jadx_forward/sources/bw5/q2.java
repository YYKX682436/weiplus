package bw5;

/* loaded from: classes9.dex */
public class q2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113430d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f113431e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113432f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f113433g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f113434h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f113435i;

    /* renamed from: m, reason: collision with root package name */
    public int f113436m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f113437n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f113438o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f113439p = new boolean[10];

    static {
        new bw5.q2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q2)) {
            return false;
        }
        bw5.q2 q2Var = (bw5.q2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113430d), java.lang.Integer.valueOf(q2Var.f113430d)) && n51.f.a(this.f113431e, q2Var.f113431e) && n51.f.a(this.f113432f, q2Var.f113432f) && n51.f.a(this.f113433g, q2Var.f113433g) && n51.f.a(this.f113434h, q2Var.f113434h) && n51.f.a(this.f113435i, q2Var.f113435i) && n51.f.a(java.lang.Integer.valueOf(this.f113436m), java.lang.Integer.valueOf(q2Var.f113436m)) && n51.f.a(this.f113437n, q2Var.f113437n) && n51.f.a(this.f113438o, q2Var.f113438o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.q2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113439p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113430d);
            }
            r45.cu5 cu5Var = this.f113431e;
            if (cu5Var != null && zArr[2]) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f113431e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f113432f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            r45.cu5 cu5Var2 = this.f113433g;
            if (cu5Var2 != null && zArr[4]) {
                fVar.i(4, cu5Var2.mo75928xcd1e8d8());
                this.f113433g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f113434h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f113435i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            if (zArr[7]) {
                fVar.e(7, this.f113436m);
            }
            java.lang.String str4 = this.f113437n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f113438o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f113430d) : 0;
            r45.cu5 cu5Var3 = this.f113431e;
            if (cu5Var3 != null && zArr[2]) {
                e17 += b36.f.i(2, cu5Var3.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f113432f;
            if (str6 != null && zArr[3]) {
                e17 += b36.f.j(3, str6);
            }
            r45.cu5 cu5Var4 = this.f113433g;
            if (cu5Var4 != null && zArr[4]) {
                e17 += b36.f.i(4, cu5Var4.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f113434h;
            if (str7 != null && zArr[5]) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f113435i;
            if (str8 != null && zArr[6]) {
                e17 += b36.f.j(6, str8);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f113436m);
            }
            java.lang.String str9 = this.f113437n;
            if (str9 != null && zArr[8]) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f113438o;
            return (str10 == null || !zArr[9]) ? e17 : e17 + b36.f.j(9, str10);
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
                this.f113430d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var5.b(bArr);
                    }
                    this.f113431e = cu5Var5;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f113432f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var6.b(bArr2);
                    }
                    this.f113433g = cu5Var6;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f113434h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f113435i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113436m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f113437n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f113438o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.q2) super.mo11468x92b714fd(bArr);
    }
}
