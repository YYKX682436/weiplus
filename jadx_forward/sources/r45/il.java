package r45;

/* loaded from: classes9.dex */
public class il extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f458654d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f458655e;

    /* renamed from: h, reason: collision with root package name */
    public r45.l54 f458658h;

    /* renamed from: m, reason: collision with root package name */
    public r45.w1 f458660m;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f458656f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f458657g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f458659i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.il)) {
            return false;
        }
        r45.il ilVar = (r45.il) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f458654d), java.lang.Integer.valueOf(ilVar.f458654d)) && n51.f.a(this.f458655e, ilVar.f458655e) && n51.f.a(this.f458656f, ilVar.f458656f) && n51.f.a(this.f458657g, ilVar.f458657g) && n51.f.a(this.f458658h, ilVar.f458658h) && n51.f.a(this.f458659i, ilVar.f458659i) && n51.f.a(this.f458660m, ilVar.f458660m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f458656f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f458654d);
            java.lang.String str = this.f458655e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            fVar.g(4, 8, this.f458657g);
            r45.l54 l54Var = this.f458658h;
            if (l54Var != null) {
                fVar.i(5, l54Var.mo75928xcd1e8d8());
                this.f458658h.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 8, this.f458659i);
            r45.w1 w1Var = this.f458660m;
            if (w1Var != null) {
                fVar.i(7, w1Var.mo75928xcd1e8d8());
                this.f458660m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f458654d) + 0;
            java.lang.String str2 = this.f458655e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            int g17 = e17 + b36.f.g(3, 8, linkedList) + b36.f.g(4, 8, this.f458657g);
            r45.l54 l54Var2 = this.f458658h;
            if (l54Var2 != null) {
                g17 += b36.f.i(5, l54Var2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(6, 8, this.f458659i);
            r45.w1 w1Var2 = this.f458660m;
            return w1Var2 != null ? g18 + b36.f.i(7, w1Var2.mo75928xcd1e8d8()) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            this.f458657g.clear();
            this.f458659i.clear();
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
        r45.il ilVar = (r45.il) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ilVar.f458654d = aVar2.g(intValue);
                return 0;
            case 2:
                ilVar.f458655e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ur5 ur5Var = new r45.ur5();
                    if (bArr2 != null && bArr2.length > 0) {
                        ur5Var.mo11468x92b714fd(bArr2);
                    }
                    ilVar.f458656f.add(ur5Var);
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.ur5 ur5Var2 = new r45.ur5();
                    if (bArr3 != null && bArr3.length > 0) {
                        ur5Var2.mo11468x92b714fd(bArr3);
                    }
                    ilVar.f458657g.add(ur5Var2);
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.l54 l54Var3 = new r45.l54();
                    if (bArr4 != null && bArr4.length > 0) {
                        l54Var3.mo11468x92b714fd(bArr4);
                    }
                    ilVar.f458658h = l54Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.uj6 uj6Var = new r45.uj6();
                    if (bArr5 != null && bArr5.length > 0) {
                        uj6Var.mo11468x92b714fd(bArr5);
                    }
                    ilVar.f458659i.add(uj6Var);
                }
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.w1 w1Var3 = new r45.w1();
                    if (bArr6 != null && bArr6.length > 0) {
                        w1Var3.mo11468x92b714fd(bArr6);
                    }
                    ilVar.f458660m = w1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
