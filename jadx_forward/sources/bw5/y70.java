package bw5;

/* loaded from: classes2.dex */
public class y70 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116925d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.v70 f116926e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f116927f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f116928g = new boolean[4];

    static {
        new bw5.y70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.y70 mo11468x92b714fd(byte[] bArr) {
        return (bw5.y70) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y70)) {
            return false;
        }
        bw5.y70 y70Var = (bw5.y70) fVar;
        return n51.f.a(this.f116925d, y70Var.f116925d) && n51.f.a(this.f116926e, y70Var.f116926e) && n51.f.a(java.lang.Boolean.valueOf(this.f116927f), java.lang.Boolean.valueOf(y70Var.f116927f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.y70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116928g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f116925d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.v70 v70Var = this.f116926e;
            if (v70Var != null && zArr[2]) {
                fVar.i(2, v70Var.mo75928xcd1e8d8());
                this.f116926e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.a(3, this.f116927f);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f116925d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.v70 v70Var2 = this.f116926e;
            if (v70Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, v70Var2.mo75928xcd1e8d8());
            }
            return zArr[3] ? i18 + b36.f.a(3, this.f116927f) : i18;
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
            this.f116925d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f116927f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.v70 v70Var3 = new bw5.v70();
            if (bArr != null && bArr.length > 0) {
                v70Var3.mo11468x92b714fd(bArr);
            }
            this.f116926e = v70Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
