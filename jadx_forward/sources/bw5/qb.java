package bw5;

/* loaded from: classes11.dex */
public class qb extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.sm0 f113563d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f113564e = new boolean[2];

    static {
        new bw5.qb();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qb mo11468x92b714fd(byte[] bArr) {
        return (bw5.qb) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof bw5.qb) && n51.f.a(this.f113563d, ((bw5.qb) fVar).f113563d);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qb();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113564e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.sm0 sm0Var = this.f113563d;
            if (sm0Var != null && zArr[1]) {
                fVar.i(1, sm0Var.mo75928xcd1e8d8());
                this.f113563d.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.sm0 sm0Var2 = this.f113563d;
            if (sm0Var2 == null || !zArr[1]) {
                return 0;
            }
            return 0 + b36.f.i(1, sm0Var2.mo75928xcd1e8d8());
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
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.sm0 sm0Var3 = new bw5.sm0();
            if (bArr != null && bArr.length > 0) {
                sm0Var3.mo11468x92b714fd(bArr);
            }
            this.f113563d = sm0Var3;
        }
        zArr[1] = true;
        return 0;
    }
}
