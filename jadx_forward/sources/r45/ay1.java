package r45;

/* loaded from: classes10.dex */
public class ay1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451883d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451884e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451885f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451886g;

    /* renamed from: h, reason: collision with root package name */
    public int f451887h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f451888i;

    /* renamed from: m, reason: collision with root package name */
    public int f451889m;

    /* renamed from: n, reason: collision with root package name */
    public int f451890n;

    /* renamed from: o, reason: collision with root package name */
    public int f451891o;

    /* renamed from: p, reason: collision with root package name */
    public r45.gy1 f451892p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f451893q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f451894r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ay1)) {
            return false;
        }
        r45.ay1 ay1Var = (r45.ay1) fVar;
        return n51.f.a(this.f451883d, ay1Var.f451883d) && n51.f.a(this.f451884e, ay1Var.f451884e) && n51.f.a(this.f451885f, ay1Var.f451885f) && n51.f.a(this.f451886g, ay1Var.f451886g) && n51.f.a(java.lang.Integer.valueOf(this.f451887h), java.lang.Integer.valueOf(ay1Var.f451887h)) && n51.f.a(this.f451888i, ay1Var.f451888i) && n51.f.a(java.lang.Integer.valueOf(this.f451889m), java.lang.Integer.valueOf(ay1Var.f451889m)) && n51.f.a(java.lang.Integer.valueOf(this.f451890n), java.lang.Integer.valueOf(ay1Var.f451890n)) && n51.f.a(java.lang.Integer.valueOf(this.f451891o), java.lang.Integer.valueOf(ay1Var.f451891o)) && n51.f.a(this.f451892p, ay1Var.f451892p) && n51.f.a(java.lang.Boolean.valueOf(this.f451893q), java.lang.Boolean.valueOf(ay1Var.f451893q)) && n51.f.a(this.f451894r, ay1Var.f451894r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451883d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f451884e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f451885f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f451886g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.e(5, this.f451887h);
            java.lang.String str5 = this.f451888i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            fVar.e(7, this.f451889m);
            fVar.e(8, this.f451890n);
            fVar.e(9, this.f451891o);
            r45.gy1 gy1Var = this.f451892p;
            if (gy1Var != null) {
                fVar.i(10, gy1Var.mo75928xcd1e8d8());
                this.f451892p.mo75956x3d5d1f78(fVar);
            }
            fVar.a(11, this.f451893q);
            java.lang.String str6 = this.f451894r;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f451883d;
            int j17 = str7 != null ? 0 + b36.f.j(1, str7) : 0;
            java.lang.String str8 = this.f451884e;
            if (str8 != null) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f451885f;
            if (str9 != null) {
                j17 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f451886g;
            if (str10 != null) {
                j17 += b36.f.j(4, str10);
            }
            int e17 = j17 + b36.f.e(5, this.f451887h);
            java.lang.String str11 = this.f451888i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            int e18 = e17 + b36.f.e(7, this.f451889m) + b36.f.e(8, this.f451890n) + b36.f.e(9, this.f451891o);
            r45.gy1 gy1Var2 = this.f451892p;
            if (gy1Var2 != null) {
                e18 += b36.f.i(10, gy1Var2.mo75928xcd1e8d8());
            }
            int a17 = e18 + b36.f.a(11, this.f451893q);
            java.lang.String str12 = this.f451894r;
            return str12 != null ? a17 + b36.f.j(12, str12) : a17;
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
        r45.ay1 ay1Var = (r45.ay1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ay1Var.f451883d = aVar2.k(intValue);
                return 0;
            case 2:
                ay1Var.f451884e = aVar2.k(intValue);
                return 0;
            case 3:
                ay1Var.f451885f = aVar2.k(intValue);
                return 0;
            case 4:
                ay1Var.f451886g = aVar2.k(intValue);
                return 0;
            case 5:
                ay1Var.f451887h = aVar2.g(intValue);
                return 0;
            case 6:
                ay1Var.f451888i = aVar2.k(intValue);
                return 0;
            case 7:
                ay1Var.f451889m = aVar2.g(intValue);
                return 0;
            case 8:
                ay1Var.f451890n = aVar2.g(intValue);
                return 0;
            case 9:
                ay1Var.f451891o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.gy1 gy1Var3 = new r45.gy1();
                    if (bArr != null && bArr.length > 0) {
                        gy1Var3.mo11468x92b714fd(bArr);
                    }
                    ay1Var.f451892p = gy1Var3;
                }
                return 0;
            case 11:
                ay1Var.f451893q = aVar2.c(intValue);
                return 0;
            case 12:
                ay1Var.f451894r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
