package r45;

/* loaded from: classes4.dex */
public class aw extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f451821d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f451822e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f451823f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451824g;

    /* renamed from: h, reason: collision with root package name */
    public int f451825h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.aw)) {
            return false;
        }
        r45.aw awVar = (r45.aw) fVar;
        return n51.f.a(this.f76494x2de60e5e, awVar.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f451821d), java.lang.Integer.valueOf(awVar.f451821d)) && n51.f.a(this.f451822e, awVar.f451822e) && n51.f.a(this.f451823f, awVar.f451823f) && n51.f.a(this.f451824g, awVar.f451824g) && n51.f.a(java.lang.Integer.valueOf(this.f451825h), java.lang.Integer.valueOf(awVar.f451825h));
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
            fVar.e(2, this.f451821d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f451822e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f451823f;
            if (gVar2 != null) {
                fVar.b(4, gVar2);
            }
            java.lang.String str = this.f451824g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f451825h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f451821d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f451822e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f451823f;
            if (gVar4 != null) {
                i18 += b36.f.b(4, gVar4);
            }
            java.lang.String str2 = this.f451824g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            return i18 + b36.f.e(6, this.f451825h);
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
        r45.aw awVar = (r45.aw) objArr[1];
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
                    awVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                awVar.f451821d = aVar2.g(intValue);
                return 0;
            case 3:
                awVar.f451822e = aVar2.d(intValue);
                return 0;
            case 4:
                awVar.f451823f = aVar2.d(intValue);
                return 0;
            case 5:
                awVar.f451824g = aVar2.k(intValue);
                return 0;
            case 6:
                awVar.f451825h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
