package bw5;

/* loaded from: classes11.dex */
public class r1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f113895d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.dj0 f113896e;

    /* renamed from: f, reason: collision with root package name */
    public long f113897f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f113898g = new boolean[4];

    static {
        new bw5.r1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.r1 mo11468x92b714fd(byte[] bArr) {
        return (bw5.r1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r1)) {
            return false;
        }
        bw5.r1 r1Var = (bw5.r1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f113895d), java.lang.Long.valueOf(r1Var.f113895d)) && n51.f.a(this.f113896e, r1Var.f113896e) && n51.f.a(java.lang.Long.valueOf(this.f113897f), java.lang.Long.valueOf(r1Var.f113897f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.r1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113898g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f113895d);
            }
            bw5.dj0 dj0Var = this.f113896e;
            if (dj0Var != null && zArr[2]) {
                fVar.i(2, dj0Var.mo75928xcd1e8d8());
                this.f113896e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.h(3, this.f113897f);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f113895d) : 0;
            bw5.dj0 dj0Var2 = this.f113896e;
            if (dj0Var2 != null && zArr[2]) {
                h17 += b36.f.i(2, dj0Var2.mo75928xcd1e8d8());
            }
            return zArr[3] ? h17 + b36.f.h(3, this.f113897f) : h17;
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
            this.f113895d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f113897f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.dj0 dj0Var3 = new bw5.dj0();
            if (bArr != null && bArr.length > 0) {
                dj0Var3.mo11468x92b714fd(bArr);
            }
            this.f113896e = dj0Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
