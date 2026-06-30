package bw5;

/* loaded from: classes2.dex */
public class ob0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112568d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112569e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112570f;

    /* renamed from: g, reason: collision with root package name */
    public long f112571g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.nb0 f112572h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f112573i;

    /* renamed from: m, reason: collision with root package name */
    public int f112574m;

    /* renamed from: n, reason: collision with root package name */
    public int f112575n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f112576o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f112577p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f112578q = new boolean[16];

    static {
        new bw5.ob0();
    }

    public bw5.nb0 b() {
        return this.f112578q[7] ? this.f112572h : new bw5.nb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.ob0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.ob0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ob0)) {
            return false;
        }
        bw5.ob0 ob0Var = (bw5.ob0) fVar;
        return n51.f.a(this.f112568d, ob0Var.f112568d) && n51.f.a(this.f112569e, ob0Var.f112569e) && n51.f.a(this.f112570f, ob0Var.f112570f) && n51.f.a(java.lang.Long.valueOf(this.f112571g), java.lang.Long.valueOf(ob0Var.f112571g)) && n51.f.a(this.f112572h, ob0Var.f112572h) && n51.f.a(this.f112573i, ob0Var.f112573i) && n51.f.a(java.lang.Integer.valueOf(this.f112574m), java.lang.Integer.valueOf(ob0Var.f112574m)) && n51.f.a(java.lang.Integer.valueOf(this.f112575n), java.lang.Integer.valueOf(ob0Var.f112575n)) && n51.f.a(this.f112576o, ob0Var.f112576o) && n51.f.a(this.f112577p, ob0Var.f112577p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ob0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112578q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112568d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f112569e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f112570f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.h(4, this.f112571g);
            }
            bw5.nb0 nb0Var = this.f112572h;
            if (nb0Var != null && zArr[7]) {
                fVar.i(7, nb0Var.mo75928xcd1e8d8());
                this.f112572h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f112573i;
            if (str4 != null && zArr[10]) {
                fVar.j(10, str4);
            }
            if (zArr[11]) {
                fVar.e(11, this.f112574m);
            }
            if (zArr[12]) {
                fVar.e(12, this.f112575n);
            }
            java.lang.String str5 = this.f112576o;
            if (str5 != null && zArr[14]) {
                fVar.j(14, str5);
            }
            java.lang.String str6 = this.f112577p;
            if (str6 != null && zArr[15]) {
                fVar.j(15, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f112568d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f112569e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f112570f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f112571g);
            }
            bw5.nb0 nb0Var2 = this.f112572h;
            if (nb0Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, nb0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f112573i;
            if (str10 != null && zArr[10]) {
                i18 += b36.f.j(10, str10);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f112574m);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f112575n);
            }
            java.lang.String str11 = this.f112576o;
            if (str11 != null && zArr[14]) {
                i18 += b36.f.j(14, str11);
            }
            java.lang.String str12 = this.f112577p;
            return (str12 == null || !zArr[15]) ? i18 : i18 + b36.f.j(15, str12);
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
                this.f112568d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112569e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112570f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112571g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
            case 6:
            case 8:
            case 9:
            case 13:
            default:
                return -1;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.nb0 nb0Var3 = new bw5.nb0();
                    if (bArr != null && bArr.length > 0) {
                        nb0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f112572h = nb0Var3;
                }
                zArr[7] = true;
                return 0;
            case 10:
                this.f112573i = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f112574m = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f112575n = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 14:
                this.f112576o = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f112577p = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
        }
    }
}
