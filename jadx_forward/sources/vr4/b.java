package vr4;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public vr4.u0 f521213d;

    /* renamed from: e, reason: collision with root package name */
    public int f521214e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f521215f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f521216g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f521217h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f521218i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f521219m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f521220n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f521221o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof vr4.b)) {
            return false;
        }
        vr4.b bVar = (vr4.b) fVar;
        return n51.f.a(this.f521213d, bVar.f521213d) && n51.f.a(java.lang.Integer.valueOf(this.f521214e), java.lang.Integer.valueOf(bVar.f521214e)) && n51.f.a(this.f521215f, bVar.f521215f) && n51.f.a(this.f521216g, bVar.f521216g) && n51.f.a(this.f521217h, bVar.f521217h) && n51.f.a(this.f521218i, bVar.f521218i) && n51.f.a(this.f521219m, bVar.f521219m) && n51.f.a(this.f521220n, bVar.f521220n) && n51.f.a(this.f521221o, bVar.f521221o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            vr4.u0 u0Var = this.f521213d;
            if (u0Var != null) {
                fVar.i(1, u0Var.mo75928xcd1e8d8());
                this.f521213d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f521214e);
            java.lang.String str = this.f521215f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f521216g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f521217h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f521218i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f521219m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f521220n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f521221o;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            vr4.u0 u0Var2 = this.f521213d;
            int i18 = (u0Var2 != null ? 0 + b36.f.i(1, u0Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f521214e);
            java.lang.String str8 = this.f521215f;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f521216g;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f521217h;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f521218i;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f521219m;
            if (str12 != null) {
                i18 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f521220n;
            if (str13 != null) {
                i18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f521221o;
            return str14 != null ? i18 + b36.f.j(9, str14) : i18;
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
        vr4.b bVar = (vr4.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    vr4.u0 u0Var3 = new vr4.u0();
                    if (bArr != null && bArr.length > 0) {
                        u0Var3.mo11468x92b714fd(bArr);
                    }
                    bVar.f521213d = u0Var3;
                }
                return 0;
            case 2:
                bVar.f521214e = aVar2.g(intValue);
                return 0;
            case 3:
                bVar.f521215f = aVar2.k(intValue);
                return 0;
            case 4:
                bVar.f521216g = aVar2.k(intValue);
                return 0;
            case 5:
                bVar.f521217h = aVar2.k(intValue);
                return 0;
            case 6:
                bVar.f521218i = aVar2.k(intValue);
                return 0;
            case 7:
                bVar.f521219m = aVar2.k(intValue);
                return 0;
            case 8:
                bVar.f521220n = aVar2.k(intValue);
                return 0;
            case 9:
                bVar.f521221o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
