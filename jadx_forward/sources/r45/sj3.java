package r45;

/* loaded from: classes8.dex */
public class sj3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f467310d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f467311e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f467312f;

    /* renamed from: g, reason: collision with root package name */
    public int f467313g;

    /* renamed from: h, reason: collision with root package name */
    public int f467314h;

    static {
        new r45.sj3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sj3)) {
            return false;
        }
        r45.sj3 sj3Var = (r45.sj3) fVar;
        return n51.f.a(this.f76492x92037252, sj3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f467310d), java.lang.Integer.valueOf(sj3Var.f467310d)) && n51.f.a(this.f467311e, sj3Var.f467311e) && n51.f.a(this.f467312f, sj3Var.f467312f) && n51.f.a(java.lang.Integer.valueOf(this.f467313g), java.lang.Integer.valueOf(sj3Var.f467313g)) && n51.f.a(java.lang.Integer.valueOf(this.f467314h), java.lang.Integer.valueOf(sj3Var.f467314h));
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f76492x92037252;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.sj3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467311e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f467310d);
            fVar.g(3, 8, linkedList);
            java.lang.String str = this.f467312f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f467313g);
            fVar.e(6, this.f467314h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f467310d) + b36.f.g(3, 8, linkedList);
            java.lang.String str2 = this.f467312f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.e(5, this.f467313g) + b36.f.e(6, this.f467314h);
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
                this.f467310d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.zy4 zy4Var = new r45.zy4();
                    if (bArr2 != null && bArr2.length > 0) {
                        zy4Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(zy4Var);
                }
                return 0;
            case 4:
                this.f467312f = aVar2.k(intValue);
                return 0;
            case 5:
                this.f467313g = aVar2.g(intValue);
                return 0;
            case 6:
                this.f467314h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.sj3) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        return this;
    }
}
