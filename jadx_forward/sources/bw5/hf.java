package bw5;

/* loaded from: classes9.dex */
public class hf extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.c7 f109719d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.a9 f109720e;

    /* renamed from: g, reason: collision with root package name */
    public bw5.a9 f109722g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f109721f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f109723h = new boolean[5];

    static {
        new bw5.hf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hf mo11468x92b714fd(byte[] bArr) {
        return (bw5.hf) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hf)) {
            return false;
        }
        bw5.hf hfVar = (bw5.hf) fVar;
        return n51.f.a(this.f109719d, hfVar.f109719d) && n51.f.a(this.f109720e, hfVar.f109720e) && n51.f.a(this.f109721f, hfVar.f109721f) && n51.f.a(this.f109722g, hfVar.f109722g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f109721f;
        boolean[] zArr = this.f109723h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.c7 c7Var = this.f109719d;
            if (c7Var != null && zArr[1]) {
                fVar.i(1, c7Var.mo75928xcd1e8d8());
                this.f109719d.mo75956x3d5d1f78(fVar);
            }
            bw5.a9 a9Var = this.f109720e;
            if (a9Var != null && zArr[2]) {
                fVar.i(2, a9Var.mo75928xcd1e8d8());
                this.f109720e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            bw5.a9 a9Var2 = this.f109722g;
            if (a9Var2 != null && zArr[4]) {
                fVar.i(4, a9Var2.mo75928xcd1e8d8());
                this.f109722g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.c7 c7Var2 = this.f109719d;
            if (c7Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, c7Var2.mo75928xcd1e8d8());
            }
            bw5.a9 a9Var3 = this.f109720e;
            if (a9Var3 != null && zArr[2]) {
                i18 += b36.f.i(2, a9Var3.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            bw5.a9 a9Var4 = this.f109722g;
            return (a9Var4 == null || !zArr[4]) ? g17 : g17 + b36.f.i(4, a9Var4.mo75928xcd1e8d8());
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
                bw5.c7 c7Var3 = new bw5.c7();
                if (bArr != null && bArr.length > 0) {
                    c7Var3.mo11468x92b714fd(bArr);
                }
                this.f109719d = c7Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.a9 a9Var5 = new bw5.a9();
                if (bArr2 != null && bArr2.length > 0) {
                    a9Var5.mo11468x92b714fd(bArr2);
                }
                this.f109720e = a9Var5;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                bw5.c7 c7Var4 = new bw5.c7();
                if (bArr3 != null && bArr3.length > 0) {
                    c7Var4.mo11468x92b714fd(bArr3);
                }
                linkedList.add(c7Var4);
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            bw5.a9 a9Var6 = new bw5.a9();
            if (bArr4 != null && bArr4.length > 0) {
                a9Var6.mo11468x92b714fd(bArr4);
            }
            this.f109722g = a9Var6;
        }
        zArr[4] = true;
        return 0;
    }
}
