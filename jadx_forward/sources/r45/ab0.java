package r45;

/* loaded from: classes12.dex */
public class ab0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f451413d;

    /* renamed from: e, reason: collision with root package name */
    public r45.hh7 f451414e;

    /* renamed from: g, reason: collision with root package name */
    public int f451416g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f451418i;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f451415f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f451417h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f451419m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ab0)) {
            return false;
        }
        r45.ab0 ab0Var = (r45.ab0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f451413d), java.lang.Integer.valueOf(ab0Var.f451413d)) && n51.f.a(this.f451414e, ab0Var.f451414e) && n51.f.a(this.f451415f, ab0Var.f451415f) && n51.f.a(java.lang.Integer.valueOf(this.f451416g), java.lang.Integer.valueOf(ab0Var.f451416g)) && n51.f.a(this.f451417h, ab0Var.f451417h) && n51.f.a(java.lang.Boolean.valueOf(this.f451418i), java.lang.Boolean.valueOf(ab0Var.f451418i)) && n51.f.a(this.f451419m, ab0Var.f451419m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f451419m;
        java.util.LinkedList linkedList2 = this.f451417h;
        java.util.LinkedList linkedList3 = this.f451415f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f451413d);
            r45.hh7 hh7Var = this.f451414e;
            if (hh7Var != null) {
                fVar.i(2, hh7Var.mo75928xcd1e8d8());
                this.f451414e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList3);
            fVar.e(4, this.f451416g);
            fVar.g(5, 8, linkedList2);
            fVar.a(6, this.f451418i);
            fVar.g(7, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f451413d) + 0;
            r45.hh7 hh7Var2 = this.f451414e;
            if (hh7Var2 != null) {
                e17 += b36.f.i(2, hh7Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.g(3, 8, linkedList3) + b36.f.e(4, this.f451416g) + b36.f.g(5, 8, linkedList2) + b36.f.a(6, this.f451418i) + b36.f.g(7, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        r45.ab0 ab0Var = (r45.ab0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ab0Var.f451413d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.hh7 hh7Var3 = new r45.hh7();
                    if (bArr2 != null && bArr2.length > 0) {
                        hh7Var3.mo11468x92b714fd(bArr2);
                    }
                    ab0Var.f451414e = hh7Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.ed6 ed6Var = new r45.ed6();
                    if (bArr3 != null && bArr3.length > 0) {
                        ed6Var.mo11468x92b714fd(bArr3);
                    }
                    ab0Var.f451415f.add(ed6Var);
                }
                return 0;
            case 4:
                ab0Var.f451416g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.eh7 eh7Var = new r45.eh7();
                    if (bArr4 != null && bArr4.length > 0) {
                        eh7Var.mo11468x92b714fd(bArr4);
                    }
                    ab0Var.f451417h.add(eh7Var);
                }
                return 0;
            case 6:
                ab0Var.f451418i = aVar2.c(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.dd6 dd6Var = new r45.dd6();
                    if (bArr5 != null && bArr5.length > 0) {
                        dd6Var.mo11468x92b714fd(bArr5);
                    }
                    ab0Var.f451419m.add(dd6Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
