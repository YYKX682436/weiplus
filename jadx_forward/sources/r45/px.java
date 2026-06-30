package r45;

/* loaded from: classes9.dex */
public class px extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f464975d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464976e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464977f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464978g;

    /* renamed from: h, reason: collision with root package name */
    public int f464979h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f464980i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464981m;

    /* renamed from: n, reason: collision with root package name */
    public int f464982n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f464983o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.px)) {
            return false;
        }
        r45.px pxVar = (r45.px) fVar;
        return n51.f.a(this.f76492x92037252, pxVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f464975d), java.lang.Integer.valueOf(pxVar.f464975d)) && n51.f.a(this.f464976e, pxVar.f464976e) && n51.f.a(this.f464977f, pxVar.f464977f) && n51.f.a(this.f464978g, pxVar.f464978g) && n51.f.a(java.lang.Integer.valueOf(this.f464979h), java.lang.Integer.valueOf(pxVar.f464979h)) && n51.f.a(this.f464980i, pxVar.f464980i) && n51.f.a(this.f464981m, pxVar.f464981m) && n51.f.a(java.lang.Integer.valueOf(this.f464982n), java.lang.Integer.valueOf(pxVar.f464982n)) && n51.f.a(this.f464983o, pxVar.f464983o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464980i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f464975d);
            java.lang.String str = this.f464976e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f464977f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f464978g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f464979h);
            fVar.g(7, 2, linkedList);
            java.lang.String str4 = this.f464981m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f464982n);
            java.lang.String str5 = this.f464983o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f464975d);
            java.lang.String str6 = this.f464976e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f464977f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f464978g;
            if (str8 != null) {
                i18 += b36.f.j(5, str8);
            }
            int e17 = i18 + b36.f.e(6, this.f464979h) + b36.f.g(7, 2, linkedList);
            java.lang.String str9 = this.f464981m;
            if (str9 != null) {
                e17 += b36.f.j(8, str9);
            }
            int e18 = e17 + b36.f.e(9, this.f464982n);
            java.lang.String str10 = this.f464983o;
            return str10 != null ? e18 + b36.f.j(10, str10) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.px pxVar = (r45.px) objArr[1];
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
                    pxVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                pxVar.f464975d = aVar2.g(intValue);
                return 0;
            case 3:
                pxVar.f464976e = aVar2.k(intValue);
                return 0;
            case 4:
                pxVar.f464977f = aVar2.k(intValue);
                return 0;
            case 5:
                pxVar.f464978g = aVar2.k(intValue);
                return 0;
            case 6:
                pxVar.f464979h = aVar2.g(intValue);
                return 0;
            case 7:
                pxVar.f464980i.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 8:
                pxVar.f464981m = aVar2.k(intValue);
                return 0;
            case 9:
                pxVar.f464982n = aVar2.g(intValue);
                return 0;
            case 10:
                pxVar.f464983o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
