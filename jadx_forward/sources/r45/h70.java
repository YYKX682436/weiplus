package r45;

/* loaded from: classes10.dex */
public class h70 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public long f457431e;

    /* renamed from: f, reason: collision with root package name */
    public long f457432f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f457433g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457434h;

    /* renamed from: i, reason: collision with root package name */
    public r45.i70 f457435i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f457436m;

    /* renamed from: n, reason: collision with root package name */
    public r45.g70 f457437n;

    /* renamed from: p, reason: collision with root package name */
    public r45.tz6 f457439p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f457440q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f457442s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f457443t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f457445v;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f457430d = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f457438o = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public java.util.LinkedList f457441r = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f457444u = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h70)) {
            return false;
        }
        r45.h70 h70Var = (r45.h70) fVar;
        return n51.f.a(this.f457430d, h70Var.f457430d) && n51.f.a(java.lang.Long.valueOf(this.f457431e), java.lang.Long.valueOf(h70Var.f457431e)) && n51.f.a(java.lang.Long.valueOf(this.f457432f), java.lang.Long.valueOf(h70Var.f457432f)) && n51.f.a(java.lang.Boolean.valueOf(this.f457433g), java.lang.Boolean.valueOf(h70Var.f457433g)) && n51.f.a(this.f457434h, h70Var.f457434h) && n51.f.a(this.f457435i, h70Var.f457435i) && n51.f.a(java.lang.Boolean.valueOf(this.f457436m), java.lang.Boolean.valueOf(h70Var.f457436m)) && n51.f.a(this.f457437n, h70Var.f457437n) && n51.f.a(this.f457438o, h70Var.f457438o) && n51.f.a(this.f457439p, h70Var.f457439p) && n51.f.a(java.lang.Boolean.valueOf(this.f457440q), java.lang.Boolean.valueOf(h70Var.f457440q)) && n51.f.a(this.f457441r, h70Var.f457441r) && n51.f.a(this.f457442s, h70Var.f457442s) && n51.f.a(java.lang.Boolean.valueOf(this.f457443t), java.lang.Boolean.valueOf(h70Var.f457443t)) && n51.f.a(this.f457444u, h70Var.f457444u) && n51.f.a(java.lang.Boolean.valueOf(this.f457445v), java.lang.Boolean.valueOf(h70Var.f457445v));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457444u;
        java.util.LinkedList linkedList2 = this.f457438o;
        java.util.LinkedList linkedList3 = this.f457430d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList3);
            fVar.h(2, this.f457431e);
            fVar.h(3, this.f457432f);
            fVar.a(4, this.f457433g);
            java.lang.String str = this.f457434h;
            if (str != null) {
                fVar.j(5, str);
            }
            r45.i70 i70Var = this.f457435i;
            if (i70Var != null) {
                fVar.i(6, i70Var.mo75928xcd1e8d8());
                this.f457435i.mo75956x3d5d1f78(fVar);
            }
            fVar.a(7, this.f457436m);
            r45.g70 g70Var = this.f457437n;
            if (g70Var != null) {
                fVar.i(8, g70Var.mo75928xcd1e8d8());
                this.f457437n.mo75956x3d5d1f78(fVar);
            }
            fVar.g(9, 8, linkedList2);
            r45.tz6 tz6Var = this.f457439p;
            if (tz6Var != null) {
                fVar.i(10, tz6Var.mo75928xcd1e8d8());
                this.f457439p.mo75956x3d5d1f78(fVar);
            }
            fVar.a(11, this.f457440q);
            fVar.g(12, 8, this.f457441r);
            java.lang.String str2 = this.f457442s;
            if (str2 != null) {
                fVar.j(13, str2);
            }
            fVar.a(14, this.f457443t);
            fVar.g(15, 8, linkedList);
            fVar.a(16, this.f457445v);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList3) + 0 + b36.f.h(2, this.f457431e) + b36.f.h(3, this.f457432f) + b36.f.a(4, this.f457433g);
            java.lang.String str3 = this.f457434h;
            if (str3 != null) {
                g17 += b36.f.j(5, str3);
            }
            r45.i70 i70Var2 = this.f457435i;
            if (i70Var2 != null) {
                g17 += b36.f.i(6, i70Var2.mo75928xcd1e8d8());
            }
            int a17 = g17 + b36.f.a(7, this.f457436m);
            r45.g70 g70Var2 = this.f457437n;
            if (g70Var2 != null) {
                a17 += b36.f.i(8, g70Var2.mo75928xcd1e8d8());
            }
            int g18 = a17 + b36.f.g(9, 8, linkedList2);
            r45.tz6 tz6Var2 = this.f457439p;
            if (tz6Var2 != null) {
                g18 += b36.f.i(10, tz6Var2.mo75928xcd1e8d8());
            }
            int a18 = g18 + b36.f.a(11, this.f457440q) + b36.f.g(12, 8, this.f457441r);
            java.lang.String str4 = this.f457442s;
            if (str4 != null) {
                a18 += b36.f.j(13, str4);
            }
            return a18 + b36.f.a(14, this.f457443t) + b36.f.g(15, 8, linkedList) + b36.f.a(16, this.f457445v);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
            this.f457441r.clear();
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
        r45.h70 h70Var = (r45.h70) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ho6 ho6Var = new r45.ho6();
                    if (bArr2 != null && bArr2.length > 0) {
                        ho6Var.mo11468x92b714fd(bArr2);
                    }
                    h70Var.f457430d.add(ho6Var);
                }
                return 0;
            case 2:
                h70Var.f457431e = aVar2.i(intValue);
                return 0;
            case 3:
                h70Var.f457432f = aVar2.i(intValue);
                return 0;
            case 4:
                h70Var.f457433g = aVar2.c(intValue);
                return 0;
            case 5:
                h70Var.f457434h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.i70 i70Var3 = new r45.i70();
                    if (bArr3 != null && bArr3.length > 0) {
                        i70Var3.mo11468x92b714fd(bArr3);
                    }
                    h70Var.f457435i = i70Var3;
                }
                return 0;
            case 7:
                h70Var.f457436m = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.g70 g70Var3 = new r45.g70();
                    if (bArr4 != null && bArr4.length > 0) {
                        g70Var3.mo11468x92b714fd(bArr4);
                    }
                    h70Var.f457437n = g70Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.ci4 ci4Var = new r45.ci4();
                    if (bArr5 != null && bArr5.length > 0) {
                        ci4Var.mo11468x92b714fd(bArr5);
                    }
                    h70Var.f457438o.add(ci4Var);
                }
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.tz6 tz6Var3 = new r45.tz6();
                    if (bArr6 != null && bArr6.length > 0) {
                        tz6Var3.mo11468x92b714fd(bArr6);
                    }
                    h70Var.f457439p = tz6Var3;
                }
                return 0;
            case 11:
                h70Var.f457440q = aVar2.c(intValue);
                return 0;
            case 12:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.j70 j70Var = new r45.j70();
                    if (bArr7 != null && bArr7.length > 0) {
                        j70Var.mo11468x92b714fd(bArr7);
                    }
                    h70Var.f457441r.add(j70Var);
                }
                return 0;
            case 13:
                h70Var.f457442s = aVar2.k(intValue);
                return 0;
            case 14:
                h70Var.f457443t = aVar2.c(intValue);
                return 0;
            case 15:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    r45.fe6 fe6Var = new r45.fe6();
                    if (bArr8 != null && bArr8.length > 0) {
                        fe6Var.mo11468x92b714fd(bArr8);
                    }
                    h70Var.f457444u.add(fe6Var);
                }
                return 0;
            case 16:
                h70Var.f457445v = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
