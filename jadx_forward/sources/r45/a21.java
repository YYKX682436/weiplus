package r45;

/* loaded from: classes2.dex */
public class a21 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f451190e;

    /* renamed from: f, reason: collision with root package name */
    public int f451191f;

    /* renamed from: g, reason: collision with root package name */
    public r45.sq2 f451192g;

    /* renamed from: h, reason: collision with root package name */
    public r45.jt2 f451193h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f451194i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f451189d = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f451195m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a21)) {
            return false;
        }
        r45.a21 a21Var = (r45.a21) fVar;
        return n51.f.a(this.f76492x92037252, a21Var.f76492x92037252) && n51.f.a(this.f451189d, a21Var.f451189d) && n51.f.a(this.f451190e, a21Var.f451190e) && n51.f.a(java.lang.Integer.valueOf(this.f451191f), java.lang.Integer.valueOf(a21Var.f451191f)) && n51.f.a(this.f451192g, a21Var.f451192g) && n51.f.a(this.f451193h, a21Var.f451193h) && n51.f.a(this.f451194i, a21Var.f451194i) && n51.f.a(this.f451195m, a21Var.f451195m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f451195m;
        java.util.LinkedList linkedList2 = this.f451189d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList2);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f451190e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f451191f);
            r45.sq2 sq2Var = this.f451192g;
            if (sq2Var != null) {
                fVar.i(5, sq2Var.mo75928xcd1e8d8());
                this.f451192g.mo75956x3d5d1f78(fVar);
            }
            r45.jt2 jt2Var = this.f451193h;
            if (jt2Var != null) {
                fVar.i(6, jt2Var.mo75928xcd1e8d8());
                this.f451193h.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f451194i;
            if (gVar2 != null) {
                fVar.b(7, gVar2);
            }
            fVar.g(8, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList2);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f451190e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            int e17 = i18 + b36.f.e(4, this.f451191f);
            r45.sq2 sq2Var2 = this.f451192g;
            if (sq2Var2 != null) {
                e17 += b36.f.i(5, sq2Var2.mo75928xcd1e8d8());
            }
            r45.jt2 jt2Var2 = this.f451193h;
            if (jt2Var2 != null) {
                e17 += b36.f.i(6, jt2Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f451194i;
            if (gVar4 != null) {
                e17 += b36.f.b(7, gVar4);
            }
            return e17 + b36.f.g(8, 8, linkedList);
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
        r45.a21 a21Var = (r45.a21) objArr[1];
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
                    a21Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                    if (bArr3 != null && bArr3.length > 0) {
                        c19792x256d2725.mo11468x92b714fd(bArr3);
                    }
                    a21Var.f451189d.add(c19792x256d2725);
                }
                return 0;
            case 3:
                a21Var.f451190e = aVar2.d(intValue);
                return 0;
            case 4:
                a21Var.f451191f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.sq2 sq2Var3 = new r45.sq2();
                    if (bArr4 != null && bArr4.length > 0) {
                        sq2Var3.mo11468x92b714fd(bArr4);
                    }
                    a21Var.f451192g = sq2Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.jt2 jt2Var3 = new r45.jt2();
                    if (bArr5 != null && bArr5.length > 0) {
                        jt2Var3.mo11468x92b714fd(bArr5);
                    }
                    a21Var.f451193h = jt2Var3;
                }
                return 0;
            case 7:
                a21Var.f451194i = aVar2.d(intValue);
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.tk0 tk0Var = new r45.tk0();
                    if (bArr6 != null && bArr6.length > 0) {
                        tk0Var.mo11468x92b714fd(bArr6);
                    }
                    a21Var.f451195m.add(tk0Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
