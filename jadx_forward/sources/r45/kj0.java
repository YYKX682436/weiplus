package r45;

/* loaded from: classes12.dex */
public class kj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ij0 f460259d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f460260e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460261f;

    /* renamed from: g, reason: collision with root package name */
    public int f460262g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460263h;

    /* renamed from: i, reason: collision with root package name */
    public int f460264i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f460265m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f460266n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f460267o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f460268p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f460269q;

    /* renamed from: r, reason: collision with root package name */
    public r45.lj0 f460270r;

    static {
        new r45.kj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.kj0 mo11468x92b714fd(byte[] bArr) {
        return (r45.kj0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kj0)) {
            return false;
        }
        r45.kj0 kj0Var = (r45.kj0) fVar;
        return n51.f.a(this.f460259d, kj0Var.f460259d) && n51.f.a(this.f460260e, kj0Var.f460260e) && n51.f.a(this.f460261f, kj0Var.f460261f) && n51.f.a(java.lang.Integer.valueOf(this.f460262g), java.lang.Integer.valueOf(kj0Var.f460262g)) && n51.f.a(this.f460263h, kj0Var.f460263h) && n51.f.a(java.lang.Integer.valueOf(this.f460264i), java.lang.Integer.valueOf(kj0Var.f460264i)) && n51.f.a(this.f460265m, kj0Var.f460265m) && n51.f.a(this.f460266n, kj0Var.f460266n) && n51.f.a(this.f460267o, kj0Var.f460267o) && n51.f.a(this.f460268p, kj0Var.f460268p) && n51.f.a(this.f460269q, kj0Var.f460269q) && n51.f.a(this.f460270r, kj0Var.f460270r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.kj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ij0 ij0Var = this.f460259d;
            if (ij0Var != null) {
                fVar.i(1, ij0Var.mo75928xcd1e8d8());
                this.f460259d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f460260e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f460261f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f460262g);
            java.lang.String str3 = this.f460263h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f460264i);
            java.lang.String str4 = this.f460265m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f460266n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            java.lang.String str6 = this.f460267o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f460268p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f460269q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            r45.lj0 lj0Var = this.f460270r;
            if (lj0Var != null) {
                fVar.i(12, lj0Var.mo75928xcd1e8d8());
                this.f460270r.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ij0 ij0Var2 = this.f460259d;
            int i18 = ij0Var2 != null ? 0 + b36.f.i(1, ij0Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str9 = this.f460260e;
            if (str9 != null) {
                i18 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f460261f;
            if (str10 != null) {
                i18 += b36.f.j(3, str10);
            }
            int e17 = i18 + b36.f.e(4, this.f460262g);
            java.lang.String str11 = this.f460263h;
            if (str11 != null) {
                e17 += b36.f.j(5, str11);
            }
            int e18 = e17 + b36.f.e(6, this.f460264i);
            java.lang.String str12 = this.f460265m;
            if (str12 != null) {
                e18 += b36.f.j(7, str12);
            }
            java.lang.String str13 = this.f460266n;
            if (str13 != null) {
                e18 += b36.f.j(8, str13);
            }
            java.lang.String str14 = this.f460267o;
            if (str14 != null) {
                e18 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f460268p;
            if (str15 != null) {
                e18 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f460269q;
            if (str16 != null) {
                e18 += b36.f.j(11, str16);
            }
            r45.lj0 lj0Var2 = this.f460270r;
            return lj0Var2 != null ? e18 + b36.f.i(12, lj0Var2.mo75928xcd1e8d8()) : e18;
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ij0 ij0Var3 = new r45.ij0();
                    if (bArr != null && bArr.length > 0) {
                        ij0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f460259d = ij0Var3;
                }
                return 0;
            case 2:
                this.f460260e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f460261f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f460262g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f460263h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f460264i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f460265m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f460266n = aVar2.k(intValue);
                return 0;
            case 9:
                this.f460267o = aVar2.k(intValue);
                return 0;
            case 10:
                this.f460268p = aVar2.k(intValue);
                return 0;
            case 11:
                this.f460269q = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.lj0 lj0Var3 = new r45.lj0();
                    if (bArr2 != null && bArr2.length > 0) {
                        lj0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f460270r = lj0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
