package r45;

/* loaded from: classes11.dex */
public class mm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f462168d;

    /* renamed from: e, reason: collision with root package name */
    public int f462169e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462170f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462171g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462172h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f462173i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f462174m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f462175n;

    /* renamed from: o, reason: collision with root package name */
    public int f462176o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.nf0 f462177p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mm)) {
            return false;
        }
        r45.mm mmVar = (r45.mm) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462168d), java.lang.Integer.valueOf(mmVar.f462168d)) && n51.f.a(java.lang.Integer.valueOf(this.f462169e), java.lang.Integer.valueOf(mmVar.f462169e)) && n51.f.a(this.f462170f, mmVar.f462170f) && n51.f.a(this.f462171g, mmVar.f462171g) && n51.f.a(this.f462172h, mmVar.f462172h) && n51.f.a(this.f462173i, mmVar.f462173i) && n51.f.a(java.lang.Integer.valueOf(this.f462174m), java.lang.Integer.valueOf(mmVar.f462174m)) && n51.f.a(this.f462175n, mmVar.f462175n) && n51.f.a(java.lang.Integer.valueOf(this.f462176o), java.lang.Integer.valueOf(mmVar.f462176o)) && n51.f.a(this.f462177p, mmVar.f462177p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f462173i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462168d);
            fVar.e(2, this.f462169e);
            java.lang.String str = this.f462170f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f462171g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f462172h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.g(6, 8, linkedList);
            fVar.e(7, this.f462174m);
            java.lang.String str4 = this.f462175n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f462176o);
            bw5.nf0 nf0Var = this.f462177p;
            if (nf0Var != null) {
                fVar.i(10, nf0Var.mo75928xcd1e8d8());
                this.f462177p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462168d) + 0 + b36.f.e(2, this.f462169e);
            java.lang.String str5 = this.f462170f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f462171g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f462172h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            int g17 = e17 + b36.f.g(6, 8, linkedList) + b36.f.e(7, this.f462174m);
            java.lang.String str8 = this.f462175n;
            if (str8 != null) {
                g17 += b36.f.j(8, str8);
            }
            int e18 = g17 + b36.f.e(9, this.f462176o);
            bw5.nf0 nf0Var2 = this.f462177p;
            return nf0Var2 != null ? e18 + b36.f.i(10, nf0Var2.mo75928xcd1e8d8()) : e18;
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
        r45.mm mmVar = (r45.mm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                mmVar.f462168d = aVar2.g(intValue);
                return 0;
            case 2:
                mmVar.f462169e = aVar2.g(intValue);
                return 0;
            case 3:
                mmVar.f462170f = aVar2.k(intValue);
                return 0;
            case 4:
                mmVar.f462171g = aVar2.k(intValue);
                return 0;
            case 5:
                mmVar.f462172h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.mm mmVar2 = new r45.mm();
                    if (bArr2 != null && bArr2.length > 0) {
                        mmVar2.mo11468x92b714fd(bArr2);
                    }
                    mmVar.f462173i.add(mmVar2);
                }
                return 0;
            case 7:
                mmVar.f462174m = aVar2.g(intValue);
                return 0;
            case 8:
                mmVar.f462175n = aVar2.k(intValue);
                return 0;
            case 9:
                mmVar.f462176o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    bw5.nf0 nf0Var3 = new bw5.nf0();
                    if (bArr3 != null && bArr3.length > 0) {
                        nf0Var3.mo11468x92b714fd(bArr3);
                    }
                    mmVar.f462177p = nf0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
