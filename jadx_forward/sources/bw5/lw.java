package bw5;

/* loaded from: classes2.dex */
public class lw extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.yr f111527d;

    /* renamed from: e, reason: collision with root package name */
    public int f111528e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f111529f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f111530g = new boolean[4];

    static {
        new bw5.lw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lw mo11468x92b714fd(byte[] bArr) {
        return (bw5.lw) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lw)) {
            return false;
        }
        bw5.lw lwVar = (bw5.lw) fVar;
        return n51.f.a(this.f111527d, lwVar.f111527d) && n51.f.a(java.lang.Integer.valueOf(this.f111528e), java.lang.Integer.valueOf(lwVar.f111528e)) && n51.f.a(this.f111529f, lwVar.f111529f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.lw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111530g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.yr yrVar = this.f111527d;
            if (yrVar != null && zArr[1]) {
                fVar.i(1, yrVar.mo75928xcd1e8d8());
                this.f111527d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111528e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f111529f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.yr yrVar2 = this.f111527d;
            if (yrVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, yrVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f111528e);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f111529f;
            return (gVar2 == null || !zArr[3]) ? i18 : i18 + b36.f.b(3, gVar2);
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f111528e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f111529f = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.yr yrVar3 = new bw5.yr();
            if (bArr != null && bArr.length > 0) {
                yrVar3.mo11468x92b714fd(bArr);
            }
            this.f111527d = yrVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
