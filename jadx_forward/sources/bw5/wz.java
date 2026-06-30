package bw5;

/* loaded from: classes2.dex */
public class wz extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f116411d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.vc0 f116412e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116413f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f116414g = new boolean[4];

    static {
        new bw5.wz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wz mo11468x92b714fd(byte[] bArr) {
        return (bw5.wz) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wz)) {
            return false;
        }
        bw5.wz wzVar = (bw5.wz) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f116411d), java.lang.Long.valueOf(wzVar.f116411d)) && n51.f.a(this.f116412e, wzVar.f116412e) && n51.f.a(this.f116413f, wzVar.f116413f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wz();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116414g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f116411d);
            }
            bw5.vc0 vc0Var = this.f116412e;
            if (vc0Var != null && zArr[2]) {
                fVar.i(2, vc0Var.mo75928xcd1e8d8());
                this.f116412e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f116413f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f116411d) : 0;
            bw5.vc0 vc0Var2 = this.f116412e;
            if (vc0Var2 != null && zArr[2]) {
                h17 += b36.f.i(2, vc0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f116413f;
            return (str2 == null || !zArr[3]) ? h17 : h17 + b36.f.j(3, str2);
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
            this.f116411d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f116413f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.vc0 vc0Var3 = new bw5.vc0();
            if (bArr != null && bArr.length > 0) {
                vc0Var3.mo11468x92b714fd(bArr);
            }
            this.f116412e = vc0Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
