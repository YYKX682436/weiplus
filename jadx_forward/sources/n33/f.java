package n33;

/* loaded from: classes8.dex */
public class f extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f416038d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f416039e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f416040f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f416041g;

    /* renamed from: h, reason: collision with root package name */
    public int f416042h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f416043i;

    /* renamed from: m, reason: collision with root package name */
    public int f416044m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof n33.f)) {
            return false;
        }
        n33.f fVar2 = (n33.f) fVar;
        return n51.f.a(this.f76492x92037252, fVar2.f76492x92037252) && n51.f.a(this.f416038d, fVar2.f416038d) && n51.f.a(this.f416039e, fVar2.f416039e) && n51.f.a(this.f416040f, fVar2.f416040f) && n51.f.a(java.lang.Integer.valueOf(this.f416041g), java.lang.Integer.valueOf(fVar2.f416041g)) && n51.f.a(java.lang.Integer.valueOf(this.f416042h), java.lang.Integer.valueOf(fVar2.f416042h)) && n51.f.a(this.f416043i, fVar2.f416043i) && n51.f.a(java.lang.Integer.valueOf(this.f416044m), java.lang.Integer.valueOf(fVar2.f416044m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f416040f;
        java.util.LinkedList linkedList2 = this.f416039e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f416038d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, linkedList2);
            fVar.g(4, 8, linkedList);
            fVar.e(5, this.f416041g);
            fVar.e(6, this.f416042h);
            java.lang.String str2 = this.f416043i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f416044m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f416038d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int g17 = i18 + b36.f.g(3, 1, linkedList2) + b36.f.g(4, 8, linkedList) + b36.f.e(5, this.f416041g) + b36.f.e(6, this.f416042h);
            java.lang.String str4 = this.f416043i;
            if (str4 != null) {
                g17 += b36.f.j(7, str4);
            }
            return g17 + b36.f.e(8, this.f416044m);
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
        n33.f fVar2 = (n33.f) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    fVar2.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                fVar2.f416038d = aVar2.k(intValue);
                return 0;
            case 3:
                fVar2.f416039e.add(aVar2.k(intValue));
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    n33.g gVar = new n33.g();
                    if (bArr3 != null && bArr3.length > 0) {
                        gVar.mo11468x92b714fd(bArr3);
                    }
                    fVar2.f416040f.add(gVar);
                }
                return 0;
            case 5:
                fVar2.f416041g = aVar2.g(intValue);
                return 0;
            case 6:
                fVar2.f416042h = aVar2.g(intValue);
                return 0;
            case 7:
                fVar2.f416043i = aVar2.k(intValue);
                return 0;
            case 8:
                fVar2.f416044m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
