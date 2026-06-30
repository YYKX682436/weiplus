package r45;

/* loaded from: classes4.dex */
public class f86 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.l76 f455633d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455634e;

    /* renamed from: f, reason: collision with root package name */
    public r45.du5 f455635f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455636g;

    /* renamed from: h, reason: collision with root package name */
    public r45.o86 f455637h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455638i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f455639m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f86)) {
            return false;
        }
        r45.f86 f86Var = (r45.f86) fVar;
        return n51.f.a(this.f76494x2de60e5e, f86Var.f76494x2de60e5e) && n51.f.a(this.f455633d, f86Var.f455633d) && n51.f.a(this.f455634e, f86Var.f455634e) && n51.f.a(this.f455635f, f86Var.f455635f) && n51.f.a(this.f455636g, f86Var.f455636g) && n51.f.a(this.f455637h, f86Var.f455637h) && n51.f.a(this.f455638i, f86Var.f455638i) && n51.f.a(this.f455639m, f86Var.f455639m);
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
            r45.l76 l76Var = this.f455633d;
            if (l76Var != null) {
                fVar.i(2, l76Var.mo75928xcd1e8d8());
                this.f455633d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f455634e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.du5 du5Var = this.f455635f;
            if (du5Var != null) {
                fVar.i(4, du5Var.mo75928xcd1e8d8());
                this.f455635f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f455636g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.o86 o86Var = this.f455637h;
            if (o86Var != null) {
                fVar.i(6, o86Var.mo75928xcd1e8d8());
                this.f455637h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f455638i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f455639m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.l76 l76Var2 = this.f455633d;
            if (l76Var2 != null) {
                i18 += b36.f.i(2, l76Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f455634e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            r45.du5 du5Var2 = this.f455635f;
            if (du5Var2 != null) {
                i18 += b36.f.i(4, du5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f455636g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            r45.o86 o86Var2 = this.f455637h;
            if (o86Var2 != null) {
                i18 += b36.f.i(6, o86Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f455638i;
            if (str7 != null) {
                i18 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f455639m;
            return str8 != null ? i18 + b36.f.j(8, str8) : i18;
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
        r45.f86 f86Var = (r45.f86) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    f86Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.l76 l76Var3 = new r45.l76();
                    if (bArr2 != null && bArr2.length > 0) {
                        l76Var3.mo11468x92b714fd(bArr2);
                    }
                    f86Var.f455633d = l76Var3;
                }
                return 0;
            case 3:
                f86Var.f455634e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var3.b(bArr3);
                    }
                    f86Var.f455635f = du5Var3;
                }
                return 0;
            case 5:
                f86Var.f455636g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.o86 o86Var3 = new r45.o86();
                    if (bArr4 != null && bArr4.length > 0) {
                        o86Var3.mo11468x92b714fd(bArr4);
                    }
                    f86Var.f455637h = o86Var3;
                }
                return 0;
            case 7:
                f86Var.f455638i = aVar2.k(intValue);
                return 0;
            case 8:
                f86Var.f455639m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
