package bw5;

/* loaded from: classes2.dex */
public class pa0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.oa0 f113080d;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ma0 f113082f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f113083g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f113081e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f113084h = new boolean[5];

    static {
        new bw5.pa0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pa0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.pa0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pa0)) {
            return false;
        }
        bw5.pa0 pa0Var = (bw5.pa0) fVar;
        return n51.f.a(this.f113080d, pa0Var.f113080d) && n51.f.a(this.f113081e, pa0Var.f113081e) && n51.f.a(this.f113082f, pa0Var.f113082f) && n51.f.a(java.lang.Boolean.valueOf(this.f113083g), java.lang.Boolean.valueOf(pa0Var.f113083g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pa0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f113081e;
        boolean[] zArr = this.f113084h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.oa0 oa0Var = this.f113080d;
            if (oa0Var != null && zArr[1]) {
                fVar.i(1, oa0Var.mo75928xcd1e8d8());
                this.f113080d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            bw5.ma0 ma0Var = this.f113082f;
            if (ma0Var != null && zArr[3]) {
                fVar.i(3, ma0Var.mo75928xcd1e8d8());
                this.f113082f.mo75956x3d5d1f78(fVar);
            }
            if (zArr[4]) {
                fVar.a(4, this.f113083g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.oa0 oa0Var2 = this.f113080d;
            if (oa0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, oa0Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            bw5.ma0 ma0Var2 = this.f113082f;
            if (ma0Var2 != null && zArr[3]) {
                g17 += b36.f.i(3, ma0Var2.mo75928xcd1e8d8());
            }
            return zArr[4] ? g17 + b36.f.a(4, this.f113083g) : g17;
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
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.oa0 oa0Var3 = new bw5.oa0();
                if (bArr != null && bArr.length > 0) {
                    oa0Var3.mo11468x92b714fd(bArr);
                }
                this.f113080d = oa0Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.na0 na0Var = new bw5.na0();
                if (bArr2 != null && bArr2.length > 0) {
                    na0Var.mo11468x92b714fd(bArr2);
                }
                linkedList.add(na0Var);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f113083g = aVar2.c(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.ma0 ma0Var3 = new bw5.ma0();
            if (bArr3 != null && bArr3.length > 0) {
                ma0Var3.mo11468x92b714fd(bArr3);
            }
            this.f113082f = ma0Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
