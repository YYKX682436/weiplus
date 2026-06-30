package r45;

/* loaded from: classes9.dex */
public class ly extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f461493d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461494e;

    /* renamed from: f, reason: collision with root package name */
    public int f461495f;

    /* renamed from: g, reason: collision with root package name */
    public long f461496g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461497h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461498i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ay f461499m;

    /* renamed from: n, reason: collision with root package name */
    public r45.zw4 f461500n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f461501o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f461502p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f461503q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f461504r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f461505s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ly)) {
            return false;
        }
        r45.ly lyVar = (r45.ly) fVar;
        return n51.f.a(this.f76492x92037252, lyVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f461493d), java.lang.Integer.valueOf(lyVar.f461493d)) && n51.f.a(this.f461494e, lyVar.f461494e) && n51.f.a(java.lang.Integer.valueOf(this.f461495f), java.lang.Integer.valueOf(lyVar.f461495f)) && n51.f.a(java.lang.Long.valueOf(this.f461496g), java.lang.Long.valueOf(lyVar.f461496g)) && n51.f.a(this.f461497h, lyVar.f461497h) && n51.f.a(this.f461498i, lyVar.f461498i) && n51.f.a(this.f461499m, lyVar.f461499m) && n51.f.a(this.f461500n, lyVar.f461500n) && n51.f.a(this.f461501o, lyVar.f461501o) && n51.f.a(this.f461502p, lyVar.f461502p) && n51.f.a(this.f461503q, lyVar.f461503q) && n51.f.a(this.f461504r, lyVar.f461504r) && n51.f.a(this.f461505s, lyVar.f461505s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461502p;
        java.util.LinkedList linkedList2 = this.f461501o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f461493d);
            java.lang.String str = this.f461494e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f461495f);
            fVar.h(5, this.f461496g);
            java.lang.String str2 = this.f461497h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f461498i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.ay ayVar = this.f461499m;
            if (ayVar != null) {
                fVar.i(8, ayVar.mo75928xcd1e8d8());
                this.f461499m.mo75956x3d5d1f78(fVar);
            }
            r45.zw4 zw4Var = this.f461500n;
            if (zw4Var != null) {
                fVar.i(9, zw4Var.mo75928xcd1e8d8());
                this.f461500n.mo75956x3d5d1f78(fVar);
            }
            fVar.g(10, 8, linkedList2);
            fVar.g(11, 8, linkedList);
            java.lang.String str4 = this.f461503q;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.f461504r;
            if (str5 != null) {
                fVar.j(13, str5);
            }
            java.lang.String str6 = this.f461505s;
            if (str6 != null) {
                fVar.j(14, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f461493d);
            java.lang.String str7 = this.f461494e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            int e17 = i18 + b36.f.e(4, this.f461495f) + b36.f.h(5, this.f461496g);
            java.lang.String str8 = this.f461497h;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            java.lang.String str9 = this.f461498i;
            if (str9 != null) {
                e17 += b36.f.j(7, str9);
            }
            r45.ay ayVar2 = this.f461499m;
            if (ayVar2 != null) {
                e17 += b36.f.i(8, ayVar2.mo75928xcd1e8d8());
            }
            r45.zw4 zw4Var2 = this.f461500n;
            if (zw4Var2 != null) {
                e17 += b36.f.i(9, zw4Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(10, 8, linkedList2) + b36.f.g(11, 8, linkedList);
            java.lang.String str10 = this.f461503q;
            if (str10 != null) {
                g17 += b36.f.j(12, str10);
            }
            java.lang.String str11 = this.f461504r;
            if (str11 != null) {
                g17 += b36.f.j(13, str11);
            }
            java.lang.String str12 = this.f461505s;
            return str12 != null ? g17 + b36.f.j(14, str12) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.ly lyVar = (r45.ly) objArr[1];
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
                    lyVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                lyVar.f461493d = aVar2.g(intValue);
                return 0;
            case 3:
                lyVar.f461494e = aVar2.k(intValue);
                return 0;
            case 4:
                lyVar.f461495f = aVar2.g(intValue);
                return 0;
            case 5:
                lyVar.f461496g = aVar2.i(intValue);
                return 0;
            case 6:
                lyVar.f461497h = aVar2.k(intValue);
                return 0;
            case 7:
                lyVar.f461498i = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.ay ayVar3 = new r45.ay();
                    if (bArr3 != null && bArr3.length > 0) {
                        ayVar3.mo11468x92b714fd(bArr3);
                    }
                    lyVar.f461499m = ayVar3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.zw4 zw4Var3 = new r45.zw4();
                    if (bArr4 != null && bArr4.length > 0) {
                        zw4Var3.mo11468x92b714fd(bArr4);
                    }
                    lyVar.f461500n = zw4Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.wr6 wr6Var = new r45.wr6();
                    if (bArr5 != null && bArr5.length > 0) {
                        wr6Var.mo11468x92b714fd(bArr5);
                    }
                    lyVar.f461501o.add(wr6Var);
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.kl6 kl6Var = new r45.kl6();
                    if (bArr6 != null && bArr6.length > 0) {
                        kl6Var.mo11468x92b714fd(bArr6);
                    }
                    lyVar.f461502p.add(kl6Var);
                }
                return 0;
            case 12:
                lyVar.f461503q = aVar2.k(intValue);
                return 0;
            case 13:
                lyVar.f461504r = aVar2.k(intValue);
                return 0;
            case 14:
                lyVar.f461505s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
