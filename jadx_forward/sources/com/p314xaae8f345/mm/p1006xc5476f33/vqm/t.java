package com.p314xaae8f345.mm.p1006xc5476f33.vqm;

/* loaded from: classes14.dex */
public class t extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: r, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.vqm.t f259011r = new com.p314xaae8f345.mm.p1006xc5476f33.vqm.t();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.vqm.v f259012d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.vqm.x f259013e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.vqm.x f259014f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.vqm.x f259015g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.vqm.x f259016h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.vqm.x f259017i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.vqm.u f259018m;

    /* renamed from: n, reason: collision with root package name */
    public int f259019n;

    /* renamed from: o, reason: collision with root package name */
    public int f259020o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.vqm.w f259021p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f259022q = new boolean[11];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.vqm.t)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.vqm.t) fVar;
        return n51.f.a(this.f259012d, tVar.f259012d) && n51.f.a(this.f259013e, tVar.f259013e) && n51.f.a(this.f259014f, tVar.f259014f) && n51.f.a(this.f259015g, tVar.f259015g) && n51.f.a(this.f259016h, tVar.f259016h) && n51.f.a(this.f259017i, tVar.f259017i) && n51.f.a(this.f259018m, tVar.f259018m) && n51.f.a(java.lang.Integer.valueOf(this.f259019n), java.lang.Integer.valueOf(tVar.f259019n)) && n51.f.a(java.lang.Integer.valueOf(this.f259020o), java.lang.Integer.valueOf(tVar.f259020o)) && n51.f.a(this.f259021p, tVar.f259021p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.vqm.t();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f259022q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.v vVar = this.f259012d;
            if (vVar != null && zArr[1]) {
                fVar.e(1, vVar.f259036d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.x xVar = this.f259013e;
            if (xVar != null && zArr[2]) {
                fVar.e(2, xVar.f259048d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.x xVar2 = this.f259014f;
            if (xVar2 != null && zArr[3]) {
                fVar.e(3, xVar2.f259048d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.x xVar3 = this.f259015g;
            if (xVar3 != null && zArr[4]) {
                fVar.e(4, xVar3.f259048d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.x xVar4 = this.f259016h;
            if (xVar4 != null && zArr[5]) {
                fVar.e(5, xVar4.f259048d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.x xVar5 = this.f259017i;
            if (xVar5 != null && zArr[6]) {
                fVar.e(6, xVar5.f259048d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.u uVar = this.f259018m;
            if (uVar != null && zArr[7]) {
                fVar.e(7, uVar.f259028d);
            }
            if (zArr[8]) {
                fVar.e(8, this.f259019n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f259020o);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.w wVar = this.f259021p;
            if (wVar != null && zArr[10]) {
                fVar.e(10, wVar.f259042d);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.v vVar2 = this.f259012d;
            if (vVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, vVar2.f259036d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.x xVar6 = this.f259013e;
            if (xVar6 != null && zArr[2]) {
                i18 += b36.f.e(2, xVar6.f259048d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.x xVar7 = this.f259014f;
            if (xVar7 != null && zArr[3]) {
                i18 += b36.f.e(3, xVar7.f259048d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.x xVar8 = this.f259015g;
            if (xVar8 != null && zArr[4]) {
                i18 += b36.f.e(4, xVar8.f259048d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.x xVar9 = this.f259016h;
            if (xVar9 != null && zArr[5]) {
                i18 += b36.f.e(5, xVar9.f259048d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.x xVar10 = this.f259017i;
            if (xVar10 != null && zArr[6]) {
                i18 += b36.f.e(6, xVar10.f259048d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.u uVar2 = this.f259018m;
            if (uVar2 != null && zArr[7]) {
                i18 += b36.f.e(7, uVar2.f259028d);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f259019n);
            }
            if (zArr[9]) {
                i18 += b36.f.e(9, this.f259020o);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.vqm.w wVar2 = this.f259021p;
            return (wVar2 == null || !zArr[10]) ? i18 : i18 + b36.f.e(10, wVar2.f259042d);
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
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.v vVar3 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.w wVar3 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.vqm.u uVar3 = null;
        switch (intValue) {
            case 1:
                int g17 = aVar2.g(intValue);
                if (g17 != 0) {
                    switch (g17) {
                        case 10000:
                            vVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.v.VQMProfileInfoNotificationAuthorizationStatusNotDetermined;
                            break;
                        case 10001:
                            vVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.v.VQMProfileInfoNotificationAuthorizationStatusDenied;
                            break;
                        case 10002:
                            vVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.v.VQMProfileInfoNotificationAuthorizationStatusAuthorized;
                            break;
                        case com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6 /* 10003 */:
                            vVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.v.VQMProfileInfoNotificationAuthorizationStatusProvisional;
                            break;
                        case com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54055x82c2d261 /* 10004 */:
                            vVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.v.VQMProfileInfoNotificationAuthorizationStatusEphemeral;
                            break;
                    }
                } else {
                    vVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.v.VQMProfileInfoNotificationAuthorizationStatusNull;
                }
                this.f259012d = vVar3;
                zArr[1] = true;
                return 0;
            case 2:
                this.f259013e = com.p314xaae8f345.mm.p1006xc5476f33.vqm.x.a(aVar2.g(intValue));
                zArr[2] = true;
                return 0;
            case 3:
                this.f259014f = com.p314xaae8f345.mm.p1006xc5476f33.vqm.x.a(aVar2.g(intValue));
                zArr[3] = true;
                return 0;
            case 4:
                this.f259015g = com.p314xaae8f345.mm.p1006xc5476f33.vqm.x.a(aVar2.g(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                this.f259016h = com.p314xaae8f345.mm.p1006xc5476f33.vqm.x.a(aVar2.g(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f259017i = com.p314xaae8f345.mm.p1006xc5476f33.vqm.x.a(aVar2.g(intValue));
                zArr[6] = true;
                return 0;
            case 7:
                int g18 = aVar2.g(intValue);
                if (g18 != 0) {
                    switch (g18) {
                        case 10000:
                            uVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.u.VQMProfileInfoNotificationAlertStyleNone;
                            break;
                        case 10001:
                            uVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.u.VQMProfileInfoNotificationAlertStyleBanner;
                            break;
                        case 10002:
                            uVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.u.VQMProfileInfoNotificationAlertStyleAlert;
                            break;
                    }
                } else {
                    uVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.u.VQMProfileInfoNotificationAlertStyleNull;
                }
                this.f259018m = uVar3;
                zArr[7] = true;
                return 0;
            case 8:
                this.f259019n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f259020o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                int g19 = aVar2.g(intValue);
                if (g19 != 0) {
                    switch (g19) {
                        case 10000:
                            wVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.w.VQMProfileInfoNotificationPushTypeNone;
                            break;
                        case 10001:
                            wVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.w.VQMProfileInfoNotificationPushTypePushKit;
                            break;
                        case 10002:
                            wVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.w.VQMProfileInfoNotificationPushTypeAPNS;
                            break;
                    }
                } else {
                    wVar3 = com.p314xaae8f345.mm.p1006xc5476f33.vqm.w.VQMProfileInfoNotificationPushTypeNull;
                }
                this.f259021p = wVar3;
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.vqm.t) super.mo11468x92b714fd(bArr);
    }
}
