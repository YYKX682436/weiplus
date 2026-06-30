package r45;

/* loaded from: classes4.dex */
public class h8 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457461d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457462e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457463f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457464g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457465h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f457466i;

    /* renamed from: m, reason: collision with root package name */
    public int f457467m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h8)) {
            return false;
        }
        r45.h8 h8Var = (r45.h8) fVar;
        return n51.f.a(this.f76494x2de60e5e, h8Var.f76494x2de60e5e) && n51.f.a(this.f457461d, h8Var.f457461d) && n51.f.a(this.f457462e, h8Var.f457462e) && n51.f.a(this.f457463f, h8Var.f457463f) && n51.f.a(this.f457464g, h8Var.f457464g) && n51.f.a(this.f457465h, h8Var.f457465h) && n51.f.a(this.f457466i, h8Var.f457466i) && n51.f.a(java.lang.Integer.valueOf(this.f457467m), java.lang.Integer.valueOf(h8Var.f457467m));
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
            java.lang.String str = this.f457461d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f457462e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f457463f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f457464g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f457465h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f457466i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.e(8, this.f457467m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str7 = this.f457461d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f457462e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f457463f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f457464g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f457465h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f457466i;
            if (str12 != null) {
                i18 += b36.f.j(7, str12);
            }
            return i18 + b36.f.e(8, this.f457467m);
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
        r45.h8 h8Var = (r45.h8) objArr[1];
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
                    h8Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                h8Var.f457461d = aVar2.k(intValue);
                return 0;
            case 3:
                h8Var.f457462e = aVar2.k(intValue);
                return 0;
            case 4:
                h8Var.f457463f = aVar2.k(intValue);
                return 0;
            case 5:
                h8Var.f457464g = aVar2.k(intValue);
                return 0;
            case 6:
                h8Var.f457465h = aVar2.k(intValue);
                return 0;
            case 7:
                h8Var.f457466i = aVar2.k(intValue);
                return 0;
            case 8:
                h8Var.f457467m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
