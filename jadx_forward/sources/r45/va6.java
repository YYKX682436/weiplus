package r45;

/* loaded from: classes15.dex */
public class va6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469576d;

    /* renamed from: e, reason: collision with root package name */
    public long f469577e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f469578f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f469579g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f469580h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469581i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f469582m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f469583n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f469584o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f469585p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f469586q;

    /* renamed from: r, reason: collision with root package name */
    public int f469587r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f469588s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.va6)) {
            return false;
        }
        r45.va6 va6Var = (r45.va6) fVar;
        return n51.f.a(this.f469576d, va6Var.f469576d) && n51.f.a(java.lang.Long.valueOf(this.f469577e), java.lang.Long.valueOf(va6Var.f469577e)) && n51.f.a(java.lang.Long.valueOf(this.f469578f), java.lang.Long.valueOf(va6Var.f469578f)) && n51.f.a(java.lang.Long.valueOf(this.f469579g), java.lang.Long.valueOf(va6Var.f469579g)) && n51.f.a(this.f469580h, va6Var.f469580h) && n51.f.a(this.f469581i, va6Var.f469581i) && n51.f.a(this.f469582m, va6Var.f469582m) && n51.f.a(this.f469583n, va6Var.f469583n) && n51.f.a(this.f469584o, va6Var.f469584o) && n51.f.a(this.f469585p, va6Var.f469585p) && n51.f.a(this.f469586q, va6Var.f469586q) && n51.f.a(java.lang.Integer.valueOf(this.f469587r), java.lang.Integer.valueOf(va6Var.f469587r)) && n51.f.a(this.f469588s, va6Var.f469588s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469580h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469576d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f469577e);
            fVar.h(3, this.f469578f);
            fVar.h(4, this.f469579g);
            fVar.g(5, 8, linkedList);
            java.lang.String str2 = this.f469581i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f469582m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f469583n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f469584o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            java.lang.String str6 = this.f469585p;
            if (str6 != null) {
                fVar.j(10, str6);
            }
            java.lang.String str7 = this.f469586q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            fVar.e(12, this.f469587r);
            java.lang.String str8 = this.f469588s;
            if (str8 != null) {
                fVar.j(13, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f469576d;
            int j17 = (str9 != null ? b36.f.j(1, str9) + 0 : 0) + b36.f.h(2, this.f469577e) + b36.f.h(3, this.f469578f) + b36.f.h(4, this.f469579g) + b36.f.g(5, 8, linkedList);
            java.lang.String str10 = this.f469581i;
            if (str10 != null) {
                j17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f469582m;
            if (str11 != null) {
                j17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f469583n;
            if (str12 != null) {
                j17 += b36.f.j(8, str12);
            }
            java.lang.String str13 = this.f469584o;
            if (str13 != null) {
                j17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f469585p;
            if (str14 != null) {
                j17 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f469586q;
            if (str15 != null) {
                j17 += b36.f.j(11, str15);
            }
            int e17 = j17 + b36.f.e(12, this.f469587r);
            java.lang.String str16 = this.f469588s;
            return str16 != null ? e17 + b36.f.j(13, str16) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.va6 va6Var = (r45.va6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                va6Var.f469576d = aVar2.k(intValue);
                return 0;
            case 2:
                va6Var.f469577e = aVar2.i(intValue);
                return 0;
            case 3:
                va6Var.f469578f = aVar2.i(intValue);
                return 0;
            case 4:
                va6Var.f469579g = aVar2.i(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.p86 p86Var = new r45.p86();
                    if (bArr2 != null && bArr2.length > 0) {
                        p86Var.mo11468x92b714fd(bArr2);
                    }
                    va6Var.f469580h.add(p86Var);
                }
                return 0;
            case 6:
                va6Var.f469581i = aVar2.k(intValue);
                return 0;
            case 7:
                va6Var.f469582m = aVar2.k(intValue);
                return 0;
            case 8:
                va6Var.f469583n = aVar2.k(intValue);
                return 0;
            case 9:
                va6Var.f469584o = aVar2.k(intValue);
                return 0;
            case 10:
                va6Var.f469585p = aVar2.k(intValue);
                return 0;
            case 11:
                va6Var.f469586q = aVar2.k(intValue);
                return 0;
            case 12:
                va6Var.f469587r = aVar2.g(intValue);
                return 0;
            case 13:
                va6Var.f469588s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
