package com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232;

/* loaded from: classes2.dex */
public class p3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f301271e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f301272f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f301273g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f301274h;

    /* renamed from: i, reason: collision with root package name */
    public int f301275i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f301270d = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f301276m = new boolean[7];

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.p3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.p3 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.p3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.p3)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.p3 p3Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.p3) fVar;
        return n51.f.a(this.f301270d, p3Var.f301270d) && n51.f.a(this.f301271e, p3Var.f301271e) && n51.f.a(this.f301272f, p3Var.f301272f) && n51.f.a(this.f301273g, p3Var.f301273g) && n51.f.a(java.lang.Boolean.valueOf(this.f301274h), java.lang.Boolean.valueOf(p3Var.f301274h)) && n51.f.a(java.lang.Integer.valueOf(this.f301275i), java.lang.Integer.valueOf(p3Var.f301275i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.p3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f301270d;
        boolean[] zArr = this.f301276m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f301271e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f301272f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f301273g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.a(5, this.f301274h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f301275i);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str4 = this.f301271e;
            if (str4 != null && zArr[2]) {
                g17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f301272f;
            if (str5 != null && zArr[3]) {
                g17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f301273g;
            if (str6 != null && zArr[4]) {
                g17 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                g17 += b36.f.a(5, this.f301274h);
            }
            return zArr[6] ? g17 + b36.f.e(6, this.f301275i) : g17;
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.n3 n3Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3169x24d1a232.n3();
                    if (bArr != null && bArr.length > 0) {
                        n3Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(n3Var);
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f301271e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f301272f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f301273g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f301274h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f301275i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
