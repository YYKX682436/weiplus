package bw5;

/* loaded from: classes2.dex */
public class zb0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117461d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f117462e;

    /* renamed from: f, reason: collision with root package name */
    public int f117463f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f117464g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f117465h = new boolean[6];

    static {
        new bw5.zb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zb0)) {
            return false;
        }
        bw5.zb0 zb0Var = (bw5.zb0) fVar;
        return n51.f.a(this.f76494x2de60e5e, zb0Var.f76494x2de60e5e) && n51.f.a(this.f117461d, zb0Var.f117461d) && n51.f.a(this.f117462e, zb0Var.f117462e) && n51.f.a(java.lang.Integer.valueOf(this.f117463f), java.lang.Integer.valueOf(zb0Var.f117463f)) && n51.f.a(this.f117464g, zb0Var.f117464g);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f117465h[1] ? this.f76494x2de60e5e : new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zb0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f117465h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f117461d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f117462e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f117463f);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f117464g;
            if (gVar2 != null && zArr[5]) {
                fVar.b(5, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f117461d;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f117462e;
            if (gVar3 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar3);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f117463f);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f117464g;
            return (gVar4 == null || !zArr[5]) ? i18 : i18 + b36.f.b(5, gVar4);
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
            this.f117461d = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f117462e = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f117463f = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f117464g = aVar2.d(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.zb0) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f117465h[1] = true;
        return this;
    }
}
