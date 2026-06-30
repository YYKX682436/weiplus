package wn1;

/* loaded from: classes9.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f528935d;

    /* renamed from: e, reason: collision with root package name */
    public long f528936e;

    /* renamed from: f, reason: collision with root package name */
    public int f528937f;

    /* renamed from: g, reason: collision with root package name */
    public long f528938g;

    /* renamed from: i, reason: collision with root package name */
    public int f528940i;

    /* renamed from: m, reason: collision with root package name */
    public long f528941m;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f528939h = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f528942n = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.c)) {
            return false;
        }
        wn1.c cVar = (wn1.c) fVar;
        return n51.f.a(this.f528935d, cVar.f528935d) && n51.f.a(java.lang.Long.valueOf(this.f528936e), java.lang.Long.valueOf(cVar.f528936e)) && n51.f.a(java.lang.Integer.valueOf(this.f528937f), java.lang.Integer.valueOf(cVar.f528937f)) && n51.f.a(java.lang.Long.valueOf(this.f528938g), java.lang.Long.valueOf(cVar.f528938g)) && n51.f.a(this.f528939h, cVar.f528939h) && n51.f.a(java.lang.Integer.valueOf(this.f528940i), java.lang.Integer.valueOf(cVar.f528940i)) && n51.f.a(java.lang.Long.valueOf(this.f528941m), java.lang.Long.valueOf(cVar.f528941m)) && n51.f.a(this.f528942n, cVar.f528942n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f528942n;
        java.util.LinkedList linkedList2 = this.f528939h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f528935d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f528936e);
            fVar.e(3, this.f528937f);
            fVar.h(4, this.f528938g);
            fVar.g(5, 8, linkedList2);
            fVar.e(6, this.f528940i);
            fVar.h(7, this.f528941m);
            fVar.g(8, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f528935d;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f528936e) + b36.f.e(3, this.f528937f) + b36.f.h(4, this.f528938g) + b36.f.g(5, 8, linkedList2) + b36.f.e(6, this.f528940i) + b36.f.h(7, this.f528941m) + b36.f.g(8, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        wn1.c cVar = (wn1.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                cVar.f528935d = aVar2.k(intValue);
                return 0;
            case 2:
                cVar.f528936e = aVar2.i(intValue);
                return 0;
            case 3:
                cVar.f528937f = aVar2.g(intValue);
                return 0;
            case 4:
                cVar.f528938g = aVar2.i(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    wn1.b bVar = new wn1.b();
                    if (bArr2 != null && bArr2.length > 0) {
                        bVar.mo11468x92b714fd(bArr2);
                    }
                    cVar.f528939h.add(bVar);
                }
                return 0;
            case 6:
                cVar.f528940i = aVar2.g(intValue);
                return 0;
            case 7:
                cVar.f528941m = aVar2.i(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    wn1.b bVar2 = new wn1.b();
                    if (bArr3 != null && bArr3.length > 0) {
                        bVar2.mo11468x92b714fd(bArr3);
                    }
                    cVar.f528942n.add(bVar2);
                }
                return 0;
            default:
                return -1;
        }
    }
}
