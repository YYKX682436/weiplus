package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes4.dex */
public class s1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.y f297982d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f297983e;

    /* renamed from: f, reason: collision with root package name */
    public int f297984f;

    /* renamed from: g, reason: collision with root package name */
    public int f297985g;

    /* renamed from: h, reason: collision with root package name */
    public int f297986h;

    /* renamed from: i, reason: collision with root package name */
    public int f297987i;

    /* renamed from: m, reason: collision with root package name */
    public int f297988m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f297989n = new boolean[8];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.s1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.s1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.s1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.s1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.s1 s1Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.s1) fVar;
        return n51.f.a(this.f297982d, s1Var.f297982d) && n51.f.a(this.f297983e, s1Var.f297983e) && n51.f.a(java.lang.Integer.valueOf(this.f297984f), java.lang.Integer.valueOf(s1Var.f297984f)) && n51.f.a(java.lang.Integer.valueOf(this.f297985g), java.lang.Integer.valueOf(s1Var.f297985g)) && n51.f.a(java.lang.Integer.valueOf(this.f297986h), java.lang.Integer.valueOf(s1Var.f297986h)) && n51.f.a(java.lang.Integer.valueOf(this.f297987i), java.lang.Integer.valueOf(s1Var.f297987i)) && n51.f.a(java.lang.Integer.valueOf(this.f297988m), java.lang.Integer.valueOf(s1Var.f297988m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.s1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f297989n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.y yVar = this.f297982d;
            if (yVar != null && zArr[1]) {
                fVar.e(1, yVar.f298086d);
            }
            java.lang.String str = this.f297983e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f297984f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f297985g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f297986h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f297987i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f297988m);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.y yVar2 = this.f297982d;
            if (yVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, yVar2.f298086d);
            }
            java.lang.String str2 = this.f297983e;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f297984f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f297985g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f297986h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f297987i);
            }
            return zArr[7] ? i18 + b36.f.e(7, this.f297988m) : i18;
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
                int g17 = aVar2.g(intValue);
                this.f297982d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 3 ? null : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.y.ChatBotPrologueMsgType_CHAT_HISTORY_THINK : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.y.ChatBotPrologueMsgType_FRIEND_CHAT : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.y.ChatBotPrologueMsgType_ALERT : com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.y.ChatBotPrologueMsgType_UNSPECIFIED;
                zArr[1] = true;
                return 0;
            case 2:
                this.f297983e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f297984f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f297985g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f297986h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f297987i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f297988m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
