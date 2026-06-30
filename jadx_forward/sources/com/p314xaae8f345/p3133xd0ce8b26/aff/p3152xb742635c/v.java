package com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c;

/* loaded from: classes7.dex */
public class v extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: w, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.v f298841w = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.v();

    /* renamed from: d, reason: collision with root package name */
    public long f298842d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f298843e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f298844f;

    /* renamed from: g, reason: collision with root package name */
    public long f298845g;

    /* renamed from: h, reason: collision with root package name */
    public long f298846h;

    /* renamed from: i, reason: collision with root package name */
    public int f298847i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f298848m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f298849n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f298850o;

    /* renamed from: p, reason: collision with root package name */
    public long f298851p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f298852q;

    /* renamed from: r, reason: collision with root package name */
    public int f298853r;

    /* renamed from: s, reason: collision with root package name */
    public long f298854s;

    /* renamed from: t, reason: collision with root package name */
    public long f298855t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f298856u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f298857v = new boolean[16];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.v)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.v vVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.v) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f298842d), java.lang.Long.valueOf(vVar.f298842d)) && n51.f.a(this.f298843e, vVar.f298843e) && n51.f.a(this.f298844f, vVar.f298844f) && n51.f.a(java.lang.Long.valueOf(this.f298845g), java.lang.Long.valueOf(vVar.f298845g)) && n51.f.a(java.lang.Long.valueOf(this.f298846h), java.lang.Long.valueOf(vVar.f298846h)) && n51.f.a(java.lang.Integer.valueOf(this.f298847i), java.lang.Integer.valueOf(vVar.f298847i)) && n51.f.a(java.lang.Boolean.valueOf(this.f298848m), java.lang.Boolean.valueOf(vVar.f298848m)) && n51.f.a(java.lang.Boolean.valueOf(this.f298849n), java.lang.Boolean.valueOf(vVar.f298849n)) && n51.f.a(java.lang.Boolean.valueOf(this.f298850o), java.lang.Boolean.valueOf(vVar.f298850o)) && n51.f.a(java.lang.Long.valueOf(this.f298851p), java.lang.Long.valueOf(vVar.f298851p)) && n51.f.a(this.f298852q, vVar.f298852q) && n51.f.a(java.lang.Integer.valueOf(this.f298853r), java.lang.Integer.valueOf(vVar.f298853r)) && n51.f.a(java.lang.Long.valueOf(this.f298854s), java.lang.Long.valueOf(vVar.f298854s)) && n51.f.a(java.lang.Long.valueOf(this.f298855t), java.lang.Long.valueOf(vVar.f298855t)) && n51.f.a(this.f298856u, vVar.f298856u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.v();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f298857v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f298842d);
            }
            java.lang.String str = this.f298843e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f298844f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.h(4, this.f298845g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f298846h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f298847i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f298848m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f298849n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f298850o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f298851p);
            }
            java.lang.String str3 = this.f298852q;
            if (str3 != null && zArr[11]) {
                fVar.j(11, str3);
            }
            if (zArr[12]) {
                fVar.e(12, this.f298853r);
            }
            if (zArr[13]) {
                fVar.h(13, this.f298854s);
            }
            if (zArr[14]) {
                fVar.h(14, this.f298855t);
            }
            java.lang.String str4 = this.f298856u;
            if (str4 != null && zArr[15]) {
                fVar.j(15, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f298842d) + 0 : 0;
            java.lang.String str5 = this.f298843e;
            if (str5 != null && zArr[2]) {
                h17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f298844f;
            if (str6 != null && zArr[3]) {
                h17 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f298845g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f298846h);
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f298847i);
            }
            if (zArr[7]) {
                h17 += b36.f.a(7, this.f298848m);
            }
            if (zArr[8]) {
                h17 += b36.f.a(8, this.f298849n);
            }
            if (zArr[9]) {
                h17 += b36.f.a(9, this.f298850o);
            }
            if (zArr[10]) {
                h17 += b36.f.h(10, this.f298851p);
            }
            java.lang.String str7 = this.f298852q;
            if (str7 != null && zArr[11]) {
                h17 += b36.f.j(11, str7);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f298853r);
            }
            if (zArr[13]) {
                h17 += b36.f.h(13, this.f298854s);
            }
            if (zArr[14]) {
                h17 += b36.f.h(14, this.f298855t);
            }
            java.lang.String str8 = this.f298856u;
            return (str8 == null || !zArr[15]) ? h17 : h17 + b36.f.j(15, str8);
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
                this.f298842d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f298843e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f298844f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f298845g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f298846h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f298847i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f298848m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f298849n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f298850o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f298851p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f298852q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f298853r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f298854s = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f298855t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f298856u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3152xb742635c.v) super.mo11468x92b714fd(bArr);
    }
}
