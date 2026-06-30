package bw5;

/* loaded from: classes2.dex */
public class kl extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public boolean f110943e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f110942d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f110944f = new boolean[3];

    static {
        new bw5.kl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kl mo11468x92b714fd(byte[] bArr) {
        return (bw5.kl) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kl)) {
            return false;
        }
        bw5.kl klVar = (bw5.kl) fVar;
        return n51.f.a(this.f110942d, klVar.f110942d) && n51.f.a(java.lang.Boolean.valueOf(this.f110943e), java.lang.Boolean.valueOf(klVar.f110943e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.kl();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110944f;
        java.util.LinkedList linkedList = this.f110942d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.a(2, this.f110943e);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            return zArr[2] ? g17 + b36.f.a(2, this.f110943e) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
            this.f110943e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.g10 g10Var = new bw5.g10();
            if (bArr != null && bArr.length > 0) {
                g10Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(g10Var);
        }
        zArr[1] = true;
        return 0;
    }
}
