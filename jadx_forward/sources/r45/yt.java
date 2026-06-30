package r45;

/* loaded from: classes9.dex */
public class yt extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472874d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472875e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472876f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472877g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472878h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472879i;

    /* renamed from: m, reason: collision with root package name */
    public int f472880m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f472881n;

    /* renamed from: o, reason: collision with root package name */
    public int f472882o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f472883p;

    /* renamed from: q, reason: collision with root package name */
    public r45.iu f472884q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f472885r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yt)) {
            return false;
        }
        r45.yt ytVar = (r45.yt) fVar;
        return n51.f.a(this.f472874d, ytVar.f472874d) && n51.f.a(this.f472875e, ytVar.f472875e) && n51.f.a(this.f472876f, ytVar.f472876f) && n51.f.a(this.f472877g, ytVar.f472877g) && n51.f.a(this.f472878h, ytVar.f472878h) && n51.f.a(this.f472879i, ytVar.f472879i) && n51.f.a(java.lang.Integer.valueOf(this.f472880m), java.lang.Integer.valueOf(ytVar.f472880m)) && n51.f.a(this.f472881n, ytVar.f472881n) && n51.f.a(java.lang.Integer.valueOf(this.f472882o), java.lang.Integer.valueOf(ytVar.f472882o)) && n51.f.a(this.f472883p, ytVar.f472883p) && n51.f.a(this.f472884q, ytVar.f472884q) && n51.f.a(this.f472885r, ytVar.f472885r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472874d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f472875e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f472876f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f472877g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f472878h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            java.lang.String str6 = this.f472879i;
            if (str6 != null) {
                fVar.j(6, str6);
            }
            fVar.e(7, this.f472880m);
            java.lang.String str7 = this.f472881n;
            if (str7 != null) {
                fVar.j(8, str7);
            }
            fVar.e(9, this.f472882o);
            java.lang.String str8 = this.f472883p;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            r45.iu iuVar = this.f472884q;
            if (iuVar != null) {
                fVar.i(11, iuVar.mo75928xcd1e8d8());
                this.f472884q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str9 = this.f472885r;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str10 = this.f472874d;
            int j17 = str10 != null ? 0 + b36.f.j(1, str10) : 0;
            java.lang.String str11 = this.f472875e;
            if (str11 != null) {
                j17 += b36.f.j(2, str11);
            }
            java.lang.String str12 = this.f472876f;
            if (str12 != null) {
                j17 += b36.f.j(3, str12);
            }
            java.lang.String str13 = this.f472877g;
            if (str13 != null) {
                j17 += b36.f.j(4, str13);
            }
            java.lang.String str14 = this.f472878h;
            if (str14 != null) {
                j17 += b36.f.j(5, str14);
            }
            java.lang.String str15 = this.f472879i;
            if (str15 != null) {
                j17 += b36.f.j(6, str15);
            }
            int e17 = j17 + b36.f.e(7, this.f472880m);
            java.lang.String str16 = this.f472881n;
            if (str16 != null) {
                e17 += b36.f.j(8, str16);
            }
            int e18 = e17 + b36.f.e(9, this.f472882o);
            java.lang.String str17 = this.f472883p;
            if (str17 != null) {
                e18 += b36.f.j(10, str17);
            }
            r45.iu iuVar2 = this.f472884q;
            if (iuVar2 != null) {
                e18 += b36.f.i(11, iuVar2.mo75928xcd1e8d8());
            }
            java.lang.String str18 = this.f472885r;
            return str18 != null ? e18 + b36.f.j(12, str18) : e18;
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
        r45.yt ytVar = (r45.yt) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ytVar.f472874d = aVar2.k(intValue);
                return 0;
            case 2:
                ytVar.f472875e = aVar2.k(intValue);
                return 0;
            case 3:
                ytVar.f472876f = aVar2.k(intValue);
                return 0;
            case 4:
                ytVar.f472877g = aVar2.k(intValue);
                return 0;
            case 5:
                ytVar.f472878h = aVar2.k(intValue);
                return 0;
            case 6:
                ytVar.f472879i = aVar2.k(intValue);
                return 0;
            case 7:
                ytVar.f472880m = aVar2.g(intValue);
                return 0;
            case 8:
                ytVar.f472881n = aVar2.k(intValue);
                return 0;
            case 9:
                ytVar.f472882o = aVar2.g(intValue);
                return 0;
            case 10:
                ytVar.f472883p = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.iu iuVar3 = new r45.iu();
                    if (bArr != null && bArr.length > 0) {
                        iuVar3.mo11468x92b714fd(bArr);
                    }
                    ytVar.f472884q = iuVar3;
                }
                return 0;
            case 12:
                ytVar.f472885r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
