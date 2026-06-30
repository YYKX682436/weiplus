package bw5;

/* loaded from: classes2.dex */
public class uq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f115563d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.fr f115564e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f115565f = new boolean[3];

    static {
        new bw5.uq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.uq mo11468x92b714fd(byte[] bArr) {
        return (bw5.uq) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.uq)) {
            return false;
        }
        bw5.uq uqVar = (bw5.uq) fVar;
        return n51.f.a(this.f115563d, uqVar.f115563d) && n51.f.a(this.f115564e, uqVar.f115564e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.uq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115565f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f115563d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.fr frVar = this.f115564e;
            if (frVar != null && zArr[2]) {
                fVar.i(2, frVar.mo75928xcd1e8d8());
                this.f115564e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f115563d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.fr frVar2 = this.f115564e;
            return (frVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, frVar2.mo75928xcd1e8d8());
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
            this.f115563d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.fr frVar3 = new bw5.fr();
            if (bArr != null && bArr.length > 0) {
                frVar3.mo11468x92b714fd(bArr);
            }
            this.f115564e = frVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
