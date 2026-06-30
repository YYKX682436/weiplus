package r45;

/* loaded from: classes4.dex */
public class of0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463743d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463744e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463745f;

    /* renamed from: g, reason: collision with root package name */
    public int f463746g;

    /* renamed from: h, reason: collision with root package name */
    public int f463747h;

    /* renamed from: i, reason: collision with root package name */
    public int f463748i;

    /* renamed from: m, reason: collision with root package name */
    public r45.cu5 f463749m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.of0)) {
            return false;
        }
        r45.of0 of0Var = (r45.of0) fVar;
        return n51.f.a(this.f76492x92037252, of0Var.f76492x92037252) && n51.f.a(this.f463743d, of0Var.f463743d) && n51.f.a(this.f463744e, of0Var.f463744e) && n51.f.a(this.f463745f, of0Var.f463745f) && n51.f.a(java.lang.Integer.valueOf(this.f463746g), java.lang.Integer.valueOf(of0Var.f463746g)) && n51.f.a(java.lang.Integer.valueOf(this.f463747h), java.lang.Integer.valueOf(of0Var.f463747h)) && n51.f.a(java.lang.Integer.valueOf(this.f463748i), java.lang.Integer.valueOf(of0Var.f463748i)) && n51.f.a(this.f463749m, of0Var.f463749m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f463743d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f463744e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f463745f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f463746g);
            fVar.e(6, this.f463747h);
            fVar.e(7, this.f463748i);
            r45.cu5 cu5Var = this.f463749m;
            if (cu5Var != null) {
                fVar.i(8, cu5Var.mo75928xcd1e8d8());
                this.f463749m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f463743d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f463744e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f463745f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            int e17 = i18 + b36.f.e(5, this.f463746g) + b36.f.e(6, this.f463747h) + b36.f.e(7, this.f463748i);
            r45.cu5 cu5Var2 = this.f463749m;
            return cu5Var2 != null ? e17 + b36.f.i(8, cu5Var2.mo75928xcd1e8d8()) : e17;
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
        r45.of0 of0Var = (r45.of0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    of0Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                of0Var.f463743d = aVar2.k(intValue);
                return 0;
            case 3:
                of0Var.f463744e = aVar2.k(intValue);
                return 0;
            case 4:
                of0Var.f463745f = aVar2.k(intValue);
                return 0;
            case 5:
                of0Var.f463746g = aVar2.g(intValue);
                return 0;
            case 6:
                of0Var.f463747h = aVar2.g(intValue);
                return 0;
            case 7:
                of0Var.f463748i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var3.b(bArr2);
                    }
                    of0Var.f463749m = cu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
