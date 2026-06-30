package r45;

/* loaded from: classes4.dex */
public class ag5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451530d;

    /* renamed from: e, reason: collision with root package name */
    public int f451531e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f451532f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f451533g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f451534h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f451535i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ag5)) {
            return false;
        }
        r45.ag5 ag5Var = (r45.ag5) fVar;
        return n51.f.a(this.f76494x2de60e5e, ag5Var.f76494x2de60e5e) && n51.f.a(this.f451530d, ag5Var.f451530d) && n51.f.a(java.lang.Integer.valueOf(this.f451531e), java.lang.Integer.valueOf(ag5Var.f451531e)) && n51.f.a(this.f451532f, ag5Var.f451532f) && n51.f.a(java.lang.Integer.valueOf(this.f451533g), java.lang.Integer.valueOf(ag5Var.f451533g)) && n51.f.a(this.f451534h, ag5Var.f451534h) && n51.f.a(java.lang.Boolean.valueOf(this.f451535i), java.lang.Boolean.valueOf(ag5Var.f451535i));
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
            java.lang.String str = this.f451530d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f451531e);
            fVar.g(4, 1, this.f451532f);
            fVar.e(5, this.f451533g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f451534h;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            fVar.a(7, this.f451535i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f451530d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int e17 = i18 + b36.f.e(3, this.f451531e) + b36.f.g(4, 1, this.f451532f) + b36.f.e(5, this.f451533g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f451534h;
            if (gVar2 != null) {
                e17 += b36.f.b(6, gVar2);
            }
            return e17 + b36.f.a(7, this.f451535i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f451532f.clear();
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
        r45.ag5 ag5Var = (r45.ag5) objArr[1];
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
                    ag5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                ag5Var.f451530d = aVar2.k(intValue);
                return 0;
            case 3:
                ag5Var.f451531e = aVar2.g(intValue);
                return 0;
            case 4:
                ag5Var.f451532f.add(aVar2.k(intValue));
                return 0;
            case 5:
                ag5Var.f451533g = aVar2.g(intValue);
                return 0;
            case 6:
                ag5Var.f451534h = aVar2.d(intValue);
                return 0;
            case 7:
                ag5Var.f451535i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
