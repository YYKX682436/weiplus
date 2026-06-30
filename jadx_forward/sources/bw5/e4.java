package bw5;

/* loaded from: classes2.dex */
public class e4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f108252d;

    /* renamed from: e, reason: collision with root package name */
    public int f108253e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f108254f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108255g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f108256h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108257i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f108258m = new boolean[7];

    static {
        new bw5.e4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e4)) {
            return false;
        }
        bw5.e4 e4Var = (bw5.e4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f108252d), java.lang.Integer.valueOf(e4Var.f108252d)) && n51.f.a(java.lang.Integer.valueOf(this.f108253e), java.lang.Integer.valueOf(e4Var.f108253e)) && n51.f.a(this.f108254f, e4Var.f108254f) && n51.f.a(this.f108255g, e4Var.f108255g) && n51.f.a(this.f108256h, e4Var.f108256h) && n51.f.a(this.f108257i, e4Var.f108257i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.e4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108258m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f108252d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f108253e);
            }
            java.lang.String str = this.f108254f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f108255g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f108256h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f108257i;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f108252d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f108253e);
            }
            java.lang.String str4 = this.f108254f;
            if (str4 != null && zArr[3]) {
                e17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f108255g;
            if (str5 != null && zArr[4]) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f108256h;
            if (str6 != null && zArr[5]) {
                e17 += b36.f.j(5, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f108257i;
            return (gVar2 == null || !zArr[6]) ? e17 : e17 + b36.f.b(6, gVar2);
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
                this.f108252d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f108253e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f108254f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108255g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108256h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108257i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.e4) super.mo11468x92b714fd(bArr);
    }
}
