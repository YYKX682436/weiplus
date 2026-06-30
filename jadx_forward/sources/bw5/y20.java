package bw5;

/* loaded from: classes2.dex */
public class y20 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f116865d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116866e;

    /* renamed from: f, reason: collision with root package name */
    public int f116867f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f116868g = new boolean[4];

    static {
        new bw5.y20();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.y20 mo11468x92b714fd(byte[] bArr) {
        return (bw5.y20) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y20)) {
            return false;
        }
        bw5.y20 y20Var = (bw5.y20) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f116865d), java.lang.Integer.valueOf(y20Var.f116865d)) && n51.f.a(this.f116866e, y20Var.f116866e) && n51.f.a(java.lang.Integer.valueOf(this.f116867f), java.lang.Integer.valueOf(y20Var.f116867f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.y20();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116868g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f116865d);
            }
            java.lang.String str = this.f116866e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f116867f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f116865d) : 0;
            java.lang.String str2 = this.f116866e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            return zArr[3] ? e17 + b36.f.e(3, this.f116867f) : e17;
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
            this.f116865d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f116866e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f116867f = aVar2.g(intValue);
        zArr[3] = true;
        return 0;
    }
}
