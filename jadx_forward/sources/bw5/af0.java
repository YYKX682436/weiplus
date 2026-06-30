package bw5;

/* loaded from: classes8.dex */
public class af0 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f106709d;

    /* renamed from: e, reason: collision with root package name */
    public int f106710e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f106711f;

    /* renamed from: g, reason: collision with root package name */
    public int f106712g;

    /* renamed from: h, reason: collision with root package name */
    public int f106713h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f106714i = new boolean[7];

    static {
        new bw5.af0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.af0)) {
            return false;
        }
        bw5.af0 af0Var = (bw5.af0) fVar;
        return n51.f.a(this.f76494x2de60e5e, af0Var.f76494x2de60e5e) && n51.f.a(java.lang.Long.valueOf(this.f106709d), java.lang.Long.valueOf(af0Var.f106709d)) && n51.f.a(java.lang.Integer.valueOf(this.f106710e), java.lang.Integer.valueOf(af0Var.f106710e)) && n51.f.a(this.f106711f, af0Var.f106711f) && n51.f.a(java.lang.Integer.valueOf(this.f106712g), java.lang.Integer.valueOf(af0Var.f106712g)) && n51.f.a(java.lang.Integer.valueOf(this.f106713h), java.lang.Integer.valueOf(af0Var.f106713h));
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f106714i[1] ? this.f76494x2de60e5e : new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.af0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f106714i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f106709d);
            }
            if (zArr[3]) {
                fVar.e(3, this.f106710e);
            }
            java.lang.String str = this.f106711f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f106712g);
            }
            if (zArr[6]) {
                fVar.e(6, this.f106713h);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f106709d);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f106710e);
            }
            java.lang.String str2 = this.f106711f;
            if (str2 != null && zArr[4]) {
                i18 += b36.f.j(4, str2);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f106712g);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f106713h) : i18;
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
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    this.f76494x2de60e5e = heVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f106709d = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f106710e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f106711f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f106712g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f106713h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.af0) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f106714i[1] = true;
        return this;
    }
}
