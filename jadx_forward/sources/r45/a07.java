package r45;

/* loaded from: classes15.dex */
public class a07 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: m, reason: collision with root package name */
    public int f451140m;

    /* renamed from: n, reason: collision with root package name */
    public int f451141n;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451134d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451135e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451136f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451137g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451138h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f451139i = 0;

    /* renamed from: o, reason: collision with root package name */
    public long f451142o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f451143p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f451144q = 0;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f451145r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f451146s = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public boolean f451147t = true;

    /* renamed from: u, reason: collision with root package name */
    public int f451148u = -1;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a07)) {
            return false;
        }
        r45.a07 a07Var = (r45.a07) fVar;
        return n51.f.a(this.f451134d, a07Var.f451134d) && n51.f.a(this.f451135e, a07Var.f451135e) && n51.f.a(this.f451136f, a07Var.f451136f) && n51.f.a(this.f451137g, a07Var.f451137g) && n51.f.a(this.f451138h, a07Var.f451138h) && n51.f.a(java.lang.Integer.valueOf(this.f451139i), java.lang.Integer.valueOf(a07Var.f451139i)) && n51.f.a(java.lang.Integer.valueOf(this.f451140m), java.lang.Integer.valueOf(a07Var.f451140m)) && n51.f.a(java.lang.Integer.valueOf(this.f451141n), java.lang.Integer.valueOf(a07Var.f451141n)) && n51.f.a(java.lang.Long.valueOf(this.f451142o), java.lang.Long.valueOf(a07Var.f451142o)) && n51.f.a(java.lang.Long.valueOf(this.f451143p), java.lang.Long.valueOf(a07Var.f451143p)) && n51.f.a(java.lang.Integer.valueOf(this.f451144q), java.lang.Integer.valueOf(a07Var.f451144q)) && n51.f.a(this.f451145r, a07Var.f451145r) && n51.f.a(this.f451146s, a07Var.f451146s) && n51.f.a(java.lang.Boolean.valueOf(this.f451147t), java.lang.Boolean.valueOf(a07Var.f451147t)) && n51.f.a(java.lang.Integer.valueOf(this.f451148u), java.lang.Integer.valueOf(a07Var.f451148u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f451146s;
        java.util.LinkedList linkedList2 = this.f451145r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451134d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f451135e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f451136f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f451137g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f451138h;
            if (str5 != null) {
                fVar.j(5, str5);
            }
            fVar.e(6, this.f451139i);
            fVar.e(7, this.f451140m);
            fVar.e(8, this.f451141n);
            fVar.h(9, this.f451142o);
            fVar.h(10, this.f451143p);
            fVar.e(11, this.f451144q);
            fVar.g(12, 8, linkedList2);
            fVar.g(13, 8, linkedList);
            fVar.a(14, this.f451147t);
            fVar.e(15, this.f451148u);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f451134d;
            int j17 = str6 != null ? b36.f.j(1, str6) + 0 : 0;
            java.lang.String str7 = this.f451135e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f451136f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f451137g;
            if (str9 != null) {
                j17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f451138h;
            if (str10 != null) {
                j17 += b36.f.j(5, str10);
            }
            return j17 + b36.f.e(6, this.f451139i) + b36.f.e(7, this.f451140m) + b36.f.e(8, this.f451141n) + b36.f.h(9, this.f451142o) + b36.f.h(10, this.f451143p) + b36.f.e(11, this.f451144q) + b36.f.g(12, 8, linkedList2) + b36.f.g(13, 8, linkedList) + b36.f.a(14, this.f451147t) + b36.f.e(15, this.f451148u);
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
        r45.a07 a07Var = (r45.a07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a07Var.f451134d = aVar2.k(intValue);
                return 0;
            case 2:
                a07Var.f451135e = aVar2.k(intValue);
                return 0;
            case 3:
                a07Var.f451136f = aVar2.k(intValue);
                return 0;
            case 4:
                a07Var.f451137g = aVar2.k(intValue);
                return 0;
            case 5:
                a07Var.f451138h = aVar2.k(intValue);
                return 0;
            case 6:
                a07Var.f451139i = aVar2.g(intValue);
                return 0;
            case 7:
                a07Var.f451140m = aVar2.g(intValue);
                return 0;
            case 8:
                a07Var.f451141n = aVar2.g(intValue);
                return 0;
            case 9:
                a07Var.f451142o = aVar2.i(intValue);
                return 0;
            case 10:
                a07Var.f451143p = aVar2.i(intValue);
                return 0;
            case 11:
                a07Var.f451144q = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.ql qlVar = new r45.ql();
                    if (bArr2 != null && bArr2.length > 0) {
                        qlVar.mo11468x92b714fd(bArr2);
                    }
                    a07Var.f451145r.add(qlVar);
                }
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.k44 k44Var = new r45.k44();
                    if (bArr3 != null && bArr3.length > 0) {
                        k44Var.mo11468x92b714fd(bArr3);
                    }
                    a07Var.f451146s.add(k44Var);
                }
                return 0;
            case 14:
                a07Var.f451147t = aVar2.c(intValue);
                return 0;
            case 15:
                a07Var.f451148u = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
