package bw5;

/* loaded from: classes8.dex */
public class lc0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f111270d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f111271e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f111272f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f111273g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f111274h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f111275i;

    /* renamed from: m, reason: collision with root package name */
    public int f111276m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f111278o;

    /* renamed from: p, reason: collision with root package name */
    public int f111279p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f111281r;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f111277n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f111280q = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f111282s = new boolean[13];

    static {
        new bw5.lc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lc0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.lc0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lc0)) {
            return false;
        }
        bw5.lc0 lc0Var = (bw5.lc0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f111270d), java.lang.Boolean.valueOf(lc0Var.f111270d)) && n51.f.a(java.lang.Boolean.valueOf(this.f111271e), java.lang.Boolean.valueOf(lc0Var.f111271e)) && n51.f.a(java.lang.Boolean.valueOf(this.f111272f), java.lang.Boolean.valueOf(lc0Var.f111272f)) && n51.f.a(java.lang.Boolean.valueOf(this.f111273g), java.lang.Boolean.valueOf(lc0Var.f111273g)) && n51.f.a(java.lang.Boolean.valueOf(this.f111274h), java.lang.Boolean.valueOf(lc0Var.f111274h)) && n51.f.a(java.lang.Boolean.valueOf(this.f111275i), java.lang.Boolean.valueOf(lc0Var.f111275i)) && n51.f.a(java.lang.Integer.valueOf(this.f111276m), java.lang.Integer.valueOf(lc0Var.f111276m)) && n51.f.a(this.f111277n, lc0Var.f111277n) && n51.f.a(java.lang.Boolean.valueOf(this.f111278o), java.lang.Boolean.valueOf(lc0Var.f111278o)) && n51.f.a(java.lang.Integer.valueOf(this.f111279p), java.lang.Integer.valueOf(lc0Var.f111279p)) && n51.f.a(this.f111280q, lc0Var.f111280q) && n51.f.a(java.lang.Boolean.valueOf(this.f111281r), java.lang.Boolean.valueOf(lc0Var.f111281r));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.lc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f111280q;
        java.util.LinkedList linkedList2 = this.f111277n;
        boolean[] zArr = this.f111282s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f111270d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f111271e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f111272f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f111273g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f111274h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f111275i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f111276m);
            }
            fVar.g(8, 8, linkedList2);
            if (zArr[9]) {
                fVar.a(9, this.f111278o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f111279p);
            }
            fVar.g(11, 8, linkedList);
            if (!zArr[12]) {
                return 0;
            }
            fVar.a(12, this.f111281r);
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f111270d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f111271e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f111272f);
            }
            if (zArr[4]) {
                a17 += b36.f.a(4, this.f111273g);
            }
            if (zArr[5]) {
                a17 += b36.f.a(5, this.f111274h);
            }
            if (zArr[6]) {
                a17 += b36.f.a(6, this.f111275i);
            }
            if (zArr[7]) {
                a17 += b36.f.e(7, this.f111276m);
            }
            int g17 = a17 + b36.f.g(8, 8, linkedList2);
            if (zArr[9]) {
                g17 += b36.f.a(9, this.f111278o);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f111279p);
            }
            int g18 = g17 + b36.f.g(11, 8, linkedList);
            return zArr[12] ? g18 + b36.f.a(12, this.f111281r) : g18;
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
                this.f111270d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111271e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111272f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111273g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111274h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111275i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f111276m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.jc0 jc0Var = new bw5.jc0();
                    if (bArr != null && bArr.length > 0) {
                        jc0Var.mo11468x92b714fd(bArr);
                    }
                    linkedList2.add(jc0Var);
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f111278o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f111279p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.kc0 kc0Var = new bw5.kc0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kc0Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(kc0Var);
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f111281r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
