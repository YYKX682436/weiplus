package bw5;

/* loaded from: classes4.dex */
public class nn0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: n, reason: collision with root package name */
    public static final bw5.nn0 f112282n = new bw5.nn0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f112283d;

    /* renamed from: e, reason: collision with root package name */
    public int f112284e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112285f;

    /* renamed from: h, reason: collision with root package name */
    public bw5.kn0 f112287h;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f112286g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f112288i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f112289m = new boolean[7];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nn0)) {
            return false;
        }
        bw5.nn0 nn0Var = (bw5.nn0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f112283d), java.lang.Boolean.valueOf(nn0Var.f112283d)) && n51.f.a(java.lang.Integer.valueOf(this.f112284e), java.lang.Integer.valueOf(nn0Var.f112284e)) && n51.f.a(this.f112285f, nn0Var.f112285f) && n51.f.a(this.f112286g, nn0Var.f112286g) && n51.f.a(this.f112287h, nn0Var.f112287h) && n51.f.a(this.f112288i, nn0Var.f112288i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.nn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f112288i;
        java.util.LinkedList linkedList2 = this.f112286g;
        boolean[] zArr = this.f112289m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f112283d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f112284e);
            }
            java.lang.String str = this.f112285f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList2);
            bw5.kn0 kn0Var = this.f112287h;
            if (kn0Var != null && zArr[5]) {
                fVar.i(5, kn0Var.mo75928xcd1e8d8());
                this.f112287h.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f112283d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f112284e);
            }
            java.lang.String str2 = this.f112285f;
            if (str2 != null && zArr[3]) {
                a17 += b36.f.j(3, str2);
            }
            int g17 = a17 + b36.f.g(4, 8, linkedList2);
            bw5.kn0 kn0Var2 = this.f112287h;
            if (kn0Var2 != null && zArr[5]) {
                g17 += b36.f.i(5, kn0Var2.mo75928xcd1e8d8());
            }
            return g17 + b36.f.g(6, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
        switch (intValue) {
            case 1:
                this.f112283d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112284e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112285f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ln0 ln0Var = new bw5.ln0();
                    if (bArr != null && bArr.length > 0) {
                        ln0Var.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(ln0Var);
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.kn0 kn0Var3 = new bw5.kn0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kn0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f112287h = kn0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.kn0 kn0Var4 = new bw5.kn0();
                    if (bArr3 != null && bArr3.length > 0) {
                        kn0Var4.mo11468x92b714fd(bArr3);
                    }
                    linkedList.add(kn0Var4);
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.nn0) super.mo11468x92b714fd(bArr);
    }
}
