package r45;

/* loaded from: classes8.dex */
public class i20 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f458207d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f458208e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f458209f;

    /* renamed from: g, reason: collision with root package name */
    public int f458210g;

    /* renamed from: h, reason: collision with root package name */
    public int f458211h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f458212i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i20)) {
            return false;
        }
        r45.i20 i20Var = (r45.i20) fVar;
        return n51.f.a(this.f76492x92037252, i20Var.f76492x92037252) && n51.f.a(this.f458207d, i20Var.f458207d) && n51.f.a(this.f458208e, i20Var.f458208e) && n51.f.a(this.f458209f, i20Var.f458209f) && n51.f.a(java.lang.Integer.valueOf(this.f458210g), java.lang.Integer.valueOf(i20Var.f458210g)) && n51.f.a(java.lang.Integer.valueOf(this.f458211h), java.lang.Integer.valueOf(i20Var.f458211h)) && n51.f.a(this.f458212i, i20Var.f458212i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f458207d;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f458208e;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f458209f;
            if (gVar3 != null) {
                fVar.b(4, gVar3);
            }
            fVar.e(5, this.f458210g);
            fVar.e(6, this.f458211h);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f458212i;
            if (gVar4 != null) {
                fVar.b(7, gVar4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f458207d;
            if (gVar5 != null) {
                i18 += b36.f.b(2, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f458208e;
            if (gVar6 != null) {
                i18 += b36.f.b(3, gVar6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar7 = this.f458209f;
            if (gVar7 != null) {
                i18 += b36.f.b(4, gVar7);
            }
            int e17 = i18 + b36.f.e(5, this.f458210g) + b36.f.e(6, this.f458211h);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar8 = this.f458212i;
            return gVar8 != null ? e17 + b36.f.b(7, gVar8) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.i20 i20Var = (r45.i20) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    i20Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                i20Var.f458207d = aVar2.d(intValue);
                return 0;
            case 3:
                i20Var.f458208e = aVar2.d(intValue);
                return 0;
            case 4:
                i20Var.f458209f = aVar2.d(intValue);
                return 0;
            case 5:
                i20Var.f458210g = aVar2.g(intValue);
                return 0;
            case 6:
                i20Var.f458211h = aVar2.g(intValue);
                return 0;
            case 7:
                i20Var.f458212i = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
