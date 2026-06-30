package r45;

/* loaded from: classes15.dex */
public class a76 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f451335d;

    /* renamed from: f, reason: collision with root package name */
    public r45.gm0 f451337f;

    /* renamed from: g, reason: collision with root package name */
    public r45.d5 f451338g;

    /* renamed from: i, reason: collision with root package name */
    public int f451340i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f451341m;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f451336e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f451339h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a76)) {
            return false;
        }
        r45.a76 a76Var = (r45.a76) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f451335d), java.lang.Integer.valueOf(a76Var.f451335d)) && n51.f.a(this.f451336e, a76Var.f451336e) && n51.f.a(this.f451337f, a76Var.f451337f) && n51.f.a(this.f451338g, a76Var.f451338g) && n51.f.a(this.f451339h, a76Var.f451339h) && n51.f.a(java.lang.Integer.valueOf(this.f451340i), java.lang.Integer.valueOf(a76Var.f451340i)) && n51.f.a(this.f451341m, a76Var.f451341m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f451335d);
            fVar.g(2, 8, this.f451336e);
            r45.gm0 gm0Var = this.f451337f;
            if (gm0Var != null) {
                fVar.i(3, gm0Var.mo75928xcd1e8d8());
                this.f451337f.mo75956x3d5d1f78(fVar);
            }
            r45.d5 d5Var = this.f451338g;
            if (d5Var != null) {
                fVar.i(4, d5Var.mo75928xcd1e8d8());
                this.f451338g.mo75956x3d5d1f78(fVar);
            }
            fVar.g(5, 8, this.f451339h);
            fVar.e(6, this.f451340i);
            java.lang.String str = this.f451341m;
            if (str != null) {
                fVar.j(7, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f451335d) + 0 + b36.f.g(2, 8, this.f451336e);
            r45.gm0 gm0Var2 = this.f451337f;
            if (gm0Var2 != null) {
                e17 += b36.f.i(3, gm0Var2.mo75928xcd1e8d8());
            }
            r45.d5 d5Var2 = this.f451338g;
            if (d5Var2 != null) {
                e17 += b36.f.i(4, d5Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(5, 8, this.f451339h) + b36.f.e(6, this.f451340i);
            java.lang.String str2 = this.f451341m;
            return str2 != null ? g17 + b36.f.j(7, str2) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f451336e.clear();
            this.f451339h.clear();
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
        r45.a76 a76Var = (r45.a76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a76Var.f451335d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.nd5 nd5Var = new r45.nd5();
                    if (bArr2 != null && bArr2.length > 0) {
                        nd5Var.mo11468x92b714fd(bArr2);
                    }
                    a76Var.f451336e.add(nd5Var);
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.gm0 gm0Var3 = new r45.gm0();
                    if (bArr3 != null && bArr3.length > 0) {
                        gm0Var3.mo11468x92b714fd(bArr3);
                    }
                    a76Var.f451337f = gm0Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.d5 d5Var3 = new r45.d5();
                    if (bArr4 != null && bArr4.length > 0) {
                        d5Var3.mo11468x92b714fd(bArr4);
                    }
                    a76Var.f451338g = d5Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.ek5 ek5Var = new r45.ek5();
                    if (bArr5 != null && bArr5.length > 0) {
                        ek5Var.mo11468x92b714fd(bArr5);
                    }
                    a76Var.f451339h.add(ek5Var);
                }
                return 0;
            case 6:
                a76Var.f451340i = aVar2.g(intValue);
                return 0;
            case 7:
                a76Var.f451341m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
