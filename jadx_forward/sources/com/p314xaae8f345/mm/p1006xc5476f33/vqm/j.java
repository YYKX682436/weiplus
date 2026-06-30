package com.p314xaae8f345.mm.p1006xc5476f33.vqm;

/* loaded from: classes7.dex */
public class j extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.vqm.j C = new com.p314xaae8f345.mm.p1006xc5476f33.vqm.j();
    public long A;
    public final boolean[] B = new boolean[22];

    /* renamed from: d, reason: collision with root package name */
    public long f258881d;

    /* renamed from: e, reason: collision with root package name */
    public long f258882e;

    /* renamed from: f, reason: collision with root package name */
    public long f258883f;

    /* renamed from: g, reason: collision with root package name */
    public long f258884g;

    /* renamed from: h, reason: collision with root package name */
    public long f258885h;

    /* renamed from: i, reason: collision with root package name */
    public long f258886i;

    /* renamed from: m, reason: collision with root package name */
    public long f258887m;

    /* renamed from: n, reason: collision with root package name */
    public long f258888n;

    /* renamed from: o, reason: collision with root package name */
    public int f258889o;

    /* renamed from: p, reason: collision with root package name */
    public int f258890p;

    /* renamed from: q, reason: collision with root package name */
    public int f258891q;

    /* renamed from: r, reason: collision with root package name */
    public int f258892r;

    /* renamed from: s, reason: collision with root package name */
    public int f258893s;

    /* renamed from: t, reason: collision with root package name */
    public long f258894t;

    /* renamed from: u, reason: collision with root package name */
    public long f258895u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.vqm.k f258896v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f258897w;

    /* renamed from: x, reason: collision with root package name */
    public long f258898x;

    /* renamed from: y, reason: collision with root package name */
    public long f258899y;

    /* renamed from: z, reason: collision with root package name */
    public long f258900z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.vqm.j)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.j jVar = (com.p314xaae8f345.mm.p1006xc5476f33.vqm.j) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f258881d), java.lang.Long.valueOf(jVar.f258881d)) && n51.f.a(java.lang.Long.valueOf(this.f258882e), java.lang.Long.valueOf(jVar.f258882e)) && n51.f.a(java.lang.Long.valueOf(this.f258883f), java.lang.Long.valueOf(jVar.f258883f)) && n51.f.a(java.lang.Long.valueOf(this.f258884g), java.lang.Long.valueOf(jVar.f258884g)) && n51.f.a(java.lang.Long.valueOf(this.f258885h), java.lang.Long.valueOf(jVar.f258885h)) && n51.f.a(java.lang.Long.valueOf(this.f258886i), java.lang.Long.valueOf(jVar.f258886i)) && n51.f.a(java.lang.Long.valueOf(this.f258887m), java.lang.Long.valueOf(jVar.f258887m)) && n51.f.a(java.lang.Long.valueOf(this.f258888n), java.lang.Long.valueOf(jVar.f258888n)) && n51.f.a(java.lang.Integer.valueOf(this.f258889o), java.lang.Integer.valueOf(jVar.f258889o)) && n51.f.a(java.lang.Integer.valueOf(this.f258890p), java.lang.Integer.valueOf(jVar.f258890p)) && n51.f.a(java.lang.Integer.valueOf(this.f258891q), java.lang.Integer.valueOf(jVar.f258891q)) && n51.f.a(java.lang.Integer.valueOf(this.f258892r), java.lang.Integer.valueOf(jVar.f258892r)) && n51.f.a(java.lang.Integer.valueOf(this.f258893s), java.lang.Integer.valueOf(jVar.f258893s)) && n51.f.a(java.lang.Long.valueOf(this.f258894t), java.lang.Long.valueOf(jVar.f258894t)) && n51.f.a(java.lang.Long.valueOf(this.f258895u), java.lang.Long.valueOf(jVar.f258895u)) && n51.f.a(this.f258896v, jVar.f258896v) && n51.f.a(this.f258897w, jVar.f258897w) && n51.f.a(java.lang.Long.valueOf(this.f258898x), java.lang.Long.valueOf(jVar.f258898x)) && n51.f.a(java.lang.Long.valueOf(this.f258899y), java.lang.Long.valueOf(jVar.f258899y)) && n51.f.a(java.lang.Long.valueOf(this.f258900z), java.lang.Long.valueOf(jVar.f258900z)) && n51.f.a(java.lang.Long.valueOf(this.A), java.lang.Long.valueOf(jVar.A));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.vqm.j();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.k kVar;
        boolean[] zArr = this.B;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f258881d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f258882e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f258883f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f258884g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f258885h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f258886i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f258887m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f258888n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f258889o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f258890p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f258891q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f258892r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f258893s);
            }
            if (zArr[14]) {
                fVar.h(14, this.f258894t);
            }
            if (zArr[15]) {
                fVar.h(15, this.f258895u);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.k kVar2 = this.f258896v;
            if (kVar2 != null && zArr[16]) {
                fVar.e(16, kVar2.f258907d);
            }
            java.lang.String str = this.f258897w;
            if (str != null && zArr[17]) {
                fVar.j(17, str);
            }
            if (zArr[18]) {
                fVar.h(18, this.f258898x);
            }
            if (zArr[19]) {
                fVar.h(19, this.f258899y);
            }
            if (zArr[20]) {
                fVar.h(20, this.f258900z);
            }
            if (zArr[21]) {
                fVar.h(21, this.A);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f258881d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f258882e);
            }
            if (zArr[3]) {
                h17 += b36.f.h(3, this.f258883f);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f258884g);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f258885h);
            }
            if (zArr[6]) {
                h17 += b36.f.h(6, this.f258886i);
            }
            if (zArr[7]) {
                h17 += b36.f.h(7, this.f258887m);
            }
            if (zArr[8]) {
                h17 += b36.f.h(8, this.f258888n);
            }
            if (zArr[9]) {
                h17 += b36.f.e(9, this.f258889o);
            }
            if (zArr[10]) {
                h17 += b36.f.e(10, this.f258890p);
            }
            if (zArr[11]) {
                h17 += b36.f.e(11, this.f258891q);
            }
            if (zArr[12]) {
                h17 += b36.f.e(12, this.f258892r);
            }
            if (zArr[13]) {
                h17 += b36.f.e(13, this.f258893s);
            }
            if (zArr[14]) {
                h17 += b36.f.h(14, this.f258894t);
            }
            if (zArr[15]) {
                h17 += b36.f.h(15, this.f258895u);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.k kVar3 = this.f258896v;
            if (kVar3 != null && zArr[16]) {
                h17 += b36.f.e(16, kVar3.f258907d);
            }
            java.lang.String str2 = this.f258897w;
            if (str2 != null && zArr[17]) {
                h17 += b36.f.j(17, str2);
            }
            if (zArr[18]) {
                h17 += b36.f.h(18, this.f258898x);
            }
            if (zArr[19]) {
                h17 += b36.f.h(19, this.f258899y);
            }
            if (zArr[20]) {
                h17 += b36.f.h(20, this.f258900z);
            }
            return zArr[21] ? h17 + b36.f.h(21, this.A) : h17;
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
                this.f258881d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f258882e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f258883f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f258884g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f258885h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f258886i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f258887m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f258888n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f258889o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f258890p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f258891q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f258892r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f258893s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f258894t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f258895u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                int g17 = aVar2.g(intValue);
                if (g17 != 0) {
                    switch (g17) {
                        case 10001:
                            kVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.k.VQMProfileInfoAudioDeviceTypeSpeaker;
                            break;
                        case 10002:
                            kVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.k.VQMProfileInfoAudioDeviceTypeEarpiece;
                            break;
                        case com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6 /* 10003 */:
                            kVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.k.VQMProfileInfoAudioDeviceTypeHeadset;
                            break;
                        case com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261 /* 10004 */:
                            kVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.k.VQMProfileInfoAudioDeviceTypeBluetooth;
                            break;
                        default:
                            kVar = null;
                            break;
                    }
                } else {
                    kVar = com.p314xaae8f345.mm.p1006xc5476f33.vqm.k.VQMProfileInfoAudioDeviceTypeNull;
                }
                this.f258896v = kVar;
                zArr[16] = true;
                return 0;
            case 17:
                this.f258897w = aVar2.k(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f258898x = aVar2.i(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f258899y = aVar2.i(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f258900z = aVar2.i(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.i(intValue);
                zArr[21] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.vqm.j) super.mo11468x92b714fd(bArr);
    }
}
