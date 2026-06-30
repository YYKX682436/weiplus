package bw5;

/* loaded from: classes4.dex */
public class q70 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.lc0 f113521d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.h90 f113522e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f113523f = new boolean[4];

    static {
        new bw5.q70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q70)) {
            return false;
        }
        bw5.q70 q70Var = (bw5.q70) fVar;
        return n51.f.a(this.f76492x92037252, q70Var.f76492x92037252) && n51.f.a(this.f113521d, q70Var.f113521d) && n51.f.a(this.f113522e, q70Var.f113522e);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f113523f[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.q70();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113523f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            bw5.lc0 lc0Var = this.f113521d;
            if (lc0Var != null && zArr[2]) {
                fVar.i(2, lc0Var.mo75928xcd1e8d8());
                this.f113521d.mo75956x3d5d1f78(fVar);
            }
            bw5.h90 h90Var = this.f113522e;
            if (h90Var != null && zArr[3]) {
                fVar.i(3, h90Var.mo75928xcd1e8d8());
                this.f113522e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            bw5.lc0 lc0Var2 = this.f113521d;
            if (lc0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, lc0Var2.mo75928xcd1e8d8());
            }
            bw5.h90 h90Var2 = this.f113522e;
            return (h90Var2 == null || !zArr[3]) ? i18 : i18 + b36.f.i(3, h90Var2.mo75928xcd1e8d8());
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
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.lc0 lc0Var3 = new bw5.lc0();
                if (bArr2 != null && bArr2.length > 0) {
                    lc0Var3.mo11468x92b714fd(bArr2);
                }
                this.f113521d = lc0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.h90 h90Var3 = new bw5.h90();
            if (bArr3 != null && bArr3.length > 0) {
                h90Var3.mo11468x92b714fd(bArr3);
            }
            this.f113522e = h90Var3;
        }
        zArr[3] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.q70) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f113523f[1] = true;
        return this;
    }
}
