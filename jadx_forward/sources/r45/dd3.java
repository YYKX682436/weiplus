package r45;

/* loaded from: classes9.dex */
public class dd3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453851d;

    /* renamed from: e, reason: collision with root package name */
    public int f453852e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vy f453853f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453854g;

    /* renamed from: h, reason: collision with root package name */
    public int f453855h;

    /* renamed from: m, reason: collision with root package name */
    public int f453857m;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f453856i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f453858n = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dd3)) {
            return false;
        }
        r45.dd3 dd3Var = (r45.dd3) fVar;
        return n51.f.a(this.f76492x92037252, dd3Var.f76492x92037252) && n51.f.a(this.f453851d, dd3Var.f453851d) && n51.f.a(java.lang.Integer.valueOf(this.f453852e), java.lang.Integer.valueOf(dd3Var.f453852e)) && n51.f.a(this.f453853f, dd3Var.f453853f) && n51.f.a(this.f453854g, dd3Var.f453854g) && n51.f.a(java.lang.Integer.valueOf(this.f453855h), java.lang.Integer.valueOf(dd3Var.f453855h)) && n51.f.a(this.f453856i, dd3Var.f453856i) && n51.f.a(java.lang.Integer.valueOf(this.f453857m), java.lang.Integer.valueOf(dd3Var.f453857m)) && n51.f.a(this.f453858n, dd3Var.f453858n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f453858n;
        java.util.LinkedList linkedList2 = this.f453856i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f453851d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f453852e);
            r45.vy vyVar = this.f453853f;
            if (vyVar != null) {
                fVar.i(4, vyVar.mo75928xcd1e8d8());
                this.f453853f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f453854g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f453855h);
            fVar.g(7, 8, linkedList2);
            fVar.e(8, this.f453857m);
            fVar.g(9, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f453851d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f453852e);
            r45.vy vyVar2 = this.f453853f;
            if (vyVar2 != null) {
                e17 += b36.f.i(4, vyVar2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f453854g;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            return e17 + b36.f.e(6, this.f453855h) + b36.f.g(7, 8, linkedList2) + b36.f.e(8, this.f453857m) + b36.f.g(9, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.dd3 dd3Var = (r45.dd3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    dd3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                dd3Var.f453851d = aVar2.k(intValue);
                return 0;
            case 3:
                dd3Var.f453852e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.vy vyVar3 = new r45.vy();
                    if (bArr3 != null && bArr3.length > 0) {
                        vyVar3.mo11468x92b714fd(bArr3);
                    }
                    dd3Var.f453853f = vyVar3;
                }
                return 0;
            case 5:
                dd3Var.f453854g = aVar2.k(intValue);
                return 0;
            case 6:
                dd3Var.f453855h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr4 != null && bArr4.length > 0) {
                        du5Var.b(bArr4);
                    }
                    dd3Var.f453856i.add(du5Var);
                }
                return 0;
            case 8:
                dd3Var.f453857m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var2.b(bArr5);
                    }
                    dd3Var.f453858n.add(du5Var2);
                }
                return 0;
            default:
                return -1;
        }
    }
}
