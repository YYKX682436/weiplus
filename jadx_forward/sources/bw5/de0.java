package bw5;

/* loaded from: classes7.dex */
public class de0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f107998d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f107999e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.zd0 f108000f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f108001g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f108002h = new boolean[7];

    static {
        new bw5.de0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.de0)) {
            return false;
        }
        bw5.de0 de0Var = (bw5.de0) fVar;
        return n51.f.a(this.f76492x92037252, de0Var.f76492x92037252) && n51.f.a(this.f107998d, de0Var.f107998d) && n51.f.a(this.f107999e, de0Var.f107999e) && n51.f.a(this.f108000f, de0Var.f108000f) && n51.f.a(this.f108001g, de0Var.f108001g);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f108002h[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.de0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f108002h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f107998d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f107999e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            bw5.zd0 zd0Var = this.f108000f;
            if (zd0Var != null && zArr[4]) {
                fVar.i(4, zd0Var.mo75928xcd1e8d8());
                this.f108000f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f108001g;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f107998d;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f107999e;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            bw5.zd0 zd0Var2 = this.f108000f;
            if (zd0Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, zd0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f108001g;
            return (str4 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str4);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
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
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f107998d = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f107999e = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 6) {
                return -1;
            }
            this.f108001g = aVar2.k(intValue);
            zArr[6] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.zd0 zd0Var3 = new bw5.zd0();
            if (bArr2 != null && bArr2.length > 0) {
                zd0Var3.mo11468x92b714fd(bArr2);
            }
            this.f108000f = zd0Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.de0) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f108002h[1] = true;
        return this;
    }
}
