package r45;

/* loaded from: classes11.dex */
public class hk extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457754d;

    /* renamed from: e, reason: collision with root package name */
    public int f457755e;

    /* renamed from: f, reason: collision with root package name */
    public int f457756f;

    /* renamed from: g, reason: collision with root package name */
    public int f457757g;

    /* renamed from: h, reason: collision with root package name */
    public int f457758h;

    /* renamed from: i, reason: collision with root package name */
    public long f457759i;

    /* renamed from: m, reason: collision with root package name */
    public long f457760m;

    /* renamed from: n, reason: collision with root package name */
    public int f457761n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f457762o;

    /* renamed from: p, reason: collision with root package name */
    public int f457763p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f457764q;

    /* renamed from: r, reason: collision with root package name */
    public r45.ud f457765r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f457766s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ry f457767t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f457769v;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f457771x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f457772y;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f457768u = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f457770w = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hk)) {
            return false;
        }
        r45.hk hkVar = (r45.hk) fVar;
        return n51.f.a(this.f457754d, hkVar.f457754d) && n51.f.a(java.lang.Integer.valueOf(this.f457755e), java.lang.Integer.valueOf(hkVar.f457755e)) && n51.f.a(java.lang.Integer.valueOf(this.f457756f), java.lang.Integer.valueOf(hkVar.f457756f)) && n51.f.a(java.lang.Integer.valueOf(this.f457757g), java.lang.Integer.valueOf(hkVar.f457757g)) && n51.f.a(java.lang.Integer.valueOf(this.f457758h), java.lang.Integer.valueOf(hkVar.f457758h)) && n51.f.a(java.lang.Long.valueOf(this.f457759i), java.lang.Long.valueOf(hkVar.f457759i)) && n51.f.a(java.lang.Long.valueOf(this.f457760m), java.lang.Long.valueOf(hkVar.f457760m)) && n51.f.a(java.lang.Integer.valueOf(this.f457761n), java.lang.Integer.valueOf(hkVar.f457761n)) && n51.f.a(java.lang.Boolean.valueOf(this.f457762o), java.lang.Boolean.valueOf(hkVar.f457762o)) && n51.f.a(java.lang.Integer.valueOf(this.f457763p), java.lang.Integer.valueOf(hkVar.f457763p)) && n51.f.a(java.lang.Boolean.valueOf(this.f457764q), java.lang.Boolean.valueOf(hkVar.f457764q)) && n51.f.a(this.f457765r, hkVar.f457765r) && n51.f.a(java.lang.Boolean.valueOf(this.f457766s), java.lang.Boolean.valueOf(hkVar.f457766s)) && n51.f.a(this.f457767t, hkVar.f457767t) && n51.f.a(this.f457768u, hkVar.f457768u) && n51.f.a(java.lang.Boolean.valueOf(this.f457769v), java.lang.Boolean.valueOf(hkVar.f457769v)) && n51.f.a(this.f457770w, hkVar.f457770w) && n51.f.a(this.f457771x, hkVar.f457771x) && n51.f.a(this.f457772y, hkVar.f457772y);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457770w;
        java.util.LinkedList linkedList2 = this.f457768u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f457754d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f457755e);
            fVar.e(3, this.f457756f);
            fVar.e(4, this.f457757g);
            fVar.e(5, this.f457758h);
            fVar.h(6, this.f457759i);
            fVar.h(7, this.f457760m);
            fVar.e(8, this.f457761n);
            fVar.a(9, this.f457762o);
            fVar.e(10, this.f457763p);
            fVar.a(11, this.f457764q);
            r45.ud udVar = this.f457765r;
            if (udVar != null) {
                fVar.i(12, udVar.mo75928xcd1e8d8());
                this.f457765r.mo75956x3d5d1f78(fVar);
            }
            fVar.a(13, this.f457766s);
            r45.ry ryVar = this.f457767t;
            if (ryVar != null) {
                fVar.i(14, ryVar.mo75928xcd1e8d8());
                this.f457767t.mo75956x3d5d1f78(fVar);
            }
            fVar.g(15, 8, linkedList2);
            fVar.a(16, this.f457769v);
            fVar.g(17, 1, linkedList);
            java.lang.String str2 = this.f457771x;
            if (str2 != null) {
                fVar.j(18, str2);
            }
            java.lang.String str3 = this.f457772y;
            if (str3 != null) {
                fVar.j(19, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f457754d;
            int j17 = (str4 != null ? b36.f.j(1, str4) + 0 : 0) + b36.f.e(2, this.f457755e) + b36.f.e(3, this.f457756f) + b36.f.e(4, this.f457757g) + b36.f.e(5, this.f457758h) + b36.f.h(6, this.f457759i) + b36.f.h(7, this.f457760m) + b36.f.e(8, this.f457761n) + b36.f.a(9, this.f457762o) + b36.f.e(10, this.f457763p) + b36.f.a(11, this.f457764q);
            r45.ud udVar2 = this.f457765r;
            if (udVar2 != null) {
                j17 += b36.f.i(12, udVar2.mo75928xcd1e8d8());
            }
            int a17 = j17 + b36.f.a(13, this.f457766s);
            r45.ry ryVar2 = this.f457767t;
            if (ryVar2 != null) {
                a17 += b36.f.i(14, ryVar2.mo75928xcd1e8d8());
            }
            int g17 = a17 + b36.f.g(15, 8, linkedList2) + b36.f.a(16, this.f457769v) + b36.f.g(17, 1, linkedList);
            java.lang.String str5 = this.f457771x;
            if (str5 != null) {
                g17 += b36.f.j(18, str5);
            }
            java.lang.String str6 = this.f457772y;
            return str6 != null ? g17 + b36.f.j(19, str6) : g17;
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
        r45.hk hkVar = (r45.hk) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hkVar.f457754d = aVar2.k(intValue);
                return 0;
            case 2:
                hkVar.f457755e = aVar2.g(intValue);
                return 0;
            case 3:
                hkVar.f457756f = aVar2.g(intValue);
                return 0;
            case 4:
                hkVar.f457757g = aVar2.g(intValue);
                return 0;
            case 5:
                hkVar.f457758h = aVar2.g(intValue);
                return 0;
            case 6:
                hkVar.f457759i = aVar2.i(intValue);
                return 0;
            case 7:
                hkVar.f457760m = aVar2.i(intValue);
                return 0;
            case 8:
                hkVar.f457761n = aVar2.g(intValue);
                return 0;
            case 9:
                hkVar.f457762o = aVar2.c(intValue);
                return 0;
            case 10:
                hkVar.f457763p = aVar2.g(intValue);
                return 0;
            case 11:
                hkVar.f457764q = aVar2.c(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.ud udVar3 = new r45.ud();
                    if (bArr2 != null && bArr2.length > 0) {
                        udVar3.mo11468x92b714fd(bArr2);
                    }
                    hkVar.f457765r = udVar3;
                }
                return 0;
            case 13:
                hkVar.f457766s = aVar2.c(intValue);
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.ry ryVar3 = new r45.ry();
                    if (bArr3 != null && bArr3.length > 0) {
                        ryVar3.mo11468x92b714fd(bArr3);
                    }
                    hkVar.f457767t = ryVar3;
                }
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.d67 d67Var = new r45.d67();
                    if (bArr4 != null && bArr4.length > 0) {
                        d67Var.mo11468x92b714fd(bArr4);
                    }
                    hkVar.f457768u.add(d67Var);
                }
                return 0;
            case 16:
                hkVar.f457769v = aVar2.c(intValue);
                return 0;
            case 17:
                hkVar.f457770w.add(aVar2.k(intValue));
                return 0;
            case 18:
                hkVar.f457771x = aVar2.k(intValue);
                return 0;
            case 19:
                hkVar.f457772y = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
