package r45;

/* loaded from: classes7.dex */
public class wb3 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470562e;

    /* renamed from: f, reason: collision with root package name */
    public int f470563f;

    /* renamed from: g, reason: collision with root package name */
    public int f470564g;

    /* renamed from: i, reason: collision with root package name */
    public r45.s46 f470566i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f470567m;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f470561d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f470565h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wb3)) {
            return false;
        }
        r45.wb3 wb3Var = (r45.wb3) fVar;
        return n51.f.a(this.f76492x92037252, wb3Var.f76492x92037252) && n51.f.a(this.f470561d, wb3Var.f470561d) && n51.f.a(this.f470562e, wb3Var.f470562e) && n51.f.a(java.lang.Integer.valueOf(this.f470563f), java.lang.Integer.valueOf(wb3Var.f470563f)) && n51.f.a(java.lang.Integer.valueOf(this.f470564g), java.lang.Integer.valueOf(wb3Var.f470564g)) && n51.f.a(this.f470565h, wb3Var.f470565h) && n51.f.a(this.f470566i, wb3Var.f470566i) && n51.f.a(java.lang.Boolean.valueOf(this.f470567m), java.lang.Boolean.valueOf(wb3Var.f470567m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470565h;
        java.util.LinkedList linkedList2 = this.f470561d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList2);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470562e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f470563f);
            fVar.e(5, this.f470564g);
            fVar.g(6, 8, linkedList);
            r45.s46 s46Var = this.f470566i;
            if (s46Var != null) {
                fVar.i(7, s46Var.mo75928xcd1e8d8());
                this.f470566i.mo75956x3d5d1f78(fVar);
            }
            fVar.a(8, this.f470567m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList2);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470562e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            int e17 = i18 + b36.f.e(4, this.f470563f) + b36.f.e(5, this.f470564g) + b36.f.g(6, 8, linkedList);
            r45.s46 s46Var2 = this.f470566i;
            if (s46Var2 != null) {
                e17 += b36.f.i(7, s46Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.a(8, this.f470567m);
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
        r45.wb3 wb3Var = (r45.wb3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    wb3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.rz6 rz6Var = new r45.rz6();
                    if (bArr3 != null && bArr3.length > 0) {
                        rz6Var.mo11468x92b714fd(bArr3);
                    }
                    wb3Var.f470561d.add(rz6Var);
                }
                return 0;
            case 3:
                wb3Var.f470562e = aVar2.d(intValue);
                return 0;
            case 4:
                wb3Var.f470563f = aVar2.g(intValue);
                return 0;
            case 5:
                wb3Var.f470564g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.s46 s46Var3 = new r45.s46();
                    if (bArr4 != null && bArr4.length > 0) {
                        s46Var3.mo11468x92b714fd(bArr4);
                    }
                    wb3Var.f470565h.add(s46Var3);
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.s46 s46Var4 = new r45.s46();
                    if (bArr5 != null && bArr5.length > 0) {
                        s46Var4.mo11468x92b714fd(bArr5);
                    }
                    wb3Var.f470566i = s46Var4;
                }
                return 0;
            case 8:
                wb3Var.f470567m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
