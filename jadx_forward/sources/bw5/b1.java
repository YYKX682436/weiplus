package bw5;

/* loaded from: classes9.dex */
public class b1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f107009d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107010e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f107011f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f107012g = new boolean[4];

    static {
        new bw5.b1();
    }

    public java.lang.String b() {
        return this.f107012g[2] ? this.f107010e : "";
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.b1 mo11468x92b714fd(byte[] bArr) {
        return (bw5.b1) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b1)) {
            return false;
        }
        bw5.b1 b1Var = (bw5.b1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f107009d), java.lang.Integer.valueOf(b1Var.f107009d)) && n51.f.a(this.f107010e, b1Var.f107010e) && n51.f.a(this.f107011f, b1Var.f107011f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.b1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f107011f;
        boolean[] zArr = this.f107012g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f107009d);
            }
            java.lang.String str = this.f107010e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f107009d) : 0;
            java.lang.String str2 = this.f107010e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
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
            this.f107009d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107010e = aVar2.k(intValue);
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
            bw5.c1 c1Var = new bw5.c1();
            if (bArr != null && bArr.length > 0) {
                c1Var.mo11468x92b714fd(bArr);
            }
            linkedList.add(c1Var);
        }
        zArr[3] = true;
        return 0;
    }
}
