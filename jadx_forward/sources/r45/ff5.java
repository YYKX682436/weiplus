package r45;

/* loaded from: classes9.dex */
public class ff5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f455813d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455814e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f455815f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455816g;

    /* renamed from: h, reason: collision with root package name */
    public int f455817h;

    /* renamed from: i, reason: collision with root package name */
    public int f455818i;

    /* renamed from: m, reason: collision with root package name */
    public r45.na5 f455819m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ce4 f455820n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f455821o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ff5)) {
            return false;
        }
        r45.ff5 ff5Var = (r45.ff5) fVar;
        return n51.f.a(this.f76492x92037252, ff5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f455813d), java.lang.Integer.valueOf(ff5Var.f455813d)) && n51.f.a(this.f455814e, ff5Var.f455814e) && n51.f.a(this.f455815f, ff5Var.f455815f) && n51.f.a(this.f455816g, ff5Var.f455816g) && n51.f.a(java.lang.Integer.valueOf(this.f455817h), java.lang.Integer.valueOf(ff5Var.f455817h)) && n51.f.a(java.lang.Integer.valueOf(this.f455818i), java.lang.Integer.valueOf(ff5Var.f455818i)) && n51.f.a(this.f455819m, ff5Var.f455819m) && n51.f.a(this.f455820n, ff5Var.f455820n) && n51.f.a(this.f455821o, ff5Var.f455821o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f455813d);
            java.lang.String str = this.f455814e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f455815f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f455816g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f455817h);
            fVar.e(7, this.f455818i);
            r45.na5 na5Var = this.f455819m;
            if (na5Var != null) {
                fVar.i(98, na5Var.mo75928xcd1e8d8());
                this.f455819m.mo75956x3d5d1f78(fVar);
            }
            r45.ce4 ce4Var = this.f455820n;
            if (ce4Var != null) {
                fVar.i(99, ce4Var.mo75928xcd1e8d8());
                this.f455820n.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f455821o;
            if (str4 != null) {
                fVar.j(100, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f455813d);
            java.lang.String str5 = this.f455814e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f455815f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f455816g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            int e17 = i18 + b36.f.e(6, this.f455817h) + b36.f.e(7, this.f455818i);
            r45.na5 na5Var2 = this.f455819m;
            if (na5Var2 != null) {
                e17 += b36.f.i(98, na5Var2.mo75928xcd1e8d8());
            }
            r45.ce4 ce4Var2 = this.f455820n;
            if (ce4Var2 != null) {
                e17 += b36.f.i(99, ce4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f455821o;
            return str8 != null ? e17 + b36.f.j(100, str8) : e17;
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
        r45.ff5 ff5Var = (r45.ff5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    ff5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ff5Var.f455813d = aVar2.g(intValue);
                return 0;
            case 3:
                ff5Var.f455814e = aVar2.k(intValue);
                return 0;
            case 4:
                ff5Var.f455815f = aVar2.k(intValue);
                return 0;
            case 5:
                ff5Var.f455816g = aVar2.k(intValue);
                return 0;
            case 6:
                ff5Var.f455817h = aVar2.g(intValue);
                return 0;
            case 7:
                ff5Var.f455818i = aVar2.g(intValue);
                return 0;
            default:
                switch (intValue) {
                    case 98:
                        java.util.LinkedList j18 = aVar2.j(intValue);
                        int size2 = j18.size();
                        for (int i27 = 0; i27 < size2; i27++) {
                            byte[] bArr2 = (byte[]) j18.get(i27);
                            r45.na5 na5Var3 = new r45.na5();
                            if (bArr2 != null && bArr2.length > 0) {
                                na5Var3.mo11468x92b714fd(bArr2);
                            }
                            ff5Var.f455819m = na5Var3;
                        }
                        return 0;
                    case 99:
                        java.util.LinkedList j19 = aVar2.j(intValue);
                        int size3 = j19.size();
                        for (int i28 = 0; i28 < size3; i28++) {
                            byte[] bArr3 = (byte[]) j19.get(i28);
                            r45.ce4 ce4Var3 = new r45.ce4();
                            if (bArr3 != null && bArr3.length > 0) {
                                ce4Var3.mo11468x92b714fd(bArr3);
                            }
                            ff5Var.f455820n = ce4Var3;
                        }
                        return 0;
                    case 100:
                        ff5Var.f455821o = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
