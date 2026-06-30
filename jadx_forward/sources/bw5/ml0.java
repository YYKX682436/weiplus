package bw5;

/* loaded from: classes2.dex */
public class ml0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final bw5.ml0 f111813h = new bw5.ml0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f111814d;

    /* renamed from: e, reason: collision with root package name */
    public int f111815e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111816f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f111817g = new boolean[4];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ml0)) {
            return false;
        }
        bw5.ml0 ml0Var = (bw5.ml0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f111814d), java.lang.Boolean.valueOf(ml0Var.f111814d)) && n51.f.a(java.lang.Integer.valueOf(this.f111815e), java.lang.Integer.valueOf(ml0Var.f111815e)) && n51.f.a(this.f111816f, ml0Var.f111816f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ml0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111817g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f111814d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111815e);
            }
            java.lang.String str = this.f111816f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f111814d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f111815e);
            }
            java.lang.String str2 = this.f111816f;
            return (str2 == null || !zArr[3]) ? a17 : a17 + b36.f.j(3, str2);
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
            this.f111814d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f111815e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f111816f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.ml0) super.mo11468x92b714fd(bArr);
    }
}
