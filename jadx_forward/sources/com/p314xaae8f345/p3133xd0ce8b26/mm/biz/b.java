package com.p314xaae8f345.p3133xd0ce8b26.mm.biz;

/* loaded from: classes8.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: u, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b f299420u = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b();

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u f299421d = new com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f299422e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f299423f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f299424g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f299425h = "";

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a f299426i = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a();

    /* renamed from: m, reason: collision with root package name */
    public boolean f299427m = false;

    /* renamed from: n, reason: collision with root package name */
    public int f299428n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f299429o = "";

    /* renamed from: p, reason: collision with root package name */
    public boolean f299430p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f299431q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f299432r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f299433s = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f299434t = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b bVar = (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b) fVar;
        return n51.f.a(this.f299421d, bVar.f299421d) && n51.f.a(this.f299422e, bVar.f299422e) && n51.f.a(this.f299423f, bVar.f299423f) && n51.f.a(this.f299424g, bVar.f299424g) && n51.f.a(this.f299425h, bVar.f299425h) && n51.f.a(this.f299426i, bVar.f299426i) && n51.f.a(java.lang.Boolean.valueOf(this.f299427m), java.lang.Boolean.valueOf(bVar.f299427m)) && n51.f.a(java.lang.Integer.valueOf(this.f299428n), java.lang.Integer.valueOf(bVar.f299428n)) && n51.f.a(this.f299429o, bVar.f299429o) && n51.f.a(java.lang.Boolean.valueOf(this.f299430p), java.lang.Boolean.valueOf(bVar.f299430p)) && n51.f.a(java.lang.Integer.valueOf(this.f299431q), java.lang.Integer.valueOf(bVar.f299431q)) && n51.f.a(java.lang.Integer.valueOf(this.f299432r), java.lang.Integer.valueOf(bVar.f299432r)) && n51.f.a(java.lang.Integer.valueOf(this.f299433s), java.lang.Integer.valueOf(bVar.f299433s)) && n51.f.a(java.lang.Integer.valueOf(this.f299434t), java.lang.Integer.valueOf(bVar.f299434t));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u uVar = this.f299421d;
            if (uVar != null) {
                fVar.i(1, uVar.mo75928xcd1e8d8());
                this.f299421d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f299422e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f299423f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f299424g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f299425h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a aVar = this.f299426i;
            if (aVar != null) {
                fVar.i(6, aVar.mo75928xcd1e8d8());
                this.f299426i.mo75956x3d5d1f78(fVar);
            }
            fVar.a(7, this.f299427m);
            fVar.e(8, this.f299428n);
            java.lang.String str5 = this.f299429o;
            if (str5 != null) {
                fVar.j(9, str5);
            }
            fVar.a(10, this.f299430p);
            fVar.e(11, this.f299431q);
            fVar.e(12, this.f299432r);
            fVar.e(13, this.f299433s);
            fVar.e(14, this.f299434t);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u uVar2 = this.f299421d;
            int i18 = uVar2 != null ? b36.f.i(1, uVar2.mo75928xcd1e8d8()) + 0 : 0;
            java.lang.String str6 = this.f299422e;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f299423f;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f299424g;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f299425h;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a aVar2 = this.f299426i;
            if (aVar2 != null) {
                i18 += b36.f.i(6, aVar2.mo75928xcd1e8d8());
            }
            int a17 = i18 + b36.f.a(7, this.f299427m) + b36.f.e(8, this.f299428n);
            java.lang.String str10 = this.f299429o;
            if (str10 != null) {
                a17 += b36.f.j(9, str10);
            }
            return a17 + b36.f.a(10, this.f299430p) + b36.f.e(11, this.f299431q) + b36.f.e(12, this.f299432r) + b36.f.e(13, this.f299433s) + b36.f.e(14, this.f299434t);
        }
        if (i17 == 2) {
            c36.a aVar3 = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar3)) {
                if (!super.mo75949x4476b383(aVar3, this, m75958x5767edba)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u uVar3 = new com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u();
                    if (bArr != null && bArr.length > 0) {
                        uVar3.mo11468x92b714fd(bArr);
                    }
                    this.f299421d = uVar3;
                }
                return 0;
            case 2:
                this.f299422e = aVar4.k(intValue);
                return 0;
            case 3:
                this.f299423f = aVar4.k(intValue);
                return 0;
            case 4:
                this.f299424g = aVar4.k(intValue);
                return 0;
            case 5:
                this.f299425h = aVar4.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a aVar5 = new com.p314xaae8f345.p3133xd0ce8b26.mm.biz.a();
                    if (bArr2 != null && bArr2.length > 0) {
                        aVar5.mo11468x92b714fd(bArr2);
                    }
                    this.f299426i = aVar5;
                }
                return 0;
            case 7:
                this.f299427m = aVar4.c(intValue);
                return 0;
            case 8:
                this.f299428n = aVar4.g(intValue);
                return 0;
            case 9:
                this.f299429o = aVar4.k(intValue);
                return 0;
            case 10:
                this.f299430p = aVar4.c(intValue);
                return 0;
            case 11:
                this.f299431q = aVar4.g(intValue);
                return 0;
            case 12:
                this.f299432r = aVar4.g(intValue);
                return 0;
            case 13:
                this.f299433s = aVar4.g(intValue);
                return 0;
            case 14:
                this.f299434t = aVar4.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.biz.b) super.mo11468x92b714fd(bArr);
    }
}
