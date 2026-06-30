package r45;

/* loaded from: classes4.dex */
public class q1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f465083d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465084e;

    /* renamed from: f, reason: collision with root package name */
    public int f465085f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465086g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f465087h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f465088i;

    /* renamed from: m, reason: collision with root package name */
    public r45.m1 f465089m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f465090n;

    /* renamed from: o, reason: collision with root package name */
    public r45.g8 f465091o;

    /* renamed from: p, reason: collision with root package name */
    public r45.a9 f465092p;

    /* renamed from: q, reason: collision with root package name */
    public r45.z8 f465093q;

    /* renamed from: r, reason: collision with root package name */
    public r45.z8 f465094r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q1)) {
            return false;
        }
        r45.q1 q1Var = (r45.q1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f465083d), java.lang.Integer.valueOf(q1Var.f465083d)) && n51.f.a(this.f465084e, q1Var.f465084e) && n51.f.a(java.lang.Integer.valueOf(this.f465085f), java.lang.Integer.valueOf(q1Var.f465085f)) && n51.f.a(this.f465086g, q1Var.f465086g) && n51.f.a(this.f465087h, q1Var.f465087h) && n51.f.a(this.f465088i, q1Var.f465088i) && n51.f.a(this.f465089m, q1Var.f465089m) && n51.f.a(this.f465090n, q1Var.f465090n) && n51.f.a(this.f465091o, q1Var.f465091o) && n51.f.a(this.f465092p, q1Var.f465092p) && n51.f.a(this.f465093q, q1Var.f465093q) && n51.f.a(this.f465094r, q1Var.f465094r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f465083d);
            java.lang.String str = this.f465084e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f465085f);
            java.lang.String str2 = this.f465086g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f465087h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f465088i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            r45.m1 m1Var = this.f465089m;
            if (m1Var != null) {
                fVar.i(7, m1Var.mo75928xcd1e8d8());
                this.f465089m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f465090n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            r45.g8 g8Var = this.f465091o;
            if (g8Var != null) {
                fVar.i(9, g8Var.mo75928xcd1e8d8());
                this.f465091o.mo75956x3d5d1f78(fVar);
            }
            r45.a9 a9Var = this.f465092p;
            if (a9Var != null) {
                fVar.i(10, a9Var.mo75928xcd1e8d8());
                this.f465092p.mo75956x3d5d1f78(fVar);
            }
            r45.z8 z8Var = this.f465093q;
            if (z8Var != null) {
                fVar.i(11, z8Var.mo75928xcd1e8d8());
                this.f465093q.mo75956x3d5d1f78(fVar);
            }
            r45.z8 z8Var2 = this.f465094r;
            if (z8Var2 != null) {
                fVar.i(12, z8Var2.mo75928xcd1e8d8());
                this.f465094r.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f465083d) + 0;
            java.lang.String str6 = this.f465084e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            int e18 = e17 + b36.f.e(3, this.f465085f);
            java.lang.String str7 = this.f465086g;
            if (str7 != null) {
                e18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f465087h;
            if (str8 != null) {
                e18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f465088i;
            if (str9 != null) {
                e18 += b36.f.j(6, str9);
            }
            r45.m1 m1Var2 = this.f465089m;
            if (m1Var2 != null) {
                e18 += b36.f.i(7, m1Var2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f465090n;
            if (str10 != null) {
                e18 += b36.f.j(8, str10);
            }
            r45.g8 g8Var2 = this.f465091o;
            if (g8Var2 != null) {
                e18 += b36.f.i(9, g8Var2.mo75928xcd1e8d8());
            }
            r45.a9 a9Var2 = this.f465092p;
            if (a9Var2 != null) {
                e18 += b36.f.i(10, a9Var2.mo75928xcd1e8d8());
            }
            r45.z8 z8Var3 = this.f465093q;
            if (z8Var3 != null) {
                e18 += b36.f.i(11, z8Var3.mo75928xcd1e8d8());
            }
            r45.z8 z8Var4 = this.f465094r;
            return z8Var4 != null ? e18 + b36.f.i(12, z8Var4.mo75928xcd1e8d8()) : e18;
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
        r45.q1 q1Var = (r45.q1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q1Var.f465083d = aVar2.g(intValue);
                return 0;
            case 2:
                q1Var.f465084e = aVar2.k(intValue);
                return 0;
            case 3:
                q1Var.f465085f = aVar2.g(intValue);
                return 0;
            case 4:
                q1Var.f465086g = aVar2.k(intValue);
                return 0;
            case 5:
                q1Var.f465087h = aVar2.k(intValue);
                return 0;
            case 6:
                q1Var.f465088i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.m1 m1Var3 = new r45.m1();
                    if (bArr != null && bArr.length > 0) {
                        m1Var3.mo11468x92b714fd(bArr);
                    }
                    q1Var.f465089m = m1Var3;
                }
                return 0;
            case 8:
                q1Var.f465090n = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.g8 g8Var3 = new r45.g8();
                    if (bArr2 != null && bArr2.length > 0) {
                        g8Var3.mo11468x92b714fd(bArr2);
                    }
                    q1Var.f465091o = g8Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.a9 a9Var3 = new r45.a9();
                    if (bArr3 != null && bArr3.length > 0) {
                        a9Var3.mo11468x92b714fd(bArr3);
                    }
                    q1Var.f465092p = a9Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.z8 z8Var5 = new r45.z8();
                    if (bArr4 != null && bArr4.length > 0) {
                        z8Var5.mo11468x92b714fd(bArr4);
                    }
                    q1Var.f465093q = z8Var5;
                }
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    r45.z8 z8Var6 = new r45.z8();
                    if (bArr5 != null && bArr5.length > 0) {
                        z8Var6.mo11468x92b714fd(bArr5);
                    }
                    q1Var.f465094r = z8Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
