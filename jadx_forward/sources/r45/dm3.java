package r45;

/* loaded from: classes7.dex */
public class dm3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f454093d;

    /* renamed from: e, reason: collision with root package name */
    public int f454094e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454095f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454096g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f454097h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f454098i;

    /* renamed from: m, reason: collision with root package name */
    public int f454099m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f454100n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public int f454101o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dm3)) {
            return false;
        }
        r45.dm3 dm3Var = (r45.dm3) fVar;
        return n51.f.a(this.f76492x92037252, dm3Var.f76492x92037252) && n51.f.a(this.f454093d, dm3Var.f454093d) && n51.f.a(java.lang.Integer.valueOf(this.f454094e), java.lang.Integer.valueOf(dm3Var.f454094e)) && n51.f.a(this.f454095f, dm3Var.f454095f) && n51.f.a(this.f454096g, dm3Var.f454096g) && n51.f.a(this.f454097h, dm3Var.f454097h) && n51.f.a(this.f454098i, dm3Var.f454098i) && n51.f.a(java.lang.Integer.valueOf(this.f454099m), java.lang.Integer.valueOf(dm3Var.f454099m)) && n51.f.a(this.f454100n, dm3Var.f454100n) && n51.f.a(java.lang.Integer.valueOf(this.f454101o), java.lang.Integer.valueOf(dm3Var.f454101o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f454100n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var = this.f454093d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f454093d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f454094e);
            java.lang.String str = this.f454095f;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f454096g;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f454097h;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f454098i;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f454099m);
            fVar.g(11, 8, linkedList);
            fVar.e(12, this.f454101o);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.cu5 cu5Var2 = this.f454093d;
            if (cu5Var2 != null) {
                i18 += b36.f.i(2, cu5Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(5, this.f454094e);
            java.lang.String str5 = this.f454095f;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f454096g;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f454097h;
            if (str7 != null) {
                e17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f454098i;
            if (str8 != null) {
                e17 += b36.f.j(9, str8);
            }
            return e17 + b36.f.e(10, this.f454099m) + b36.f.g(11, 8, linkedList) + b36.f.e(12, this.f454101o);
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
        r45.dm3 dm3Var = (r45.dm3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                dm3Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.cu5 cu5Var3 = new r45.cu5();
                if (bArr3 != null && bArr3.length > 0) {
                    cu5Var3.b(bArr3);
                }
                dm3Var.f454093d = cu5Var3;
            }
            return 0;
        }
        switch (intValue) {
            case 5:
                dm3Var.f454094e = aVar2.g(intValue);
                return 0;
            case 6:
                dm3Var.f454095f = aVar2.k(intValue);
                return 0;
            case 7:
                dm3Var.f454096g = aVar2.k(intValue);
                return 0;
            case 8:
                dm3Var.f454097h = aVar2.k(intValue);
                return 0;
            case 9:
                dm3Var.f454098i = aVar2.k(intValue);
                return 0;
            case 10:
                dm3Var.f454099m = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.xf5 xf5Var = new r45.xf5();
                    if (bArr4 != null && bArr4.length > 0) {
                        xf5Var.mo11468x92b714fd(bArr4);
                    }
                    dm3Var.f454100n.add(xf5Var);
                }
                return 0;
            case 12:
                dm3Var.f454101o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
