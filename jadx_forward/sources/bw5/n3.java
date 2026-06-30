package bw5;

/* loaded from: classes2.dex */
public class n3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f112003d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112004e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f112005f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f112006g = new boolean[4];

    static {
        new bw5.n3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n3 mo11468x92b714fd(byte[] bArr) {
        return (bw5.n3) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n3)) {
            return false;
        }
        bw5.n3 n3Var = (bw5.n3) fVar;
        return n51.f.a(this.f112003d, n3Var.f112003d) && n51.f.a(this.f112004e, n3Var.f112004e) && n51.f.a(java.lang.Boolean.valueOf(this.f112005f), java.lang.Boolean.valueOf(n3Var.f112005f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.n3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112006g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f112003d;
            if (gVar != null && zArr[1]) {
                fVar.b(1, gVar);
            }
            java.lang.String str = this.f112004e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f112005f);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f112003d;
            if (gVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.b(1, gVar2);
            }
            java.lang.String str2 = this.f112004e;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            return zArr[3] ? i18 + b36.f.a(3, this.f112005f) : i18;
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
            this.f112003d = aVar2.d(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f112004e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f112005f = aVar2.c(intValue);
        zArr[3] = true;
        return 0;
    }
}
