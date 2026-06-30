package com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f;

/* loaded from: classes2.dex */
public class c2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f297654f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f297655g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f297656h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f297657i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f297658m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f297659n;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f297652d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f297653e = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f297660o = new boolean[9];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c2 c2Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c2) fVar;
        return n51.f.a(this.f297652d, c2Var.f297652d) && n51.f.a(this.f297653e, c2Var.f297653e) && n51.f.a(this.f297654f, c2Var.f297654f) && n51.f.a(this.f297655g, c2Var.f297655g) && n51.f.a(this.f297656h, c2Var.f297656h) && n51.f.a(this.f297657i, c2Var.f297657i) && n51.f.a(this.f297658m, c2Var.f297658m) && n51.f.a(this.f297659n, c2Var.f297659n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.c2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f297653e;
        java.util.LinkedList linkedList2 = this.f297652d;
        boolean[] zArr = this.f297660o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f297654f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f297655g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f297656h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f297657i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f297658m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f297659n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0 + b36.f.g(2, 8, linkedList);
            java.lang.String str7 = this.f297654f;
            if (str7 != null && zArr[3]) {
                g17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f297655g;
            if (str8 != null && zArr[4]) {
                g17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f297656h;
            if (str9 != null && zArr[5]) {
                g17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f297657i;
            if (str10 != null && zArr[6]) {
                g17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f297658m;
            if (str11 != null && zArr[7]) {
                g17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f297659n;
            return (str12 == null || !zArr[8]) ? g17 : g17 + b36.f.j(8, str12);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a2 a2Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.a2();
                    if (bArr != null && bArr.length > 0) {
                        a2Var.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(a2Var);
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b2 b2Var = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b2();
                    if (bArr2 != null && bArr2.length > 0) {
                        b2Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(b2Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f297654f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f297655g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f297656h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f297657i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f297658m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f297659n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
