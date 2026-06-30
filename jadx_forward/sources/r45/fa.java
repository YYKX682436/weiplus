package r45;

/* loaded from: classes11.dex */
public class fa extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f455652d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f455653e;

    /* renamed from: f, reason: collision with root package name */
    public int f455654f;

    /* renamed from: g, reason: collision with root package name */
    public int f455655g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ka f455656h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ea f455657i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fa)) {
            return false;
        }
        r45.fa faVar = (r45.fa) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455652d), java.lang.Integer.valueOf(faVar.f455652d)) && n51.f.a(this.f455653e, faVar.f455653e) && n51.f.a(java.lang.Integer.valueOf(this.f455654f), java.lang.Integer.valueOf(faVar.f455654f)) && n51.f.a(java.lang.Integer.valueOf(this.f455655g), java.lang.Integer.valueOf(faVar.f455655g)) && n51.f.a(this.f455656h, faVar.f455656h) && n51.f.a(this.f455657i, faVar.f455657i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455652d);
            java.lang.String str = this.f455653e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f455654f);
            fVar.e(4, this.f455655g);
            r45.ka kaVar = this.f455656h;
            if (kaVar != null) {
                fVar.i(5, kaVar.mo75928xcd1e8d8());
                this.f455656h.mo75956x3d5d1f78(fVar);
            }
            r45.ea eaVar = this.f455657i;
            if (eaVar != null) {
                fVar.i(6, eaVar.mo75928xcd1e8d8());
                this.f455657i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f455652d) + 0;
            java.lang.String str2 = this.f455653e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            int e18 = e17 + b36.f.e(3, this.f455654f) + b36.f.e(4, this.f455655g);
            r45.ka kaVar2 = this.f455656h;
            if (kaVar2 != null) {
                e18 += b36.f.i(5, kaVar2.mo75928xcd1e8d8());
            }
            r45.ea eaVar2 = this.f455657i;
            return eaVar2 != null ? e18 + b36.f.i(6, eaVar2.mo75928xcd1e8d8()) : e18;
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
        r45.fa faVar = (r45.fa) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                faVar.f455652d = aVar2.g(intValue);
                return 0;
            case 2:
                faVar.f455653e = aVar2.k(intValue);
                return 0;
            case 3:
                faVar.f455654f = aVar2.g(intValue);
                return 0;
            case 4:
                faVar.f455655g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.ka kaVar3 = new r45.ka();
                    if (bArr != null && bArr.length > 0) {
                        kaVar3.mo11468x92b714fd(bArr);
                    }
                    faVar.f455656h = kaVar3;
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.ea eaVar3 = new r45.ea();
                    if (bArr2 != null && bArr2.length > 0) {
                        eaVar3.mo11468x92b714fd(bArr2);
                    }
                    faVar.f455657i = eaVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
