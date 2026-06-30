package bw5;

/* loaded from: classes2.dex */
public class pn0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.sm0 f113294d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f113296f;

    /* renamed from: g, reason: collision with root package name */
    public int f113297g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.qn0 f113298h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f113299i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f113300m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f113295e = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f113301n = new boolean[8];

    static {
        new bw5.pn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pn0)) {
            return false;
        }
        bw5.pn0 pn0Var = (bw5.pn0) fVar;
        return n51.f.a(this.f113294d, pn0Var.f113294d) && n51.f.a(this.f113295e, pn0Var.f113295e) && n51.f.a(java.lang.Boolean.valueOf(this.f113296f), java.lang.Boolean.valueOf(pn0Var.f113296f)) && n51.f.a(java.lang.Integer.valueOf(this.f113297g), java.lang.Integer.valueOf(pn0Var.f113297g)) && n51.f.a(this.f113298h, pn0Var.f113298h) && n51.f.a(this.f113299i, pn0Var.f113299i) && n51.f.a(java.lang.Boolean.valueOf(this.f113300m), java.lang.Boolean.valueOf(pn0Var.f113300m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pn0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f113295e;
        int i18 = 0;
        boolean[] zArr = this.f113301n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.sm0 sm0Var = this.f113294d;
            if (sm0Var != null && zArr[1]) {
                fVar.i(1, sm0Var.mo75928xcd1e8d8());
                this.f113294d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.a(3, this.f113296f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f113297g);
            }
            bw5.qn0 qn0Var = this.f113298h;
            if (qn0Var != null && zArr[5]) {
                fVar.e(5, qn0Var.f113735d);
            }
            java.lang.String str = this.f113299i;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            if (zArr[7]) {
                fVar.a(7, this.f113300m);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.sm0 sm0Var2 = this.f113294d;
            if (sm0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, sm0Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                g17 += b36.f.a(3, this.f113296f);
            }
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f113297g);
            }
            bw5.qn0 qn0Var2 = this.f113298h;
            if (qn0Var2 != null && zArr[5]) {
                g17 += b36.f.e(5, qn0Var2.f113735d);
            }
            java.lang.String str2 = this.f113299i;
            if (str2 != null && zArr[6]) {
                g17 += b36.f.j(6, str2);
            }
            return zArr[7] ? g17 + b36.f.a(7, this.f113300m) : g17;
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
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.sm0 sm0Var3 = new bw5.sm0();
                    if (bArr != null && bArr.length > 0) {
                        sm0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f113294d = sm0Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.on0 on0Var = new bw5.on0();
                    if (bArr2 != null && bArr2.length > 0) {
                        on0Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(on0Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f113296f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113297g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                int g18 = aVar2.g(intValue);
                this.f113298h = g18 != 1 ? g18 != 2 ? null : bw5.qn0.Modify : bw5.qn0.New;
                zArr[5] = true;
                return 0;
            case 6:
                this.f113299i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113300m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.pn0) super.mo11468x92b714fd(bArr);
    }
}
