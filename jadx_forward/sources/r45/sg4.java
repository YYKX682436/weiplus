package r45;

/* loaded from: classes2.dex */
public class sg4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467227d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467228e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467229f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467230g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467231h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f467232i;

    /* renamed from: m, reason: collision with root package name */
    public int f467233m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f467234n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f467235o;

    /* renamed from: p, reason: collision with root package name */
    public int f467236p;

    /* renamed from: q, reason: collision with root package name */
    public int f467237q;

    /* renamed from: r, reason: collision with root package name */
    public int f467238r;

    /* renamed from: s, reason: collision with root package name */
    public int f467239s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f467240t;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sg4)) {
            return false;
        }
        r45.sg4 sg4Var = (r45.sg4) fVar;
        return n51.f.a(this.f467227d, sg4Var.f467227d) && n51.f.a(this.f467228e, sg4Var.f467228e) && n51.f.a(this.f467229f, sg4Var.f467229f) && n51.f.a(this.f467230g, sg4Var.f467230g) && n51.f.a(this.f467231h, sg4Var.f467231h) && n51.f.a(this.f467232i, sg4Var.f467232i) && n51.f.a(java.lang.Integer.valueOf(this.f467233m), java.lang.Integer.valueOf(sg4Var.f467233m)) && n51.f.a(this.f467234n, sg4Var.f467234n) && n51.f.a(java.lang.Boolean.valueOf(this.f467235o), java.lang.Boolean.valueOf(sg4Var.f467235o)) && n51.f.a(java.lang.Integer.valueOf(this.f467236p), java.lang.Integer.valueOf(sg4Var.f467236p)) && n51.f.a(java.lang.Integer.valueOf(this.f467237q), java.lang.Integer.valueOf(sg4Var.f467237q)) && n51.f.a(java.lang.Integer.valueOf(this.f467238r), java.lang.Integer.valueOf(sg4Var.f467238r)) && n51.f.a(java.lang.Integer.valueOf(this.f467239s), java.lang.Integer.valueOf(sg4Var.f467239s)) && n51.f.a(java.lang.Boolean.valueOf(this.f467240t), java.lang.Boolean.valueOf(sg4Var.f467240t));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467227d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467228e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f467229f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f467230g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f467231h;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f467232i;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.e(8, this.f467233m);
            java.lang.String str7 = this.f467234n;
            if (str7 != null) {
                fVar.j(9, str7);
            }
            fVar.a(10, this.f467235o);
            fVar.e(11, this.f467236p);
            fVar.e(12, this.f467237q);
            fVar.e(13, this.f467238r);
            fVar.e(14, this.f467239s);
            fVar.a(15, this.f467240t);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f467227d;
            int j17 = str8 != null ? b36.f.j(1, str8) + 0 : 0;
            java.lang.String str9 = this.f467228e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            java.lang.String str10 = this.f467229f;
            if (str10 != null) {
                j17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f467230g;
            if (str11 != null) {
                j17 += b36.f.j(5, str11);
            }
            java.lang.String str12 = this.f467231h;
            if (str12 != null) {
                j17 += b36.f.j(6, str12);
            }
            java.lang.String str13 = this.f467232i;
            if (str13 != null) {
                j17 += b36.f.j(7, str13);
            }
            int e17 = j17 + b36.f.e(8, this.f467233m);
            java.lang.String str14 = this.f467234n;
            if (str14 != null) {
                e17 += b36.f.j(9, str14);
            }
            return e17 + b36.f.a(10, this.f467235o) + b36.f.e(11, this.f467236p) + b36.f.e(12, this.f467237q) + b36.f.e(13, this.f467238r) + b36.f.e(14, this.f467239s) + b36.f.a(15, this.f467240t);
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
        r45.sg4 sg4Var = (r45.sg4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sg4Var.f467227d = aVar2.k(intValue);
                return 0;
            case 2:
                sg4Var.f467228e = aVar2.k(intValue);
                return 0;
            case 3:
                sg4Var.f467229f = aVar2.k(intValue);
                return 0;
            case 4:
            default:
                return -1;
            case 5:
                sg4Var.f467230g = aVar2.k(intValue);
                return 0;
            case 6:
                sg4Var.f467231h = aVar2.k(intValue);
                return 0;
            case 7:
                sg4Var.f467232i = aVar2.k(intValue);
                return 0;
            case 8:
                sg4Var.f467233m = aVar2.g(intValue);
                return 0;
            case 9:
                sg4Var.f467234n = aVar2.k(intValue);
                return 0;
            case 10:
                sg4Var.f467235o = aVar2.c(intValue);
                return 0;
            case 11:
                sg4Var.f467236p = aVar2.g(intValue);
                return 0;
            case 12:
                sg4Var.f467237q = aVar2.g(intValue);
                return 0;
            case 13:
                sg4Var.f467238r = aVar2.g(intValue);
                return 0;
            case 14:
                sg4Var.f467239s = aVar2.g(intValue);
                return 0;
            case 15:
                sg4Var.f467240t = aVar2.c(intValue);
                return 0;
        }
    }
}
