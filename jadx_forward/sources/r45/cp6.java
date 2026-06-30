package r45;

/* loaded from: classes8.dex */
public class cp6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f453304d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453305e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453306f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453307g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453308h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f453309i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cp6)) {
            return false;
        }
        r45.cp6 cp6Var = (r45.cp6) fVar;
        return n51.f.a(this.f76494x2de60e5e, cp6Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f453304d), java.lang.Integer.valueOf(cp6Var.f453304d)) && n51.f.a(this.f453305e, cp6Var.f453305e) && n51.f.a(this.f453306f, cp6Var.f453306f) && n51.f.a(this.f453307g, cp6Var.f453307g) && n51.f.a(this.f453308h, cp6Var.f453308h) && n51.f.a(this.f453309i, cp6Var.f453309i);
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
            fVar.e(2, this.f453304d);
            java.lang.String str = this.f453305e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f453306f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f453307g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f453308h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f453309i;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f453304d);
            java.lang.String str6 = this.f453305e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f453306f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f453307g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f453308h;
            if (str9 != null) {
                i18 += b36.f.j(6, str9);
            }
            java.lang.String str10 = this.f453309i;
            return str10 != null ? i18 + b36.f.j(7, str10) : i18;
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
        r45.cp6 cp6Var = (r45.cp6) objArr[1];
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
                    cp6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                cp6Var.f453304d = aVar2.g(intValue);
                return 0;
            case 3:
                cp6Var.f453305e = aVar2.k(intValue);
                return 0;
            case 4:
                cp6Var.f453306f = aVar2.k(intValue);
                return 0;
            case 5:
                cp6Var.f453307g = aVar2.k(intValue);
                return 0;
            case 6:
                cp6Var.f453308h = aVar2.k(intValue);
                return 0;
            case 7:
                cp6Var.f453309i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
