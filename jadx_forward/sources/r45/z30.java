package r45;

/* loaded from: classes8.dex */
public class z30 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f473194d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f473195e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473196f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f473197g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f473198h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f473199i;

    /* renamed from: m, reason: collision with root package name */
    public int f473200m;

    /* renamed from: n, reason: collision with root package name */
    public r45.j16 f473201n;

    /* renamed from: o, reason: collision with root package name */
    public r45.l36 f473202o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f473203p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f473204q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z30)) {
            return false;
        }
        r45.z30 z30Var = (r45.z30) fVar;
        return n51.f.a(this.f76494x2de60e5e, z30Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f473194d), java.lang.Integer.valueOf(z30Var.f473194d)) && n51.f.a(this.f473195e, z30Var.f473195e) && n51.f.a(this.f473196f, z30Var.f473196f) && n51.f.a(this.f473197g, z30Var.f473197g) && n51.f.a(this.f473198h, z30Var.f473198h) && n51.f.a(java.lang.Integer.valueOf(this.f473199i), java.lang.Integer.valueOf(z30Var.f473199i)) && n51.f.a(java.lang.Integer.valueOf(this.f473200m), java.lang.Integer.valueOf(z30Var.f473200m)) && n51.f.a(this.f473201n, z30Var.f473201n) && n51.f.a(this.f473202o, z30Var.f473202o) && n51.f.a(this.f473203p, z30Var.f473203p) && n51.f.a(this.f473204q, z30Var.f473204q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f473194d);
            java.lang.String str = this.f473195e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f473196f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f473197g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.g(6, 8, this.f473198h);
            fVar.e(7, this.f473199i);
            fVar.e(8, this.f473200m);
            r45.j16 j16Var = this.f473201n;
            if (j16Var != null) {
                fVar.i(9, j16Var.mo75928xcd1e8d8());
                this.f473201n.mo75956x3d5d1f78(fVar);
            }
            r45.l36 l36Var = this.f473202o;
            if (l36Var != null) {
                fVar.i(10, l36Var.mo75928xcd1e8d8());
                this.f473202o.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f473203p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f473204q;
            if (gVar != null) {
                fVar.b(12, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f473194d);
            java.lang.String str5 = this.f473195e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f473196f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f473197g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            int g17 = i18 + b36.f.g(6, 8, this.f473198h) + b36.f.e(7, this.f473199i) + b36.f.e(8, this.f473200m);
            r45.j16 j16Var2 = this.f473201n;
            if (j16Var2 != null) {
                g17 += b36.f.i(9, j16Var2.mo75928xcd1e8d8());
            }
            r45.l36 l36Var2 = this.f473202o;
            if (l36Var2 != null) {
                g17 += b36.f.i(10, l36Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f473203p;
            if (str8 != null) {
                g17 += b36.f.j(11, str8);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f473204q;
            return gVar2 != null ? g17 + b36.f.b(12, gVar2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f473198h.clear();
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
        r45.z30 z30Var = (r45.z30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    z30Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                z30Var.f473194d = aVar2.g(intValue);
                return 0;
            case 3:
                z30Var.f473195e = aVar2.k(intValue);
                return 0;
            case 4:
                z30Var.f473196f = aVar2.k(intValue);
                return 0;
            case 5:
                z30Var.f473197g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.y30 y30Var = new r45.y30();
                    if (bArr3 != null && bArr3.length > 0) {
                        y30Var.mo11468x92b714fd(bArr3);
                    }
                    z30Var.f473198h.add(y30Var);
                }
                return 0;
            case 7:
                z30Var.f473199i = aVar2.g(intValue);
                return 0;
            case 8:
                z30Var.f473200m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.j16 j16Var3 = new r45.j16();
                    if (bArr4 != null && bArr4.length > 0) {
                        j16Var3.mo11468x92b714fd(bArr4);
                    }
                    z30Var.f473201n = j16Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.l36 l36Var3 = new r45.l36();
                    if (bArr5 != null && bArr5.length > 0) {
                        l36Var3.mo11468x92b714fd(bArr5);
                    }
                    z30Var.f473202o = l36Var3;
                }
                return 0;
            case 11:
                z30Var.f473203p = aVar2.k(intValue);
                return 0;
            case 12:
                z30Var.f473204q = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
