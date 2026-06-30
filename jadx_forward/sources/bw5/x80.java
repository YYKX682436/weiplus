package bw5;

/* loaded from: classes2.dex */
public class x80 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f116534d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f116535e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f116536f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f116537g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f116538h = new boolean[6];

    static {
        new bw5.x80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.x80)) {
            return false;
        }
        bw5.x80 x80Var = (bw5.x80) fVar;
        return n51.f.a(this.f76494x2de60e5e, x80Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f116534d), java.lang.Integer.valueOf(x80Var.f116534d)) && n51.f.a(this.f116535e, x80Var.f116535e) && n51.f.a(this.f116536f, x80Var.f116536f) && n51.f.a(this.f116537g, x80Var.f116537g);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f116538h[1] ? this.f76494x2de60e5e : new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.x80();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f116538h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f116534d);
            }
            java.lang.String str = this.f116535e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f116536f;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            java.lang.String str2 = this.f116537g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f116534d);
            }
            java.lang.String str3 = this.f116535e;
            if (str3 != null && zArr[3]) {
                i18 += b36.f.j(3, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f116536f;
            if (gVar2 != null && zArr[4]) {
                i18 += b36.f.b(4, gVar2);
            }
            java.lang.String str4 = this.f116537g;
            return (str4 == null || !zArr[5]) ? i18 : i18 + b36.f.j(5, str4);
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
            this.f116534d = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f116535e = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f116536f = aVar2.d(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f116537g = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.x80) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f116538h[1] = true;
        return this;
    }
}
