package bw5;

/* loaded from: classes4.dex */
public class y80 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f116932d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.r70 f116933e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116934f;

    /* renamed from: g, reason: collision with root package name */
    public long f116935g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f116936h = new boolean[6];

    static {
        new bw5.y80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y80)) {
            return false;
        }
        bw5.y80 y80Var = (bw5.y80) fVar;
        return n51.f.a(this.f76492x92037252, y80Var.f76492x92037252) && n51.f.a(this.f116932d, y80Var.f116932d) && n51.f.a(this.f116933e, y80Var.f116933e) && n51.f.a(this.f116934f, y80Var.f116934f) && n51.f.a(java.lang.Long.valueOf(this.f116935g), java.lang.Long.valueOf(y80Var.f116935g));
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f116936h[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.y80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f116936h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f116932d;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            bw5.r70 r70Var = this.f116933e;
            if (r70Var != null && zArr[3]) {
                fVar.i(3, r70Var.mo75928xcd1e8d8());
                this.f116933e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f116934f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.h(5, this.f116935g);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f116932d;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            bw5.r70 r70Var2 = this.f116933e;
            if (r70Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, r70Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f116934f;
            if (str2 != null && zArr[4]) {
                i18 += b36.f.j(4, str2);
            }
            return zArr[5] ? i18 + b36.f.h(5, this.f116935g) : i18;
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
            this.f116932d = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f116934f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f116935g = aVar2.i(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.r70 r70Var3 = new bw5.r70();
            if (bArr2 != null && bArr2.length > 0) {
                r70Var3.mo11468x92b714fd(bArr2);
            }
            this.f116933e = r70Var3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.y80) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f116936h[1] = true;
        return this;
    }
}
