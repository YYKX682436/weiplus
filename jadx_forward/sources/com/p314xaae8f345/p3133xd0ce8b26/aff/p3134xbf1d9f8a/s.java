package com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a;

/* loaded from: classes7.dex */
public class s extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f297507d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f297508e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f297509f = 0;

    /* renamed from: g, reason: collision with root package name */
    public long f297510g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f297511h = false;

    /* renamed from: i, reason: collision with root package name */
    public long f297512i = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f297513m = 0;

    static {
        new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.s();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.s mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.s) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.s)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.s sVar = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.s) fVar;
        return n51.f.a(this.f297507d, sVar.f297507d) && n51.f.a(java.lang.Long.valueOf(this.f297508e), java.lang.Long.valueOf(sVar.f297508e)) && n51.f.a(java.lang.Long.valueOf(this.f297509f), java.lang.Long.valueOf(sVar.f297509f)) && n51.f.a(java.lang.Long.valueOf(this.f297510g), java.lang.Long.valueOf(sVar.f297510g)) && n51.f.a(java.lang.Boolean.valueOf(this.f297511h), java.lang.Boolean.valueOf(sVar.f297511h)) && n51.f.a(java.lang.Long.valueOf(this.f297512i), java.lang.Long.valueOf(sVar.f297512i)) && n51.f.a(java.lang.Long.valueOf(this.f297513m), java.lang.Long.valueOf(sVar.f297513m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.s();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f297507d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f297508e);
            fVar.h(3, this.f297509f);
            fVar.h(4, this.f297510g);
            fVar.a(5, this.f297511h);
            fVar.h(6, this.f297512i);
            fVar.h(8, this.f297513m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f297507d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f297508e) + b36.f.h(3, this.f297509f) + b36.f.h(4, this.f297510g) + b36.f.a(5, this.f297511h) + b36.f.h(6, this.f297512i) + b36.f.h(8, this.f297513m);
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
                this.f297507d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f297508e = aVar2.i(intValue);
                return 0;
            case 3:
                this.f297509f = aVar2.i(intValue);
                return 0;
            case 4:
                this.f297510g = aVar2.i(intValue);
                return 0;
            case 5:
                this.f297511h = aVar2.c(intValue);
                return 0;
            case 6:
                this.f297512i = aVar2.i(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                this.f297513m = aVar2.i(intValue);
                return 0;
        }
    }
}
