package bw5;

/* loaded from: classes2.dex */
public class kz extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public float f111112d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f111113e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f111114f = new boolean[6];

    static {
        new bw5.kz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kz mo11468x92b714fd(byte[] bArr) {
        return (bw5.kz) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kz)) {
            return false;
        }
        bw5.kz kzVar = (bw5.kz) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f111112d), java.lang.Float.valueOf(kzVar.f111112d)) && n51.f.a(this.f111113e, kzVar.f111113e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.kz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111114f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[4]) {
                fVar.d(4, this.f111112d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f111113e;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int d17 = zArr[4] ? 0 + b36.f.d(4, this.f111112d) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f111113e;
            return (gVar2 == null || !zArr[5]) ? d17 : d17 + b36.f.b(5, gVar2);
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
        if (intValue == 4) {
            this.f111112d = aVar2.f(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f111113e = aVar2.d(intValue);
        zArr[5] = true;
        return 0;
    }
}
