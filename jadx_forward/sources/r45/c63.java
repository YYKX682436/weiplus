package r45;

/* loaded from: classes8.dex */
public class c63 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452835d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452836e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452837f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452838g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452839h;

    /* renamed from: i, reason: collision with root package name */
    public r45.m63 f452840i;

    /* renamed from: m, reason: collision with root package name */
    public int f452841m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f452842n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c63)) {
            return false;
        }
        r45.c63 c63Var = (r45.c63) fVar;
        return n51.f.a(this.f452835d, c63Var.f452835d) && n51.f.a(this.f452836e, c63Var.f452836e) && n51.f.a(this.f452837f, c63Var.f452837f) && n51.f.a(this.f452838g, c63Var.f452838g) && n51.f.a(this.f452839h, c63Var.f452839h) && n51.f.a(this.f452840i, c63Var.f452840i) && n51.f.a(java.lang.Integer.valueOf(this.f452841m), java.lang.Integer.valueOf(c63Var.f452841m)) && n51.f.a(this.f452842n, c63Var.f452842n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452835d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452836e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f452837f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f452838g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f452839h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            r45.m63 m63Var = this.f452840i;
            if (m63Var != null) {
                fVar.i(6, m63Var.mo75928xcd1e8d8());
                this.f452840i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f452841m);
            java.lang.String str6 = this.f452842n;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f452835d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f452836e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f452837f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f452838g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f452839h;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            r45.m63 m63Var2 = this.f452840i;
            if (m63Var2 != null) {
                j17 += b36.f.i(6, m63Var2.mo75928xcd1e8d8());
            }
            int e17 = j17 + b36.f.e(7, this.f452841m);
            java.lang.String str12 = this.f452842n;
            return str12 != null ? e17 + b36.f.j(8, str12) : e17;
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
        r45.c63 c63Var = (r45.c63) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c63Var.f452835d = aVar2.k(intValue);
                return 0;
            case 2:
                c63Var.f452836e = aVar2.k(intValue);
                return 0;
            case 3:
                c63Var.f452837f = aVar2.k(intValue);
                return 0;
            case 4:
                c63Var.f452838g = aVar2.k(intValue);
                return 0;
            case 5:
                c63Var.f452839h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.m63 m63Var3 = new r45.m63();
                    if (bArr != null && bArr.length > 0) {
                        m63Var3.mo11468x92b714fd(bArr);
                    }
                    c63Var.f452840i = m63Var3;
                }
                return 0;
            case 7:
                c63Var.f452841m = aVar2.g(intValue);
                return 0;
            case 8:
                c63Var.f452842n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
