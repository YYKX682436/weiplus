package com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69;

/* loaded from: classes15.dex */
public class k extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f298149d = "";

    /* renamed from: e, reason: collision with root package name */
    public int f298150e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f298151f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f298152g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f298153h = 0;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.i f298154i = com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.i.DEFAULT;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f298155m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f298156n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f298157o = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f298158p = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f298159q = "";

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k kVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k) fVar;
        return n51.f.a(this.f298149d, kVar.f298149d) && n51.f.a(java.lang.Integer.valueOf(this.f298150e), java.lang.Integer.valueOf(kVar.f298150e)) && n51.f.a(java.lang.Integer.valueOf(this.f298151f), java.lang.Integer.valueOf(kVar.f298151f)) && n51.f.a(java.lang.Integer.valueOf(this.f298152g), java.lang.Integer.valueOf(kVar.f298152g)) && n51.f.a(java.lang.Long.valueOf(this.f298153h), java.lang.Long.valueOf(kVar.f298153h)) && n51.f.a(this.f298154i, kVar.f298154i) && n51.f.a(this.f298155m, kVar.f298155m) && n51.f.a(java.lang.Integer.valueOf(this.f298156n), java.lang.Integer.valueOf(kVar.f298156n)) && n51.f.a(java.lang.Integer.valueOf(this.f298157o), java.lang.Integer.valueOf(kVar.f298157o)) && n51.f.a(java.lang.Boolean.valueOf(this.f298158p), java.lang.Boolean.valueOf(kVar.f298158p)) && n51.f.a(this.f298159q, kVar.f298159q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f298149d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f298150e);
            fVar.e(3, this.f298151f);
            fVar.e(4, this.f298152g);
            fVar.h(5, this.f298153h);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.i iVar = this.f298154i;
            if (iVar != null) {
                fVar.e(6, iVar.f298146d);
            }
            java.lang.String str2 = this.f298155m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f298156n);
            fVar.e(9, this.f298157o);
            fVar.a(10, this.f298158p);
            java.lang.String str3 = this.f298159q;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f298149d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f298150e) + b36.f.e(3, this.f298151f) + b36.f.e(4, this.f298152g) + b36.f.h(5, this.f298153h);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.i iVar2 = this.f298154i;
            if (iVar2 != null) {
                j17 += b36.f.e(6, iVar2.f298146d);
            }
            java.lang.String str5 = this.f298155m;
            if (str5 != null) {
                j17 += b36.f.j(7, str5);
            }
            int e17 = j17 + b36.f.e(8, this.f298156n) + b36.f.e(9, this.f298157o) + b36.f.a(10, this.f298158p);
            java.lang.String str6 = this.f298159q;
            return str6 != null ? e17 + b36.f.j(11, str6) : e17;
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
                this.f298149d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f298150e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f298151f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f298152g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f298153h = aVar2.i(intValue);
                return 0;
            case 6:
                int g17 = aVar2.g(intValue);
                this.f298154i = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.i.SESSION_OUT : com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.i.PAGE_OUT : com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.i.DEFAULT;
                return 0;
            case 7:
                this.f298155m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f298156n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f298157o = aVar2.g(intValue);
                return 0;
            case 10:
                this.f298158p = aVar2.c(intValue);
                return 0;
            case 11:
                this.f298159q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3139xae3a4f69.k) super.mo11468x92b714fd(bArr);
    }
}
