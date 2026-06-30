package bw5;

/* loaded from: classes2.dex */
public class g60 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109233d;

    /* renamed from: f, reason: collision with root package name */
    public int f109235f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f109236g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109237h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f109234e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f109238i = new boolean[6];

    static {
        new bw5.g60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.g60 mo11468x92b714fd(byte[] bArr) {
        return (bw5.g60) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g60)) {
            return false;
        }
        bw5.g60 g60Var = (bw5.g60) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109233d), java.lang.Integer.valueOf(g60Var.f109233d)) && n51.f.a(this.f109234e, g60Var.f109234e) && n51.f.a(java.lang.Integer.valueOf(this.f109235f), java.lang.Integer.valueOf(g60Var.f109235f)) && n51.f.a(this.f109236g, g60Var.f109236g) && n51.f.a(this.f109237h, g60Var.f109237h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.g60();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f109234e;
        boolean[] zArr = this.f109238i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109233d);
            }
            fVar.g(2, 1, linkedList);
            if (zArr[3]) {
                fVar.e(3, this.f109235f);
            }
            java.lang.String str = this.f109236g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f109237h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f109233d) : 0) + b36.f.g(2, 1, linkedList);
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f109235f);
            }
            java.lang.String str3 = this.f109236g;
            if (str3 != null && zArr[4]) {
                e17 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f109237h;
            return (str4 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str4);
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
            this.f109233d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            linkedList.add(aVar2.k(intValue));
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f109235f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f109236g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f109237h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
