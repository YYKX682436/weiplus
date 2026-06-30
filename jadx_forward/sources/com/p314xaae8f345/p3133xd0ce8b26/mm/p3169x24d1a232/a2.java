package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class a2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f300800d;

    /* renamed from: e, reason: collision with root package name */
    public int f300801e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f300802f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f300803g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f300804h;

    /* renamed from: m, reason: collision with root package name */
    public int f300806m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f300807n;

    /* renamed from: o, reason: collision with root package name */
    public int f300808o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f300809p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f300810q;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f300805i = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f300811r = new boolean[12];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a2 a2Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f300800d), java.lang.Integer.valueOf(a2Var.f300800d)) && n51.f.a(java.lang.Integer.valueOf(this.f300801e), java.lang.Integer.valueOf(a2Var.f300801e)) && n51.f.a(this.f300802f, a2Var.f300802f) && n51.f.a(this.f300803g, a2Var.f300803g) && n51.f.a(this.f300804h, a2Var.f300804h) && n51.f.a(this.f300805i, a2Var.f300805i) && n51.f.a(java.lang.Integer.valueOf(this.f300806m), java.lang.Integer.valueOf(a2Var.f300806m)) && n51.f.a(this.f300807n, a2Var.f300807n) && n51.f.a(java.lang.Integer.valueOf(this.f300808o), java.lang.Integer.valueOf(a2Var.f300808o)) && n51.f.a(this.f300809p, a2Var.f300809p) && n51.f.a(this.f300810q, a2Var.f300810q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f300805i;
        boolean[] zArr = this.f300811r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f300800d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f300801e);
            }
            java.lang.String str = this.f300802f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f300803g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f300804h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            fVar.g(6, 8, linkedList);
            if (zArr[7]) {
                fVar.e(7, this.f300806m);
            }
            java.lang.String str4 = this.f300807n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            if (zArr[9]) {
                fVar.e(9, this.f300808o);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f300809p;
            if (gVar != null && zArr[10]) {
                fVar.b(10, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f300810q;
            if (gVar2 == null || !zArr[11]) {
                return 0;
            }
            fVar.b(11, gVar2);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f300800d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f300801e);
            }
            java.lang.String str5 = this.f300802f;
            if (str5 != null && zArr[3]) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f300803g;
            if (str6 != null && zArr[4]) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f300804h;
            if (str7 != null && zArr[5]) {
                e17 += b36.f.j(5, str7);
            }
            int g17 = e17 + b36.f.g(6, 8, linkedList);
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f300806m);
            }
            java.lang.String str8 = this.f300807n;
            if (str8 != null && zArr[8]) {
                g17 += b36.f.j(8, str8);
            }
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f300808o);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f300809p;
            if (gVar3 != null && zArr[10]) {
                g17 += b36.f.b(10, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f300810q;
            return (gVar4 == null || !zArr[11]) ? g17 : g17 + b36.f.b(11, gVar4);
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
        switch (intValue) {
            case 1:
                this.f300800d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f300801e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f300802f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f300803g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f300804h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a2 a2Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.a2();
                    if (bArr != null && bArr.length > 0) {
                        a2Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(a2Var);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f300806m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f300807n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f300808o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f300809p = aVar2.d(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f300810q = aVar2.d(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
