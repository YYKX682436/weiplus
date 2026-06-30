package p33;

/* loaded from: classes8.dex */
public class l extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f433135d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f433136e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f433137f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f433138g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f433139h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f433140i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f433141m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f433142n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f433143o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public long f433144p;

    /* renamed from: q, reason: collision with root package name */
    public long f433145q;

    /* renamed from: r, reason: collision with root package name */
    public long f433146r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f433147s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f433148t;

    /* renamed from: u, reason: collision with root package name */
    public int f433149u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f433150v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f433151w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f433152x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f433153y;

    /* renamed from: z, reason: collision with root package name */
    public p33.g0 f433154z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p33.l)) {
            return false;
        }
        p33.l lVar = (p33.l) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f433135d), java.lang.Boolean.valueOf(lVar.f433135d)) && n51.f.a(java.lang.Boolean.valueOf(this.f433136e), java.lang.Boolean.valueOf(lVar.f433136e)) && n51.f.a(java.lang.Boolean.valueOf(this.f433137f), java.lang.Boolean.valueOf(lVar.f433137f)) && n51.f.a(this.f433138g, lVar.f433138g) && n51.f.a(this.f433139h, lVar.f433139h) && n51.f.a(this.f433140i, lVar.f433140i) && n51.f.a(this.f433141m, lVar.f433141m) && n51.f.a(this.f433142n, lVar.f433142n) && n51.f.a(this.f433143o, lVar.f433143o) && n51.f.a(java.lang.Long.valueOf(this.f433144p), java.lang.Long.valueOf(lVar.f433144p)) && n51.f.a(java.lang.Long.valueOf(this.f433145q), java.lang.Long.valueOf(lVar.f433145q)) && n51.f.a(java.lang.Long.valueOf(this.f433146r), java.lang.Long.valueOf(lVar.f433146r)) && n51.f.a(this.f433147s, lVar.f433147s) && n51.f.a(this.f433148t, lVar.f433148t) && n51.f.a(java.lang.Integer.valueOf(this.f433149u), java.lang.Integer.valueOf(lVar.f433149u)) && n51.f.a(this.f433150v, lVar.f433150v) && n51.f.a(this.f433151w, lVar.f433151w) && n51.f.a(this.f433152x, lVar.f433152x) && n51.f.a(this.f433153y, lVar.f433153y) && n51.f.a(this.f433154z, lVar.f433154z);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f433135d);
            fVar.a(2, this.f433136e);
            fVar.a(3, this.f433137f);
            java.lang.String str = this.f433138g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f433139h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f433140i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f433141m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f433142n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.g(9, 8, this.f433143o);
            fVar.h(10, this.f433144p);
            fVar.h(11, this.f433145q);
            fVar.h(12, this.f433146r);
            java.lang.String str6 = this.f433147s;
            if (str6 != null) {
                fVar.j(13, str6);
            }
            java.lang.String str7 = this.f433148t;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            fVar.e(15, this.f433149u);
            java.lang.String str8 = this.f433150v;
            if (str8 != null) {
                fVar.j(16, str8);
            }
            java.lang.String str9 = this.f433151w;
            if (str9 != null) {
                fVar.j(17, str9);
            }
            java.lang.String str10 = this.f433152x;
            if (str10 != null) {
                fVar.j(18, str10);
            }
            java.lang.String str11 = this.f433153y;
            if (str11 != null) {
                fVar.j(19, str11);
            }
            p33.g0 g0Var = this.f433154z;
            if (g0Var != null) {
                fVar.i(20, g0Var.mo75928xcd1e8d8());
                this.f433154z.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f433135d) + 0 + b36.f.a(2, this.f433136e) + b36.f.a(3, this.f433137f);
            java.lang.String str12 = this.f433138g;
            if (str12 != null) {
                a17 += b36.f.j(4, str12);
            }
            java.lang.String str13 = this.f433139h;
            if (str13 != null) {
                a17 += b36.f.j(5, str13);
            }
            java.lang.String str14 = this.f433140i;
            if (str14 != null) {
                a17 += b36.f.j(6, str14);
            }
            java.lang.String str15 = this.f433141m;
            if (str15 != null) {
                a17 += b36.f.j(7, str15);
            }
            java.lang.String str16 = this.f433142n;
            if (str16 != null) {
                a17 += b36.f.j(8, str16);
            }
            int g17 = a17 + b36.f.g(9, 8, this.f433143o) + b36.f.h(10, this.f433144p) + b36.f.h(11, this.f433145q) + b36.f.h(12, this.f433146r);
            java.lang.String str17 = this.f433147s;
            if (str17 != null) {
                g17 += b36.f.j(13, str17);
            }
            java.lang.String str18 = this.f433148t;
            if (str18 != null) {
                g17 += b36.f.j(14, str18);
            }
            int e17 = g17 + b36.f.e(15, this.f433149u);
            java.lang.String str19 = this.f433150v;
            if (str19 != null) {
                e17 += b36.f.j(16, str19);
            }
            java.lang.String str20 = this.f433151w;
            if (str20 != null) {
                e17 += b36.f.j(17, str20);
            }
            java.lang.String str21 = this.f433152x;
            if (str21 != null) {
                e17 += b36.f.j(18, str21);
            }
            java.lang.String str22 = this.f433153y;
            if (str22 != null) {
                e17 += b36.f.j(19, str22);
            }
            p33.g0 g0Var2 = this.f433154z;
            return g0Var2 != null ? e17 + b36.f.i(20, g0Var2.mo75928xcd1e8d8()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f433143o.clear();
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
        p33.l lVar = (p33.l) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lVar.f433135d = aVar2.c(intValue);
                return 0;
            case 2:
                lVar.f433136e = aVar2.c(intValue);
                return 0;
            case 3:
                lVar.f433137f = aVar2.c(intValue);
                return 0;
            case 4:
                lVar.f433138g = aVar2.k(intValue);
                return 0;
            case 5:
                lVar.f433139h = aVar2.k(intValue);
                return 0;
            case 6:
                lVar.f433140i = aVar2.k(intValue);
                return 0;
            case 7:
                lVar.f433141m = aVar2.k(intValue);
                return 0;
            case 8:
                lVar.f433142n = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    p33.c0 c0Var = new p33.c0();
                    if (bArr2 != null && bArr2.length > 0) {
                        c0Var.mo11468x92b714fd(bArr2);
                    }
                    lVar.f433143o.add(c0Var);
                }
                return 0;
            case 10:
                lVar.f433144p = aVar2.i(intValue);
                return 0;
            case 11:
                lVar.f433145q = aVar2.i(intValue);
                return 0;
            case 12:
                lVar.f433146r = aVar2.i(intValue);
                return 0;
            case 13:
                lVar.f433147s = aVar2.k(intValue);
                return 0;
            case 14:
                lVar.f433148t = aVar2.k(intValue);
                return 0;
            case 15:
                lVar.f433149u = aVar2.g(intValue);
                return 0;
            case 16:
                lVar.f433150v = aVar2.k(intValue);
                return 0;
            case 17:
                lVar.f433151w = aVar2.k(intValue);
                return 0;
            case 18:
                lVar.f433152x = aVar2.k(intValue);
                return 0;
            case 19:
                lVar.f433153y = aVar2.k(intValue);
                return 0;
            case 20:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    p33.g0 g0Var3 = new p33.g0();
                    if (bArr3 != null && bArr3.length > 0) {
                        g0Var3.mo11468x92b714fd(bArr3);
                    }
                    lVar.f433154z = g0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
