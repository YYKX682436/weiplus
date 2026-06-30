package r45;

/* loaded from: classes11.dex */
public class qe3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f465418d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f465419e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f465420f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465421g;

    /* renamed from: h, reason: collision with root package name */
    public int f465422h;

    /* renamed from: i, reason: collision with root package name */
    public int f465423i;

    /* renamed from: m, reason: collision with root package name */
    public r45.tj0 f465424m;

    static {
        new r45.qe3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qe3)) {
            return false;
        }
        r45.qe3 qe3Var = (r45.qe3) fVar;
        return n51.f.a(this.f76492x92037252, qe3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f465418d), java.lang.Integer.valueOf(qe3Var.f465418d)) && n51.f.a(this.f465419e, qe3Var.f465419e) && n51.f.a(java.lang.Integer.valueOf(this.f465420f), java.lang.Integer.valueOf(qe3Var.f465420f)) && n51.f.a(this.f465421g, qe3Var.f465421g) && n51.f.a(java.lang.Integer.valueOf(this.f465422h), java.lang.Integer.valueOf(qe3Var.f465422h)) && n51.f.a(java.lang.Integer.valueOf(this.f465423i), java.lang.Integer.valueOf(qe3Var.f465423i)) && n51.f.a(this.f465424m, qe3Var.f465424m);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f76492x92037252;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.qe3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465419e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f465418d);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f465420f);
            java.lang.String str = this.f465421g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f465422h);
            fVar.e(8, this.f465423i);
            r45.tj0 tj0Var = this.f465424m;
            if (tj0Var != null) {
                fVar.i(9, tj0Var.mo75928xcd1e8d8());
                this.f465424m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f465418d) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f465420f);
            java.lang.String str2 = this.f465421g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            int e17 = i18 + b36.f.e(6, this.f465422h) + b36.f.e(8, this.f465423i);
            r45.tj0 tj0Var2 = this.f465424m;
            return tj0Var2 != null ? e17 + b36.f.i(9, tj0Var2.mo75928xcd1e8d8()) : e17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
                    this.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                this.f465418d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.oj0 oj0Var = new r45.oj0();
                    if (bArr2 != null && bArr2.length > 0) {
                        oj0Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(oj0Var);
                }
                return 0;
            case 4:
                this.f465420f = aVar2.g(intValue);
                return 0;
            case 5:
                this.f465421g = aVar2.k(intValue);
                return 0;
            case 6:
                this.f465422h = aVar2.g(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                this.f465423i = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.tj0 tj0Var3 = new r45.tj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        tj0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f465424m = tj0Var3;
                }
                return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.qe3) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        return this;
    }
}
