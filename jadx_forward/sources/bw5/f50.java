package bw5;

/* loaded from: classes2.dex */
public class f50 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108690d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f108692f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f108693g;

    /* renamed from: h, reason: collision with root package name */
    public int f108694h;

    /* renamed from: i, reason: collision with root package name */
    public int f108695i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f108696m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f108691e = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f108697n = new boolean[8];

    static {
        new bw5.f50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.f50 mo11468x92b714fd(byte[] bArr) {
        return (bw5.f50) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.f50)) {
            return false;
        }
        bw5.f50 f50Var = (bw5.f50) fVar;
        return n51.f.a(this.f108690d, f50Var.f108690d) && n51.f.a(this.f108691e, f50Var.f108691e) && n51.f.a(java.lang.Boolean.valueOf(this.f108692f), java.lang.Boolean.valueOf(f50Var.f108692f)) && n51.f.a(this.f108693g, f50Var.f108693g) && n51.f.a(java.lang.Integer.valueOf(this.f108694h), java.lang.Integer.valueOf(f50Var.f108694h)) && n51.f.a(java.lang.Integer.valueOf(this.f108695i), java.lang.Integer.valueOf(f50Var.f108695i)) && n51.f.a(java.lang.Boolean.valueOf(this.f108696m), java.lang.Boolean.valueOf(f50Var.f108696m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.f50();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108691e;
        int i18 = 0;
        boolean[] zArr = this.f108697n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108690d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.a(3, this.f108692f);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f108693g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f108694h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f108695i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f108696m);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f108690d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                g17 += b36.f.a(3, this.f108692f);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f108693g;
            if (gVar2 != null && zArr[4]) {
                g17 += b36.f.b(4, gVar2);
            }
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f108694h);
            }
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f108695i);
            }
            return zArr[7] ? g17 + b36.f.a(7, this.f108696m) : g17;
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
                this.f108690d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.o50 o50Var = new bw5.o50();
                    if (bArr != null && bArr.length > 0) {
                        o50Var.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(o50Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f108692f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f108693g = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f108694h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f108695i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f108696m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
