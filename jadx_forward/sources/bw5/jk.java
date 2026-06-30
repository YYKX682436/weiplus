package bw5;

/* loaded from: classes2.dex */
public class jk extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.qk f110533e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f110532d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f110534f = new boolean[3];

    static {
        new bw5.jk();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jk mo11468x92b714fd(byte[] bArr) {
        return (bw5.jk) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jk)) {
            return false;
        }
        bw5.jk jkVar = (bw5.jk) fVar;
        return n51.f.a(this.f110532d, jkVar.f110532d) && n51.f.a(this.f110533e, jkVar.f110533e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.jk();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f110534f;
        java.util.LinkedList linkedList = this.f110532d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            bw5.qk qkVar = this.f110533e;
            if (qkVar != null && zArr[2]) {
                fVar.i(2, qkVar.mo75928xcd1e8d8());
                this.f110533e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            bw5.qk qkVar2 = this.f110533e;
            return (qkVar2 == null || !zArr[2]) ? g17 : g17 + b36.f.i(2, qkVar2.mo75928xcd1e8d8());
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.j1 j1Var = new bw5.j1();
                if (bArr != null && bArr.length > 0) {
                    j1Var.mo11468x92b714fd(bArr);
                }
                linkedList.add(j1Var);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.qk qkVar3 = new bw5.qk();
            if (bArr2 != null && bArr2.length > 0) {
                qkVar3.mo11468x92b714fd(bArr2);
            }
            this.f110533e = qkVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
