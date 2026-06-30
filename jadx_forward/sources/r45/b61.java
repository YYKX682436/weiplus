package r45;

/* loaded from: classes2.dex */
public class b61 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f452073d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f452074e;

    /* renamed from: f, reason: collision with root package name */
    public int f452075f;

    /* renamed from: g, reason: collision with root package name */
    public int f452076g;

    /* renamed from: h, reason: collision with root package name */
    public int f452077h;

    /* renamed from: i, reason: collision with root package name */
    public int f452078i;

    /* renamed from: m, reason: collision with root package name */
    public int f452079m;

    /* renamed from: n, reason: collision with root package name */
    public r45.tl6 f452080n;

    /* renamed from: o, reason: collision with root package name */
    public int f452081o;

    /* renamed from: p, reason: collision with root package name */
    public r45.a31 f452082p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b61)) {
            return false;
        }
        r45.b61 b61Var = (r45.b61) fVar;
        return n51.f.a(this.f76492x92037252, b61Var.f76492x92037252) && n51.f.a(this.f452073d, b61Var.f452073d) && n51.f.a(this.f452074e, b61Var.f452074e) && n51.f.a(java.lang.Integer.valueOf(this.f452075f), java.lang.Integer.valueOf(b61Var.f452075f)) && n51.f.a(java.lang.Integer.valueOf(this.f452076g), java.lang.Integer.valueOf(b61Var.f452076g)) && n51.f.a(java.lang.Integer.valueOf(this.f452077h), java.lang.Integer.valueOf(b61Var.f452077h)) && n51.f.a(java.lang.Integer.valueOf(this.f452078i), java.lang.Integer.valueOf(b61Var.f452078i)) && n51.f.a(java.lang.Integer.valueOf(this.f452079m), java.lang.Integer.valueOf(b61Var.f452079m)) && n51.f.a(this.f452080n, b61Var.f452080n) && n51.f.a(java.lang.Integer.valueOf(this.f452081o), java.lang.Integer.valueOf(b61Var.f452081o)) && n51.f.a(this.f452082p, b61Var.f452082p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f452073d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f452074e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f452075f);
            fVar.e(5, this.f452076g);
            fVar.e(6, this.f452077h);
            fVar.e(7, this.f452078i);
            fVar.e(8, this.f452079m);
            r45.tl6 tl6Var = this.f452080n;
            if (tl6Var != null) {
                fVar.i(9, tl6Var.mo75928xcd1e8d8());
                this.f452080n.mo75956x3d5d1f78(fVar);
            }
            fVar.e(10, this.f452081o);
            r45.a31 a31Var = this.f452082p;
            if (a31Var != null) {
                fVar.i(11, a31Var.mo75928xcd1e8d8());
                this.f452082p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f452074e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            int e17 = i18 + b36.f.e(4, this.f452075f) + b36.f.e(5, this.f452076g) + b36.f.e(6, this.f452077h) + b36.f.e(7, this.f452078i) + b36.f.e(8, this.f452079m);
            r45.tl6 tl6Var2 = this.f452080n;
            if (tl6Var2 != null) {
                e17 += b36.f.i(9, tl6Var2.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(10, this.f452081o);
            r45.a31 a31Var2 = this.f452082p;
            return a31Var2 != null ? e18 + b36.f.i(11, a31Var2.mo75928xcd1e8d8()) : e18;
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
        r45.b61 b61Var = (r45.b61) objArr[1];
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
                    b61Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.s21 s21Var = new r45.s21();
                    if (bArr3 != null && bArr3.length > 0) {
                        s21Var.mo11468x92b714fd(bArr3);
                    }
                    b61Var.f452073d.add(s21Var);
                }
                return 0;
            case 3:
                b61Var.f452074e = aVar2.d(intValue);
                return 0;
            case 4:
                b61Var.f452075f = aVar2.g(intValue);
                return 0;
            case 5:
                b61Var.f452076g = aVar2.g(intValue);
                return 0;
            case 6:
                b61Var.f452077h = aVar2.g(intValue);
                return 0;
            case 7:
                b61Var.f452078i = aVar2.g(intValue);
                return 0;
            case 8:
                b61Var.f452079m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.tl6 tl6Var3 = new r45.tl6();
                    if (bArr4 != null && bArr4.length > 0) {
                        tl6Var3.mo11468x92b714fd(bArr4);
                    }
                    b61Var.f452080n = tl6Var3;
                }
                return 0;
            case 10:
                b61Var.f452081o = aVar2.g(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.a31 a31Var3 = new r45.a31();
                    if (bArr5 != null && bArr5.length > 0) {
                        a31Var3.mo11468x92b714fd(bArr5);
                    }
                    b61Var.f452082p = a31Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
