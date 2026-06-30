package bw5;

/* loaded from: classes2.dex */
public class gs0 extends r45.js5 {

    /* renamed from: o, reason: collision with root package name */
    public static final bw5.gs0 f109519o = new bw5.gs0();

    /* renamed from: d, reason: collision with root package name */
    public int f109520d;

    /* renamed from: e, reason: collision with root package name */
    public int f109521e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109522f;

    /* renamed from: g, reason: collision with root package name */
    public int f109523g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109524h;

    /* renamed from: i, reason: collision with root package name */
    public int f109525i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f109526m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f109527n = new boolean[9];

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gs0)) {
            return false;
        }
        bw5.gs0 gs0Var = (bw5.gs0) fVar;
        return n51.f.a(this.f76492x92037252, gs0Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f109520d), java.lang.Integer.valueOf(gs0Var.f109520d)) && n51.f.a(java.lang.Integer.valueOf(this.f109521e), java.lang.Integer.valueOf(gs0Var.f109521e)) && n51.f.a(this.f109522f, gs0Var.f109522f) && n51.f.a(java.lang.Integer.valueOf(this.f109523g), java.lang.Integer.valueOf(gs0Var.f109523g)) && n51.f.a(this.f109524h, gs0Var.f109524h) && n51.f.a(java.lang.Integer.valueOf(this.f109525i), java.lang.Integer.valueOf(gs0Var.f109525i)) && n51.f.a(java.lang.Boolean.valueOf(this.f109526m), java.lang.Boolean.valueOf(gs0Var.f109526m));
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f109527n[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gs0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f109527n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f109520d);
            }
            if (zArr[3]) {
                fVar.e(3, this.f109521e);
            }
            java.lang.String str = this.f109522f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f109523g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f109524h;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f109525i);
            }
            if (zArr[8]) {
                fVar.a(8, this.f109526m);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f109520d);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f109521e);
            }
            java.lang.String str2 = this.f109522f;
            if (str2 != null && zArr[4]) {
                i18 += b36.f.j(4, str2);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f109523g);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f109524h;
            if (gVar2 != null && zArr[6]) {
                i18 += b36.f.b(6, gVar2);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f109525i);
            }
            return zArr[8] ? i18 + b36.f.a(8, this.f109526m) : i18;
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
                this.f109520d = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109521e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109522f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109523g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109524h = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109525i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f109526m = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.gs0) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f109527n[1] = true;
        return this;
    }
}
