package bw5;

/* loaded from: classes2.dex */
public class qj extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.pj f113664d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f113665e = new boolean[2];

    static {
        new bw5.qj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qj mo11468x92b714fd(byte[] bArr) {
        return (bw5.qj) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof bw5.qj) && n51.f.a(this.f113664d, ((bw5.qj) fVar).f113664d);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.qj();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113665e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.pj pjVar = this.f113664d;
            if (pjVar != null && zArr[1]) {
                fVar.i(1, pjVar.mo75928xcd1e8d8());
                this.f113664d.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.pj pjVar2 = this.f113664d;
            if (pjVar2 == null || !zArr[1]) {
                return 0;
            }
            return 0 + b36.f.i(1, pjVar2.mo75928xcd1e8d8());
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
            bw5.pj pjVar3 = new bw5.pj();
            if (bArr != null && bArr.length > 0) {
                pjVar3.mo11468x92b714fd(bArr);
            }
            this.f113664d = pjVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
