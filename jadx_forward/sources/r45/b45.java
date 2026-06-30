package r45;

/* loaded from: classes9.dex */
public class b45 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452052d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452053e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452054f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452055g;

    /* renamed from: h, reason: collision with root package name */
    public r45.a44 f452056h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f452057i = false;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b45)) {
            return false;
        }
        r45.b45 b45Var = (r45.b45) fVar;
        return n51.f.a(this.f452052d, b45Var.f452052d) && n51.f.a(this.f452053e, b45Var.f452053e) && n51.f.a(this.f452054f, b45Var.f452054f) && n51.f.a(this.f452055g, b45Var.f452055g) && n51.f.a(this.f452056h, b45Var.f452056h) && n51.f.a(java.lang.Boolean.valueOf(this.f452057i), java.lang.Boolean.valueOf(b45Var.f452057i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452052d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452053e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f452054f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f452055g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            r45.a44 a44Var = this.f452056h;
            if (a44Var != null) {
                fVar.i(5, a44Var.mo75928xcd1e8d8());
                this.f452056h.mo75956x3d5d1f78(fVar);
            }
            fVar.a(6, this.f452057i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f452052d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f452053e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f452054f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f452055g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            r45.a44 a44Var2 = this.f452056h;
            if (a44Var2 != null) {
                j17 += b36.f.i(5, a44Var2.mo75928xcd1e8d8());
            }
            return j17 + b36.f.a(6, this.f452057i);
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
        r45.b45 b45Var = (r45.b45) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b45Var.f452052d = aVar2.k(intValue);
                return 0;
            case 2:
                b45Var.f452053e = aVar2.k(intValue);
                return 0;
            case 3:
                b45Var.f452054f = aVar2.k(intValue);
                return 0;
            case 4:
                b45Var.f452055g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.a44 a44Var3 = new r45.a44();
                    if (bArr != null && bArr.length > 0) {
                        a44Var3.mo11468x92b714fd(bArr);
                    }
                    b45Var.f452056h = a44Var3;
                }
                return 0;
            case 6:
                b45Var.f452057i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
