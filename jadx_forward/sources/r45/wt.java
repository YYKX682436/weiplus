package r45;

/* loaded from: classes9.dex */
public class wt extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470960d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470961e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470962f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470963g;

    /* renamed from: i, reason: collision with root package name */
    public int f470965i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470966m;

    /* renamed from: n, reason: collision with root package name */
    public r45.iu f470967n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f470968o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f470970q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f470971r;

    /* renamed from: s, reason: collision with root package name */
    public r45.iu f470972s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ut f470973t;

    /* renamed from: u, reason: collision with root package name */
    public int f470974u;

    /* renamed from: v, reason: collision with root package name */
    public int f470975v;

    /* renamed from: w, reason: collision with root package name */
    public int f470976w;

    /* renamed from: x, reason: collision with root package name */
    public long f470977x;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f470964h = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f470969p = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wt)) {
            return false;
        }
        r45.wt wtVar = (r45.wt) fVar;
        return n51.f.a(this.f470960d, wtVar.f470960d) && n51.f.a(this.f470961e, wtVar.f470961e) && n51.f.a(this.f470962f, wtVar.f470962f) && n51.f.a(this.f470963g, wtVar.f470963g) && n51.f.a(this.f470964h, wtVar.f470964h) && n51.f.a(java.lang.Integer.valueOf(this.f470965i), java.lang.Integer.valueOf(wtVar.f470965i)) && n51.f.a(this.f470966m, wtVar.f470966m) && n51.f.a(this.f470967n, wtVar.f470967n) && n51.f.a(this.f470968o, wtVar.f470968o) && n51.f.a(this.f470969p, wtVar.f470969p) && n51.f.a(this.f470970q, wtVar.f470970q) && n51.f.a(this.f470971r, wtVar.f470971r) && n51.f.a(this.f470972s, wtVar.f470972s) && n51.f.a(this.f470973t, wtVar.f470973t) && n51.f.a(java.lang.Integer.valueOf(this.f470974u), java.lang.Integer.valueOf(wtVar.f470974u)) && n51.f.a(java.lang.Integer.valueOf(this.f470975v), java.lang.Integer.valueOf(wtVar.f470975v)) && n51.f.a(java.lang.Integer.valueOf(this.f470976w), java.lang.Integer.valueOf(wtVar.f470976w)) && n51.f.a(java.lang.Long.valueOf(this.f470977x), java.lang.Long.valueOf(wtVar.f470977x));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470969p;
        java.util.LinkedList linkedList2 = this.f470964h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470960d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f470961e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f470962f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f470963g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.g(5, 8, linkedList2);
            fVar.e(6, this.f470965i);
            java.lang.String str5 = this.f470966m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            r45.iu iuVar = this.f470967n;
            if (iuVar != null) {
                fVar.i(8, iuVar.mo75928xcd1e8d8());
                this.f470967n.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str6 = this.f470968o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            fVar.g(10, 8, linkedList);
            java.lang.String str7 = this.f470970q;
            if (str7 != null) {
                fVar.j(11, str7);
            }
            java.lang.String str8 = this.f470971r;
            if (str8 != null) {
                fVar.j(12, str8);
            }
            r45.iu iuVar2 = this.f470972s;
            if (iuVar2 != null) {
                fVar.i(13, iuVar2.mo75928xcd1e8d8());
                this.f470972s.mo75956x3d5d1f78(fVar);
            }
            r45.ut utVar = this.f470973t;
            if (utVar != null) {
                fVar.i(14, utVar.mo75928xcd1e8d8());
                this.f470973t.mo75956x3d5d1f78(fVar);
            }
            fVar.e(15, this.f470974u);
            fVar.e(16, this.f470975v);
            fVar.e(17, this.f470976w);
            fVar.h(18, this.f470977x);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f470960d;
            int j17 = str9 != null ? b36.f.j(1, str9) + 0 : 0;
            java.lang.String str10 = this.f470961e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f470962f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            java.lang.String str12 = this.f470963g;
            if (str12 != null) {
                j17 += b36.f.j(4, str12);
            }
            int g17 = j17 + b36.f.g(5, 8, linkedList2) + b36.f.e(6, this.f470965i);
            java.lang.String str13 = this.f470966m;
            if (str13 != null) {
                g17 += b36.f.j(7, str13);
            }
            r45.iu iuVar3 = this.f470967n;
            if (iuVar3 != null) {
                g17 += b36.f.i(8, iuVar3.mo75928xcd1e8d8());
            }
            java.lang.String str14 = this.f470968o;
            if (str14 != null) {
                g17 += b36.f.j(9, str14);
            }
            int g18 = g17 + b36.f.g(10, 8, linkedList);
            java.lang.String str15 = this.f470970q;
            if (str15 != null) {
                g18 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f470971r;
            if (str16 != null) {
                g18 += b36.f.j(12, str16);
            }
            r45.iu iuVar4 = this.f470972s;
            if (iuVar4 != null) {
                g18 += b36.f.i(13, iuVar4.mo75928xcd1e8d8());
            }
            r45.ut utVar2 = this.f470973t;
            if (utVar2 != null) {
                g18 += b36.f.i(14, utVar2.mo75928xcd1e8d8());
            }
            return g18 + b36.f.e(15, this.f470974u) + b36.f.e(16, this.f470975v) + b36.f.e(17, this.f470976w) + b36.f.h(18, this.f470977x);
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
        r45.wt wtVar = (r45.wt) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wtVar.f470960d = aVar2.k(intValue);
                return 0;
            case 2:
                wtVar.f470961e = aVar2.k(intValue);
                return 0;
            case 3:
                wtVar.f470962f = aVar2.k(intValue);
                return 0;
            case 4:
                wtVar.f470963g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.ut utVar3 = new r45.ut();
                    if (bArr2 != null && bArr2.length > 0) {
                        utVar3.mo11468x92b714fd(bArr2);
                    }
                    wtVar.f470964h.add(utVar3);
                }
                return 0;
            case 6:
                wtVar.f470965i = aVar2.g(intValue);
                return 0;
            case 7:
                wtVar.f470966m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.iu iuVar5 = new r45.iu();
                    if (bArr3 != null && bArr3.length > 0) {
                        iuVar5.mo11468x92b714fd(bArr3);
                    }
                    wtVar.f470967n = iuVar5;
                }
                return 0;
            case 9:
                wtVar.f470968o = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.tt ttVar = new r45.tt();
                    if (bArr4 != null && bArr4.length > 0) {
                        ttVar.mo11468x92b714fd(bArr4);
                    }
                    wtVar.f470969p.add(ttVar);
                }
                return 0;
            case 11:
                wtVar.f470970q = aVar2.k(intValue);
                return 0;
            case 12:
                wtVar.f470971r = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.iu iuVar6 = new r45.iu();
                    if (bArr5 != null && bArr5.length > 0) {
                        iuVar6.mo11468x92b714fd(bArr5);
                    }
                    wtVar.f470972s = iuVar6;
                }
                return 0;
            case 14:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j29.get(i29);
                    r45.ut utVar4 = new r45.ut();
                    if (bArr6 != null && bArr6.length > 0) {
                        utVar4.mo11468x92b714fd(bArr6);
                    }
                    wtVar.f470973t = utVar4;
                }
                return 0;
            case 15:
                wtVar.f470974u = aVar2.g(intValue);
                return 0;
            case 16:
                wtVar.f470975v = aVar2.g(intValue);
                return 0;
            case 17:
                wtVar.f470976w = aVar2.g(intValue);
                return 0;
            case 18:
                wtVar.f470977x = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
