package r45;

/* loaded from: classes9.dex */
public class b2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bn6 f451967d;

    /* renamed from: e, reason: collision with root package name */
    public int f451968e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f451969f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451970g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451971h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451972i = "";

    /* renamed from: m, reason: collision with root package name */
    public long f451973m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f451974n = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b2)) {
            return false;
        }
        r45.b2 b2Var = (r45.b2) fVar;
        return n51.f.a(this.f451967d, b2Var.f451967d) && n51.f.a(java.lang.Integer.valueOf(this.f451968e), java.lang.Integer.valueOf(b2Var.f451968e)) && n51.f.a(java.lang.Integer.valueOf(this.f451969f), java.lang.Integer.valueOf(b2Var.f451969f)) && n51.f.a(this.f451970g, b2Var.f451970g) && n51.f.a(this.f451971h, b2Var.f451971h) && n51.f.a(this.f451972i, b2Var.f451972i) && n51.f.a(java.lang.Long.valueOf(this.f451973m), java.lang.Long.valueOf(b2Var.f451973m)) && n51.f.a(java.lang.Integer.valueOf(this.f451974n), java.lang.Integer.valueOf(b2Var.f451974n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bn6 bn6Var = this.f451967d;
            if (bn6Var != null) {
                fVar.i(1, bn6Var.mo75928xcd1e8d8());
                this.f451967d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f451968e);
            fVar.e(3, this.f451969f);
            java.lang.String str = this.f451970g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f451971h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f451972i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.h(7, this.f451973m);
            fVar.e(8, this.f451974n);
            return 0;
        }
        if (i17 == 1) {
            r45.bn6 bn6Var2 = this.f451967d;
            int i18 = (bn6Var2 != null ? 0 + b36.f.i(1, bn6Var2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f451968e) + b36.f.e(3, this.f451969f);
            java.lang.String str4 = this.f451970g;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f451971h;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            java.lang.String str6 = this.f451972i;
            if (str6 != null) {
                i18 += b36.f.j(6, str6);
            }
            return i18 + b36.f.h(7, this.f451973m) + b36.f.e(8, this.f451974n);
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
        r45.b2 b2Var = (r45.b2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.bn6 bn6Var3 = new r45.bn6();
                    if (bArr != null && bArr.length > 0) {
                        bn6Var3.mo11468x92b714fd(bArr);
                    }
                    b2Var.f451967d = bn6Var3;
                }
                return 0;
            case 2:
                b2Var.f451968e = aVar2.g(intValue);
                return 0;
            case 3:
                b2Var.f451969f = aVar2.g(intValue);
                return 0;
            case 4:
                b2Var.f451970g = aVar2.k(intValue);
                return 0;
            case 5:
                b2Var.f451971h = aVar2.k(intValue);
                return 0;
            case 6:
                b2Var.f451972i = aVar2.k(intValue);
                return 0;
            case 7:
                b2Var.f451973m = aVar2.i(intValue);
                return 0;
            case 8:
                b2Var.f451974n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
