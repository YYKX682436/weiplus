package r45;

/* loaded from: classes14.dex */
public class vt5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470056d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470057e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f470058f;

    /* renamed from: g, reason: collision with root package name */
    public int f470059g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470060h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f470061i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470062m;

    /* renamed from: n, reason: collision with root package name */
    public long f470063n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f470064o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f470065p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f470066q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vt5)) {
            return false;
        }
        r45.vt5 vt5Var = (r45.vt5) fVar;
        return n51.f.a(this.f470056d, vt5Var.f470056d) && n51.f.a(this.f470057e, vt5Var.f470057e) && n51.f.a(this.f470058f, vt5Var.f470058f) && n51.f.a(java.lang.Integer.valueOf(this.f470059g), java.lang.Integer.valueOf(vt5Var.f470059g)) && n51.f.a(this.f470060h, vt5Var.f470060h) && n51.f.a(this.f470061i, vt5Var.f470061i) && n51.f.a(this.f470062m, vt5Var.f470062m) && n51.f.a(java.lang.Long.valueOf(this.f470063n), java.lang.Long.valueOf(vt5Var.f470063n)) && n51.f.a(this.f470064o, vt5Var.f470064o) && n51.f.a(this.f470065p, vt5Var.f470065p) && n51.f.a(this.f470066q, vt5Var.f470066q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f470056d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f470057e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f470058f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f470059g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470060h;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            java.lang.String str4 = this.f470061i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f470062m;
            if (str5 != null) {
                fVar.j(7, str5);
            }
            fVar.h(8, this.f470063n);
            java.lang.String str6 = this.f470064o;
            if (str6 != null) {
                fVar.j(9, str6);
            }
            java.lang.String str7 = this.f470065p;
            if (str7 != null) {
                fVar.j(10, str7);
            }
            java.lang.String str8 = this.f470066q;
            if (str8 != null) {
                fVar.j(11, str8);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str9 = this.f470056d;
            int j17 = str9 != null ? 0 + b36.f.j(1, str9) : 0;
            java.lang.String str10 = this.f470057e;
            if (str10 != null) {
                j17 += b36.f.j(2, str10);
            }
            java.lang.String str11 = this.f470058f;
            if (str11 != null) {
                j17 += b36.f.j(3, str11);
            }
            int e17 = j17 + b36.f.e(4, this.f470059g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470060h;
            if (gVar2 != null) {
                e17 += b36.f.b(5, gVar2);
            }
            java.lang.String str12 = this.f470061i;
            if (str12 != null) {
                e17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f470062m;
            if (str13 != null) {
                e17 += b36.f.j(7, str13);
            }
            int h17 = e17 + b36.f.h(8, this.f470063n);
            java.lang.String str14 = this.f470064o;
            if (str14 != null) {
                h17 += b36.f.j(9, str14);
            }
            java.lang.String str15 = this.f470065p;
            if (str15 != null) {
                h17 += b36.f.j(10, str15);
            }
            java.lang.String str16 = this.f470066q;
            return str16 != null ? h17 + b36.f.j(11, str16) : h17;
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
        r45.vt5 vt5Var = (r45.vt5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vt5Var.f470056d = aVar2.k(intValue);
                return 0;
            case 2:
                vt5Var.f470057e = aVar2.k(intValue);
                return 0;
            case 3:
                vt5Var.f470058f = aVar2.k(intValue);
                return 0;
            case 4:
                vt5Var.f470059g = aVar2.g(intValue);
                return 0;
            case 5:
                vt5Var.f470060h = aVar2.d(intValue);
                return 0;
            case 6:
                vt5Var.f470061i = aVar2.k(intValue);
                return 0;
            case 7:
                vt5Var.f470062m = aVar2.k(intValue);
                return 0;
            case 8:
                vt5Var.f470063n = aVar2.i(intValue);
                return 0;
            case 9:
                vt5Var.f470064o = aVar2.k(intValue);
                return 0;
            case 10:
                vt5Var.f470065p = aVar2.k(intValue);
                return 0;
            case 11:
                vt5Var.f470066q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
