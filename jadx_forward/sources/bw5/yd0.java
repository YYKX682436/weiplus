package bw5;

/* loaded from: classes4.dex */
public class yd0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116981d;

    /* renamed from: e, reason: collision with root package name */
    public long f116982e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116983f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.n20 f116984g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.sd0 f116985h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f116986i = new boolean[7];

    static {
        new bw5.yd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yd0)) {
            return false;
        }
        bw5.yd0 yd0Var = (bw5.yd0) fVar;
        return n51.f.a(this.f76492x92037252, yd0Var.f76492x92037252) && n51.f.a(this.f116981d, yd0Var.f116981d) && n51.f.a(java.lang.Long.valueOf(this.f116982e), java.lang.Long.valueOf(yd0Var.f116982e)) && n51.f.a(this.f116983f, yd0Var.f116983f) && n51.f.a(this.f116984g, yd0Var.f116984g) && n51.f.a(this.f116985h, yd0Var.f116985h);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f116986i[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f116986i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f116981d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.h(3, this.f116982e);
            }
            java.lang.String str2 = this.f116983f;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            bw5.n20 n20Var = this.f116984g;
            if (n20Var != null && zArr[5]) {
                fVar.i(5, n20Var.mo75928xcd1e8d8());
                this.f116984g.mo75956x3d5d1f78(fVar);
            }
            bw5.sd0 sd0Var = this.f116985h;
            if (sd0Var != null && zArr[6]) {
                fVar.i(6, sd0Var.mo75928xcd1e8d8());
                this.f116985h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f116981d;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f116982e);
            }
            java.lang.String str4 = this.f116983f;
            if (str4 != null && zArr[4]) {
                i18 += b36.f.j(4, str4);
            }
            bw5.n20 n20Var2 = this.f116984g;
            if (n20Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, n20Var2.mo75928xcd1e8d8());
            }
            bw5.sd0 sd0Var2 = this.f116985h;
            return (sd0Var2 == null || !zArr[6]) ? i18 : i18 + b36.f.i(6, sd0Var2.mo75928xcd1e8d8());
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
                zArr[1] = true;
                return 0;
            case 2:
                this.f116981d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f116982e = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116983f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.n20 n20Var3 = new bw5.n20();
                    if (bArr2 != null && bArr2.length > 0) {
                        n20Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f116984g = n20Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.sd0 sd0Var3 = new bw5.sd0();
                    if (bArr3 != null && bArr3.length > 0) {
                        sd0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f116985h = sd0Var3;
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.yd0) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f116986i[1] = true;
        return this;
    }
}
