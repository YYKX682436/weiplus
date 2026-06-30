package ks3;

/* loaded from: classes2.dex */
public class b1 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f393169d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f393170e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f393171f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f393172g;

    /* renamed from: h, reason: collision with root package name */
    public int f393173h;

    /* renamed from: i, reason: collision with root package name */
    public int f393174i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.b1)) {
            return false;
        }
        ks3.b1 b1Var = (ks3.b1) fVar;
        return n51.f.a(this.f76492x92037252, b1Var.f76492x92037252) && n51.f.a(this.f393169d, b1Var.f393169d) && n51.f.a(java.lang.Boolean.valueOf(this.f393170e), java.lang.Boolean.valueOf(b1Var.f393170e)) && n51.f.a(this.f393171f, b1Var.f393171f) && n51.f.a(this.f393172g, b1Var.f393172g) && n51.f.a(java.lang.Integer.valueOf(this.f393173h), java.lang.Integer.valueOf(b1Var.f393173h)) && n51.f.a(java.lang.Integer.valueOf(this.f393174i), java.lang.Integer.valueOf(b1Var.f393174i));
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
            java.lang.String str = this.f393169d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f393170e);
            java.lang.String str2 = this.f393171f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f393172g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f393173h);
            fVar.e(7, this.f393174i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f393169d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int a17 = i18 + b36.f.a(3, this.f393170e);
            java.lang.String str5 = this.f393171f;
            if (str5 != null) {
                a17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f393172g;
            if (str6 != null) {
                a17 += b36.f.j(5, str6);
            }
            return a17 + b36.f.e(6, this.f393173h) + b36.f.e(7, this.f393174i);
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
        ks3.b1 b1Var = (ks3.b1) objArr[1];
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
                    b1Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                b1Var.f393169d = aVar2.k(intValue);
                return 0;
            case 3:
                b1Var.f393170e = aVar2.c(intValue);
                return 0;
            case 4:
                b1Var.f393171f = aVar2.k(intValue);
                return 0;
            case 5:
                b1Var.f393172g = aVar2.k(intValue);
                return 0;
            case 6:
                b1Var.f393173h = aVar2.g(intValue);
                return 0;
            case 7:
                b1Var.f393174i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
