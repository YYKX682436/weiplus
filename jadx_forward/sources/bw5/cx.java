package bw5;

/* loaded from: classes2.dex */
public class cx extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.bx f107770d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107771e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f107772f = new boolean[3];

    static {
        new bw5.cx();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cx mo11468x92b714fd(byte[] bArr) {
        return (bw5.cx) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cx)) {
            return false;
        }
        bw5.cx cxVar = (bw5.cx) fVar;
        return n51.f.a(this.f107770d, cxVar.f107770d) && n51.f.a(this.f107771e, cxVar.f107771e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.cx();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107772f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.bx bxVar = this.f107770d;
            if (bxVar != null && zArr[1]) {
                fVar.e(1, bxVar.f107393d);
            }
            java.lang.String str = this.f107771e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.bx bxVar2 = this.f107770d;
            if (bxVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, bxVar2.f107393d);
            }
            java.lang.String str2 = this.f107771e;
            return (str2 == null || !zArr[2]) ? i18 : i18 + b36.f.j(2, str2);
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
            int g17 = aVar2.g(intValue);
            this.f107770d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 30000 ? null : bw5.bx.Invalid : bw5.bx.Origin : bw5.bx.English : bw5.bx.Chinese;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f107771e = aVar2.k(intValue);
        zArr[2] = true;
        return 0;
    }
}
