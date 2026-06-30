package bw5;

/* loaded from: classes11.dex */
public class b6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107069d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.a6 f107070e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f107071f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f107072g = new boolean[4];

    static {
        new bw5.b6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b6 mo11468x92b714fd(byte[] bArr) {
        return (bw5.b6) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b6)) {
            return false;
        }
        bw5.b6 b6Var = (bw5.b6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107069d), java.lang.Integer.valueOf(b6Var.f107069d)) && n51.f.a(this.f107070e, b6Var.f107070e) && n51.f.a(this.f107071f, b6Var.f107071f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.b6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f107071f;
        boolean[] zArr = this.f107072g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107069d);
            }
            bw5.a6 a6Var = this.f107070e;
            if (a6Var != null && zArr[2]) {
                fVar.i(2, a6Var.mo75928xcd1e8d8());
                this.f107070e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107069d) : 0;
            bw5.a6 a6Var2 = this.f107070e;
            if (a6Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, a6Var2.mo75928xcd1e8d8());
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
            this.f107069d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.a6 a6Var3 = new bw5.a6();
                if (bArr != null && bArr.length > 0) {
                    a6Var3.mo11468x92b714fd(bArr);
                }
                this.f107070e = a6Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.a6 a6Var4 = new bw5.a6();
            if (bArr2 != null && bArr2.length > 0) {
                a6Var4.mo11468x92b714fd(bArr2);
            }
            linkedList.add(a6Var4);
        }
        zArr[3] = true;
        return 0;
    }
}
