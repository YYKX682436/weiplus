package wn1;

/* loaded from: classes9.dex */
public class a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f528914d;

    /* renamed from: e, reason: collision with root package name */
    public long f528915e;

    /* renamed from: f, reason: collision with root package name */
    public int f528916f;

    /* renamed from: h, reason: collision with root package name */
    public long f528918h;

    /* renamed from: i, reason: collision with root package name */
    public int f528919i;

    /* renamed from: m, reason: collision with root package name */
    public long f528920m;

    /* renamed from: o, reason: collision with root package name */
    public int f528922o;

    /* renamed from: p, reason: collision with root package name */
    public long f528923p;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f528917g = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f528921n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f528924q = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.a)) {
            return false;
        }
        wn1.a aVar = (wn1.a) fVar;
        return n51.f.a(this.f528914d, aVar.f528914d) && n51.f.a(java.lang.Long.valueOf(this.f528915e), java.lang.Long.valueOf(aVar.f528915e)) && n51.f.a(java.lang.Integer.valueOf(this.f528916f), java.lang.Integer.valueOf(aVar.f528916f)) && n51.f.a(this.f528917g, aVar.f528917g) && n51.f.a(java.lang.Long.valueOf(this.f528918h), java.lang.Long.valueOf(aVar.f528918h)) && n51.f.a(java.lang.Integer.valueOf(this.f528919i), java.lang.Integer.valueOf(aVar.f528919i)) && n51.f.a(java.lang.Long.valueOf(this.f528920m), java.lang.Long.valueOf(aVar.f528920m)) && n51.f.a(this.f528921n, aVar.f528921n) && n51.f.a(java.lang.Integer.valueOf(this.f528922o), java.lang.Integer.valueOf(aVar.f528922o)) && n51.f.a(java.lang.Long.valueOf(this.f528923p), java.lang.Long.valueOf(aVar.f528923p)) && n51.f.a(this.f528924q, aVar.f528924q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f528924q;
        java.util.LinkedList linkedList2 = this.f528921n;
        java.util.LinkedList linkedList3 = this.f528917g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f528914d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f528915e);
            fVar.e(3, this.f528916f);
            fVar.g(4, 8, linkedList3);
            fVar.h(5, this.f528918h);
            fVar.e(6, this.f528919i);
            fVar.h(7, this.f528920m);
            fVar.g(8, 8, linkedList2);
            fVar.e(9, this.f528922o);
            fVar.h(10, this.f528923p);
            fVar.g(11, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f528914d;
            return (str2 != null ? b36.f.j(1, str2) + 0 : 0) + b36.f.h(2, this.f528915e) + b36.f.e(3, this.f528916f) + b36.f.g(4, 8, linkedList3) + b36.f.h(5, this.f528918h) + b36.f.e(6, this.f528919i) + b36.f.h(7, this.f528920m) + b36.f.g(8, 8, linkedList2) + b36.f.e(9, this.f528922o) + b36.f.h(10, this.f528923p) + b36.f.g(11, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        wn1.a aVar3 = (wn1.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                aVar3.f528914d = aVar2.k(intValue);
                return 0;
            case 2:
                aVar3.f528915e = aVar2.i(intValue);
                return 0;
            case 3:
                aVar3.f528916f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    wn1.c cVar = new wn1.c();
                    if (bArr2 != null && bArr2.length > 0) {
                        cVar.mo11468x92b714fd(bArr2);
                    }
                    aVar3.f528917g.add(cVar);
                }
                return 0;
            case 5:
                aVar3.f528918h = aVar2.i(intValue);
                return 0;
            case 6:
                aVar3.f528919i = aVar2.g(intValue);
                return 0;
            case 7:
                aVar3.f528920m = aVar2.i(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    wn1.b bVar = new wn1.b();
                    if (bArr3 != null && bArr3.length > 0) {
                        bVar.mo11468x92b714fd(bArr3);
                    }
                    aVar3.f528921n.add(bVar);
                }
                return 0;
            case 9:
                aVar3.f528922o = aVar2.g(intValue);
                return 0;
            case 10:
                aVar3.f528923p = aVar2.i(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    wn1.b bVar2 = new wn1.b();
                    if (bArr4 != null && bArr4.length > 0) {
                        bVar2.mo11468x92b714fd(bArr4);
                    }
                    aVar3.f528924q.add(bVar2);
                }
                return 0;
            default:
                return -1;
        }
    }
}
