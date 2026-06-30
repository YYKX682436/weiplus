package r45;

/* loaded from: classes8.dex */
public class gq6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f457019d;

    /* renamed from: e, reason: collision with root package name */
    public r45.l05 f457020e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f457021f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f457022g;

    /* renamed from: h, reason: collision with root package name */
    public int f457023h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gq6)) {
            return false;
        }
        r45.gq6 gq6Var = (r45.gq6) fVar;
        return n51.f.a(this.f457019d, gq6Var.f457019d) && n51.f.a(this.f457020e, gq6Var.f457020e) && n51.f.a(this.f457021f, gq6Var.f457021f) && n51.f.a(this.f457022g, gq6Var.f457022g) && n51.f.a(java.lang.Integer.valueOf(this.f457023h), java.lang.Integer.valueOf(gq6Var.f457023h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f457019d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            r45.l05 l05Var = this.f457020e;
            if (l05Var != null) {
                fVar.i(2, l05Var.mo75928xcd1e8d8());
                this.f457020e.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f457021f;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f457022g;
            if (gVar3 != null) {
                fVar.b(4, gVar3);
            }
            fVar.e(5, this.f457023h);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f457019d;
            int b17 = gVar4 != null ? 0 + b36.f.b(1, gVar4) : 0;
            r45.l05 l05Var2 = this.f457020e;
            if (l05Var2 != null) {
                b17 += b36.f.i(2, l05Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f457021f;
            if (gVar5 != null) {
                b17 += b36.f.b(3, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f457022g;
            if (gVar6 != null) {
                b17 += b36.f.b(4, gVar6);
            }
            return b17 + b36.f.e(5, this.f457023h);
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
        r45.gq6 gq6Var = (r45.gq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gq6Var.f457019d = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                gq6Var.f457021f = aVar2.d(intValue);
                return 0;
            }
            if (intValue == 4) {
                gq6Var.f457022g = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            gq6Var.f457023h = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.l05 l05Var3 = new r45.l05();
            if (bArr != null && bArr.length > 0) {
                l05Var3.mo11468x92b714fd(bArr);
            }
            gq6Var.f457020e = l05Var3;
        }
        return 0;
    }
}
