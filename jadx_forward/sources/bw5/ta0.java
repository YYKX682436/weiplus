package bw5;

/* loaded from: classes2.dex */
public class ta0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114861d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f114862e;

    /* renamed from: f, reason: collision with root package name */
    public long f114863f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f114864g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.mc0 f114865h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f114866i;

    /* renamed from: m, reason: collision with root package name */
    public int f114867m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f114868n;

    /* renamed from: o, reason: collision with root package name */
    public long f114869o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f114870p;

    /* renamed from: q, reason: collision with root package name */
    public int f114871q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f114872r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f114873s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f114874t;

    /* renamed from: u, reason: collision with root package name */
    public int f114875u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f114876v = new boolean[16];

    static {
        new bw5.ta0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ta0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ta0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ta0)) {
            return false;
        }
        bw5.ta0 ta0Var = (bw5.ta0) fVar;
        return n51.f.a(this.f114861d, ta0Var.f114861d) && n51.f.a(java.lang.Boolean.valueOf(this.f114862e), java.lang.Boolean.valueOf(ta0Var.f114862e)) && n51.f.a(java.lang.Long.valueOf(this.f114863f), java.lang.Long.valueOf(ta0Var.f114863f)) && n51.f.a(this.f114864g, ta0Var.f114864g) && n51.f.a(this.f114865h, ta0Var.f114865h) && n51.f.a(java.lang.Boolean.valueOf(this.f114866i), java.lang.Boolean.valueOf(ta0Var.f114866i)) && n51.f.a(java.lang.Integer.valueOf(this.f114867m), java.lang.Integer.valueOf(ta0Var.f114867m)) && n51.f.a(this.f114868n, ta0Var.f114868n) && n51.f.a(java.lang.Long.valueOf(this.f114869o), java.lang.Long.valueOf(ta0Var.f114869o)) && n51.f.a(java.lang.Boolean.valueOf(this.f114870p), java.lang.Boolean.valueOf(ta0Var.f114870p)) && n51.f.a(java.lang.Integer.valueOf(this.f114871q), java.lang.Integer.valueOf(ta0Var.f114871q)) && n51.f.a(this.f114872r, ta0Var.f114872r) && n51.f.a(java.lang.Boolean.valueOf(this.f114873s), java.lang.Boolean.valueOf(ta0Var.f114873s)) && n51.f.a(this.f114874t, ta0Var.f114874t) && n51.f.a(java.lang.Integer.valueOf(this.f114875u), java.lang.Integer.valueOf(ta0Var.f114875u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ta0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f114876v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114861d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f114862e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f114863f);
            }
            java.lang.String str2 = this.f114864g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            bw5.mc0 mc0Var = this.f114865h;
            if (mc0Var != null && zArr[5]) {
                fVar.i(5, mc0Var.mo75928xcd1e8d8());
                this.f114865h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.a(6, this.f114866i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f114867m);
            }
            java.lang.String str3 = this.f114868n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            if (zArr[9]) {
                fVar.h(9, this.f114869o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f114870p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f114871q);
            }
            java.lang.String str4 = this.f114872r;
            if (str4 != null && zArr[12]) {
                fVar.j(12, str4);
            }
            if (zArr[13]) {
                fVar.a(13, this.f114873s);
            }
            java.lang.String str5 = this.f114874t;
            if (str5 != null && zArr[14]) {
                fVar.j(14, str5);
            }
            if (zArr[15]) {
                fVar.e(15, this.f114875u);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f114861d;
            if (str6 != null && zArr[1]) {
                i18 = b36.f.j(1, str6) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f114862e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f114863f);
            }
            java.lang.String str7 = this.f114864g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            bw5.mc0 mc0Var2 = this.f114865h;
            if (mc0Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, mc0Var2.mo75928xcd1e8d8());
            }
            if (zArr[6]) {
                i18 += b36.f.a(6, this.f114866i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f114867m);
            }
            java.lang.String str8 = this.f114868n;
            if (str8 != null && zArr[8]) {
                i18 += b36.f.j(8, str8);
            }
            if (zArr[9]) {
                i18 += b36.f.h(9, this.f114869o);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f114870p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f114871q);
            }
            java.lang.String str9 = this.f114872r;
            if (str9 != null && zArr[12]) {
                i18 += b36.f.j(12, str9);
            }
            if (zArr[13]) {
                i18 += b36.f.a(13, this.f114873s);
            }
            java.lang.String str10 = this.f114874t;
            if (str10 != null && zArr[14]) {
                i18 += b36.f.j(14, str10);
            }
            return zArr[15] ? i18 + b36.f.e(15, this.f114875u) : i18;
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
                this.f114861d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f114862e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f114863f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114864g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mc0 mc0Var3 = new bw5.mc0();
                    if (bArr != null && bArr.length > 0) {
                        mc0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f114865h = mc0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f114866i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f114867m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f114868n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f114869o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f114870p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f114871q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f114872r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f114873s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f114874t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f114875u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
