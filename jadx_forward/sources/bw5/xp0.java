package bw5;

/* loaded from: classes2.dex */
public class xp0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.yp0 f116761d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f116762e;

    /* renamed from: f, reason: collision with root package name */
    public long f116763f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f116764g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f116765h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f116766i;

    /* renamed from: m, reason: collision with root package name */
    public int f116767m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f116768n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.v60 f116769o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f116770p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f116771q;

    /* renamed from: r, reason: collision with root package name */
    public int f116772r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f116773s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.zp0 f116774t;

    /* renamed from: u, reason: collision with root package name */
    public int f116775u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f116776v = new boolean[16];

    static {
        new bw5.xp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xp0)) {
            return false;
        }
        bw5.xp0 xp0Var = (bw5.xp0) fVar;
        return n51.f.a(this.f116761d, xp0Var.f116761d) && n51.f.a(java.lang.Boolean.valueOf(this.f116762e), java.lang.Boolean.valueOf(xp0Var.f116762e)) && n51.f.a(java.lang.Long.valueOf(this.f116763f), java.lang.Long.valueOf(xp0Var.f116763f)) && n51.f.a(java.lang.Boolean.valueOf(this.f116764g), java.lang.Boolean.valueOf(xp0Var.f116764g)) && n51.f.a(java.lang.Boolean.valueOf(this.f116765h), java.lang.Boolean.valueOf(xp0Var.f116765h)) && n51.f.a(java.lang.Boolean.valueOf(this.f116766i), java.lang.Boolean.valueOf(xp0Var.f116766i)) && n51.f.a(java.lang.Integer.valueOf(this.f116767m), java.lang.Integer.valueOf(xp0Var.f116767m)) && n51.f.a(this.f116768n, xp0Var.f116768n) && n51.f.a(this.f116769o, xp0Var.f116769o) && n51.f.a(this.f116770p, xp0Var.f116770p) && n51.f.a(this.f116771q, xp0Var.f116771q) && n51.f.a(java.lang.Integer.valueOf(this.f116772r), java.lang.Integer.valueOf(xp0Var.f116772r)) && n51.f.a(java.lang.Boolean.valueOf(this.f116773s), java.lang.Boolean.valueOf(xp0Var.f116773s)) && n51.f.a(this.f116774t, xp0Var.f116774t) && n51.f.a(java.lang.Integer.valueOf(this.f116775u), java.lang.Integer.valueOf(xp0Var.f116775u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.xp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f116776v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.yp0 yp0Var = this.f116761d;
            if (yp0Var != null && zArr[1]) {
                fVar.e(1, yp0Var.f117140d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f116762e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f116763f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f116764g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f116765h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f116766i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f116767m);
            }
            java.lang.String str = this.f116768n;
            if (str != null && zArr[8]) {
                fVar.j(8, str);
            }
            bw5.v60 v60Var = this.f116769o;
            if (v60Var != null && zArr[9]) {
                fVar.i(9, v60Var.mo75928xcd1e8d8());
                this.f116769o.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f116770p;
            if (str2 != null && zArr[10]) {
                fVar.j(10, str2);
            }
            java.lang.String str3 = this.f116771q;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            if (zArr[12]) {
                fVar.e(12, this.f116772r);
            }
            if (zArr[13]) {
                fVar.a(13, this.f116773s);
            }
            bw5.zp0 zp0Var = this.f116774t;
            if (zp0Var != null && zArr[14]) {
                fVar.i(14, zp0Var.mo75928xcd1e8d8());
                this.f116774t.mo75956x3d5d1f78(fVar);
            }
            if (zArr[15]) {
                fVar.e(15, this.f116775u);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.yp0 yp0Var2 = this.f116761d;
            if (yp0Var2 != null && zArr[1]) {
                i18 = b36.f.e(1, yp0Var2.f117140d) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f116762e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f116763f);
            }
            if (zArr[4]) {
                i18 += b36.f.a(4, this.f116764g);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f116765h);
            }
            if (zArr[6]) {
                i18 += b36.f.a(6, this.f116766i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f116767m);
            }
            java.lang.String str4 = this.f116768n;
            if (str4 != null && zArr[8]) {
                i18 += b36.f.j(8, str4);
            }
            bw5.v60 v60Var2 = this.f116769o;
            if (v60Var2 != null && zArr[9]) {
                i18 += b36.f.i(9, v60Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f116770p;
            if (str5 != null && zArr[10]) {
                i18 += b36.f.j(10, str5);
            }
            java.lang.String str6 = this.f116771q;
            if (str6 != null && zArr[11]) {
                i18 += b36.f.j(11, str6);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f116772r);
            }
            if (zArr[13]) {
                i18 += b36.f.a(13, this.f116773s);
            }
            bw5.zp0 zp0Var2 = this.f116774t;
            if (zp0Var2 != null && zArr[14]) {
                i18 += b36.f.i(14, zp0Var2.mo75928xcd1e8d8());
            }
            return zArr[15] ? i18 + b36.f.e(15, this.f116775u) : i18;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                int g17 = aVar2.g(intValue);
                this.f116761d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? g17 != 4 ? null : bw5.yp0.TingMusicSquareFetchDataReason_ClickErrorTips : bw5.yp0.TingMusicSquareFetchDataReason_PullDown : bw5.yp0.TingMusicSquareFetchDataReason_Reddot : bw5.yp0.TingMusicSquareFetchDataReason_Init : bw5.yp0.TingMusicSquareFetchDataReason_None;
                zArr[1] = true;
                return 0;
            case 2:
                this.f116762e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f116763f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116764g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116765h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116766i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f116767m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f116768n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.v60 v60Var3 = new bw5.v60();
                    if (bArr != null && bArr.length > 0) {
                        v60Var3.mo11468x92b714fd(bArr);
                    }
                    this.f116769o = v60Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f116770p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f116771q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f116772r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f116773s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.zp0 zp0Var3 = new bw5.zp0();
                    if (bArr2 != null && bArr2.length > 0) {
                        zp0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f116774t = zp0Var3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                this.f116775u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.xp0) super.mo11468x92b714fd(bArr);
    }
}
