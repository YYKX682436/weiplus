package r45;

/* loaded from: classes4.dex */
public class aa6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f451403d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451404e;

    /* renamed from: f, reason: collision with root package name */
    public r45.wa6 f451405f;

    /* renamed from: g, reason: collision with root package name */
    public int f451406g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f451407h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aa6)) {
            return false;
        }
        r45.aa6 aa6Var = (r45.aa6) fVar;
        return n51.f.a(this.f76492x92037252, aa6Var.f76492x92037252) && n51.f.a(this.f451403d, aa6Var.f451403d) && n51.f.a(this.f451404e, aa6Var.f451404e) && n51.f.a(this.f451405f, aa6Var.f451405f) && n51.f.a(java.lang.Integer.valueOf(this.f451406g), java.lang.Integer.valueOf(aa6Var.f451406g)) && n51.f.a(this.f451407h, aa6Var.f451407h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f451407h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = this.f451403d;
            if (c19806x4c372b7 != null) {
                fVar.i(2, c19806x4c372b7.mo75928xcd1e8d8());
                this.f451403d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f451404e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.wa6 wa6Var = this.f451405f;
            if (wa6Var != null) {
                fVar.i(4, wa6Var.mo75928xcd1e8d8());
                this.f451405f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f451406g);
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72 = this.f451403d;
            if (c19806x4c372b72 != null) {
                i18 += b36.f.i(2, c19806x4c372b72.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f451404e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            r45.wa6 wa6Var2 = this.f451405f;
            if (wa6Var2 != null) {
                i18 += b36.f.i(4, wa6Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(5, this.f451406g) + b36.f.g(6, 8, linkedList);
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
        r45.aa6 aa6Var = (r45.aa6) objArr[1];
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
                    aa6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b73 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7();
                    if (bArr3 != null && bArr3.length > 0) {
                        c19806x4c372b73.mo11468x92b714fd(bArr3);
                    }
                    aa6Var.f451403d = c19806x4c372b73;
                }
                return 0;
            case 3:
                aa6Var.f451404e = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.wa6 wa6Var3 = new r45.wa6();
                    if (bArr4 != null && bArr4.length > 0) {
                        wa6Var3.mo11468x92b714fd(bArr4);
                    }
                    aa6Var.f451405f = wa6Var3;
                }
                return 0;
            case 5:
                aa6Var.f451406g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.du5 du5Var = new r45.du5();
                    if (bArr5 != null && bArr5.length > 0) {
                        du5Var.b(bArr5);
                    }
                    aa6Var.f451407h.add(du5Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
