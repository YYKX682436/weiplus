package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes2.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f297316d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f297317e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f297318f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f297319g;

    /* renamed from: h, reason: collision with root package name */
    public long f297320h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f297321i;

    /* renamed from: m, reason: collision with root package name */
    public long f297322m;

    /* renamed from: n, reason: collision with root package name */
    public long f297323n;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f297326q;

    /* renamed from: r, reason: collision with root package name */
    public int f297327r;

    /* renamed from: s, reason: collision with root package name */
    public int f297328s;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f297324o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f297325p = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f297329t = new boolean[14];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.b mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.b) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.b)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.b bVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f297316d), java.lang.Integer.valueOf(bVar.f297316d)) && n51.f.a(this.f297317e, bVar.f297317e) && n51.f.a(this.f297318f, bVar.f297318f) && n51.f.a(this.f297319g, bVar.f297319g) && n51.f.a(java.lang.Long.valueOf(this.f297320h), java.lang.Long.valueOf(bVar.f297320h)) && n51.f.a(this.f297321i, bVar.f297321i) && n51.f.a(java.lang.Long.valueOf(this.f297322m), java.lang.Long.valueOf(bVar.f297322m)) && n51.f.a(java.lang.Long.valueOf(this.f297323n), java.lang.Long.valueOf(bVar.f297323n)) && n51.f.a(this.f297324o, bVar.f297324o) && n51.f.a(this.f297325p, bVar.f297325p) && n51.f.a(this.f297326q, bVar.f297326q) && n51.f.a(java.lang.Integer.valueOf(this.f297327r), java.lang.Integer.valueOf(bVar.f297327r)) && n51.f.a(java.lang.Integer.valueOf(this.f297328s), java.lang.Integer.valueOf(bVar.f297328s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f297325p;
        java.util.LinkedList linkedList2 = this.f297324o;
        boolean[] zArr = this.f297329t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f297316d);
            }
            java.lang.String str = this.f297317e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f297318f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f297319g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.h(5, this.f297320h);
            }
            java.lang.String str4 = this.f297321i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.h(7, this.f297322m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f297323n);
            }
            fVar.g(9, 1, linkedList2);
            fVar.g(10, 2, linkedList);
            java.lang.String str5 = this.f297326q;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            if (zArr[12]) {
                fVar.e(12, this.f297327r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f297328s);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f297316d) + 0 : 0;
            java.lang.String str6 = this.f297317e;
            if (str6 != null && zArr[2]) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f297318f;
            if (str7 != null && zArr[3]) {
                e17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f297319g;
            if (str8 != null && zArr[4]) {
                e17 += b36.f.j(4, str8);
            }
            if (zArr[5]) {
                e17 += b36.f.h(5, this.f297320h);
            }
            java.lang.String str9 = this.f297321i;
            if (str9 != null && zArr[6]) {
                e17 += b36.f.j(6, str9);
            }
            if (zArr[7]) {
                e17 += b36.f.h(7, this.f297322m);
            }
            if (zArr[8]) {
                e17 += b36.f.h(8, this.f297323n);
            }
            int g17 = e17 + b36.f.g(9, 1, linkedList2) + b36.f.g(10, 2, linkedList);
            java.lang.String str10 = this.f297326q;
            if (str10 != null && zArr[11]) {
                g17 += b36.f.j(11, str10);
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f297327r);
            }
            return zArr[13] ? g17 + b36.f.e(13, this.f297328s) : g17;
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
                this.f297316d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f297317e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f297318f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f297319g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f297320h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f297321i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f297322m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f297323n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                linkedList2.add(aVar2.k(intValue));
                zArr[9] = true;
                return 0;
            case 10:
                linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[10] = true;
                return 0;
            case 11:
                this.f297326q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f297327r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f297328s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
