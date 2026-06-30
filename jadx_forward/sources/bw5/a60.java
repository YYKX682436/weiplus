package bw5;

/* loaded from: classes2.dex */
public class a60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public boolean f106567e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f106566d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f106568f = new boolean[3];

    static {
        new bw5.a60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a60 mo11468x92b714fd(byte[] bArr) {
        return (bw5.a60) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a60)) {
            return false;
        }
        bw5.a60 a60Var = (bw5.a60) fVar;
        return n51.f.a(this.f106566d, a60Var.f106566d) && n51.f.a(java.lang.Boolean.valueOf(this.f106567e), java.lang.Boolean.valueOf(a60Var.f106567e));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.a60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f106568f;
        java.util.LinkedList linkedList = this.f106566d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.a(2, this.f106567e);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            return zArr[2] ? g17 + b36.f.a(2, this.f106567e) : g17;
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
            this.f106567e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.c70 c70Var = new bw5.c70();
            if (bArr != null && bArr.length > 0) {
                c70Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(c70Var);
        }
        zArr[1] = true;
        return 0;
    }
}
