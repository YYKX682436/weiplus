package r45;

/* loaded from: classes7.dex */
public class fh extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f455863d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f455864e;

    /* renamed from: f, reason: collision with root package name */
    public int f455865f;

    /* renamed from: g, reason: collision with root package name */
    public r45.fd7 f455866g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455867h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f455868i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f455869m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f455870n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fh)) {
            return false;
        }
        r45.fh fhVar = (r45.fh) fVar;
        return n51.f.a(this.f76494x2de60e5e, fhVar.f76494x2de60e5e) && n51.f.a(this.f455863d, fhVar.f455863d) && n51.f.a(java.lang.Integer.valueOf(this.f455864e), java.lang.Integer.valueOf(fhVar.f455864e)) && n51.f.a(java.lang.Integer.valueOf(this.f455865f), java.lang.Integer.valueOf(fhVar.f455865f)) && n51.f.a(this.f455866g, fhVar.f455866g) && n51.f.a(this.f455867h, fhVar.f455867h) && n51.f.a(this.f455868i, fhVar.f455868i) && n51.f.a(this.f455869m, fhVar.f455869m) && n51.f.a(this.f455870n, fhVar.f455870n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f455863d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f455864e);
            fVar.e(4, this.f455865f);
            r45.fd7 fd7Var = this.f455866g;
            if (fd7Var != null) {
                fVar.i(5, fd7Var.mo75928xcd1e8d8());
                this.f455866g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f455867h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f455868i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f455869m;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.f455870n;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f455864e) + b36.f.e(4, this.f455865f);
            r45.fd7 fd7Var2 = this.f455866g;
            if (fd7Var2 != null) {
                i18 += b36.f.i(5, fd7Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f455867h;
            if (str5 != null) {
                i18 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f455868i;
            if (str6 != null) {
                i18 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f455869m;
            if (str7 != null) {
                i18 += b36.f.j(11, str7);
            }
            java.lang.String str8 = this.f455870n;
            return str8 != null ? i18 + b36.f.j(12, str8) : i18;
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
        r45.fh fhVar = (r45.fh) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 11) {
            fhVar.f455869m = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 12) {
            fhVar.f455870n = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    fhVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ad7 ad7Var = new r45.ad7();
                    if (bArr3 != null && bArr3.length > 0) {
                        ad7Var.mo11468x92b714fd(bArr3);
                    }
                    fhVar.f455863d.add(ad7Var);
                }
                return 0;
            case 3:
                fhVar.f455864e = aVar2.g(intValue);
                return 0;
            case 4:
                fhVar.f455865f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.fd7 fd7Var3 = new r45.fd7();
                    if (bArr4 != null && bArr4.length > 0) {
                        fd7Var3.mo11468x92b714fd(bArr4);
                    }
                    fhVar.f455866g = fd7Var3;
                }
                return 0;
            case 6:
                fhVar.f455867h = aVar2.k(intValue);
                return 0;
            case 7:
                fhVar.f455868i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
