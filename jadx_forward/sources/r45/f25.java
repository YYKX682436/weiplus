package r45;

/* loaded from: classes9.dex */
public class f25 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f455476d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455477e;

    /* renamed from: f, reason: collision with root package name */
    public int f455478f;

    /* renamed from: g, reason: collision with root package name */
    public int f455479g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455480h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455481i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f455482m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f455483n;

    /* renamed from: o, reason: collision with root package name */
    public int f455484o;

    /* renamed from: p, reason: collision with root package name */
    public int f455485p;

    /* renamed from: q, reason: collision with root package name */
    public r45.tw4 f455486q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f25)) {
            return false;
        }
        r45.f25 f25Var = (r45.f25) fVar;
        return n51.f.a(this.f76492x92037252, f25Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f455476d), java.lang.Integer.valueOf(f25Var.f455476d)) && n51.f.a(this.f455477e, f25Var.f455477e) && n51.f.a(java.lang.Integer.valueOf(this.f455478f), java.lang.Integer.valueOf(f25Var.f455478f)) && n51.f.a(java.lang.Integer.valueOf(this.f455479g), java.lang.Integer.valueOf(f25Var.f455479g)) && n51.f.a(this.f455480h, f25Var.f455480h) && n51.f.a(this.f455481i, f25Var.f455481i) && n51.f.a(this.f455482m, f25Var.f455482m) && n51.f.a(this.f455483n, f25Var.f455483n) && n51.f.a(java.lang.Integer.valueOf(this.f455484o), java.lang.Integer.valueOf(f25Var.f455484o)) && n51.f.a(java.lang.Integer.valueOf(this.f455485p), java.lang.Integer.valueOf(f25Var.f455485p)) && n51.f.a(this.f455486q, f25Var.f455486q);
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
            fVar.e(2, this.f455476d);
            java.lang.String str = this.f455477e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f455478f);
            fVar.e(5, this.f455479g);
            java.lang.String str2 = this.f455480h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f455481i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f455482m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f455483n;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.e(10, this.f455484o);
            fVar.e(11, this.f455485p);
            r45.tw4 tw4Var = this.f455486q;
            if (tw4Var != null) {
                fVar.i(12, tw4Var.mo75928xcd1e8d8());
                this.f455486q.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f455476d);
            java.lang.String str6 = this.f455477e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int e17 = i18 + b36.f.e(4, this.f455478f) + b36.f.e(5, this.f455479g);
            java.lang.String str7 = this.f455480h;
            if (str7 != null) {
                e17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f455481i;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f455482m;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f455483n;
            if (str10 != null) {
                e17 += b36.f.j(9, str10);
            }
            int e18 = e17 + b36.f.e(10, this.f455484o) + b36.f.e(11, this.f455485p);
            r45.tw4 tw4Var2 = this.f455486q;
            return tw4Var2 != null ? e18 + b36.f.i(12, tw4Var2.mo75928xcd1e8d8()) : e18;
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
        r45.f25 f25Var = (r45.f25) objArr[1];
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
                    f25Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                f25Var.f455476d = aVar2.g(intValue);
                return 0;
            case 3:
                f25Var.f455477e = aVar2.k(intValue);
                return 0;
            case 4:
                f25Var.f455478f = aVar2.g(intValue);
                return 0;
            case 5:
                f25Var.f455479g = aVar2.g(intValue);
                return 0;
            case 6:
                f25Var.f455480h = aVar2.k(intValue);
                return 0;
            case 7:
                f25Var.f455481i = aVar2.k(intValue);
                return 0;
            case 8:
                f25Var.f455482m = aVar2.k(intValue);
                return 0;
            case 9:
                f25Var.f455483n = aVar2.k(intValue);
                return 0;
            case 10:
                f25Var.f455484o = aVar2.g(intValue);
                return 0;
            case 11:
                f25Var.f455485p = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr2 != null && bArr2.length > 0) {
                        tw4Var3.mo11468x92b714fd(bArr2);
                    }
                    f25Var.f455486q = tw4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
