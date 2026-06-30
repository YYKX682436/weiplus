package bw5;

/* loaded from: classes2.dex */
public class np extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112300d;

    /* renamed from: e, reason: collision with root package name */
    public long f112301e;

    /* renamed from: f, reason: collision with root package name */
    public long f112302f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112303g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f112304h;

    /* renamed from: i, reason: collision with root package name */
    public long f112305i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f112306m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f112307n;

    /* renamed from: o, reason: collision with root package name */
    public int f112308o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f112309p = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f112310q = new boolean[11];

    static {
        new bw5.np();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.np mo11468x92b714fd(byte[] bArr) {
        return (bw5.np) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.np)) {
            return false;
        }
        bw5.np npVar = (bw5.np) fVar;
        return n51.f.a(this.f112300d, npVar.f112300d) && n51.f.a(java.lang.Long.valueOf(this.f112301e), java.lang.Long.valueOf(npVar.f112301e)) && n51.f.a(java.lang.Long.valueOf(this.f112302f), java.lang.Long.valueOf(npVar.f112302f)) && n51.f.a(this.f112303g, npVar.f112303g) && n51.f.a(this.f112304h, npVar.f112304h) && n51.f.a(java.lang.Long.valueOf(this.f112305i), java.lang.Long.valueOf(npVar.f112305i)) && n51.f.a(java.lang.Boolean.valueOf(this.f112306m), java.lang.Boolean.valueOf(npVar.f112306m)) && n51.f.a(java.lang.Boolean.valueOf(this.f112307n), java.lang.Boolean.valueOf(npVar.f112307n)) && n51.f.a(java.lang.Integer.valueOf(this.f112308o), java.lang.Integer.valueOf(npVar.f112308o)) && n51.f.a(this.f112309p, npVar.f112309p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.np();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f112309p;
        boolean[] zArr = this.f112310q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112300d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f112301e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f112302f);
            }
            java.lang.String str2 = this.f112303g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f112304h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            if (zArr[6]) {
                fVar.h(6, this.f112305i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f112306m);
            }
            if (zArr[8]) {
                fVar.a(8, this.f112307n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f112308o);
            }
            fVar.g(10, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f112300d;
            int j17 = (str4 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str4);
            if (zArr[2]) {
                j17 += b36.f.h(2, this.f112301e);
            }
            if (zArr[3]) {
                j17 += b36.f.h(3, this.f112302f);
            }
            java.lang.String str5 = this.f112303g;
            if (str5 != null && zArr[4]) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f112304h;
            if (str6 != null && zArr[5]) {
                j17 += b36.f.j(5, str6);
            }
            if (zArr[6]) {
                j17 += b36.f.h(6, this.f112305i);
            }
            if (zArr[7]) {
                j17 += b36.f.a(7, this.f112306m);
            }
            if (zArr[8]) {
                j17 += b36.f.a(8, this.f112307n);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f112308o);
            }
            return j17 + b36.f.g(10, 8, linkedList);
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
                this.f112300d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112301e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112302f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112303g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112304h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112305i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112306m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f112307n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f112308o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.mp mpVar = new bw5.mp();
                    if (bArr != null && bArr.length > 0) {
                        mpVar.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(mpVar);
                }
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }
}
