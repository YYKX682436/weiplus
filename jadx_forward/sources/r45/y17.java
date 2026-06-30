package r45;

/* loaded from: classes9.dex */
public class y17 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f472248d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f472249e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f472250f;

    /* renamed from: g, reason: collision with root package name */
    public int f472251g;

    /* renamed from: h, reason: collision with root package name */
    public int f472252h;

    /* renamed from: i, reason: collision with root package name */
    public int f472253i;

    /* renamed from: m, reason: collision with root package name */
    public int f472254m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f472255n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f472256o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y17)) {
            return false;
        }
        r45.y17 y17Var = (r45.y17) fVar;
        return n51.f.a(this.f76492x92037252, y17Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f472248d), java.lang.Integer.valueOf(y17Var.f472248d)) && n51.f.a(this.f472249e, y17Var.f472249e) && n51.f.a(java.lang.Integer.valueOf(this.f472250f), java.lang.Integer.valueOf(y17Var.f472250f)) && n51.f.a(java.lang.Integer.valueOf(this.f472251g), java.lang.Integer.valueOf(y17Var.f472251g)) && n51.f.a(java.lang.Integer.valueOf(this.f472252h), java.lang.Integer.valueOf(y17Var.f472252h)) && n51.f.a(java.lang.Integer.valueOf(this.f472253i), java.lang.Integer.valueOf(y17Var.f472253i)) && n51.f.a(java.lang.Integer.valueOf(this.f472254m), java.lang.Integer.valueOf(y17Var.f472254m)) && n51.f.a(this.f472255n, y17Var.f472255n) && n51.f.a(this.f472256o, y17Var.f472256o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472249e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f472248d);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f472250f);
            fVar.e(5, this.f472251g);
            fVar.e(6, this.f472252h);
            fVar.e(7, this.f472253i);
            fVar.e(8, this.f472254m);
            java.lang.String str = this.f472255n;
            if (str != null) {
                fVar.j(9, str);
            }
            java.lang.String str2 = this.f472256o;
            if (str2 != null) {
                fVar.j(10, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f472248d) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f472250f) + b36.f.e(5, this.f472251g) + b36.f.e(6, this.f472252h) + b36.f.e(7, this.f472253i) + b36.f.e(8, this.f472254m);
            java.lang.String str3 = this.f472255n;
            if (str3 != null) {
                i18 += b36.f.j(9, str3);
            }
            java.lang.String str4 = this.f472256o;
            return str4 != null ? i18 + b36.f.j(10, str4) : i18;
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
        r45.y17 y17Var = (r45.y17) objArr[1];
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
                    y17Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                y17Var.f472248d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.v17 v17Var = new r45.v17();
                    if (bArr3 != null && bArr3.length > 0) {
                        v17Var.mo11468x92b714fd(bArr3);
                    }
                    y17Var.f472249e.add(v17Var);
                }
                return 0;
            case 4:
                y17Var.f472250f = aVar2.g(intValue);
                return 0;
            case 5:
                y17Var.f472251g = aVar2.g(intValue);
                return 0;
            case 6:
                y17Var.f472252h = aVar2.g(intValue);
                return 0;
            case 7:
                y17Var.f472253i = aVar2.g(intValue);
                return 0;
            case 8:
                y17Var.f472254m = aVar2.g(intValue);
                return 0;
            case 9:
                y17Var.f472255n = aVar2.k(intValue);
                return 0;
            case 10:
                y17Var.f472256o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
