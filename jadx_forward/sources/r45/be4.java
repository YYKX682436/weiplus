package r45;

/* loaded from: classes9.dex */
public class be4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452229d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f452230e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f452231f;

    /* renamed from: g, reason: collision with root package name */
    public r45.gd f452232g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452233h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f452234i;

    /* renamed from: m, reason: collision with root package name */
    public int f452235m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f452236n;

    /* renamed from: o, reason: collision with root package name */
    public int f452237o;

    /* renamed from: p, reason: collision with root package name */
    public r45.qm6 f452238p;

    /* renamed from: q, reason: collision with root package name */
    public r45.c70 f452239q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f452240r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f452241s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.be4)) {
            return false;
        }
        r45.be4 be4Var = (r45.be4) fVar;
        return n51.f.a(this.f452229d, be4Var.f452229d) && n51.f.a(this.f452230e, be4Var.f452230e) && n51.f.a(java.lang.Boolean.valueOf(this.f452231f), java.lang.Boolean.valueOf(be4Var.f452231f)) && n51.f.a(this.f452232g, be4Var.f452232g) && n51.f.a(this.f452233h, be4Var.f452233h) && n51.f.a(java.lang.Boolean.valueOf(this.f452234i), java.lang.Boolean.valueOf(be4Var.f452234i)) && n51.f.a(java.lang.Integer.valueOf(this.f452235m), java.lang.Integer.valueOf(be4Var.f452235m)) && n51.f.a(this.f452236n, be4Var.f452236n) && n51.f.a(java.lang.Integer.valueOf(this.f452237o), java.lang.Integer.valueOf(be4Var.f452237o)) && n51.f.a(this.f452238p, be4Var.f452238p) && n51.f.a(this.f452239q, be4Var.f452239q) && n51.f.a(this.f452240r, be4Var.f452240r) && n51.f.a(this.f452241s, be4Var.f452241s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f452230e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452229d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            fVar.a(3, this.f452231f);
            r45.gd gdVar = this.f452232g;
            if (gdVar != null) {
                fVar.i(4, gdVar.mo75928xcd1e8d8());
                this.f452232g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f452233h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.a(6, this.f452234i);
            fVar.e(7, this.f452235m);
            java.lang.String str3 = this.f452236n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f452237o);
            r45.qm6 qm6Var = this.f452238p;
            if (qm6Var != null) {
                fVar.i(10, qm6Var.mo75928xcd1e8d8());
                this.f452238p.mo75956x3d5d1f78(fVar);
            }
            r45.c70 c70Var = this.f452239q;
            if (c70Var != null) {
                fVar.i(11, c70Var.mo75928xcd1e8d8());
                this.f452239q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f452240r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f452241s;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f452229d;
            int j17 = (str6 != null ? b36.f.j(1, str6) + 0 : 0) + b36.f.g(2, 8, linkedList) + b36.f.a(3, this.f452231f);
            r45.gd gdVar2 = this.f452232g;
            if (gdVar2 != null) {
                j17 += b36.f.i(4, gdVar2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f452233h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            int a17 = j17 + b36.f.a(6, this.f452234i) + b36.f.e(7, this.f452235m);
            java.lang.String str8 = this.f452236n;
            if (str8 != null) {
                a17 += b36.f.j(8, str8);
            }
            int e17 = a17 + b36.f.e(9, this.f452237o);
            r45.qm6 qm6Var2 = this.f452238p;
            if (qm6Var2 != null) {
                e17 += b36.f.i(10, qm6Var2.mo75928xcd1e8d8());
            }
            r45.c70 c70Var2 = this.f452239q;
            if (c70Var2 != null) {
                e17 += b36.f.i(11, c70Var2.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f452240r;
            if (str9 != null) {
                e17 += b36.f.j(12, str9);
            }
            java.lang.String str10 = this.f452241s;
            return str10 != null ? e17 + b36.f.j(13, str10) : e17;
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
        r45.be4 be4Var = (r45.be4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                be4Var.f452229d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.qv qvVar = new r45.qv();
                    if (bArr2 != null && bArr2.length > 0) {
                        qvVar.mo11468x92b714fd(bArr2);
                    }
                    be4Var.f452230e.add(qvVar);
                }
                return 0;
            case 3:
                be4Var.f452231f = aVar2.c(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.gd gdVar3 = new r45.gd();
                    if (bArr3 != null && bArr3.length > 0) {
                        gdVar3.mo11468x92b714fd(bArr3);
                    }
                    be4Var.f452232g = gdVar3;
                }
                return 0;
            case 5:
                be4Var.f452233h = aVar2.k(intValue);
                return 0;
            case 6:
                be4Var.f452234i = aVar2.c(intValue);
                return 0;
            case 7:
                be4Var.f452235m = aVar2.g(intValue);
                return 0;
            case 8:
                be4Var.f452236n = aVar2.k(intValue);
                return 0;
            case 9:
                be4Var.f452237o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.qm6 qm6Var3 = new r45.qm6();
                    if (bArr4 != null && bArr4.length > 0) {
                        qm6Var3.mo11468x92b714fd(bArr4);
                    }
                    be4Var.f452238p = qm6Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.c70 c70Var3 = new r45.c70();
                    if (bArr5 != null && bArr5.length > 0) {
                        c70Var3.mo11468x92b714fd(bArr5);
                    }
                    be4Var.f452239q = c70Var3;
                }
                return 0;
            case 12:
                be4Var.f452240r = aVar2.k(intValue);
                return 0;
            case 13:
                be4Var.f452241s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
