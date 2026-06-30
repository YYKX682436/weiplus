package bw5;

/* loaded from: classes9.dex */
public class a9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public int f106621e;

    /* renamed from: f, reason: collision with root package name */
    public double f106622f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f106620d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f106623g = new boolean[4];

    static {
        new bw5.a9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a9 mo11468x92b714fd(byte[] bArr) {
        return (bw5.a9) super.mo11468x92b714fd(bArr);
    }

    public bw5.a9 c(double d17) {
        this.f106622f = d17;
        this.f106623g[3] = true;
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a9)) {
            return false;
        }
        bw5.a9 a9Var = (bw5.a9) fVar;
        return n51.f.a(this.f106620d, a9Var.f106620d) && n51.f.a(java.lang.Integer.valueOf(this.f106621e), java.lang.Integer.valueOf(a9Var.f106621e)) && n51.f.a(java.lang.Double.valueOf(this.f106622f), java.lang.Double.valueOf(a9Var.f106622f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.a9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f106620d;
        boolean[] zArr = this.f106623g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.e(2, this.f106621e);
            }
            if (zArr[3]) {
                fVar.c(3, this.f106622f);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.e(2, this.f106621e);
            }
            return zArr[3] ? g17 + b36.f.c(3, this.f106622f) : g17;
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
            if (intValue == 2) {
                this.f106621e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f106622f = aVar2.e(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.c9 c9Var = new bw5.c9();
            if (bArr != null && bArr.length > 0) {
                c9Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(c9Var);
        }
        zArr[1] = true;
        return 0;
    }
}
