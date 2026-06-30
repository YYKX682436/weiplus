package r45;

/* loaded from: classes4.dex */
public class rw extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f466763d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f466764e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f466765f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466766g;

    /* renamed from: h, reason: collision with root package name */
    public int f466767h = 4;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rw)) {
            return false;
        }
        r45.rw rwVar = (r45.rw) fVar;
        return n51.f.a(this.f76494x2de60e5e, rwVar.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f466763d), java.lang.Integer.valueOf(rwVar.f466763d)) && n51.f.a(this.f466764e, rwVar.f466764e) && n51.f.a(this.f466765f, rwVar.f466765f) && n51.f.a(this.f466766g, rwVar.f466766g) && n51.f.a(java.lang.Integer.valueOf(this.f466767h), java.lang.Integer.valueOf(rwVar.f466767h));
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
            fVar.e(2, this.f466763d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f466764e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f466765f;
            if (gVar2 != null) {
                fVar.b(4, gVar2);
            }
            java.lang.String str = this.f466766g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f466767h);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f466763d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f466764e;
            if (gVar3 != null) {
                i18 += b36.f.b(3, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f466765f;
            if (gVar4 != null) {
                i18 += b36.f.b(4, gVar4);
            }
            java.lang.String str2 = this.f466766g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            return i18 + b36.f.e(6, this.f466767h);
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
        r45.rw rwVar = (r45.rw) objArr[1];
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
                    rwVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                rwVar.f466763d = aVar2.g(intValue);
                return 0;
            case 3:
                rwVar.f466764e = aVar2.d(intValue);
                return 0;
            case 4:
                rwVar.f466765f = aVar2.d(intValue);
                return 0;
            case 5:
                rwVar.f466766g = aVar2.k(intValue);
                return 0;
            case 6:
                rwVar.f466767h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
