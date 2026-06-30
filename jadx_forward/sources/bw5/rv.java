package bw5;

/* loaded from: classes2.dex */
public class rv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f114222d;

    /* renamed from: e, reason: collision with root package name */
    public float f114223e;

    /* renamed from: f, reason: collision with root package name */
    public float f114224f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f114225g = new boolean[4];

    static {
        new bw5.rv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rv mo11468x92b714fd(byte[] bArr) {
        return (bw5.rv) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rv)) {
            return false;
        }
        bw5.rv rvVar = (bw5.rv) fVar;
        return n51.f.a(this.f114222d, rvVar.f114222d) && n51.f.a(java.lang.Float.valueOf(this.f114223e), java.lang.Float.valueOf(rvVar.f114223e)) && n51.f.a(java.lang.Float.valueOf(this.f114224f), java.lang.Float.valueOf(rvVar.f114224f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.rv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114225g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f114222d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.d(2, this.f114223e);
            }
            if (zArr[3]) {
                fVar.d(3, this.f114224f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f114222d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.d(2, this.f114223e);
            }
            return zArr[3] ? i18 + b36.f.d(3, this.f114224f) : i18;
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
            this.f114222d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f114223e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f114224f = aVar2.f(intValue);
        zArr[3] = true;
        return 0;
    }
}
