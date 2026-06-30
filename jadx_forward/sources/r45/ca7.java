package r45;

/* loaded from: classes2.dex */
public class ca7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452937d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f452938e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452939f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452940g;

    /* renamed from: h, reason: collision with root package name */
    public int f452941h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452942i;

    /* renamed from: m, reason: collision with root package name */
    public long f452943m;

    /* renamed from: n, reason: collision with root package name */
    public int f452944n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f452945o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f452946p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f452947q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f452948r;

    /* renamed from: s, reason: collision with root package name */
    public long f452949s;

    /* renamed from: t, reason: collision with root package name */
    public int f452950t;

    /* renamed from: u, reason: collision with root package name */
    public int f452951u;

    /* renamed from: v, reason: collision with root package name */
    public int f452952v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f452953w;

    /* renamed from: x, reason: collision with root package name */
    public float f452954x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f452955y;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ca7)) {
            return false;
        }
        r45.ca7 ca7Var = (r45.ca7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452937d), java.lang.Integer.valueOf(ca7Var.f452937d)) && n51.f.a(java.lang.Integer.valueOf(this.f452938e), java.lang.Integer.valueOf(ca7Var.f452938e)) && n51.f.a(this.f452939f, ca7Var.f452939f) && n51.f.a(this.f452940g, ca7Var.f452940g) && n51.f.a(java.lang.Integer.valueOf(this.f452941h), java.lang.Integer.valueOf(ca7Var.f452941h)) && n51.f.a(this.f452942i, ca7Var.f452942i) && n51.f.a(java.lang.Long.valueOf(this.f452943m), java.lang.Long.valueOf(ca7Var.f452943m)) && n51.f.a(java.lang.Integer.valueOf(this.f452944n), java.lang.Integer.valueOf(ca7Var.f452944n)) && n51.f.a(this.f452945o, ca7Var.f452945o) && n51.f.a(this.f452946p, ca7Var.f452946p) && n51.f.a(this.f452947q, ca7Var.f452947q) && n51.f.a(this.f452948r, ca7Var.f452948r) && n51.f.a(java.lang.Long.valueOf(this.f452949s), java.lang.Long.valueOf(ca7Var.f452949s)) && n51.f.a(java.lang.Integer.valueOf(this.f452950t), java.lang.Integer.valueOf(ca7Var.f452950t)) && n51.f.a(java.lang.Integer.valueOf(this.f452951u), java.lang.Integer.valueOf(ca7Var.f452951u)) && n51.f.a(java.lang.Integer.valueOf(this.f452952v), java.lang.Integer.valueOf(ca7Var.f452952v)) && n51.f.a(this.f452953w, ca7Var.f452953w) && n51.f.a(java.lang.Float.valueOf(this.f452954x), java.lang.Float.valueOf(ca7Var.f452954x)) && n51.f.a(this.f452955y, ca7Var.f452955y);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452937d);
            fVar.e(2, this.f452938e);
            java.lang.String str = this.f452939f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f452940g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f452941h);
            java.lang.String str3 = this.f452942i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.h(7, this.f452943m);
            fVar.e(8, this.f452944n);
            java.lang.String str4 = this.f452945o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f452946p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f452947q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f452948r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            fVar.h(13, this.f452949s);
            fVar.e(14, this.f452950t);
            fVar.e(15, this.f452951u);
            fVar.e(16, this.f452952v);
            java.lang.String str8 = this.f452953w;
            if (str8 != null) {
                fVar.j(17, str8);
            }
            fVar.d(18, this.f452954x);
            java.lang.String str9 = this.f452955y;
            if (str9 != null) {
                fVar.j(19, str9);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452937d) + 0 + b36.f.e(2, this.f452938e);
            java.lang.String str10 = this.f452939f;
            if (str10 != null) {
                e17 += b36.f.j(3, str10);
            }
            java.lang.String str11 = this.f452940g;
            if (str11 != null) {
                e17 += b36.f.j(4, str11);
            }
            int e18 = e17 + b36.f.e(5, this.f452941h);
            java.lang.String str12 = this.f452942i;
            if (str12 != null) {
                e18 += b36.f.j(6, str12);
            }
            int h17 = e18 + b36.f.h(7, this.f452943m) + b36.f.e(8, this.f452944n);
            java.lang.String str13 = this.f452945o;
            if (str13 != null) {
                h17 += b36.f.j(9, str13);
            }
            java.lang.String str14 = this.f452946p;
            if (str14 != null) {
                h17 += b36.f.j(10, str14);
            }
            java.lang.String str15 = this.f452947q;
            if (str15 != null) {
                h17 += b36.f.j(11, str15);
            }
            java.lang.String str16 = this.f452948r;
            if (str16 != null) {
                h17 += b36.f.j(12, str16);
            }
            int h18 = h17 + b36.f.h(13, this.f452949s) + b36.f.e(14, this.f452950t) + b36.f.e(15, this.f452951u) + b36.f.e(16, this.f452952v);
            java.lang.String str17 = this.f452953w;
            if (str17 != null) {
                h18 += b36.f.j(17, str17);
            }
            int d17 = h18 + b36.f.d(18, this.f452954x);
            java.lang.String str18 = this.f452955y;
            return str18 != null ? d17 + b36.f.j(19, str18) : d17;
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
        r45.ca7 ca7Var = (r45.ca7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ca7Var.f452937d = aVar2.g(intValue);
                return 0;
            case 2:
                ca7Var.f452938e = aVar2.g(intValue);
                return 0;
            case 3:
                ca7Var.f452939f = aVar2.k(intValue);
                return 0;
            case 4:
                ca7Var.f452940g = aVar2.k(intValue);
                return 0;
            case 5:
                ca7Var.f452941h = aVar2.g(intValue);
                return 0;
            case 6:
                ca7Var.f452942i = aVar2.k(intValue);
                return 0;
            case 7:
                ca7Var.f452943m = aVar2.i(intValue);
                return 0;
            case 8:
                ca7Var.f452944n = aVar2.g(intValue);
                return 0;
            case 9:
                ca7Var.f452945o = aVar2.k(intValue);
                return 0;
            case 10:
                ca7Var.f452946p = aVar2.k(intValue);
                return 0;
            case 11:
                ca7Var.f452947q = aVar2.k(intValue);
                return 0;
            case 12:
                ca7Var.f452948r = aVar2.k(intValue);
                return 0;
            case 13:
                ca7Var.f452949s = aVar2.i(intValue);
                return 0;
            case 14:
                ca7Var.f452950t = aVar2.g(intValue);
                return 0;
            case 15:
                ca7Var.f452951u = aVar2.g(intValue);
                return 0;
            case 16:
                ca7Var.f452952v = aVar2.g(intValue);
                return 0;
            case 17:
                ca7Var.f452953w = aVar2.k(intValue);
                return 0;
            case 18:
                ca7Var.f452954x = aVar2.f(intValue);
                return 0;
            case 19:
                ca7Var.f452955y = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
