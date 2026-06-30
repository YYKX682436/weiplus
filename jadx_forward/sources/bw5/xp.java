package bw5;

/* loaded from: classes2.dex */
public class xp extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116749d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116751f;

    /* renamed from: g, reason: collision with root package name */
    public int f116752g;

    /* renamed from: h, reason: collision with root package name */
    public long f116753h;

    /* renamed from: i, reason: collision with root package name */
    public int f116754i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f116755m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f116756n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.pi0 f116757o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f116758p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f116759q;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f116750e = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f116760r = new boolean[12];

    static {
        new bw5.xp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xp mo11468x92b714fd(byte[] bArr) {
        return (bw5.xp) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xp)) {
            return false;
        }
        bw5.xp xpVar = (bw5.xp) fVar;
        return n51.f.a(this.f116749d, xpVar.f116749d) && n51.f.a(this.f116750e, xpVar.f116750e) && n51.f.a(this.f116751f, xpVar.f116751f) && n51.f.a(java.lang.Integer.valueOf(this.f116752g), java.lang.Integer.valueOf(xpVar.f116752g)) && n51.f.a(java.lang.Long.valueOf(this.f116753h), java.lang.Long.valueOf(xpVar.f116753h)) && n51.f.a(java.lang.Integer.valueOf(this.f116754i), java.lang.Integer.valueOf(xpVar.f116754i)) && n51.f.a(this.f116755m, xpVar.f116755m) && n51.f.a(this.f116756n, xpVar.f116756n) && n51.f.a(this.f116757o, xpVar.f116757o) && n51.f.a(this.f116758p, xpVar.f116758p) && n51.f.a(java.lang.Boolean.valueOf(this.f116759q), java.lang.Boolean.valueOf(xpVar.f116759q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.xp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116750e;
        boolean[] zArr = this.f116760r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f116749d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str2 = this.f116751f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116752g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f116753h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f116754i);
            }
            java.lang.String str3 = this.f116755m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f116756n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            bw5.pi0 pi0Var = this.f116757o;
            if (pi0Var != null && zArr[9]) {
                fVar.i(9, pi0Var.mo75928xcd1e8d8());
                this.f116757o.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f116758p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            if (!zArr[11]) {
                return 0;
            }
            fVar.a(11, this.f116759q);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f116749d;
            int j17 = ((str6 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str6)) + b36.f.g(2, 8, linkedList);
            java.lang.String str7 = this.f116751f;
            if (str7 != null && zArr[3]) {
                j17 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                j17 += b36.f.e(4, this.f116752g);
            }
            if (zArr[5]) {
                j17 += b36.f.h(5, this.f116753h);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f116754i);
            }
            java.lang.String str8 = this.f116755m;
            if (str8 != null && zArr[7]) {
                j17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f116756n;
            if (str9 != null && zArr[8]) {
                j17 += b36.f.j(8, str9);
            }
            bw5.pi0 pi0Var2 = this.f116757o;
            if (pi0Var2 != null && zArr[9]) {
                j17 += b36.f.i(9, pi0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f116758p;
            if (str10 != null && zArr[10]) {
                j17 += b36.f.j(10, str10);
            }
            return zArr[11] ? j17 + b36.f.a(11, this.f116759q) : j17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
                this.f116749d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.yr yrVar = new bw5.yr();
                    if (bArr != null && bArr.length > 0) {
                        yrVar.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(yrVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f116751f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116752g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116753h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116754i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f116755m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f116756n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.pi0 pi0Var3 = new bw5.pi0();
                    if (bArr2 != null && bArr2.length > 0) {
                        pi0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f116757o = pi0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f116758p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f116759q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
