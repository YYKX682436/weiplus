package ks3;

/* loaded from: classes4.dex */
public class w0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f393295d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f393296e;

    /* renamed from: f, reason: collision with root package name */
    public int f393297f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f393298g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f393299h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f393300i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f393301m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.w0)) {
            return false;
        }
        ks3.w0 w0Var = (ks3.w0) fVar;
        return n51.f.a(this.f393295d, w0Var.f393295d) && n51.f.a(this.f393296e, w0Var.f393296e) && n51.f.a(java.lang.Integer.valueOf(this.f393297f), java.lang.Integer.valueOf(w0Var.f393297f)) && n51.f.a(this.f393298g, w0Var.f393298g) && n51.f.a(this.f393299h, w0Var.f393299h) && n51.f.a(this.f393300i, w0Var.f393300i) && n51.f.a(this.f393301m, w0Var.f393301m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f393295d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f393296e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f393297f);
            java.lang.String str3 = this.f393298g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f393299h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f393300i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f393301m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f393295d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f393296e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            int e17 = j17 + b36.f.e(3, this.f393297f);
            java.lang.String str9 = this.f393298g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f393299h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f393300i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f393301m;
            return str12 != null ? e17 + b36.f.j(7, str12) : e17;
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
        ks3.w0 w0Var = (ks3.w0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                w0Var.f393295d = aVar2.k(intValue);
                return 0;
            case 2:
                w0Var.f393296e = aVar2.k(intValue);
                return 0;
            case 3:
                w0Var.f393297f = aVar2.g(intValue);
                return 0;
            case 4:
                w0Var.f393298g = aVar2.k(intValue);
                return 0;
            case 5:
                w0Var.f393299h = aVar2.k(intValue);
                return 0;
            case 6:
                w0Var.f393300i = aVar2.k(intValue);
                return 0;
            case 7:
                w0Var.f393301m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
