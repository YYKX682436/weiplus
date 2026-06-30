package r45;

/* loaded from: classes2.dex */
public class c80 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f452897d;

    /* renamed from: e, reason: collision with root package name */
    public int f452898e;

    /* renamed from: f, reason: collision with root package name */
    public int f452899f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452900g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452901h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f452902i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f452903m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f452904n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f452905o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c80)) {
            return false;
        }
        r45.c80 c80Var = (r45.c80) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f452897d), java.lang.Long.valueOf(c80Var.f452897d)) && n51.f.a(java.lang.Integer.valueOf(this.f452898e), java.lang.Integer.valueOf(c80Var.f452898e)) && n51.f.a(java.lang.Integer.valueOf(this.f452899f), java.lang.Integer.valueOf(c80Var.f452899f)) && n51.f.a(this.f452900g, c80Var.f452900g) && n51.f.a(this.f452901h, c80Var.f452901h) && n51.f.a(this.f452902i, c80Var.f452902i) && n51.f.a(this.f452903m, c80Var.f452903m) && n51.f.a(java.lang.Boolean.valueOf(this.f452904n), java.lang.Boolean.valueOf(c80Var.f452904n)) && n51.f.a(this.f452905o, c80Var.f452905o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f452902i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f452897d);
            fVar.e(2, this.f452898e);
            fVar.e(3, this.f452899f);
            java.lang.String str = this.f452900g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f452901h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.g(6, 1, linkedList);
            java.lang.String str3 = this.f452903m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.a(8, this.f452904n);
            java.lang.String str4 = this.f452905o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f452897d) + 0 + b36.f.e(2, this.f452898e) + b36.f.e(3, this.f452899f);
            java.lang.String str5 = this.f452900g;
            if (str5 != null) {
                h17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f452901h;
            if (str6 != null) {
                h17 += b36.f.j(5, str6);
            }
            int g17 = h17 + b36.f.g(6, 1, linkedList);
            java.lang.String str7 = this.f452903m;
            if (str7 != null) {
                g17 += b36.f.j(7, str7);
            }
            int a17 = g17 + b36.f.a(8, this.f452904n);
            java.lang.String str8 = this.f452905o;
            return str8 != null ? a17 + b36.f.j(9, str8) : a17;
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
        r45.c80 c80Var = (r45.c80) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c80Var.f452897d = aVar2.i(intValue);
                return 0;
            case 2:
                c80Var.f452898e = aVar2.g(intValue);
                return 0;
            case 3:
                c80Var.f452899f = aVar2.g(intValue);
                return 0;
            case 4:
                c80Var.f452900g = aVar2.k(intValue);
                return 0;
            case 5:
                c80Var.f452901h = aVar2.k(intValue);
                return 0;
            case 6:
                c80Var.f452902i.add(aVar2.k(intValue));
                return 0;
            case 7:
                c80Var.f452903m = aVar2.k(intValue);
                return 0;
            case 8:
                c80Var.f452904n = aVar2.c(intValue);
                return 0;
            case 9:
                c80Var.f452905o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
