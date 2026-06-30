package bw5;

/* loaded from: classes9.dex */
public class z40 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f117347d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f117348e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.y40 f117349f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f117350g = new boolean[5];

    static {
        new bw5.z40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.z40)) {
            return false;
        }
        bw5.z40 z40Var = (bw5.z40) fVar;
        return n51.f.a(this.f76494x2de60e5e, z40Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f117347d), java.lang.Integer.valueOf(z40Var.f117347d)) && n51.f.a(this.f117348e, z40Var.f117348e) && n51.f.a(this.f117349f, z40Var.f117349f);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f117350g[1] ? this.f76494x2de60e5e : new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.z40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f117350g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f117347d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f117348e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            bw5.y40 y40Var = this.f117349f;
            if (y40Var != null && zArr[4]) {
                fVar.i(4, y40Var.mo75928xcd1e8d8());
                this.f117349f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f117347d);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f117348e;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            bw5.y40 y40Var2 = this.f117349f;
            return (y40Var2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, y40Var2.mo75928xcd1e8d8());
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
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                this.f76494x2de60e5e = heVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f117347d = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f117348e = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.y40 y40Var3 = new bw5.y40();
            if (bArr2 != null && bArr2.length > 0) {
                y40Var3.mo11468x92b714fd(bArr2);
            }
            this.f117349f = y40Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.z40) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f117350g[1] = true;
        return this;
    }
}
