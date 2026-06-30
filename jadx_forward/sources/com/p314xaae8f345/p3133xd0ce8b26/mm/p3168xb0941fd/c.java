package com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd;

/* loaded from: classes11.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f300390d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f300391e = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f300392f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f300393g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f300394h = false;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c cVar = (com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c) fVar;
        return n51.f.a(this.f300390d, cVar.f300390d) && n51.f.a(this.f300391e, cVar.f300391e) && n51.f.a(java.lang.Boolean.valueOf(this.f300392f), java.lang.Boolean.valueOf(cVar.f300392f)) && n51.f.a(java.lang.Boolean.valueOf(this.f300393g), java.lang.Boolean.valueOf(cVar.f300393g)) && n51.f.a(java.lang.Boolean.valueOf(this.f300394h), java.lang.Boolean.valueOf(cVar.f300394h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.c();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f300390d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f300391e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.a(3, this.f300392f);
            fVar.a(4, this.f300393g);
            fVar.a(5, this.f300394h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f300390d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f300391e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.a(3, this.f300392f) + b36.f.a(4, this.f300393g) + b36.f.a(5, this.f300394h);
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
        if (intValue == 1) {
            this.f300390d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f300391e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f300392f = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            this.f300393g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f300394h = aVar2.c(intValue);
        return 0;
    }
}
