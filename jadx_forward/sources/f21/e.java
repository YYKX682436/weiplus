package f21;

/* loaded from: classes15.dex */
public class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f340405e;

    /* renamed from: f, reason: collision with root package name */
    public int f340406f;

    /* renamed from: g, reason: collision with root package name */
    public int f340407g;

    /* renamed from: h, reason: collision with root package name */
    public int f340408h;

    /* renamed from: i, reason: collision with root package name */
    public int f340409i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f340410m;

    /* renamed from: n, reason: collision with root package name */
    public int f340411n;

    /* renamed from: o, reason: collision with root package name */
    public f21.d0 f340412o;

    /* renamed from: q, reason: collision with root package name */
    public int f340414q;

    /* renamed from: r, reason: collision with root package name */
    public f21.d f340415r;

    /* renamed from: s, reason: collision with root package name */
    public f21.i f340416s;

    /* renamed from: t, reason: collision with root package name */
    public int f340417t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f340418u;

    /* renamed from: v, reason: collision with root package name */
    public f21.h f340419v;

    /* renamed from: w, reason: collision with root package name */
    public f21.l f340420w;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f340404d = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f340413p = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof f21.e)) {
            return false;
        }
        f21.e eVar = (f21.e) fVar;
        return n51.f.a(this.f340404d, eVar.f340404d) && n51.f.a(this.f340405e, eVar.f340405e) && n51.f.a(java.lang.Integer.valueOf(this.f340406f), java.lang.Integer.valueOf(eVar.f340406f)) && n51.f.a(java.lang.Integer.valueOf(this.f340407g), java.lang.Integer.valueOf(eVar.f340407g)) && n51.f.a(java.lang.Integer.valueOf(this.f340408h), java.lang.Integer.valueOf(eVar.f340408h)) && n51.f.a(java.lang.Integer.valueOf(this.f340409i), java.lang.Integer.valueOf(eVar.f340409i)) && n51.f.a(this.f340410m, eVar.f340410m) && n51.f.a(java.lang.Integer.valueOf(this.f340411n), java.lang.Integer.valueOf(eVar.f340411n)) && n51.f.a(this.f340412o, eVar.f340412o) && n51.f.a(this.f340413p, eVar.f340413p) && n51.f.a(java.lang.Integer.valueOf(this.f340414q), java.lang.Integer.valueOf(eVar.f340414q)) && n51.f.a(this.f340415r, eVar.f340415r) && n51.f.a(this.f340416s, eVar.f340416s) && n51.f.a(java.lang.Integer.valueOf(this.f340417t), java.lang.Integer.valueOf(eVar.f340417t)) && n51.f.a(this.f340418u, eVar.f340418u) && n51.f.a(this.f340419v, eVar.f340419v) && n51.f.a(this.f340420w, eVar.f340420w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f340413p;
        java.util.LinkedList linkedList2 = this.f340404d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            java.lang.String str = this.f340405e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f340406f);
            fVar.e(4, this.f340407g);
            fVar.e(5, this.f340408h);
            fVar.e(6, this.f340409i);
            java.lang.String str2 = this.f340410m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f340411n);
            f21.d0 d0Var = this.f340412o;
            if (d0Var != null) {
                fVar.i(9, d0Var.mo75928xcd1e8d8());
                this.f340412o.mo75956x3d5d1f78(fVar);
            }
            fVar.g(10, 8, linkedList);
            fVar.e(11, this.f340414q);
            f21.d dVar = this.f340415r;
            if (dVar != null) {
                fVar.i(12, dVar.mo75928xcd1e8d8());
                this.f340415r.mo75956x3d5d1f78(fVar);
            }
            f21.i iVar = this.f340416s;
            if (iVar != null) {
                fVar.i(13, iVar.mo75928xcd1e8d8());
                this.f340416s.mo75956x3d5d1f78(fVar);
            }
            fVar.e(14, this.f340417t);
            java.lang.String str3 = this.f340418u;
            if (str3 != null) {
                fVar.j(15, str3);
            }
            f21.h hVar = this.f340419v;
            if (hVar != null) {
                fVar.i(16, hVar.mo75928xcd1e8d8());
                this.f340419v.mo75956x3d5d1f78(fVar);
            }
            f21.l lVar = this.f340420w;
            if (lVar != null) {
                fVar.i(17, lVar.mo75928xcd1e8d8());
                this.f340420w.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            java.lang.String str4 = this.f340405e;
            if (str4 != null) {
                g17 += b36.f.j(2, str4);
            }
            int e17 = g17 + b36.f.e(3, this.f340406f) + b36.f.e(4, this.f340407g) + b36.f.e(5, this.f340408h) + b36.f.e(6, this.f340409i);
            java.lang.String str5 = this.f340410m;
            if (str5 != null) {
                e17 += b36.f.j(7, str5);
            }
            int e18 = e17 + b36.f.e(8, this.f340411n);
            f21.d0 d0Var2 = this.f340412o;
            if (d0Var2 != null) {
                e18 += b36.f.i(9, d0Var2.mo75928xcd1e8d8());
            }
            int g18 = e18 + b36.f.g(10, 8, linkedList) + b36.f.e(11, this.f340414q);
            f21.d dVar2 = this.f340415r;
            if (dVar2 != null) {
                g18 += b36.f.i(12, dVar2.mo75928xcd1e8d8());
            }
            f21.i iVar2 = this.f340416s;
            if (iVar2 != null) {
                g18 += b36.f.i(13, iVar2.mo75928xcd1e8d8());
            }
            int e19 = g18 + b36.f.e(14, this.f340417t);
            java.lang.String str6 = this.f340418u;
            if (str6 != null) {
                e19 += b36.f.j(15, str6);
            }
            f21.h hVar2 = this.f340419v;
            if (hVar2 != null) {
                e19 += b36.f.i(16, hVar2.mo75928xcd1e8d8());
            }
            f21.l lVar2 = this.f340420w;
            return lVar2 != null ? e19 + b36.f.i(17, lVar2.mo75928xcd1e8d8()) : e19;
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
        f21.e eVar = (f21.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    f21.f fVar2 = new f21.f();
                    if (bArr2 != null && bArr2.length > 0) {
                        fVar2.mo11468x92b714fd(bArr2);
                    }
                    eVar.f340404d.add(fVar2);
                }
                return 0;
            case 2:
                eVar.f340405e = aVar2.k(intValue);
                return 0;
            case 3:
                eVar.f340406f = aVar2.g(intValue);
                return 0;
            case 4:
                eVar.f340407g = aVar2.g(intValue);
                return 0;
            case 5:
                eVar.f340408h = aVar2.g(intValue);
                return 0;
            case 6:
                eVar.f340409i = aVar2.g(intValue);
                return 0;
            case 7:
                eVar.f340410m = aVar2.k(intValue);
                return 0;
            case 8:
                eVar.f340411n = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    f21.d0 d0Var3 = new f21.d0();
                    if (bArr3 != null && bArr3.length > 0) {
                        d0Var3.mo11468x92b714fd(bArr3);
                    }
                    eVar.f340412o = d0Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    f21.h0 h0Var = new f21.h0();
                    if (bArr4 != null && bArr4.length > 0) {
                        h0Var.mo11468x92b714fd(bArr4);
                    }
                    eVar.f340413p.add(h0Var);
                }
                return 0;
            case 11:
                eVar.f340414q = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    f21.d dVar3 = new f21.d();
                    if (bArr5 != null && bArr5.length > 0) {
                        dVar3.mo11468x92b714fd(bArr5);
                    }
                    eVar.f340415r = dVar3;
                }
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    f21.i iVar3 = new f21.i();
                    if (bArr6 != null && bArr6.length > 0) {
                        iVar3.mo11468x92b714fd(bArr6);
                    }
                    eVar.f340416s = iVar3;
                }
                return 0;
            case 14:
                eVar.f340417t = aVar2.g(intValue);
                return 0;
            case 15:
                eVar.f340418u = aVar2.k(intValue);
                return 0;
            case 16:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    f21.h hVar3 = new f21.h();
                    if (bArr7 != null && bArr7.length > 0) {
                        hVar3.mo11468x92b714fd(bArr7);
                    }
                    eVar.f340419v = hVar3;
                }
                return 0;
            case 17:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    f21.l lVar3 = new f21.l();
                    if (bArr8 != null && bArr8.length > 0) {
                        lVar3.mo11468x92b714fd(bArr8);
                    }
                    eVar.f340420w = lVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
