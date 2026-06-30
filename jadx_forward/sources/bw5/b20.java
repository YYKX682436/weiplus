package bw5;

/* loaded from: classes2.dex */
public class b20 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107028d;

    /* renamed from: e, reason: collision with root package name */
    public long f107029e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.q5 f107030f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f107031g = new boolean[4];

    static {
        new bw5.b20();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b20 mo11468x92b714fd(byte[] bArr) {
        return (bw5.b20) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b20)) {
            return false;
        }
        bw5.b20 b20Var = (bw5.b20) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107028d), java.lang.Integer.valueOf(b20Var.f107028d)) && n51.f.a(java.lang.Long.valueOf(this.f107029e), java.lang.Long.valueOf(b20Var.f107029e)) && n51.f.a(this.f107030f, b20Var.f107030f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.b20();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107031g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107028d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f107029e);
            }
            bw5.q5 q5Var = this.f107030f;
            if (q5Var != null && zArr[3]) {
                fVar.i(3, q5Var.mo75928xcd1e8d8());
                this.f107030f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107028d) : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f107029e);
            }
            bw5.q5 q5Var2 = this.f107030f;
            return (q5Var2 == null || !zArr[3]) ? e17 : e17 + b36.f.i(3, q5Var2.mo75928xcd1e8d8());
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
            this.f107028d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107029e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.q5 q5Var3 = new bw5.q5();
            if (bArr != null && bArr.length > 0) {
                q5Var3.mo11468x92b714fd(bArr);
            }
            this.f107030f = q5Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
