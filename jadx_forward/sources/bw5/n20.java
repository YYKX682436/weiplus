package bw5;

/* loaded from: classes4.dex */
public class n20 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f112000d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f112001e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f112002f = new boolean[3];

    static {
        new bw5.n20();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n20 mo11468x92b714fd(byte[] bArr) {
        return (bw5.n20) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n20)) {
            return false;
        }
        bw5.n20 n20Var = (bw5.n20) fVar;
        return n51.f.a(this.f112000d, n20Var.f112000d) && n51.f.a(this.f112001e, n20Var.f112001e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.n20();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112002f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f112000d;
            if (gVar != null && zArr[1]) {
                fVar.b(1, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f112001e;
            if (gVar2 != null && zArr[2]) {
                fVar.b(2, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f112000d;
            if (gVar3 != null && zArr[1]) {
                i18 = 0 + b36.f.b(1, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f112001e;
            return (gVar4 == null || !zArr[2]) ? i18 : i18 + b36.f.b(2, gVar4);
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
            this.f112000d = aVar2.d(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f112001e = aVar2.d(intValue);
        zArr[2] = true;
        return 0;
    }
}
