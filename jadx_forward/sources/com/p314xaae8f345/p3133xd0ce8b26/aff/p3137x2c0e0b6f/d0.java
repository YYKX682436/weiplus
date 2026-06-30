package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes14.dex */
public class d0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: o, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 f297669o = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c0 f297670d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f297671e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f297673g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f297674h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g0 f297675i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b0 f297676m;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f297672f = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f297677n = new boolean[8];

    public java.lang.String b() {
        return this.f297677n[2] ? this.f297671e : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 d0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0) fVar;
        return n51.f.a(this.f297670d, d0Var.f297670d) && n51.f.a(this.f297671e, d0Var.f297671e) && n51.f.a(this.f297672f, d0Var.f297672f) && n51.f.a(this.f297673g, d0Var.f297673g) && n51.f.a(this.f297674h, d0Var.f297674h) && n51.f.a(this.f297675i, d0Var.f297675i) && n51.f.a(this.f297676m, d0Var.f297676m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f297672f;
        int i18 = 0;
        boolean[] zArr = this.f297677n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c0 c0Var = this.f297670d;
            if (c0Var != null && zArr[1]) {
                fVar.e(1, c0Var.f297640d);
            }
            java.lang.String str = this.f297671e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str2 = this.f297673g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f297674h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g0 g0Var = this.f297675i;
            if (g0Var != null && zArr[6]) {
                fVar.e(6, g0Var.f297764d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b0 b0Var = this.f297676m;
            if (b0Var != null && zArr[7]) {
                fVar.i(7, b0Var.mo75928xcd1e8d8());
                this.f297676m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c0 c0Var2 = this.f297670d;
            if (c0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, c0Var2.f297640d);
            }
            java.lang.String str4 = this.f297671e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            java.lang.String str5 = this.f297673g;
            if (str5 != null && zArr[4]) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f297674h;
            if (str6 != null && zArr[5]) {
                g17 += b36.f.j(5, str6);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g0 g0Var2 = this.f297675i;
            if (g0Var2 != null && zArr[6]) {
                g17 += b36.f.e(6, g0Var2.f297764d);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b0 b0Var2 = this.f297676m;
            return (b0Var2 == null || !zArr[7]) ? g17 : g17 + b36.f.i(7, b0Var2.mo75928xcd1e8d8());
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
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c0 c0Var3 = null;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g0 g0Var3 = null;
        switch (intValue) {
            case 1:
                int g18 = aVar2.g(intValue);
                if (g18 == 0) {
                    c0Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c0.UNKnown;
                } else if (g18 == 1) {
                    c0Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c0.Audio;
                } else if (g18 == 2) {
                    c0Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c0.Multi;
                } else if (g18 == 3) {
                    c0Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c0.MultiChatBot;
                }
                this.f297670d = c0Var3;
                zArr[1] = true;
                return 0;
            case 2:
                this.f297671e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a0 a0Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a0();
                    if (bArr != null && bArr.length > 0) {
                        a0Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(a0Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f297673g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f297674h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                switch (aVar2.g(intValue)) {
                    case 0:
                        g0Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g0.ChatbotBizType_Unknown;
                        break;
                    case 1:
                        g0Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g0.ChatbotBizType_AIAssist;
                        break;
                    case 2:
                        g0Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g0.ChatbotBizType_AISocial;
                        break;
                    case 3:
                        g0Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g0.ChatbotBizType_AIWeapp;
                        break;
                    case 4:
                        g0Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g0.ChatbotBizType_AIPodcast;
                        break;
                    case 5:
                        g0Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g0.ChatbotBizType_MPChat;
                        break;
                    case 6:
                        g0Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g0.ChatbotBizType_AIBlueMicro;
                        break;
                    case 7:
                        g0Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g0.ChatbotBizType_AIVoIPDemo;
                        break;
                    case 8:
                        g0Var3 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.g0.ChatbotBizType_ESCStore;
                        break;
                }
                this.f297675i = g0Var3;
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b0 b0Var3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b0();
                    if (bArr2 != null && bArr2.length > 0) {
                        b0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f297676m = b0Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
