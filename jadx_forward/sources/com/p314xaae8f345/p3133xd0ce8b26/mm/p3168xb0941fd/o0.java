package com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd;

/* loaded from: classes4.dex */
public class o0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: o, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o0 f300641o = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f300642d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f300643e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f300644f = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f300645g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f300646h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f300647i = "";

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k0 f300648m = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k0();

    /* renamed from: n, reason: collision with root package name */
    public boolean f300649n = false;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o0 o0Var = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o0) fVar;
        return n51.f.a(this.f300642d, o0Var.f300642d) && n51.f.a(this.f300643e, o0Var.f300643e) && n51.f.a(java.lang.Integer.valueOf(this.f300644f), java.lang.Integer.valueOf(o0Var.f300644f)) && n51.f.a(this.f300645g, o0Var.f300645g) && n51.f.a(this.f300646h, o0Var.f300646h) && n51.f.a(this.f300647i, o0Var.f300647i) && n51.f.a(this.f300648m, o0Var.f300648m) && n51.f.a(java.lang.Boolean.valueOf(this.f300649n), java.lang.Boolean.valueOf(o0Var.f300649n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f300643e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f300642d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f300644f);
            java.lang.String str2 = this.f300645g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f300646h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f300647i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k0 k0Var = this.f300648m;
            if (k0Var != null) {
                fVar.i(7, k0Var.mo75928xcd1e8d8());
                this.f300648m.mo75956x3d5d1f78(fVar);
            }
            fVar.a(8, this.f300649n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f300642d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f300644f);
            java.lang.String str6 = this.f300645g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f300646h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f300647i;
            if (str8 != null) {
                j17 += b36.f.j(6, str8);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k0 k0Var2 = this.f300648m;
            if (k0Var2 != null) {
                j17 += b36.f.i(7, k0Var2.mo75928xcd1e8d8());
            }
            return j17 + b36.f.a(8, this.f300649n);
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
                this.f300642d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.n0 n0Var = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.n0();
                    if (bArr != null && bArr.length > 0) {
                        n0Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(n0Var);
                }
                return 0;
            case 3:
                this.f300644f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f300645g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f300646h = aVar2.k(intValue);
                return 0;
            case 6:
                this.f300647i = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k0 k0Var3 = new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.k0();
                    if (bArr2 != null && bArr2.length > 0) {
                        k0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f300648m = k0Var3;
                }
                return 0;
            case 8:
                this.f300649n = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.o0) super.mo11468x92b714fd(bArr);
    }
}
