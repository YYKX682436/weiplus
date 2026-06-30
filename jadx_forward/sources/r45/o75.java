package r45;

/* loaded from: classes2.dex */
public class o75 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f463535d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f463536e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rl6 f463537f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f463538g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f463539h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o75)) {
            return false;
        }
        r45.o75 o75Var = (r45.o75) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f463535d), java.lang.Boolean.valueOf(o75Var.f463535d)) && n51.f.a(java.lang.Boolean.valueOf(this.f463536e), java.lang.Boolean.valueOf(o75Var.f463536e)) && n51.f.a(this.f463537f, o75Var.f463537f) && n51.f.a(this.f463538g, o75Var.f463538g) && n51.f.a(this.f463539h, o75Var.f463539h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463539h;
        java.util.LinkedList linkedList2 = this.f463538g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f463535d);
            fVar.a(2, this.f463536e);
            r45.rl6 rl6Var = this.f463537f;
            if (rl6Var != null) {
                fVar.i(3, rl6Var.mo75928xcd1e8d8());
                this.f463537f.mo75956x3d5d1f78(fVar);
            }
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f463535d) + 0 + b36.f.a(2, this.f463536e);
            r45.rl6 rl6Var2 = this.f463537f;
            if (rl6Var2 != null) {
                a17 += b36.f.i(3, rl6Var2.mo75928xcd1e8d8());
            }
            return a17 + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 8, linkedList);
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
        r45.o75 o75Var = (r45.o75) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            o75Var.f463535d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            o75Var.f463536e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.rl6 rl6Var3 = new r45.rl6();
                if (bArr2 != null && bArr2.length > 0) {
                    rl6Var3.mo11468x92b714fd(bArr2);
                }
                o75Var.f463537f = rl6Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.lu luVar = new r45.lu();
                if (bArr3 != null && bArr3.length > 0) {
                    luVar.mo11468x92b714fd(bArr3);
                }
                o75Var.f463538g.add(luVar);
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.au4 au4Var = new r45.au4();
            if (bArr4 != null && bArr4.length > 0) {
                au4Var.mo11468x92b714fd(bArr4);
            }
            o75Var.f463539h.add(au4Var);
        }
        return 0;
    }
}
