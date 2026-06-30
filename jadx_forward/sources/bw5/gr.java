package bw5;

/* loaded from: classes2.dex */
public class gr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f109501d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109502e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ae f109503f;

    /* renamed from: g, reason: collision with root package name */
    public long f109504g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109505h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f109506i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f109507m = new boolean[7];

    static {
        new bw5.gr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gr mo11468x92b714fd(byte[] bArr) {
        return (bw5.gr) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gr)) {
            return false;
        }
        bw5.gr grVar = (bw5.gr) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f109501d), java.lang.Long.valueOf(grVar.f109501d)) && n51.f.a(this.f109502e, grVar.f109502e) && n51.f.a(this.f109503f, grVar.f109503f) && n51.f.a(java.lang.Long.valueOf(this.f109504g), java.lang.Long.valueOf(grVar.f109504g)) && n51.f.a(this.f109505h, grVar.f109505h) && n51.f.a(this.f109506i, grVar.f109506i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109507m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f109501d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f109502e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            bw5.ae aeVar = this.f109503f;
            if (aeVar != null && zArr[3]) {
                fVar.i(3, aeVar.mo75928xcd1e8d8());
                this.f109503f.mo75956x3d5d1f78(fVar);
            }
            if (zArr[4]) {
                fVar.h(4, this.f109504g);
            }
            java.lang.String str = this.f109505h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f109506i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f109501d) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f109502e;
            if (gVar2 != null && zArr[2]) {
                h17 += b36.f.b(2, gVar2);
            }
            bw5.ae aeVar2 = this.f109503f;
            if (aeVar2 != null && zArr[3]) {
                h17 += b36.f.i(3, aeVar2.mo75928xcd1e8d8());
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f109504g);
            }
            java.lang.String str3 = this.f109505h;
            if (str3 != null && zArr[5]) {
                h17 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f109506i;
            return (str4 == null || !zArr[6]) ? h17 : h17 + b36.f.j(6, str4);
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
                this.f109501d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109502e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ae aeVar3 = new bw5.ae();
                    if (bArr != null && bArr.length > 0) {
                        aeVar3.mo11468x92b714fd(bArr);
                    }
                    this.f109503f = aeVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f109504g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109505h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109506i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
