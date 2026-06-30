package bw5;

/* loaded from: classes2.dex */
public class q80 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.c80 f113527d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113528e;

    /* renamed from: f, reason: collision with root package name */
    public long f113529f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f113530g = new boolean[4];

    static {
        new bw5.q80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.q80 mo11468x92b714fd(byte[] bArr) {
        return (bw5.q80) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q80)) {
            return false;
        }
        bw5.q80 q80Var = (bw5.q80) fVar;
        return n51.f.a(this.f113527d, q80Var.f113527d) && n51.f.a(this.f113528e, q80Var.f113528e) && n51.f.a(java.lang.Long.valueOf(this.f113529f), java.lang.Long.valueOf(q80Var.f113529f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.q80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113530g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.c80 c80Var = this.f113527d;
            if (c80Var != null && zArr[1]) {
                fVar.i(1, c80Var.mo75928xcd1e8d8());
                this.f113527d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f113528e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f113529f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.c80 c80Var2 = this.f113527d;
            if (c80Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, c80Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f113528e;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            return zArr[3] ? i18 + b36.f.h(3, this.f113529f) : i18;
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
            if (intValue == 2) {
                this.f113528e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f113529f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.c80 c80Var3 = new bw5.c80();
            if (bArr != null && bArr.length > 0) {
                c80Var3.mo11468x92b714fd(bArr);
            }
            this.f113527d = c80Var3;
        }
        zArr[1] = true;
        return 0;
    }
}
