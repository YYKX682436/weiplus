package r45;

/* loaded from: classes9.dex */
public class ni3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f462951d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462952e;

    /* renamed from: f, reason: collision with root package name */
    public int f462953f;

    /* renamed from: g, reason: collision with root package name */
    public int f462954g;

    /* renamed from: i, reason: collision with root package name */
    public r45.ru f462956i;

    /* renamed from: m, reason: collision with root package name */
    public int f462957m;

    /* renamed from: n, reason: collision with root package name */
    public int f462958n;

    /* renamed from: o, reason: collision with root package name */
    public r45.iu f462959o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f462960p;

    /* renamed from: q, reason: collision with root package name */
    public r45.iu f462961q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f462962r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f462963s;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f462955h = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f462964t = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ni3)) {
            return false;
        }
        r45.ni3 ni3Var = (r45.ni3) fVar;
        return n51.f.a(this.f76492x92037252, ni3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f462951d), java.lang.Integer.valueOf(ni3Var.f462951d)) && n51.f.a(this.f462952e, ni3Var.f462952e) && n51.f.a(java.lang.Integer.valueOf(this.f462953f), java.lang.Integer.valueOf(ni3Var.f462953f)) && n51.f.a(java.lang.Integer.valueOf(this.f462954g), java.lang.Integer.valueOf(ni3Var.f462954g)) && n51.f.a(this.f462955h, ni3Var.f462955h) && n51.f.a(this.f462956i, ni3Var.f462956i) && n51.f.a(java.lang.Integer.valueOf(this.f462957m), java.lang.Integer.valueOf(ni3Var.f462957m)) && n51.f.a(java.lang.Integer.valueOf(this.f462958n), java.lang.Integer.valueOf(ni3Var.f462958n)) && n51.f.a(this.f462959o, ni3Var.f462959o) && n51.f.a(this.f462960p, ni3Var.f462960p) && n51.f.a(this.f462961q, ni3Var.f462961q) && n51.f.a(this.f462962r, ni3Var.f462962r) && n51.f.a(this.f462963s, ni3Var.f462963s) && n51.f.a(this.f462964t, ni3Var.f462964t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f462955h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f462951d);
            java.lang.String str = this.f462952e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f462953f);
            fVar.e(5, this.f462954g);
            fVar.g(6, 8, linkedList);
            r45.ru ruVar = this.f462956i;
            if (ruVar != null) {
                fVar.i(7, ruVar.mo75928xcd1e8d8());
                this.f462956i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f462957m);
            fVar.e(9, this.f462958n);
            r45.iu iuVar = this.f462959o;
            if (iuVar != null) {
                fVar.i(10, iuVar.mo75928xcd1e8d8());
                this.f462959o.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f462960p;
            if (str2 != null) {
                fVar.j(11, str2);
            }
            r45.iu iuVar2 = this.f462961q;
            if (iuVar2 != null) {
                fVar.i(12, iuVar2.mo75928xcd1e8d8());
                this.f462961q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f462962r;
            if (str3 != null) {
                fVar.j(13, str3);
            }
            java.lang.String str4 = this.f462963s;
            if (str4 != null) {
                fVar.j(14, str4);
            }
            fVar.g(15, 8, this.f462964t);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f462951d);
            java.lang.String str5 = this.f462952e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f462953f) + b36.f.e(5, this.f462954g) + b36.f.g(6, 8, linkedList);
            r45.ru ruVar2 = this.f462956i;
            if (ruVar2 != null) {
                e17 += b36.f.i(7, ruVar2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(8, this.f462957m) + b36.f.e(9, this.f462958n);
            r45.iu iuVar3 = this.f462959o;
            if (iuVar3 != null) {
                e18 += b36.f.i(10, iuVar3.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f462960p;
            if (str6 != null) {
                e18 += b36.f.j(11, str6);
            }
            r45.iu iuVar4 = this.f462961q;
            if (iuVar4 != null) {
                e18 += b36.f.i(12, iuVar4.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f462962r;
            if (str7 != null) {
                e18 += b36.f.j(13, str7);
            }
            java.lang.String str8 = this.f462963s;
            if (str8 != null) {
                e18 += b36.f.j(14, str8);
            }
            return e18 + b36.f.g(15, 8, this.f462964t);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f462964t.clear();
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
        r45.ni3 ni3Var = (r45.ni3) objArr[1];
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
                    ni3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ni3Var.f462951d = aVar2.g(intValue);
                return 0;
            case 3:
                ni3Var.f462952e = aVar2.k(intValue);
                return 0;
            case 4:
                ni3Var.f462953f = aVar2.g(intValue);
                return 0;
            case 5:
                ni3Var.f462954g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.tt ttVar = new r45.tt();
                    if (bArr3 != null && bArr3.length > 0) {
                        ttVar.mo11468x92b714fd(bArr3);
                    }
                    ni3Var.f462955h.add(ttVar);
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ru ruVar3 = new r45.ru();
                    if (bArr4 != null && bArr4.length > 0) {
                        ruVar3.mo11468x92b714fd(bArr4);
                    }
                    ni3Var.f462956i = ruVar3;
                }
                return 0;
            case 8:
                ni3Var.f462957m = aVar2.g(intValue);
                return 0;
            case 9:
                ni3Var.f462958n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.iu iuVar5 = new r45.iu();
                    if (bArr5 != null && bArr5.length > 0) {
                        iuVar5.mo11468x92b714fd(bArr5);
                    }
                    ni3Var.f462959o = iuVar5;
                }
                return 0;
            case 11:
                ni3Var.f462960p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.iu iuVar6 = new r45.iu();
                    if (bArr6 != null && bArr6.length > 0) {
                        iuVar6.mo11468x92b714fd(bArr6);
                    }
                    ni3Var.f462961q = iuVar6;
                }
                return 0;
            case 13:
                ni3Var.f462962r = aVar2.k(intValue);
                return 0;
            case 14:
                ni3Var.f462963s = aVar2.k(intValue);
                return 0;
            case 15:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.xt xtVar = new r45.xt();
                    if (bArr7 != null && bArr7.length > 0) {
                        xtVar.mo11468x92b714fd(bArr7);
                    }
                    ni3Var.f462964t.add(xtVar);
                }
                return 0;
            default:
                return -1;
        }
    }
}
