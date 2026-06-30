package bw5;

/* loaded from: classes11.dex */
public class l2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.m2 f111140d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f111141e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f111142f = new boolean[3];

    static {
        new bw5.l2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.l2 mo11468x92b714fd(byte[] bArr) {
        return (bw5.l2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l2)) {
            return false;
        }
        bw5.l2 l2Var = (bw5.l2) fVar;
        return n51.f.a(this.f111140d, l2Var.f111140d) && n51.f.a(this.f111141e, l2Var.f111141e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.l2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111142f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.m2 m2Var = this.f111140d;
            if (m2Var != null && zArr[1]) {
                fVar.e(1, m2Var.f111584d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f111141e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.m2 m2Var2 = this.f111140d;
            if (m2Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, m2Var2.f111584d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f111141e;
            return (gVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.b(2, gVar2);
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
            this.f111140d = bw5.m2.a(aVar2.g(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f111141e = aVar2.d(intValue);
        zArr[2] = true;
        return 0;
    }
}
