package r45;

/* loaded from: classes7.dex */
public class vm6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f469905d;

    /* renamed from: e, reason: collision with root package name */
    public int f469906e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469907f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469908g;

    /* renamed from: h, reason: collision with root package name */
    public int f469909h;

    /* renamed from: i, reason: collision with root package name */
    public int f469910i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f469912n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f469913o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f469915q;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f469911m = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f469914p = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vm6)) {
            return false;
        }
        r45.vm6 vm6Var = (r45.vm6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f469905d), java.lang.Integer.valueOf(vm6Var.f469905d)) && n51.f.a(java.lang.Integer.valueOf(this.f469906e), java.lang.Integer.valueOf(vm6Var.f469906e)) && n51.f.a(this.f469907f, vm6Var.f469907f) && n51.f.a(this.f469908g, vm6Var.f469908g) && n51.f.a(java.lang.Integer.valueOf(this.f469909h), java.lang.Integer.valueOf(vm6Var.f469909h)) && n51.f.a(java.lang.Integer.valueOf(this.f469910i), java.lang.Integer.valueOf(vm6Var.f469910i)) && n51.f.a(this.f469911m, vm6Var.f469911m) && n51.f.a(java.lang.Boolean.valueOf(this.f469912n), java.lang.Boolean.valueOf(vm6Var.f469912n)) && n51.f.a(this.f469913o, vm6Var.f469913o) && n51.f.a(this.f469914p, vm6Var.f469914p) && n51.f.a(this.f469915q, vm6Var.f469915q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469914p;
        java.util.LinkedList linkedList2 = this.f469911m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f469905d);
            fVar.e(2, this.f469906e);
            java.lang.String str = this.f469907f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f469908g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f469909h);
            fVar.e(6, this.f469910i);
            fVar.g(7, 8, linkedList2);
            fVar.a(8, this.f469912n);
            java.lang.String str3 = this.f469913o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.g(10, 8, linkedList);
            java.lang.String str4 = this.f469915q;
            if (str4 == null) {
                return 0;
            }
            fVar.j(11, str4);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f469905d) + 0 + b36.f.e(2, this.f469906e);
            java.lang.String str5 = this.f469907f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f469908g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            int e18 = e17 + b36.f.e(5, this.f469909h) + b36.f.e(6, this.f469910i) + b36.f.g(7, 8, linkedList2) + b36.f.a(8, this.f469912n);
            java.lang.String str7 = this.f469913o;
            if (str7 != null) {
                e18 += b36.f.j(9, str7);
            }
            int g17 = e18 + b36.f.g(10, 8, linkedList);
            java.lang.String str8 = this.f469915q;
            return str8 != null ? g17 + b36.f.j(11, str8) : g17;
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
        r45.vm6 vm6Var = (r45.vm6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vm6Var.f469905d = aVar2.g(intValue);
                return 0;
            case 2:
                vm6Var.f469906e = aVar2.g(intValue);
                return 0;
            case 3:
                vm6Var.f469907f = aVar2.k(intValue);
                return 0;
            case 4:
                vm6Var.f469908g = aVar2.k(intValue);
                return 0;
            case 5:
                vm6Var.f469909h = aVar2.g(intValue);
                return 0;
            case 6:
                vm6Var.f469910i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.um6 um6Var = new r45.um6();
                    if (bArr2 != null && bArr2.length > 0) {
                        um6Var.mo11468x92b714fd(bArr2);
                    }
                    vm6Var.f469911m.add(um6Var);
                }
                return 0;
            case 8:
                vm6Var.f469912n = aVar2.c(intValue);
                return 0;
            case 9:
                vm6Var.f469913o = aVar2.k(intValue);
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.xm6 xm6Var = new r45.xm6();
                    if (bArr3 != null && bArr3.length > 0) {
                        xm6Var.mo11468x92b714fd(bArr3);
                    }
                    vm6Var.f469914p.add(xm6Var);
                }
                return 0;
            case 11:
                vm6Var.f469915q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
