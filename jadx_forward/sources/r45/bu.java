package r45;

/* loaded from: classes9.dex */
public class bu extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452588d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452589e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452590f;

    /* renamed from: g, reason: collision with root package name */
    public int f452591g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452592h;

    /* renamed from: i, reason: collision with root package name */
    public r45.iu f452593i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f452594m;

    /* renamed from: n, reason: collision with root package name */
    public int f452595n;

    /* renamed from: o, reason: collision with root package name */
    public int f452596o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bu)) {
            return false;
        }
        r45.bu buVar = (r45.bu) fVar;
        return n51.f.a(this.f452588d, buVar.f452588d) && n51.f.a(this.f452589e, buVar.f452589e) && n51.f.a(this.f452590f, buVar.f452590f) && n51.f.a(java.lang.Integer.valueOf(this.f452591g), java.lang.Integer.valueOf(buVar.f452591g)) && n51.f.a(this.f452592h, buVar.f452592h) && n51.f.a(this.f452593i, buVar.f452593i) && n51.f.a(this.f452594m, buVar.f452594m) && n51.f.a(java.lang.Integer.valueOf(this.f452595n), java.lang.Integer.valueOf(buVar.f452595n)) && n51.f.a(java.lang.Integer.valueOf(this.f452596o), java.lang.Integer.valueOf(buVar.f452596o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452588d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452589e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f452590f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f452591g);
            java.lang.String str4 = this.f452592h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            r45.iu iuVar = this.f452593i;
            if (iuVar != null) {
                fVar.i(6, iuVar.mo75928xcd1e8d8());
                this.f452593i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f452594m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.e(8, this.f452595n);
            fVar.e(9, this.f452596o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f452588d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f452589e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f452590f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int e17 = j17 + b36.f.e(4, this.f452591g);
            java.lang.String str9 = this.f452592h;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            r45.iu iuVar2 = this.f452593i;
            if (iuVar2 != null) {
                e17 += b36.f.i(6, iuVar2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f452594m;
            if (str10 != null) {
                e17 += b36.f.j(7, str10);
            }
            return e17 + b36.f.e(8, this.f452595n) + b36.f.e(9, this.f452596o);
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
        r45.bu buVar = (r45.bu) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                buVar.f452588d = aVar2.k(intValue);
                return 0;
            case 2:
                buVar.f452589e = aVar2.k(intValue);
                return 0;
            case 3:
                buVar.f452590f = aVar2.k(intValue);
                return 0;
            case 4:
                buVar.f452591g = aVar2.g(intValue);
                return 0;
            case 5:
                buVar.f452592h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.iu iuVar3 = new r45.iu();
                    if (bArr != null && bArr.length > 0) {
                        iuVar3.mo11468x92b714fd(bArr);
                    }
                    buVar.f452593i = iuVar3;
                }
                return 0;
            case 7:
                buVar.f452594m = aVar2.k(intValue);
                return 0;
            case 8:
                buVar.f452595n = aVar2.g(intValue);
                return 0;
            case 9:
                buVar.f452596o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
