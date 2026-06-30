package bw5;

/* loaded from: classes2.dex */
public class q50 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f113501d;

    /* renamed from: e, reason: collision with root package name */
    public long f113502e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f113503f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f113504g = new boolean[4];

    static {
        new bw5.q50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.q50 mo11468x92b714fd(byte[] bArr) {
        return (bw5.q50) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q50)) {
            return false;
        }
        bw5.q50 q50Var = (bw5.q50) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f113501d), java.lang.Integer.valueOf(q50Var.f113501d)) && n51.f.a(java.lang.Long.valueOf(this.f113502e), java.lang.Long.valueOf(q50Var.f113502e)) && n51.f.a(this.f113503f, q50Var.f113503f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.q50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f113503f;
        boolean[] zArr = this.f113504g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f113501d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f113502e);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f113501d) : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f113502e);
            }
            return e17 + b36.f.g(3, 8, linkedList);
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
        if (intValue == 1) {
            this.f113501d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f113502e = aVar2.i(intValue);
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
            bw5.n90 n90Var = new bw5.n90();
            if (bArr != null && bArr.length > 0) {
                n90Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(n90Var);
        }
        zArr[3] = true;
        return 0;
    }
}
