package bw5;

/* loaded from: classes11.dex */
public class dr0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: n, reason: collision with root package name */
    public static final bw5.dr0 f108127n = new bw5.dr0();

    /* renamed from: d, reason: collision with root package name */
    public int f108128d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.lp0 f108129e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.cp0 f108130f;

    /* renamed from: i, reason: collision with root package name */
    public int f108133i;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f108131g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f108132h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f108134m = new boolean[7];

    public bw5.cp0 b() {
        return this.f108134m[3] ? this.f108130f : new bw5.cp0();
    }

    public bw5.lp0 c() {
        return this.f108134m[2] ? this.f108129e : new bw5.lp0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dr0)) {
            return false;
        }
        bw5.dr0 dr0Var = (bw5.dr0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f108128d), java.lang.Integer.valueOf(dr0Var.f108128d)) && n51.f.a(this.f108129e, dr0Var.f108129e) && n51.f.a(this.f108130f, dr0Var.f108130f) && n51.f.a(this.f108131g, dr0Var.f108131g) && n51.f.a(this.f108132h, dr0Var.f108132h) && n51.f.a(java.lang.Integer.valueOf(this.f108133i), java.lang.Integer.valueOf(dr0Var.f108133i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.dr0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.dr0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.dr0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108132h;
        java.util.LinkedList linkedList2 = this.f108131g;
        boolean[] zArr = this.f108134m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f108128d);
            }
            bw5.lp0 lp0Var = this.f108129e;
            if (lp0Var != null && zArr[2]) {
                fVar.i(2, lp0Var.mo75928xcd1e8d8());
                this.f108129e.mo75956x3d5d1f78(fVar);
            }
            bw5.cp0 cp0Var = this.f108130f;
            if (cp0Var != null && zArr[3]) {
                fVar.i(3, cp0Var.mo75928xcd1e8d8());
                this.f108130f.mo75956x3d5d1f78(fVar);
            }
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 1, linkedList);
            if (zArr[6]) {
                fVar.e(6, this.f108133i);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f108128d) : 0;
            bw5.lp0 lp0Var2 = this.f108129e;
            if (lp0Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, lp0Var2.mo75928xcd1e8d8());
            }
            bw5.cp0 cp0Var2 = this.f108130f;
            if (cp0Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, cp0Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 1, linkedList);
            return zArr[6] ? g17 + b36.f.e(6, this.f108133i) : g17;
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
                this.f108128d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.lp0 lp0Var3 = new bw5.lp0();
                    if (bArr != null && bArr.length > 0) {
                        lp0Var3.mo11468x92b714fd(bArr);
                    }
                    this.f108129e = lp0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.cp0 cp0Var3 = new bw5.cp0();
                    if (bArr2 != null && bArr2.length > 0) {
                        cp0Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f108130f = cp0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.lp0 lp0Var4 = new bw5.lp0();
                    if (bArr3 != null && bArr3.length > 0) {
                        lp0Var4.mo11468x92b714fd(bArr3);
                    }
                    linkedList2.add(lp0Var4);
                }
                zArr[4] = true;
                return 0;
            case 5:
                linkedList.add(aVar2.k(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f108133i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
