package bw5;

/* loaded from: classes9.dex */
public class nf extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.a9 f112193d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.a9 f112194e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f112195f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f112196g = new boolean[4];

    static {
        new bw5.nf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nf mo11468x92b714fd(byte[] bArr) {
        return (bw5.nf) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nf)) {
            return false;
        }
        bw5.nf nfVar = (bw5.nf) fVar;
        return n51.f.a(this.f112193d, nfVar.f112193d) && n51.f.a(this.f112194e, nfVar.f112194e) && n51.f.a(this.f112195f, nfVar.f112195f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.nf();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f112195f;
        boolean[] zArr = this.f112196g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.a9 a9Var = this.f112193d;
            if (a9Var != null && zArr[1]) {
                fVar.i(1, a9Var.mo75928xcd1e8d8());
                this.f112193d.mo75956x3d5d1f78(fVar);
            }
            bw5.a9 a9Var2 = this.f112194e;
            if (a9Var2 != null && zArr[2]) {
                fVar.i(2, a9Var2.mo75928xcd1e8d8());
                this.f112194e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.a9 a9Var3 = this.f112193d;
            if (a9Var3 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, a9Var3.mo75928xcd1e8d8());
            }
            bw5.a9 a9Var4 = this.f112194e;
            if (a9Var4 != null && zArr[2]) {
                i18 += b36.f.i(2, a9Var4.mo75928xcd1e8d8());
            }
            return i18 + b36.f.g(3, 8, linkedList);
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
                bw5.a9 a9Var5 = new bw5.a9();
                if (bArr != null && bArr.length > 0) {
                    a9Var5.mo11468x92b714fd(bArr);
                }
                this.f112193d = a9Var5;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.a9 a9Var6 = new bw5.a9();
                if (bArr2 != null && bArr2.length > 0) {
                    a9Var6.mo11468x92b714fd(bArr2);
                }
                this.f112194e = a9Var6;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.c7 c7Var = new bw5.c7();
            if (bArr3 != null && bArr3.length > 0) {
                c7Var.mo11468x92b714fd(bArr3);
            }
            linkedList.add(c7Var);
        }
        zArr[3] = true;
        return 0;
    }
}
