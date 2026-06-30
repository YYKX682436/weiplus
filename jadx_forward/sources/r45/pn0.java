package r45;

/* loaded from: classes2.dex */
public class pn0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464746d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464747e;

    /* renamed from: f, reason: collision with root package name */
    public long f464748f;

    /* renamed from: h, reason: collision with root package name */
    public int f464750h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464751i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464752m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f464753n;

    /* renamed from: p, reason: collision with root package name */
    public int f464755p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f464756q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f464757r;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f464749g = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f464754o = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pn0)) {
            return false;
        }
        r45.pn0 pn0Var = (r45.pn0) fVar;
        return n51.f.a(this.f464746d, pn0Var.f464746d) && n51.f.a(this.f464747e, pn0Var.f464747e) && n51.f.a(java.lang.Long.valueOf(this.f464748f), java.lang.Long.valueOf(pn0Var.f464748f)) && n51.f.a(this.f464749g, pn0Var.f464749g) && n51.f.a(java.lang.Integer.valueOf(this.f464750h), java.lang.Integer.valueOf(pn0Var.f464750h)) && n51.f.a(this.f464751i, pn0Var.f464751i) && n51.f.a(this.f464752m, pn0Var.f464752m) && n51.f.a(this.f464753n, pn0Var.f464753n) && n51.f.a(this.f464754o, pn0Var.f464754o) && n51.f.a(java.lang.Integer.valueOf(this.f464755p), java.lang.Integer.valueOf(pn0Var.f464755p)) && n51.f.a(this.f464756q, pn0Var.f464756q) && n51.f.a(this.f464757r, pn0Var.f464757r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464754o;
        java.util.LinkedList linkedList2 = this.f464749g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464746d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f464747e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f464748f);
            fVar.g(4, 8, linkedList2);
            fVar.e(5, this.f464750h);
            java.lang.String str3 = this.f464751i;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f464752m;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            java.lang.String str5 = this.f464753n;
            if (str5 != null) {
                fVar.j(8, str5);
            }
            fVar.g(9, 1, linkedList);
            fVar.e(10, this.f464755p);
            java.lang.String str6 = this.f464756q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            java.lang.String str7 = this.f464757r;
            if (str7 != null) {
                fVar.j(12, str7);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str8 = this.f464746d;
            int j17 = str8 != null ? b36.f.j(1, str8) + 0 : 0;
            java.lang.String str9 = this.f464747e;
            if (str9 != null) {
                j17 += b36.f.j(2, str9);
            }
            int h17 = j17 + b36.f.h(3, this.f464748f) + b36.f.g(4, 8, linkedList2) + b36.f.e(5, this.f464750h);
            java.lang.String str10 = this.f464751i;
            if (str10 != null) {
                h17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f464752m;
            if (str11 != null) {
                h17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f464753n;
            if (str12 != null) {
                h17 += b36.f.j(8, str12);
            }
            int g17 = h17 + b36.f.g(9, 1, linkedList) + b36.f.e(10, this.f464755p);
            java.lang.String str13 = this.f464756q;
            if (str13 != null) {
                g17 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f464757r;
            return str14 != null ? g17 + b36.f.j(12, str14) : g17;
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
        r45.pn0 pn0Var = (r45.pn0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                pn0Var.f464746d = aVar2.k(intValue);
                return 0;
            case 2:
                pn0Var.f464747e = aVar2.k(intValue);
                return 0;
            case 3:
                pn0Var.f464748f = aVar2.i(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.yl ylVar = new r45.yl();
                    if (bArr2 != null && bArr2.length > 0) {
                        ylVar.mo11468x92b714fd(bArr2);
                    }
                    pn0Var.f464749g.add(ylVar);
                }
                return 0;
            case 5:
                pn0Var.f464750h = aVar2.g(intValue);
                return 0;
            case 6:
                pn0Var.f464751i = aVar2.k(intValue);
                return 0;
            case 7:
                pn0Var.f464752m = aVar2.k(intValue);
                return 0;
            case 8:
                pn0Var.f464753n = aVar2.k(intValue);
                return 0;
            case 9:
                pn0Var.f464754o.add(aVar2.k(intValue));
                return 0;
            case 10:
                pn0Var.f464755p = aVar2.g(intValue);
                return 0;
            case 11:
                pn0Var.f464756q = aVar2.k(intValue);
                return 0;
            case 12:
                pn0Var.f464757r = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
