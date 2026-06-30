package r45;

/* loaded from: classes14.dex */
public class gm extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456881d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456882e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456883f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456884g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456885h;

    /* renamed from: i, reason: collision with root package name */
    public int f456886i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f456887m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f456888n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f456889o;

    /* renamed from: p, reason: collision with root package name */
    public int f456890p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f456891q;

    /* renamed from: r, reason: collision with root package name */
    public int f456892r;

    /* renamed from: s, reason: collision with root package name */
    public int f456893s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gm)) {
            return false;
        }
        r45.gm gmVar = (r45.gm) fVar;
        return n51.f.a(this.f76494x2de60e5e, gmVar.f76494x2de60e5e) && n51.f.a(this.f456881d, gmVar.f456881d) && n51.f.a(this.f456882e, gmVar.f456882e) && n51.f.a(this.f456883f, gmVar.f456883f) && n51.f.a(this.f456884g, gmVar.f456884g) && n51.f.a(this.f456885h, gmVar.f456885h) && n51.f.a(java.lang.Integer.valueOf(this.f456886i), java.lang.Integer.valueOf(gmVar.f456886i)) && n51.f.a(this.f456887m, gmVar.f456887m) && n51.f.a(this.f456888n, gmVar.f456888n) && n51.f.a(this.f456889o, gmVar.f456889o) && n51.f.a(java.lang.Integer.valueOf(this.f456890p), java.lang.Integer.valueOf(gmVar.f456890p)) && n51.f.a(this.f456891q, gmVar.f456891q) && n51.f.a(java.lang.Integer.valueOf(this.f456892r), java.lang.Integer.valueOf(gmVar.f456892r)) && n51.f.a(java.lang.Integer.valueOf(this.f456893s), java.lang.Integer.valueOf(gmVar.f456893s));
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
            java.lang.String str = this.f456881d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f456882e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f456883f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f456884g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f456885h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f456886i);
            java.lang.String str6 = this.f456887m;
            if (str6 != null) {
                fVar.j(8, str6);
            }
            java.lang.String str7 = this.f456888n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            java.lang.String str8 = this.f456889o;
            if (str8 != null) {
                fVar.j(10, str8);
            }
            fVar.e(11, this.f456890p);
            java.lang.String str9 = this.f456891q;
            if (str9 != null) {
                fVar.j(12, str9);
            }
            fVar.e(13, this.f456892r);
            fVar.e(14, this.f456893s);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0 : 0;
            java.lang.String str10 = this.f456881d;
            if (str10 != null) {
                i18 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f456882e;
            if (str11 != null) {
                i18 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f456883f;
            if (str12 != null) {
                i18 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f456884g;
            if (str13 != null) {
                i18 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f456885h;
            if (str14 != null) {
                i18 += b36.f.j(6, str14);
            }
            int e17 = i18 + b36.f.e(7, this.f456886i);
            java.lang.String str15 = this.f456887m;
            if (str15 != null) {
                e17 += b36.f.j(8, str15);
            }
            java.lang.String str16 = this.f456888n;
            if (str16 != null) {
                e17 += b36.f.j(9, str16);
            }
            java.lang.String str17 = this.f456889o;
            if (str17 != null) {
                e17 += b36.f.j(10, str17);
            }
            int e18 = e17 + b36.f.e(11, this.f456890p);
            java.lang.String str18 = this.f456891q;
            if (str18 != null) {
                e18 += b36.f.j(12, str18);
            }
            return e18 + b36.f.e(13, this.f456892r) + b36.f.e(14, this.f456893s);
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
        r45.gm gmVar = (r45.gm) objArr[1];
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
                    gmVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                gmVar.f456881d = aVar2.k(intValue);
                return 0;
            case 3:
                gmVar.f456882e = aVar2.k(intValue);
                return 0;
            case 4:
                gmVar.f456883f = aVar2.k(intValue);
                return 0;
            case 5:
                gmVar.f456884g = aVar2.k(intValue);
                return 0;
            case 6:
                gmVar.f456885h = aVar2.k(intValue);
                return 0;
            case 7:
                gmVar.f456886i = aVar2.g(intValue);
                return 0;
            case 8:
                gmVar.f456887m = aVar2.k(intValue);
                return 0;
            case 9:
                gmVar.f456888n = aVar2.k(intValue);
                return 0;
            case 10:
                gmVar.f456889o = aVar2.k(intValue);
                return 0;
            case 11:
                gmVar.f456890p = aVar2.g(intValue);
                return 0;
            case 12:
                gmVar.f456891q = aVar2.k(intValue);
                return 0;
            case 13:
                gmVar.f456892r = aVar2.g(intValue);
                return 0;
            case 14:
                gmVar.f456893s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
