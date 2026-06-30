package r45;

/* loaded from: classes9.dex */
public class yp6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472809d;

    /* renamed from: e, reason: collision with root package name */
    public int f472810e;

    /* renamed from: f, reason: collision with root package name */
    public r45.w04 f472811f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f472812g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472813h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472814i;

    /* renamed from: m, reason: collision with root package name */
    public r45.sv5 f472815m;

    /* renamed from: n, reason: collision with root package name */
    public int f472816n;

    /* renamed from: o, reason: collision with root package name */
    public r45.qa f472817o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yp6)) {
            return false;
        }
        r45.yp6 yp6Var = (r45.yp6) fVar;
        return n51.f.a(this.f76494x2de60e5e, yp6Var.f76494x2de60e5e) && n51.f.a(this.f472809d, yp6Var.f472809d) && n51.f.a(java.lang.Integer.valueOf(this.f472810e), java.lang.Integer.valueOf(yp6Var.f472810e)) && n51.f.a(this.f472811f, yp6Var.f472811f) && n51.f.a(this.f472812g, yp6Var.f472812g) && n51.f.a(this.f472813h, yp6Var.f472813h) && n51.f.a(this.f472814i, yp6Var.f472814i) && n51.f.a(this.f472815m, yp6Var.f472815m) && n51.f.a(java.lang.Integer.valueOf(this.f472816n), java.lang.Integer.valueOf(yp6Var.f472816n)) && n51.f.a(this.f472817o, yp6Var.f472817o);
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
            java.lang.String str = this.f472809d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f472810e);
            r45.w04 w04Var = this.f472811f;
            if (w04Var != null) {
                fVar.i(4, w04Var.mo75928xcd1e8d8());
                this.f472811f.mo75956x3d5d1f78(fVar);
            }
            fVar.g(5, 8, this.f472812g);
            java.lang.String str2 = this.f472813h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f472814i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.sv5 sv5Var = this.f472815m;
            if (sv5Var != null) {
                fVar.i(10, sv5Var.mo75928xcd1e8d8());
                this.f472815m.mo75956x3d5d1f78(fVar);
            }
            fVar.e(11, this.f472816n);
            r45.qa qaVar = this.f472817o;
            if (qaVar != null) {
                fVar.i(12, qaVar.mo75928xcd1e8d8());
                this.f472817o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f472809d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f472810e);
            r45.w04 w04Var2 = this.f472811f;
            if (w04Var2 != null) {
                e17 += b36.f.i(4, w04Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(5, 8, this.f472812g);
            java.lang.String str5 = this.f472813h;
            if (str5 != null) {
                g17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f472814i;
            if (str6 != null) {
                g17 += b36.f.j(7, str6);
            }
            r45.sv5 sv5Var2 = this.f472815m;
            if (sv5Var2 != null) {
                g17 += b36.f.i(10, sv5Var2.mo75928xcd1e8d8());
            }
            int e18 = g17 + b36.f.e(11, this.f472816n);
            r45.qa qaVar2 = this.f472817o;
            return qaVar2 != null ? e18 + b36.f.i(12, qaVar2.mo75928xcd1e8d8()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f472812g.clear();
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
        r45.yp6 yp6Var = (r45.yp6) objArr[1];
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
                    yp6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                yp6Var.f472809d = aVar2.k(intValue);
                return 0;
            case 3:
                yp6Var.f472810e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.w04 w04Var3 = new r45.w04();
                    if (bArr3 != null && bArr3.length > 0) {
                        w04Var3.mo11468x92b714fd(bArr3);
                    }
                    yp6Var.f472811f = w04Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.y7 y7Var = new r45.y7();
                    if (bArr4 != null && bArr4.length > 0) {
                        y7Var.mo11468x92b714fd(bArr4);
                    }
                    yp6Var.f472812g.add(y7Var);
                }
                return 0;
            case 6:
                yp6Var.f472813h = aVar2.k(intValue);
                return 0;
            case 7:
                yp6Var.f472814i = aVar2.k(intValue);
                return 0;
            case 8:
            case 9:
            default:
                return -1;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.sv5 sv5Var3 = new r45.sv5();
                    if (bArr5 != null && bArr5.length > 0) {
                        sv5Var3.mo11468x92b714fd(bArr5);
                    }
                    yp6Var.f472815m = sv5Var3;
                }
                return 0;
            case 11:
                yp6Var.f472816n = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.qa qaVar3 = new r45.qa();
                    if (bArr6 != null && bArr6.length > 0) {
                        qaVar3.mo11468x92b714fd(bArr6);
                    }
                    yp6Var.f472817o = qaVar3;
                }
                return 0;
        }
    }
}
