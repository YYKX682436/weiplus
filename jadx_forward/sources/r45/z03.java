package r45;

/* loaded from: classes10.dex */
public class z03 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f473098d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f473099e;

    /* renamed from: f, reason: collision with root package name */
    public int f473100f;

    /* renamed from: g, reason: collision with root package name */
    public int f473101g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f473102h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z03)) {
            return false;
        }
        r45.z03 z03Var = (r45.z03) fVar;
        return n51.f.a(this.f76492x92037252, z03Var.f76492x92037252) && n51.f.a(this.f473098d, z03Var.f473098d) && n51.f.a(java.lang.Integer.valueOf(this.f473099e), java.lang.Integer.valueOf(z03Var.f473099e)) && n51.f.a(java.lang.Integer.valueOf(this.f473100f), java.lang.Integer.valueOf(z03Var.f473100f)) && n51.f.a(java.lang.Integer.valueOf(this.f473101g), java.lang.Integer.valueOf(z03Var.f473101g)) && n51.f.a(this.f473102h, z03Var.f473102h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f473098d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f473099e);
            fVar.e(4, this.f473100f);
            fVar.e(5, this.f473101g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f473102h;
            if (gVar != null) {
                fVar.b(100, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f473099e) + b36.f.e(4, this.f473100f) + b36.f.e(5, this.f473101g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f473102h;
            return gVar2 != null ? i18 + b36.f.b(100, gVar2) : i18;
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
        r45.z03 z03Var = (r45.z03) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                z03Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87();
                if (bArr3 != null && bArr3.length > 0) {
                    c19781xd1c47b87.mo11468x92b714fd(bArr3);
                }
                z03Var.f473098d.add(c19781xd1c47b87);
            }
            return 0;
        }
        if (intValue == 3) {
            z03Var.f473099e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            z03Var.f473100f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            z03Var.f473101g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 100) {
            return -1;
        }
        z03Var.f473102h = aVar2.d(intValue);
        return 0;
    }
}
