package bw5;

/* loaded from: classes8.dex */
public class oi0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112638d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.xa0 f112639e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.v70 f112640f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f112641g = new boolean[4];

    static {
        new bw5.oi0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.oi0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.oi0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.oi0)) {
            return false;
        }
        bw5.oi0 oi0Var = (bw5.oi0) fVar;
        return n51.f.a(this.f112638d, oi0Var.f112638d) && n51.f.a(this.f112639e, oi0Var.f112639e) && n51.f.a(this.f112640f, oi0Var.f112640f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.oi0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112641g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112638d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.xa0 xa0Var = this.f112639e;
            if (xa0Var != null && zArr[2]) {
                fVar.i(2, xa0Var.mo75928xcd1e8d8());
                this.f112639e.mo75956x3d5d1f78(fVar);
            }
            bw5.v70 v70Var = this.f112640f;
            if (v70Var != null && zArr[3]) {
                fVar.i(3, v70Var.mo75928xcd1e8d8());
                this.f112640f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f112638d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.xa0 xa0Var2 = this.f112639e;
            if (xa0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, xa0Var2.mo75928xcd1e8d8());
            }
            bw5.v70 v70Var2 = this.f112640f;
            return (v70Var2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, v70Var2.mo75928xcd1e8d8());
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
            this.f112638d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.xa0 xa0Var3 = new bw5.xa0();
                if (bArr != null && bArr.length > 0) {
                    xa0Var3.mo11468x92b714fd(bArr);
                }
                this.f112639e = xa0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.v70 v70Var3 = new bw5.v70();
            if (bArr2 != null && bArr2.length > 0) {
                v70Var3.mo11468x92b714fd(bArr2);
            }
            this.f112640f = v70Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
