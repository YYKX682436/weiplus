package r45;

/* loaded from: classes7.dex */
public class ng extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f462903d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462904e;

    /* renamed from: f, reason: collision with root package name */
    public int f462905f;

    /* renamed from: g, reason: collision with root package name */
    public long f462906g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f462907h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ng)) {
            return false;
        }
        r45.ng ngVar = (r45.ng) fVar;
        return n51.f.a(this.f76494x2de60e5e, ngVar.f76494x2de60e5e) && n51.f.a(this.f462903d, ngVar.f462903d) && n51.f.a(this.f462904e, ngVar.f462904e) && n51.f.a(java.lang.Integer.valueOf(this.f462905f), java.lang.Integer.valueOf(ngVar.f462905f)) && n51.f.a(java.lang.Long.valueOf(this.f462906g), java.lang.Long.valueOf(ngVar.f462906g)) && n51.f.a(this.f462907h, ngVar.f462907h);
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
            java.lang.String str = this.f462903d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f462904e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f462905f);
            fVar.h(5, this.f462906g);
            fVar.g(6, 8, this.f462907h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f462903d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f462904e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            return i18 + b36.f.e(4, this.f462905f) + b36.f.h(5, this.f462906g) + b36.f.g(6, 8, this.f462907h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f462907h.clear();
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
        r45.ng ngVar = (r45.ng) objArr[1];
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
                    ngVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                ngVar.f462903d = aVar2.k(intValue);
                return 0;
            case 3:
                ngVar.f462904e = aVar2.k(intValue);
                return 0;
            case 4:
                ngVar.f462905f = aVar2.g(intValue);
                return 0;
            case 5:
                ngVar.f462906g = aVar2.i(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.us5 us5Var = new r45.us5();
                    if (bArr3 != null && bArr3.length > 0) {
                        us5Var.mo11468x92b714fd(bArr3);
                    }
                    ngVar.f462907h.add(us5Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
