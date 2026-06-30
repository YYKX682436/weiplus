package r45;

/* loaded from: classes9.dex */
public class rr6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466687d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466688e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466689f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466690g;

    /* renamed from: h, reason: collision with root package name */
    public r45.b74 f466691h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f466692i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f466693m;

    /* renamed from: n, reason: collision with root package name */
    public int f466694n;

    /* renamed from: o, reason: collision with root package name */
    public r45.qr6 f466695o;

    /* renamed from: p, reason: collision with root package name */
    public r45.qr6 f466696p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rr6)) {
            return false;
        }
        r45.rr6 rr6Var = (r45.rr6) fVar;
        return n51.f.a(this.f466687d, rr6Var.f466687d) && n51.f.a(this.f466688e, rr6Var.f466688e) && n51.f.a(this.f466689f, rr6Var.f466689f) && n51.f.a(this.f466690g, rr6Var.f466690g) && n51.f.a(this.f466691h, rr6Var.f466691h) && n51.f.a(this.f466692i, rr6Var.f466692i) && n51.f.a(java.lang.Integer.valueOf(this.f466693m), java.lang.Integer.valueOf(rr6Var.f466693m)) && n51.f.a(java.lang.Integer.valueOf(this.f466694n), java.lang.Integer.valueOf(rr6Var.f466694n)) && n51.f.a(this.f466695o, rr6Var.f466695o) && n51.f.a(this.f466696p, rr6Var.f466696p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f466692i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f466687d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f466688e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f466689f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f466690g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            r45.b74 b74Var = this.f466691h;
            if (b74Var != null) {
                fVar.i(5, b74Var.mo75928xcd1e8d8());
                this.f466691h.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f466693m);
            fVar.e(8, this.f466694n);
            r45.qr6 qr6Var = this.f466695o;
            if (qr6Var != null) {
                fVar.i(9, qr6Var.mo75928xcd1e8d8());
                this.f466695o.mo75956x3d5d1f78(fVar);
            }
            r45.qr6 qr6Var2 = this.f466696p;
            if (qr6Var2 != null) {
                fVar.i(10, qr6Var2.mo75928xcd1e8d8());
                this.f466696p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f466687d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f466688e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f466689f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f466690g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            r45.b74 b74Var2 = this.f466691h;
            if (b74Var2 != null) {
                j17 += b36.f.i(5, b74Var2.mo75928xcd1e8d8());
            }
            int g17 = j17 + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f466693m) + b36.f.e(8, this.f466694n);
            r45.qr6 qr6Var3 = this.f466695o;
            if (qr6Var3 != null) {
                g17 += b36.f.i(9, qr6Var3.mo75928xcd1e8d8());
            }
            r45.qr6 qr6Var4 = this.f466696p;
            return qr6Var4 != null ? g17 + b36.f.i(10, qr6Var4.mo75928xcd1e8d8()) : g17;
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
        r45.rr6 rr6Var = (r45.rr6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rr6Var.f466687d = aVar2.k(intValue);
                return 0;
            case 2:
                rr6Var.f466688e = aVar2.k(intValue);
                return 0;
            case 3:
                rr6Var.f466689f = aVar2.k(intValue);
                return 0;
            case 4:
                rr6Var.f466690g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.b74 b74Var3 = new r45.b74();
                    if (bArr2 != null && bArr2.length > 0) {
                        b74Var3.mo11468x92b714fd(bArr2);
                    }
                    rr6Var.f466691h = b74Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.pr6 pr6Var = new r45.pr6();
                    if (bArr3 != null && bArr3.length > 0) {
                        pr6Var.mo11468x92b714fd(bArr3);
                    }
                    rr6Var.f466692i.add(pr6Var);
                }
                return 0;
            case 7:
                rr6Var.f466693m = aVar2.g(intValue);
                return 0;
            case 8:
                rr6Var.f466694n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.qr6 qr6Var5 = new r45.qr6();
                    if (bArr4 != null && bArr4.length > 0) {
                        qr6Var5.mo11468x92b714fd(bArr4);
                    }
                    rr6Var.f466695o = qr6Var5;
                }
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.qr6 qr6Var6 = new r45.qr6();
                    if (bArr5 != null && bArr5.length > 0) {
                        qr6Var6.mo11468x92b714fd(bArr5);
                    }
                    rr6Var.f466696p = qr6Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
