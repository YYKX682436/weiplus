package r45;

/* loaded from: classes2.dex */
public class qg4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f465499d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465500e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465501f;

    /* renamed from: g, reason: collision with root package name */
    public long f465502g;

    /* renamed from: h, reason: collision with root package name */
    public r45.rg4 f465503h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f465504i;

    /* renamed from: m, reason: collision with root package name */
    public int f465505m;

    /* renamed from: n, reason: collision with root package name */
    public int f465506n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f465507o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f465508p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qg4)) {
            return false;
        }
        r45.qg4 qg4Var = (r45.qg4) fVar;
        return n51.f.a(this.f465499d, qg4Var.f465499d) && n51.f.a(this.f465500e, qg4Var.f465500e) && n51.f.a(this.f465501f, qg4Var.f465501f) && n51.f.a(java.lang.Long.valueOf(this.f465502g), java.lang.Long.valueOf(qg4Var.f465502g)) && n51.f.a(this.f465503h, qg4Var.f465503h) && n51.f.a(this.f465504i, qg4Var.f465504i) && n51.f.a(java.lang.Integer.valueOf(this.f465505m), java.lang.Integer.valueOf(qg4Var.f465505m)) && n51.f.a(java.lang.Integer.valueOf(this.f465506n), java.lang.Integer.valueOf(qg4Var.f465506n)) && n51.f.a(this.f465507o, qg4Var.f465507o) && n51.f.a(this.f465508p, qg4Var.f465508p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f465499d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f465500e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f465501f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f465502g);
            r45.rg4 rg4Var = this.f465503h;
            if (rg4Var != null) {
                fVar.i(7, rg4Var.mo75928xcd1e8d8());
                this.f465503h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f465504i;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            fVar.e(11, this.f465505m);
            fVar.e(12, this.f465506n);
            java.lang.String str5 = this.f465507o;
            if (str5 != null) {
                fVar.j(14, str5);
            }
            java.lang.String str6 = this.f465508p;
            if (str6 != null) {
                fVar.j(15, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f465499d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f465500e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f465501f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            int h17 = j17 + b36.f.h(4, this.f465502g);
            r45.rg4 rg4Var2 = this.f465503h;
            if (rg4Var2 != null) {
                h17 += b36.f.i(7, rg4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f465504i;
            if (str10 != null) {
                h17 += b36.f.j(10, str10);
            }
            int e17 = h17 + b36.f.e(11, this.f465505m) + b36.f.e(12, this.f465506n);
            java.lang.String str11 = this.f465507o;
            if (str11 != null) {
                e17 += b36.f.j(14, str11);
            }
            java.lang.String str12 = this.f465508p;
            return str12 != null ? e17 + b36.f.j(15, str12) : e17;
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
        r45.qg4 qg4Var = (r45.qg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qg4Var.f465499d = aVar2.k(intValue);
                return 0;
            case 2:
                qg4Var.f465500e = aVar2.k(intValue);
                return 0;
            case 3:
                qg4Var.f465501f = aVar2.k(intValue);
                return 0;
            case 4:
                qg4Var.f465502g = aVar2.i(intValue);
                return 0;
            case 5:
            case 6:
            case 8:
            case 9:
            case 13:
            default:
                return -1;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.rg4 rg4Var3 = new r45.rg4();
                    if (bArr != null && bArr.length > 0) {
                        rg4Var3.mo11468x92b714fd(bArr);
                    }
                    qg4Var.f465503h = rg4Var3;
                }
                return 0;
            case 10:
                qg4Var.f465504i = aVar2.k(intValue);
                return 0;
            case 11:
                qg4Var.f465505m = aVar2.g(intValue);
                return 0;
            case 12:
                qg4Var.f465506n = aVar2.g(intValue);
                return 0;
            case 14:
                qg4Var.f465507o = aVar2.k(intValue);
                return 0;
            case 15:
                qg4Var.f465508p = aVar2.k(intValue);
                return 0;
        }
    }
}
