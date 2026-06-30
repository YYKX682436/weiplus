package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes15.dex */
public class a0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0 f297307m = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f297308d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f297309e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f297310f = false;

    /* renamed from: g, reason: collision with root package name */
    public long f297311g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f297312h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f297313i = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0 a0Var = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0) fVar;
        return n51.f.a(this.f297308d, a0Var.f297308d) && n51.f.a(this.f297309e, a0Var.f297309e) && n51.f.a(java.lang.Boolean.valueOf(this.f297310f), java.lang.Boolean.valueOf(a0Var.f297310f)) && n51.f.a(java.lang.Long.valueOf(this.f297311g), java.lang.Long.valueOf(a0Var.f297311g)) && n51.f.a(java.lang.Long.valueOf(this.f297312h), java.lang.Long.valueOf(a0Var.f297312h)) && n51.f.a(java.lang.Long.valueOf(this.f297313i), java.lang.Long.valueOf(a0Var.f297313i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f297308d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f297309e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.a(3, this.f297310f);
            fVar.h(4, this.f297311g);
            fVar.h(5, this.f297312h);
            fVar.h(6, this.f297313i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f297308d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f297309e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.a(3, this.f297310f) + b36.f.h(4, this.f297311g) + b36.f.h(5, this.f297312h) + b36.f.h(6, this.f297313i);
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
                this.f297308d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f297309e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f297310f = aVar2.c(intValue);
                return 0;
            case 4:
                this.f297311g = aVar2.i(intValue);
                return 0;
            case 5:
                this.f297312h = aVar2.i(intValue);
                return 0;
            case 6:
                this.f297313i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
