package bw5;

/* loaded from: classes2.dex */
public class gc0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109329d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109330e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109331f;

    /* renamed from: g, reason: collision with root package name */
    public int f109332g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109333h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f109334i;

    /* renamed from: o, reason: collision with root package name */
    public int f109337o;

    /* renamed from: p, reason: collision with root package name */
    public int f109338p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f109339q;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f109335m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f109336n = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f109340r = new boolean[12];

    static {
        new bw5.gc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gc0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.gc0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gc0)) {
            return false;
        }
        bw5.gc0 gc0Var = (bw5.gc0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109329d), java.lang.Integer.valueOf(gc0Var.f109329d)) && n51.f.a(this.f109330e, gc0Var.f109330e) && n51.f.a(this.f109331f, gc0Var.f109331f) && n51.f.a(java.lang.Integer.valueOf(this.f109332g), java.lang.Integer.valueOf(gc0Var.f109332g)) && n51.f.a(this.f109333h, gc0Var.f109333h) && n51.f.a(this.f109334i, gc0Var.f109334i) && n51.f.a(this.f109335m, gc0Var.f109335m) && n51.f.a(this.f109336n, gc0Var.f109336n) && n51.f.a(java.lang.Integer.valueOf(this.f109337o), java.lang.Integer.valueOf(gc0Var.f109337o)) && n51.f.a(java.lang.Integer.valueOf(this.f109338p), java.lang.Integer.valueOf(gc0Var.f109338p)) && n51.f.a(this.f109339q, gc0Var.f109339q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gc0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f109336n;
        java.util.LinkedList linkedList2 = this.f109335m;
        boolean[] zArr = this.f109340r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109329d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f109330e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f109331f;
            if (gVar2 != null && zArr[3]) {
                fVar.b(3, gVar2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f109332g);
            }
            java.lang.String str = this.f109333h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f109334i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            fVar.g(7, 1, linkedList2);
            fVar.g(8, 1, linkedList);
            if (zArr[9]) {
                fVar.e(9, this.f109337o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f109338p);
            }
            java.lang.String str3 = this.f109339q;
            if (str3 == null || !zArr[11]) {
                return 0;
            }
            fVar.j(11, str3);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f109329d) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f109330e;
            if (gVar3 != null && zArr[2]) {
                e17 += b36.f.b(2, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f109331f;
            if (gVar4 != null && zArr[3]) {
                e17 += b36.f.b(3, gVar4);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f109332g);
            }
            java.lang.String str4 = this.f109333h;
            if (str4 != null && zArr[5]) {
                e17 += b36.f.j(5, str4);
            }
            java.lang.String str5 = this.f109334i;
            if (str5 != null && zArr[6]) {
                e17 += b36.f.j(6, str5);
            }
            int g17 = e17 + b36.f.g(7, 1, linkedList2) + b36.f.g(8, 1, linkedList);
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f109337o);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f109338p);
            }
            java.lang.String str6 = this.f109339q;
            return (str6 == null || !zArr[11]) ? g17 : g17 + b36.f.j(11, str6);
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
                this.f109329d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109330e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109331f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109332g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109333h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109334i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                linkedList2.add(aVar2.k(intValue));
                zArr[7] = true;
                return 0;
            case 8:
                linkedList.add(aVar2.k(intValue));
                zArr[8] = true;
                return 0;
            case 9:
                this.f109337o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f109338p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f109339q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
