package bw5;

/* loaded from: classes2.dex */
public class vg extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f115884d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.rz f115885e;

    /* renamed from: f, reason: collision with root package name */
    public int f115886f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f115887g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f115888h = new boolean[6];

    static {
        new bw5.vg();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vg)) {
            return false;
        }
        bw5.vg vgVar = (bw5.vg) fVar;
        return n51.f.a(this.f76492x92037252, vgVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f115884d), java.lang.Integer.valueOf(vgVar.f115884d)) && n51.f.a(this.f115885e, vgVar.f115885e) && n51.f.a(java.lang.Integer.valueOf(this.f115886f), java.lang.Integer.valueOf(vgVar.f115886f)) && n51.f.a(this.f115887g, vgVar.f115887g);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f115888h[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.vg();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f115888h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f115884d);
            }
            bw5.rz rzVar = this.f115885e;
            if (rzVar != null && zArr[3]) {
                fVar.i(3, rzVar.mo75928xcd1e8d8());
                this.f115885e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f115886f);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f115887g;
            if (gVar != null && zArr[5]) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f115884d);
            }
            bw5.rz rzVar2 = this.f115885e;
            if (rzVar2 != null && zArr[3]) {
                i18 += b36.f.i(3, rzVar2.mo75928xcd1e8d8());
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f115886f);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f115887g;
            return (gVar2 == null || !zArr[5]) ? i18 : i18 + b36.f.b(5, gVar2);
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
            this.f115884d = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f115886f = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f115887g = aVar2.d(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.rz rzVar3 = new bw5.rz();
            if (bArr2 != null && bArr2.length > 0) {
                rzVar3.mo11468x92b714fd(bArr2);
            }
            this.f115885e = rzVar3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.vg) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f115888h[1] = true;
        return this;
    }
}
