package r45;

/* loaded from: classes14.dex */
public class y36 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f472292d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f472293e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472294f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472295g;

    /* renamed from: h, reason: collision with root package name */
    public r45.o46 f472296h;

    /* renamed from: i, reason: collision with root package name */
    public int f472297i;

    /* renamed from: m, reason: collision with root package name */
    public r45.pd6 f472298m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y36)) {
            return false;
        }
        r45.y36 y36Var = (r45.y36) fVar;
        return n51.f.a(this.f76494x2de60e5e, y36Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f472292d), java.lang.Integer.valueOf(y36Var.f472292d)) && n51.f.a(this.f472293e, y36Var.f472293e) && n51.f.a(this.f472294f, y36Var.f472294f) && n51.f.a(this.f472295g, y36Var.f472295g) && n51.f.a(this.f472296h, y36Var.f472296h) && n51.f.a(java.lang.Integer.valueOf(this.f472297i), java.lang.Integer.valueOf(y36Var.f472297i)) && n51.f.a(this.f472298m, y36Var.f472298m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f472292d);
            fVar.g(3, 8, this.f472293e);
            java.lang.String str = this.f472294f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f472295g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.o46 o46Var = this.f472296h;
            if (o46Var != null) {
                fVar.i(6, o46Var.mo75928xcd1e8d8());
                this.f472296h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f472297i);
            r45.pd6 pd6Var = this.f472298m;
            if (pd6Var != null) {
                fVar.i(8, pd6Var.mo75928xcd1e8d8());
                this.f472298m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f472292d) + b36.f.g(3, 8, this.f472293e);
            java.lang.String str3 = this.f472294f;
            if (str3 != null) {
                i18 += b36.f.j(4, str3);
            }
            java.lang.String str4 = this.f472295g;
            if (str4 != null) {
                i18 += b36.f.j(5, str4);
            }
            r45.o46 o46Var2 = this.f472296h;
            if (o46Var2 != null) {
                i18 += b36.f.i(6, o46Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(7, this.f472297i);
            r45.pd6 pd6Var2 = this.f472298m;
            return pd6Var2 != null ? e17 + b36.f.i(8, pd6Var2.mo75928xcd1e8d8()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f472293e.clear();
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
        r45.y36 y36Var = (r45.y36) objArr[1];
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
                    y36Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                y36Var.f472292d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.a46 a46Var = new r45.a46();
                    if (bArr3 != null && bArr3.length > 0) {
                        a46Var.mo11468x92b714fd(bArr3);
                    }
                    y36Var.f472293e.add(a46Var);
                }
                return 0;
            case 4:
                y36Var.f472294f = aVar2.k(intValue);
                return 0;
            case 5:
                y36Var.f472295g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.o46 o46Var3 = new r45.o46();
                    if (bArr4 != null && bArr4.length > 0) {
                        o46Var3.mo11468x92b714fd(bArr4);
                    }
                    y36Var.f472296h = o46Var3;
                }
                return 0;
            case 7:
                y36Var.f472297i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.pd6 pd6Var3 = new r45.pd6();
                    if (bArr5 != null && bArr5.length > 0) {
                        pd6Var3.mo11468x92b714fd(bArr5);
                    }
                    y36Var.f472298m = pd6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
