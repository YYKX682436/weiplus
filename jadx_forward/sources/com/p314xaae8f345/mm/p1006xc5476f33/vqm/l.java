package com.p314xaae8f345.mm.p1006xc5476f33.vqm;

/* loaded from: classes15.dex */
public class l extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.vqm.l E = new com.p314xaae8f345.mm.p1006xc5476f33.vqm.l();
    public long A;
    public long B;
    public int C;
    public final boolean[] D = new boolean[24];

    /* renamed from: d, reason: collision with root package name */
    public long f258908d;

    /* renamed from: e, reason: collision with root package name */
    public long f258909e;

    /* renamed from: f, reason: collision with root package name */
    public int f258910f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.vqm.o f258911g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.vqm.n f258912h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.vqm.m f258913i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.vqm.m f258914m;

    /* renamed from: n, reason: collision with root package name */
    public long f258915n;

    /* renamed from: o, reason: collision with root package name */
    public long f258916o;

    /* renamed from: p, reason: collision with root package name */
    public long f258917p;

    /* renamed from: q, reason: collision with root package name */
    public long f258918q;

    /* renamed from: r, reason: collision with root package name */
    public long f258919r;

    /* renamed from: s, reason: collision with root package name */
    public long f258920s;

    /* renamed from: t, reason: collision with root package name */
    public long f258921t;

    /* renamed from: u, reason: collision with root package name */
    public long f258922u;

    /* renamed from: v, reason: collision with root package name */
    public long f258923v;

    /* renamed from: w, reason: collision with root package name */
    public int f258924w;

    /* renamed from: x, reason: collision with root package name */
    public int f258925x;

    /* renamed from: y, reason: collision with root package name */
    public int f258926y;

    /* renamed from: z, reason: collision with root package name */
    public long f258927z;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.vqm.l)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.vqm.l) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f258908d), java.lang.Long.valueOf(lVar.f258908d)) && n51.f.a(java.lang.Long.valueOf(this.f258909e), java.lang.Long.valueOf(lVar.f258909e)) && n51.f.a(java.lang.Integer.valueOf(this.f258910f), java.lang.Integer.valueOf(lVar.f258910f)) && n51.f.a(this.f258911g, lVar.f258911g) && n51.f.a(this.f258912h, lVar.f258912h) && n51.f.a(this.f258913i, lVar.f258913i) && n51.f.a(this.f258914m, lVar.f258914m) && n51.f.a(java.lang.Long.valueOf(this.f258915n), java.lang.Long.valueOf(lVar.f258915n)) && n51.f.a(java.lang.Long.valueOf(this.f258916o), java.lang.Long.valueOf(lVar.f258916o)) && n51.f.a(java.lang.Long.valueOf(this.f258917p), java.lang.Long.valueOf(lVar.f258917p)) && n51.f.a(java.lang.Long.valueOf(this.f258918q), java.lang.Long.valueOf(lVar.f258918q)) && n51.f.a(java.lang.Long.valueOf(this.f258919r), java.lang.Long.valueOf(lVar.f258919r)) && n51.f.a(java.lang.Long.valueOf(this.f258920s), java.lang.Long.valueOf(lVar.f258920s)) && n51.f.a(java.lang.Long.valueOf(this.f258921t), java.lang.Long.valueOf(lVar.f258921t)) && n51.f.a(java.lang.Long.valueOf(this.f258922u), java.lang.Long.valueOf(lVar.f258922u)) && n51.f.a(java.lang.Long.valueOf(this.f258923v), java.lang.Long.valueOf(lVar.f258923v)) && n51.f.a(java.lang.Integer.valueOf(this.f258924w), java.lang.Integer.valueOf(lVar.f258924w)) && n51.f.a(java.lang.Integer.valueOf(this.f258925x), java.lang.Integer.valueOf(lVar.f258925x)) && n51.f.a(java.lang.Integer.valueOf(this.f258926y), java.lang.Integer.valueOf(lVar.f258926y)) && n51.f.a(java.lang.Long.valueOf(this.f258927z), java.lang.Long.valueOf(lVar.f258927z)) && n51.f.a(java.lang.Long.valueOf(this.A), java.lang.Long.valueOf(lVar.A)) && n51.f.a(java.lang.Long.valueOf(this.B), java.lang.Long.valueOf(lVar.B)) && n51.f.a(java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(lVar.C));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.vqm.l();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.D;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f258908d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f258909e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f258910f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.o oVar = this.f258911g;
            if (oVar != null && zArr[4]) {
                fVar.e(4, oVar.f258955d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.n nVar = this.f258912h;
            if (nVar != null && zArr[5]) {
                fVar.e(5, nVar.f258949d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.m mVar = this.f258913i;
            if (mVar != null && zArr[6]) {
                fVar.e(6, mVar.f258932d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.m mVar2 = this.f258914m;
            if (mVar2 != null && zArr[7]) {
                fVar.e(7, mVar2.f258932d);
            }
            if (zArr[8]) {
                fVar.h(8, this.f258915n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f258916o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f258917p);
            }
            if (zArr[11]) {
                fVar.h(11, this.f258918q);
            }
            if (zArr[12]) {
                fVar.h(12, this.f258919r);
            }
            if (zArr[13]) {
                fVar.h(13, this.f258920s);
            }
            if (zArr[14]) {
                fVar.h(14, this.f258921t);
            }
            if (zArr[15]) {
                fVar.h(15, this.f258922u);
            }
            if (zArr[16]) {
                fVar.h(16, this.f258923v);
            }
            if (zArr[17]) {
                fVar.e(17, this.f258924w);
            }
            if (zArr[18]) {
                fVar.e(18, this.f258925x);
            }
            if (zArr[19]) {
                fVar.e(19, this.f258926y);
            }
            if (zArr[20]) {
                fVar.h(20, this.f258927z);
            }
            if (zArr[21]) {
                fVar.h(21, this.A);
            }
            if (zArr[22]) {
                fVar.h(22, this.B);
            }
            if (zArr[23]) {
                fVar.e(23, this.C);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? b36.f.h(1, this.f258908d) + 0 : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f258909e);
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f258910f);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.o oVar2 = this.f258911g;
            if (oVar2 != null && zArr[4]) {
                h17 += b36.f.e(4, oVar2.f258955d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.n nVar2 = this.f258912h;
            if (nVar2 != null && zArr[5]) {
                h17 += b36.f.e(5, nVar2.f258949d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.m mVar3 = this.f258913i;
            if (mVar3 != null && zArr[6]) {
                h17 += b36.f.e(6, mVar3.f258932d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.m mVar4 = this.f258914m;
            if (mVar4 != null && zArr[7]) {
                h17 += b36.f.e(7, mVar4.f258932d);
            }
            if (zArr[8]) {
                h17 += b36.f.h(8, this.f258915n);
            }
            if (zArr[9]) {
                h17 += b36.f.h(9, this.f258916o);
            }
            if (zArr[10]) {
                h17 += b36.f.h(10, this.f258917p);
            }
            if (zArr[11]) {
                h17 += b36.f.h(11, this.f258918q);
            }
            if (zArr[12]) {
                h17 += b36.f.h(12, this.f258919r);
            }
            if (zArr[13]) {
                h17 += b36.f.h(13, this.f258920s);
            }
            if (zArr[14]) {
                h17 += b36.f.h(14, this.f258921t);
            }
            if (zArr[15]) {
                h17 += b36.f.h(15, this.f258922u);
            }
            if (zArr[16]) {
                h17 += b36.f.h(16, this.f258923v);
            }
            if (zArr[17]) {
                h17 += b36.f.e(17, this.f258924w);
            }
            if (zArr[18]) {
                h17 += b36.f.e(18, this.f258925x);
            }
            if (zArr[19]) {
                h17 += b36.f.e(19, this.f258926y);
            }
            if (zArr[20]) {
                h17 += b36.f.h(20, this.f258927z);
            }
            if (zArr[21]) {
                h17 += b36.f.h(21, this.A);
            }
            if (zArr[22]) {
                h17 += b36.f.h(22, this.B);
            }
            return zArr[23] ? h17 + b36.f.e(23, this.C) : h17;
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
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.m mVar5 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.m.VQMProfileInfoCommonKernalIlink;
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.m mVar6 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.m.VQMProfileInfoCommonKernalNormal;
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.m mVar7 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.m.VQMProfileInfoCommonKernalNull;
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.o oVar3 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.n nVar3 = null;
        switch (intValue) {
            case 1:
                this.f258908d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f258909e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f258910f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                int g17 = aVar2.g(intValue);
                if (g17 == 0) {
                    oVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.o.VQMProfileInfoCommonRoomTypeNull;
                } else if (g17 == 19999) {
                    oVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.o.VQMProfileInfoCommonRoomTypeUnknown;
                } else if (g17 == 10001) {
                    oVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.o.VQMProfileInfoCommonRoomTypeVoice;
                } else if (g17 == 10002) {
                    oVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.o.VQMProfileInfoCommonRoomTypeVideo;
                }
                this.f258911g = oVar3;
                zArr[4] = true;
                return 0;
            case 5:
                int g18 = aVar2.g(intValue);
                if (g18 == 0) {
                    nVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.n.VQMProfileInfoCommonOpenFromNull;
                } else if (g18 != 10007) {
                    switch (g18) {
                        case 10000:
                            nVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.n.VQMProfileInfoCommonOpenFromUnknown;
                            break;
                        case 10001:
                            nVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.n.VQMProfileInfoCommonOpenFromBubble;
                            break;
                        case 10002:
                            nVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.n.VQMProfileInfoCommonOpenFromContact;
                            break;
                        case com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6 /* 10003 */:
                            nVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.n.VQMProfileInfoCommonOpenFromInputTool;
                            break;
                        case com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261 /* 10004 */:
                            nVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.n.VQMProfileInfoCommonOpenFromSignal;
                            break;
                        case 10005:
                            nVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.n.VQMProfileInfoCommonOpenFromExceptionTip;
                            break;
                        default:
                            switch (g18) {
                                case 10100:
                                    nVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.n.VQMProfileInfoCommonOpenFromIosApns;
                                    break;
                                case 10101:
                                    nVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.n.VQMProfileInfoCommonOpenFromIosPushKit;
                                    break;
                                case 10102:
                                    nVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.n.VQMProfileInfoCommonOpenFromIosCallKit;
                                    break;
                                case 10103:
                                    nVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.n.VQMProfileInfoCommonOpenFromIosOpenIm;
                                    break;
                                case 10104:
                                    nVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.n.VQMProfileInfoCommonOpenFromIosRightMenu;
                                    break;
                                case 10105:
                                    nVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.n.VQMProfileInfoCommonOpenFromIosWidgetQuickCall;
                                    break;
                                case 10106:
                                    nVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.n.VQMProfileInfoCommonOpenFromIosCarPlay;
                                    break;
                            }
                    }
                } else {
                    nVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.n.VQMProfileInfoCommonOpenFromInviteWhenCalling;
                }
                this.f258912h = nVar3;
                zArr[5] = true;
                return 0;
            case 6:
                int g19 = aVar2.g(intValue);
                this.f258913i = g19 != 0 ? g19 != 10000 ? g19 != 10001 ? null : mVar5 : mVar6 : mVar7;
                zArr[6] = true;
                return 0;
            case 7:
                int g27 = aVar2.g(intValue);
                this.f258914m = g27 != 0 ? g27 != 10000 ? g27 != 10001 ? null : mVar5 : mVar6 : mVar7;
                zArr[7] = true;
                return 0;
            case 8:
                this.f258915n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f258916o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f258917p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f258918q = aVar2.i(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f258919r = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f258920s = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f258921t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f258922u = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f258923v = aVar2.i(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f258924w = aVar2.g(intValue);
                zArr[17] = true;
                return 0;
            case 18:
                this.f258925x = aVar2.g(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                this.f258926y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                this.f258927z = aVar2.i(intValue);
                zArr[20] = true;
                return 0;
            case 21:
                this.A = aVar2.i(intValue);
                zArr[21] = true;
                return 0;
            case 22:
                this.B = aVar2.i(intValue);
                zArr[22] = true;
                return 0;
            case 23:
                this.C = aVar2.g(intValue);
                zArr[23] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.vqm.l) super.mo11468x92b714fd(bArr);
    }
}
