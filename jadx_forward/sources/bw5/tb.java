package bw5;

/* loaded from: classes10.dex */
public class tb extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f114877d;

    /* renamed from: e, reason: collision with root package name */
    public int f114878e;

    /* renamed from: f, reason: collision with root package name */
    public long f114879f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f114880g = new boolean[4];

    static {
        new bw5.tb();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tb mo11468x92b714fd(byte[] bArr) {
        return (bw5.tb) super.mo11468x92b714fd(bArr);
    }

    public bw5.tb c(long j17) {
        this.f114879f = j17;
        this.f114880g[3] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tb)) {
            return false;
        }
        bw5.tb tbVar = (bw5.tb) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f114877d), java.lang.Integer.valueOf(tbVar.f114877d)) && n51.f.a(java.lang.Integer.valueOf(this.f114878e), java.lang.Integer.valueOf(tbVar.f114878e)) && n51.f.a(java.lang.Long.valueOf(this.f114879f), java.lang.Long.valueOf(tbVar.f114879f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.tb();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114880g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f114877d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f114878e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f114879f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f114877d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f114878e);
            }
            return zArr[3] ? e17 + b36.f.h(3, this.f114879f) : e17;
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
            this.f114877d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f114878e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f114879f = aVar2.i(intValue);
        zArr[3] = true;
        return 0;
    }
}
