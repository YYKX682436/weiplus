package bw5;

/* loaded from: classes8.dex */
public class bf0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.zh0 f107167d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f107168e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107169f;

    /* renamed from: g, reason: collision with root package name */
    public int f107170g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f107171h = new boolean[6];

    static {
        new bw5.bf0();
    }

    public bw5.zh0 b() {
        return this.f107171h[2] ? this.f107167d : new bw5.zh0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bf0)) {
            return false;
        }
        bw5.bf0 bf0Var = (bw5.bf0) fVar;
        return n51.f.a(this.f76492x92037252, bf0Var.f76492x92037252) && n51.f.a(this.f107167d, bf0Var.f107167d) && n51.f.a(java.lang.Boolean.valueOf(this.f107168e), java.lang.Boolean.valueOf(bf0Var.f107168e)) && n51.f.a(this.f107169f, bf0Var.f107169f) && n51.f.a(java.lang.Integer.valueOf(this.f107170g), java.lang.Integer.valueOf(bf0Var.f107170g));
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f107171h[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.bf0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107171h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            bw5.zh0 zh0Var = this.f107167d;
            if (zh0Var != null && zArr[2]) {
                fVar.i(2, zh0Var.mo75928xcd1e8d8());
                this.f107167d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.a(3, this.f107168e);
            }
            java.lang.String str = this.f107169f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f107170g);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            bw5.zh0 zh0Var2 = this.f107167d;
            if (zh0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, zh0Var2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f107168e);
            }
            java.lang.String str2 = this.f107169f;
            if (str2 != null && zArr[4]) {
                i18 += b36.f.j(4, str2);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f107170g) : i18;
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
        if (intValue != 2) {
            if (intValue == 3) {
                this.f107168e = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f107169f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f107170g = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.zh0 zh0Var3 = new bw5.zh0();
            if (bArr2 != null && bArr2.length > 0) {
                zh0Var3.mo11468x92b714fd(bArr2);
            }
            this.f107167d = zh0Var3;
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.bf0) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f107171h[1] = true;
        return this;
    }
}
