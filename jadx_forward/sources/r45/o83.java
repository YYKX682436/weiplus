package r45;

/* loaded from: classes7.dex */
public class o83 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f463553d;

    /* renamed from: e, reason: collision with root package name */
    public int f463554e;

    /* renamed from: f, reason: collision with root package name */
    public int f463555f;

    /* renamed from: g, reason: collision with root package name */
    public int f463556g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463557h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463558i;

    /* renamed from: m, reason: collision with root package name */
    public int f463559m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f463560n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f463561o = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o83)) {
            return false;
        }
        r45.o83 o83Var = (r45.o83) fVar;
        return n51.f.a(this.f76494x2de60e5e, o83Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f463553d), java.lang.Integer.valueOf(o83Var.f463553d)) && n51.f.a(java.lang.Integer.valueOf(this.f463554e), java.lang.Integer.valueOf(o83Var.f463554e)) && n51.f.a(java.lang.Integer.valueOf(this.f463555f), java.lang.Integer.valueOf(o83Var.f463555f)) && n51.f.a(java.lang.Integer.valueOf(this.f463556g), java.lang.Integer.valueOf(o83Var.f463556g)) && n51.f.a(this.f463557h, o83Var.f463557h) && n51.f.a(this.f463558i, o83Var.f463558i) && n51.f.a(java.lang.Integer.valueOf(this.f463559m), java.lang.Integer.valueOf(o83Var.f463559m)) && n51.f.a(this.f463560n, o83Var.f463560n) && n51.f.a(this.f463561o, o83Var.f463561o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463560n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f463553d);
            fVar.e(3, this.f463554e);
            fVar.e(4, this.f463555f);
            fVar.e(5, this.f463556g);
            java.lang.String str = this.f463557h;
            if (str != null) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f463558i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f463559m);
            fVar.g(9, 8, linkedList);
            fVar.g(10, 6, this.f463561o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f463553d) + b36.f.e(3, this.f463554e) + b36.f.e(4, this.f463555f) + b36.f.e(5, this.f463556g);
            java.lang.String str3 = this.f463557h;
            if (str3 != null) {
                i18 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f463558i;
            if (str4 != null) {
                i18 += b36.f.j(7, str4);
            }
            return i18 + b36.f.e(8, this.f463559m) + b36.f.g(9, 8, linkedList) + b36.f.g(10, 6, this.f463561o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f463561o.clear();
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
        r45.o83 o83Var = (r45.o83) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    o83Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                o83Var.f463553d = aVar2.g(intValue);
                return 0;
            case 3:
                o83Var.f463554e = aVar2.g(intValue);
                return 0;
            case 4:
                o83Var.f463555f = aVar2.g(intValue);
                return 0;
            case 5:
                o83Var.f463556g = aVar2.g(intValue);
                return 0;
            case 6:
                o83Var.f463557h = aVar2.k(intValue);
                return 0;
            case 7:
                o83Var.f463558i = aVar2.k(intValue);
                return 0;
            case 8:
                o83Var.f463559m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.n83 n83Var = new r45.n83();
                    if (bArr3 != null && bArr3.length > 0) {
                        n83Var.mo11468x92b714fd(bArr3);
                    }
                    o83Var.f463560n.add(n83Var);
                }
                return 0;
            case 10:
                o83Var.f463561o.add(aVar2.d(intValue));
                return 0;
            default:
                return -1;
        }
    }
}
