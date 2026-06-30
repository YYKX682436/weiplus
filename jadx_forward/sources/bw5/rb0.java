package bw5;

/* loaded from: classes2.dex */
public class rb0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.e80 f114015d;

    /* renamed from: e, reason: collision with root package name */
    public int f114016e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f114017f = new boolean[3];

    static {
        new bw5.rb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rb0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.rb0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rb0)) {
            return false;
        }
        bw5.rb0 rb0Var = (bw5.rb0) fVar;
        return n51.f.a(this.f114015d, rb0Var.f114015d) && n51.f.a(java.lang.Integer.valueOf(this.f114016e), java.lang.Integer.valueOf(rb0Var.f114016e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.rb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f114017f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.e80 e80Var = this.f114015d;
            if (e80Var != null && zArr[1]) {
                fVar.i(1, e80Var.mo75928xcd1e8d8());
                this.f114015d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f114016e);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.e80 e80Var2 = this.f114015d;
            if (e80Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, e80Var2.mo75928xcd1e8d8());
            }
            return zArr[2] ? i18 + b36.f.e(2, this.f114016e) : i18;
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
            if (intValue != 2) {
                return -1;
            }
            this.f114016e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.e80 e80Var3 = new bw5.e80();
            if (bArr != null && bArr.length > 0) {
                e80Var3.mo11468x92b714fd(bArr);
            }
            this.f114015d = e80Var3;
        }
        zArr[1] = true;
        return 0;
    }
}
