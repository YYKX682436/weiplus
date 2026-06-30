package d02;

/* loaded from: classes2.dex */
public class e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f306837d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f306839f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f306840g;

    /* renamed from: i, reason: collision with root package name */
    public d02.n f306842i;

    /* renamed from: m, reason: collision with root package name */
    public d02.f f306843m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f306838e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f306841h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof d02.e)) {
            return false;
        }
        d02.e eVar = (d02.e) fVar;
        return n51.f.a(this.f306837d, eVar.f306837d) && n51.f.a(this.f306838e, eVar.f306838e) && n51.f.a(this.f306839f, eVar.f306839f) && n51.f.a(this.f306840g, eVar.f306840g) && n51.f.a(this.f306841h, eVar.f306841h) && n51.f.a(this.f306842i, eVar.f306842i) && n51.f.a(this.f306843m, eVar.f306843m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f306841h;
        java.util.LinkedList linkedList2 = this.f306838e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f306837d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, linkedList2);
            java.lang.String str2 = this.f306839f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f306840g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.g(5, 1, linkedList);
            d02.n nVar = this.f306842i;
            if (nVar != null) {
                fVar.i(6, nVar.mo75928xcd1e8d8());
                this.f306842i.mo75956x3d5d1f78(fVar);
            }
            d02.f fVar2 = this.f306843m;
            if (fVar2 != null) {
                fVar.i(7, fVar2.mo75928xcd1e8d8());
                this.f306843m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f306837d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.g(2, 1, linkedList2);
            java.lang.String str5 = this.f306839f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f306840g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            int g17 = j17 + b36.f.g(5, 1, linkedList);
            d02.n nVar2 = this.f306842i;
            if (nVar2 != null) {
                g17 += b36.f.i(6, nVar2.mo75928xcd1e8d8());
            }
            d02.f fVar3 = this.f306843m;
            return fVar3 != null ? g17 + b36.f.i(7, fVar3.mo75928xcd1e8d8()) : g17;
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
        d02.e eVar = (d02.e) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                eVar.f306837d = aVar2.k(intValue);
                return 0;
            case 2:
                eVar.f306838e.add(aVar2.k(intValue));
                return 0;
            case 3:
                eVar.f306839f = aVar2.k(intValue);
                return 0;
            case 4:
                eVar.f306840g = aVar2.k(intValue);
                return 0;
            case 5:
                eVar.f306841h.add(aVar2.k(intValue));
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    d02.n nVar3 = new d02.n();
                    if (bArr2 != null && bArr2.length > 0) {
                        nVar3.mo11468x92b714fd(bArr2);
                    }
                    eVar.f306842i = nVar3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    d02.f fVar4 = new d02.f();
                    if (bArr3 != null && bArr3.length > 0) {
                        fVar4.mo11468x92b714fd(bArr3);
                    }
                    eVar.f306843m = fVar4;
                }
                return 0;
            default:
                return -1;
        }
    }
}
