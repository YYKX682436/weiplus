package bw5;

/* loaded from: classes2.dex */
public class q40 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.o50 f113470d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.a70 f113471e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f113472f = new boolean[3];

    static {
        new bw5.q40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.q40 mo11468x92b714fd(byte[] bArr) {
        return (bw5.q40) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q40)) {
            return false;
        }
        bw5.q40 q40Var = (bw5.q40) fVar;
        return n51.f.a(this.f113470d, q40Var.f113470d) && n51.f.a(this.f113471e, q40Var.f113471e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.q40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113472f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.o50 o50Var = this.f113470d;
            if (o50Var != null && zArr[1]) {
                fVar.i(1, o50Var.mo75928xcd1e8d8());
                this.f113470d.mo75956x3d5d1f78(fVar);
            }
            bw5.a70 a70Var = this.f113471e;
            if (a70Var != null && zArr[2]) {
                fVar.i(2, a70Var.mo75928xcd1e8d8());
                this.f113471e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.o50 o50Var2 = this.f113470d;
            if (o50Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, o50Var2.mo75928xcd1e8d8());
            }
            bw5.a70 a70Var2 = this.f113471e;
            return (a70Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, a70Var2.mo75928xcd1e8d8());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.o50 o50Var3 = new bw5.o50();
                if (bArr != null && bArr.length > 0) {
                    o50Var3.mo11468x92b714fd(bArr);
                }
                this.f113470d = o50Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.a70 a70Var3 = new bw5.a70();
            if (bArr2 != null && bArr2.length > 0) {
                a70Var3.mo11468x92b714fd(bArr2);
            }
            this.f113471e = a70Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
