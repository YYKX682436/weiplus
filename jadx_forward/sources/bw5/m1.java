package bw5;

/* loaded from: classes2.dex */
public class m1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.a20 f111567e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.k1 f111568f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.k1 f111569g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.l1 f111570h;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f111566d = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f111571i = new boolean[6];

    static {
        new bw5.m1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.m1 mo11468x92b714fd(byte[] bArr) {
        return (bw5.m1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.m1)) {
            return false;
        }
        bw5.m1 m1Var = (bw5.m1) fVar;
        return n51.f.a(this.f111566d, m1Var.f111566d) && n51.f.a(this.f111567e, m1Var.f111567e) && n51.f.a(this.f111568f, m1Var.f111568f) && n51.f.a(this.f111569g, m1Var.f111569g) && n51.f.a(this.f111570h, m1Var.f111570h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.m1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f111566d;
        boolean[] zArr = this.f111571i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            bw5.a20 a20Var = this.f111567e;
            if (a20Var != null && zArr[2]) {
                fVar.i(2, a20Var.mo75928xcd1e8d8());
                this.f111567e.mo75956x3d5d1f78(fVar);
            }
            bw5.k1 k1Var = this.f111568f;
            if (k1Var != null && zArr[3]) {
                fVar.i(3, k1Var.mo75928xcd1e8d8());
                this.f111568f.mo75956x3d5d1f78(fVar);
            }
            bw5.k1 k1Var2 = this.f111569g;
            if (k1Var2 != null && zArr[4]) {
                fVar.i(4, k1Var2.mo75928xcd1e8d8());
                this.f111569g.mo75956x3d5d1f78(fVar);
            }
            bw5.l1 l1Var = this.f111570h;
            if (l1Var != null && zArr[5]) {
                fVar.i(5, l1Var.mo75928xcd1e8d8());
                this.f111570h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            bw5.a20 a20Var2 = this.f111567e;
            if (a20Var2 != null && zArr[2]) {
                g17 += b36.f.i(2, a20Var2.mo75928xcd1e8d8());
            }
            bw5.k1 k1Var3 = this.f111568f;
            if (k1Var3 != null && zArr[3]) {
                g17 += b36.f.i(3, k1Var3.mo75928xcd1e8d8());
            }
            bw5.k1 k1Var4 = this.f111569g;
            if (k1Var4 != null && zArr[4]) {
                g17 += b36.f.i(4, k1Var4.mo75928xcd1e8d8());
            }
            bw5.l1 l1Var2 = this.f111570h;
            return (l1Var2 == null || !zArr[5]) ? g17 : g17 + b36.f.i(5, l1Var2.mo75928xcd1e8d8());
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
                bw5.cm cmVar = new bw5.cm();
                if (bArr != null && bArr.length > 0) {
                    cmVar.mo11468x92b714fd(bArr);
                }
                linkedList.add(cmVar);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.a20 a20Var3 = new bw5.a20();
                if (bArr2 != null && bArr2.length > 0) {
                    a20Var3.mo11468x92b714fd(bArr2);
                }
                this.f111567e = a20Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr3 = (byte[]) j19.get(i27);
                bw5.k1 k1Var5 = new bw5.k1();
                if (bArr3 != null && bArr3.length > 0) {
                    k1Var5.mo11468x92b714fd(bArr3);
                }
                this.f111568f = k1Var5;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j27 = aVar2.j(intValue);
            int size4 = j27.size();
            for (int i28 = 0; i28 < size4; i28++) {
                byte[] bArr4 = (byte[]) j27.get(i28);
                bw5.k1 k1Var6 = new bw5.k1();
                if (bArr4 != null && bArr4.length > 0) {
                    k1Var6.mo11468x92b714fd(bArr4);
                }
                this.f111569g = k1Var6;
            }
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j28 = aVar2.j(intValue);
        int size5 = j28.size();
        for (int i29 = 0; i29 < size5; i29++) {
            byte[] bArr5 = (byte[]) j28.get(i29);
            bw5.l1 l1Var3 = new bw5.l1();
            if (bArr5 != null && bArr5.length > 0) {
                l1Var3.mo11468x92b714fd(bArr5);
            }
            this.f111570h = l1Var3;
        }
        zArr[5] = true;
        return 0;
    }
}
