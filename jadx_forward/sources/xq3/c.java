package xq3;

/* loaded from: classes15.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f537592d;

    /* renamed from: f, reason: collision with root package name */
    public int f537594f;

    /* renamed from: g, reason: collision with root package name */
    public int f537595g;

    /* renamed from: h, reason: collision with root package name */
    public int f537596h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f537598m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f537599n;

    /* renamed from: r, reason: collision with root package name */
    public int f537603r;

    /* renamed from: s, reason: collision with root package name */
    public int f537604s;

    /* renamed from: u, reason: collision with root package name */
    public int f537606u;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f537608w;

    /* renamed from: x, reason: collision with root package name */
    public xq3.k f537609x;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f537593e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f537597i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f537600o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f537601p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f537602q = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f537605t = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public java.util.LinkedList f537607v = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof xq3.c)) {
            return false;
        }
        xq3.c cVar = (xq3.c) fVar;
        return n51.f.a(this.f537592d, cVar.f537592d) && n51.f.a(this.f537593e, cVar.f537593e) && n51.f.a(java.lang.Integer.valueOf(this.f537594f), java.lang.Integer.valueOf(cVar.f537594f)) && n51.f.a(java.lang.Integer.valueOf(this.f537595g), java.lang.Integer.valueOf(cVar.f537595g)) && n51.f.a(java.lang.Integer.valueOf(this.f537596h), java.lang.Integer.valueOf(cVar.f537596h)) && n51.f.a(this.f537597i, cVar.f537597i) && n51.f.a(this.f537598m, cVar.f537598m) && n51.f.a(this.f537599n, cVar.f537599n) && n51.f.a(this.f537600o, cVar.f537600o) && n51.f.a(this.f537601p, cVar.f537601p) && n51.f.a(this.f537602q, cVar.f537602q) && n51.f.a(java.lang.Integer.valueOf(this.f537603r), java.lang.Integer.valueOf(cVar.f537603r)) && n51.f.a(java.lang.Integer.valueOf(this.f537604s), java.lang.Integer.valueOf(cVar.f537604s)) && n51.f.a(this.f537605t, cVar.f537605t) && n51.f.a(java.lang.Integer.valueOf(this.f537606u), java.lang.Integer.valueOf(cVar.f537606u)) && n51.f.a(this.f537607v, cVar.f537607v) && n51.f.a(this.f537608w, cVar.f537608w) && n51.f.a(this.f537609x, cVar.f537609x);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f537602q;
        java.util.LinkedList linkedList2 = this.f537601p;
        java.util.LinkedList linkedList3 = this.f537600o;
        java.util.LinkedList linkedList4 = this.f537593e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f537592d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList4);
            fVar.e(3, this.f537594f);
            fVar.e(4, this.f537595g);
            fVar.e(5, this.f537596h);
            fVar.g(6, 1, this.f537597i);
            java.lang.String str2 = this.f537598m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f537599n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.g(9, 1, linkedList3);
            fVar.g(10, 8, linkedList2);
            fVar.g(11, 1, linkedList);
            fVar.e(12, this.f537603r);
            fVar.e(13, this.f537604s);
            fVar.g(14, 8, this.f537605t);
            fVar.e(15, this.f537606u);
            fVar.g(16, 8, this.f537607v);
            java.lang.String str4 = this.f537608w;
            if (str4 != null) {
                fVar.j(17, str4);
            }
            xq3.k kVar = this.f537609x;
            if (kVar != null) {
                fVar.i(18, kVar.mo75928xcd1e8d8());
                this.f537609x.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f537592d;
            int j17 = (str5 != null ? b36.f.j(1, str5) + 0 : 0) + b36.f.g(2, 8, linkedList4) + b36.f.e(3, this.f537594f) + b36.f.e(4, this.f537595g) + b36.f.e(5, this.f537596h) + b36.f.g(6, 1, this.f537597i);
            java.lang.String str6 = this.f537598m;
            if (str6 != null) {
                j17 += b36.f.j(7, str6);
            }
            java.lang.String str7 = this.f537599n;
            if (str7 != null) {
                j17 += b36.f.j(8, str7);
            }
            int g17 = j17 + b36.f.g(9, 1, linkedList3) + b36.f.g(10, 8, linkedList2) + b36.f.g(11, 1, linkedList) + b36.f.e(12, this.f537603r) + b36.f.e(13, this.f537604s) + b36.f.g(14, 8, this.f537605t) + b36.f.e(15, this.f537606u) + b36.f.g(16, 8, this.f537607v);
            java.lang.String str8 = this.f537608w;
            if (str8 != null) {
                g17 += b36.f.j(17, str8);
            }
            xq3.k kVar2 = this.f537609x;
            return kVar2 != null ? g17 + b36.f.i(18, kVar2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList4.clear();
            this.f537597i.clear();
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            this.f537605t.clear();
            this.f537607v.clear();
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
        xq3.c cVar = (xq3.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cVar.f537592d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    xq3.d dVar = new xq3.d();
                    if (bArr2 != null && bArr2.length > 0) {
                        dVar.mo11468x92b714fd(bArr2);
                    }
                    cVar.f537593e.add(dVar);
                }
                return 0;
            case 3:
                cVar.f537594f = aVar2.g(intValue);
                return 0;
            case 4:
                cVar.f537595g = aVar2.g(intValue);
                return 0;
            case 5:
                cVar.f537596h = aVar2.g(intValue);
                return 0;
            case 6:
                cVar.f537597i.add(aVar2.k(intValue));
                return 0;
            case 7:
                cVar.f537598m = aVar2.k(intValue);
                return 0;
            case 8:
                cVar.f537599n = aVar2.k(intValue);
                return 0;
            case 9:
                cVar.f537600o.add(aVar2.k(intValue));
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    xq3.b bVar = new xq3.b();
                    if (bArr3 != null && bArr3.length > 0) {
                        bVar.mo11468x92b714fd(bArr3);
                    }
                    cVar.f537601p.add(bVar);
                }
                return 0;
            case 11:
                cVar.f537602q.add(aVar2.k(intValue));
                return 0;
            case 12:
                cVar.f537603r = aVar2.g(intValue);
                return 0;
            case 13:
                cVar.f537604s = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    xq3.m mVar = new xq3.m();
                    if (bArr4 != null && bArr4.length > 0) {
                        mVar.mo11468x92b714fd(bArr4);
                    }
                    cVar.f537605t.add(mVar);
                }
                return 0;
            case 15:
                cVar.f537606u = aVar2.g(intValue);
                return 0;
            case 16:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    xq3.a aVar3 = new xq3.a();
                    if (bArr5 != null && bArr5.length > 0) {
                        aVar3.mo11468x92b714fd(bArr5);
                    }
                    cVar.f537607v.add(aVar3);
                }
                return 0;
            case 17:
                cVar.f537608w = aVar2.k(intValue);
                return 0;
            case 18:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j29.get(i29);
                    xq3.k kVar3 = new xq3.k();
                    if (bArr6 != null && bArr6.length > 0) {
                        kVar3.mo11468x92b714fd(bArr6);
                    }
                    cVar.f537609x = kVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
