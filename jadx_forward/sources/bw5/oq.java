package bw5;

/* loaded from: classes2.dex */
public class oq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public final boolean[] A = new boolean[21];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112722d;

    /* renamed from: e, reason: collision with root package name */
    public int f112723e;

    /* renamed from: f, reason: collision with root package name */
    public int f112724f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112725g;

    /* renamed from: h, reason: collision with root package name */
    public int f112726h;

    /* renamed from: i, reason: collision with root package name */
    public float f112727i;

    /* renamed from: m, reason: collision with root package name */
    public int f112728m;

    /* renamed from: n, reason: collision with root package name */
    public int f112729n;

    /* renamed from: o, reason: collision with root package name */
    public int f112730o;

    /* renamed from: p, reason: collision with root package name */
    public int f112731p;

    /* renamed from: q, reason: collision with root package name */
    public int f112732q;

    /* renamed from: r, reason: collision with root package name */
    public int f112733r;

    /* renamed from: s, reason: collision with root package name */
    public int f112734s;

    /* renamed from: t, reason: collision with root package name */
    public int f112735t;

    /* renamed from: u, reason: collision with root package name */
    public int f112736u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f112737v;

    /* renamed from: w, reason: collision with root package name */
    public int f112738w;

    /* renamed from: x, reason: collision with root package name */
    public int f112739x;

    /* renamed from: y, reason: collision with root package name */
    public int f112740y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f112741z;

    static {
        new bw5.oq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.oq mo11468x92b714fd(byte[] bArr) {
        return (bw5.oq) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.oq)) {
            return false;
        }
        bw5.oq oqVar = (bw5.oq) fVar;
        return n51.f.a(this.f112722d, oqVar.f112722d) && n51.f.a(java.lang.Integer.valueOf(this.f112723e), java.lang.Integer.valueOf(oqVar.f112723e)) && n51.f.a(java.lang.Integer.valueOf(this.f112724f), java.lang.Integer.valueOf(oqVar.f112724f)) && n51.f.a(this.f112725g, oqVar.f112725g) && n51.f.a(java.lang.Integer.valueOf(this.f112726h), java.lang.Integer.valueOf(oqVar.f112726h)) && n51.f.a(java.lang.Float.valueOf(this.f112727i), java.lang.Float.valueOf(oqVar.f112727i)) && n51.f.a(java.lang.Integer.valueOf(this.f112728m), java.lang.Integer.valueOf(oqVar.f112728m)) && n51.f.a(java.lang.Integer.valueOf(this.f112729n), java.lang.Integer.valueOf(oqVar.f112729n)) && n51.f.a(java.lang.Integer.valueOf(this.f112730o), java.lang.Integer.valueOf(oqVar.f112730o)) && n51.f.a(java.lang.Integer.valueOf(this.f112731p), java.lang.Integer.valueOf(oqVar.f112731p)) && n51.f.a(java.lang.Integer.valueOf(this.f112732q), java.lang.Integer.valueOf(oqVar.f112732q)) && n51.f.a(java.lang.Integer.valueOf(this.f112733r), java.lang.Integer.valueOf(oqVar.f112733r)) && n51.f.a(java.lang.Integer.valueOf(this.f112734s), java.lang.Integer.valueOf(oqVar.f112734s)) && n51.f.a(java.lang.Integer.valueOf(this.f112735t), java.lang.Integer.valueOf(oqVar.f112735t)) && n51.f.a(java.lang.Integer.valueOf(this.f112736u), java.lang.Integer.valueOf(oqVar.f112736u)) && n51.f.a(this.f112737v, oqVar.f112737v) && n51.f.a(java.lang.Integer.valueOf(this.f112738w), java.lang.Integer.valueOf(oqVar.f112738w)) && n51.f.a(java.lang.Integer.valueOf(this.f112739x), java.lang.Integer.valueOf(oqVar.f112739x)) && n51.f.a(java.lang.Integer.valueOf(this.f112740y), java.lang.Integer.valueOf(oqVar.f112740y)) && n51.f.a(this.f112741z, oqVar.f112741z);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.oq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112722d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f112723e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f112724f);
            }
            java.lang.String str2 = this.f112725g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f112726h);
            }
            if (zArr[6]) {
                fVar.d(6, this.f112727i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f112728m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f112729n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f112730o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f112731p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f112732q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f112733r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f112734s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f112735t);
            }
            if (zArr[15]) {
                fVar.e(15, this.f112736u);
            }
            java.lang.String str3 = this.f112737v;
            if (str3 != null && zArr[16]) {
                fVar.j(16, str3);
            }
            if (zArr[17]) {
                fVar.e(17, this.f112738w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f112739x);
            }
            if (zArr[19]) {
                fVar.e(19, this.f112740y);
            }
            java.lang.String str4 = this.f112741z;
            if (str4 != null && zArr[20]) {
                fVar.j(20, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f112722d;
            if (str5 != null && zArr[1]) {
                i18 = b36.f.j(1, str5) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f112723e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f112724f);
            }
            java.lang.String str6 = this.f112725g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f112726h);
            }
            if (zArr[6]) {
                i18 += b36.f.d(6, this.f112727i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f112728m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f112729n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f112730o);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f112731p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f112732q);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f112733r);
            }
            if (zArr[13]) {
                i18 += b36.f.e(13, this.f112734s);
            }
            if (zArr[14]) {
                i18 += b36.f.e(14, this.f112735t);
            }
            if (zArr[15]) {
                i18 += b36.f.e(15, this.f112736u);
            }
            java.lang.String str7 = this.f112737v;
            if (str7 != null && zArr[16]) {
                i18 += b36.f.j(16, str7);
            }
            if (zArr[17]) {
                i18 += b36.f.e(17, this.f112738w);
            }
            if (zArr[18]) {
                i18 += b36.f.e(18, this.f112739x);
            }
            if (zArr[19]) {
                i18 += b36.f.e(19, this.f112740y);
            }
            java.lang.String str8 = this.f112741z;
            return (str8 == null || !zArr[20]) ? i18 : i18 + b36.f.j(20, str8);
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
                this.f112722d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112723e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112724f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112725g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112726h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112727i = aVar2.f(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112728m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f112729n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f112730o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f112731p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f112732q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f112733r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f112734s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f112735t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f112736u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f112737v = aVar2.k(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f112738w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f112739x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f112740y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f112741z = aVar2.k(intValue);
                zArr[20] = true;
                return 0;
            default:
                return -1;
        }
    }
}
