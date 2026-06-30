package r45;

/* loaded from: classes8.dex */
public class te5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467886d;

    /* renamed from: e, reason: collision with root package name */
    public int f467887e;

    /* renamed from: f, reason: collision with root package name */
    public long f467888f;

    /* renamed from: g, reason: collision with root package name */
    public long f467889g;

    /* renamed from: h, reason: collision with root package name */
    public long f467890h;

    /* renamed from: i, reason: collision with root package name */
    public int f467891i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.te5)) {
            return false;
        }
        r45.te5 te5Var = (r45.te5) fVar;
        return n51.f.a(this.f76494x2de60e5e, te5Var.f76494x2de60e5e) && n51.f.a(this.f467886d, te5Var.f467886d) && n51.f.a(java.lang.Integer.valueOf(this.f467887e), java.lang.Integer.valueOf(te5Var.f467887e)) && n51.f.a(java.lang.Long.valueOf(this.f467888f), java.lang.Long.valueOf(te5Var.f467888f)) && n51.f.a(java.lang.Long.valueOf(this.f467889g), java.lang.Long.valueOf(te5Var.f467889g)) && n51.f.a(java.lang.Long.valueOf(this.f467890h), java.lang.Long.valueOf(te5Var.f467890h)) && n51.f.a(java.lang.Integer.valueOf(this.f467891i), java.lang.Integer.valueOf(te5Var.f467891i));
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
            java.lang.String str = this.f467886d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f467887e);
            fVar.h(4, this.f467888f);
            fVar.h(5, this.f467889g);
            fVar.h(6, this.f467890h);
            fVar.e(7, this.f467891i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f467886d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f467887e) + b36.f.h(4, this.f467888f) + b36.f.h(5, this.f467889g) + b36.f.h(6, this.f467890h) + b36.f.e(7, this.f467891i);
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
        r45.te5 te5Var = (r45.te5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    te5Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                te5Var.f467886d = aVar2.k(intValue);
                return 0;
            case 3:
                te5Var.f467887e = aVar2.g(intValue);
                return 0;
            case 4:
                te5Var.f467888f = aVar2.i(intValue);
                return 0;
            case 5:
                te5Var.f467889g = aVar2.i(intValue);
                return 0;
            case 6:
                te5Var.f467890h = aVar2.i(intValue);
                return 0;
            case 7:
                te5Var.f467891i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
