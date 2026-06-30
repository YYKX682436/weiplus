package r45;

/* loaded from: classes2.dex */
public class sj6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.oj6 f467319d;

    /* renamed from: e, reason: collision with root package name */
    public long f467320e;

    /* renamed from: f, reason: collision with root package name */
    public int f467321f;

    /* renamed from: g, reason: collision with root package name */
    public int f467322g;

    /* renamed from: h, reason: collision with root package name */
    public long f467323h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f467324i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f467325m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f467326n;

    /* renamed from: o, reason: collision with root package name */
    public r45.pn0 f467327o;

    /* renamed from: p, reason: collision with root package name */
    public int f467328p;

    /* renamed from: q, reason: collision with root package name */
    public r45.uk5 f467329q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f467330r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f467331s;

    /* renamed from: t, reason: collision with root package name */
    public int f467332t;

    /* renamed from: u, reason: collision with root package name */
    public r45.lt4 f467333u;

    /* renamed from: v, reason: collision with root package name */
    public int f467334v;

    /* renamed from: w, reason: collision with root package name */
    public r45.zl f467335w;

    /* renamed from: x, reason: collision with root package name */
    public r45.ym4 f467336x;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sj6)) {
            return false;
        }
        r45.sj6 sj6Var = (r45.sj6) fVar;
        return n51.f.a(this.f467319d, sj6Var.f467319d) && n51.f.a(java.lang.Long.valueOf(this.f467320e), java.lang.Long.valueOf(sj6Var.f467320e)) && n51.f.a(java.lang.Integer.valueOf(this.f467321f), java.lang.Integer.valueOf(sj6Var.f467321f)) && n51.f.a(java.lang.Integer.valueOf(this.f467322g), java.lang.Integer.valueOf(sj6Var.f467322g)) && n51.f.a(java.lang.Long.valueOf(this.f467323h), java.lang.Long.valueOf(sj6Var.f467323h)) && n51.f.a(this.f467324i, sj6Var.f467324i) && n51.f.a(java.lang.Integer.valueOf(this.f467325m), java.lang.Integer.valueOf(sj6Var.f467325m)) && n51.f.a(this.f467326n, sj6Var.f467326n) && n51.f.a(this.f467327o, sj6Var.f467327o) && n51.f.a(java.lang.Integer.valueOf(this.f467328p), java.lang.Integer.valueOf(sj6Var.f467328p)) && n51.f.a(this.f467329q, sj6Var.f467329q) && n51.f.a(this.f467330r, sj6Var.f467330r) && n51.f.a(this.f467331s, sj6Var.f467331s) && n51.f.a(java.lang.Integer.valueOf(this.f467332t), java.lang.Integer.valueOf(sj6Var.f467332t)) && n51.f.a(this.f467333u, sj6Var.f467333u) && n51.f.a(java.lang.Integer.valueOf(this.f467334v), java.lang.Integer.valueOf(sj6Var.f467334v)) && n51.f.a(this.f467335w, sj6Var.f467335w) && n51.f.a(this.f467336x, sj6Var.f467336x);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467324i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.oj6 oj6Var = this.f467319d;
            if (oj6Var != null) {
                fVar.i(1, oj6Var.mo75928xcd1e8d8());
                this.f467319d.mo75956x3d5d1f78(fVar);
            }
            fVar.h(2, this.f467320e);
            fVar.e(3, this.f467321f);
            fVar.e(4, this.f467322g);
            fVar.h(5, this.f467323h);
            fVar.g(6, 1, linkedList);
            fVar.e(7, this.f467325m);
            java.lang.String str = this.f467326n;
            if (str != null) {
                fVar.j(8, str);
            }
            r45.pn0 pn0Var = this.f467327o;
            if (pn0Var != null) {
                fVar.i(9, pn0Var.mo75928xcd1e8d8());
                this.f467327o.mo75956x3d5d1f78(fVar);
            }
            fVar.e(10, this.f467328p);
            r45.uk5 uk5Var = this.f467329q;
            if (uk5Var != null) {
                fVar.i(11, uk5Var.mo75928xcd1e8d8());
                this.f467329q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f467330r;
            if (str2 != null) {
                fVar.j(12, str2);
            }
            java.lang.String str3 = this.f467331s;
            if (str3 != null) {
                fVar.j(13, str3);
            }
            fVar.e(14, this.f467332t);
            r45.lt4 lt4Var = this.f467333u;
            if (lt4Var != null) {
                fVar.i(15, lt4Var.mo75928xcd1e8d8());
                this.f467333u.mo75956x3d5d1f78(fVar);
            }
            fVar.e(16, this.f467334v);
            r45.zl zlVar = this.f467335w;
            if (zlVar != null) {
                fVar.i(17, zlVar.mo75928xcd1e8d8());
                this.f467335w.mo75956x3d5d1f78(fVar);
            }
            r45.ym4 ym4Var = this.f467336x;
            if (ym4Var != null) {
                fVar.i(18, ym4Var.mo75928xcd1e8d8());
                this.f467336x.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.oj6 oj6Var2 = this.f467319d;
            int i18 = (oj6Var2 != null ? b36.f.i(1, oj6Var2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.h(2, this.f467320e) + b36.f.e(3, this.f467321f) + b36.f.e(4, this.f467322g) + b36.f.h(5, this.f467323h) + b36.f.g(6, 1, linkedList) + b36.f.e(7, this.f467325m);
            java.lang.String str4 = this.f467326n;
            if (str4 != null) {
                i18 += b36.f.j(8, str4);
            }
            r45.pn0 pn0Var2 = this.f467327o;
            if (pn0Var2 != null) {
                i18 += b36.f.i(9, pn0Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(10, this.f467328p);
            r45.uk5 uk5Var2 = this.f467329q;
            if (uk5Var2 != null) {
                e17 += b36.f.i(11, uk5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f467330r;
            if (str5 != null) {
                e17 += b36.f.j(12, str5);
            }
            java.lang.String str6 = this.f467331s;
            if (str6 != null) {
                e17 += b36.f.j(13, str6);
            }
            int e18 = e17 + b36.f.e(14, this.f467332t);
            r45.lt4 lt4Var2 = this.f467333u;
            if (lt4Var2 != null) {
                e18 += b36.f.i(15, lt4Var2.mo75928xcd1e8d8());
            }
            int e19 = e18 + b36.f.e(16, this.f467334v);
            r45.zl zlVar2 = this.f467335w;
            if (zlVar2 != null) {
                e19 += b36.f.i(17, zlVar2.mo75928xcd1e8d8());
            }
            r45.ym4 ym4Var2 = this.f467336x;
            return ym4Var2 != null ? e19 + b36.f.i(18, ym4Var2.mo75928xcd1e8d8()) : e19;
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
        r45.sj6 sj6Var = (r45.sj6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.oj6 oj6Var3 = new r45.oj6();
                    if (bArr2 != null && bArr2.length > 0) {
                        oj6Var3.mo11468x92b714fd(bArr2);
                    }
                    sj6Var.f467319d = oj6Var3;
                }
                return 0;
            case 2:
                sj6Var.f467320e = aVar2.i(intValue);
                return 0;
            case 3:
                sj6Var.f467321f = aVar2.g(intValue);
                return 0;
            case 4:
                sj6Var.f467322g = aVar2.g(intValue);
                return 0;
            case 5:
                sj6Var.f467323h = aVar2.i(intValue);
                return 0;
            case 6:
                sj6Var.f467324i.add(aVar2.k(intValue));
                return 0;
            case 7:
                sj6Var.f467325m = aVar2.g(intValue);
                return 0;
            case 8:
                sj6Var.f467326n = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.pn0 pn0Var3 = new r45.pn0();
                    if (bArr3 != null && bArr3.length > 0) {
                        pn0Var3.mo11468x92b714fd(bArr3);
                    }
                    sj6Var.f467327o = pn0Var3;
                }
                return 0;
            case 10:
                sj6Var.f467328p = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.uk5 uk5Var3 = new r45.uk5();
                    if (bArr4 != null && bArr4.length > 0) {
                        uk5Var3.mo11468x92b714fd(bArr4);
                    }
                    sj6Var.f467329q = uk5Var3;
                }
                return 0;
            case 12:
                sj6Var.f467330r = aVar2.k(intValue);
                return 0;
            case 13:
                sj6Var.f467331s = aVar2.k(intValue);
                return 0;
            case 14:
                sj6Var.f467332t = aVar2.g(intValue);
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.lt4 lt4Var3 = new r45.lt4();
                    if (bArr5 != null && bArr5.length > 0) {
                        lt4Var3.mo11468x92b714fd(bArr5);
                    }
                    sj6Var.f467333u = lt4Var3;
                }
                return 0;
            case 16:
                sj6Var.f467334v = aVar2.g(intValue);
                return 0;
            case 17:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.zl zlVar3 = new r45.zl();
                    if (bArr6 != null && bArr6.length > 0) {
                        zlVar3.mo11468x92b714fd(bArr6);
                    }
                    sj6Var.f467335w = zlVar3;
                }
                return 0;
            case 18:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.ym4 ym4Var3 = new r45.ym4();
                    if (bArr7 != null && bArr7.length > 0) {
                        ym4Var3.mo11468x92b714fd(bArr7);
                    }
                    sj6Var.f467336x = ym4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
