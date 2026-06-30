package bw5;

/* loaded from: classes4.dex */
public class gk0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109416d;

    /* renamed from: f, reason: collision with root package name */
    public int f109418f;

    /* renamed from: h, reason: collision with root package name */
    public int f109420h;

    /* renamed from: m, reason: collision with root package name */
    public int f109422m;

    /* renamed from: o, reason: collision with root package name */
    public int f109424o;

    /* renamed from: p, reason: collision with root package name */
    public int f109425p;

    /* renamed from: r, reason: collision with root package name */
    public int f109427r;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f109417e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f109419g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f109421i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f109423n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f109426q = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f109428s = new boolean[13];

    static {
        new bw5.gk0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gk0)) {
            return false;
        }
        bw5.gk0 gk0Var = (bw5.gk0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109416d), java.lang.Integer.valueOf(gk0Var.f109416d)) && n51.f.a(this.f109417e, gk0Var.f109417e) && n51.f.a(java.lang.Integer.valueOf(this.f109418f), java.lang.Integer.valueOf(gk0Var.f109418f)) && n51.f.a(this.f109419g, gk0Var.f109419g) && n51.f.a(java.lang.Integer.valueOf(this.f109420h), java.lang.Integer.valueOf(gk0Var.f109420h)) && n51.f.a(this.f109421i, gk0Var.f109421i) && n51.f.a(java.lang.Integer.valueOf(this.f109422m), java.lang.Integer.valueOf(gk0Var.f109422m)) && n51.f.a(this.f109423n, gk0Var.f109423n) && n51.f.a(java.lang.Integer.valueOf(this.f109424o), java.lang.Integer.valueOf(gk0Var.f109424o)) && n51.f.a(java.lang.Integer.valueOf(this.f109425p), java.lang.Integer.valueOf(gk0Var.f109425p)) && n51.f.a(this.f109426q, gk0Var.f109426q) && n51.f.a(java.lang.Integer.valueOf(this.f109427r), java.lang.Integer.valueOf(gk0Var.f109427r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gk0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f109426q;
        java.util.LinkedList linkedList2 = this.f109423n;
        java.util.LinkedList linkedList3 = this.f109421i;
        java.util.LinkedList linkedList4 = this.f109419g;
        java.util.LinkedList linkedList5 = this.f109417e;
        boolean[] zArr = this.f109428s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109416d);
            }
            fVar.g(2, 8, linkedList5);
            if (zArr[3]) {
                fVar.e(3, this.f109418f);
            }
            fVar.g(4, 2, linkedList4);
            if (zArr[5]) {
                fVar.e(5, this.f109420h);
            }
            fVar.g(6, 8, linkedList3);
            if (zArr[7]) {
                fVar.e(7, this.f109422m);
            }
            fVar.g(8, 2, linkedList2);
            if (zArr[9]) {
                fVar.e(9, this.f109424o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f109425p);
            }
            fVar.g(11, 8, linkedList);
            if (zArr[12]) {
                fVar.e(12, this.f109427r);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? b36.f.e(1, this.f109416d) + 0 : 0) + b36.f.g(2, 8, linkedList5);
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f109418f);
            }
            int g17 = e17 + b36.f.g(4, 2, linkedList4);
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f109420h);
            }
            int g18 = g17 + b36.f.g(6, 8, linkedList3);
            if (zArr[7]) {
                g18 += b36.f.e(7, this.f109422m);
            }
            int g19 = g18 + b36.f.g(8, 2, linkedList2);
            if (zArr[9]) {
                g19 += b36.f.e(9, this.f109424o);
            }
            if (zArr[10]) {
                g19 += b36.f.e(10, this.f109425p);
            }
            int g27 = g19 + b36.f.g(11, 8, linkedList);
            return zArr[12] ? g27 + b36.f.e(12, this.f109427r) : g27;
        }
        if (i17 == 2) {
            linkedList5.clear();
            linkedList4.clear();
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
                this.f109416d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var.b(bArr);
                    }
                    linkedList5.add(du5Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f109418f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                linkedList4.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[4] = true;
                return 0;
            case 5:
                this.f109420h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.du5 du5Var2 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var2.b(bArr2);
                    }
                    linkedList3.add(du5Var2);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f109422m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                linkedList2.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                zArr[8] = true;
                return 0;
            case 9:
                this.f109424o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f109425p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var3.b(bArr3);
                    }
                    linkedList.add(du5Var3);
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f109427r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.gk0) super.mo11468x92b714fd(bArr);
    }
}
