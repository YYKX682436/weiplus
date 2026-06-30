package r45;

/* loaded from: classes4.dex */
public class em3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455135d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455136e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455137f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455138g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455139h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455140i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.em3)) {
            return false;
        }
        r45.em3 em3Var = (r45.em3) fVar;
        return n51.f.a(this.f76494x2de60e5e, em3Var.f76494x2de60e5e) && n51.f.a(this.f455135d, em3Var.f455135d) && n51.f.a(this.f455136e, em3Var.f455136e) && n51.f.a(this.f455137f, em3Var.f455137f) && n51.f.a(this.f455138g, em3Var.f455138g) && n51.f.a(this.f455139h, em3Var.f455139h) && n51.f.a(this.f455140i, em3Var.f455140i);
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
            java.lang.String str = this.f455135d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f455136e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f455137f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f455138g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f455139h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f455140i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str7 = this.f455135d;
            if (str7 != null) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f455136e;
            if (str8 != null) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f455137f;
            if (str9 != null) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f455138g;
            if (str10 != null) {
                i18 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f455139h;
            if (str11 != null) {
                i18 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f455140i;
            return str12 != null ? i18 + b36.f.j(7, str12) : i18;
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
        r45.em3 em3Var = (r45.em3) objArr[1];
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
                    em3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                em3Var.f455135d = aVar2.k(intValue);
                return 0;
            case 3:
                em3Var.f455136e = aVar2.k(intValue);
                return 0;
            case 4:
                em3Var.f455137f = aVar2.k(intValue);
                return 0;
            case 5:
                em3Var.f455138g = aVar2.k(intValue);
                return 0;
            case 6:
                em3Var.f455139h = aVar2.k(intValue);
                return 0;
            case 7:
                em3Var.f455140i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
