package r45;

/* loaded from: classes9.dex */
public class ml extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f462144d;

    /* renamed from: e, reason: collision with root package name */
    public int f462145e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462146f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462147g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462148h;

    /* renamed from: i, reason: collision with root package name */
    public int f462149i;

    /* renamed from: m, reason: collision with root package name */
    public int f462150m;

    /* renamed from: n, reason: collision with root package name */
    public int f462151n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f462152o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public long f462153p;

    /* renamed from: q, reason: collision with root package name */
    public int f462154q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ml)) {
            return false;
        }
        r45.ml mlVar = (r45.ml) fVar;
        return n51.f.a(this.f76494x2de60e5e, mlVar.f76494x2de60e5e) && n51.f.a(this.f462144d, mlVar.f462144d) && n51.f.a(java.lang.Integer.valueOf(this.f462145e), java.lang.Integer.valueOf(mlVar.f462145e)) && n51.f.a(this.f462146f, mlVar.f462146f) && n51.f.a(this.f462147g, mlVar.f462147g) && n51.f.a(this.f462148h, mlVar.f462148h) && n51.f.a(java.lang.Integer.valueOf(this.f462149i), java.lang.Integer.valueOf(mlVar.f462149i)) && n51.f.a(java.lang.Integer.valueOf(this.f462150m), java.lang.Integer.valueOf(mlVar.f462150m)) && n51.f.a(java.lang.Integer.valueOf(this.f462151n), java.lang.Integer.valueOf(mlVar.f462151n)) && n51.f.a(this.f462152o, mlVar.f462152o) && n51.f.a(java.lang.Long.valueOf(this.f462153p), java.lang.Long.valueOf(mlVar.f462153p)) && n51.f.a(java.lang.Integer.valueOf(this.f462154q), java.lang.Integer.valueOf(mlVar.f462154q));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f462152o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f462144d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.e(3, this.f462145e);
            java.lang.String str = this.f462146f;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f462147g;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f462148h;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f462149i);
            fVar.e(9, this.f462150m);
            fVar.e(10, this.f462151n);
            fVar.g(17, 8, linkedList);
            fVar.h(18, this.f462153p);
            fVar.e(22, this.f462154q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f462144d;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            int e17 = i18 + b36.f.e(3, this.f462145e);
            java.lang.String str4 = this.f462146f;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            java.lang.String str5 = this.f462147g;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f462148h;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            return e17 + b36.f.e(8, this.f462149i) + b36.f.e(9, this.f462150m) + b36.f.e(10, this.f462151n) + b36.f.g(17, 8, linkedList) + b36.f.h(18, this.f462153p) + b36.f.e(22, this.f462154q);
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
        r45.ml mlVar = (r45.ml) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                mlVar.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            mlVar.f462144d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            mlVar.f462145e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 17) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.si siVar = new r45.si();
                if (bArr3 != null && bArr3.length > 0) {
                    siVar.mo11468x92b714fd(bArr3);
                }
                mlVar.f462152o.add(siVar);
            }
            return 0;
        }
        if (intValue == 18) {
            mlVar.f462153p = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 22) {
            mlVar.f462154q = aVar2.g(intValue);
            return 0;
        }
        switch (intValue) {
            case 5:
                mlVar.f462146f = aVar2.k(intValue);
                return 0;
            case 6:
                mlVar.f462147g = aVar2.k(intValue);
                return 0;
            case 7:
                mlVar.f462148h = aVar2.k(intValue);
                return 0;
            case 8:
                mlVar.f462149i = aVar2.g(intValue);
                return 0;
            case 9:
                mlVar.f462150m = aVar2.g(intValue);
                return 0;
            case 10:
                mlVar.f462151n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
