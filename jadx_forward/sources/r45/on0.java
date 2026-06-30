package r45;

/* loaded from: classes8.dex */
public class on0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f463897d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f463898e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f463899f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f463900g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f463901h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f463902i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f463903m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f463904n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f463905o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f463906p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f463907q;

    /* renamed from: r, reason: collision with root package name */
    public int f463908r;

    /* renamed from: s, reason: collision with root package name */
    public int f463909s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.on0)) {
            return false;
        }
        r45.on0 on0Var = (r45.on0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f463897d), java.lang.Long.valueOf(on0Var.f463897d)) && n51.f.a(this.f463898e, on0Var.f463898e) && n51.f.a(java.lang.Integer.valueOf(this.f463899f), java.lang.Integer.valueOf(on0Var.f463899f)) && n51.f.a(java.lang.Boolean.valueOf(this.f463900g), java.lang.Boolean.valueOf(on0Var.f463900g)) && n51.f.a(java.lang.Boolean.valueOf(this.f463901h), java.lang.Boolean.valueOf(on0Var.f463901h)) && n51.f.a(java.lang.Boolean.valueOf(this.f463902i), java.lang.Boolean.valueOf(on0Var.f463902i)) && n51.f.a(java.lang.Boolean.valueOf(this.f463903m), java.lang.Boolean.valueOf(on0Var.f463903m)) && n51.f.a(this.f463904n, on0Var.f463904n) && n51.f.a(this.f463905o, on0Var.f463905o) && n51.f.a(this.f463906p, on0Var.f463906p) && n51.f.a(java.lang.Boolean.valueOf(this.f463907q), java.lang.Boolean.valueOf(on0Var.f463907q)) && n51.f.a(java.lang.Integer.valueOf(this.f463908r), java.lang.Integer.valueOf(on0Var.f463908r)) && n51.f.a(java.lang.Integer.valueOf(this.f463909s), java.lang.Integer.valueOf(on0Var.f463909s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463898e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f463897d);
            fVar.g(2, 2, linkedList);
            fVar.e(3, this.f463899f);
            fVar.a(4, this.f463900g);
            fVar.a(5, this.f463901h);
            fVar.a(6, this.f463902i);
            fVar.a(7, this.f463903m);
            java.lang.String str = this.f463904n;
            if (str != null) {
                fVar.j(8, str);
            }
            java.lang.String str2 = this.f463905o;
            if (str2 != null) {
                fVar.j(9, str2);
            }
            java.lang.String str3 = this.f463906p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            fVar.a(11, this.f463907q);
            fVar.e(12, this.f463908r);
            fVar.e(13, this.f463909s);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f463897d) + 0 + b36.f.g(2, 2, linkedList) + b36.f.e(3, this.f463899f) + b36.f.a(4, this.f463900g) + b36.f.a(5, this.f463901h) + b36.f.a(6, this.f463902i) + b36.f.a(7, this.f463903m);
            java.lang.String str4 = this.f463904n;
            if (str4 != null) {
                h17 += b36.f.j(8, str4);
            }
            java.lang.String str5 = this.f463905o;
            if (str5 != null) {
                h17 += b36.f.j(9, str5);
            }
            java.lang.String str6 = this.f463906p;
            if (str6 != null) {
                h17 += b36.f.j(10, str6);
            }
            return h17 + b36.f.a(11, this.f463907q) + b36.f.e(12, this.f463908r) + b36.f.e(13, this.f463909s);
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
        r45.on0 on0Var = (r45.on0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                on0Var.f463897d = aVar2.i(intValue);
                return 0;
            case 2:
                on0Var.f463898e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 3:
                on0Var.f463899f = aVar2.g(intValue);
                return 0;
            case 4:
                on0Var.f463900g = aVar2.c(intValue);
                return 0;
            case 5:
                on0Var.f463901h = aVar2.c(intValue);
                return 0;
            case 6:
                on0Var.f463902i = aVar2.c(intValue);
                return 0;
            case 7:
                on0Var.f463903m = aVar2.c(intValue);
                return 0;
            case 8:
                on0Var.f463904n = aVar2.k(intValue);
                return 0;
            case 9:
                on0Var.f463905o = aVar2.k(intValue);
                return 0;
            case 10:
                on0Var.f463906p = aVar2.k(intValue);
                return 0;
            case 11:
                on0Var.f463907q = aVar2.c(intValue);
                return 0;
            case 12:
                on0Var.f463908r = aVar2.g(intValue);
                return 0;
            case 13:
                on0Var.f463909s = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
