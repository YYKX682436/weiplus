package r45;

/* loaded from: classes4.dex */
public class yj0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f472676d;

    /* renamed from: e, reason: collision with root package name */
    public int f472677e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472678f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f472679g;

    /* renamed from: h, reason: collision with root package name */
    public int f472680h;

    /* renamed from: m, reason: collision with root package name */
    public int f472682m;

    /* renamed from: o, reason: collision with root package name */
    public int f472684o;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f472681i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f472683n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f472685p = new java.util.LinkedList();

    static {
        new r45.yj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.yj0 mo11468x92b714fd(byte[] bArr) {
        return (r45.yj0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yj0)) {
            return false;
        }
        r45.yj0 yj0Var = (r45.yj0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f472676d), java.lang.Integer.valueOf(yj0Var.f472676d)) && n51.f.a(java.lang.Integer.valueOf(this.f472677e), java.lang.Integer.valueOf(yj0Var.f472677e)) && n51.f.a(this.f472678f, yj0Var.f472678f) && n51.f.a(this.f472679g, yj0Var.f472679g) && n51.f.a(java.lang.Integer.valueOf(this.f472680h), java.lang.Integer.valueOf(yj0Var.f472680h)) && n51.f.a(this.f472681i, yj0Var.f472681i) && n51.f.a(java.lang.Integer.valueOf(this.f472682m), java.lang.Integer.valueOf(yj0Var.f472682m)) && n51.f.a(this.f472683n, yj0Var.f472683n) && n51.f.a(java.lang.Integer.valueOf(this.f472684o), java.lang.Integer.valueOf(yj0Var.f472684o)) && n51.f.a(this.f472685p, yj0Var.f472685p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.yj0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472685p;
        java.util.LinkedList linkedList2 = this.f472683n;
        java.util.LinkedList linkedList3 = this.f472681i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f472676d);
            fVar.e(2, this.f472677e);
            java.lang.String str = this.f472678f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.cu5 cu5Var = this.f472679g;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.mo75928xcd1e8d8());
                this.f472679g.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f472680h);
            fVar.g(6, 8, linkedList3);
            fVar.e(7, this.f472682m);
            fVar.g(8, 8, linkedList2);
            fVar.e(9, this.f472684o);
            fVar.g(10, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f472676d) + 0 + b36.f.e(2, this.f472677e);
            java.lang.String str2 = this.f472678f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            r45.cu5 cu5Var2 = this.f472679g;
            if (cu5Var2 != null) {
                e17 += b36.f.i(4, cu5Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(5, this.f472680h) + b36.f.g(6, 8, linkedList3) + b36.f.e(7, this.f472682m) + b36.f.g(8, 8, linkedList2) + b36.f.e(9, this.f472684o) + b36.f.g(10, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList3.clear();
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
                this.f472676d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f472677e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f472678f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    this.f472679g = cu5Var3;
                }
                return 0;
            case 5:
                this.f472680h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.kj0 kj0Var = new r45.kj0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kj0Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList3.add(kj0Var);
                }
                return 0;
            case 7:
                this.f472682m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.zj0 zj0Var = new r45.zj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        zj0Var.mo11468x92b714fd(bArr3);
                    }
                    linkedList2.add(zj0Var);
                }
                return 0;
            case 9:
                this.f472684o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.vi0 vi0Var = new r45.vi0();
                    if (bArr4 != null && bArr4.length > 0) {
                        vi0Var.mo11468x92b714fd(bArr4);
                    }
                    linkedList.add(vi0Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
