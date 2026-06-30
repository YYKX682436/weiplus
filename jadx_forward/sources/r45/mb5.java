package r45;

/* loaded from: classes7.dex */
public class mb5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f461862d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461863e;

    /* renamed from: f, reason: collision with root package name */
    public int f461864f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461865g;

    /* renamed from: h, reason: collision with root package name */
    public int f461866h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f461867i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mb5)) {
            return false;
        }
        r45.mb5 mb5Var = (r45.mb5) fVar;
        return n51.f.a(this.f76494x2de60e5e, mb5Var.f76494x2de60e5e) && n51.f.a(this.f461862d, mb5Var.f461862d) && n51.f.a(this.f461863e, mb5Var.f461863e) && n51.f.a(java.lang.Integer.valueOf(this.f461864f), java.lang.Integer.valueOf(mb5Var.f461864f)) && n51.f.a(this.f461865g, mb5Var.f461865g) && n51.f.a(java.lang.Integer.valueOf(this.f461866h), java.lang.Integer.valueOf(mb5Var.f461866h)) && n51.f.a(java.lang.Boolean.valueOf(this.f461867i), java.lang.Boolean.valueOf(mb5Var.f461867i));
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
            java.lang.String str = this.f461862d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f461863e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f461864f);
            java.lang.String str3 = this.f461865g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f461866h);
            fVar.a(7, this.f461867i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f461862d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f461863e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f461864f);
            java.lang.String str6 = this.f461865g;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            return e17 + b36.f.e(6, this.f461866h) + b36.f.a(7, this.f461867i);
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
        r45.mb5 mb5Var = (r45.mb5) objArr[1];
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
                    mb5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                mb5Var.f461862d = aVar2.k(intValue);
                return 0;
            case 3:
                mb5Var.f461863e = aVar2.k(intValue);
                return 0;
            case 4:
                mb5Var.f461864f = aVar2.g(intValue);
                return 0;
            case 5:
                mb5Var.f461865g = aVar2.k(intValue);
                return 0;
            case 6:
                mb5Var.f461866h = aVar2.g(intValue);
                return 0;
            case 7:
                mb5Var.f461867i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
