package r45;

/* loaded from: classes8.dex */
public class dc5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453841d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453842e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453843f;

    /* renamed from: g, reason: collision with root package name */
    public int f453844g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453845h;

    /* renamed from: i, reason: collision with root package name */
    public int f453846i;

    static {
        new r45.dc5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dc5)) {
            return false;
        }
        r45.dc5 dc5Var = (r45.dc5) fVar;
        return n51.f.a(this.f76494x2de60e5e, dc5Var.f76494x2de60e5e) && n51.f.a(this.f453841d, dc5Var.f453841d) && n51.f.a(this.f453842e, dc5Var.f453842e) && n51.f.a(this.f453843f, dc5Var.f453843f) && n51.f.a(java.lang.Integer.valueOf(this.f453844g), java.lang.Integer.valueOf(dc5Var.f453844g)) && n51.f.a(this.f453845h, dc5Var.f453845h) && n51.f.a(java.lang.Integer.valueOf(this.f453846i), java.lang.Integer.valueOf(dc5Var.f453846i));
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f76494x2de60e5e;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.dc5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f453841d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f453842e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f453843f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f453844g);
            java.lang.String str4 = this.f453845h;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f453846i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f453841d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f453842e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f453843f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int e17 = i18 + b36.f.e(5, this.f453844g);
            java.lang.String str8 = this.f453845h;
            if (str8 != null) {
                e17 += b36.f.j(7, str8);
            }
            return e17 + b36.f.e(8, this.f453846i);
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
                return 0;
            case 2:
                this.f453841d = aVar2.k(intValue);
                return 0;
            case 3:
                this.f453842e = aVar2.k(intValue);
                return 0;
            case 4:
                this.f453843f = aVar2.k(intValue);
                return 0;
            case 5:
                this.f453844g = aVar2.g(intValue);
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                this.f453845h = aVar2.k(intValue);
                return 0;
            case 8:
                this.f453846i = aVar2.g(intValue);
                return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.dc5) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        return this;
    }
}
